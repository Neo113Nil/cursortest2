package com.squareup.wire;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface WireEnumConstant {
    String declaredName() default "";
}
