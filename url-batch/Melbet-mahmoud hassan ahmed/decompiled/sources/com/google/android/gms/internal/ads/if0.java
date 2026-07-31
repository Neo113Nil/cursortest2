package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class if0 implements c3.d<c3.k, Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qe0 f6635a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jd0 f6636b;

    if0(nf0 nf0Var, qe0 qe0Var, jd0 jd0Var) {
        this.f6635a = qe0Var;
        this.f6636b = jd0Var;
    }

    @Override // c3.d
    public final void a(r2.a aVar) {
        try {
            this.f6635a.w(aVar.d());
        } catch (RemoteException e7) {
            io0.e("", e7);
        }
    }
}
