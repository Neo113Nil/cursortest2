package a6;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import t5.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f310a = o.f("NetworkStateTracker");

    public static final y5.a a(ConnectivityManager connectivityManager) {
        boolean z10;
        NetworkCapabilities a9;
        connectivityManager.getClass();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            a9 = d6.g.a(connectivityManager, d6.h.a(connectivityManager));
        } catch (SecurityException e2) {
            o.d().c(f310a, "Unable to validate active network", e2);
        }
        if (a9 != null) {
            z10 = d6.g.b(a9, 16);
            return new y5.a(z11, z10, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z10 = false;
        return new y5.a(z11, z10, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
