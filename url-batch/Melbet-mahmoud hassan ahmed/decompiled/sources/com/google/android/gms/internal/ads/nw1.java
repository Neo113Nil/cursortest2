package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class nw1 implements kv3<Set<hi1<rb1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final kw1 f9353a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<uw1> f9354b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f9355c;

    public nw1(kw1 kw1Var, yv3<uw1> yv3Var, yv3<Executor> yv3Var2) {
        this.f9353a = kw1Var;
        this.f9354b = yv3Var;
        this.f9355c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        uw1 a7 = this.f9354b.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        Set<hi1<rb1>> c7 = kw1.c(a7, dc3Var);
        sv3.b(c7);
        return c7;
    }
}
