package a3;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
final class b2 extends ConnectivityManager.NetworkCallback {
    b2(g2 g2Var) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        synchronized (g2.class) {
            g2.f73j = true;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (g2.class) {
            g2.f73j = false;
        }
    }
}
