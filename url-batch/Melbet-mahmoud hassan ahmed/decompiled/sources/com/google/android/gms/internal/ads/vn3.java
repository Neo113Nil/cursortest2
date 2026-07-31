package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vn3 {
    public static int a() {
        try {
            return Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return -1;
        }
    }

    public static boolean b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
