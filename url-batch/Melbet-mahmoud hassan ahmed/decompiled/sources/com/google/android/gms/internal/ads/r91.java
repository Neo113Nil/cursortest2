package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class r91 implements kv3<e43<rr2, a3.x>> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f11072a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<po0> f11073b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ks2> f11074c;

    public r91(yv3<Context> yv3Var, yv3<po0> yv3Var2, yv3<ks2> yv3Var3) {
        this.f11072a = yv3Var;
        this.f11073b = yv3Var2;
        this.f11074c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        final Context a7 = this.f11072a.a();
        final po0 b7 = ((rw0) this.f11073b).b();
        final ks2 b8 = ((ma1) this.f11074c).b();
        return new e43() { // from class: com.google.android.gms.internal.ads.q91
            @Override // com.google.android.gms.internal.ads.e43
            public final Object apply(Object obj) {
                Context context = a7;
                po0 po0Var = b7;
                ks2 ks2Var = b8;
                rr2 rr2Var = (rr2) obj;
                a3.x xVar = new a3.x(context);
                xVar.p(rr2Var.C);
                xVar.q(rr2Var.D.toString());
                xVar.o(po0Var.f10301f);
                xVar.n(ks2Var.f7620f);
                return xVar;
            }
        };
    }
}
