package s;

import java.util.ArrayList;
import q.AbstractC0285e;
import q.C0282b;
import q.C0283c;
import q.C0286f;

/* loaded from: classes.dex */
public final class h extends C0295d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3792q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3793r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3794s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C0294c f3795t0 = this.f3671J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3796u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3797v0;

    public h() {
        this.f3679R.clear();
        this.f3679R.add(this.f3795t0);
        int length = this.f3678Q.length;
        for (int i = 0; i < length; i++) {
            this.f3678Q[i] = this.f3795t0;
        }
    }

    @Override // s.C0295d
    public final boolean A() {
        return this.f3797v0;
    }

    @Override // s.C0295d
    public final boolean B() {
        return this.f3797v0;
    }

    @Override // s.C0295d
    public final void Q(C0283c c0283c, boolean z2) {
        if (this.f3681T == null) {
            return;
        }
        C0294c c0294c = this.f3795t0;
        c0283c.getClass();
        int n2 = C0283c.n(c0294c);
        if (this.f3796u0 == 1) {
            this.f3686Y = n2;
            this.f3687Z = 0;
            L(this.f3681T.k());
            O(0);
            return;
        }
        this.f3686Y = 0;
        this.f3687Z = n2;
        O(this.f3681T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3795t0.l(i);
        this.f3797v0 = true;
    }

    public final void S(int i) {
        if (this.f3796u0 == i) {
            return;
        }
        this.f3796u0 = i;
        ArrayList arrayList = this.f3679R;
        arrayList.clear();
        if (this.f3796u0 == 1) {
            this.f3795t0 = this.f3670I;
        } else {
            this.f3795t0 = this.f3671J;
        }
        arrayList.add(this.f3795t0);
        C0294c[] c0294cArr = this.f3678Q;
        int length = c0294cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0294cArr[i2] = this.f3795t0;
        }
    }

    @Override // s.C0295d
    public final void b(C0283c c0283c, boolean z2) {
        C0296e c0296e = (C0296e) this.f3681T;
        if (c0296e == null) {
            return;
        }
        Object i = c0296e.i(2);
        Object i2 = c0296e.i(4);
        C0295d c0295d = this.f3681T;
        boolean z3 = c0295d != null && c0295d.f3714p0[0] == 2;
        if (this.f3796u0 == 0) {
            i = c0296e.i(3);
            i2 = c0296e.i(5);
            C0295d c0295d2 = this.f3681T;
            z3 = c0295d2 != null && c0295d2.f3714p0[1] == 2;
        }
        if (this.f3797v0) {
            C0294c c0294c = this.f3795t0;
            if (c0294c.f3659c) {
                C0286f k2 = c0283c.k(c0294c);
                c0283c.d(k2, this.f3795t0.d());
                if (this.f3793r0 != -1) {
                    if (z3) {
                        c0283c.f(c0283c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3794s0 != -1 && z3) {
                    C0286f k3 = c0283c.k(i2);
                    c0283c.f(k2, c0283c.k(i), 0, 5);
                    c0283c.f(k3, k2, 0, 5);
                }
                this.f3797v0 = false;
                return;
            }
        }
        if (this.f3793r0 != -1) {
            C0286f k4 = c0283c.k(this.f3795t0);
            c0283c.e(k4, c0283c.k(i), this.f3793r0, 8);
            if (z3) {
                c0283c.f(c0283c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3794s0 != -1) {
            C0286f k5 = c0283c.k(this.f3795t0);
            C0286f k6 = c0283c.k(i2);
            c0283c.e(k5, k6, -this.f3794s0, 8);
            if (z3) {
                c0283c.f(k5, c0283c.k(i), 0, 5);
                c0283c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f3792q0 != -1.0f) {
            C0286f k7 = c0283c.k(this.f3795t0);
            C0286f k8 = c0283c.k(i2);
            float f2 = this.f3792q0;
            C0282b l2 = c0283c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0283c.c(l2);
        }
    }

    @Override // s.C0295d
    public final boolean c() {
        return true;
    }

    @Override // s.C0295d
    public final C0294c i(int i) {
        int a2 = AbstractC0285e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3796u0 == 0) {
                return this.f3795t0;
            }
            return null;
        }
        if (this.f3796u0 == 1) {
            return this.f3795t0;
        }
        return null;
    }
}
