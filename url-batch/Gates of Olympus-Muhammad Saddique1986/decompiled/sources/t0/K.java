package t0;

import I.C0174t;
import e2.InterfaceC0424c;
import java.util.List;
import m.AbstractC0625j;
import n.z0;
import r0.AbstractC0892N;
import r0.AbstractC0893O;
import r0.C0915l;
import r0.C0929z;
import r0.InterfaceC0884F;
import u0.C1123s;

/* loaded from: classes.dex */
public final class K extends AbstractC0893O implements InterfaceC0884F, InterfaceC0988a, V {

    /* renamed from: B, reason: collision with root package name */
    public float f8599B;
    public boolean C;
    public InterfaceC0424c D;

    /* renamed from: F, reason: collision with root package name */
    public float f8601F;

    /* renamed from: G, reason: collision with root package name */
    public final B.f0 f8602G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f8603H;

    /* renamed from: I, reason: collision with root package name */
    public final /* synthetic */ M f8604I;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8605i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8608l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8609m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8611o;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0424c f8613q;

    /* renamed from: r, reason: collision with root package name */
    public float f8614r;

    /* renamed from: t, reason: collision with root package name */
    public Object f8616t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8617u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8618v;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8622z;

    /* renamed from: j, reason: collision with root package name */
    public int f8606j = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public int f8607k = Integer.MAX_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public int f8610n = 3;

    /* renamed from: p, reason: collision with root package name */
    public long f8612p = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8615s = true;

    /* renamed from: w, reason: collision with root package name */
    public final F f8619w = new F(this, 0);

    /* renamed from: x, reason: collision with root package name */
    public final K.d f8620x = new K.d(new K[16]);

    /* renamed from: y, reason: collision with root package name */
    public boolean f8621y = true;

    /* renamed from: A, reason: collision with root package name */
    public final D f8598A = new D(1, this);

    /* renamed from: E, reason: collision with root package name */
    public long f8600E = 0;

    public K(M m3) {
        this.f8604I = m3;
        this.f8602G = new B.f0(m3, 8, this);
    }

    @Override // t0.V
    public final void C(boolean z3) {
        M m3 = this.f8604I;
        boolean z4 = m3.a().f8652i;
        if (z3 != z4) {
            m3.a().f8652i = z4;
            this.f8603H = true;
        }
    }

    @Override // r0.InterfaceC0884F
    public final int O(int i3) {
        r0();
        return this.f8604I.a().O(i3);
    }

    @Override // t0.InterfaceC0988a
    public final C1006t Q() {
        return (C1006t) this.f8604I.f8625a.f8561y.f2912c;
    }

    @Override // t0.InterfaceC0988a
    public final void R() {
        E.T(this.f8604I.f8625a, false, 7);
    }

    @Override // r0.InterfaceC0884F
    public final int U(int i3) {
        r0();
        return this.f8604I.a().U(i3);
    }

    @Override // r0.InterfaceC0884F
    public final int V(int i3) {
        r0();
        return this.f8604I.a().V(i3);
    }

    @Override // r0.AbstractC0893O
    public final int W(C0915l c0915l) {
        M m3 = this.f8604I;
        E s3 = m3.f8625a.s();
        int i3 = s3 != null ? s3.f8562z.f8627c : 0;
        F f3 = this.f8619w;
        if (i3 == 1) {
            f3.f8565c = true;
        } else {
            E s4 = m3.f8625a.s();
            if ((s4 != null ? s4.f8562z.f8627c : 0) == 3) {
                f3.f8566d = true;
            }
        }
        this.f8611o = true;
        int W2 = m3.a().W(c0915l);
        this.f8611o = false;
        return W2;
    }

    @Override // r0.InterfaceC0884F
    public final AbstractC0893O b(long j3) {
        int i3;
        M m3 = this.f8604I;
        E e3 = m3.f8625a;
        if (e3.f8538H == 3) {
            e3.f();
        }
        E e4 = m3.f8625a;
        if (AbstractC0993f.p(e4)) {
            J j4 = m3.f8643s;
            f2.j.c(j4);
            j4.f8583l = 3;
            j4.b(j3);
        }
        E s3 = e4.s();
        if (s3 == null) {
            this.f8610n = 3;
        } else {
            if (this.f8610n != 3 && !e4.f8560x) {
                z0.o("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            M m4 = s3.f8562z;
            int b3 = AbstractC0625j.b(m4.f8627c);
            if (b3 != 0) {
                i3 = 2;
                if (b3 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(A.k.v(m4.f8627c)));
                }
            } else {
                i3 = 1;
            }
            this.f8610n = i3;
        }
        u0(j3);
        return this;
    }

    @Override // r0.InterfaceC0884F
    public final int c(int i3) {
        r0();
        return this.f8604I.a().c(i3);
    }

    @Override // t0.InterfaceC0988a
    public final void e(C0929z c0929z) {
        K.d v3 = this.f8604I.f8625a.v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                c0929z.n(((E) objArr[i4]).f8562z.f8642r);
                i4++;
            } while (i4 < i3);
        }
    }

    @Override // r0.AbstractC0893O
    public final void f0(long j3, float f3, InterfaceC0424c interfaceC0424c) {
        AbstractC0892N placementScope;
        this.f8618v = true;
        boolean a3 = O0.h.a(j3, this.f8612p);
        M m3 = this.f8604I;
        if (!a3 || this.f8603H) {
            if (m3.f8637m || m3.f8636l || this.f8603H) {
                m3.f8629e = true;
                this.f8603H = false;
            }
            q0();
        }
        if (AbstractC0993f.p(m3.f8625a)) {
            b0 b0Var = m3.a().f8713q;
            E e3 = m3.f8625a;
            if (b0Var == null || (placementScope = b0Var.f8655l) == null) {
                placementScope = ((C1123s) H.a(e3)).getPlacementScope();
            }
            J j4 = m3.f8643s;
            f2.j.c(j4);
            E s3 = e3.s();
            if (s3 != null) {
                s3.f8562z.f8634j = 0;
            }
            j4.f8582k = Integer.MAX_VALUE;
            AbstractC0892N.d(placementScope, j4, (int) (j3 >> 32), (int) (4294967295L & j3));
        }
        J j5 = m3.f8643s;
        if (j5 == null || j5.f8585n) {
            t0(j3, f3, interfaceC0424c);
        } else {
            z0.o("Error: Placement happened before lookahead.");
            throw null;
        }
    }

    @Override // t0.InterfaceC0988a
    public final InterfaceC0988a g() {
        M m3;
        E s3 = this.f8604I.f8625a.s();
        if (s3 == null || (m3 = s3.f8562z) == null) {
            return null;
        }
        return m3.f8642r;
    }

    @Override // t0.InterfaceC0988a
    public final void h() {
        K.d v3;
        int i3;
        this.f8622z = true;
        F f3 = this.f8619w;
        f3.h();
        M m3 = this.f8604I;
        boolean z3 = m3.f8629e;
        E e3 = m3.f8625a;
        if (z3 && (i3 = (v3 = e3.v()).f3216f) > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                E e4 = (E) objArr[i4];
                M m4 = e4.f8562z;
                if (m4.f8628d && m4.f8642r.f8610n == 1 && E.M(e4)) {
                    E.T(e3, false, 7);
                }
                i4++;
            } while (i4 < i3);
        }
        if (m3.f8630f || (!this.f8611o && !Q().f8654k && m3.f8629e)) {
            m3.f8629e = false;
            int i5 = m3.f8627c;
            m3.f8627c = 3;
            m3.e(false);
            j0 snapshotObserver = ((C1123s) H.a(e3)).getSnapshotObserver();
            snapshotObserver.a(e3, snapshotObserver.f8764e, this.f8598A);
            m3.f8627c = i5;
            if (Q().f8654k && m3.f8636l) {
                requestLayout();
            }
            m3.f8630f = false;
        }
        if (f3.f8566d) {
            f3.f8567e = true;
        }
        if (f3.f8564b && f3.e()) {
            f3.g();
        }
        this.f8622z = false;
    }

    @Override // t0.InterfaceC0988a
    public final F i() {
        return this.f8619w;
    }

    @Override // t0.InterfaceC0988a
    public final boolean j() {
        return this.f8617u;
    }

    public final List n0() {
        M m3 = this.f8604I;
        m3.f8625a.a0();
        boolean z3 = this.f8621y;
        K.d dVar = this.f8620x;
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
                    dVar.b(e4.f8562z.f8642r);
                } else {
                    K k3 = e4.f8562z.f8642r;
                    Object[] objArr2 = dVar.f3214d;
                    Object obj = objArr2[i4];
                    objArr2[i4] = k3;
                }
                i4++;
            } while (i4 < i3);
        }
        dVar.p(((K.a) e3.n()).f3208d.f3216f, dVar.f3216f);
        this.f8621y = false;
        return dVar.g();
    }

    public final void o0() {
        boolean z3 = this.f8617u;
        this.f8617u = true;
        E e3 = this.f8604I.f8625a;
        if (!z3) {
            M m3 = e3.f8562z;
            if (m3.f8628d) {
                E.T(e3, true, 6);
            } else if (m3.f8631g) {
                E.R(e3, true, 6);
            }
        }
        C0174t c0174t = e3.f8561y;
        b0 b0Var = ((C1006t) c0174t.f2912c).f8712p;
        for (b0 b0Var2 = (b0) c0174t.f2913d; !f2.j.a(b0Var2, b0Var) && b0Var2 != null; b0Var2 = b0Var2.f8712p) {
            if (b0Var2.f8709F) {
                b0Var2.Q0();
            }
        }
        K.d v3 = e3.v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                E e4 = (E) objArr[i4];
                if (e4.t() != Integer.MAX_VALUE) {
                    e4.f8562z.f8642r.o0();
                    E.U(e4);
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void p0() {
        if (this.f8617u) {
            int i3 = 0;
            this.f8617u = false;
            M m3 = this.f8604I;
            C0174t c0174t = m3.f8625a.f8561y;
            b0 b0Var = ((C1006t) c0174t.f2912c).f8712p;
            for (b0 b0Var2 = (b0) c0174t.f2913d; !f2.j.a(b0Var2, b0Var) && b0Var2 != null; b0Var2 = b0Var2.f8712p) {
                if (b0Var2.f8710G != null) {
                    b0Var2.f1(null, false);
                    b0Var2.f8711o.S(false);
                }
            }
            K.d v3 = m3.f8625a.v();
            int i4 = v3.f3216f;
            if (i4 > 0) {
                Object[] objArr = v3.f3214d;
                do {
                    ((E) objArr[i3]).f8562z.f8642r.p0();
                    i3++;
                } while (i3 < i4);
            }
        }
    }

    public final void q0() {
        K.d v3;
        int i3;
        M m3 = this.f8604I;
        if (m3.f8638n <= 0 || (i3 = (v3 = m3.f8625a.v()).f3216f) <= 0) {
            return;
        }
        Object[] objArr = v3.f3214d;
        int i4 = 0;
        do {
            E e3 = (E) objArr[i4];
            M m4 = e3.f8562z;
            if ((m4.f8636l || m4.f8637m) && !m4.f8629e) {
                e3.S(false);
            }
            m4.f8642r.q0();
            i4++;
        } while (i4 < i3);
    }

    public final void r0() {
        int i3;
        M m3 = this.f8604I;
        E.T(m3.f8625a, false, 7);
        E e3 = m3.f8625a;
        E s3 = e3.s();
        if (s3 == null || e3.f8538H != 3) {
            return;
        }
        int b3 = AbstractC0625j.b(s3.f8562z.f8627c);
        if (b3 != 0) {
            i3 = 2;
            if (b3 != 2) {
                i3 = s3.f8538H;
            }
        } else {
            i3 = 1;
        }
        e3.f8538H = i3;
    }

    @Override // t0.InterfaceC0988a
    public final void requestLayout() {
        this.f8604I.f8625a.S(false);
    }

    public final void s0() {
        this.C = true;
        M m3 = this.f8604I;
        E s3 = m3.f8625a.s();
        float f3 = Q().f8706A;
        C0174t c0174t = m3.f8625a.f8561y;
        b0 b0Var = (b0) c0174t.f2913d;
        while (b0Var != ((C1006t) c0174t.f2912c)) {
            f2.j.d(b0Var, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C1011y c1011y = (C1011y) b0Var;
            f3 += c1011y.f8706A;
            b0Var = c1011y.f8712p;
        }
        if (f3 != this.f8599B) {
            this.f8599B = f3;
            if (s3 != null) {
                s3.J();
            }
            if (s3 != null) {
                s3.y();
            }
        }
        if (!this.f8617u) {
            if (s3 != null) {
                s3.y();
            }
            o0();
            if (this.f8605i && s3 != null) {
                s3.S(false);
            }
        }
        if (s3 == null) {
            this.f8607k = 0;
        } else if (!this.f8605i) {
            M m4 = s3.f8562z;
            if (m4.f8627c == 3) {
                if (this.f8607k != Integer.MAX_VALUE) {
                    z0.o("Place was called on a node which was placed already");
                    throw null;
                }
                int i3 = m4.f8635k;
                this.f8607k = i3;
                m4.f8635k = i3 + 1;
            }
        }
        h();
    }

    @Override // r0.AbstractC0893O, r0.InterfaceC0884F
    public final Object t() {
        return this.f8616t;
    }

    public final void t0(long j3, float f3, InterfaceC0424c interfaceC0424c) {
        M m3 = this.f8604I;
        E e3 = m3.f8625a;
        if (e3.f8537G) {
            z0.n("place is called on a deactivated node");
            throw null;
        }
        m3.f8627c = 3;
        this.f8612p = j3;
        this.f8614r = f3;
        this.f8613q = interfaceC0424c;
        this.f8609m = true;
        this.C = false;
        h0 a3 = H.a(e3);
        if (m3.f8629e || !this.f8617u) {
            this.f8619w.f8569g = false;
            m3.d(false);
            this.D = interfaceC0424c;
            this.f8600E = j3;
            this.f8601F = f3;
            j0 snapshotObserver = ((C1123s) a3).getSnapshotObserver();
            snapshotObserver.a(m3.f8625a, snapshotObserver.f8765f, this.f8602G);
        } else {
            b0 a4 = m3.a();
            a4.X0(O0.h.c(j3, a4.f8130h), f3, interfaceC0424c);
            s0();
        }
        m3.f8627c = 5;
    }

    public final boolean u0(long j3) {
        M m3 = this.f8604I;
        E e3 = m3.f8625a;
        if (e3.f8537G) {
            z0.n("measure is called on a deactivated node");
            throw null;
        }
        h0 a3 = H.a(e3);
        E e4 = m3.f8625a;
        E s3 = e4.s();
        boolean z3 = true;
        e4.f8560x = e4.f8560x || (s3 != null && s3.f8560x);
        if (!e4.f8562z.f8628d && O0.a.b(this.f8129g, j3)) {
            ((C1123s) a3).f9460J.f(e4, false);
            e4.V();
            return false;
        }
        this.f8619w.f8568f = false;
        K.d v3 = e4.v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                ((E) objArr[i4]).f8562z.f8642r.f8619w.f8565c = false;
                i4++;
            } while (i4 < i3);
        }
        this.f8608l = true;
        long j4 = m3.a().f8128f;
        m0(j3);
        if (m3.f8627c != 5) {
            z0.o("layout state is not idle before measure starts");
            throw null;
        }
        m3.f8627c = 1;
        m3.f8628d = false;
        m3.f8644t = j3;
        j0 snapshotObserver = ((C1123s) H.a(e4)).getSnapshotObserver();
        snapshotObserver.a(e4, snapshotObserver.f8762c, m3.f8645u);
        if (m3.f8627c == 1) {
            m3.f8629e = true;
            m3.f8630f = true;
            m3.f8627c = 5;
        }
        if (O0.j.a(m3.a().f8128f, j4) && m3.a().f8126d == this.f8126d && m3.a().f8127e == this.f8127e) {
            z3 = false;
        }
        g0(O2.d.d(m3.a().f8126d, m3.a().f8127e));
        return z3;
    }
}
