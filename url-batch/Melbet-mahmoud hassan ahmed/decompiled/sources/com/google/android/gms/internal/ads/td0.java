package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class td0 extends bz {

    /* renamed from: f, reason: collision with root package name */
    private final Object f12179f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private volatile gz f12180g;

    @Override // com.google.android.gms.internal.ads.cz
    public final void M5(gz gzVar) {
        synchronized (this.f12179f) {
            this.f12180g = gzVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final float b() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final float d() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final float e() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final int f() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final gz h() {
        gz gzVar;
        synchronized (this.f12179f) {
            gzVar = this.f12180g;
        }
        return gzVar;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final void j() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final void k() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final boolean l() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final void m() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final boolean n() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final boolean r() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final void x3(boolean z6) {
        throw new RemoteException();
    }
}
