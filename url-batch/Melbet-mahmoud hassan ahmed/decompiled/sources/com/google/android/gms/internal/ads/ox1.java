package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ox1 implements ww1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f9859a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9860b;

    /* renamed from: c, reason: collision with root package name */
    private final dx1 f9861c;

    /* renamed from: d, reason: collision with root package name */
    private final ir2 f9862d;

    ox1(long j7, Context context, dx1 dx1Var, bw0 bw0Var, String str) {
        this.f9859a = j7;
        this.f9860b = str;
        this.f9861c = dx1Var;
        kr2 B = bw0Var.B();
        B.a(context);
        B.b(str);
        this.f9862d = B.c().zza();
    }

    @Override // com.google.android.gms.internal.ads.ww1
    public final void a(kv kvVar) {
        try {
            this.f9862d.a3(kvVar, new mx1(this));
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.ww1
    public final void c() {
        try {
            this.f9862d.n5(new nx1(this));
            this.f9862d.m6(x3.b.B3(null));
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.ww1
    public final void zza() {
    }
}
