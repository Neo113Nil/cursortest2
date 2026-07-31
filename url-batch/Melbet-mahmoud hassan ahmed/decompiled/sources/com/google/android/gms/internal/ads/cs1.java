package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import r2.w;

/* loaded from: classes.dex */
public final class cs1 extends w.a {

    /* renamed from: a, reason: collision with root package name */
    private final rm1 f3932a;

    public cs1(rm1 rm1Var) {
        this.f3932a = rm1Var;
    }

    private static gz f(rm1 rm1Var) {
        cz R = rm1Var.R();
        if (R == null) {
            return null;
        }
        try {
            return R.h();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // r2.w.a
    public final void a() {
        gz f7 = f(this.f3932a);
        if (f7 == null) {
            return;
        }
        try {
            f7.b();
        } catch (RemoteException e7) {
            io0.h("Unable to call onVideoEnd()", e7);
        }
    }

    @Override // r2.w.a
    public final void c() {
        gz f7 = f(this.f3932a);
        if (f7 == null) {
            return;
        }
        try {
            f7.e();
        } catch (RemoteException e7) {
            io0.h("Unable to call onVideoEnd()", e7);
        }
    }

    @Override // r2.w.a
    public final void e() {
        gz f7 = f(this.f3932a);
        if (f7 == null) {
            return;
        }
        try {
            f7.h();
        } catch (RemoteException e7) {
            io0.h("Unable to call onVideoEnd()", e7);
        }
    }
}
