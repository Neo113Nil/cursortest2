package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o81 implements kv3<hi1<va1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<p21> f9562a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f9563b;

    public o81(yv3<p21> yv3Var, yv3<Executor> yv3Var2) {
        this.f9562a = yv3Var;
        this.f9563b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        p21 a7 = this.f9562a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
