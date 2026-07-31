package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class p92 implements pk1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10128a;

    /* renamed from: b, reason: collision with root package name */
    private final et1 f10129b;

    /* renamed from: c, reason: collision with root package name */
    private final ks2 f10130c;

    /* renamed from: d, reason: collision with root package name */
    private final po0 f10131d;

    /* renamed from: e, reason: collision with root package name */
    private final rr2 f10132e;

    /* renamed from: f, reason: collision with root package name */
    private final cc3<is1> f10133f;

    /* renamed from: g, reason: collision with root package name */
    private final eu0 f10134g;

    /* renamed from: h, reason: collision with root package name */
    private final w70 f10135h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f10136i;

    p92(Context context, et1 et1Var, ks2 ks2Var, po0 po0Var, rr2 rr2Var, cc3<is1> cc3Var, eu0 eu0Var, w70 w70Var, boolean z6) {
        this.f10128a = context;
        this.f10129b = et1Var;
        this.f10130c = ks2Var;
        this.f10131d = po0Var;
        this.f10132e = rr2Var;
        this.f10133f = cc3Var;
        this.f10134g = eu0Var;
        this.f10135h = w70Var;
        this.f10136i = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0086  */
    @Override // com.google.android.gms.internal.ads.pk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z6, Context context, jb1 jb1Var) {
        eu0 eu0Var;
        is1 is1Var = (is1) rb3.q(this.f10133f);
        try {
            rr2 rr2Var = this.f10132e;
            if (this.f10134g.a1()) {
                if (((Boolean) sw.c().b(m10.B0)).booleanValue()) {
                    final eu0 a7 = this.f10129b.a(this.f10130c.f7619e, null, null);
                    k80.b(a7, is1Var.i());
                    final it1 it1Var = new it1();
                    it1Var.a(this.f10128a, (View) a7);
                    is1Var.l().i(a7, true, this.f10136i ? this.f10135h : null);
                    a7.E0().f1(new rv0() { // from class: com.google.android.gms.internal.ads.n92
                        @Override // com.google.android.gms.internal.ads.rv0
                        public final void c(boolean z7) {
                            it1 it1Var2 = it1.this;
                            eu0 eu0Var2 = a7;
                            it1Var2.b();
                            eu0Var2.J0();
                            eu0Var2.E0().l();
                        }
                    });
                    a7.E0().Y0(new sv0() { // from class: com.google.android.gms.internal.ads.o92
                        @Override // com.google.android.gms.internal.ads.sv0
                        public final void zza() {
                            eu0.this.K0();
                        }
                    });
                    wr2 wr2Var = rr2Var.f11397t;
                    a7.S(wr2Var.f13927b, wr2Var.f13926a, null);
                    eu0Var = a7;
                    eu0Var.Y(true);
                    boolean e7 = !this.f10136i ? this.f10135h.e(false) : false;
                    y2.t.q();
                    boolean m7 = a3.g2.m(this.f10128a);
                    boolean d7 = !this.f10136i ? this.f10135h.d() : false;
                    float a8 = !this.f10136i ? this.f10135h.a() : 0.0f;
                    rr2 rr2Var2 = this.f10132e;
                    y2.j jVar = new y2.j(e7, m7, d7, a8, -1, z6, rr2Var2.L, rr2Var2.M);
                    if (jb1Var != null) {
                        jb1Var.S0();
                    }
                    y2.t.k();
                    dk1 j7 = is1Var.j();
                    rr2 rr2Var3 = this.f10132e;
                    int i7 = rr2Var3.N;
                    po0 po0Var = this.f10131d;
                    String str = rr2Var3.C;
                    wr2 wr2Var2 = rr2Var3.f11397t;
                    z2.p.a(context, new AdOverlayInfoParcel((yu) null, j7, (z2.y) null, eu0Var, i7, po0Var, str, jVar, wr2Var2.f13927b, wr2Var2.f13926a, this.f10130c.f7620f, jb1Var), true);
                }
            }
            eu0Var = this.f10134g;
            eu0Var.Y(true);
            if (!this.f10136i) {
            }
            y2.t.q();
            boolean m72 = a3.g2.m(this.f10128a);
            if (!this.f10136i) {
            }
            if (!this.f10136i) {
            }
            rr2 rr2Var22 = this.f10132e;
            y2.j jVar2 = new y2.j(e7, m72, d7, a8, -1, z6, rr2Var22.L, rr2Var22.M);
            if (jb1Var != null) {
            }
            y2.t.k();
            dk1 j72 = is1Var.j();
            rr2 rr2Var32 = this.f10132e;
            int i72 = rr2Var32.N;
            po0 po0Var2 = this.f10131d;
            String str2 = rr2Var32.C;
            wr2 wr2Var22 = rr2Var32.f11397t;
            z2.p.a(context, new AdOverlayInfoParcel((yu) null, j72, (z2.y) null, eu0Var, i72, po0Var2, str2, jVar2, wr2Var22.f13927b, wr2Var22.f13926a, this.f10130c.f7620f, jb1Var), true);
        } catch (qu0 e8) {
            io0.e("", e8);
        }
    }
}
