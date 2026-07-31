package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class s41 implements kv3<nd1> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f11656a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<v3.d> f11657b;

    public s41(yv3<ScheduledExecutorService> yv3Var, yv3<v3.d> yv3Var2) {
        this.f11656a = yv3Var;
        this.f11657b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nd1 a() {
        return new nd1(this.f11656a.a(), this.f11657b.a());
    }
}
