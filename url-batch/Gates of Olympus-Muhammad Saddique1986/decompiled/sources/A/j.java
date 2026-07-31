package A;

import A0.s;
import A0.u;
import A0.v;
import C0.AbstractC0032h;
import C0.AbstractC0037m;
import C0.C0029e;
import C0.C0031g;
import C0.D;
import C0.G;
import C0.H;
import C0.K;
import C0.o;
import U.p;
import a.AbstractC0235a;
import a0.C0239d;
import b0.AbstractC0347p;
import b0.C0352v;
import b0.r;
import b0.w;
import d0.AbstractC0404e;
import d0.C0406g;
import e2.InterfaceC0424c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l2.InterfaceC0604e;
import r0.AbstractC0893O;
import r0.AbstractC0906c;
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
public final class j extends p implements InterfaceC1009w, InterfaceC1002o, o0 {

    /* renamed from: A, reason: collision with root package name */
    public w f56A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC0424c f57B;
    public Map C;
    public d D;

    /* renamed from: E, reason: collision with root package name */
    public g f58E;

    /* renamed from: F, reason: collision with root package name */
    public f f59F;

    /* renamed from: q, reason: collision with root package name */
    public C0031g f60q;

    /* renamed from: r, reason: collision with root package name */
    public K f61r;

    /* renamed from: s, reason: collision with root package name */
    public H0.d f62s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0424c f63t;

    /* renamed from: u, reason: collision with root package name */
    public int f64u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f65v;

    /* renamed from: w, reason: collision with root package name */
    public int f66w;

    /* renamed from: x, reason: collision with root package name */
    public int f67x;

    /* renamed from: y, reason: collision with root package name */
    public List f68y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0424c f69z;

    @Override // t0.o0
    public final boolean O() {
        return true;
    }

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

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    @Override // t0.InterfaceC1009w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        H h3;
        d z02 = z0(interfaceC0887I);
        O0.k layoutDirection = interfaceC0887I.getLayoutDirection();
        boolean z3 = true;
        if (z02.f18g > 1) {
            b bVar = z02.f20i;
            K k3 = z02.f13b;
            O0.b bVar2 = z02.f22k;
            f2.j.c(bVar2);
            b c02 = O2.l.c0(bVar, layoutDirection, k3, bVar2, z02.f14c);
            z02.f20i = c02;
            j3 = c02.a(j3, z02.f18g);
        }
        H h4 = z02.f25n;
        if (h4 != null) {
            o oVar = h4.f558b;
            if (!oVar.f618a.b()) {
                G g3 = h4.f557a;
                if (layoutDirection == g3.f554h) {
                    long j4 = g3.f556j;
                    if (O0.a.b(j3, j4) || (O0.a.h(j3) == O0.a.h(j4) && O0.a.g(j3) >= oVar.f622e && !oVar.f620c)) {
                        H h5 = z02.f25n;
                        f2.j.c(h5);
                        if (O0.a.b(j3, h5.f557a.f556j)) {
                            z3 = false;
                        } else {
                            H h6 = z02.f25n;
                            f2.j.c(h6);
                            z02.f25n = z02.e(layoutDirection, j3, h6.f558b);
                        }
                        h3 = z02.f25n;
                        if (h3 != null) {
                            throw new IllegalStateException("You must call layoutWithConstraints first");
                        }
                        h3.f558b.f618a.b();
                        if (z3) {
                            AbstractC0993f.r(this, 2).Q0();
                            InterfaceC0424c interfaceC0424c = this.f63t;
                            if (interfaceC0424c != null) {
                                interfaceC0424c.n(h3);
                            }
                            Map map = this.C;
                            if (map == null) {
                                map = new LinkedHashMap(2);
                            }
                            map.put(AbstractC0906c.f8150a, Integer.valueOf(Math.round(h3.f560d)));
                            map.put(AbstractC0906c.f8151b, Integer.valueOf(Math.round(h3.f561e)));
                            this.C = map;
                        }
                        InterfaceC0424c interfaceC0424c2 = this.f69z;
                        if (interfaceC0424c2 != null) {
                            interfaceC0424c2.n(h3.f562f);
                        }
                        long j5 = h3.f559c;
                        int i3 = (int) (j5 >> 32);
                        int i4 = (int) (j5 & 4294967295L);
                        int min = Math.min(i3, 262142);
                        int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
                        int l3 = O2.d.l(min2 == Integer.MAX_VALUE ? min : min2);
                        AbstractC0893O b3 = interfaceC0884F.b(O2.d.a(min, min2, Math.min(l3, i4), i4 != Integer.MAX_VALUE ? Math.min(l3, i4) : Integer.MAX_VALUE));
                        Map map2 = this.C;
                        f2.j.c(map2);
                        return interfaceC0887I.i0(i3, i4, map2, new i(b3, 0));
                    }
                }
            }
        }
        z02.f25n = z02.e(layoutDirection, j3, z02.b(j3, layoutDirection));
        h3 = z02.f25n;
        if (h3 != null) {
        }
    }

    @Override // t0.InterfaceC1002o
    public final void h(t0.G g3) {
        if (this.f4501p) {
            r h3 = g3.f8573d.f5649e.h();
            H h4 = z0(g3).f25n;
            if (h4 == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            long j3 = h4.f559c;
            float f3 = (int) (j3 >> 32);
            o oVar = h4.f558b;
            boolean z3 = ((f3 > oVar.f621d ? 1 : (f3 == oVar.f621d ? 0 : -1)) < 0 || oVar.f620c || (((float) ((int) (j3 & 4294967295L))) > oVar.f622e ? 1 : (((float) ((int) (j3 & 4294967295L))) == oVar.f622e ? 0 : -1)) < 0) && !AbstractC0235a.v(this.f64u, 3);
            if (z3) {
                C0239d g4 = O2.d.g(0L, AbstractC0235a.e((int) (j3 >> 32), (int) (j3 & 4294967295L)));
                h3.f();
                r.d(h3, g4);
            }
            try {
                D d3 = this.f61r.f571a;
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
                    o.h(oVar, h3, c2, this.f61r.f571a.f525a.a(), p4, jVar2, abstractC0404e2);
                } else {
                    w wVar = this.f56A;
                    long a3 = wVar != null ? wVar.a() : C0352v.f5439g;
                    if (a3 == 16) {
                        a3 = this.f61r.b() != 16 ? this.f61r.b() : C0352v.f5434b;
                    }
                    o.g(oVar, h3, a3, p4, jVar2, abstractC0404e2);
                }
                if (z3) {
                    h3.a();
                }
                f fVar = this.f59F;
                if (fVar == null || !fVar.f48c) {
                    C0031g c0031g = this.f60q;
                    int length = c0031g.f596a.length();
                    List list = c0031g.f599d;
                    if (list != null) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            C0029e c0029e = (C0029e) list.get(i3);
                            if ((c0029e.f592a instanceof AbstractC0037m) && AbstractC0032h.c(0, length, c0029e.f593b, c0029e.f594c)) {
                                break;
                            }
                        }
                    }
                }
                List list2 = this.f68y;
                if (list2 == null || list2.isEmpty()) {
                    return;
                }
                g3.b();
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
        g gVar = this.f58E;
        if (gVar == null) {
            gVar = new g(this, 0);
            this.f58E = gVar;
        }
        C0031g c0031g = this.f60q;
        InterfaceC0604e[] interfaceC0604eArr = u.f193a;
        iVar.c(s.f186u, O2.l.l0(c0031g));
        f fVar = this.f59F;
        if (fVar != null) {
            C0031g c0031g2 = fVar.f47b;
            v vVar = s.f187v;
            InterfaceC0604e[] interfaceC0604eArr2 = u.f193a;
            InterfaceC0604e interfaceC0604e = interfaceC0604eArr2[14];
            vVar.a(iVar, c0031g2);
            boolean z3 = fVar.f48c;
            v vVar2 = s.f188w;
            InterfaceC0604e interfaceC0604e2 = interfaceC0604eArr2[15];
            vVar2.a(iVar, Boolean.valueOf(z3));
        }
        iVar.c(A0.h.f112j, new A0.a(null, new g(this, 1)));
        iVar.c(A0.h.f113k, new A0.a(null, new g(this, 2)));
        iVar.c(A0.h.f114l, new A0.a(null, new h(0, this)));
        u.c(iVar, gVar);
    }

    public final d y0() {
        if (this.D == null) {
            this.D = new d(this.f60q, this.f61r, this.f62s, this.f64u, this.f65v, this.f66w, this.f67x, this.f68y);
        }
        d dVar = this.D;
        f2.j.c(dVar);
        return dVar;
    }

    public final d z0(O0.b bVar) {
        d dVar;
        f fVar = this.f59F;
        if (fVar != null && fVar.f48c && (dVar = fVar.f49d) != null) {
            dVar.c(bVar);
            return dVar;
        }
        d y02 = y0();
        y02.c(bVar);
        return y02;
    }
}
