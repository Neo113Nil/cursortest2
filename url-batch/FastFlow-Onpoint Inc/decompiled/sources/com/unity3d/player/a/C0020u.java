package com.unity3d.player.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.unity3d.player.a.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0020u {
    public final ConnectivityManager a;

    public void a() {
    }

    public C0020u(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.a = connectivityManager;
        if (connectivityManager == null) {
            AbstractC0019t.Log(6, "NetworkConnectivity: ConnectivityManager not found");
        }
    }

    public int b() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.a;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = this.a.getNetworkCapabilities(activeNetwork)) == null) {
            return 0;
        }
        return networkCapabilities.hasTransport(0) ? 1 : 2;
    }
}
