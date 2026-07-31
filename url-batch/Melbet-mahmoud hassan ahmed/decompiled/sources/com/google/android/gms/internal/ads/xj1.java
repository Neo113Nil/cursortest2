package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xj1 implements kv3<hi1<va1>> {

    /* renamed from: a, reason: collision with root package name */
    private final nj1 f14227a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<uk1> f14228b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f14229c;

    public xj1(nj1 nj1Var, yv3<uk1> yv3Var, yv3<Executor> yv3Var2) {
        this.f14227a = nj1Var;
        this.f14228b = yv3Var;
        this.f14229c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        uk1 a7 = this.f14228b.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
