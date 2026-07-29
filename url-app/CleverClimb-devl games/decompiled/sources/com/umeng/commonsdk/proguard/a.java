package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: AliUMIDManager.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Object f8993a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static String f8994b;

    public static void a(Context context) {
        Constructor<?> constructor;
        Object newInstance;
        try {
            Class<?>[] clsArr = {Context.class};
            try {
                Class<?> cls = Class.forName("com.wireless.security.securityenv.sdk.SecurityEnvSDK");
                if (cls == null || (constructor = cls.getConstructor(clsArr)) == null || (newInstance = constructor.newInstance(context)) == null) {
                    return;
                }
                Method declaredMethod = cls.getDeclaredMethod("initSync", new Class[0]);
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(newInstance, new Object[0]);
                }
                Method declaredMethod2 = cls.getDeclaredMethod("getToken", new Class[0]);
                if (declaredMethod2 != null) {
                    declaredMethod2.setAccessible(true);
                    String str = (String) declaredMethod2.invoke(newInstance, new Object[0]);
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    synchronized (f8993a) {
                        f8994b = str;
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Exception e) {
            com.umeng.commonsdk.statistics.common.d.c("internal", "e is " + e);
        }
    }

    public static String b(Context context) {
        String str;
        synchronized (f8993a) {
            str = f8994b;
        }
        return str;
    }
}
