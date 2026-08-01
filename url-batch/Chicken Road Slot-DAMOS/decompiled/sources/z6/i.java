package z6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f10884b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f10885c = false;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f10887e = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f10883a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f10886d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f10885c) {
                try {
                    PackageInfo e2 = i7.b.a(context).e(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    j.a(context);
                    if (e2 == null || j.d(e2, false) || !j.d(e2, true)) {
                        f10884b = false;
                    } else {
                        f10884b = true;
                    }
                    f10885c = true;
                } catch (PackageManager.NameNotFoundException e9) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e9);
                    f10885c = true;
                }
            }
            return f10884b || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            f10885c = true;
            throw th;
        }
    }

    public static boolean b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
