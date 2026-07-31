package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class qi2 implements kv3<oi2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<dc3> f10706a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f10707b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<String> f10708c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<Context> f10709d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<ks2> f10710e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<bw0> f10711f;

    public qi2(yv3<dc3> yv3Var, yv3<ScheduledExecutorService> yv3Var2, yv3<String> yv3Var3, yv3<Context> yv3Var4, yv3<ks2> yv3Var5, yv3<bw0> yv3Var6) {
        this.f10706a = yv3Var;
        this.f10707b = yv3Var2;
        this.f10708c = yv3Var3;
        this.f10709d = yv3Var4;
        this.f10710e = yv3Var5;
        this.f10711f = yv3Var6;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new oi2(dc3Var, this.f10707b.a(), this.f10708c.a(), this.f10709d.a(), ((ma1) this.f10710e).b(), this.f10711f.a());
    }
}
