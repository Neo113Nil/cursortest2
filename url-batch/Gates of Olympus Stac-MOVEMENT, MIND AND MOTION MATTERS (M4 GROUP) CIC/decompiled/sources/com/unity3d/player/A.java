package com.unity3d.player;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
final class A extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ NetworkConnectivityNougat a;

    A(NetworkConnectivityNougat networkConnectivityNougat) {
        this.a = networkConnectivityNougat;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        super.onAvailable(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        boolean hasTransport = networkCapabilities.hasTransport(0);
        this.a.b = hasTransport ? 1 : 2;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
        this.a.b = 0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        super.onUnavailable();
        this.a.b = 0;
    }
}
