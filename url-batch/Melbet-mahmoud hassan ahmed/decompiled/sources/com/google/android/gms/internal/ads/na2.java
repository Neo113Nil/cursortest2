package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class na2 implements a52<t41> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9000a;

    /* renamed from: b, reason: collision with root package name */
    private final r51 f9001b;

    /* renamed from: c, reason: collision with root package name */
    private final i20 f9002c;

    /* renamed from: d, reason: collision with root package name */
    private final dc3 f9003d;

    /* renamed from: e, reason: collision with root package name */
    private final nw2 f9004e;

    public na2(Context context, r51 r51Var, nw2 nw2Var, dc3 dc3Var, i20 i20Var) {
        this.f9000a = context;
        this.f9001b = r51Var;
        this.f9004e = nw2Var;
        this.f9003d = dc3Var;
        this.f9002c = i20Var;
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final cc3<t41> a(ds2 ds2Var, rr2 rr2Var) {
        u41 a7 = this.f9001b.a(new l71(ds2Var, rr2Var, null), new ka2(this, new View(this.f9000a), null, new t61() { // from class: com.google.android.gms.internal.ads.ia2
            @Override // com.google.android.gms.internal.ads.t61
            public final cz zza() {
                return null;
            }
        }, rr2Var.f11399v.get(0)));
        la2 k7 = a7.k();
        wr2 wr2Var = rr2Var.f11397t;
        final c20 c20Var = new c20(k7, wr2Var.f13927b, wr2Var.f13926a);
        nw2 nw2Var = this.f9004e;
        return wv2.d(new qv2() { // from class: com.google.android.gms.internal.ads.ja2
            @Override // com.google.android.gms.internal.ads.qv2
            public final void zza() {
                na2.this.c(c20Var);
            }
        }, this.f9003d, gw2.CUSTOM_RENDER_SYN, nw2Var).b(gw2.CUSTOM_RENDER_ACK).d(rb3.i(a7.h())).a();
    }

    @Override // com.google.android.gms.internal.ads.a52
    public final boolean b(ds2 ds2Var, rr2 rr2Var) {
        wr2 wr2Var;
        return (this.f9002c == null || (wr2Var = rr2Var.f11397t) == null || wr2Var.f13926a == null) ? false : true;
    }

    final /* synthetic */ void c(c20 c20Var) {
        this.f9002c.W1(c20Var);
    }
}
