package s0;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import l0.q;
import q0.C0593a;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5878a;

    static {
        String f7 = q.f("NetworkStateTracker");
        kotlin.jvm.internal.i.d(f7, "tagWithPrefix(\"NetworkStateTracker\")");
        f5878a = f7;
    }

    public static final C0593a a(ConnectivityManager connectivityManager) {
        boolean z5;
        NetworkCapabilities a7;
        kotlin.jvm.internal.i.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z6 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            a7 = v0.f.a(connectivityManager, v0.g.a(connectivityManager));
        } catch (SecurityException e4) {
            q.d().c(f5878a, "Unable to validate active network", e4);
        }
        if (a7 != null) {
            z5 = v0.f.b(a7, 16);
            return new C0593a(z6, z5, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z5 = false;
        return new C0593a(z6, z5, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
