package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fw1 implements kv3<cw1> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Executor> f5256a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<oo0> f5257b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<gx2> f5258c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<ix2> f5259d;

    public fw1(yv3<Executor> yv3Var, yv3<oo0> yv3Var2, yv3<gx2> yv3Var3, yv3<ix2> yv3Var4) {
        this.f5256a = yv3Var;
        this.f5257b = yv3Var2;
        this.f5258c = yv3Var3;
        this.f5259d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new cw1(dc3Var, this.f5257b.a(), ((hx2) this.f5258c).a(), new ix2());
    }
}
