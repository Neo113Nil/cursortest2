package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n51 implements kv3<hi1<zn>> {

    /* renamed from: a, reason: collision with root package name */
    private final b51 f8937a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<r61> f8938b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f8939c;

    public n51(b51 b51Var, yv3<r61> yv3Var, yv3<Executor> yv3Var2) {
        this.f8937a = b51Var;
        this.f8938b = yv3Var;
        this.f8939c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        r61 a7 = this.f8938b.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new hi1(a7, dc3Var);
    }
}
