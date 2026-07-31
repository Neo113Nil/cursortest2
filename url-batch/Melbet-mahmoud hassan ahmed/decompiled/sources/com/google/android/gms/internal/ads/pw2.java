package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class pw2 implements kv3<nw2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<dc3> f10401a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f10402b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<mw2> f10403c;

    public pw2(yv3<dc3> yv3Var, yv3<ScheduledExecutorService> yv3Var2, yv3<mw2> yv3Var3) {
        this.f10401a = yv3Var;
        this.f10402b = yv3Var2;
        this.f10403c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new nw2(dc3Var, this.f10402b.a(), ((qw2) this.f10403c).a());
    }
}
