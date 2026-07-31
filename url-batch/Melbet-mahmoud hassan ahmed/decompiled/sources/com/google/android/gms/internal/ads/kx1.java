package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class kx1 implements ww1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f7728a;

    /* renamed from: b, reason: collision with root package name */
    private final uc2 f7729b;

    kx1(long j7, Context context, dx1 dx1Var, bw0 bw0Var, String str) {
        this.f7728a = j7;
        up2 A = bw0Var.A();
        A.a(context);
        A.b(new pv());
        A.s(str);
        uc2 zza = A.g().zza();
        this.f7729b = zza;
        zza.v3(new jx1(this, dx1Var));
    }

    @Override // com.google.android.gms.internal.ads.ww1
    public final void a(kv kvVar) {
        this.f7729b.F4(kvVar);
    }

    @Override // com.google.android.gms.internal.ads.ww1
    public final void c() {
        this.f7729b.c5(x3.b.B3(null));
    }

    @Override // com.google.android.gms.internal.ads.ww1
    public final void zza() {
        this.f7729b.N();
    }
}
