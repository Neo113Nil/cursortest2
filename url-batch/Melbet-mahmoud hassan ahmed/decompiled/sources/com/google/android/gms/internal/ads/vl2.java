package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class vl2 implements kv3<tl2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<tn0> f13435a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Boolean> f13436b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<jn0> f13437c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<dc3> f13438d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<String> f13439e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f13440f;

    public vl2(yv3<tn0> yv3Var, yv3<Boolean> yv3Var2, yv3<jn0> yv3Var3, yv3<dc3> yv3Var4, yv3<String> yv3Var5, yv3<ScheduledExecutorService> yv3Var6) {
        this.f13435a = yv3Var;
        this.f13436b = yv3Var2;
        this.f13437c = yv3Var3;
        this.f13438d = yv3Var4;
        this.f13439e = yv3Var5;
        this.f13440f = yv3Var6;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        tn0 a7 = this.f13435a.a();
        boolean booleanValue = ((ml2) this.f13436b).a().booleanValue();
        jn0 jn0Var = new jn0();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new tl2(a7, booleanValue, jn0Var, dc3Var, ((kl2) this.f13439e).b(), this.f13440f.a(), null);
    }
}
