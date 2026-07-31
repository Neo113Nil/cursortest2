package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gu1 implements kv3<hi1<lc1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ru1> f5770a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f5771b;

    public gu1(yv3<ru1> yv3Var, yv3<Executor> yv3Var2) {
        this.f5770a = yv3Var;
        this.f5771b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        ru1 a7 = this.f5770a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
