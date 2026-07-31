package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.yandex.mobile.ads.impl.sl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2236sl {

    /* renamed from: a, reason: collision with root package name */
    private static Method f31828a;

    public static IBinder a(Bundle bundle, String str) {
        if (u82.f32873a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f31828a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f31828a = method2;
                method2.setAccessible(true);
                method = f31828a;
            } catch (NoSuchMethodException e4) {
                ms0.a("Failed to retrieve getIBinder method", (Exception) e4);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
            ms0.a("Failed to invoke getIBinder via reflection", e5);
            return null;
        }
    }
}
