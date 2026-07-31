package t0;

import H2.AbstractC0080b;
import e2.AbstractC0381e;
import m.AbstractC0600j;
import r0.C0837j;
import u0.C0997t;

/* loaded from: classes.dex */
public final class I extends r0.H implements r0.z, InterfaceC0893a, U {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ L f7754A;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7755i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7759m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7760n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7761o;
    public M0.a p;

    /* renamed from: r, reason: collision with root package name */
    public Y1.c f7763r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7764s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7768w;

    /* renamed from: y, reason: collision with root package name */
    public Object f7770y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7771z;

    /* renamed from: j, reason: collision with root package name */
    public int f7756j = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public int f7757k = Integer.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f7758l = 3;

    /* renamed from: q, reason: collision with root package name */
    public long f7762q = 0;

    /* renamed from: t, reason: collision with root package name */
    public final E f7765t = new E(this, 1);

    /* renamed from: u, reason: collision with root package name */
    public final K.d f7766u = new K.d(new I[16]);

    /* renamed from: v, reason: collision with root package name */
    public boolean f7767v = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7769x = true;

    public I(L l3) {
        this.f7754A = l3;
        this.f7770y = l3.f7813r.f7788t;
    }

    @Override // t0.InterfaceC0893a
    public final C0911t A() {
        return (C0911t) this.f7754A.f7797a.f7735x.f2353c;
    }

    @Override // t0.InterfaceC0893a
    public final void E() {
        D.P(this.f7754A.f7797a, false, 7);
    }

    @Override // t0.InterfaceC0893a
    public final void K(t.x xVar) {
        K.d t3 = this.f7754A.f7797a.t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                I i5 = ((D) objArr[i4]).f7736y.f7814s;
                Z1.i.c(i5);
                xVar.j(i5);
                i4++;
            } while (i4 < i3);
        }
    }

    @Override // r0.H
    public final int L(C0837j c0837j) {
        L l3 = this.f7754A;
        D q2 = l3.f7797a.q();
        int i3 = q2 != null ? q2.f7736y.f7799c : 0;
        E e3 = this.f7765t;
        if (i3 == 2) {
            e3.f7740c = true;
        } else {
            D q3 = l3.f7797a.q();
            if ((q3 != null ? q3.f7736y.f7799c : 0) == 4) {
                e3.f7741d = true;
            }
        }
        this.f7759m = true;
        P z02 = l3.a().z0();
        Z1.i.c(z02);
        int L2 = z02.L(c0837j);
        this.f7759m = false;
        return L2;
    }

    @Override // r0.H
    public final void Q(long j3, float f3, Y1.c cVar) {
        f0(j3, cVar);
    }

    public final void W() {
        boolean z3 = this.f7764s;
        this.f7764s = true;
        L l3 = this.f7754A;
        if (!z3 && l3.f7803g) {
            D.P(l3.f7797a, true, 6);
        }
        K.d t3 = l3.f7797a.t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                D d3 = (D) objArr[i4];
                I i5 = d3.f7736y.f7814s;
                if (i5 == null) {
                    throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                }
                if (i5.f7757k != Integer.MAX_VALUE) {
                    i5.W();
                    D.S(d3);
                }
                i4++;
            } while (i4 < i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 != null ? r1.f7736y.f7799c : 0) == 4) goto L14;
     */
    @Override // r0.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r0.H b(long j3) {
        L l3 = this.f7754A;
        D q2 = l3.f7797a.q();
        int i3 = q2 != null ? q2.f7736y.f7799c : 0;
        int i4 = 2;
        D d3 = l3.f7797a;
        if (i3 != 2) {
            D q3 = d3.q();
        }
        l3.f7798b = false;
        D q4 = d3.q();
        if (q4 == null) {
            this.f7758l = 3;
        } else {
            if (this.f7758l != 3 && !d3.f7734w) {
                AbstractC0381e.N("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw null;
            }
            L l4 = q4.f7736y;
            int a3 = AbstractC0600j.a(l4.f7799c);
            if (a3 == 0 || a3 == 1) {
                i4 = 1;
            } else if (a3 != 2 && a3 != 3) {
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(AbstractC0080b.v(l4.f7799c)));
            }
            this.f7758l = i4;
        }
        if (d3.f7714G == 3) {
            d3.f();
        }
        j0(j3);
        return this;
    }

    public final void b0() {
        if (this.f7764s) {
            int i3 = 0;
            this.f7764s = false;
            K.d t3 = this.f7754A.f7797a.t();
            int i4 = t3.f2642f;
            if (i4 > 0) {
                Object[] objArr = t3.f2640d;
                do {
                    I i5 = ((D) objArr[i3]).f7736y.f7814s;
                    Z1.i.c(i5);
                    i5.b0();
                    i3++;
                } while (i3 < i4);
            }
        }
    }

    @Override // t0.InterfaceC0893a
    public final InterfaceC0893a d() {
        L l3;
        D q2 = this.f7754A.f7797a.q();
        if (q2 == null || (l3 = q2.f7736y) == null) {
            return null;
        }
        return l3.f7814s;
    }

    public final void d0() {
        K.d t3;
        int i3;
        L l3 = this.f7754A;
        if (l3.f7812q <= 0 || (i3 = (t3 = l3.f7797a.t()).f2642f) <= 0) {
            return;
        }
        Object[] objArr = t3.f2640d;
        int i4 = 0;
        do {
            D d3 = (D) objArr[i4];
            L l4 = d3.f7736y;
            if ((l4.f7811o || l4.p) && !l4.f7804h) {
                d3.O(false);
            }
            I i5 = l4.f7814s;
            if (i5 != null) {
                i5.d0();
            }
            i4++;
        } while (i4 < i3);
    }

    @Override // t0.InterfaceC0893a
    public final void e() {
        K.d t3;
        int i3;
        this.f7768w = true;
        E e3 = this.f7765t;
        e3.h();
        L l3 = this.f7754A;
        boolean z3 = l3.f7804h;
        D d3 = l3.f7797a;
        if (z3 && (i3 = (t3 = d3.t()).f2642f) > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                D d4 = (D) objArr[i4];
                if (d4.f7736y.f7803g && d4.p() == 1) {
                    L l4 = d4.f7736y;
                    I i5 = l4.f7814s;
                    Z1.i.c(i5);
                    I i6 = l4.f7814s;
                    M0.a aVar = i6 != null ? i6.p : null;
                    Z1.i.c(aVar);
                    if (i5.j0(aVar.f2760a)) {
                        D.P(d3, false, 7);
                    }
                }
                i4++;
            } while (i4 < i3);
        }
        C0910s c0910s = A().f7956M;
        Z1.i.c(c0910s);
        if (l3.f7805i || (!this.f7759m && !c0910s.f7825k && l3.f7804h)) {
            l3.f7804h = false;
            int i7 = l3.f7799c;
            l3.f7799c = 4;
            g0 a3 = G.a(d3);
            l3.g(false);
            i0 snapshotObserver = ((C0997t) a3).getSnapshotObserver();
            E2.j jVar = new E2.j(this, c0910s, l3, 4);
            snapshotObserver.getClass();
            if (d3.f7718f != null) {
                snapshotObserver.a(d3, snapshotObserver.f7932h, jVar);
            } else {
                snapshotObserver.a(d3, snapshotObserver.f7929e, jVar);
            }
            l3.f7799c = i7;
            if (l3.f7811o && c0910s.f7825k) {
                requestLayout();
            }
            l3.f7805i = false;
        }
        if (e3.f7741d) {
            e3.f7742e = true;
        }
        if (e3.f7739b && e3.e()) {
            e3.g();
        }
        this.f7768w = false;
    }

    public final void e0() {
        L l3;
        int i3;
        this.f7771z = true;
        D q2 = this.f7754A.f7797a.q();
        if (!this.f7764s) {
            W();
            if (this.f7755i && q2 != null) {
                q2.O(false);
            }
        }
        if (q2 == null) {
            this.f7757k = 0;
        } else if (!this.f7755i && ((i3 = (l3 = q2.f7736y).f7799c) == 3 || i3 == 4)) {
            if (this.f7757k != Integer.MAX_VALUE) {
                AbstractC0381e.N("Place was called on a node which was placed already");
                throw null;
            }
            int i4 = l3.f7806j;
            this.f7757k = i4;
            l3.f7806j = i4 + 1;
        }
        e();
    }

    public final void f0(long j3, Y1.c cVar) {
        L l3 = this.f7754A;
        if (l3.f7797a.f7713F) {
            AbstractC0381e.M("place is called on a deactivated node");
            throw null;
        }
        l3.f7799c = 4;
        this.f7760n = true;
        this.f7771z = false;
        if (!M0.g.a(j3, this.f7762q)) {
            if (l3.p || l3.f7811o) {
                l3.f7804h = true;
            }
            d0();
        }
        D d3 = l3.f7797a;
        g0 a3 = G.a(d3);
        if (l3.f7804h || !this.f7764s) {
            l3.f(false);
            this.f7765t.f7744g = false;
            i0 snapshotObserver = ((C0997t) a3).getSnapshotObserver();
            H h3 = new H(l3, a3, j3);
            snapshotObserver.getClass();
            if (d3.f7718f != null) {
                snapshotObserver.a(d3, snapshotObserver.f7931g, h3);
            } else {
                snapshotObserver.a(d3, snapshotObserver.f7930f, h3);
            }
        } else {
            P z02 = l3.a().z0();
            Z1.i.c(z02);
            z02.r0(M0.g.c(j3, z02.f7118h));
            e0();
        }
        this.f7762q = j3;
        this.f7763r = cVar;
        l3.f7799c = 5;
    }

    @Override // t0.InterfaceC0893a
    public final boolean h() {
        return this.f7764s;
    }

    @Override // t0.InterfaceC0893a
    public final E i() {
        return this.f7765t;
    }

    public final boolean j0(long j3) {
        L l3 = this.f7754A;
        D d3 = l3.f7797a;
        if (d3.f7713F) {
            AbstractC0381e.M("measure is called on a deactivated node");
            throw null;
        }
        D q2 = d3.q();
        D d4 = l3.f7797a;
        d4.f7734w = d4.f7734w || (q2 != null && q2.f7734w);
        if (!d4.f7736y.f7803g) {
            M0.a aVar = this.p;
            if (aVar == null ? false : M0.a.b(aVar.f2760a, j3)) {
                C0997t c0997t = d4.f7724l;
                if (c0997t != null) {
                    c0997t.f8416J.f(d4, true);
                }
                d4.T();
                return false;
            }
        }
        this.p = new M0.a(j3);
        U(j3);
        this.f7765t.f7743f = false;
        K.d t3 = d4.t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                I i5 = ((D) objArr[i4]).f7736y.f7814s;
                Z1.i.c(i5);
                i5.f7765t.f7740c = false;
                i4++;
            } while (i4 < i3);
        }
        long e3 = this.f7761o ? this.f7116f : I2.l.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f7761o = true;
        P z02 = l3.a().z0();
        if (!(z02 != null)) {
            AbstractC0381e.N("Lookahead result from lookaheadRemeasure cannot be null");
            throw null;
        }
        l3.f7799c = 2;
        l3.f7803g = false;
        i0 snapshotObserver = ((C0997t) G.a(d4)).getSnapshotObserver();
        K k3 = new K(l3, j3);
        snapshotObserver.getClass();
        if (d4.f7718f != null) {
            snapshotObserver.a(d4, snapshotObserver.f7926b, k3);
        } else {
            snapshotObserver.a(d4, snapshotObserver.f7927c, k3);
        }
        l3.f7804h = true;
        l3.f7805i = true;
        if (AbstractC0898f.p(d4)) {
            l3.f7801e = true;
            l3.f7802f = true;
        } else {
            l3.f7800d = true;
        }
        l3.f7799c = 5;
        T(I2.l.e(z02.f7114d, z02.f7115e));
        return (((int) (e3 >> 32)) == z02.f7114d && ((int) (4294967295L & e3)) == z02.f7115e) ? false : true;
    }

    @Override // r0.H, r0.z
    public final Object r() {
        return this.f7770y;
    }

    @Override // t0.InterfaceC0893a
    public final void requestLayout() {
        this.f7754A.f7797a.O(false);
    }

    @Override // t0.U
    public final void v(boolean z3) {
        P z02;
        L l3 = this.f7754A;
        P z03 = l3.a().z0();
        if (Boolean.valueOf(z3).equals(z03 != null ? Boolean.valueOf(z03.f7823i) : null) || (z02 = l3.a().z0()) == null) {
            return;
        }
        z02.f7823i = z3;
    }
}
