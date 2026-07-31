package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class x81 implements kv3<hi1<va1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<kf1> f14075a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f14076b;

    public x81(yv3<kf1> yv3Var, yv3<Executor> yv3Var2) {
        this.f14075a = yv3Var;
        this.f14076b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new hi1(this.f14075a.a(), this.f14076b.a());
    }
}
