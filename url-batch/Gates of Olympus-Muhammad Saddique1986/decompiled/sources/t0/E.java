package t0;

import I.C0156j0;
import I.C0174t;
import I.C0178v;
import I.InterfaceC0155j;
import I.InterfaceC0180w;
import e0.C0416b;
import java.util.List;
import m.AbstractC0625j;
import n.z0;
import r0.C0881C;
import r0.C0929z;
import r0.InterfaceC0885G;
import u0.C1123s;
import u0.O0;
import z.C1256t;

/* loaded from: classes.dex */
public final class E implements InterfaceC0155j, i0, InterfaceC0997j {

    /* renamed from: J, reason: collision with root package name */
    public static final C0987A f8530J = new C0987A("Undefined intrinsics block and it is required");

    /* renamed from: K, reason: collision with root package name */
    public static final C1012z f8531K = new C1012z();

    /* renamed from: L, reason: collision with root package name */
    public static final D0.u f8532L = new D0.u(3);

    /* renamed from: A, reason: collision with root package name */
    public C0881C f8533A;

    /* renamed from: B, reason: collision with root package name */
    public b0 f8534B;
    public boolean C;
    public U.q D;

    /* renamed from: E, reason: collision with root package name */
    public U.q f8535E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8536F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f8537G;

    /* renamed from: H, reason: collision with root package name */
    public int f8538H;

    /* renamed from: I, reason: collision with root package name */
    public int f8539I;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8540d;

    /* renamed from: e, reason: collision with root package name */
    public int f8541e;

    /* renamed from: f, reason: collision with root package name */
    public E f8542f;

    /* renamed from: g, reason: collision with root package name */
    public int f8543g;

    /* renamed from: h, reason: collision with root package name */
    public final C1256t f8544h;

    /* renamed from: i, reason: collision with root package name */
    public K.d f8545i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8546j;

    /* renamed from: k, reason: collision with root package name */
    public E f8547k;

    /* renamed from: l, reason: collision with root package name */
    public C1123s f8548l;

    /* renamed from: m, reason: collision with root package name */
    public int f8549m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8550n;

    /* renamed from: o, reason: collision with root package name */
    public A0.i f8551o;

    /* renamed from: p, reason: collision with root package name */
    public final K.d f8552p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8553q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0885G f8554r;

    /* renamed from: s, reason: collision with root package name */
    public C1256t f8555s;

    /* renamed from: t, reason: collision with root package name */
    public O0.b f8556t;

    /* renamed from: u, reason: collision with root package name */
    public O0.k f8557u;

    /* renamed from: v, reason: collision with root package name */
    public O0 f8558v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0180w f8559w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8560x;

    /* renamed from: y, reason: collision with root package name */
    public final C0174t f8561y;

    /* renamed from: z, reason: collision with root package name */
    public final M f8562z;

    public E(int i3, int i4, boolean z3) {
        this(A0.k.f132a.addAndGet(1), (i3 & 1) != 0 ? false : z3);
    }

    public static boolean M(E e3) {
        K k3 = e3.f8562z.f8642r;
        return e3.K(k3.f8608l ? new O0.a(k3.f8129g) : null);
    }

    public static void R(E e3, boolean z3, int i3) {
        E s3;
        if ((i3 & 1) != 0) {
            z3 = false;
        }
        boolean z4 = (i3 & 2) != 0;
        boolean z5 = (i3 & 4) != 0;
        if (e3.f8542f == null) {
            z0.o("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
            throw null;
        }
        C1123s c1123s = e3.f8548l;
        if (c1123s == null || e3.f8550n || e3.f8540d) {
            return;
        }
        c1123s.y(e3, true, z3, z4);
        if (z5) {
            J j3 = e3.f8562z.f8643s;
            f2.j.c(j3);
            M m3 = j3.f8579A;
            E s4 = m3.f8625a.s();
            int i4 = m3.f8625a.f8538H;
            if (s4 == null || i4 == 3) {
                return;
            }
            while (s4.f8538H == i4 && (s3 = s4.s()) != null) {
                s4 = s3;
            }
            int b3 = AbstractC0625j.b(i4);
            if (b3 == 0) {
                if (s4.f8542f != null) {
                    R(s4, z3, 6);
                    return;
                } else {
                    T(s4, z3, 6);
                    return;
                }
            }
            if (b3 != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (s4.f8542f != null) {
                s4.Q(z3);
            } else {
                s4.S(z3);
            }
        }
    }

    public static void T(E e3, boolean z3, int i3) {
        C1123s c1123s;
        E s3;
        if ((i3 & 1) != 0) {
            z3 = false;
        }
        boolean z4 = (i3 & 2) != 0;
        boolean z5 = (i3 & 4) != 0;
        if (e3.f8550n || e3.f8540d || (c1123s = e3.f8548l) == null) {
            return;
        }
        c1123s.y(e3, false, z3, z4);
        if (z5) {
            M m3 = e3.f8562z.f8642r.f8604I;
            E s4 = m3.f8625a.s();
            int i4 = m3.f8625a.f8538H;
            if (s4 == null || i4 == 3) {
                return;
            }
            while (s4.f8538H == i4 && (s3 = s4.s()) != null) {
                s4 = s3;
            }
            int b3 = AbstractC0625j.b(i4);
            if (b3 == 0) {
                T(s4, z3, 6);
            } else {
                if (b3 != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                s4.S(z3);
            }
        }
    }

    public static void U(E e3) {
        int i3 = C.f8527a[AbstractC0625j.b(e3.f8562z.f8627c)];
        M m3 = e3.f8562z;
        if (i3 != 1) {
            throw new IllegalStateException("Unexpected state ".concat(A.k.v(m3.f8627c)));
        }
        if (m3.f8631g) {
            R(e3, true, 6);
            return;
        }
        if (m3.f8632h) {
            e3.Q(true);
        }
        if (m3.f8628d) {
            T(e3, true, 6);
        } else if (m3.f8629e) {
            e3.S(true);
        }
    }

    public final void A() {
        if (this.f8542f != null) {
            R(this, false, 7);
        } else {
            T(this, false, 7);
        }
    }

    public final void B() {
        this.f8551o = null;
        ((C1123s) H.a(this)).A();
    }

    public final void C() {
        E e3;
        if (this.f8543g > 0) {
            this.f8546j = true;
        }
        if (!this.f8540d || (e3 = this.f8547k) == null) {
            return;
        }
        e3.C();
    }

    public final boolean D() {
        return this.f8548l != null;
    }

    public final boolean E() {
        return this.f8562z.f8642r.f8617u;
    }

    public final Boolean F() {
        J j3 = this.f8562z.f8643s;
        if (j3 != null) {
            return Boolean.valueOf(j3.f8590s);
        }
        return null;
    }

    public final void G() {
        E s3;
        if (this.f8538H == 3) {
            g();
        }
        J j3 = this.f8562z.f8643s;
        f2.j.c(j3);
        try {
            j3.f8580i = true;
            if (!j3.f8585n) {
                z0.o("replace() called on item that was not placed");
                throw null;
            }
            j3.f8597z = false;
            boolean z3 = j3.f8590s;
            j3.s0(j3.f8588q, j3.f8589r);
            if (z3 && !j3.f8597z && (s3 = j3.f8579A.f8625a.s()) != null) {
                s3.Q(false);
            }
        } finally {
            j3.f8580i = false;
        }
    }

    public final void H(int i3, int i4, int i5) {
        if (i3 == i4) {
            return;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = i3 > i4 ? i3 + i6 : i3;
            int i8 = i3 > i4 ? i4 + i6 : (i4 + i5) - 2;
            C1256t c1256t = this.f8544h;
            Object o3 = ((K.d) c1256t.f10466e).o(i7);
            D d3 = (D) c1256t.f10467f;
            d3.b();
            ((K.d) c1256t.f10466e).a(i8, (E) o3);
            d3.b();
        }
        J();
        C();
        A();
    }

    public final void I(E e3) {
        if (e3.f8562z.f8638n > 0) {
            this.f8562z.b(r0.f8638n - 1);
        }
        if (this.f8548l != null) {
            e3.i();
        }
        e3.f8547k = null;
        ((b0) e3.f8561y.f2913d).f8713q = null;
        if (e3.f8540d) {
            this.f8543g--;
            K.d dVar = (K.d) e3.f8544h.f10466e;
            int i3 = dVar.f3216f;
            if (i3 > 0) {
                Object[] objArr = dVar.f3214d;
                int i4 = 0;
                do {
                    ((b0) ((E) objArr[i4]).f8561y.f2913d).f8713q = null;
                    i4++;
                } while (i4 < i3);
            }
        }
        C();
        J();
    }

    public final void J() {
        if (!this.f8540d) {
            this.f8553q = true;
            return;
        }
        E s3 = s();
        if (s3 != null) {
            s3.J();
        }
    }

    public final boolean K(O0.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (this.f8538H == 3) {
            f();
        }
        return this.f8562z.f8642r.u0(aVar.f3725a);
    }

    @Override // t0.i0
    public final boolean L() {
        return D();
    }

    public final void N() {
        C1256t c1256t = this.f8544h;
        int i3 = ((K.d) c1256t.f10466e).f3216f;
        while (true) {
            i3--;
            K.d dVar = (K.d) c1256t.f10466e;
            if (-1 >= i3) {
                dVar.h();
                ((D) c1256t.f10467f).b();
                return;
            }
            I((E) dVar.f3214d[i3]);
        }
    }

    public final void O(int i3, int i4) {
        if (i4 < 0) {
            z0.n("count (" + i4 + ") must be greater than 0");
            throw null;
        }
        int i5 = (i4 + i3) - 1;
        if (i3 > i5) {
            return;
        }
        while (true) {
            C1256t c1256t = this.f8544h;
            I((E) ((K.d) c1256t.f10466e).f3214d[i5]);
            Object o3 = ((K.d) c1256t.f10466e).o(i5);
            ((D) c1256t.f10467f).b();
            if (i5 == i3) {
                return;
            } else {
                i5--;
            }
        }
    }

    public final void P() {
        E s3;
        if (this.f8538H == 3) {
            g();
        }
        K k3 = this.f8562z.f8642r;
        k3.getClass();
        try {
            k3.f8605i = true;
            if (!k3.f8609m) {
                z0.o("replace called on unplaced item");
                throw null;
            }
            boolean z3 = k3.f8617u;
            k3.t0(k3.f8612p, k3.f8614r, k3.f8613q);
            if (z3 && !k3.C && (s3 = k3.f8604I.f8625a.s()) != null) {
                s3.S(false);
            }
        } finally {
            k3.f8605i = false;
        }
    }

    public final void Q(boolean z3) {
        C1123s c1123s;
        if (this.f8540d || (c1123s = this.f8548l) == null) {
            return;
        }
        c1123s.z(this, true, z3);
    }

    public final void S(boolean z3) {
        C1123s c1123s;
        if (this.f8540d || (c1123s = this.f8548l) == null) {
            return;
        }
        c1123s.z(this, false, z3);
    }

    public final void V() {
        K.d v3 = v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                E e3 = (E) objArr[i4];
                int i5 = e3.f8539I;
                e3.f8538H = i5;
                if (i5 != 3) {
                    e3.V();
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void W(O0.b bVar) {
        if (f2.j.a(this.f8556t, bVar)) {
            return;
        }
        this.f8556t = bVar;
        A();
        E s3 = s();
        if (s3 != null) {
            s3.y();
        }
        z();
        for (U.p pVar = (U.p) this.f8561y.f2915f; pVar != null; pVar = pVar.f4494i) {
            if ((pVar.f4491f & 16) != 0) {
                ((m0) pVar).n();
            } else if (pVar instanceof Y.b) {
                ((Y.b) pVar).y0();
            }
        }
    }

    public final void X(E e3) {
        if (f2.j.a(e3, this.f8542f)) {
            return;
        }
        this.f8542f = e3;
        if (e3 != null) {
            M m3 = this.f8562z;
            if (m3.f8643s == null) {
                m3.f8643s = new J(m3);
            }
            C0174t c0174t = this.f8561y;
            b0 b0Var = ((C1006t) c0174t.f2912c).f8712p;
            for (b0 b0Var2 = (b0) c0174t.f2913d; !f2.j.a(b0Var2, b0Var) && b0Var2 != null; b0Var2 = b0Var2.f8712p) {
                b0Var2.F0();
            }
        }
        A();
    }

    public final void Y(InterfaceC0885G interfaceC0885G) {
        if (f2.j.a(this.f8554r, interfaceC0885G)) {
            return;
        }
        this.f8554r = interfaceC0885G;
        C1256t c1256t = this.f8555s;
        if (c1256t != null) {
            ((C0156j0) c1256t.f10467f).setValue(interfaceC0885G);
        }
        A();
    }

    public final void Z(U.q qVar) {
        if (!(!this.f8540d || this.D == U.n.f4488a)) {
            z0.n("Modifiers are not supported on virtual LayoutNodes");
            throw null;
        }
        if (this.f8537G) {
            z0.n("modifier is updated when deactivated");
            throw null;
        }
        if (D()) {
            d(qVar);
        } else {
            this.f8535E = qVar;
        }
    }

    @Override // I.InterfaceC0155j
    public final void a() {
        C0881C c0881c = this.f8533A;
        if (c0881c != null) {
            c0881c.f(true);
        }
        this.f8537G = true;
        C0174t c0174t = this.f8561y;
        for (U.p pVar = (p0) c0174t.f2914e; pVar != null; pVar = pVar.f4493h) {
            if (pVar.f4501p) {
                pVar.t0();
            }
        }
        U.p pVar2 = (p0) c0174t.f2914e;
        for (U.p pVar3 = pVar2; pVar3 != null; pVar3 = pVar3.f4493h) {
            if (pVar3.f4501p) {
                pVar3.v0();
            }
        }
        while (pVar2 != null) {
            if (pVar2.f4501p) {
                pVar2.p0();
            }
            pVar2 = pVar2.f4493h;
        }
        if (D()) {
            B();
        }
    }

    public final void a0() {
        if (this.f8543g <= 0 || !this.f8546j) {
            return;
        }
        int i3 = 0;
        this.f8546j = false;
        K.d dVar = this.f8545i;
        if (dVar == null) {
            dVar = new K.d(new E[16]);
            this.f8545i = dVar;
        }
        dVar.h();
        K.d dVar2 = (K.d) this.f8544h.f10466e;
        int i4 = dVar2.f3216f;
        if (i4 > 0) {
            Object[] objArr = dVar2.f3214d;
            do {
                E e3 = (E) objArr[i3];
                if (e3.f8540d) {
                    dVar.c(dVar.f3216f, e3.v());
                } else {
                    dVar.b(e3);
                }
                i3++;
            } while (i3 < i4);
        }
        M m3 = this.f8562z;
        m3.f8642r.f8621y = true;
        J j3 = m3.f8643s;
        if (j3 != null) {
            j3.f8593v = true;
        }
    }

    @Override // I.InterfaceC0155j
    public final void b() {
        if (!D()) {
            z0.n("onReuse is only expected on attached node");
            throw null;
        }
        C0881C c0881c = this.f8533A;
        if (c0881c != null) {
            c0881c.f(false);
        }
        boolean z3 = this.f8537G;
        C0174t c0174t = this.f8561y;
        if (z3) {
            this.f8537G = false;
            B();
        } else {
            for (U.p pVar = (p0) c0174t.f2914e; pVar != null; pVar = pVar.f4493h) {
                if (pVar.f4501p) {
                    pVar.t0();
                }
            }
            U.p pVar2 = (p0) c0174t.f2914e;
            for (U.p pVar3 = pVar2; pVar3 != null; pVar3 = pVar3.f4493h) {
                if (pVar3.f4501p) {
                    pVar3.v0();
                }
            }
            while (pVar2 != null) {
                if (pVar2.f4501p) {
                    pVar2.p0();
                }
                pVar2 = pVar2.f4493h;
            }
        }
        this.f8541e = A0.k.f132a.addAndGet(1);
        for (U.p pVar4 = (U.p) c0174t.f2915f; pVar4 != null; pVar4 = pVar4.f4494i) {
            pVar4.o0();
        }
        c0174t.i();
        U(this);
    }

    @Override // I.InterfaceC0155j
    public final void c() {
        C0881C c0881c = this.f8533A;
        if (c0881c != null) {
            c0881c.c();
        }
        C0174t c0174t = this.f8561y;
        b0 b0Var = ((C1006t) c0174t.f2912c).f8712p;
        for (b0 b0Var2 = (b0) c0174t.f2913d; !f2.j.a(b0Var2, b0Var) && b0Var2 != null; b0Var2 = b0Var2.f8712p) {
            b0Var2.f8714r = true;
            b0Var2.f8708E.b();
            if (b0Var2.f8710G != null) {
                b0Var2.f1(null, false);
                b0Var2.f8711o.S(false);
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
    
        if (r5.f8535E == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c9, code lost:
    
        r6.j(r3, r8, r9, r4, r0 ^ 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d5, code lost:
    
        n.z0.p("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:
    
        n.z0.p("expected prior modifier list to be non-empty");
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
    /* JADX WARN: Type inference failed for: r1v14, types: [U.p] */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [I.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(U.q qVar) {
        X x3;
        ?? r12;
        this.D = qVar;
        ?? r6 = this.f8561y;
        U.p pVar = (U.p) r6.f2915f;
        U.p pVar2 = Y.f8682a;
        if (pVar == pVar2) {
            z0.o("padChain called on already padded chain");
            throw null;
        }
        pVar.f4493h = pVar2;
        pVar2.f4494i = pVar;
        K.d dVar = (K.d) r6.f2916g;
        int i3 = dVar != null ? dVar.f3216f : 0;
        K.d dVar2 = (K.d) r6.f2917h;
        if (dVar2 == null) {
            dVar2 = new K.d(new U.o[16]);
        }
        K.d dVar3 = dVar2;
        int i4 = dVar3.f3216f;
        if (i4 < 16) {
            i4 = 16;
        }
        K.d dVar4 = new K.d(new U.q[i4]);
        dVar4.b(qVar);
        C0929z c0929z = null;
        while (dVar4.m()) {
            U.q qVar2 = (U.q) dVar4.o(dVar4.f3216f - 1);
            if (qVar2 instanceof U.k) {
                U.k kVar = (U.k) qVar2;
                dVar4.b(kVar.f4485b);
                dVar4.b(kVar.f4484a);
            } else if (qVar2 instanceof U.o) {
                dVar3.b(qVar2);
            } else {
                if (c0929z == null) {
                    c0929z = new C0929z(5, dVar3);
                }
                qVar2.d(c0929z);
                c0929z = c0929z;
            }
        }
        int i5 = dVar3.f3216f;
        p0 p0Var = (p0) r6.f2914e;
        E e3 = (E) r6.f2911b;
        if (i5 == i3) {
            U.p pVar3 = pVar2.f4494i;
            int i6 = 0;
            while (true) {
                if (pVar3 == null || i6 >= i3) {
                    break;
                }
                if (dVar == null) {
                    z0.p("expected prior modifier list to be non-empty");
                    throw null;
                }
                U.o oVar = (U.o) dVar.f3214d[i6];
                U.o oVar2 = (U.o) dVar3.f3214d[i6];
                char c2 = f2.j.a(oVar, oVar2) ? (char) 2 : U.a.a(oVar, oVar2) ? (char) 1 : (char) 0;
                if (c2 == 0) {
                    pVar3 = pVar3.f4493h;
                    break;
                }
                if (c2 == 1) {
                    C0174t.l(oVar, oVar2, pVar3);
                }
                pVar3 = pVar3.f4494i;
                i6++;
            }
        } else {
            U.q qVar3 = e3.f8535E;
            if (qVar3 != null && i3 == 0) {
                for (int i7 = 0; i7 < dVar3.f3216f; i7++) {
                    pVar2 = C0174t.b((U.o) dVar3.f3214d[i7], pVar2);
                }
                for (U.p pVar4 = p0Var.f4493h; pVar4 != null && pVar4 != Y.f8682a; pVar4 = pVar4.f4493h) {
                    r0 |= pVar4.f4491f;
                    pVar4.f4492g = r0;
                }
            } else {
                if (i5 == 0) {
                    if (dVar == null) {
                        z0.p("expected prior modifier list to be non-empty");
                        throw null;
                    }
                    U.p pVar5 = pVar2.f4494i;
                    for (int i8 = 0; pVar5 != null && i8 < dVar.f3216f; i8++) {
                        pVar5 = C0174t.c(pVar5).f4494i;
                    }
                    E s3 = e3.s();
                    C1006t c1006t = s3 != null ? (C1006t) s3.f8561y.f2912c : null;
                    C1006t c1006t2 = (C1006t) r6.f2912c;
                    c1006t2.f8713q = c1006t;
                    r6.f2913d = c1006t2;
                    r6.f2916g = dVar3;
                    if (dVar == null) {
                        dVar.h();
                    } else {
                        dVar = null;
                    }
                    r6.f2917h = dVar;
                    x3 = Y.f8682a;
                    r12 = x3.f4494i;
                    if (r12 != 0) {
                        p0Var = r12;
                    }
                    p0Var.f4493h = null;
                    x3.f4494i = null;
                    x3.f4492g = -1;
                    x3.f4496k = null;
                    if (p0Var != x3) {
                        z0.o("trimChain did not update the head");
                        throw null;
                    }
                    r6.f2915f = p0Var;
                    if (r0 != 0) {
                        r6.k();
                    }
                    this.f8562z.h();
                    if (this.f8542f == null && r6.f(512)) {
                        X(this);
                        return;
                    }
                    return;
                }
                if (dVar == null) {
                    dVar = new K.d(new U.o[16]);
                }
                r6.j(0, dVar, dVar3, pVar2, (qVar3 != null ? 1 : 0) ^ 1);
            }
            r0 = 1;
            r6.f2916g = dVar3;
            if (dVar == null) {
            }
            r6.f2917h = dVar;
            x3 = Y.f8682a;
            r12 = x3.f4494i;
            if (r12 != 0) {
            }
            p0Var.f4493h = null;
            x3.f4494i = null;
            x3.f4492g = -1;
            x3.f4496k = null;
            if (p0Var != x3) {
            }
        }
    }

    public final void e(C1123s c1123s) {
        E e3;
        if (!(this.f8548l == null)) {
            z0.o("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
            throw null;
        }
        E e4 = this.f8547k;
        if (e4 != null && !f2.j.a(e4.f8548l, c1123s)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(c1123s);
            sb.append(") than the parent's owner(");
            E s3 = s();
            sb.append(s3 != null ? s3.f8548l : null);
            sb.append("). This tree: ");
            sb.append(h(0));
            sb.append(" Parent tree: ");
            E e5 = this.f8547k;
            sb.append(e5 != null ? e5.h(0) : null);
            z0.o(sb.toString());
            throw null;
        }
        E s4 = s();
        M m3 = this.f8562z;
        if (s4 == null) {
            m3.f8642r.f8617u = true;
            J j3 = m3.f8643s;
            if (j3 != null) {
                j3.f8590s = true;
            }
        }
        C0174t c0174t = this.f8561y;
        ((b0) c0174t.f2913d).f8713q = s4 != null ? (C1006t) s4.f8561y.f2912c : null;
        this.f8548l = c1123s;
        this.f8549m = (s4 != null ? s4.f8549m : -1) + 1;
        U.q qVar = this.f8535E;
        if (qVar != null) {
            d(qVar);
        }
        this.f8535E = null;
        if (c0174t.f(8)) {
            B();
        }
        c1123s.getClass();
        E e6 = this.f8547k;
        if (e6 == null || (e3 = e6.f8542f) == null) {
            e3 = this.f8542f;
        }
        X(e3);
        if (this.f8542f == null && c0174t.f(512)) {
            X(this);
        }
        if (!this.f8537G) {
            for (U.p pVar = (U.p) c0174t.f2915f; pVar != null; pVar = pVar.f4494i) {
                pVar.o0();
            }
        }
        K.d dVar = (K.d) this.f8544h.f10466e;
        int i3 = dVar.f3216f;
        if (i3 > 0) {
            Object[] objArr = dVar.f3214d;
            int i4 = 0;
            do {
                ((E) objArr[i4]).e(c1123s);
                i4++;
            } while (i4 < i3);
        }
        if (!this.f8537G) {
            c0174t.i();
        }
        A();
        if (s4 != null) {
            s4.A();
        }
        b0 b0Var = ((C1006t) c0174t.f2912c).f8712p;
        for (b0 b0Var2 = (b0) c0174t.f2913d; !f2.j.a(b0Var2, b0Var) && b0Var2 != null; b0Var2 = b0Var2.f8712p) {
            b0Var2.f1(b0Var2.f8716t, true);
            g0 g0Var = b0Var2.f8710G;
            if (g0Var != null) {
                g0Var.invalidate();
            }
        }
        m3.h();
        if (this.f8537G) {
            return;
        }
        U.p pVar2 = (U.p) c0174t.f2915f;
        if ((pVar2.f4492g & 7168) != 0) {
            while (pVar2 != null) {
                int i5 = pVar2.f4491f;
                if (((i5 & 4096) != 0) | ((i5 & 1024) != 0) | ((i5 & 2048) != 0)) {
                    c0.a(pVar2);
                }
                pVar2 = pVar2.f4494i;
            }
        }
    }

    public final void f() {
        this.f8539I = this.f8538H;
        this.f8538H = 3;
        K.d v3 = v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                E e3 = (E) objArr[i4];
                if (e3.f8538H != 3) {
                    e3.f();
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void g() {
        this.f8539I = this.f8538H;
        this.f8538H = 3;
        K.d v3 = v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                E e3 = (E) objArr[i4];
                if (e3.f8538H == 2) {
                    e3.g();
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
        K.d v3 = v();
        int i5 = v3.f3216f;
        if (i5 > 0) {
            Object[] objArr = v3.f3214d;
            int i6 = 0;
            do {
                sb.append(((E) objArr[i6]).h(i3 + 1));
                i6++;
            } while (i6 < i5);
        }
        String sb2 = sb.toString();
        if (i3 != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final void i() {
        F f3;
        C1123s c1123s = this.f8548l;
        if (c1123s == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            E s3 = s();
            sb.append(s3 != null ? s3.h(0) : null);
            z0.p(sb.toString());
            throw null;
        }
        E s4 = s();
        M m3 = this.f8562z;
        if (s4 != null) {
            s4.y();
            s4.A();
            m3.f8642r.f8610n = 3;
            J j3 = m3.f8643s;
            if (j3 != null) {
                j3.f8583l = 3;
            }
        }
        F f4 = m3.f8642r.f8619w;
        f4.f8564b = true;
        f4.f8565c = false;
        f4.f8567e = false;
        f4.f8566d = false;
        f4.f8568f = false;
        f4.f8569g = false;
        f4.f8570h = null;
        J j4 = m3.f8643s;
        if (j4 != null && (f3 = j4.f8591t) != null) {
            f3.f8564b = true;
            f3.f8565c = false;
            f3.f8567e = false;
            f3.f8566d = false;
            f3.f8568f = false;
            f3.f8569g = false;
            f3.f8570h = null;
        }
        C0174t c0174t = this.f8561y;
        if (c0174t.f(8)) {
            B();
        }
        U.p pVar = (p0) c0174t.f2914e;
        for (U.p pVar2 = pVar; pVar2 != null; pVar2 = pVar2.f4493h) {
            if (pVar2.f4501p) {
                pVar2.v0();
            }
        }
        this.f8550n = true;
        K.d dVar = (K.d) this.f8544h.f10466e;
        int i3 = dVar.f3216f;
        if (i3 > 0) {
            Object[] objArr = dVar.f3214d;
            int i4 = 0;
            do {
                ((E) objArr[i4]).i();
                i4++;
            } while (i4 < i3);
        }
        this.f8550n = false;
        while (pVar != null) {
            if (pVar.f4501p) {
                pVar.p0();
            }
            pVar = pVar.f4493h;
        }
        T t3 = c1123s.f9460J;
        C1256t c1256t = t3.f8668b;
        ((C1256t) c1256t.f10466e).q(this);
        ((C1256t) c1256t.f10467f).q(this);
        ((K.d) t3.f8671e.f10466e).n(this);
        c1123s.f9454B = true;
        this.f8548l = null;
        X(null);
        this.f8549m = 0;
        K k3 = m3.f8642r;
        k3.f8607k = Integer.MAX_VALUE;
        k3.f8606j = Integer.MAX_VALUE;
        k3.f8617u = false;
        J j5 = m3.f8643s;
        if (j5 != null) {
            j5.f8582k = Integer.MAX_VALUE;
            j5.f8581j = Integer.MAX_VALUE;
            j5.f8590s = false;
        }
    }

    public final void j(b0.r rVar, C0416b c0416b) {
        ((b0) this.f8561y.f2913d).C0(rVar, c0416b);
    }

    public final void k() {
        if (this.f8542f != null) {
            R(this, false, 5);
        } else {
            T(this, false, 5);
        }
        K k3 = this.f8562z.f8642r;
        O0.a aVar = k3.f8608l ? new O0.a(k3.f8129g) : null;
        if (aVar != null) {
            C1123s c1123s = this.f8548l;
            if (c1123s != null) {
                c1123s.t(this, aVar.f3725a);
                return;
            }
            return;
        }
        C1123s c1123s2 = this.f8548l;
        if (c1123s2 != null) {
            c1123s2.s(true);
        }
    }

    public final List l() {
        J j3 = this.f8562z.f8643s;
        f2.j.c(j3);
        M m3 = j3.f8579A;
        m3.f8625a.n();
        boolean z3 = j3.f8593v;
        K.d dVar = j3.f8592u;
        if (!z3) {
            return dVar.g();
        }
        E e3 = m3.f8625a;
        K.d v3 = e3.v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                E e4 = (E) objArr[i4];
                if (dVar.f3216f <= i4) {
                    J j4 = e4.f8562z.f8643s;
                    f2.j.c(j4);
                    dVar.b(j4);
                } else {
                    J j5 = e4.f8562z.f8643s;
                    f2.j.c(j5);
                    Object[] objArr2 = dVar.f3214d;
                    Object obj = objArr2[i4];
                    objArr2[i4] = j5;
                }
                i4++;
            } while (i4 < i3);
        }
        dVar.p(((K.a) e3.n()).f3208d.f3216f, dVar.f3216f);
        j3.f8593v = false;
        return dVar.g();
    }

    public final List m() {
        return this.f8562z.f8642r.n0();
    }

    public final List n() {
        return v().g();
    }

    public final A0.i o() {
        if (!D() || this.f8537G) {
            return null;
        }
        if (!this.f8561y.f(8) || this.f8551o != null) {
            return this.f8551o;
        }
        f2.u uVar = new f2.u();
        uVar.f5832d = new A0.i();
        j0 snapshotObserver = ((C1123s) H.a(this)).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.f8763d, new B.f0(this, 7, uVar));
        A0.i iVar = (A0.i) uVar.f5832d;
        this.f8551o = iVar;
        return iVar;
    }

    public final List p() {
        return ((K.d) this.f8544h.f10466e).g();
    }

    public final int q() {
        int i3;
        J j3 = this.f8562z.f8643s;
        if (j3 == null || (i3 = j3.f8583l) == 0) {
            return 3;
        }
        return i3;
    }

    public final C1256t r() {
        C1256t c1256t = this.f8555s;
        if (c1256t != null) {
            return c1256t;
        }
        C1256t c1256t2 = new C1256t(this, this.f8554r);
        this.f8555s = c1256t2;
        return c1256t2;
    }

    public final E s() {
        E e3 = this.f8547k;
        while (e3 != null && e3.f8540d) {
            e3 = e3.f8547k;
        }
        return e3;
    }

    public final int t() {
        return this.f8562z.f8642r.f8607k;
    }

    public final String toString() {
        return u0.L.z(this) + " children: " + ((K.a) n()).f3208d.f3216f + " measurePolicy: " + this.f8554r;
    }

    public final K.d u() {
        boolean z3 = this.f8553q;
        K.d dVar = this.f8552p;
        if (z3) {
            dVar.h();
            dVar.c(dVar.f3216f, v());
            dVar.q(f8532L);
            this.f8553q = false;
        }
        return dVar;
    }

    public final K.d v() {
        a0();
        if (this.f8543g == 0) {
            return (K.d) this.f8544h.f10466e;
        }
        K.d dVar = this.f8545i;
        f2.j.c(dVar);
        return dVar;
    }

    public final void w(long j3, r rVar, boolean z3, boolean z4) {
        C0174t c0174t = this.f8561y;
        b0 b0Var = (b0) c0174t.f2913d;
        b0.O o3 = b0.f8701H;
        ((b0) c0174t.f2913d).O0(b0.f8704K, b0Var.H0(j3, true), rVar, z3, z4);
    }

    public final void x(int i3, E e3) {
        if (!(e3.f8547k == null)) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(e3);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(h(0));
            sb.append(" Other tree: ");
            E e4 = e3.f8547k;
            sb.append(e4 != null ? e4.h(0) : null);
            z0.o(sb.toString());
            throw null;
        }
        if (e3.f8548l != null) {
            z0.o("Cannot insert " + e3 + " because it already has an owner. This tree: " + h(0) + " Other tree: " + e3.h(0));
            throw null;
        }
        e3.f8547k = this;
        C1256t c1256t = this.f8544h;
        ((K.d) c1256t.f10466e).a(i3, e3);
        ((D) c1256t.f10467f).b();
        J();
        if (e3.f8540d) {
            this.f8543g++;
        }
        C();
        C1123s c1123s = this.f8548l;
        if (c1123s != null) {
            e3.e(c1123s);
        }
        if (e3.f8562z.f8638n > 0) {
            M m3 = this.f8562z;
            m3.b(m3.f8638n + 1);
        }
    }

    public final void y() {
        if (this.C) {
            C0174t c0174t = this.f8561y;
            b0 b0Var = (C1006t) c0174t.f2912c;
            b0 b0Var2 = ((b0) c0174t.f2913d).f8713q;
            this.f8534B = null;
            while (true) {
                if (f2.j.a(b0Var, b0Var2)) {
                    break;
                }
                if ((b0Var != null ? b0Var.f8710G : null) != null) {
                    this.f8534B = b0Var;
                    break;
                }
                b0Var = b0Var != null ? b0Var.f8713q : null;
            }
        }
        b0 b0Var3 = this.f8534B;
        if (b0Var3 != null && b0Var3.f8710G == null) {
            z0.p("layer was not set");
            throw null;
        }
        if (b0Var3 != null) {
            b0Var3.Q0();
            return;
        }
        E s3 = s();
        if (s3 != null) {
            s3.y();
        }
    }

    public final void z() {
        C0174t c0174t = this.f8561y;
        b0 b0Var = (b0) c0174t.f2913d;
        C1006t c1006t = (C1006t) c0174t.f2912c;
        while (b0Var != c1006t) {
            f2.j.d(b0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C1011y c1011y = (C1011y) b0Var;
            g0 g0Var = c1011y.f8710G;
            if (g0Var != null) {
                g0Var.invalidate();
            }
            b0Var = c1011y.f8712p;
        }
        g0 g0Var2 = ((C1006t) c0174t.f2912c).f8710G;
        if (g0Var2 != null) {
            g0Var2.invalidate();
        }
    }

    public E(int i3, boolean z3) {
        this.f8540d = z3;
        this.f8541e = i3;
        this.f8544h = new C1256t(new K.d(new E[16]), 16, new D(0, this));
        this.f8552p = new K.d(new E[16]);
        this.f8553q = true;
        this.f8554r = f8530J;
        this.f8556t = H.f8575a;
        this.f8557u = O0.k.f3741d;
        this.f8558v = f8531K;
        InterfaceC0180w.f2951a.getClass();
        this.f8559w = C0178v.f2946b;
        this.f8538H = 3;
        this.f8539I = 3;
        this.f8561y = new C0174t(this);
        this.f8562z = new M(this);
        this.C = true;
        this.D = U.n.f4488a;
    }
}
