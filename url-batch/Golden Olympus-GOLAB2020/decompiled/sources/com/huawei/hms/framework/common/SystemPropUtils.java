package com.huawei.hms.framework.common;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class SystemPropUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14155a = "SystemPropUtils";

    public static String getProperty(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            Logger.w(f14155a, "reflect class for method has exception.");
            return str4;
        }
        try {
            Class<?> cls = Class.forName(str3);
            return (String) cls.getMethod(str, String.class, String.class).invoke(cls, str2, str4);
        } catch (Exception e4) {
            Logger.e(f14155a, "getProperty catch exception: ", e4);
            return str4;
        }
    }
}
