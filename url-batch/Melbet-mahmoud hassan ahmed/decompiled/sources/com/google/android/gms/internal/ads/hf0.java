package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class hf0 implements c3.d<c3.g, Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qe0 f6217a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jd0 f6218b;

    hf0(nf0 nf0Var, qe0 qe0Var, jd0 jd0Var) {
        this.f6217a = qe0Var;
        this.f6218b = jd0Var;
    }

    @Override // c3.d
    public final void a(r2.a aVar) {
        try {
            this.f6217a.w(aVar.d());
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }
}
