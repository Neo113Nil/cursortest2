package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class yy0 implements ix1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14847a;

    /* renamed from: b, reason: collision with root package name */
    private final n80 f14848b;

    /* renamed from: c, reason: collision with root package name */
    private final b01 f14849c;

    /* renamed from: d, reason: collision with root package name */
    private final yy0 f14850d = this;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<ix1> f14851e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<n80> f14852f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<dx1> f14853g;

    /* renamed from: h, reason: collision with root package name */
    private final yv3<fx1> f14854h;

    /* synthetic */ yy0(b01 b01Var, Context context, n80 n80Var, xy0 xy0Var) {
        this.f14849c = b01Var;
        this.f14847a = context;
        this.f14848b = n80Var;
        kv3 b7 = lv3.b(this);
        this.f14851e = b7;
        kv3 b8 = lv3.b(n80Var);
        this.f14852f = b8;
        ex1 ex1Var = new ex1(b8);
        this.f14853g = ex1Var;
        this.f14854h = jv3.c(new gx1(b7, ex1Var));
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final xw1 a() {
        return new sy0(this.f14849c, this.f14850d, null);
    }

    @Override // com.google.android.gms.internal.ads.ix1
    public final fx1 g() {
        return this.f14854h.a();
    }
}
