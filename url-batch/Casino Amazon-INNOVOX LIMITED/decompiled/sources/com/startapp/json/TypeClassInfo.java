package com.startapp.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface TypeClassInfo {
    String decider() default "";

    boolean extendsClass() default false;

    Class[] inheritClasses() default {};

    String packageName() default "";
}
