package w3;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import v3.l;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Context f23014a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f23015b;

    public static synchronized boolean a(@RecentlyNonNull Context context) {
        Boolean bool;
        Boolean bool2;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f23014a;
            if (context2 != null && (bool2 = f23015b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            f23015b = null;
            if (!l.j()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f23015b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                f23014a = applicationContext;
                return f23015b.booleanValue();
            }
            bool = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            f23015b = bool;
            f23014a = applicationContext;
            return f23015b.booleanValue();
        }
    }
}
