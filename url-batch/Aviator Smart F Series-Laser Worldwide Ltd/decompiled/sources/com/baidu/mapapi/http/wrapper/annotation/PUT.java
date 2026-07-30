package com.baidu.mapapi.http.wrapper.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface PUT {
    boolean paramsNeedEncode() default true;

    String value();
}
