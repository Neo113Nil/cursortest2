package s;

import java.util.ArrayList;
import q.AbstractC0319e;
import q.C0316b;
import q.C0317c;
import q.C0320f;

/* loaded from: classes.dex */
public final class h extends C0327d {

    /* renamed from: q0, reason: collision with root package name */
    public float f4140q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f4141r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f4142s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C0326c f4143t0 = this.f4017J;

    /* renamed from: u0, reason: collision with root package name */
    public int f4144u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f4145v0;

    public h() {
        this.f4025R.clear();
        this.f4025R.add(this.f4143t0);
        int length = this.f4024Q.length;
        for (int i = 0; i < length; i++) {
            this.f4024Q[i] = this.f4143t0;
        }
    }

    @Override // s.C0327d
    public final boolean A() {
        return this.f4145v0;
    }

    @Override // s.C0327d
    public final boolean B() {
        return this.f4145v0;
    }

    @Override // s.C0327d
    public final void Q(C0317c c0317c, boolean z2) {
        if (this.f4027T == null) {
            return;
        }
        C0326c c0326c = this.f4143t0;
        c0317c.getClass();
        int n2 = C0317c.n(c0326c);
        if (this.f4144u0 == 1) {
            this.f4032Y = n2;
            this.f4033Z = 0;
            L(this.f4027T.k());
            O(0);
            return;
        }
        this.f4032Y = 0;
        this.f4033Z = n2;
        O(this.f4027T.q());
        L(0);
    }

    public final void R(int i) {
        this.f4143t0.l(i);
        this.f4145v0 = true;
    }

    public final void S(int i) {
        if (this.f4144u0 == i) {
            return;
        }
        this.f4144u0 = i;
        ArrayList arrayList = this.f4025R;
        arrayList.clear();
        if (this.f4144u0 == 1) {
            this.f4143t0 = this.f4016I;
        } else {
            this.f4143t0 = this.f4017J;
        }
        arrayList.add(this.f4143t0);
        C0326c[] c0326cArr = this.f4024Q;
        int length = c0326cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0326cArr[i2] = this.f4143t0;
        }
    }

    @Override // s.C0327d
    public final void b(C0317c c0317c, boolean z2) {
        C0328e c0328e = (C0328e) this.f4027T;
        if (c0328e == null) {
            return;
        }
        Object i = c0328e.i(2);
        Object i2 = c0328e.i(4);
        C0327d c0327d = this.f4027T;
        boolean z3 = c0327d != null && c0327d.f4061p0[0] == 2;
        if (this.f4144u0 == 0) {
            i = c0328e.i(3);
            i2 = c0328e.i(5);
            C0327d c0327d2 = this.f4027T;
            z3 = c0327d2 != null && c0327d2.f4061p0[1] == 2;
        }
        if (this.f4145v0) {
            C0326c c0326c = this.f4143t0;
            if (c0326c.f4004c) {
                C0320f k2 = c0317c.k(c0326c);
                c0317c.d(k2, this.f4143t0.d());
                if (this.f4141r0 != -1) {
                    if (z3) {
                        c0317c.f(c0317c.k(i2), k2, 0, 5);
                    }
                } else if (this.f4142s0 != -1 && z3) {
                    C0320f k3 = c0317c.k(i2);
                    c0317c.f(k2, c0317c.k(i), 0, 5);
                    c0317c.f(k3, k2, 0, 5);
                }
                this.f4145v0 = false;
                return;
            }
        }
        if (this.f4141r0 != -1) {
            C0320f k4 = c0317c.k(this.f4143t0);
            c0317c.e(k4, c0317c.k(i), this.f4141r0, 8);
            if (z3) {
                c0317c.f(c0317c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f4142s0 != -1) {
            C0320f k5 = c0317c.k(this.f4143t0);
            C0320f k6 = c0317c.k(i2);
            c0317c.e(k5, k6, -this.f4142s0, 8);
            if (z3) {
                c0317c.f(k5, c0317c.k(i), 0, 5);
                c0317c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f4140q0 != -1.0f) {
            C0320f k7 = c0317c.k(this.f4143t0);
            C0320f k8 = c0317c.k(i2);
            float f2 = this.f4140q0;
            C0316b l2 = c0317c.l();
            l2.f3904d.g(k7, -1.0f);
            l2.f3904d.g(k8, f2);
            c0317c.c(l2);
        }
    }

    @Override // s.C0327d
    public final boolean c() {
        return true;
    }

    @Override // s.C0327d
    public final C0326c i(int i) {
        int a2 = AbstractC0319e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f4144u0 == 0) {
                return this.f4143t0;
            }
            return null;
        }
        if (this.f4144u0 == 1) {
            return this.f4143t0;
        }
        return null;
    }
}
