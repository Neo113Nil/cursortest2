package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class eu1 implements kv3<hi1<qb1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ru1> f4767a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f4768b;

    public eu1(yv3<ru1> yv3Var, yv3<Executor> yv3Var2) {
        this.f4767a = yv3Var;
        this.f4768b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        ru1 a7 = this.f4767a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
