package V0;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class f {
    private static String a(String str) {
        return "SecurityComp10201304: " + str;
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e(a(str), str2, th);
    }

    public static void d(String str, String str2) {
        Log.e(a(str), str2);
    }

    public static void e(String str, String str2) {
        Log.i(a(str), str2);
    }

    public static void f(String str, String str2) {
        Log.w(a(str), str2);
    }

    public static void b(String str, String str2) {
    }
}
