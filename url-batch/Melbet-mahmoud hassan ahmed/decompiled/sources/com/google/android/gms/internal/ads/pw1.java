package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pw1 implements kv3<Set<hi1<td1>>> {

    /* renamed from: a, reason: collision with root package name */
    private final kw1 f10398a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<uw1> f10399b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f10400c;

    public pw1(kw1 kw1Var, yv3<uw1> yv3Var, yv3<Executor> yv3Var2) {
        this.f10398a = kw1Var;
        this.f10399b = yv3Var;
        this.f10400c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        uw1 a7 = this.f10399b.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        Set<hi1<td1>> e7 = kw1.e(a7, dc3Var);
        sv3.b(e7);
        return e7;
    }
}
