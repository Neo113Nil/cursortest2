package z;

import B0.C;
import B0.C0004a;
import B0.C0007d;
import B0.n;
import B0.w;
import I2.l;
import M1.u;
import a.AbstractC0157a;
import b0.AbstractC0259J;
import b0.C0262M;
import b0.C0288u;
import b0.InterfaceC0285r;
import d0.AbstractC0322c;
import d0.C0325f;
import e2.AbstractC0381e;
import f.AbstractC0382a;
import f2.InterfaceC0390e;
import h.AbstractC0416e;
import java.util.LinkedHashMap;
import java.util.Map;
import r0.AbstractC0830c;
import r0.B;
import r0.C0837j;
import r0.H;
import r0.z;
import r1.r;
import t0.AbstractC0898f;
import t0.F;
import t0.InterfaceC0907o;
import t0.InterfaceC0914w;
import t0.O;
import t0.n0;
import z0.C1076a;
import z0.q;
import z0.s;
import z0.t;

/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1075k extends U.k implements InterfaceC0914w, InterfaceC0907o, n0 {

    /* renamed from: A, reason: collision with root package name */
    public C1074j f8931A;
    public C1073i B;

    /* renamed from: q, reason: collision with root package name */
    public String f8932q;

    /* renamed from: r, reason: collision with root package name */
    public C f8933r;

    /* renamed from: s, reason: collision with root package name */
    public F0.e f8934s;

    /* renamed from: t, reason: collision with root package name */
    public int f8935t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8936u;

    /* renamed from: v, reason: collision with root package name */
    public int f8937v;

    /* renamed from: w, reason: collision with root package name */
    public int f8938w;

    /* renamed from: x, reason: collision with root package name */
    public A2.g f8939x;

    /* renamed from: y, reason: collision with root package name */
    public Map f8940y;

    /* renamed from: z, reason: collision with root package name */
    public C1069e f8941z;

    @Override // t0.InterfaceC0914w
    public final B b(O o3, z zVar, long j3) {
        C1069e v0;
        long j4;
        int i3;
        int i4;
        boolean z3;
        n nVar;
        C1073i c1073i = this.B;
        if (c1073i == null || !c1073i.f8927c || (v0 = c1073i.f8928d) == null) {
            v0 = v0();
            v0.a(o3);
        } else {
            v0.a(o3);
        }
        M0.j layoutDirection = o3.getLayoutDirection();
        if (v0.f8897g > 1) {
            C1066b c1066b = v0.f8903m;
            C c3 = v0.f8892b;
            M0.b bVar = v0.f8899i;
            Z1.i.c(bVar);
            C1066b B = AbstractC0381e.B(c1066b, layoutDirection, c3, bVar, v0.f8893c);
            v0.f8903m = B;
            j4 = B.a(j3, v0.f8897g);
        } else {
            j4 = j3;
        }
        C0004a c0004a = v0.f8900j;
        if (c0004a == null || (nVar = v0.f8904n) == null || nVar.a() || layoutDirection != v0.f8905o || (!M0.a.b(j4, v0.p) && (M0.a.h(j4) != M0.a.h(v0.p) || M0.a.g(j4) < c0004a.b() || c0004a.f243d.f428d))) {
            n nVar2 = v0.f8904n;
            if (nVar2 == null || layoutDirection != v0.f8905o || nVar2.a()) {
                v0.f8905o = layoutDirection;
                String str = v0.f8891a;
                C O3 = l.O(v0.f8892b, layoutDirection);
                M0.b bVar2 = v0.f8899i;
                Z1.i.c(bVar2);
                F0.e eVar = v0.f8893c;
                u uVar = u.f2803d;
                nVar2 = new I0.d(str, O3, uVar, uVar, eVar, bVar2);
            }
            v0.f8904n = nVar2;
            long r3 = AbstractC0416e.r(j4, v0.f8895e, v0.f8894d, nVar2.b());
            boolean z4 = v0.f8895e;
            int i5 = v0.f8894d;
            int i6 = v0.f8896f;
            if (z4) {
                i3 = 2;
            } else {
                i3 = 2;
                if (AbstractC0157a.y(i5, 2)) {
                    i4 = 1;
                    C0004a c0004a2 = new C0004a((I0.d) nVar2, i4, AbstractC0157a.y(v0.f8894d, i3), r3);
                    v0.p = j4;
                    long o4 = l.o(j4, l.e(AbstractC0382a.e(c0004a2.c()), AbstractC0382a.e(c0004a2.b())));
                    v0.f8902l = o4;
                    v0.f8901k = AbstractC0157a.y(v0.f8894d, 3) && (((float) ((int) (o4 >> 32))) < c0004a2.c() || ((float) ((int) (o4 & 4294967295L))) < c0004a2.b());
                    v0.f8900j = c0004a2;
                    z3 = true;
                }
            }
            if (i6 < 1) {
                i6 = 1;
            }
            i4 = i6;
            C0004a c0004a22 = new C0004a((I0.d) nVar2, i4, AbstractC0157a.y(v0.f8894d, i3), r3);
            v0.p = j4;
            long o42 = l.o(j4, l.e(AbstractC0382a.e(c0004a22.c()), AbstractC0382a.e(c0004a22.b())));
            v0.f8902l = o42;
            v0.f8901k = AbstractC0157a.y(v0.f8894d, 3) && (((float) ((int) (o42 >> 32))) < c0004a22.c() || ((float) ((int) (o42 & 4294967295L))) < c0004a22.b());
            v0.f8900j = c0004a22;
            z3 = true;
        } else {
            if (!M0.a.b(j4, v0.p)) {
                C0004a c0004a3 = v0.f8900j;
                Z1.i.c(c0004a3);
                long o5 = l.o(j4, l.e(AbstractC0382a.e(Math.min(c0004a3.f240a.f2436i.b(), c0004a3.c())), AbstractC0382a.e(c0004a3.b())));
                v0.f8902l = o5;
                v0.f8901k = !AbstractC0157a.y(v0.f8894d, 3) && (((float) ((int) (o5 >> 32))) < c0004a3.c() || ((float) ((int) (o5 & 4294967295L))) < c0004a3.b());
                v0.p = j4;
            }
            z3 = false;
        }
        n nVar3 = v0.f8904n;
        if (nVar3 != null) {
            nVar3.a();
        }
        C0004a c0004a4 = v0.f8900j;
        Z1.i.c(c0004a4);
        long j5 = v0.f8902l;
        if (z3) {
            AbstractC0898f.r(this, 2).H0();
            Map map = this.f8940y;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            C0837j c0837j = AbstractC0830c.f7138a;
            C0.C c4 = c0004a4.f243d;
            map.put(c0837j, Integer.valueOf(Math.round(c4.c(0))));
            map.put(AbstractC0830c.f7139b, Integer.valueOf(Math.round(c4.c(c4.f430f - 1))));
            this.f8940y = map;
        }
        int i7 = (int) (j5 >> 32);
        int i8 = (int) (j5 & 4294967295L);
        int min = Math.min(i7, 262142);
        int min2 = i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i7, 262142);
        int h3 = l.h(min2 == Integer.MAX_VALUE ? min : min2);
        H b2 = zVar.b(l.a(min, min2, Math.min(h3, i8), i8 != Integer.MAX_VALUE ? Math.min(h3, i8) : Integer.MAX_VALUE));
        Map map2 = this.f8940y;
        Z1.i.c(map2);
        return o3.I(i7, i8, map2, new Y.g(b2, 9));
    }

    @Override // t0.InterfaceC0907o
    public final void d(F f3) {
        C1069e v0;
        if (this.p) {
            C1073i c1073i = this.B;
            if (c1073i == null || !c1073i.f8927c || (v0 = c1073i.f8928d) == null) {
                v0 = v0();
                v0.a(f3);
            } else {
                v0.a(f3);
            }
            C0004a c0004a = v0.f8900j;
            if (c0004a == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.f8941z + ", textSubstitution=" + this.B + ')').toString());
            }
            InterfaceC0285r h3 = f3.f7748d.f4444e.h();
            boolean z3 = v0.f8901k;
            if (z3) {
                long j3 = v0.f8902l;
                h3.f();
                h3.q(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L), 1);
            }
            try {
                w wVar = this.f8933r.f235a;
                L0.g gVar = wVar.f377m;
                if (gVar == null) {
                    gVar = L0.g.f2682b;
                }
                L0.g gVar2 = gVar;
                C0262M c0262m = wVar.f378n;
                if (c0262m == null) {
                    c0262m = C0262M.f4239d;
                }
                C0262M c0262m2 = c0262m;
                AbstractC0322c abstractC0322c = wVar.f379o;
                if (abstractC0322c == null) {
                    abstractC0322c = C0325f.f4448b;
                }
                AbstractC0322c abstractC0322c2 = abstractC0322c;
                AbstractC0259J c3 = wVar.f365a.c();
                if (c3 != null) {
                    c0004a.f(h3, c3, this.f8933r.f235a.f365a.a(), c0262m2, gVar2, abstractC0322c2, 3);
                } else {
                    A2.g gVar3 = this.f8939x;
                    long o3 = gVar3 != null ? gVar3.o() : C0288u.f4296f;
                    if (o3 == 16) {
                        o3 = this.f8933r.b() != 16 ? this.f8933r.b() : C0288u.f4292b;
                    }
                    c0004a.e(h3, o3, c0262m2, gVar2, abstractC0322c2, 3);
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

    @Override // t0.n0
    public final void h(z0.i iVar) {
        C1074j c1074j = this.f8931A;
        if (c1074j == null) {
            c1074j = new C1074j(this, 0);
            this.f8931A = c1074j;
        }
        C0007d c0007d = new C0007d(this.f8932q, null, null, null);
        InterfaceC0390e[] interfaceC0390eArr = s.f9036a;
        iVar.d(q.f9028t, AbstractC0157a.M(c0007d));
        C1073i c1073i = this.B;
        if (c1073i != null) {
            boolean z3 = c1073i.f8927c;
            t tVar = q.f9030v;
            InterfaceC0390e[] interfaceC0390eArr2 = s.f9036a;
            InterfaceC0390e interfaceC0390e = interfaceC0390eArr2[15];
            tVar.a(iVar, Boolean.valueOf(z3));
            C0007d c0007d2 = new C0007d(c1073i.f8926b, null, null, null);
            t tVar2 = q.f9029u;
            InterfaceC0390e interfaceC0390e2 = interfaceC0390eArr2[14];
            tVar2.a(iVar, c0007d2);
        }
        iVar.d(z0.h.f8966j, new C1076a(null, new C1074j(this, 1)));
        iVar.d(z0.h.f8967k, new C1076a(null, new C1074j(this, 2)));
        iVar.d(z0.h.f8968l, new C1076a(null, new r(10, this)));
        iVar.d(z0.h.f8957a, new C1076a(null, c1074j));
    }

    public final C1069e v0() {
        if (this.f8941z == null) {
            this.f8941z = new C1069e(this.f8932q, this.f8933r, this.f8934s, this.f8935t, this.f8936u, this.f8937v, this.f8938w);
        }
        C1069e c1069e = this.f8941z;
        Z1.i.c(c1069e);
        return c1069e;
    }
}
