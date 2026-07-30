package com.unity3d.player.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class v {
    public final ConnectivityManager a;
    public int b;
    public final u c;

    public v(Context context) {
        NetworkCapabilities networkCapabilities;
        int i = 0;
        this.b = 0;
        u uVar = new u(this);
        this.c = uVar;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.a = connectivityManager;
        if (connectivityManager == null) {
            t.Log(6, "NetworkConnectivity: ConnectivityManager not found");
            return;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            i = networkCapabilities.hasTransport(0) ? 1 : 2;
        }
        this.b = i;
        connectivityManager.registerDefaultNetworkCallback(uVar);
    }

    public final void a() {
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager == null) {
            return;
        }
        connectivityManager.unregisterNetworkCallback(this.c);
    }
}
