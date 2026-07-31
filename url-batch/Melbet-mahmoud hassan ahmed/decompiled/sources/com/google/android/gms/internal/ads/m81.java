package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m81 implements kv3<hi1<ti1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ti1> f8450a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f8451b;

    public m81(yv3<ti1> yv3Var, yv3<Executor> yv3Var2) {
        this.f8450a = yv3Var;
        this.f8451b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        ti1 a7 = this.f8450a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
