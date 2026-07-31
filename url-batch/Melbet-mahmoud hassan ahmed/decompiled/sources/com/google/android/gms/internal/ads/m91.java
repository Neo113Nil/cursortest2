package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class m91 implements td1 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f8458f;

    /* renamed from: g, reason: collision with root package name */
    private final ks2 f8459g;

    /* renamed from: h, reason: collision with root package name */
    private final po0 f8460h;

    /* renamed from: i, reason: collision with root package name */
    private final a3.t1 f8461i;

    /* renamed from: j, reason: collision with root package name */
    private final cy1 f8462j;

    public m91(Context context, ks2 ks2Var, po0 po0Var, a3.t1 t1Var, cy1 cy1Var) {
        this.f8458f = context;
        this.f8459g = ks2Var;
        this.f8460h = po0Var;
        this.f8461i = t1Var;
        this.f8462j = cy1Var;
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void p0(vi0 vi0Var) {
        if (((Boolean) sw.c().b(m10.A2)).booleanValue()) {
            y2.t.b().c(this.f8458f, this.f8460h, this.f8459g.f7620f, this.f8461i.e());
        }
        this.f8462j.q();
    }

    @Override // com.google.android.gms.internal.ads.td1
    public final void q(ds2 ds2Var) {
    }
}
