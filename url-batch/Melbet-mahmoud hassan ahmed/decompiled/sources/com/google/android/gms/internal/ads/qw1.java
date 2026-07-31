package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qw1 implements kv3<Set<hi1<fe>>> {

    /* renamed from: a, reason: collision with root package name */
    private final kw1 f10857a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<uw1> f10858b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f10859c;

    public qw1(kw1 kw1Var, yv3<uw1> yv3Var, yv3<Executor> yv3Var2) {
        this.f10857a = kw1Var;
        this.f10858b = yv3Var;
        this.f10859c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        uw1 a7 = this.f10858b.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        Set<hi1<fe>> f7 = kw1.f(a7, dc3Var);
        sv3.b(f7);
        return f7;
    }
}
