package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class pk2 implements kv3<nk2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ln0> f10257a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Integer> f10258b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Context> f10259c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<tn0> f10260d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f10261e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<Executor> f10262f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<String> f10263g;

    public pk2(yv3<ln0> yv3Var, yv3<Integer> yv3Var2, yv3<Context> yv3Var3, yv3<tn0> yv3Var4, yv3<ScheduledExecutorService> yv3Var5, yv3<Executor> yv3Var6, yv3<String> yv3Var7) {
        this.f10257a = yv3Var;
        this.f10258b = yv3Var2;
        this.f10259c = yv3Var3;
        this.f10260d = yv3Var4;
        this.f10261e = yv3Var5;
        this.f10262f = yv3Var6;
        this.f10263g = yv3Var7;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        ln0 ln0Var = new ln0();
        int intValue = ((ll2) this.f10258b).a().intValue();
        Context b7 = ((gw0) this.f10259c).b();
        tn0 a7 = this.f10260d.a();
        ScheduledExecutorService a8 = this.f10261e.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new nk2(ln0Var, intValue, b7, a7, a8, dc3Var, ((kl2) this.f10263g).b(), null);
    }
}
