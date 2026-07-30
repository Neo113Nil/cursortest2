package T0;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public abstract class i {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.h.e(connectivityManager, "<this>");
        kotlin.jvm.internal.h.e(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
