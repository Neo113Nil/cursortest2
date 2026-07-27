package z0;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import s0.s;
import x0.C1535a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12461a;

    static {
        String f3 = s.f("NetworkStateTracker");
        kotlin.jvm.internal.i.d(f3, "tagWithPrefix(\"NetworkStateTracker\")");
        f12461a = f3;
    }

    public static final C1535a a(ConnectivityManager connectivityManager) {
        boolean z;
        NetworkCapabilities a6;
        kotlin.jvm.internal.i.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z5 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            a6 = C0.i.a(connectivityManager, C0.j.a(connectivityManager));
        } catch (SecurityException e3) {
            s.d().c(f12461a, "Unable to validate active network", e3);
        }
        if (a6 != null) {
            z = C0.i.b(a6, 16);
            return new C1535a(z5, z, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z = false;
        return new C1535a(z5, z, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
