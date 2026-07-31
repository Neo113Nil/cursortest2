package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gn1 implements kv3<hi1<jd1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<pc2> f5691a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f5692b;

    public gn1(yv3<pc2> yv3Var, yv3<Executor> yv3Var2) {
        this.f5691a = yv3Var;
        this.f5692b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        pc2 a7 = this.f5691a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
