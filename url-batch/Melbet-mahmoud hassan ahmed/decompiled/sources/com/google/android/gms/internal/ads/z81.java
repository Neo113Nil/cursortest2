package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z81 implements kv3<hi1<mb1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<kf1> f15022a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f15023b;

    public z81(yv3<kf1> yv3Var, yv3<Executor> yv3Var2) {
        this.f15022a = yv3Var;
        this.f15023b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new hi1(this.f15022a.a(), this.f15023b.a());
    }
}
