package s;

import java.util.ArrayList;
import q.AbstractC0273e;
import q.C0270b;
import q.C0271c;
import q.C0274f;

/* loaded from: classes.dex */
public final class h extends C0281d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3732q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3733r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3734s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C0280c f3735t0 = this.f3611J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3736u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3737v0;

    public h() {
        this.f3619R.clear();
        this.f3619R.add(this.f3735t0);
        int length = this.f3618Q.length;
        for (int i = 0; i < length; i++) {
            this.f3618Q[i] = this.f3735t0;
        }
    }

    @Override // s.C0281d
    public final boolean A() {
        return this.f3737v0;
    }

    @Override // s.C0281d
    public final boolean B() {
        return this.f3737v0;
    }

    @Override // s.C0281d
    public final void Q(C0271c c0271c, boolean z2) {
        if (this.f3621T == null) {
            return;
        }
        C0280c c0280c = this.f3735t0;
        c0271c.getClass();
        int n2 = C0271c.n(c0280c);
        if (this.f3736u0 == 1) {
            this.f3626Y = n2;
            this.f3627Z = 0;
            L(this.f3621T.k());
            O(0);
            return;
        }
        this.f3626Y = 0;
        this.f3627Z = n2;
        O(this.f3621T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3735t0.l(i);
        this.f3737v0 = true;
    }

    public final void S(int i) {
        if (this.f3736u0 == i) {
            return;
        }
        this.f3736u0 = i;
        ArrayList arrayList = this.f3619R;
        arrayList.clear();
        if (this.f3736u0 == 1) {
            this.f3735t0 = this.f3610I;
        } else {
            this.f3735t0 = this.f3611J;
        }
        arrayList.add(this.f3735t0);
        C0280c[] c0280cArr = this.f3618Q;
        int length = c0280cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0280cArr[i2] = this.f3735t0;
        }
    }

    @Override // s.C0281d
    public final void b(C0271c c0271c, boolean z2) {
        C0282e c0282e = (C0282e) this.f3621T;
        if (c0282e == null) {
            return;
        }
        Object i = c0282e.i(2);
        Object i2 = c0282e.i(4);
        C0281d c0281d = this.f3621T;
        boolean z3 = c0281d != null && c0281d.f3654p0[0] == 2;
        if (this.f3736u0 == 0) {
            i = c0282e.i(3);
            i2 = c0282e.i(5);
            C0281d c0281d2 = this.f3621T;
            z3 = c0281d2 != null && c0281d2.f3654p0[1] == 2;
        }
        if (this.f3737v0) {
            C0280c c0280c = this.f3735t0;
            if (c0280c.f3599c) {
                C0274f k2 = c0271c.k(c0280c);
                c0271c.d(k2, this.f3735t0.d());
                if (this.f3733r0 != -1) {
                    if (z3) {
                        c0271c.f(c0271c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3734s0 != -1 && z3) {
                    C0274f k3 = c0271c.k(i2);
                    c0271c.f(k2, c0271c.k(i), 0, 5);
                    c0271c.f(k3, k2, 0, 5);
                }
                this.f3737v0 = false;
                return;
            }
        }
        if (this.f3733r0 != -1) {
            C0274f k4 = c0271c.k(this.f3735t0);
            c0271c.e(k4, c0271c.k(i), this.f3733r0, 8);
            if (z3) {
                c0271c.f(c0271c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3734s0 != -1) {
            C0274f k5 = c0271c.k(this.f3735t0);
            C0274f k6 = c0271c.k(i2);
            c0271c.e(k5, k6, -this.f3734s0, 8);
            if (z3) {
                c0271c.f(k5, c0271c.k(i), 0, 5);
                c0271c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f3732q0 != -1.0f) {
            C0274f k7 = c0271c.k(this.f3735t0);
            C0274f k8 = c0271c.k(i2);
            float f2 = this.f3732q0;
            C0270b l2 = c0271c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0271c.c(l2);
        }
    }

    @Override // s.C0281d
    public final boolean c() {
        return true;
    }

    @Override // s.C0281d
    public final C0280c i(int i) {
        int a2 = AbstractC0273e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3736u0 == 0) {
                return this.f3735t0;
            }
            return null;
        }
        if (this.f3736u0 == 1) {
            return this.f3735t0;
        }
        return null;
    }
}
