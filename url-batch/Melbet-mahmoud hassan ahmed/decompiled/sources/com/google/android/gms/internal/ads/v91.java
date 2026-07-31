package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class v91 implements kv3<u91> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ob1> f13164a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<rr2> f13165b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f13166c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<Executor> f13167d;

    public v91(yv3<ob1> yv3Var, yv3<rr2> yv3Var2, yv3<ScheduledExecutorService> yv3Var3, yv3<Executor> yv3Var4) {
        this.f13164a = yv3Var;
        this.f13165b = yv3Var2;
        this.f13166c = yv3Var3;
        this.f13167d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        ob1 a7 = this.f13164a.a();
        rr2 b7 = ((m71) this.f13165b).b();
        ScheduledExecutorService a8 = this.f13166c.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new u91(a7, b7, a8, dc3Var);
    }
}
