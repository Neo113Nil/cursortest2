package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class rj1 implements kv3<hi1<lc1>> {

    /* renamed from: a, reason: collision with root package name */
    private final nj1 f11167a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f11168b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<po0> f11169c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<rr2> f11170d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<ks2> f11171e;

    public rj1(nj1 nj1Var, yv3<Context> yv3Var, yv3<po0> yv3Var2, yv3<rr2> yv3Var3, yv3<ks2> yv3Var4) {
        this.f11167a = nj1Var;
        this.f11168b = yv3Var;
        this.f11169c = yv3Var2;
        this.f11170d = yv3Var3;
        this.f11171e = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        final Context a7 = this.f11168b.a();
        final po0 b7 = ((rw0) this.f11169c).b();
        final rr2 b8 = ((m71) this.f11170d).b();
        final ks2 b9 = ((ma1) this.f11171e).b();
        return new hi1(new lc1() { // from class: com.google.android.gms.internal.ads.kj1
            @Override // com.google.android.gms.internal.ads.lc1
            public final void m() {
                y2.t.t().n(a7, b7.f10301f, b8.D.toString(), b9.f7620f);
            }
        }, wo0.f13899f);
    }
}
