package V0;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static SharedPreferences f9474a;

    public static long a(String str, long j4, Context context) {
        return c(context).getLong(str, j4);
    }

    public static String b(String str, String str2, Context context) {
        return c(context).getString(str, str2);
    }

    public static synchronized SharedPreferences c(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (h.class) {
            try {
                if (f9474a == null) {
                    f9474a = context.createDeviceProtectedStorageContext().getSharedPreferences("aegis", 0);
                }
                sharedPreferences = f9474a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    public static void d(String str, long j4, Context context) {
        c(context).edit().putLong(str, j4).apply();
    }

    public static void e(String str, String str2, Context context) {
        c(context).edit().putString(str, str2).apply();
    }
}
