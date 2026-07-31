package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cp1 implements kv3<bp1> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<a3.u0> f3908a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<v3.d> f3909b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f3910c;

    public cp1(yv3<a3.u0> yv3Var, yv3<v3.d> yv3Var2, yv3<Executor> yv3Var3) {
        this.f3908a = yv3Var;
        this.f3909b = yv3Var2;
        this.f3910c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        a3.u0 a7 = this.f3908a.a();
        v3.d a8 = this.f3909b.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new bp1(a7, a8, dc3Var);
    }
}
