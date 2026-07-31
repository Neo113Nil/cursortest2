package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ly1 implements kv3<hi1<ya1>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<iy1> f8127a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f8128b;

    public ly1(yv3<iy1> yv3Var, yv3<Executor> yv3Var2) {
        this.f8127a = yv3Var;
        this.f8128b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        iy1 a7 = this.f8127a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
