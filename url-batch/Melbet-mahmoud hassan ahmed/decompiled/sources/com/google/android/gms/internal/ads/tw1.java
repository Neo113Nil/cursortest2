package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class tw1 implements kv3<Set<hi1<ow2>>> {

    /* renamed from: a, reason: collision with root package name */
    private final kw1 f12393a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<uw1> f12394b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f12395c;

    public tw1(kw1 kw1Var, yv3<uw1> yv3Var, yv3<Executor> yv3Var2) {
        this.f12393a = kw1Var;
        this.f12394b = yv3Var;
        this.f12395c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        uw1 a7 = this.f12394b.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        Set<hi1<ow2>> i7 = kw1.i(a7, dc3Var);
        sv3.b(i7);
        return i7;
    }
}
