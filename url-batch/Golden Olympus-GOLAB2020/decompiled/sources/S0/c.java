package S0;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class c {
    private static String a(String str) {
        return "SecurityComp10201304: " + str;
    }

    public static void c(String str, String str2) {
        Log.e(a(str), str2);
    }

    public static void d(String str, String str2) {
        Log.i(a(str), str2);
    }

    public static void b(String str, String str2) {
    }
}
