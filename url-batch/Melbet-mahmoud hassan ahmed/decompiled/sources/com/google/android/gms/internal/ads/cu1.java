package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cu1 implements kv3<hi1<yu>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ru1> f3948a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f3949b;

    public cu1(yv3<ru1> yv3Var, yv3<Executor> yv3Var2) {
        this.f3948a = yv3Var;
        this.f3949b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        ru1 a7 = this.f3948a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
