package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cm2 implements kv3<bm2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f3868a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f3869b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<bw0> f3870c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<ep2<v31, c41>> f3871d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<in2> f3872e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<is2> f3873f;

    public cm2(yv3<Context> yv3Var, yv3<Executor> yv3Var2, yv3<bw0> yv3Var3, yv3<ep2<v31, c41>> yv3Var4, yv3<in2> yv3Var5, yv3<is2> yv3Var6) {
        this.f3868a = yv3Var;
        this.f3869b = yv3Var2;
        this.f3870c = yv3Var3;
        this.f3871d = yv3Var4;
        this.f3872e = yv3Var5;
        this.f3873f = yv3Var6;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new bm2(this.f3868a.a(), this.f3869b.a(), this.f3870c.a(), ((ip2) this.f3871d).a(), this.f3872e.a(), new is2());
    }
}
