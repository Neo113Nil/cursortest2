package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class q21 implements kv3<p21> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f10546a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f10547b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f10548c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f10549d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<ds2> f10550e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<rr2> f10551f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<zx2> f10552g;

    /* renamed from: h, reason: collision with root package name */
    private final yv3<ts2> f10553h;

    /* renamed from: i, reason: collision with root package name */
    private final yv3<View> f10554i;

    /* renamed from: j, reason: collision with root package name */
    private final yv3<gb> f10555j;

    /* renamed from: k, reason: collision with root package name */
    private final yv3<m20> f10556k;

    /* renamed from: l, reason: collision with root package name */
    private final yv3<o20> f10557l;

    public q21(yv3<Context> yv3Var, yv3<Executor> yv3Var2, yv3<Executor> yv3Var3, yv3<ScheduledExecutorService> yv3Var4, yv3<ds2> yv3Var5, yv3<rr2> yv3Var6, yv3<zx2> yv3Var7, yv3<ts2> yv3Var8, yv3<View> yv3Var9, yv3<gb> yv3Var10, yv3<m20> yv3Var11, yv3<o20> yv3Var12) {
        this.f10546a = yv3Var;
        this.f10547b = yv3Var2;
        this.f10548c = yv3Var3;
        this.f10549d = yv3Var4;
        this.f10550e = yv3Var5;
        this.f10551f = yv3Var6;
        this.f10552g = yv3Var7;
        this.f10553h = yv3Var8;
        this.f10554i = yv3Var9;
        this.f10555j = yv3Var10;
        this.f10556k = yv3Var11;
        this.f10557l = yv3Var12;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* synthetic */ Object a() {
        Context b7 = ((nt2) this.f10546a).b();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new p21(b7, dc3Var, this.f10548c.a(), this.f10549d.a(), ((p71) this.f10550e).b(), ((m71) this.f10551f).b(), this.f10552g.a(), this.f10553h.a(), this.f10554i.a(), this.f10555j.a(), this.f10556k.a(), new o20(), null);
    }
}
