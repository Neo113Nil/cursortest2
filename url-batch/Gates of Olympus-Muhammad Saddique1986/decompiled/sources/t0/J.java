package t0;

import e2.InterfaceC0424c;
import m.AbstractC0625j;
import n.z0;
import r0.AbstractC0893O;
import r0.C0915l;
import r0.C0929z;
import r0.InterfaceC0884F;
import u0.C1123s;

/* loaded from: classes.dex */
public final class J extends AbstractC0893O implements InterfaceC0884F, InterfaceC0988a, V {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ M f8579A;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8580i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8584m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8585n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8586o;

    /* renamed from: p, reason: collision with root package name */
    public O0.a f8587p;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0424c f8589r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8590s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f8594w;

    /* renamed from: y, reason: collision with root package name */
    public Object f8596y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8597z;

    /* renamed from: j, reason: collision with root package name */
    public int f8581j = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public int f8582k = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f8583l = 3;

    /* renamed from: q, reason: collision with root package name */
    public long f8588q = 0;

    /* renamed from: t, reason: collision with root package name */
    public final F f8591t = new F(this, 1);

    /* renamed from: u, reason: collision with root package name */
    public final K.d f8592u = new K.d(new J[16]);

    /* renamed from: v, reason: collision with root package name */
    public boolean f8593v = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8595x = true;

    public J(M m3) {
        this.f8579A = m3;
        this.f8596y = m3.f8642r.f8616t;
    }

    @Override // t0.V
    public final void C(boolean z3) {
        Q I02;
        M m3 = this.f8579A;
        Q I03 = m3.a().I0();
        if (Boolean.valueOf(z3).equals(I03 != null ? Boolean.valueOf(I03.f8652i) : null) || (I02 = m3.a().I0()) == null) {
            return;
        }
        I02.f8652i = z3;
    }

    @Override // r0.InterfaceC0884F
    public final int O(int i3) {
        q0();
        Q I02 = this.f8579A.a().I0();
        f2.j.c(I02);
        return I02.O(i3);
    }

    @Override // t0.InterfaceC0988a
    public final C1006t Q() {
        return (C1006t) this.f8579A.f8625a.f8561y.f2912c;
    }

    @Override // t0.InterfaceC0988a
    public final void R() {
        E.R(this.f8579A.f8625a, false, 7);
    }

    @Override // r0.InterfaceC0884F
    public final int U(int i3) {
        q0();
        Q I02 = this.f8579A.a().I0();
        f2.j.c(I02);
        return I02.U(i3);
    }

    @Override // r0.InterfaceC0884F
    public final int V(int i3) {
        q0();
        Q I02 = this.f8579A.a().I0();
        f2.j.c(I02);
        return I02.V(i3);
    }

    @Override // r0.AbstractC0893O
    public final int W(C0915l c0915l) {
        M m3 = this.f8579A;
        E s3 = m3.f8625a.s();
        int i3 = s3 != null ? s3.f8562z.f8627c : 0;
        F f3 = this.f8591t;
        if (i3 == 2) {
            f3.f8565c = true;
        } else {
            E s4 = m3.f8625a.s();
            if ((s4 != null ? s4.f8562z.f8627c : 0) == 4) {
                f3.f8566d = true;
            }
        }
        this.f8584m = true;
        Q I02 = m3.a().I0();
        f2.j.c(I02);
        int W2 = I02.W(c0915l);
        this.f8584m = false;
        return W2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 != null ? r1.f8562z.f8627c : 0) == 4) goto L14;
     */
    @Override // r0.InterfaceC0884F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0893O b(long j3) {
        M m3 = this.f8579A;
        E s3 = m3.f8625a.s();
        int i3 = s3 != null ? s3.f8562z.f8627c : 0;
        int i4 = 2;
        E e3 = m3.f8625a;
        if (i3 != 2) {
            E s4 = e3.s();
        }
        m3.f8626b = false;
        E s5 = e3.s();
        if (s5 == null) {
            this.f8583l = 3;
        } else {
            if (this.f8583l != 3 && !e3.f8560x) {
                z0.o("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            M m4 = s5.f8562z;
            int b3 = AbstractC0625j.b(m4.f8627c);
            if (b3 == 0 || b3 == 1) {
                i4 = 1;
            } else if (b3 != 2 && b3 != 3) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(A.k.v(m4.f8627c)));
            }
            this.f8583l = i4;
        }
        if (e3.f8538H == 3) {
            e3.f();
        }
        t0(j3);
        return this;
    }

    @Override // r0.InterfaceC0884F
    public final int c(int i3) {
        q0();
        Q I02 = this.f8579A.a().I0();
        f2.j.c(I02);
        return I02.c(i3);
    }

    @Override // t0.InterfaceC0988a
    public final void e(C0929z c0929z) {
        K.d v3 = this.f8579A.f8625a.v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                J j3 = ((E) objArr[i4]).f8562z.f8643s;
                f2.j.c(j3);
                c0929z.n(j3);
                i4++;
            } while (i4 < i3);
        }
    }

    @Override // r0.AbstractC0893O
    public final void f0(long j3, float f3, InterfaceC0424c interfaceC0424c) {
        s0(j3, interfaceC0424c);
    }

    @Override // t0.InterfaceC0988a
    public final InterfaceC0988a g() {
        M m3;
        E s3 = this.f8579A.f8625a.s();
        if (s3 == null || (m3 = s3.f8562z) == null) {
            return null;
        }
        return m3.f8643s;
    }

    @Override // t0.InterfaceC0988a
    public final void h() {
        K.d v3;
        int i3;
        this.f8594w = true;
        F f3 = this.f8591t;
        f3.h();
        M m3 = this.f8579A;
        boolean z3 = m3.f8632h;
        E e3 = m3.f8625a;
        if (z3 && (i3 = (v3 = e3.v()).f3216f) > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                E e4 = (E) objArr[i4];
                if (e4.f8562z.f8631g && e4.q() == 1) {
                    M m4 = e4.f8562z;
                    J j3 = m4.f8643s;
                    f2.j.c(j3);
                    J j4 = m4.f8643s;
                    O0.a aVar = j4 != null ? j4.f8587p : null;
                    f2.j.c(aVar);
                    if (j3.t0(aVar.f3725a)) {
                        E.R(e3, false, 7);
                    }
                }
                i4++;
            } while (i4 < i3);
        }
        C1005s c1005s = Q().f8790N;
        f2.j.c(c1005s);
        if (m3.f8633i || (!this.f8584m && !c1005s.f8654k && m3.f8632h)) {
            m3.f8632h = false;
            int i5 = m3.f8627c;
            m3.f8627c = 4;
            h0 a3 = H.a(e3);
            m3.g(false);
            j0 snapshotObserver = ((C1123s) a3).getSnapshotObserver();
            K2.i iVar = new K2.i(this, c1005s, m3, 4);
            snapshotObserver.getClass();
            if (e3.f8542f != null) {
                snapshotObserver.a(e3, snapshotObserver.f8767h, iVar);
            } else {
                snapshotObserver.a(e3, snapshotObserver.f8764e, iVar);
            }
            m3.f8627c = i5;
            if (m3.f8639o && c1005s.f8654k) {
                requestLayout();
            }
            m3.f8633i = false;
        }
        if (f3.f8566d) {
            f3.f8567e = true;
        }
        if (f3.f8564b && f3.e()) {
            f3.g();
        }
        this.f8594w = false;
    }

    @Override // t0.InterfaceC0988a
    public final F i() {
        return this.f8591t;
    }

    @Override // t0.InterfaceC0988a
    public final boolean j() {
        return this.f8590s;
    }

    public final void n0() {
        boolean z3 = this.f8590s;
        this.f8590s = true;
        M m3 = this.f8579A;
        if (!z3 && m3.f8631g) {
            E.R(m3.f8625a, true, 6);
        }
        K.d v3 = m3.f8625a.v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                E e3 = (E) objArr[i4];
                J j3 = e3.f8562z.f8643s;
                if (j3 == null) {
                    throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                }
                if (j3.f8582k != Integer.MAX_VALUE) {
                    j3.n0();
                    E.U(e3);
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void o0() {
        if (this.f8590s) {
            int i3 = 0;
            this.f8590s = false;
            K.d v3 = this.f8579A.f8625a.v();
            int i4 = v3.f3216f;
            if (i4 > 0) {
                Object[] objArr = v3.f3214d;
                do {
                    J j3 = ((E) objArr[i3]).f8562z.f8643s;
                    f2.j.c(j3);
                    j3.o0();
                    i3++;
                } while (i3 < i4);
            }
        }
    }

    public final void p0() {
        K.d v3;
        int i3;
        M m3 = this.f8579A;
        if (m3.f8641q <= 0 || (i3 = (v3 = m3.f8625a.v()).f3216f) <= 0) {
            return;
        }
        Object[] objArr = v3.f3214d;
        int i4 = 0;
        do {
            E e3 = (E) objArr[i4];
            M m4 = e3.f8562z;
            if ((m4.f8639o || m4.f8640p) && !m4.f8632h) {
                e3.Q(false);
            }
            J j3 = m4.f8643s;
            if (j3 != null) {
                j3.p0();
            }
            i4++;
        } while (i4 < i3);
    }

    public final void q0() {
        int i3;
        M m3 = this.f8579A;
        E.R(m3.f8625a, false, 7);
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

    public final void r0() {
        M m3;
        int i3;
        this.f8597z = true;
        E s3 = this.f8579A.f8625a.s();
        if (!this.f8590s) {
            n0();
            if (this.f8580i && s3 != null) {
                s3.Q(false);
            }
        }
        if (s3 == null) {
            this.f8582k = 0;
        } else if (!this.f8580i && ((i3 = (m3 = s3.f8562z).f8627c) == 3 || i3 == 4)) {
            if (this.f8582k != Integer.MAX_VALUE) {
                z0.o("Place was called on a node which was placed already");
                throw null;
            }
            int i4 = m3.f8634j;
            this.f8582k = i4;
            m3.f8634j = i4 + 1;
        }
        h();
    }

    @Override // t0.InterfaceC0988a
    public final void requestLayout() {
        this.f8579A.f8625a.Q(false);
    }

    public final void s0(long j3, InterfaceC0424c interfaceC0424c) {
        M m3 = this.f8579A;
        if (m3.f8625a.f8537G) {
            z0.n("place is called on a deactivated node");
            throw null;
        }
        m3.f8627c = 4;
        this.f8585n = true;
        this.f8597z = false;
        if (!O0.h.a(j3, this.f8588q)) {
            if (m3.f8640p || m3.f8639o) {
                m3.f8632h = true;
            }
            p0();
        }
        E e3 = m3.f8625a;
        h0 a3 = H.a(e3);
        if (m3.f8632h || !this.f8590s) {
            m3.f(false);
            this.f8591t.f8569g = false;
            j0 snapshotObserver = ((C1123s) a3).getSnapshotObserver();
            I i3 = new I(m3, a3, j3);
            snapshotObserver.getClass();
            if (e3.f8542f != null) {
                snapshotObserver.a(e3, snapshotObserver.f8766g, i3);
            } else {
                snapshotObserver.a(e3, snapshotObserver.f8765f, i3);
            }
        } else {
            Q I02 = m3.a().I0();
            f2.j.c(I02);
            I02.A0(O0.h.c(j3, I02.f8130h));
            r0();
        }
        this.f8588q = j3;
        this.f8589r = interfaceC0424c;
        m3.f8627c = 5;
    }

    @Override // r0.AbstractC0893O, r0.InterfaceC0884F
    public final Object t() {
        return this.f8596y;
    }

    public final boolean t0(long j3) {
        M m3 = this.f8579A;
        E e3 = m3.f8625a;
        if (e3.f8537G) {
            z0.n("measure is called on a deactivated node");
            throw null;
        }
        E s3 = e3.s();
        E e4 = m3.f8625a;
        e4.f8560x = e4.f8560x || (s3 != null && s3.f8560x);
        if (!e4.f8562z.f8631g) {
            O0.a aVar = this.f8587p;
            if (aVar == null ? false : O0.a.b(aVar.f3725a, j3)) {
                C1123s c1123s = e4.f8548l;
                if (c1123s != null) {
                    c1123s.f9460J.f(e4, true);
                }
                e4.V();
                return false;
            }
        }
        this.f8587p = new O0.a(j3);
        m0(j3);
        this.f8591t.f8568f = false;
        K.d v3 = e4.v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                J j4 = ((E) objArr[i4]).f8562z.f8643s;
                f2.j.c(j4);
                j4.f8591t.f8565c = false;
                i4++;
            } while (i4 < i3);
        }
        long d3 = this.f8586o ? this.f8128f : O2.d.d(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f8586o = true;
        Q I02 = m3.a().I0();
        if (!(I02 != null)) {
            z0.o("Lookahead result from lookaheadRemeasure cannot be null");
            throw null;
        }
        m3.f8627c = 2;
        m3.f8631g = false;
        j0 snapshotObserver = ((C1123s) H.a(e4)).getSnapshotObserver();
        L l3 = new L(m3, j3);
        snapshotObserver.getClass();
        if (e4.f8542f != null) {
            snapshotObserver.a(e4, snapshotObserver.f8761b, l3);
        } else {
            snapshotObserver.a(e4, snapshotObserver.f8762c, l3);
        }
        m3.f8632h = true;
        m3.f8633i = true;
        if (AbstractC0993f.p(e4)) {
            m3.f8629e = true;
            m3.f8630f = true;
        } else {
            m3.f8628d = true;
        }
        m3.f8627c = 5;
        g0(O2.d.d(I02.f8126d, I02.f8127e));
        return (((int) (d3 >> 32)) == I02.f8126d && ((int) (4294967295L & d3)) == I02.f8127e) ? false : true;
    }
}
