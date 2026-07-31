package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class e72 implements pk1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4511a;

    /* renamed from: b, reason: collision with root package name */
    private final po0 f4512b;

    /* renamed from: c, reason: collision with root package name */
    private final cc3<jj1> f4513c;

    /* renamed from: d, reason: collision with root package name */
    private final rr2 f4514d;

    /* renamed from: e, reason: collision with root package name */
    private final eu0 f4515e;

    /* renamed from: f, reason: collision with root package name */
    private final ks2 f4516f;

    /* renamed from: g, reason: collision with root package name */
    private final w70 f4517g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f4518h;

    e72(Context context, po0 po0Var, cc3<jj1> cc3Var, rr2 rr2Var, eu0 eu0Var, ks2 ks2Var, boolean z6, w70 w70Var) {
        this.f4511a = context;
        this.f4512b = po0Var;
        this.f4513c = cc3Var;
        this.f4514d = rr2Var;
        this.f4515e = eu0Var;
        this.f4516f = ks2Var;
        this.f4517g = w70Var;
        this.f4518h = z6;
    }

    @Override // com.google.android.gms.internal.ads.pk1
    public final void a(boolean z6, Context context, jb1 jb1Var) {
        jj1 jj1Var = (jj1) rb3.q(this.f4513c);
        this.f4515e.Y(true);
        boolean e7 = this.f4518h ? this.f4517g.e(false) : false;
        y2.t.q();
        y2.j jVar = new y2.j(e7, a3.g2.m(this.f4511a), this.f4518h ? this.f4517g.d() : false, this.f4518h ? this.f4517g.a() : 0.0f, -1, z6, this.f4514d.L, false);
        if (jb1Var != null) {
            jb1Var.S0();
        }
        y2.t.k();
        dk1 j7 = jj1Var.j();
        eu0 eu0Var = this.f4515e;
        rr2 rr2Var = this.f4514d;
        int i7 = rr2Var.N;
        po0 po0Var = this.f4512b;
        String str = rr2Var.C;
        wr2 wr2Var = rr2Var.f11397t;
        z2.p.a(context, new AdOverlayInfoParcel((yu) null, j7, (z2.y) null, eu0Var, i7, po0Var, str, jVar, wr2Var.f13927b, wr2Var.f13926a, this.f4516f.f7620f, jb1Var), true);
    }
}
