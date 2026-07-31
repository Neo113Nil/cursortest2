package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yv1 implements kv3<wv1> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<cw1> f14830a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f14831b;

    public yv1(yv3<cw1> yv3Var, yv3<Executor> yv3Var2) {
        this.f14830a = yv3Var;
        this.f14831b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        cw1 a7 = this.f14830a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new wv1(a7, dc3Var);
    }
}
