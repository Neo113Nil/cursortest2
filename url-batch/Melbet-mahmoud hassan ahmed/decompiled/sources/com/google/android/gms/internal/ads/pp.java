package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class pp extends t2.a {

    /* renamed from: a, reason: collision with root package name */
    private final tp f10322a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10323b;

    /* renamed from: c, reason: collision with root package name */
    private final qp f10324c = new qp();

    /* renamed from: d, reason: collision with root package name */
    r2.m f10325d;

    /* renamed from: e, reason: collision with root package name */
    private r2.r f10326e;

    public pp(tp tpVar, String str) {
        this.f10322a = tpVar;
        this.f10323b = str;
    }

    @Override // t2.a
    public final r2.v a() {
        zy zyVar;
        try {
            zyVar = this.f10322a.d();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
            zyVar = null;
        }
        return r2.v.e(zyVar);
    }

    @Override // t2.a
    public final void d(r2.m mVar) {
        this.f10325d = mVar;
        this.f10324c.s6(mVar);
    }

    @Override // t2.a
    public final void e(boolean z6) {
        try {
            this.f10322a.G5(z6);
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // t2.a
    public final void f(r2.r rVar) {
        this.f10326e = rVar;
        try {
            this.f10322a.h3(new m00(rVar));
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // t2.a
    public final void g(Activity activity) {
        try {
            this.f10322a.Z1(x3.b.B3(activity), this.f10324c);
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }
}
