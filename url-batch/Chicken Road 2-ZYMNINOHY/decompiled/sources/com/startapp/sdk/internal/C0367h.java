package com.startapp.sdk.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.startapp.sdk.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0368i f7034a;

    public C0367h(C0368i c0368i) {
        this.f7034a = c0368i;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int a3 = f6.a(networkCapabilities);
        synchronized (this.f7034a.f7074c) {
            this.f7034a.f7074c.put(network, Integer.valueOf(a3));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (this.f7034a.f7074c) {
            this.f7034a.f7074c.remove(network);
        }
    }
}
