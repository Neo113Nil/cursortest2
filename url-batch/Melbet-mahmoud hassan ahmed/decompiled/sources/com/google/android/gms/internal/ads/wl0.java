package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class wl0 extends qm0 {

    /* renamed from: b, reason: collision with root package name */
    private final v3.d f13853b;

    /* renamed from: c, reason: collision with root package name */
    private final wl0 f13854c = this;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<Context> f13855d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<a3.t1> f13856e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<pm0> f13857f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<nl0> f13858g;

    /* renamed from: h, reason: collision with root package name */
    private final yv3<v3.d> f13859h;

    /* renamed from: i, reason: collision with root package name */
    private final yv3<pl0> f13860i;

    /* renamed from: j, reason: collision with root package name */
    private final yv3<rl0> f13861j;

    /* renamed from: k, reason: collision with root package name */
    private final yv3<um0> f13862k;

    /* synthetic */ wl0(Context context, v3.d dVar, a3.t1 t1Var, pm0 pm0Var, vl0 vl0Var) {
        this.f13853b = dVar;
        kv3 b7 = lv3.b(context);
        this.f13855d = b7;
        kv3 b8 = lv3.b(t1Var);
        this.f13856e = b8;
        kv3 b9 = lv3.b(pm0Var);
        this.f13857f = b9;
        this.f13858g = jv3.c(new ol0(b7, b8, b9));
        kv3 b10 = lv3.b(dVar);
        this.f13859h = b10;
        yv3<pl0> c7 = jv3.c(new ql0(b10, b8, b9));
        this.f13860i = c7;
        sl0 sl0Var = new sl0(b10, c7);
        this.f13861j = sl0Var;
        this.f13862k = jv3.c(new vm0(b7, sl0Var));
    }

    @Override // com.google.android.gms.internal.ads.qm0
    final nl0 a() {
        return this.f13858g.a();
    }

    @Override // com.google.android.gms.internal.ads.qm0
    final rl0 b() {
        return new rl0(this.f13853b, this.f13860i.a());
    }

    @Override // com.google.android.gms.internal.ads.qm0
    final um0 c() {
        return this.f13862k.a();
    }
}
