package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class nr2 extends o03 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ rx f9253a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ or2 f9254b;

    nr2(or2 or2Var, rx rxVar) {
        this.f9254b = or2Var;
        this.f9253a = rxVar;
    }

    @Override // com.google.android.gms.internal.ads.o03
    public final void y() {
        hs1 hs1Var;
        hs1Var = this.f9254b.f9798i;
        if (hs1Var != null) {
            try {
                this.f9253a.b();
            } catch (RemoteException e7) {
                io0.i("#007 Could not call remote method.", e7);
            }
        }
    }
}
