package s;

import java.util.ArrayList;
import q.AbstractC0285e;
import q.C0282b;
import q.C0283c;
import q.C0286f;

/* loaded from: classes.dex */
public final class h extends C0293d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3656q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3657r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3658s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C0292c f3659t0 = this.f3533J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3660u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3661v0;

    public h() {
        this.f3541R.clear();
        this.f3541R.add(this.f3659t0);
        int length = this.f3540Q.length;
        for (int i = 0; i < length; i++) {
            this.f3540Q[i] = this.f3659t0;
        }
    }

    @Override // s.C0293d
    public final boolean A() {
        return this.f3661v0;
    }

    @Override // s.C0293d
    public final boolean B() {
        return this.f3661v0;
    }

    @Override // s.C0293d
    public final void Q(C0283c c0283c, boolean z2) {
        if (this.f3543T == null) {
            return;
        }
        C0292c c0292c = this.f3659t0;
        c0283c.getClass();
        int n2 = C0283c.n(c0292c);
        if (this.f3660u0 == 1) {
            this.f3548Y = n2;
            this.f3549Z = 0;
            L(this.f3543T.k());
            O(0);
            return;
        }
        this.f3548Y = 0;
        this.f3549Z = n2;
        O(this.f3543T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3659t0.l(i);
        this.f3661v0 = true;
    }

    public final void S(int i) {
        if (this.f3660u0 == i) {
            return;
        }
        this.f3660u0 = i;
        ArrayList arrayList = this.f3541R;
        arrayList.clear();
        if (this.f3660u0 == 1) {
            this.f3659t0 = this.f3532I;
        } else {
            this.f3659t0 = this.f3533J;
        }
        arrayList.add(this.f3659t0);
        C0292c[] c0292cArr = this.f3540Q;
        int length = c0292cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0292cArr[i2] = this.f3659t0;
        }
    }

    @Override // s.C0293d
    public final void b(C0283c c0283c, boolean z2) {
        C0294e c0294e = (C0294e) this.f3543T;
        if (c0294e == null) {
            return;
        }
        Object i = c0294e.i(2);
        Object i2 = c0294e.i(4);
        C0293d c0293d = this.f3543T;
        boolean z3 = c0293d != null && c0293d.f3577p0[0] == 2;
        if (this.f3660u0 == 0) {
            i = c0294e.i(3);
            i2 = c0294e.i(5);
            C0293d c0293d2 = this.f3543T;
            z3 = c0293d2 != null && c0293d2.f3577p0[1] == 2;
        }
        if (this.f3661v0) {
            C0292c c0292c = this.f3659t0;
            if (c0292c.f3521c) {
                C0286f k2 = c0283c.k(c0292c);
                c0283c.d(k2, this.f3659t0.d());
                if (this.f3657r0 != -1) {
                    if (z3) {
                        c0283c.f(c0283c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3658s0 != -1 && z3) {
                    C0286f k3 = c0283c.k(i2);
                    c0283c.f(k2, c0283c.k(i), 0, 5);
                    c0283c.f(k3, k2, 0, 5);
                }
                this.f3661v0 = false;
                return;
            }
        }
        if (this.f3657r0 != -1) {
            C0286f k4 = c0283c.k(this.f3659t0);
            c0283c.e(k4, c0283c.k(i), this.f3657r0, 8);
            if (z3) {
                c0283c.f(c0283c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3658s0 != -1) {
            C0286f k5 = c0283c.k(this.f3659t0);
            C0286f k6 = c0283c.k(i2);
            c0283c.e(k5, k6, -this.f3658s0, 8);
            if (z3) {
                c0283c.f(k5, c0283c.k(i), 0, 5);
                c0283c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f3656q0 != -1.0f) {
            C0286f k7 = c0283c.k(this.f3659t0);
            C0286f k8 = c0283c.k(i2);
            float f2 = this.f3656q0;
            C0282b l2 = c0283c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0283c.c(l2);
        }
    }

    @Override // s.C0293d
    public final boolean c() {
        return true;
    }

    @Override // s.C0293d
    public final C0292c i(int i) {
        int a2 = AbstractC0285e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3660u0 == 0) {
                return this.f3659t0;
            }
            return null;
        }
        if (this.f3660u0 == 1) {
            return this.f3659t0;
        }
        return null;
    }
}
