package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.util.Log;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class csp {
    private static Context a;
    private static Boolean b;

    public static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        permitUnsafeIntentLaunch = builder.permitUnsafeIntentLaunch();
        return permitUnsafeIntentLaunch;
    }

    public static boolean b() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static void d(Context context) {
        try {
            oy.at(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    @Deprecated
    public static String e() {
        return System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
    }

    public static synchronized boolean f(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (csp.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            isInstantApp = applicationContext.getPackageManager().isInstantApp();
            Boolean valueOf = Boolean.valueOf(isInstantApp);
            b = valueOf;
            a = applicationContext;
            return valueOf.booleanValue();
        }
    }
}
