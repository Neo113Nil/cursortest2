package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class jy0 implements bo2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7274a;

    /* renamed from: b, reason: collision with root package name */
    private final pv f7275b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7276c;

    /* renamed from: d, reason: collision with root package name */
    private final b01 f7277d;

    /* renamed from: e, reason: collision with root package name */
    private final jy0 f7278e = this;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<Context> f7279f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<pv> f7280g;

    /* renamed from: h, reason: collision with root package name */
    private final yv3<lc2> f7281h;

    /* renamed from: i, reason: collision with root package name */
    private final yv3<qc2> f7282i;

    /* renamed from: j, reason: collision with root package name */
    private final yv3<wn2> f7283j;

    /* synthetic */ jy0(b01 b01Var, Context context, String str, pv pvVar, iy0 iy0Var) {
        yv3 yv3Var;
        yv3 yv3Var2;
        yv3 yv3Var3;
        this.f7277d = b01Var;
        this.f7274a = context;
        this.f7275b = pvVar;
        this.f7276c = str;
        kv3 b7 = lv3.b(context);
        this.f7279f = b7;
        kv3 b8 = lv3.b(pvVar);
        this.f7280g = b8;
        yv3Var = b01Var.f3125p;
        yv3<lc2> c7 = jv3.c(new mc2(yv3Var));
        this.f7281h = c7;
        yv3<qc2> c8 = jv3.c(sc2.b());
        this.f7282i = c8;
        yv3Var2 = b01Var.f3127q;
        yv3Var3 = b01Var.P;
        this.f7283j = jv3.c(new xn2(b7, yv3Var2, b8, yv3Var3, c7, c8, ms2.b()));
    }

    @Override // com.google.android.gms.internal.ads.bo2
    public final sb2 zza() {
        return new sb2(this.f7274a, this.f7275b, this.f7276c, this.f7283j.a(), this.f7281h.a());
    }
}
