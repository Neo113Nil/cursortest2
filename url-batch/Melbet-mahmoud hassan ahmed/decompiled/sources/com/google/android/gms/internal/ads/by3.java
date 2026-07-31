package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

@Deprecated
/* loaded from: classes.dex */
public final class by3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3630a;

    /* renamed from: b, reason: collision with root package name */
    private final xv1 f3631b;

    /* renamed from: c, reason: collision with root package name */
    private q84 f3632c;

    /* renamed from: d, reason: collision with root package name */
    private final e64 f3633d;

    /* renamed from: e, reason: collision with root package name */
    private dx3 f3634e;

    /* renamed from: f, reason: collision with root package name */
    private final a94 f3635f;

    /* renamed from: g, reason: collision with root package name */
    private final q04 f3636g;

    /* renamed from: h, reason: collision with root package name */
    private final Looper f3637h;

    /* renamed from: i, reason: collision with root package name */
    private final ef3 f3638i;

    /* renamed from: j, reason: collision with root package name */
    private final ay3 f3639j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3640k;

    /* renamed from: l, reason: collision with root package name */
    private final pt0 f3641l;

    /* renamed from: m, reason: collision with root package name */
    private final gg3 f3642m;

    @Deprecated
    public by3(Context context, pt0 pt0Var, byte[] bArr) {
        kc4 kc4Var = new kc4();
        k84 k84Var = new k84(context);
        g54 g54Var = new g54(context, kc4Var);
        hh3 hh3Var = new hh3();
        j94 d7 = j94.d(context);
        xv1 xv1Var = xv1.f14362a;
        q04 q04Var = new q04(xv1Var);
        this.f3630a = context;
        this.f3641l = pt0Var;
        this.f3632c = k84Var;
        this.f3633d = g54Var;
        this.f3634e = hh3Var;
        this.f3635f = d7;
        this.f3636g = q04Var;
        this.f3637h = n13.a();
        this.f3638i = ef3.f4595c;
        this.f3639j = ay3.f3032g;
        this.f3642m = new gg3(0.97f, 1.03f, 1000L, 1.0E-7f, nz3.c(20L), nz3.c(500L), 0.999f, null);
        this.f3631b = xv1Var;
    }

    @Deprecated
    public final by3 g(dx3 dx3Var) {
        wu1.f(!this.f3640k);
        this.f3634e = dx3Var;
        return this;
    }

    @Deprecated
    public final by3 h(q84 q84Var) {
        wu1.f(!this.f3640k);
        this.f3632c = q84Var;
        return this;
    }

    @Deprecated
    public final gy3 i() {
        wu1.f(!this.f3640k);
        this.f3640k = true;
        return new gy3(this);
    }
}
