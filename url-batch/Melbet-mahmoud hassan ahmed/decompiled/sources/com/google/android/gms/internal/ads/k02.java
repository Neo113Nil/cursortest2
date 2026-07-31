package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class k02 implements kv3<j02> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ks2> f7313a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<jz1> f7314b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<dc3> f7315c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f7316d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<r32> f7317e;

    public k02(yv3<ks2> yv3Var, yv3<jz1> yv3Var2, yv3<dc3> yv3Var3, yv3<ScheduledExecutorService> yv3Var4, yv3<r32> yv3Var5) {
        this.f7313a = yv3Var;
        this.f7314b = yv3Var2;
        this.f7315c = yv3Var3;
        this.f7316d = yv3Var4;
        this.f7317e = yv3Var5;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        ks2 b7 = ((ma1) this.f7313a).b();
        jz1 a7 = ((kz1) this.f7314b).a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new j02(b7, a7, dc3Var, this.f7316d.a(), this.f7317e.a());
    }
}
