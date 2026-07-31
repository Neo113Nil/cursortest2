package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hu1 implements kv3<hi1<td1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ru1> f6422a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f6423b;

    public hu1(yv3<ru1> yv3Var, yv3<Executor> yv3Var2) {
        this.f6422a = yv3Var;
        this.f6423b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        ru1 a7 = this.f6422a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
