package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class mf0 implements c3.d<c3.q, Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ze0 f8511a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jd0 f8512b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ nf0 f8513c;

    mf0(nf0 nf0Var, ze0 ze0Var, jd0 jd0Var) {
        this.f8513c = nf0Var;
        this.f8511a = ze0Var;
        this.f8512b = jd0Var;
    }

    @Override // c3.d
    public final void a(r2.a aVar) {
        try {
            this.f8511a.w(aVar.d());
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }
}
