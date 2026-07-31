package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ak2 implements kv3<yj2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ln0> f2849a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f2850b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f2851c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<Executor> f2852d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<Integer> f2853e;

    public ak2(yv3<ln0> yv3Var, yv3<Context> yv3Var2, yv3<ScheduledExecutorService> yv3Var3, yv3<Executor> yv3Var4, yv3<Integer> yv3Var5) {
        this.f2849a = yv3Var;
        this.f2850b = yv3Var2;
        this.f2851c = yv3Var3;
        this.f2852d = yv3Var4;
        this.f2853e = yv3Var5;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        ln0 ln0Var = new ln0();
        Context b7 = ((gw0) this.f2850b).b();
        ScheduledExecutorService a7 = this.f2851c.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new yj2(ln0Var, b7, a7, dc3Var, ((ll2) this.f2853e).a().intValue(), null);
    }
}
