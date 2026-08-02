package com.startapp.sdk.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.startapp.sdk.internal.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0290i f3910a;

    public C0289h(C0290i c0290i) {
        this.f3910a = c0290i;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int a3 = f6.a(networkCapabilities);
        synchronized (this.f3910a.f3949c) {
            this.f3910a.f3949c.put(network, Integer.valueOf(a3));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (this.f3910a.f3949c) {
            this.f3910a.f3949c.remove(network);
        }
    }
}
