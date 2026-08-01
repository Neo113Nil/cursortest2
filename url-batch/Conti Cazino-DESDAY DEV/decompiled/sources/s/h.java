package s;

import java.util.ArrayList;
import q.AbstractC0290e;
import q.C0287b;
import q.C0288c;
import q.C0291f;

/* loaded from: classes.dex */
public final class h extends C0298d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3744q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3745r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3746s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C0297c f3747t0 = this.f3621J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3748u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3749v0;

    public h() {
        this.f3629R.clear();
        this.f3629R.add(this.f3747t0);
        int length = this.f3628Q.length;
        for (int i = 0; i < length; i++) {
            this.f3628Q[i] = this.f3747t0;
        }
    }

    @Override // s.C0298d
    public final boolean A() {
        return this.f3749v0;
    }

    @Override // s.C0298d
    public final boolean B() {
        return this.f3749v0;
    }

    @Override // s.C0298d
    public final void Q(C0288c c0288c, boolean z2) {
        if (this.f3631T == null) {
            return;
        }
        C0297c c0297c = this.f3747t0;
        c0288c.getClass();
        int n2 = C0288c.n(c0297c);
        if (this.f3748u0 == 1) {
            this.f3636Y = n2;
            this.f3637Z = 0;
            L(this.f3631T.k());
            O(0);
            return;
        }
        this.f3636Y = 0;
        this.f3637Z = n2;
        O(this.f3631T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3747t0.l(i);
        this.f3749v0 = true;
    }

    public final void S(int i) {
        if (this.f3748u0 == i) {
            return;
        }
        this.f3748u0 = i;
        ArrayList arrayList = this.f3629R;
        arrayList.clear();
        if (this.f3748u0 == 1) {
            this.f3747t0 = this.f3620I;
        } else {
            this.f3747t0 = this.f3621J;
        }
        arrayList.add(this.f3747t0);
        C0297c[] c0297cArr = this.f3628Q;
        int length = c0297cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0297cArr[i2] = this.f3747t0;
        }
    }

    @Override // s.C0298d
    public final void b(C0288c c0288c, boolean z2) {
        C0299e c0299e = (C0299e) this.f3631T;
        if (c0299e == null) {
            return;
        }
        Object i = c0299e.i(2);
        Object i2 = c0299e.i(4);
        C0298d c0298d = this.f3631T;
        boolean z3 = c0298d != null && c0298d.f3665p0[0] == 2;
        if (this.f3748u0 == 0) {
            i = c0299e.i(3);
            i2 = c0299e.i(5);
            C0298d c0298d2 = this.f3631T;
            z3 = c0298d2 != null && c0298d2.f3665p0[1] == 2;
        }
        if (this.f3749v0) {
            C0297c c0297c = this.f3747t0;
            if (c0297c.f3609c) {
                C0291f k2 = c0288c.k(c0297c);
                c0288c.d(k2, this.f3747t0.d());
                if (this.f3745r0 != -1) {
                    if (z3) {
                        c0288c.f(c0288c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3746s0 != -1 && z3) {
                    C0291f k3 = c0288c.k(i2);
                    c0288c.f(k2, c0288c.k(i), 0, 5);
                    c0288c.f(k3, k2, 0, 5);
                }
                this.f3749v0 = false;
                return;
            }
        }
        if (this.f3745r0 != -1) {
            C0291f k4 = c0288c.k(this.f3747t0);
            c0288c.e(k4, c0288c.k(i), this.f3745r0, 8);
            if (z3) {
                c0288c.f(c0288c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3746s0 != -1) {
            C0291f k5 = c0288c.k(this.f3747t0);
            C0291f k6 = c0288c.k(i2);
            c0288c.e(k5, k6, -this.f3746s0, 8);
            if (z3) {
                c0288c.f(k5, c0288c.k(i), 0, 5);
                c0288c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f3744q0 != -1.0f) {
            C0291f k7 = c0288c.k(this.f3747t0);
            C0291f k8 = c0288c.k(i2);
            float f2 = this.f3744q0;
            C0287b l2 = c0288c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0288c.c(l2);
        }
    }

    @Override // s.C0298d
    public final boolean c() {
        return true;
    }

    @Override // s.C0298d
    public final C0297c i(int i) {
        int a2 = AbstractC0290e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3748u0 == 0) {
                return this.f3747t0;
            }
            return null;
        }
        if (this.f3748u0 == 1) {
            return this.f3747t0;
        }
        return null;
    }
}
