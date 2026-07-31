package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class lb1 implements kv3<jb1> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ib1> f7907a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Set<hi1<za1>>> f7908b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f7909c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f7910d;

    public lb1(yv3<ib1> yv3Var, yv3<Set<hi1<za1>>> yv3Var2, yv3<Executor> yv3Var3, yv3<ScheduledExecutorService> yv3Var4) {
        this.f7907a = yv3Var;
        this.f7908b = yv3Var2;
        this.f7909c = yv3Var3;
        this.f7910d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        ib1 a7 = ((kb1) this.f7907a).a();
        Set a8 = ((wv3) this.f7908b).a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new jb1(a7, a8, dc3Var, this.f7910d.a());
    }
}
