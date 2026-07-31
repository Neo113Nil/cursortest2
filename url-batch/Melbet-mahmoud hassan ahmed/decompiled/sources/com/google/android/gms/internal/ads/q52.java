package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class q52 implements pk1 {

    /* renamed from: a, reason: collision with root package name */
    private final po0 f10582a;

    /* renamed from: b, reason: collision with root package name */
    private final cc3<e41> f10583b;

    /* renamed from: c, reason: collision with root package name */
    private final rr2 f10584c;

    /* renamed from: d, reason: collision with root package name */
    private final eu0 f10585d;

    /* renamed from: e, reason: collision with root package name */
    private final ks2 f10586e;

    /* renamed from: f, reason: collision with root package name */
    private final w70 f10587f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f10588g;

    q52(po0 po0Var, cc3<e41> cc3Var, rr2 rr2Var, eu0 eu0Var, ks2 ks2Var, boolean z6, w70 w70Var) {
        this.f10582a = po0Var;
        this.f10583b = cc3Var;
        this.f10584c = rr2Var;
        this.f10585d = eu0Var;
        this.f10586e = ks2Var;
        this.f10588g = z6;
        this.f10587f = w70Var;
    }

    @Override // com.google.android.gms.internal.ads.pk1
    public final void a(boolean z6, Context context, jb1 jb1Var) {
        int i7;
        e41 e41Var = (e41) rb3.q(this.f10583b);
        this.f10585d.Y(true);
        y2.j jVar = new y2.j(this.f10588g ? this.f10587f.e(true) : true, true, this.f10588g ? this.f10587f.d() : false, this.f10588g ? this.f10587f.a() : 0.0f, -1, z6, this.f10584c.L, false);
        if (jb1Var != null) {
            jb1Var.S0();
        }
        y2.t.k();
        dk1 i8 = e41Var.i();
        eu0 eu0Var = this.f10585d;
        int i9 = this.f10584c.N;
        if (i9 == -1) {
            vv vvVar = this.f10586e.f7624j;
            if (vvVar != null) {
                int i10 = vvVar.f13509f;
                if (i10 == 1) {
                    i7 = 7;
                } else if (i10 == 2) {
                    i7 = 6;
                }
                po0 po0Var = this.f10582a;
                rr2 rr2Var = this.f10584c;
                String str = rr2Var.C;
                wr2 wr2Var = rr2Var.f11397t;
                z2.p.a(context, new AdOverlayInfoParcel((yu) null, i8, (z2.y) null, eu0Var, i7, po0Var, str, jVar, wr2Var.f13927b, wr2Var.f13926a, this.f10586e.f7620f, jb1Var), true);
            }
            io0.b("Error setting app open orientation; no targeting orientation available.");
            i9 = this.f10584c.N;
        }
        i7 = i9;
        po0 po0Var2 = this.f10582a;
        rr2 rr2Var2 = this.f10584c;
        String str2 = rr2Var2.C;
        wr2 wr2Var2 = rr2Var2.f11397t;
        z2.p.a(context, new AdOverlayInfoParcel((yu) null, i8, (z2.y) null, eu0Var, i7, po0Var2, str2, jVar, wr2Var2.f13927b, wr2Var2.f13926a, this.f10586e.f7620f, jb1Var), true);
    }
}
