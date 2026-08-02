package com.unity3d.player.a;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.unity3d.player.a.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021v extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C0022w a;

    public C0021v(C0022w c0022w) {
        this.a = c0022w;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        if (networkCapabilities.hasTransport(0)) {
            this.a.b = 1;
        } else {
            this.a.b = 2;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        super.onUnavailable();
        this.a.b = 0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
        this.a.b = 0;
    }
}
