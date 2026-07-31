package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class dy1 implements kv3<cy1> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Executor> f4387a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f4388b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<WeakReference<Context>> f4389c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<Executor> f4390d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<rt1> f4391e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f4392f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<gw1> f4393g;

    /* renamed from: h, reason: collision with root package name */
    private final yv3<po0> f4394h;

    /* renamed from: i, reason: collision with root package name */
    private final yv3<th1> f4395i;

    public dy1(yv3<Executor> yv3Var, yv3<Context> yv3Var2, yv3<WeakReference<Context>> yv3Var3, yv3<Executor> yv3Var4, yv3<rt1> yv3Var5, yv3<ScheduledExecutorService> yv3Var6, yv3<gw1> yv3Var7, yv3<po0> yv3Var8, yv3<th1> yv3Var9) {
        this.f4387a = yv3Var;
        this.f4388b = yv3Var2;
        this.f4389c = yv3Var3;
        this.f4390d = yv3Var4;
        this.f4391e = yv3Var5;
        this.f4392f = yv3Var6;
        this.f4393g = yv3Var7;
        this.f4394h = yv3Var8;
        this.f4395i = yv3Var9;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Executor a7 = this.f4387a.a();
        Context b7 = ((gw0) this.f4388b).b();
        WeakReference<Context> b8 = ((hw0) this.f4389c).b();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new cy1(a7, b7, b8, dc3Var, this.f4391e.a(), this.f4392f.a(), this.f4393g.a(), ((rw0) this.f4394h).b(), ((uh1) this.f4395i).a());
    }
}
