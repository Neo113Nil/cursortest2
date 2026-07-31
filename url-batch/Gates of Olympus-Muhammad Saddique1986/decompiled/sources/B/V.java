package B;

import C0.C0031g;
import I0.C0188a;
import a.AbstractC0235a;
import a0.C0239d;
import a0.C0241f;
import e2.InterfaceC0424c;
import java.util.List;
import r0.InterfaceC0919p;
import x.p0;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final C0031g f321a;

    /* renamed from: b, reason: collision with root package name */
    public final long f322b;

    /* renamed from: c, reason: collision with root package name */
    public final C0.H f323c;

    /* renamed from: d, reason: collision with root package name */
    public final I0.t f324d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f325e;

    /* renamed from: f, reason: collision with root package name */
    public long f326f;

    /* renamed from: g, reason: collision with root package name */
    public final C0031g f327g;

    /* renamed from: h, reason: collision with root package name */
    public final I0.z f328h;

    /* renamed from: i, reason: collision with root package name */
    public final p0 f329i;

    public V(I0.z zVar, I0.t tVar, p0 p0Var, i0 i0Var) {
        C0031g c0031g = zVar.f3097a;
        C0.H h3 = p0Var != null ? p0Var.f10230a : null;
        long j3 = zVar.f3098b;
        this.f321a = c0031g;
        this.f322b = j3;
        this.f323c = h3;
        this.f324d = tVar;
        this.f325e = i0Var;
        this.f326f = j3;
        this.f327g = c0031g;
        this.f328h = zVar;
        this.f329i = p0Var;
    }

    public final List a(InterfaceC0424c interfaceC0424c) {
        if (!C0.J.b(this.f326f)) {
            return S1.m.A0(new C0188a("", 0), new I0.y(C0.J.e(this.f326f), C0.J.e(this.f326f)));
        }
        I0.i iVar = (I0.i) interfaceC0424c.n(this);
        if (iVar != null) {
            return O2.l.l0(iVar);
        }
        return null;
    }

    public final Integer b() {
        C0.H h3 = this.f323c;
        if (h3 == null) {
            return null;
        }
        int d3 = C0.J.d(this.f326f);
        I0.t tVar = this.f324d;
        return Integer.valueOf(tVar.a(h3.d(h3.e(tVar.b(d3)), true)));
    }

    public final Integer c() {
        C0.H h3 = this.f323c;
        if (h3 == null) {
            return null;
        }
        int e3 = C0.J.e(this.f326f);
        I0.t tVar = this.f324d;
        return Integer.valueOf(tVar.a(h3.h(h3.e(tVar.b(e3)))));
    }

    public final Integer d() {
        int length;
        C0.H h3 = this.f323c;
        if (h3 == null) {
            return null;
        }
        int q3 = q();
        while (true) {
            C0031g c0031g = this.f321a;
            if (q3 < c0031g.f596a.length()) {
                int length2 = this.f327g.f596a.length() - 1;
                if (q3 <= length2) {
                    length2 = q3;
                }
                long k3 = h3.k(length2);
                int i3 = C0.J.f568c;
                int i4 = (int) (k3 & 4294967295L);
                if (i4 > q3) {
                    length = this.f324d.a(i4);
                    break;
                }
                q3++;
            } else {
                length = c0031g.f596a.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i3;
        C0.H h3 = this.f323c;
        if (h3 == null) {
            return null;
        }
        int q3 = q();
        while (true) {
            if (q3 <= 0) {
                i3 = 0;
                break;
            }
            int length = this.f327g.f596a.length() - 1;
            if (q3 <= length) {
                length = q3;
            }
            long k3 = h3.k(length);
            int i4 = C0.J.f568c;
            int i5 = (int) (k3 >> 32);
            if (i5 < q3) {
                i3 = this.f324d.a(i5);
                break;
            }
            q3--;
        }
        return Integer.valueOf(i3);
    }

    public final boolean f() {
        C0.H h3 = this.f323c;
        return (h3 != null ? h3.i(q()) : null) != N0.h.f3545e;
    }

    public final int g(C0.H h3, int i3) {
        int q3 = q();
        i0 i0Var = this.f325e;
        if (i0Var.f413a == null) {
            i0Var.f413a = Float.valueOf(h3.c(q3).f4724a);
        }
        int e3 = h3.e(q3) + i3;
        if (e3 < 0) {
            return 0;
        }
        C0.o oVar = h3.f558b;
        if (e3 >= oVar.f623f) {
            return this.f327g.f596a.length();
        }
        float b3 = oVar.b(e3) - 1;
        Float f3 = i0Var.f413a;
        f2.j.c(f3);
        float floatValue = f3.floatValue();
        if ((f() && floatValue >= h3.g(e3)) || (!f() && floatValue <= h3.f(e3))) {
            return h3.d(e3, true);
        }
        return this.f324d.a(oVar.e(l0.c.e(f3.floatValue(), b3)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(p0 p0Var, int i3) {
        C0239d c0239d;
        InterfaceC0919p interfaceC0919p = p0Var.f10231b;
        if (interfaceC0919p != null) {
            InterfaceC0919p interfaceC0919p2 = p0Var.f10232c;
            c0239d = interfaceC0919p2 != null ? interfaceC0919p2.B(interfaceC0919p, true) : null;
        }
        c0239d = C0239d.f4723e;
        long j3 = this.f328h.f3098b;
        int i4 = C0.J.f568c;
        I0.t tVar = this.f324d;
        int b3 = tVar.b((int) (j3 & 4294967295L));
        C0.H h3 = p0Var.f10230a;
        C0239d c2 = h3.c(b3);
        return tVar.a(h3.f558b.e(l0.c.e(c2.f4724a, (C0241f.b(AbstractC0235a.e(c0239d.c(), c0239d.b())) * i3) + c2.f4725b)));
    }

    public final void i() {
        C0031g c0031g = this.f327g;
        i0 i0Var = this.f325e;
        i0Var.f413a = null;
        if (c0031g.f596a.length() > 0) {
            if (f()) {
                i0Var.f413a = null;
                if (c0031g.f596a.length() > 0) {
                    String str = c0031g.f596a;
                    long j3 = this.f326f;
                    int i3 = C0.J.f568c;
                    int p3 = x.N.p(str, (int) (j3 & 4294967295L));
                    if (p3 != -1) {
                        p(p3, p3);
                        return;
                    }
                    return;
                }
                return;
            }
            i0Var.f413a = null;
            if (c0031g.f596a.length() > 0) {
                String str2 = c0031g.f596a;
                long j4 = this.f326f;
                int i4 = C0.J.f568c;
                int m3 = x.N.m(str2, (int) (j4 & 4294967295L));
                if (m3 != -1) {
                    p(m3, m3);
                }
            }
        }
    }

    public final void j() {
        this.f325e.f413a = null;
        C0031g c0031g = this.f327g;
        if (c0031g.f596a.length() > 0) {
            int d3 = C0.J.d(this.f326f);
            String str = c0031g.f596a;
            int n3 = x.N.n(str, d3);
            if (n3 == C0.J.d(this.f326f) && n3 != str.length()) {
                n3 = x.N.n(str, n3 + 1);
            }
            p(n3, n3);
        }
    }

    public final void k() {
        this.f325e.f413a = null;
        C0031g c0031g = this.f327g;
        if (c0031g.f596a.length() > 0) {
            int e3 = C0.J.e(this.f326f);
            String str = c0031g.f596a;
            int o3 = x.N.o(str, e3);
            if (o3 == C0.J.e(this.f326f) && o3 != 0) {
                o3 = x.N.o(str, o3 - 1);
            }
            p(o3, o3);
        }
    }

    public final void l() {
        C0031g c0031g = this.f327g;
        i0 i0Var = this.f325e;
        i0Var.f413a = null;
        if (c0031g.f596a.length() > 0) {
            if (f()) {
                i0Var.f413a = null;
                if (c0031g.f596a.length() > 0) {
                    String str = c0031g.f596a;
                    long j3 = this.f326f;
                    int i3 = C0.J.f568c;
                    int m3 = x.N.m(str, (int) (j3 & 4294967295L));
                    if (m3 != -1) {
                        p(m3, m3);
                        return;
                    }
                    return;
                }
                return;
            }
            i0Var.f413a = null;
            if (c0031g.f596a.length() > 0) {
                String str2 = c0031g.f596a;
                long j4 = this.f326f;
                int i4 = C0.J.f568c;
                int p3 = x.N.p(str2, (int) (j4 & 4294967295L));
                if (p3 != -1) {
                    p(p3, p3);
                }
            }
        }
    }

    public final void m() {
        Integer b3;
        this.f325e.f413a = null;
        if (this.f327g.f596a.length() <= 0 || (b3 = b()) == null) {
            return;
        }
        int intValue = b3.intValue();
        p(intValue, intValue);
    }

    public final void n() {
        Integer c2;
        this.f325e.f413a = null;
        if (this.f327g.f596a.length() <= 0 || (c2 = c()) == null) {
            return;
        }
        int intValue = c2.intValue();
        p(intValue, intValue);
    }

    public final void o() {
        if (this.f327g.f596a.length() > 0) {
            int i3 = C0.J.f568c;
            this.f326f = O2.l.J((int) (this.f322b >> 32), (int) (this.f326f & 4294967295L));
        }
    }

    public final void p(int i3, int i4) {
        this.f326f = O2.l.J(i3, i4);
    }

    public final int q() {
        long j3 = this.f326f;
        int i3 = C0.J.f568c;
        return this.f324d.b((int) (j3 & 4294967295L));
    }
}
