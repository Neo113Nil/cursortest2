package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class x82<AdT> implements kv3<w82<AdT>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<nw2> f14077a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<r82> f14078b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<xa1> f14079c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<zx2> f14080d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<cy2> f14081e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<y61<AdT>> f14082f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<Executor> f14083g;

    /* renamed from: h, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f14084h;

    /* renamed from: i, reason: collision with root package name */
    private final yv3<f52> f14085i;

    public x82(yv3<nw2> yv3Var, yv3<r82> yv3Var2, yv3<xa1> yv3Var3, yv3<zx2> yv3Var4, yv3<cy2> yv3Var5, yv3<y61<AdT>> yv3Var6, yv3<Executor> yv3Var7, yv3<ScheduledExecutorService> yv3Var8, yv3<f52> yv3Var9) {
        this.f14077a = yv3Var;
        this.f14078b = yv3Var2;
        this.f14079c = yv3Var3;
        this.f14080d = yv3Var4;
        this.f14081e = yv3Var5;
        this.f14082f = yv3Var6;
        this.f14083g = yv3Var7;
        this.f14084h = yv3Var8;
        this.f14085i = yv3Var9;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final w82<AdT> a() {
        nw2 a7 = this.f14077a.a();
        r82 a8 = this.f14078b.a();
        xa1 a9 = this.f14079c.a();
        zx2 a10 = this.f14080d.a();
        cy2 a11 = this.f14081e.a();
        y61<AdT> a12 = this.f14082f.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new w82<>(a7, a8, a9, a10, a11, a12, dc3Var, this.f14084h.a(), this.f14085i.a());
    }
}
