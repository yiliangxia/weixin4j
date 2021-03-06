package com.zone.weixin4j.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Created by Yz on 2017/3/13.
 * WxMessageHandler
 * WxMessageHandler 注解声明处理消息内容的类
 */
@Target({java.lang.annotation.ElementType.TYPE})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface WxMessageHandler {
}
