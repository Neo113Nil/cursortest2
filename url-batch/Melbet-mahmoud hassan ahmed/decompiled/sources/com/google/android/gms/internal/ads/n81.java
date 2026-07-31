package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n81 implements kv3<hi1<yu>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<p21> f8975a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f8976b;

    public n81(yv3<p21> yv3Var, yv3<Executor> yv3Var2) {
        this.f8975a = yv3Var;
        this.f8976b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        p21 a7 = this.f8975a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
