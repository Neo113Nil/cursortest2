package d6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        connectivityManager.getClass();
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i3) {
        networkCapabilities.getClass();
        return networkCapabilities.hasCapability(i3);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.getClass();
        networkCallback.getClass();
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
