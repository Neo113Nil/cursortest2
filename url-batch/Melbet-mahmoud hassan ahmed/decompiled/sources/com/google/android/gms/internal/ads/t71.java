package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class t71 implements kv3<hi1<wc1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<hd1> f12129a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f12130b;

    public t71(yv3<hd1> yv3Var, yv3<Executor> yv3Var2) {
        this.f12129a = yv3Var;
        this.f12130b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        hd1 a7 = this.f12129a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
