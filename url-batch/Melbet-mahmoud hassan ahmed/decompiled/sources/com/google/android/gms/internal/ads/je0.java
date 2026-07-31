package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class je0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p0.a f7102f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ke0 f7103g;

    je0(ke0 ke0Var, p0.a aVar) {
        this.f7103g = ke0Var;
        this.f7102f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jd0 jd0Var;
        try {
            jd0Var = this.f7103g.f7479a;
            jd0Var.A(le0.a(this.f7102f));
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }
}
