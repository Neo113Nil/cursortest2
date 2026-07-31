package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zp1 implements kv3<yp1> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Executor> f15218a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<tp1> f15219b;

    public zp1(yv3<Executor> yv3Var, yv3<tp1> yv3Var2) {
        this.f15218a = yv3Var;
        this.f15219b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final yp1 a() {
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new yp1(dc3Var, ((up1) this.f15219b).a());
    }
}
