package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fr2 implements kv3<er2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f5182a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f5183b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<bw0> f5184c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<ep2<ms1, hs1>> f5185d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<tq2> f5186e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<is2> f5187f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<fs2> f5188g;

    public fr2(yv3<Context> yv3Var, yv3<Executor> yv3Var2, yv3<bw0> yv3Var3, yv3<ep2<ms1, hs1>> yv3Var4, yv3<tq2> yv3Var5, yv3<is2> yv3Var6, yv3<fs2> yv3Var7) {
        this.f5182a = yv3Var;
        this.f5183b = yv3Var2;
        this.f5184c = yv3Var3;
        this.f5185d = yv3Var4;
        this.f5186e = yv3Var5;
        this.f5187f = yv3Var6;
        this.f5188g = yv3Var7;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new er2(this.f5182a.a(), this.f5183b.a(), this.f5184c.a(), ((jp2) this.f5185d).a(), this.f5186e.a(), new is2(), this.f5188g.a());
    }
}
