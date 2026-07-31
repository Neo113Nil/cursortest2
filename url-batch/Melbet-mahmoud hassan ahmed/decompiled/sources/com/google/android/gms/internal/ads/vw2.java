package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vw2 implements kv3<uw2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Executor> f13521a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<oo0> f13522b;

    public vw2(yv3<Executor> yv3Var, yv3<oo0> yv3Var2) {
        this.f13521a = yv3Var;
        this.f13522b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new uw2(dc3Var, this.f13522b.a());
    }
}
