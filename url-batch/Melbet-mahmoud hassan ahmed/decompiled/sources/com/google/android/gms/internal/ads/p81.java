package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p81 implements kv3<hi1<mb1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<p21> f10118a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f10119b;

    public p81(yv3<p21> yv3Var, yv3<Executor> yv3Var2) {
        this.f10118a = yv3Var;
        this.f10119b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        p21 a7 = this.f10118a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
