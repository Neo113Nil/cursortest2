package com.tapjoy.internal;

import android.os.Looper;

/* loaded from: classes2.dex */
public final class gx {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f8223a;

    public static void a(String str) {
        if (f8223a) {
            x.a(4, "Tapjoy", str, (Throwable) null);
        }
    }

    public static void a(String str, Object... objArr) {
        if (f8223a) {
            x.a(4, "Tapjoy", str, objArr);
        }
    }

    public static void b(String str) {
        if (f8223a) {
            x.a(6, "Tapjoy", str, (Throwable) null);
        }
    }

    public static void b(String str, Object... objArr) {
        if (f8223a) {
            x.a("Tapjoy", str, objArr);
        }
    }

    public static void a(String str, String str2, String str3) {
        if (f8223a) {
            x.a("Tapjoy", "{}: {} {}", str, str2, str3);
        }
    }

    public static boolean a(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        if (!f8223a) {
            return false;
        }
        b(str);
        return false;
    }

    public static boolean a(boolean z, String str) {
        if (!f8223a || z) {
            return z;
        }
        b(str);
        throw new IllegalStateException(str);
    }

    public static boolean c(String str) {
        return a(Looper.myLooper() == Looper.getMainLooper(), str + ": Must be called on the main/ui thread");
    }
}
