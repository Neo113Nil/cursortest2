package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zc2 {

    /* renamed from: a, reason: collision with root package name */
    private final cn1 f15073a;

    /* renamed from: b, reason: collision with root package name */
    private final lc2 f15074b;

    /* renamed from: c, reason: collision with root package name */
    private final ya1 f15075c;

    public zc2(cn1 cn1Var, xw2 xw2Var) {
        this.f15073a = cn1Var;
        final lc2 lc2Var = new lc2(xw2Var);
        this.f15074b = lc2Var;
        final ba0 g7 = cn1Var.g();
        this.f15075c = new ya1() { // from class: com.google.android.gms.internal.ads.yc2
            @Override // com.google.android.gms.internal.ads.ya1
            public final void d(cv cvVar) {
                lc2 lc2Var2 = lc2.this;
                ba0 ba0Var = g7;
                lc2Var2.d(cvVar);
                if (ba0Var != null) {
                    try {
                        ba0Var.w(cvVar);
                    } catch (RemoteException e7) {
                        io0.i("#007 Could not call remote method.", e7);
                    }
                }
                if (ba0Var != null) {
                    try {
                        ba0Var.D(cvVar.f3954f);
                    } catch (RemoteException e8) {
                        io0.i("#007 Could not call remote method.", e8);
                    }
                }
            }
        };
    }

    public final ya1 a() {
        return this.f15075c;
    }

    public final lc1 b() {
        return this.f15074b;
    }

    public final yk1 c() {
        return new yk1(this.f15073a, this.f15074b.a());
    }

    public final lc2 d() {
        return this.f15074b;
    }

    public final void e(zw zwVar) {
        this.f15074b.f(zwVar);
    }
}
