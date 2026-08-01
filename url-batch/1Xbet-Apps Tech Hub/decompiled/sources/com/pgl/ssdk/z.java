package com.pgl.ssdk;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.reflect.Method;

/* compiled from: DeviceUnits.java */
/* loaded from: classes3.dex */
public class z {
    private static double a = -1.0d;

    public static String a(Context context) {
        double d = a;
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return Integer.toString((int) d);
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod("getAveragePower", String.class);
            declaredMethod.setAccessible(true);
            d2 = ((Double) declaredMethod.invoke(newInstance, "battery.capacity")).doubleValue();
        } catch (Throwable unused) {
        }
        a = d2;
        return Integer.toString((int) d2);
    }
}
