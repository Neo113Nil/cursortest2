package t0;

import H2.AbstractC0080b;
import I.C0120t;
import I.C0124v;
import I.C0125v0;
import I.InterfaceC0101j;
import I.InterfaceC0126w;
import b0.C0261L;
import b0.InterfaceC0285r;
import e0.C0336b;
import e2.AbstractC0381e;
import java.util.List;
import m.AbstractC0600j;
import r0.InterfaceC0827A;
import u0.C0997t;
import u0.D0;

/* loaded from: classes.dex */
public final class D implements InterfaceC0101j, h0, InterfaceC0902j {

    /* renamed from: I, reason: collision with root package name */
    public static final A f7708I = new A();

    /* renamed from: J, reason: collision with root package name */
    public static final C0917z f7709J = new C0917z();

    /* renamed from: K, reason: collision with root package name */
    public static final C0.q f7710K = new C0.q(3);

    /* renamed from: A, reason: collision with root package name */
    public a0 f7711A;
    public boolean B;
    public U.l C;
    public U.l D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f7712E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f7713F;

    /* renamed from: G, reason: collision with root package name */
    public int f7714G;

    /* renamed from: H, reason: collision with root package name */
    public int f7715H;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7716d;

    /* renamed from: e, reason: collision with root package name */
    public int f7717e;

    /* renamed from: f, reason: collision with root package name */
    public D f7718f;

    /* renamed from: g, reason: collision with root package name */
    public int f7719g;

    /* renamed from: h, reason: collision with root package name */
    public final C2.c f7720h;

    /* renamed from: i, reason: collision with root package name */
    public K.d f7721i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7722j;

    /* renamed from: k, reason: collision with root package name */
    public D f7723k;

    /* renamed from: l, reason: collision with root package name */
    public C0997t f7724l;

    /* renamed from: m, reason: collision with root package name */
    public int f7725m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7726n;

    /* renamed from: o, reason: collision with root package name */
    public z0.i f7727o;
    public final K.d p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7728q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0827A f7729r;

    /* renamed from: s, reason: collision with root package name */
    public M0.b f7730s;

    /* renamed from: t, reason: collision with root package name */
    public M0.j f7731t;

    /* renamed from: u, reason: collision with root package name */
    public D0 f7732u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0126w f7733v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7734w;

    /* renamed from: x, reason: collision with root package name */
    public final C0120t f7735x;

    /* renamed from: y, reason: collision with root package name */
    public final L f7736y;

    /* renamed from: z, reason: collision with root package name */
    public r0.w f7737z;

    public D(int i3, int i4, boolean z3) {
        this(z0.k.f8985a.addAndGet(1), (i3 & 1) != 0 ? false : z3);
    }

    public static boolean K(D d3) {
        J j3 = d3.f7736y.f7813r;
        return d3.J(j3.f7781l ? new M0.a(j3.f7117g) : null);
    }

    public static void P(D d3, boolean z3, int i3) {
        D q2;
        if ((i3 & 1) != 0) {
            z3 = false;
        }
        boolean z4 = (i3 & 2) != 0;
        boolean z5 = (i3 & 4) != 0;
        if (d3.f7718f == null) {
            AbstractC0381e.N("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        C0997t c0997t = d3.f7724l;
        if (c0997t == null || d3.f7726n || d3.f7716d) {
            return;
        }
        c0997t.y(d3, true, z3, z4);
        if (z5) {
            I i4 = d3.f7736y.f7814s;
            Z1.i.c(i4);
            L l3 = i4.f7754A;
            D q3 = l3.f7797a.q();
            int i5 = l3.f7797a.f7714G;
            if (q3 == null || i5 == 3) {
                return;
            }
            while (q3.f7714G == i5 && (q2 = q3.q()) != null) {
                q3 = q2;
            }
            int a3 = AbstractC0600j.a(i5);
            if (a3 == 0) {
                if (q3.f7718f != null) {
                    P(q3, z3, 6);
                    return;
                } else {
                    R(q3, z3, 6);
                    return;
                }
            }
            if (a3 != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (q3.f7718f != null) {
                q3.O(z3);
            } else {
                q3.Q(z3);
            }
        }
    }

    public static void R(D d3, boolean z3, int i3) {
        C0997t c0997t;
        D q2;
        if ((i3 & 1) != 0) {
            z3 = false;
        }
        boolean z4 = (i3 & 2) != 0;
        boolean z5 = (i3 & 4) != 0;
        if (d3.f7726n || d3.f7716d || (c0997t = d3.f7724l) == null) {
            return;
        }
        c0997t.y(d3, false, z3, z4);
        if (z5) {
            L l3 = d3.f7736y.f7813r.f7777I;
            D q3 = l3.f7797a.q();
            int i4 = l3.f7797a.f7714G;
            if (q3 == null || i4 == 3) {
                return;
            }
            while (q3.f7714G == i4 && (q2 = q3.q()) != null) {
                q3 = q2;
            }
            int a3 = AbstractC0600j.a(i4);
            if (a3 == 0) {
                R(q3, z3, 6);
            } else {
                if (a3 != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                q3.Q(z3);
            }
        }
    }

    public static void S(D d3) {
        int i3 = C.f7707a[AbstractC0600j.a(d3.f7736y.f7799c)];
        L l3 = d3.f7736y;
        if (i3 != 1) {
            throw new IllegalStateException("Unexpected state ".concat(AbstractC0080b.v(l3.f7799c)));
        }
        if (l3.f7803g) {
            P(d3, true, 6);
            return;
        }
        if (l3.f7804h) {
            d3.O(true);
        }
        if (l3.f7800d) {
            R(d3, true, 6);
        } else if (l3.f7801e) {
            d3.Q(true);
        }
    }

    public final void A() {
        D d3;
        if (this.f7719g > 0) {
            this.f7722j = true;
        }
        if (!this.f7716d || (d3 = this.f7723k) == null) {
            return;
        }
        d3.A();
    }

    public final boolean B() {
        return this.f7724l != null;
    }

    public final boolean C() {
        return this.f7736y.f7813r.f7789u;
    }

    public final Boolean D() {
        I i3 = this.f7736y.f7814s;
        if (i3 != null) {
            return Boolean.valueOf(i3.f7764s);
        }
        return null;
    }

    public final void E() {
        D q2;
        if (this.f7714G == 3) {
            g();
        }
        I i3 = this.f7736y.f7814s;
        Z1.i.c(i3);
        try {
            i3.f7755i = true;
            if (!i3.f7760n) {
                AbstractC0381e.N("replace() called on item that was not placed");
                throw null;
            }
            i3.f7771z = false;
            boolean z3 = i3.f7764s;
            i3.f0(i3.f7762q, i3.f7763r);
            if (z3 && !i3.f7771z && (q2 = i3.f7754A.f7797a.q()) != null) {
                q2.O(false);
            }
        } finally {
            i3.f7755i = false;
        }
    }

    public final void F(int i3, int i4, int i5) {
        if (i3 == i4) {
            return;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = i3 > i4 ? i3 + i6 : i3;
            int i8 = i3 > i4 ? i4 + i6 : (i4 + i5) - 2;
            C2.c cVar = this.f7720h;
            Object o3 = ((K.d) cVar.f484e).o(i7);
            r1.r rVar = (r1.r) cVar.f485f;
            rVar.b();
            ((K.d) cVar.f484e).a(i8, (D) o3);
            rVar.b();
        }
        I();
        A();
        y();
    }

    public final void G(D d3) {
        if (d3.f7736y.f7810n > 0) {
            this.f7736y.b(r0.f7810n - 1);
        }
        if (this.f7724l != null) {
            d3.i();
        }
        d3.f7723k = null;
        ((a0) d3.f7735x.f2354d).f7878q = null;
        if (d3.f7716d) {
            this.f7719g--;
            K.d dVar = (K.d) d3.f7720h.f484e;
            int i3 = dVar.f2642f;
            if (i3 > 0) {
                Object[] objArr = dVar.f2640d;
                int i4 = 0;
                do {
                    ((a0) ((D) objArr[i4]).f7735x.f2354d).f7878q = null;
                    i4++;
                } while (i4 < i3);
            }
        }
        A();
        I();
    }

    @Override // t0.h0
    public final boolean H() {
        return B();
    }

    public final void I() {
        if (!this.f7716d) {
            this.f7728q = true;
            return;
        }
        D q2 = q();
        if (q2 != null) {
            q2.I();
        }
    }

    public final boolean J(M0.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.f7714G == 3) {
            f();
        }
        return this.f7736y.f7813r.k0(aVar.f2760a);
    }

    public final void L() {
        C2.c cVar = this.f7720h;
        int i3 = ((K.d) cVar.f484e).f2642f;
        while (true) {
            i3--;
            K.d dVar = (K.d) cVar.f484e;
            if (-1 >= i3) {
                dVar.h();
                ((r1.r) cVar.f485f).b();
                return;
            }
            G((D) dVar.f2640d[i3]);
        }
    }

    public final void M(int i3, int i4) {
        if (i4 < 0) {
            AbstractC0381e.M("count (" + i4 + ") must be greater than 0");
            throw null;
        }
        int i5 = (i4 + i3) - 1;
        if (i3 > i5) {
            return;
        }
        while (true) {
            C2.c cVar = this.f7720h;
            G((D) ((K.d) cVar.f484e).f2640d[i5]);
            Object o3 = ((K.d) cVar.f484e).o(i5);
            ((r1.r) cVar.f485f).b();
            if (i5 == i3) {
                return;
            } else {
                i5--;
            }
        }
    }

    public final void N() {
        D q2;
        if (this.f7714G == 3) {
            g();
        }
        J j3 = this.f7736y.f7813r;
        j3.getClass();
        try {
            j3.f7778i = true;
            if (!j3.f7782m) {
                AbstractC0381e.N("replace called on unplaced item");
                throw null;
            }
            boolean z3 = j3.f7789u;
            j3.j0(j3.p, j3.f7786r, j3.f7785q);
            if (z3 && !j3.C && (q2 = j3.f7777I.f7797a.q()) != null) {
                q2.Q(false);
            }
        } finally {
            j3.f7778i = false;
        }
    }

    public final void O(boolean z3) {
        C0997t c0997t;
        if (this.f7716d || (c0997t = this.f7724l) == null) {
            return;
        }
        c0997t.z(this, true, z3);
    }

    public final void Q(boolean z3) {
        C0997t c0997t;
        if (this.f7716d || (c0997t = this.f7724l) == null) {
            return;
        }
        c0997t.z(this, false, z3);
    }

    public final void T() {
        K.d t3 = t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                D d3 = (D) objArr[i4];
                int i5 = d3.f7715H;
                d3.f7714G = i5;
                if (i5 != 3) {
                    d3.T();
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void U(M0.b bVar) {
        if (Z1.i.a(this.f7730s, bVar)) {
            return;
        }
        this.f7730s = bVar;
        y();
        D q2 = q();
        if (q2 != null) {
            q2.w();
        }
        x();
        for (U.k kVar = (U.k) this.f7735x.f2356f; kVar != null; kVar = kVar.f3308i) {
            if ((kVar.f3305f & 16) != 0) {
                ((l0) kVar).m();
            } else if (kVar instanceof Y.b) {
                ((Y.b) kVar).v0();
            }
        }
    }

    public final void V(D d3) {
        if (Z1.i.a(d3, this.f7718f)) {
            return;
        }
        this.f7718f = d3;
        if (d3 != null) {
            L l3 = this.f7736y;
            if (l3.f7814s == null) {
                l3.f7814s = new I(l3);
            }
            C0120t c0120t = this.f7735x;
            a0 a0Var = ((C0911t) c0120t.f2353c).p;
            for (a0 a0Var2 = (a0) c0120t.f2354d; !Z1.i.a(a0Var2, a0Var) && a0Var2 != null; a0Var2 = a0Var2.p) {
                a0Var2.w0();
            }
        }
        y();
    }

    public final void W(U.l lVar) {
        if (!(!this.f7716d || this.C == U.i.f3302a)) {
            AbstractC0381e.M("Modifiers are not supported on virtual LayoutNodes");
            throw null;
        }
        if (this.f7713F) {
            AbstractC0381e.M("modifier is updated when deactivated");
            throw null;
        }
        if (B()) {
            d(lVar);
        } else {
            this.D = lVar;
        }
    }

    public final void X() {
        if (this.f7719g <= 0 || !this.f7722j) {
            return;
        }
        int i3 = 0;
        this.f7722j = false;
        K.d dVar = this.f7721i;
        if (dVar == null) {
            dVar = new K.d(new D[16]);
            this.f7721i = dVar;
        }
        dVar.h();
        K.d dVar2 = (K.d) this.f7720h.f484e;
        int i4 = dVar2.f2642f;
        if (i4 > 0) {
            Object[] objArr = dVar2.f2640d;
            do {
                D d3 = (D) objArr[i3];
                if (d3.f7716d) {
                    dVar.c(dVar.f2642f, d3.t());
                } else {
                    dVar.b(d3);
                }
                i3++;
            } while (i3 < i4);
        }
        L l3 = this.f7736y;
        l3.f7813r.f7793y = true;
        I i5 = l3.f7814s;
        if (i5 != null) {
            i5.f7767v = true;
        }
    }

    @Override // I.InterfaceC0101j
    public final void a() {
        r0.w wVar = this.f7737z;
        if (wVar != null) {
            wVar.f(true);
        }
        this.f7713F = true;
        C0120t c0120t = this.f7735x;
        for (U.k kVar = (o0) c0120t.f2355e; kVar != null; kVar = kVar.f3307h) {
            if (kVar.p) {
                kVar.q0();
            }
        }
        U.k kVar2 = (o0) c0120t.f2355e;
        for (U.k kVar3 = kVar2; kVar3 != null; kVar3 = kVar3.f3307h) {
            if (kVar3.p) {
                kVar3.s0();
            }
        }
        while (kVar2 != null) {
            if (kVar2.p) {
                kVar2.m0();
            }
            kVar2 = kVar2.f3307h;
        }
        if (B()) {
            z();
        }
    }

    @Override // I.InterfaceC0101j
    public final void b() {
        if (!B()) {
            AbstractC0381e.M("onReuse is only expected on attached node");
            throw null;
        }
        r0.w wVar = this.f7737z;
        if (wVar != null) {
            wVar.f(false);
        }
        boolean z3 = this.f7713F;
        C0120t c0120t = this.f7735x;
        if (z3) {
            this.f7713F = false;
            z();
        } else {
            for (U.k kVar = (o0) c0120t.f2355e; kVar != null; kVar = kVar.f3307h) {
                if (kVar.p) {
                    kVar.q0();
                }
            }
            U.k kVar2 = (o0) c0120t.f2355e;
            for (U.k kVar3 = kVar2; kVar3 != null; kVar3 = kVar3.f3307h) {
                if (kVar3.p) {
                    kVar3.s0();
                }
            }
            while (kVar2 != null) {
                if (kVar2.p) {
                    kVar2.m0();
                }
                kVar2 = kVar2.f3307h;
            }
        }
        this.f7717e = z0.k.f8985a.addAndGet(1);
        for (U.k kVar4 = (U.k) c0120t.f2356f; kVar4 != null; kVar4 = kVar4.f3308i) {
            kVar4.l0();
        }
        c0120t.i();
        S(this);
    }

    @Override // I.InterfaceC0101j
    public final void c() {
        r0.w wVar = this.f7737z;
        if (wVar != null) {
            wVar.c();
        }
        C0120t c0120t = this.f7735x;
        a0 a0Var = ((C0911t) c0120t.f2353c).p;
        for (a0 a0Var2 = (a0) c0120t.f2354d; !Z1.i.a(a0Var2, a0Var) && a0Var2 != null; a0Var2 = a0Var2.p) {
            a0Var2.f7879r = true;
            a0Var2.f7874E.b();
            if (a0Var2.f7876G != null) {
                a0Var2.U0(null, false);
                a0Var2.f7877o.Q(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00be, code lost:
    
        if (r3 >= r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c0, code lost:
    
        if (r8 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c2, code lost:
    
        if (r4 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c6, code lost:
    
        if (r5.D == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c9, code lost:
    
        r6.j(r3, r8, r9, r4, r0 ^ 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d5, code lost:
    
        e2.AbstractC0381e.O("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:
    
        e2.AbstractC0381e.O("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00de, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0156  */
    /* JADX WARN: Type inference failed for: r1v14, types: [U.k] */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [I.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(U.l lVar) {
        W w3;
        ?? r12;
        this.C = lVar;
        ?? r6 = this.f7735x;
        U.k kVar = (U.k) r6.f2356f;
        U.k kVar2 = X.f7852a;
        if (kVar == kVar2) {
            AbstractC0381e.N("padChain called on already padded chain");
            throw null;
        }
        kVar.f3307h = kVar2;
        kVar2.f3308i = kVar;
        K.d dVar = (K.d) r6.f2357g;
        int i3 = dVar != null ? dVar.f2642f : 0;
        K.d dVar2 = (K.d) r6.f2358h;
        if (dVar2 == null) {
            dVar2 = new K.d(new U.j[16]);
        }
        K.d dVar3 = dVar2;
        int i4 = dVar3.f2642f;
        if (i4 < 16) {
            i4 = 16;
        }
        K.d dVar4 = new K.d(new U.l[i4]);
        dVar4.b(lVar);
        t.x xVar = null;
        while (dVar4.m()) {
            U.l lVar2 = (U.l) dVar4.o(dVar4.f2642f - 1);
            if (lVar2 instanceof U.f) {
                U.f fVar = (U.f) lVar2;
                dVar4.b(fVar.f3299b);
                dVar4.b(fVar.f3298a);
            } else if (lVar2 instanceof U.j) {
                dVar3.b(lVar2);
            } else {
                if (xVar == null) {
                    xVar = new t.x(2, dVar3);
                }
                lVar2.c(xVar);
                xVar = xVar;
            }
        }
        int i5 = dVar3.f2642f;
        o0 o0Var = (o0) r6.f2355e;
        D d3 = (D) r6.f2352b;
        if (i5 == i3) {
            U.k kVar3 = kVar2.f3308i;
            int i6 = 0;
            while (true) {
                if (kVar3 == null || i6 >= i3) {
                    break;
                }
                if (dVar == null) {
                    AbstractC0381e.O("expected prior modifier list to be non-empty");
                    throw null;
                }
                U.j jVar = (U.j) dVar.f2640d[i6];
                U.j jVar2 = (U.j) dVar3.f2640d[i6];
                char c3 = Z1.i.a(jVar, jVar2) ? (char) 2 : U.m.a(jVar, jVar2) ? (char) 1 : (char) 0;
                if (c3 == 0) {
                    kVar3 = kVar3.f3307h;
                    break;
                }
                if (c3 == 1) {
                    C0120t.l(jVar, jVar2, kVar3);
                }
                kVar3 = kVar3.f3308i;
                i6++;
            }
        } else {
            U.l lVar3 = d3.D;
            if (lVar3 != null && i3 == 0) {
                for (int i7 = 0; i7 < dVar3.f2642f; i7++) {
                    kVar2 = C0120t.b((U.j) dVar3.f2640d[i7], kVar2);
                }
                for (U.k kVar4 = o0Var.f3307h; kVar4 != null && kVar4 != X.f7852a; kVar4 = kVar4.f3307h) {
                    r0 |= kVar4.f3305f;
                    kVar4.f3306g = r0;
                }
            } else {
                if (i5 == 0) {
                    if (dVar == null) {
                        AbstractC0381e.O("expected prior modifier list to be non-empty");
                        throw null;
                    }
                    U.k kVar5 = kVar2.f3308i;
                    for (int i8 = 0; kVar5 != null && i8 < dVar.f2642f; i8++) {
                        kVar5 = C0120t.c(kVar5).f3308i;
                    }
                    D q2 = d3.q();
                    C0911t c0911t = q2 != null ? (C0911t) q2.f7735x.f2353c : null;
                    C0911t c0911t2 = (C0911t) r6.f2353c;
                    c0911t2.f7878q = c0911t;
                    r6.f2354d = c0911t2;
                    r6.f2357g = dVar3;
                    if (dVar == null) {
                        dVar.h();
                    } else {
                        dVar = null;
                    }
                    r6.f2358h = dVar;
                    w3 = X.f7852a;
                    r12 = w3.f3308i;
                    if (r12 != 0) {
                        o0Var = r12;
                    }
                    o0Var.f3307h = null;
                    w3.f3308i = null;
                    w3.f3306g = -1;
                    w3.f3310k = null;
                    if (o0Var != w3) {
                        AbstractC0381e.N("trimChain did not update the head");
                        throw null;
                    }
                    r6.f2356f = o0Var;
                    if (r0 != 0) {
                        r6.k();
                    }
                    this.f7736y.h();
                    if (this.f7718f == null && r6.f(512)) {
                        V(this);
                        return;
                    }
                    return;
                }
                if (dVar == null) {
                    dVar = new K.d(new U.j[16]);
                }
                r6.j(0, dVar, dVar3, kVar2, (lVar3 != null ? 1 : 0) ^ 1);
            }
            r0 = 1;
            r6.f2357g = dVar3;
            if (dVar == null) {
            }
            r6.f2358h = dVar;
            w3 = X.f7852a;
            r12 = w3.f3308i;
            if (r12 != 0) {
            }
            o0Var.f3307h = null;
            w3.f3308i = null;
            w3.f3306g = -1;
            w3.f3310k = null;
            if (o0Var != w3) {
            }
        }
    }

    public final void e(C0997t c0997t) {
        D d3;
        if (!(this.f7724l == null)) {
            AbstractC0381e.N("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
            throw null;
        }
        D d4 = this.f7723k;
        if (d4 != null && !Z1.i.a(d4.f7724l, c0997t)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(c0997t);
            sb.append(") than the parent's owner(");
            D q2 = q();
            sb.append(q2 != null ? q2.f7724l : null);
            sb.append("). This tree: ");
            sb.append(h(0));
            sb.append(" Parent tree: ");
            D d5 = this.f7723k;
            sb.append(d5 != null ? d5.h(0) : null);
            AbstractC0381e.N(sb.toString());
            throw null;
        }
        D q3 = q();
        L l3 = this.f7736y;
        if (q3 == null) {
            l3.f7813r.f7789u = true;
            I i3 = l3.f7814s;
            if (i3 != null) {
                i3.f7764s = true;
            }
        }
        C0120t c0120t = this.f7735x;
        ((a0) c0120t.f2354d).f7878q = q3 != null ? (C0911t) q3.f7735x.f2353c : null;
        this.f7724l = c0997t;
        this.f7725m = (q3 != null ? q3.f7725m : -1) + 1;
        U.l lVar = this.D;
        if (lVar != null) {
            d(lVar);
        }
        this.D = null;
        if (c0120t.f(8)) {
            z();
        }
        c0997t.getClass();
        D d6 = this.f7723k;
        if (d6 == null || (d3 = d6.f7718f) == null) {
            d3 = this.f7718f;
        }
        V(d3);
        if (this.f7718f == null && c0120t.f(512)) {
            V(this);
        }
        if (!this.f7713F) {
            for (U.k kVar = (U.k) c0120t.f2356f; kVar != null; kVar = kVar.f3308i) {
                kVar.l0();
            }
        }
        K.d dVar = (K.d) this.f7720h.f484e;
        int i4 = dVar.f2642f;
        if (i4 > 0) {
            Object[] objArr = dVar.f2640d;
            int i5 = 0;
            do {
                ((D) objArr[i5]).e(c0997t);
                i5++;
            } while (i5 < i4);
        }
        if (!this.f7713F) {
            c0120t.i();
        }
        y();
        if (q3 != null) {
            q3.y();
        }
        a0 a0Var = ((C0911t) c0120t.f2353c).p;
        for (a0 a0Var2 = (a0) c0120t.f2354d; !Z1.i.a(a0Var2, a0Var) && a0Var2 != null; a0Var2 = a0Var2.p) {
            a0Var2.U0(a0Var2.f7881t, true);
            f0 f0Var = a0Var2.f7876G;
            if (f0Var != null) {
                f0Var.invalidate();
            }
        }
        l3.h();
        if (this.f7713F) {
            return;
        }
        U.k kVar2 = (U.k) c0120t.f2356f;
        if ((kVar2.f3306g & 7168) != 0) {
            while (kVar2 != null) {
                int i6 = kVar2.f3305f;
                if (((i6 & 4096) != 0) | ((i6 & 1024) != 0) | ((i6 & 2048) != 0)) {
                    b0.a(kVar2);
                }
                kVar2 = kVar2.f3308i;
            }
        }
    }

    public final void f() {
        this.f7715H = this.f7714G;
        this.f7714G = 3;
        K.d t3 = t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                D d3 = (D) objArr[i4];
                if (d3.f7714G != 3) {
                    d3.f();
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void g() {
        this.f7715H = this.f7714G;
        this.f7714G = 3;
        K.d t3 = t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                D d3 = (D) objArr[i4];
                if (d3.f7714G == 2) {
                    d3.g();
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final String h(int i3) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        K.d t3 = t();
        int i5 = t3.f2642f;
        if (i5 > 0) {
            Object[] objArr = t3.f2640d;
            int i6 = 0;
            do {
                sb.append(((D) objArr[i6]).h(i3 + 1));
                i6++;
            } while (i6 < i5);
        }
        String sb2 = sb.toString();
        if (i3 != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void i() {
        E e3;
        C0997t c0997t = this.f7724l;
        if (c0997t == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            D q2 = q();
            sb.append(q2 != null ? q2.h(0) : null);
            AbstractC0381e.O(sb.toString());
            throw null;
        }
        D q3 = q();
        L l3 = this.f7736y;
        if (q3 != null) {
            q3.w();
            q3.y();
            l3.f7813r.f7783n = 3;
            I i3 = l3.f7814s;
            if (i3 != null) {
                i3.f7758l = 3;
            }
        }
        E e4 = l3.f7813r.f7791w;
        e4.f7739b = true;
        e4.f7740c = false;
        e4.f7742e = false;
        e4.f7741d = false;
        e4.f7743f = false;
        e4.f7744g = false;
        e4.f7745h = null;
        I i4 = l3.f7814s;
        if (i4 != null && (e3 = i4.f7765t) != null) {
            e3.f7739b = true;
            e3.f7740c = false;
            e3.f7742e = false;
            e3.f7741d = false;
            e3.f7743f = false;
            e3.f7744g = false;
            e3.f7745h = null;
        }
        C0120t c0120t = this.f7735x;
        if (c0120t.f(8)) {
            z();
        }
        U.k kVar = (o0) c0120t.f2355e;
        for (U.k kVar2 = kVar; kVar2 != null; kVar2 = kVar2.f3307h) {
            if (kVar2.p) {
                kVar2.s0();
            }
        }
        this.f7726n = true;
        K.d dVar = (K.d) this.f7720h.f484e;
        int i5 = dVar.f2642f;
        if (i5 > 0) {
            Object[] objArr = dVar.f2640d;
            int i6 = 0;
            do {
                ((D) objArr[i6]).i();
                i6++;
            } while (i6 < i5);
        }
        this.f7726n = false;
        while (kVar != null) {
            if (kVar.p) {
                kVar.m0();
            }
            kVar = kVar.f3307h;
        }
        S s3 = c0997t.f8416J;
        C2.c cVar = s3.f7838b;
        ((C2.c) cVar.f484e).o(this);
        ((C2.c) cVar.f485f).o(this);
        ((K.d) s3.f7841e.f484e).n(this);
        c0997t.B = true;
        this.f7724l = null;
        V(null);
        this.f7725m = 0;
        J j3 = l3.f7813r;
        j3.f7780k = Integer.MAX_VALUE;
        j3.f7779j = Integer.MAX_VALUE;
        j3.f7789u = false;
        I i7 = l3.f7814s;
        if (i7 != null) {
            i7.f7757k = Integer.MAX_VALUE;
            i7.f7756j = Integer.MAX_VALUE;
            i7.f7764s = false;
        }
    }

    public final void j(InterfaceC0285r interfaceC0285r, C0336b c0336b) {
        ((a0) this.f7735x.f2354d).t0(interfaceC0285r, c0336b);
    }

    public final void k() {
        if (this.f7718f != null) {
            P(this, false, 5);
        } else {
            R(this, false, 5);
        }
        J j3 = this.f7736y.f7813r;
        M0.a aVar = j3.f7781l ? new M0.a(j3.f7117g) : null;
        if (aVar != null) {
            C0997t c0997t = this.f7724l;
            if (c0997t != null) {
                c0997t.t(this, aVar.f2760a);
                return;
            }
            return;
        }
        C0997t c0997t2 = this.f7724l;
        if (c0997t2 != null) {
            c0997t2.s(true);
        }
    }

    public final List l() {
        I i3 = this.f7736y.f7814s;
        Z1.i.c(i3);
        L l3 = i3.f7754A;
        l3.f7797a.m();
        boolean z3 = i3.f7767v;
        K.d dVar = i3.f7766u;
        if (!z3) {
            return dVar.g();
        }
        D d3 = l3.f7797a;
        K.d t3 = d3.t();
        int i4 = t3.f2642f;
        if (i4 > 0) {
            Object[] objArr = t3.f2640d;
            int i5 = 0;
            do {
                D d4 = (D) objArr[i5];
                if (dVar.f2642f <= i5) {
                    I i6 = d4.f7736y.f7814s;
                    Z1.i.c(i6);
                    dVar.b(i6);
                } else {
                    I i7 = d4.f7736y.f7814s;
                    Z1.i.c(i7);
                    Object[] objArr2 = dVar.f2640d;
                    Object obj = objArr2[i5];
                    objArr2[i5] = i7;
                }
                i5++;
            } while (i5 < i4);
        }
        dVar.p(((K.a) d3.m()).f2634d.f2642f, dVar.f2642f);
        i3.f7767v = false;
        return dVar.g();
    }

    public final List m() {
        return t().g();
    }

    public final z0.i n() {
        if (!B() || this.f7713F) {
            return null;
        }
        if (!this.f7735x.f(8) || this.f7727o != null) {
            return this.f7727o;
        }
        Z1.t tVar = new Z1.t();
        tVar.f3480d = new z0.i();
        i0 snapshotObserver = ((C0997t) G.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f7928d, new C0125v0(this, 8, tVar));
        z0.i iVar = (z0.i) tVar.f3480d;
        this.f7727o = iVar;
        return iVar;
    }

    public final List o() {
        return ((K.d) this.f7720h.f484e).g();
    }

    public final int p() {
        int i3;
        I i4 = this.f7736y.f7814s;
        if (i4 == null || (i3 = i4.f7758l) == 0) {
            return 3;
        }
        return i3;
    }

    public final D q() {
        D d3 = this.f7723k;
        while (d3 != null && d3.f7716d) {
            d3 = d3.f7723k;
        }
        return d3;
    }

    public final int r() {
        return this.f7736y.f7813r.f7780k;
    }

    public final K.d s() {
        boolean z3 = this.f7728q;
        K.d dVar = this.p;
        if (z3) {
            dVar.h();
            dVar.c(dVar.f2642f, t());
            dVar.q(f7710K);
            this.f7728q = false;
        }
        return dVar;
    }

    public final K.d t() {
        X();
        if (this.f7719g == 0) {
            return (K.d) this.f7720h.f484e;
        }
        K.d dVar = this.f7721i;
        Z1.i.c(dVar);
        return dVar;
    }

    public final String toString() {
        return u0.L.v(this) + " children: " + ((K.a) m()).f2634d.f2642f + " measurePolicy: " + this.f7729r;
    }

    public final void u(long j3, r rVar, boolean z3, boolean z4) {
        C0120t c0120t = this.f7735x;
        a0 a0Var = (a0) c0120t.f2354d;
        C0261L c0261l = a0.f7869H;
        ((a0) c0120t.f2354d).F0(a0.f7871J, a0Var.y0(j3, true), rVar, z3, z4);
    }

    public final void v(int i3, D d3) {
        if (!(d3.f7723k == null)) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(d3);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(h(0));
            sb.append(" Other tree: ");
            D d4 = d3.f7723k;
            sb.append(d4 != null ? d4.h(0) : null);
            AbstractC0381e.N(sb.toString());
            throw null;
        }
        if (d3.f7724l != null) {
            AbstractC0381e.N("Cannot insert " + d3 + " because it already has an owner. This tree: " + h(0) + " Other tree: " + d3.h(0));
            throw null;
        }
        d3.f7723k = this;
        C2.c cVar = this.f7720h;
        ((K.d) cVar.f484e).a(i3, d3);
        ((r1.r) cVar.f485f).b();
        I();
        if (d3.f7716d) {
            this.f7719g++;
        }
        A();
        C0997t c0997t = this.f7724l;
        if (c0997t != null) {
            d3.e(c0997t);
        }
        if (d3.f7736y.f7810n > 0) {
            L l3 = this.f7736y;
            l3.b(l3.f7810n + 1);
        }
    }

    public final void w() {
        if (this.B) {
            C0120t c0120t = this.f7735x;
            a0 a0Var = (C0911t) c0120t.f2353c;
            a0 a0Var2 = ((a0) c0120t.f2354d).f7878q;
            this.f7711A = null;
            while (true) {
                if (Z1.i.a(a0Var, a0Var2)) {
                    break;
                }
                if ((a0Var != null ? a0Var.f7876G : null) != null) {
                    this.f7711A = a0Var;
                    break;
                }
                a0Var = a0Var != null ? a0Var.f7878q : null;
            }
        }
        a0 a0Var3 = this.f7711A;
        if (a0Var3 != null && a0Var3.f7876G == null) {
            AbstractC0381e.O("layer was not set");
            throw null;
        }
        if (a0Var3 != null) {
            a0Var3.H0();
            return;
        }
        D q2 = q();
        if (q2 != null) {
            q2.w();
        }
    }

    public final void x() {
        C0120t c0120t = this.f7735x;
        a0 a0Var = (a0) c0120t.f2354d;
        C0911t c0911t = (C0911t) c0120t.f2353c;
        while (a0Var != c0911t) {
            Z1.i.d(a0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C0916y c0916y = (C0916y) a0Var;
            f0 f0Var = c0916y.f7876G;
            if (f0Var != null) {
                f0Var.invalidate();
            }
            a0Var = c0916y.p;
        }
        f0 f0Var2 = ((C0911t) c0120t.f2353c).f7876G;
        if (f0Var2 != null) {
            f0Var2.invalidate();
        }
    }

    public final void y() {
        if (this.f7718f != null) {
            P(this, false, 7);
        } else {
            R(this, false, 7);
        }
    }

    public final void z() {
        this.f7727o = null;
        ((C0997t) G.a(this)).A();
    }

    public D(int i3, boolean z3) {
        this.f7716d = z3;
        this.f7717e = i3;
        this.f7720h = new C2.c(new K.d(new D[16]), 11, new r1.r(2, this));
        this.p = new K.d(new D[16]);
        this.f7728q = true;
        this.f7729r = f7708I;
        this.f7730s = G.f7750a;
        this.f7731t = M0.j.f2775d;
        this.f7732u = f7709J;
        InterfaceC0126w.f2390a.getClass();
        this.f7733v = C0124v.f2386b;
        this.f7714G = 3;
        this.f7715H = 3;
        this.f7735x = new C0120t(this);
        this.f7736y = new L(this);
        this.B = true;
        this.C = U.i.f3302a;
    }
}
