package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class ie0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ p0.a f6625f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ke0 f6626g;

    ie0(ke0 ke0Var, p0.a aVar) {
        this.f6626g = ke0Var;
        this.f6625f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jd0 jd0Var;
        try {
            jd0Var = this.f6626g.f7479a;
            jd0Var.A(le0.a(this.f6625f));
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }
}
