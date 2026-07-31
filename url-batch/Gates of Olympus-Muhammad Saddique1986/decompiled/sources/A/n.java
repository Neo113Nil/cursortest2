package A;

import A0.s;
import A0.u;
import A0.v;
import C0.C0026b;
import C0.C0031g;
import C0.D;
import C0.K;
import C0.t;
import D0.G;
import U.p;
import a.AbstractC0235a;
import b0.AbstractC0347p;
import b0.C0352v;
import b0.r;
import b0.w;
import d0.AbstractC0404e;
import d0.C0406g;
import java.util.LinkedHashMap;
import java.util.Map;
import l2.InterfaceC0604e;
import r0.AbstractC0893O;
import r0.AbstractC0906c;
import r0.C0915l;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.AbstractC0993f;
import t0.InterfaceC1002o;
import t0.InterfaceC1009w;
import t0.P;
import t0.o0;
import x.N;

/* loaded from: classes.dex */
public final class n extends p implements InterfaceC1009w, InterfaceC1002o, o0 {

    /* renamed from: A, reason: collision with root package name */
    public m f76A;

    /* renamed from: B, reason: collision with root package name */
    public l f77B;

    /* renamed from: q, reason: collision with root package name */
    public String f78q;

    /* renamed from: r, reason: collision with root package name */
    public K f79r;

    /* renamed from: s, reason: collision with root package name */
    public H0.d f80s;

    /* renamed from: t, reason: collision with root package name */
    public int f81t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f82u;

    /* renamed from: v, reason: collision with root package name */
    public int f83v;

    /* renamed from: w, reason: collision with root package name */
    public int f84w;

    /* renamed from: x, reason: collision with root package name */
    public w f85x;

    /* renamed from: y, reason: collision with root package name */
    public Map f86y;

    /* renamed from: z, reason: collision with root package name */
    public e f87z;

    @Override // t0.InterfaceC1009w
    public final int b(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return N.k(z0(p3).d(p3.getLayoutDirection()).c());
    }

    @Override // t0.InterfaceC1009w
    public final int c(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return z0(p3).a(i3, p3.getLayoutDirection());
    }

    @Override // t0.InterfaceC1009w
    public final int e(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return N.k(z0(p3).d(p3.getLayoutDirection()).a());
    }

    @Override // t0.InterfaceC1009w
    public final int f(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return z0(p3).a(i3, p3.getLayoutDirection());
    }

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        long j4;
        boolean z3;
        t tVar;
        e z02 = z0(interfaceC0887I);
        O0.k layoutDirection = interfaceC0887I.getLayoutDirection();
        if (z02.f34g > 1) {
            b bVar = z02.f40m;
            K k3 = z02.f29b;
            O0.b bVar2 = z02.f36i;
            f2.j.c(bVar2);
            b c02 = O2.l.c0(bVar, layoutDirection, k3, bVar2, z02.f30c);
            z02.f40m = c02;
            j4 = c02.a(j3, z02.f34g);
        } else {
            j4 = j3;
        }
        C0026b c0026b = z02.f37j;
        if (c0026b == null || (tVar = z02.f41n) == null || tVar.b() || layoutDirection != z02.f42o || (!O0.a.b(j4, z02.f43p) && (O0.a.h(j4) != O0.a.h(z02.f43p) || O0.a.g(j4) < c0026b.b() || c0026b.f581d.f825d))) {
            C0026b b3 = z02.b(j4, layoutDirection);
            z02.f43p = j4;
            long A3 = O2.d.A(j4, O2.d.d(N.k(b3.d()), N.k(b3.b())));
            z02.f39l = A3;
            z02.f38k = !AbstractC0235a.v(z02.f31d, 3) && (((float) ((int) (A3 >> 32))) < b3.d() || ((float) ((int) (A3 & 4294967295L))) < b3.b());
            z02.f37j = b3;
            z3 = true;
        } else {
            if (!O0.a.b(j4, z02.f43p)) {
                C0026b c0026b2 = z02.f37j;
                f2.j.c(c0026b2);
                long A4 = O2.d.A(j4, O2.d.d(N.k(Math.min(c0026b2.f578a.f3237i.b(), c0026b2.d())), N.k(c0026b2.b())));
                z02.f39l = A4;
                z02.f38k = !AbstractC0235a.v(z02.f31d, 3) && (((float) ((int) (A4 >> 32))) < c0026b2.d() || ((float) ((int) (A4 & 4294967295L))) < c0026b2.b());
                z02.f43p = j4;
            }
            z3 = false;
        }
        t tVar2 = z02.f41n;
        if (tVar2 != null) {
            tVar2.b();
        }
        C0026b c0026b3 = z02.f37j;
        f2.j.c(c0026b3);
        long j5 = z02.f39l;
        if (z3) {
            AbstractC0993f.r(this, 2).Q0();
            Map map = this.f86y;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            C0915l c0915l = AbstractC0906c.f8150a;
            G g3 = c0026b3.f581d;
            map.put(c0915l, Integer.valueOf(Math.round(g3.d(0))));
            map.put(AbstractC0906c.f8151b, Integer.valueOf(Math.round(g3.d(g3.f828g - 1))));
            this.f86y = map;
        }
        int i3 = (int) (j5 >> 32);
        int i4 = (int) (j5 & 4294967295L);
        int min = Math.min(i3, 262142);
        int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int l3 = O2.d.l(min2 == Integer.MAX_VALUE ? min : min2);
        AbstractC0893O b4 = interfaceC0884F.b(O2.d.a(min, min2, Math.min(l3, i4), i4 != Integer.MAX_VALUE ? Math.min(l3, i4) : Integer.MAX_VALUE));
        Map map2 = this.f86y;
        f2.j.c(map2);
        return interfaceC0887I.i0(i3, i4, map2, new i(b4, 1));
    }

    @Override // t0.InterfaceC1002o
    public final void h(t0.G g3) {
        if (this.f4501p) {
            e z02 = z0(g3);
            C0026b c0026b = z02.f37j;
            if (c0026b == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f87z + ", textSubstitution=" + this.f77B + ')').toString());
            }
            r h3 = g3.f8573d.f5649e.h();
            boolean z3 = z02.f38k;
            if (z3) {
                long j3 = z02.f39l;
                h3.f();
                h3.r(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L), 1);
            }
            try {
                D d3 = this.f79r.f571a;
                N0.j jVar = d3.f537m;
                if (jVar == null) {
                    jVar = N0.j.f3548b;
                }
                N0.j jVar2 = jVar;
                b0.P p3 = d3.f538n;
                if (p3 == null) {
                    p3 = b0.P.f5380d;
                }
                b0.P p4 = p3;
                AbstractC0404e abstractC0404e = d3.f540p;
                if (abstractC0404e == null) {
                    abstractC0404e = C0406g.f5653a;
                }
                AbstractC0404e abstractC0404e2 = abstractC0404e;
                AbstractC0347p c2 = d3.f525a.c();
                if (c2 != null) {
                    c0026b.g(h3, c2, this.f79r.f571a.f525a.a(), p4, jVar2, abstractC0404e2, 3);
                } else {
                    w wVar = this.f85x;
                    long a3 = wVar != null ? wVar.a() : C0352v.f5439g;
                    if (a3 == 16) {
                        a3 = this.f79r.b() != 16 ? this.f79r.b() : C0352v.f5434b;
                    }
                    c0026b.f(h3, a3, p4, jVar2, abstractC0404e2, 3);
                }
                if (z3) {
                    h3.a();
                }
            } catch (Throwable th) {
                if (z3) {
                    h3.a();
                }
                throw th;
            }
        }
    }

    @Override // t0.o0
    public final void j(A0.i iVar) {
        m mVar = this.f76A;
        if (mVar == null) {
            mVar = new m(this, 0);
            this.f76A = mVar;
        }
        C0031g c0031g = new C0031g(this.f78q, null, 6);
        InterfaceC0604e[] interfaceC0604eArr = u.f193a;
        iVar.c(s.f186u, O2.l.l0(c0031g));
        l lVar = this.f77B;
        if (lVar != null) {
            boolean z3 = lVar.f72c;
            v vVar = s.f188w;
            InterfaceC0604e[] interfaceC0604eArr2 = u.f193a;
            InterfaceC0604e interfaceC0604e = interfaceC0604eArr2[15];
            vVar.a(iVar, Boolean.valueOf(z3));
            C0031g c0031g2 = new C0031g(lVar.f71b, null, 6);
            v vVar2 = s.f187v;
            InterfaceC0604e interfaceC0604e2 = interfaceC0604eArr2[14];
            vVar2.a(iVar, c0031g2);
        }
        iVar.c(A0.h.f112j, new A0.a(null, new m(this, 1)));
        iVar.c(A0.h.f113k, new A0.a(null, new m(this, 2)));
        iVar.c(A0.h.f114l, new A0.a(null, new h(1, this)));
        u.c(iVar, mVar);
    }

    public final e y0() {
        if (this.f87z == null) {
            this.f87z = new e(this.f78q, this.f79r, this.f80s, this.f81t, this.f82u, this.f83v, this.f84w);
        }
        e eVar = this.f87z;
        f2.j.c(eVar);
        return eVar;
    }

    public final e z0(O0.b bVar) {
        e eVar;
        l lVar = this.f77B;
        if (lVar != null && lVar.f72c && (eVar = lVar.f73d) != null) {
            eVar.c(bVar);
            return eVar;
        }
        e y02 = y0();
        y02.c(bVar);
        return y02;
    }
}
