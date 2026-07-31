package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ow1 implements kv3<Set<hi1<lc1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final kw1 f9850a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<uw1> f9851b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f9852c;

    public ow1(kw1 kw1Var, yv3<uw1> yv3Var, yv3<Executor> yv3Var2) {
        this.f9850a = kw1Var;
        this.f9851b = yv3Var;
        this.f9852c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        uw1 a7 = this.f9851b.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        Set<hi1<lc1>> d7 = kw1.d(a7, dc3Var);
        sv3.b(d7);
        return d7;
    }
}
