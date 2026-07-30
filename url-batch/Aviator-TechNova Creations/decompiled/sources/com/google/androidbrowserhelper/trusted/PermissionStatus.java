package com.google.androidbrowserhelper.trusted;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes4.dex */
public @interface PermissionStatus {
    public static final int ALLOW = 0;
    public static final int ASK = 2;
    public static final int BLOCK = 1;
}
