package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xn2 implements kv3<wn2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f14268a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f14269b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<pv> f14270c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<bw0> f14271d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<lc2> f14272e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<qc2> f14273f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<is2> f14274g;

    public xn2(yv3<Context> yv3Var, yv3<Executor> yv3Var2, yv3<pv> yv3Var3, yv3<bw0> yv3Var4, yv3<lc2> yv3Var5, yv3<qc2> yv3Var6, yv3<is2> yv3Var7) {
        this.f14268a = yv3Var;
        this.f14269b = yv3Var2;
        this.f14270c = yv3Var3;
        this.f14271d = yv3Var4;
        this.f14272e = yv3Var5;
        this.f14273f = yv3Var6;
        this.f14274g = yv3Var7;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new wn2(this.f14268a.a(), this.f14269b.a(), this.f14270c.a(), this.f14271d.a(), this.f14272e.a(), this.f14273f.a(), new is2());
    }
}
