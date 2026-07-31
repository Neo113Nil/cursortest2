package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qm1 extends bz {

    /* renamed from: f, reason: collision with root package name */
    private final Object f10754f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final cz f10755g;

    /* renamed from: h, reason: collision with root package name */
    private final sd0 f10756h;

    public qm1(cz czVar, sd0 sd0Var) {
        this.f10755g = czVar;
        this.f10756h = sd0Var;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final void M5(gz gzVar) {
        synchronized (this.f10754f) {
            cz czVar = this.f10755g;
            if (czVar != null) {
                czVar.M5(gzVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final float b() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final float d() {
        sd0 sd0Var = this.f10756h;
        if (sd0Var != null) {
            return sd0Var.e();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final float e() {
        sd0 sd0Var = this.f10756h;
        if (sd0Var != null) {
            return sd0Var.f();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final int f() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final gz h() {
        synchronized (this.f10754f) {
            cz czVar = this.f10755g;
            if (czVar == null) {
                return null;
            }
            return czVar.h();
        }
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
