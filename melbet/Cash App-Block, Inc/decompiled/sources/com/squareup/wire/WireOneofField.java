package com.squareup.wire;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface WireOneofField {
    String adapter();

    String declaredName() default "";

    String jsonName() default "";

    boolean redacted() default false;

    int tag();
}
