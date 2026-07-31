package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h32 implements kv3<hi1<lc1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<p32> f6061a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f6062b;

    public h32(yv3<p32> yv3Var, yv3<Executor> yv3Var2) {
        this.f6061a = yv3Var;
        this.f6062b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        p32 a7 = this.f6061a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
