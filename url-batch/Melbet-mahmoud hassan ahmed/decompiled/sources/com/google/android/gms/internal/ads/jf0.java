package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class jf0 implements c3.d<c3.l, Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ te0 f7111a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jd0 f7112b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ nf0 f7113c;

    jf0(nf0 nf0Var, te0 te0Var, jd0 jd0Var) {
        this.f7113c = nf0Var;
        this.f7111a = te0Var;
        this.f7112b = jd0Var;
    }

    @Override // c3.d
    public final void a(r2.a aVar) {
        try {
            this.f7111a.w(aVar.d());
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }
}
