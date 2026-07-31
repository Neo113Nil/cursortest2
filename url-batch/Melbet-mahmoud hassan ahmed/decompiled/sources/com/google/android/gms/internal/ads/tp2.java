package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class tp2 implements kv3<sp2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f12313a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f12314b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<bw0> f12315c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<lc2> f12316d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<tq2> f12317e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<is2> f12318f;

    public tp2(yv3<Context> yv3Var, yv3<Executor> yv3Var2, yv3<bw0> yv3Var3, yv3<lc2> yv3Var4, yv3<tq2> yv3Var5, yv3<is2> yv3Var6) {
        this.f12313a = yv3Var;
        this.f12314b = yv3Var2;
        this.f12315c = yv3Var3;
        this.f12316d = yv3Var4;
        this.f12317e = yv3Var5;
        this.f12318f = yv3Var6;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new sp2(this.f12313a.a(), this.f12314b.a(), this.f12315c.a(), this.f12316d.a(), this.f12317e.a(), new is2());
    }
}
