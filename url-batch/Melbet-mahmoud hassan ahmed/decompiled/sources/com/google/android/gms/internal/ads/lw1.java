package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class lw1 implements kv3<Set<hi1<va1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final kw1 f8115a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<uw1> f8116b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f8117c;

    public lw1(kw1 kw1Var, yv3<uw1> yv3Var, yv3<Executor> yv3Var2) {
        this.f8115a = kw1Var;
        this.f8116b = yv3Var;
        this.f8117c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        uw1 a7 = this.f8116b.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        Set<hi1<va1>> a8 = kw1.a(a7, dc3Var);
        sv3.b(a8);
        return a8;
    }
}
