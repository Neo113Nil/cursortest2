package z;

import a2.d0;
import a2.k0;
import a2.t;
import java.util.LinkedHashMap;
import java.util.Map;
import k.c0;
import l2.j;
import p1.e0;
import p1.h0;
import p1.n0;
import r1.f0;
import r1.n1;
import r1.o;
import r1.o0;
import r1.w;
import r1.z0;
import r6.k;
import s0.n;
import w.g0;
import y1.h;
import y1.i;
import y1.p;
import y1.r;
import y1.s;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends n implements w, o, n1 {
    public d A;
    public f B;
    public e C;

    /* renamed from: s, reason: collision with root package name */
    public String f9974s;

    /* renamed from: t, reason: collision with root package name */
    public k0 f9975t;

    /* renamed from: u, reason: collision with root package name */
    public f2.d f9976u;

    /* renamed from: v, reason: collision with root package name */
    public int f9977v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9978w;

    /* renamed from: x, reason: collision with root package name */
    public int f9979x;

    /* renamed from: y, reason: collision with root package name */
    public int f9980y;

    /* renamed from: z, reason: collision with root package name */
    public Map f9981z;

    public final d A0() {
        if (this.A == null) {
            this.A = new d(this.f9974s, this.f9975t, this.f9976u, this.f9977v, this.f9978w, this.f9979x, this.f9980y);
        }
        d dVar = this.A;
        k.c(dVar);
        return dVar;
    }

    public final d B0(m2.b bVar) {
        d dVar;
        e eVar = this.C;
        if (eVar != null && eVar.f9970c && (dVar = eVar.f9971d) != null) {
            dVar.c(bVar);
            return dVar;
        }
        d A0 = A0();
        A0.c(bVar);
        return A0;
    }

    @Override // r1.n1
    public final void S(i iVar) {
        f fVar = this.B;
        if (fVar == null) {
            fVar = new f(this, 0);
            this.B = fVar;
        }
        a2.g gVar = new a2.g(this.f9974s, null, 6);
        x6.e[] eVarArr = r.f9886a;
        iVar.m(p.f9879u, t6.a.F(gVar));
        e eVar = this.C;
        if (eVar != null) {
            boolean z8 = eVar.f9970c;
            s sVar = p.f9881w;
            x6.e[] eVarArr2 = r.f9886a;
            x6.e eVar2 = eVarArr2[15];
            sVar.a(iVar, Boolean.valueOf(z8));
            a2.g gVar2 = new a2.g(eVar.f9969b, null, 6);
            s sVar2 = p.f9880v;
            x6.e eVar3 = eVarArr2[14];
            sVar2.a(iVar, gVar2);
        }
        iVar.m(h.f9815j, new y1.a(null, new f(this, 1)));
        iVar.m(h.f9816k, new y1.a(null, new f(this, 2)));
        iVar.m(h.f9817l, new y1.a(null, new z0(15, this)));
        r.c(iVar, fVar);
    }

    @Override // r1.w
    public final int b(o0 o0Var, e0 e0Var, int i7) {
        return g0.k(B0(o0Var).d(o0Var.getLayoutDirection()).c());
    }

    @Override // r1.o
    public final void c(f0 f0Var) {
        if (this.f8116r) {
            d B0 = B0(f0Var);
            a2.b bVar = B0.f9959j;
            if (bVar == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.A + ", textSubstitution=" + this.C + ')').toString());
            }
            z0.r k8 = f0Var.f7767f.f1234g.k();
            boolean z8 = B0.f9960k;
            if (z8) {
                long j8 = B0.f9961l;
                k8.o();
                k8.j(0.0f, 0.0f, (int) (j8 >> 32), (int) (j8 & 4294967295L), 1);
            }
            try {
                d0 d0Var = this.f9975t.f412a;
                j jVar = d0Var.f359m;
                if (jVar == null) {
                    jVar = j.f5877b;
                }
                j jVar2 = jVar;
                z0.o0 o0Var = d0Var.f360n;
                if (o0Var == null) {
                    o0Var = z0.o0.f10030d;
                }
                z0.o0 o0Var2 = o0Var;
                b1.f fVar = d0Var.f362p;
                if (fVar == null) {
                    fVar = b1.h.f1238a;
                }
                b1.f fVar2 = fVar;
                z0.p c4 = d0Var.f347a.c();
                if (c4 != null) {
                    bVar.g(k8, c4, this.f9975t.f412a.f347a.a(), o0Var2, jVar2, fVar2);
                } else {
                    long j9 = u.f10057g;
                    if (j9 == 16) {
                        j9 = this.f9975t.b() != 16 ? this.f9975t.b() : u.f10052b;
                    }
                    bVar.f(k8, j9, o0Var2, jVar2, fVar2);
                }
                if (z8) {
                    k8.n();
                }
            } catch (Throwable th) {
                if (z8) {
                    k8.n();
                }
                throw th;
            }
        }
    }

    @Override // r1.w
    public final int e(o0 o0Var, e0 e0Var, int i7) {
        return B0(o0Var).a(i7, o0Var.getLayoutDirection());
    }

    @Override // r1.w
    public final p1.g0 f(h0 h0Var, e0 e0Var, long j8) {
        long j9;
        boolean z8;
        t tVar;
        int i7;
        d B0 = B0(h0Var);
        m2.k layoutDirection = h0Var.getLayoutDirection();
        if (B0.f9956g > 1) {
            b bVar = B0.f9962m;
            k0 k0Var = B0.f9951b;
            m2.b bVar2 = B0.f9958i;
            k.c(bVar2);
            f2.d dVar = B0.f9952c;
            if ((bVar == null || layoutDirection != bVar.f9941a || !k.a(k0Var, bVar.f9942b) || bVar2.a() != bVar.f9943c.f6307f || dVar != bVar.f9944d) && ((bVar = b.f9940h) == null || layoutDirection != bVar.f9941a || !k.a(k0Var, bVar.f9942b) || bVar2.a() != bVar.f9943c.f6307f || dVar != bVar.f9944d)) {
                bVar = new b(layoutDirection, t6.a.J(k0Var, layoutDirection), new m2.c(bVar2.a(), bVar2.m()), dVar);
                b.f9940h = bVar;
            }
            B0.f9962m = bVar;
            int i8 = B0.f9956g;
            m2.c cVar = bVar.f9943c;
            float f9 = bVar.f9947g;
            float f10 = bVar.f9946f;
            if (Float.isNaN(f9) || Float.isNaN(f10)) {
                float b9 = j1.c.I(c.f9948a, bVar.f9945e, r4.a.c(0, 0, 15), cVar, bVar.f9944d, 1, 96).b();
                f10 = j1.c.I(c.f9949b, bVar.f9945e, r4.a.c(0, 0, 15), cVar, bVar.f9944d, 2, 96).b() - b9;
                bVar.f9947g = b9;
                bVar.f9946f = f10;
                f9 = b9;
            }
            if (i8 != 1) {
                int round = Math.round((f10 * (i8 - 1)) + f9);
                i7 = round >= 0 ? round : 0;
                int g9 = m2.a.g(j8);
                if (i7 > g9) {
                    i7 = g9;
                }
            } else {
                i7 = m2.a.i(j8);
            }
            j9 = r4.a.b(m2.a.j(j8), m2.a.h(j8), i7, m2.a.g(j8));
        } else {
            j9 = j8;
        }
        a2.b bVar3 = B0.f9959j;
        if (bVar3 == null || (tVar = B0.f9963n) == null || tVar.b() || layoutDirection != B0.f9964o || (!m2.a.b(j9, B0.f9965p) && (m2.a.h(j9) != m2.a.h(B0.f9965p) || m2.a.g(j9) < bVar3.b() || bVar3.f314d.f1265c))) {
            a2.b b10 = B0.b(j9, layoutDirection);
            B0.f9965p = j9;
            long t2 = r4.a.t(j9, j1.c.G(g0.k(b10.d()), g0.k(b10.b())));
            B0.f9961l = t2;
            B0.f9960k = B0.f9953d != 3 && (((float) ((int) (t2 >> 32))) < b10.d() || ((float) ((int) (t2 & 4294967295L))) < b10.b());
            B0.f9959j = b10;
            z8 = true;
        } else {
            if (!m2.a.b(j9, B0.f9965p)) {
                a2.b bVar4 = B0.f9959j;
                k.c(bVar4);
                long t8 = r4.a.t(j9, j1.c.G(g0.k(Math.min(bVar4.f311a.f4867i.b(), bVar4.d())), g0.k(bVar4.b())));
                B0.f9961l = t8;
                B0.f9960k = B0.f9953d != 3 && (((float) ((int) (t8 >> 32))) < bVar4.d() || ((float) ((int) (t8 & 4294967295L))) < bVar4.b());
                B0.f9965p = j9;
            }
            z8 = false;
        }
        t tVar2 = B0.f9963n;
        if (tVar2 != null) {
            tVar2.b();
        }
        a2.b bVar5 = B0.f9959j;
        k.c(bVar5);
        b2.d0 d0Var = bVar5.f314d;
        long j10 = B0.f9961l;
        if (z8) {
            r1.f.r(this, 2).S0();
            Map map = this.f9981z;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            map.put(p1.c.f7034a, Integer.valueOf(Math.round(d0Var.d(0))));
            map.put(p1.c.f7035b, Integer.valueOf(Math.round(d0Var.d(d0Var.f1268f - 1))));
            this.f9981z = map;
        }
        int i9 = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        int min = Math.min(i9, 262142);
        int min2 = i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i9, 262142);
        int l8 = r4.a.l(min2 == Integer.MAX_VALUE ? min : min2);
        n0 b11 = e0Var.b(r4.a.b(min, min2, Math.min(l8, i10), i10 != Integer.MAX_VALUE ? Math.min(l8, i10) : Integer.MAX_VALUE));
        Map map2 = this.f9981z;
        k.c(map2);
        return h0Var.C(i9, i10, map2, new c0(b11, 10));
    }

    @Override // r1.w
    public final int h(o0 o0Var, e0 e0Var, int i7) {
        return g0.k(B0(o0Var).d(o0Var.getLayoutDirection()).a());
    }

    @Override // r1.w
    public final int i(o0 o0Var, e0 e0Var, int i7) {
        return B0(o0Var).a(i7, o0Var.getLayoutDirection());
    }
}
