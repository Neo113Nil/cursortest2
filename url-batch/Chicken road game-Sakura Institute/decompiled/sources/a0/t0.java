package a0;

import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.g f146a;

    /* renamed from: b, reason: collision with root package name */
    public final long f147b;

    /* renamed from: c, reason: collision with root package name */
    public final a2.h0 f148c;

    /* renamed from: d, reason: collision with root package name */
    public final g2.q f149d;

    /* renamed from: e, reason: collision with root package name */
    public final f1 f150e;

    /* renamed from: f, reason: collision with root package name */
    public long f151f;

    /* renamed from: g, reason: collision with root package name */
    public final a2.g f152g;

    /* renamed from: h, reason: collision with root package name */
    public final g2.w f153h;

    /* renamed from: i, reason: collision with root package name */
    public final w.z0 f154i;

    public t0(g2.w wVar, g2.q qVar, w.z0 z0Var, f1 f1Var) {
        a2.g gVar = wVar.f4065a;
        long j8 = wVar.f4066b;
        a2.h0 h0Var = z0Var != null ? z0Var.f9471a : null;
        this.f146a = gVar;
        this.f147b = j8;
        this.f148c = h0Var;
        this.f149d = qVar;
        this.f150e = f1Var;
        this.f151f = j8;
        this.f152g = gVar;
        this.f153h = wVar;
        this.f154i = z0Var;
    }

    public final List a(q6.c cVar) {
        if (!a2.j0.b(this.f151f)) {
            return e6.m.X(new g2.a("", 0), new g2.v(a2.j0.e(this.f151f), a2.j0.e(this.f151f)));
        }
        g2.i iVar = (g2.i) cVar.f(this);
        if (iVar != null) {
            return t6.a.F(iVar);
        }
        return null;
    }

    public final Integer b() {
        a2.h0 h0Var = this.f148c;
        if (h0Var == null) {
            return null;
        }
        int d8 = a2.j0.d(this.f151f);
        g2.q qVar = this.f149d;
        return Integer.valueOf(qVar.a(h0Var.d(h0Var.e(qVar.b(d8)), true)));
    }

    public final Integer c() {
        int length;
        a2.h0 h0Var = this.f148c;
        if (h0Var == null) {
            return null;
        }
        int p6 = p();
        while (true) {
            a2.g gVar = this.f146a;
            if (p6 < gVar.f373f.length()) {
                int length2 = this.f152g.f373f.length() - 1;
                if (p6 <= length2) {
                    length2 = p6;
                }
                long k8 = h0Var.k(length2);
                int i7 = a2.j0.f407c;
                int i8 = (int) (k8 & 4294967295L);
                if (i8 > p6) {
                    length = this.f149d.a(i8);
                    break;
                }
                p6++;
            } else {
                length = gVar.f373f.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int i7;
        a2.h0 h0Var = this.f148c;
        if (h0Var == null) {
            return null;
        }
        int p6 = p();
        while (true) {
            if (p6 <= 0) {
                i7 = 0;
                break;
            }
            int length = this.f152g.f373f.length() - 1;
            if (p6 <= length) {
                length = p6;
            }
            long k8 = h0Var.k(length);
            int i8 = a2.j0.f407c;
            int i9 = (int) (k8 >> 32);
            if (i9 < p6) {
                i7 = this.f149d.a(i9);
                break;
            }
            p6--;
        }
        return Integer.valueOf(i7);
    }

    public final boolean e() {
        a2.h0 h0Var = this.f148c;
        return (h0Var != null ? h0Var.i(p()) : null) != l2.h.f5874g;
    }

    public final int f(a2.h0 h0Var, int i7) {
        int p6 = p();
        f1 f1Var = this.f150e;
        if (f1Var.f64a == null) {
            f1Var.f64a = Float.valueOf(h0Var.c(p6).f9780a);
        }
        int e9 = h0Var.e(p6);
        a2.o oVar = h0Var.f389b;
        int i8 = e9 + i7;
        if (i8 < 0) {
            return 0;
        }
        if (i8 >= oVar.f429f) {
            return this.f152g.f373f.length();
        }
        float b9 = oVar.b(i8) - 1;
        Float f9 = f1Var.f64a;
        r6.k.c(f9);
        float floatValue = f9.floatValue();
        if ((e() && floatValue >= h0Var.g(i8)) || (!e() && floatValue <= h0Var.f(i8))) {
            return h0Var.d(i8, true);
        }
        return this.f149d.a(oVar.e(u3.r.a(f9.floatValue(), b9)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r7 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(w.z0 z0Var, int i7) {
        y0.d dVar;
        p1.p pVar = z0Var.f9472b;
        a2.h0 h0Var = z0Var.f9471a;
        if (pVar != null) {
            p1.p pVar2 = z0Var.f9473c;
            dVar = pVar2 != null ? pVar2.h(pVar, true) : null;
        }
        dVar = y0.d.f9779e;
        long j8 = this.f153h.f4066b;
        int i8 = a2.j0.f407c;
        int i9 = (int) (j8 & 4294967295L);
        g2.q qVar = this.f149d;
        y0.d c4 = h0Var.c(qVar.b(i9));
        return qVar.a(h0Var.f389b.e(u3.r.a(c4.f9780a, (y0.f.b(v0.d.a(dVar.c(), dVar.b())) * i7) + c4.f9781b)));
    }

    public final void h() {
        f1 f1Var = this.f150e;
        f1Var.f64a = null;
        a2.g gVar = this.f152g;
        if (gVar.f373f.length() > 0) {
            if (e()) {
                f1Var.f64a = null;
                if (gVar.f373f.length() > 0) {
                    String str = gVar.f373f;
                    long j8 = this.f151f;
                    int i7 = a2.j0.f407c;
                    int p6 = w.g0.p(str, (int) (j8 & 4294967295L));
                    if (p6 != -1) {
                        o(p6, p6);
                        return;
                    }
                    return;
                }
                return;
            }
            f1Var.f64a = null;
            if (gVar.f373f.length() > 0) {
                String str2 = gVar.f373f;
                long j9 = this.f151f;
                int i8 = a2.j0.f407c;
                int m8 = w.g0.m(str2, (int) (j9 & 4294967295L));
                if (m8 != -1) {
                    o(m8, m8);
                }
            }
        }
    }

    public final void i() {
        this.f150e.f64a = null;
        a2.g gVar = this.f152g;
        String str = gVar.f373f;
        String str2 = gVar.f373f;
        if (str.length() > 0) {
            int n8 = w.g0.n(str2, a2.j0.d(this.f151f));
            if (n8 == a2.j0.d(this.f151f) && n8 != str2.length()) {
                n8 = w.g0.n(str2, n8 + 1);
            }
            o(n8, n8);
        }
    }

    public final void j() {
        this.f150e.f64a = null;
        a2.g gVar = this.f152g;
        String str = gVar.f373f;
        String str2 = gVar.f373f;
        if (str.length() > 0) {
            int o2 = w.g0.o(str2, a2.j0.e(this.f151f));
            if (o2 == a2.j0.e(this.f151f) && o2 != 0) {
                o2 = w.g0.o(str2, o2 - 1);
            }
            o(o2, o2);
        }
    }

    public final void k() {
        f1 f1Var = this.f150e;
        f1Var.f64a = null;
        a2.g gVar = this.f152g;
        if (gVar.f373f.length() > 0) {
            if (e()) {
                f1Var.f64a = null;
                if (gVar.f373f.length() > 0) {
                    String str = gVar.f373f;
                    long j8 = this.f151f;
                    int i7 = a2.j0.f407c;
                    int m8 = w.g0.m(str, (int) (j8 & 4294967295L));
                    if (m8 != -1) {
                        o(m8, m8);
                        return;
                    }
                    return;
                }
                return;
            }
            f1Var.f64a = null;
            if (gVar.f373f.length() > 0) {
                String str2 = gVar.f373f;
                long j9 = this.f151f;
                int i8 = a2.j0.f407c;
                int p6 = w.g0.p(str2, (int) (j9 & 4294967295L));
                if (p6 != -1) {
                    o(p6, p6);
                }
            }
        }
    }

    public final void l() {
        Integer b9;
        this.f150e.f64a = null;
        if (this.f152g.f373f.length() <= 0 || (b9 = b()) == null) {
            return;
        }
        int intValue = b9.intValue();
        o(intValue, intValue);
    }

    public final void m() {
        Integer num = null;
        this.f150e.f64a = null;
        if (this.f152g.f373f.length() > 0) {
            a2.h0 h0Var = this.f148c;
            if (h0Var != null) {
                int e9 = a2.j0.e(this.f151f);
                g2.q qVar = this.f149d;
                num = Integer.valueOf(qVar.a(h0Var.h(h0Var.e(qVar.b(e9)))));
            }
            if (num != null) {
                int intValue = num.intValue();
                o(intValue, intValue);
            }
        }
    }

    public final void n() {
        if (this.f152g.f373f.length() > 0) {
            int i7 = a2.j0.f407c;
            this.f151f = r4.a.h((int) (this.f147b >> 32), (int) (this.f151f & 4294967295L));
        }
    }

    public final void o(int i7, int i8) {
        this.f151f = r4.a.h(i7, i8);
    }

    public final int p() {
        long j8 = this.f151f;
        int i7 = a2.j0.f407c;
        return this.f149d.b((int) (j8 & 4294967295L));
    }
}
