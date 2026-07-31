package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import r2.w;

/* loaded from: classes.dex */
public final class zo1 implements kv3<hi1<w.a>> {

    /* renamed from: a, reason: collision with root package name */
    private final so1 f15209a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<cs1> f15210b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f15211c;

    public zo1(so1 so1Var, yv3<cs1> yv3Var, yv3<Executor> yv3Var2) {
        this.f15209a = so1Var;
        this.f15210b = yv3Var;
        this.f15211c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new hi1(((ds1) this.f15210b).a(), this.f15211c.a());
    }
}
