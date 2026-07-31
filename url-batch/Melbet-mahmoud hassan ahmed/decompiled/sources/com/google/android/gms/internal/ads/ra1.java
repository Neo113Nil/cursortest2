package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ra1 implements kv3<ml0> {

    /* renamed from: a, reason: collision with root package name */
    private final qa1 f11085a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f11086b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<po0> f11087c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<rr2> f11088d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<il0> f11089e;

    public ra1(qa1 qa1Var, yv3<Context> yv3Var, yv3<po0> yv3Var2, yv3<rr2> yv3Var3, yv3<il0> yv3Var4) {
        this.f11085a = qa1Var;
        this.f11086b = yv3Var;
        this.f11087c = yv3Var2;
        this.f11088d = yv3Var3;
        this.f11089e = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* synthetic */ Object a() {
        Context a7 = this.f11086b.a();
        po0 b7 = ((rw0) this.f11087c).b();
        rr2 b8 = ((m71) this.f11088d).b();
        il0 il0Var = new il0();
        jl0 jl0Var = b8.B;
        if (jl0Var != null) {
            return new fl0(a7, b7, jl0Var, b8.f11397t.f13927b, il0Var, null);
        }
        return null;
    }
}
