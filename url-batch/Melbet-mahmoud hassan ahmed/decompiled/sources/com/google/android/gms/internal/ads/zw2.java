package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zw2 implements kv3<xw2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ex2> f15279a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<mx2> f15280b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f15281c;

    public zw2(yv3<ex2> yv3Var, yv3<mx2> yv3Var2, yv3<ScheduledExecutorService> yv3Var3) {
        this.f15279a = yv3Var;
        this.f15280b = yv3Var2;
        this.f15281c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        ev3 b7 = jv3.b(this.f15279a);
        ev3 b8 = jv3.b(this.f15280b);
        Object bx2Var = ((Boolean) sw.c().b(m10.f8295r6)).booleanValue() ? new bx2((xw2) b7.a(), this.f15281c.a()) : (xw2) b8.a();
        sv3.b(bx2Var);
        return bx2Var;
    }
}
