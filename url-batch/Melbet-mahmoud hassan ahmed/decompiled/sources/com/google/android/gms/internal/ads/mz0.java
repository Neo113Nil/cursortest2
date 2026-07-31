package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class mz0 implements lr2 {

    /* renamed from: a, reason: collision with root package name */
    private final b01 f8825a;

    /* renamed from: b, reason: collision with root package name */
    private final mz0 f8826b = this;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Context> f8827c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<ep2<ms1, hs1>> f8828d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<tq2> f8829e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<fs2> f8830f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<er2> f8831g;

    /* renamed from: h, reason: collision with root package name */
    private final yv3<or2> f8832h;

    /* renamed from: i, reason: collision with root package name */
    private final yv3<String> f8833i;

    /* renamed from: j, reason: collision with root package name */
    private final yv3<ir2> f8834j;

    /* synthetic */ mz0(b01 b01Var, Context context, String str, lz0 lz0Var) {
        yv3 yv3Var;
        yv3 yv3Var2;
        yv3 yv3Var3;
        yv3 yv3Var4;
        yv3 yv3Var5;
        this.f8825a = b01Var;
        kv3 b7 = lv3.b(context);
        this.f8827c = b7;
        yv3Var = b01Var.f3138v0;
        yv3Var2 = b01Var.f3140w0;
        jp2 jp2Var = new jp2(b7, yv3Var, yv3Var2);
        this.f8828d = jp2Var;
        yv3Var3 = b01Var.f3138v0;
        yv3<tq2> c7 = jv3.c(new uq2(yv3Var3));
        this.f8829e = c7;
        yv3<fs2> c8 = jv3.c(hs2.b());
        this.f8830f = c8;
        yv3Var4 = b01Var.f3127q;
        yv3Var5 = b01Var.P;
        yv3<er2> c9 = jv3.c(new fr2(b7, yv3Var4, yv3Var5, jp2Var, c7, ms2.b(), c8));
        this.f8831g = c9;
        this.f8832h = jv3.c(new pr2(c9, c7, c8));
        kv3 c10 = lv3.c(str);
        this.f8833i = c10;
        this.f8834j = jv3.c(new jr2(c10, c9, b7, c7, c8));
    }

    @Override // com.google.android.gms.internal.ads.lr2
    public final or2 a() {
        return this.f8832h.a();
    }

    @Override // com.google.android.gms.internal.ads.lr2
    public final ir2 zza() {
        return this.f8834j.a();
    }
}
