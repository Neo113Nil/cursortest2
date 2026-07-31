package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class x62 implements kv3<w62> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<r51> f14054a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<c62> f14055b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<xa1> f14056c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f14057d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<dc3> f14058e;

    public x62(yv3<r51> yv3Var, yv3<c62> yv3Var2, yv3<xa1> yv3Var3, yv3<ScheduledExecutorService> yv3Var4, yv3<dc3> yv3Var5) {
        this.f14054a = yv3Var;
        this.f14055b = yv3Var2;
        this.f14056c = yv3Var3;
        this.f14057d = yv3Var4;
        this.f14058e = yv3Var5;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final w62 a() {
        r51 a7 = this.f14054a.a();
        c62 a8 = ((d62) this.f14055b).a();
        xa1 a9 = this.f14056c.a();
        ScheduledExecutorService a10 = this.f14057d.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new w62(a7, a8, a9, a10, dc3Var);
    }
}
