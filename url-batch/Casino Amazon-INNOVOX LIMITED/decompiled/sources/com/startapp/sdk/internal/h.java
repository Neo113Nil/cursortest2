package com.startapp.sdk.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f254a;

    public h(i iVar) {
        this.f254a = iVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int a2 = w5.a(networkCapabilities);
        synchronized (this.f254a.c) {
            this.f254a.c.put(network, Integer.valueOf(a2));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (this.f254a.c) {
            this.f254a.c.remove(network);
        }
    }
}
