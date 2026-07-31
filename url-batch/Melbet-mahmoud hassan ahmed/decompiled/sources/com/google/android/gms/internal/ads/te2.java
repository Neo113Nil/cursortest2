package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class te2 implements kv3<se2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Executor> f12187a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<tn0> f12188b;

    public te2(yv3<Executor> yv3Var, yv3<tn0> yv3Var2) {
        this.f12187a = yv3Var;
        this.f12188b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new se2(dc3Var, this.f12188b.a());
    }
}
