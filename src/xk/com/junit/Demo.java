package xk.com.junit;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xk.com.model.User;

public class Demo {
	@Test
	public void testDemo() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) ac.getBean("user");
		System.out.println(user.getName()+"今年"+user.getAge()+"岁,"
				+"有一台"+user.getComputer().getLogo()+"笔记本");
	}
}
