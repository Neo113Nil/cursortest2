package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class kf0 implements c3.d<c3.v, Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ we0 f7502a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jd0 f7503b;

    kf0(nf0 nf0Var, we0 we0Var, jd0 jd0Var) {
        this.f7502a = we0Var;
        this.f7503b = jd0Var;
    }

    @Override // c3.d
    public final void a(r2.a aVar) {
        try {
            this.f7502a.w(aVar.d());
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }
}
