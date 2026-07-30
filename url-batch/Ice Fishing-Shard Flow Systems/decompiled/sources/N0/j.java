package N0;

import G0.s;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1794a;

    static {
        String f7 = s.f("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(f7, "tagWithPrefix(\"NetworkStateTracker\")");
        f1794a = f7;
    }

    public static final L0.a a(ConnectivityManager connectivityManager) {
        boolean z7;
        NetworkCapabilities a7;
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z8 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            a7 = Q0.h.a(connectivityManager, Q0.i.a(connectivityManager));
        } catch (SecurityException e7) {
            s.d().c(f1794a, "Unable to validate active network", e7);
        }
        if (a7 != null) {
            z7 = Q0.h.b(a7, 16);
            return new L0.a(z8, z7, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z7 = false;
        return new L0.a(z8, z7, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
