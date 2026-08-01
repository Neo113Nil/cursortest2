package s;

import java.util.ArrayList;
import q.AbstractC0288e;
import q.C0285b;
import q.C0286c;
import q.C0289f;

/* loaded from: classes.dex */
public final class h extends C0296d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3679q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3680r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3681s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C0295c f3682t0 = this.f3557J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3683u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3684v0;

    public h() {
        this.f3565R.clear();
        this.f3565R.add(this.f3682t0);
        int length = this.f3564Q.length;
        for (int i = 0; i < length; i++) {
            this.f3564Q[i] = this.f3682t0;
        }
    }

    @Override // s.C0296d
    public final boolean A() {
        return this.f3684v0;
    }

    @Override // s.C0296d
    public final boolean B() {
        return this.f3684v0;
    }

    @Override // s.C0296d
    public final void Q(C0286c c0286c, boolean z2) {
        if (this.f3567T == null) {
            return;
        }
        C0295c c0295c = this.f3682t0;
        c0286c.getClass();
        int n2 = C0286c.n(c0295c);
        if (this.f3683u0 == 1) {
            this.f3572Y = n2;
            this.f3573Z = 0;
            L(this.f3567T.k());
            O(0);
            return;
        }
        this.f3572Y = 0;
        this.f3573Z = n2;
        O(this.f3567T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3682t0.l(i);
        this.f3684v0 = true;
    }

    public final void S(int i) {
        if (this.f3683u0 == i) {
            return;
        }
        this.f3683u0 = i;
        ArrayList arrayList = this.f3565R;
        arrayList.clear();
        if (this.f3683u0 == 1) {
            this.f3682t0 = this.f3556I;
        } else {
            this.f3682t0 = this.f3557J;
        }
        arrayList.add(this.f3682t0);
        C0295c[] c0295cArr = this.f3564Q;
        int length = c0295cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0295cArr[i2] = this.f3682t0;
        }
    }

    @Override // s.C0296d
    public final void b(C0286c c0286c, boolean z2) {
        C0297e c0297e = (C0297e) this.f3567T;
        if (c0297e == null) {
            return;
        }
        Object i = c0297e.i(2);
        Object i2 = c0297e.i(4);
        C0296d c0296d = this.f3567T;
        boolean z3 = c0296d != null && c0296d.f3601p0[0] == 2;
        if (this.f3683u0 == 0) {
            i = c0297e.i(3);
            i2 = c0297e.i(5);
            C0296d c0296d2 = this.f3567T;
            z3 = c0296d2 != null && c0296d2.f3601p0[1] == 2;
        }
        if (this.f3684v0) {
            C0295c c0295c = this.f3682t0;
            if (c0295c.f3545c) {
                C0289f k2 = c0286c.k(c0295c);
                c0286c.d(k2, this.f3682t0.d());
                if (this.f3680r0 != -1) {
                    if (z3) {
                        c0286c.f(c0286c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3681s0 != -1 && z3) {
                    C0289f k3 = c0286c.k(i2);
                    c0286c.f(k2, c0286c.k(i), 0, 5);
                    c0286c.f(k3, k2, 0, 5);
                }
                this.f3684v0 = false;
                return;
            }
        }
        if (this.f3680r0 != -1) {
            C0289f k4 = c0286c.k(this.f3682t0);
            c0286c.e(k4, c0286c.k(i), this.f3680r0, 8);
            if (z3) {
                c0286c.f(c0286c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3681s0 != -1) {
            C0289f k5 = c0286c.k(this.f3682t0);
            C0289f k6 = c0286c.k(i2);
            c0286c.e(k5, k6, -this.f3681s0, 8);
            if (z3) {
                c0286c.f(k5, c0286c.k(i), 0, 5);
                c0286c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f3679q0 != -1.0f) {
            C0289f k7 = c0286c.k(this.f3682t0);
            C0289f k8 = c0286c.k(i2);
            float f2 = this.f3679q0;
            C0285b l2 = c0286c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0286c.c(l2);
        }
    }

    @Override // s.C0296d
    public final boolean c() {
        return true;
    }

    @Override // s.C0296d
    public final C0295c i(int i) {
        int a2 = AbstractC0288e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3683u0 == 0) {
                return this.f3682t0;
            }
            return null;
        }
        if (this.f3683u0 == 1) {
            return this.f3682t0;
        }
        return null;
    }
}
