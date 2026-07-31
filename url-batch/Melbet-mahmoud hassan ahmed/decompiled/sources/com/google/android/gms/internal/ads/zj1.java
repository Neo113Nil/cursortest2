package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zj1 implements kv3<hi1<qf1>> {

    /* renamed from: a, reason: collision with root package name */
    private final nj1 f15162a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f15163b;

    public zj1(nj1 nj1Var, yv3<Executor> yv3Var) {
        this.f15162a = nj1Var;
        this.f15163b = yv3Var;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return this.f15162a.d(this.f15163b.a());
    }
}
