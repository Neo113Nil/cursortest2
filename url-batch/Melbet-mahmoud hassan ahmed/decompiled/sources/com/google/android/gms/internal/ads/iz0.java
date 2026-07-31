package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class iz0 implements vp2 {

    /* renamed from: a, reason: collision with root package name */
    private final b01 f6858a;

    /* renamed from: b, reason: collision with root package name */
    private final iz0 f6859b = this;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Context> f6860c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<pv> f6861d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<String> f6862e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<lc2> f6863f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<tq2> f6864g;

    /* renamed from: h, reason: collision with root package name */
    private final yv3<sp2> f6865h;

    /* renamed from: i, reason: collision with root package name */
    private final yv3<uc2> f6866i;

    /* synthetic */ iz0(b01 b01Var, Context context, String str, pv pvVar, hz0 hz0Var) {
        yv3 yv3Var;
        yv3 yv3Var2;
        yv3 yv3Var3;
        yv3 yv3Var4;
        this.f6858a = b01Var;
        kv3 b7 = lv3.b(context);
        this.f6860c = b7;
        kv3 b8 = lv3.b(pvVar);
        this.f6861d = b8;
        kv3 b9 = lv3.b(str);
        this.f6862e = b9;
        yv3Var = b01Var.f3125p;
        yv3<lc2> c7 = jv3.c(new mc2(yv3Var));
        this.f6863f = c7;
        yv3Var2 = b01Var.f3138v0;
        yv3<tq2> c8 = jv3.c(new uq2(yv3Var2));
        this.f6864g = c8;
        yv3Var3 = b01Var.f3127q;
        yv3Var4 = b01Var.P;
        yv3<sp2> c9 = jv3.c(new tp2(b7, yv3Var3, yv3Var4, c7, c8, ms2.b()));
        this.f6865h = c9;
        this.f6866i = jv3.c(new vc2(b7, b8, b9, c9, c7, c8));
    }

    @Override // com.google.android.gms.internal.ads.vp2
    public final uc2 zza() {
        return this.f6866i.a();
    }
}
