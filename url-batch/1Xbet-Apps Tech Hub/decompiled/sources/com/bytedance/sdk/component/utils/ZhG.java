package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* compiled from: TTReflectUtils.java */
/* loaded from: classes.dex */
public class ZhG {
    public static Method pvs(String str, String str2, Class<?>... clsArr) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            Class<?> pvs = pvs(str);
            if (pvs != null) {
                return pvs.getMethod(str2, clsArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> pvs(String str) {
        try {
            try {
                try {
                    return Class.forName(str, true, pvs());
                } catch (ClassNotFoundException unused) {
                    return Class.forName(str);
                }
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return Class.forName(str, true, ZhG.class.getClassLoader());
        }
    }

    private static ClassLoader pvs() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader == null ? ZhG.class.getClassLoader() : contextClassLoader;
    }
}
