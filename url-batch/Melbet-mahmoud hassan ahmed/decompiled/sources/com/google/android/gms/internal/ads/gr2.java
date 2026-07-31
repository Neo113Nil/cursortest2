package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class gr2 extends o03 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ty f5735a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ir2 f5736b;

    gr2(ir2 ir2Var, ty tyVar) {
        this.f5736b = ir2Var;
        this.f5735a = tyVar;
    }

    @Override // com.google.android.gms.internal.ads.o03
    public final void y() {
        hs1 hs1Var;
        hs1Var = this.f5736b.f6758k;
        if (hs1Var != null) {
            try {
                this.f5735a.b();
            } catch (RemoteException e7) {
                io0.i("#007 Could not call remote method.", e7);
            }
        }
    }
}
