package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class n41 extends sp {

    /* renamed from: f, reason: collision with root package name */
    private final m41 f8932f;

    /* renamed from: g, reason: collision with root package name */
    private final nx f8933g;

    /* renamed from: h, reason: collision with root package name */
    private final in2 f8934h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8935i = false;

    public n41(m41 m41Var, nx nxVar, in2 in2Var) {
        this.f8932f = m41Var;
        this.f8933g = nxVar;
        this.f8934h = in2Var;
    }

    @Override // com.google.android.gms.internal.ads.tp
    public final void G5(boolean z6) {
        this.f8935i = z6;
    }

    @Override // com.google.android.gms.internal.ads.tp
    public final void Z1(x3.a aVar, cq cqVar) {
        try {
            this.f8934h.z(cqVar);
            this.f8932f.j((Activity) x3.b.O0(aVar), cqVar, this.f8935i);
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.tp
    public final nx b() {
        return this.f8933g;
    }

    @Override // com.google.android.gms.internal.ads.tp
    public final zy d() {
        if (((Boolean) sw.c().b(m10.f8222i5)).booleanValue()) {
            return this.f8932f.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tp
    public final void d4(xp xpVar) {
    }

    @Override // com.google.android.gms.internal.ads.tp
    public final void h3(wy wyVar) {
        r3.o.e("setOnPaidEventListener must be called on the main UI thread.");
        in2 in2Var = this.f8934h;
        if (in2Var != null) {
            in2Var.t(wyVar);
        }
    }
}
