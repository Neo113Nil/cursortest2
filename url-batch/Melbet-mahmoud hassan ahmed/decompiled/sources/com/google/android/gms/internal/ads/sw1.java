package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class sw1 implements kv3<Set<hi1<qb1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final kw1 f11988a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<uw1> f11989b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f11990c;

    public sw1(kw1 kw1Var, yv3<uw1> yv3Var, yv3<Executor> yv3Var2) {
        this.f11988a = kw1Var;
        this.f11989b = yv3Var;
        this.f11990c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        uw1 a7 = this.f11989b.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        Set<hi1<qb1>> h7 = kw1.h(a7, dc3Var);
        sv3.b(h7);
        return h7;
    }
}
