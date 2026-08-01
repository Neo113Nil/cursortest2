package s;

import java.util.ArrayList;
import q.AbstractC0317e;
import q.C0314b;
import q.C0315c;
import q.C0318f;

/* loaded from: classes.dex */
public final class h extends C0340d {
    public float q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3628r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3629s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C0339c f3630t0 = this.f3505J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3631u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3632v0;

    public h() {
        this.f3513R.clear();
        this.f3513R.add(this.f3630t0);
        int length = this.f3512Q.length;
        for (int i = 0; i < length; i++) {
            this.f3512Q[i] = this.f3630t0;
        }
    }

    @Override // s.C0340d
    public final boolean A() {
        return this.f3632v0;
    }

    @Override // s.C0340d
    public final boolean B() {
        return this.f3632v0;
    }

    @Override // s.C0340d
    public final void Q(C0315c c0315c, boolean z2) {
        if (this.f3515T == null) {
            return;
        }
        C0339c c0339c = this.f3630t0;
        c0315c.getClass();
        int n2 = C0315c.n(c0339c);
        if (this.f3631u0 == 1) {
            this.f3520Y = n2;
            this.f3521Z = 0;
            L(this.f3515T.k());
            O(0);
            return;
        }
        this.f3520Y = 0;
        this.f3521Z = n2;
        O(this.f3515T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3630t0.l(i);
        this.f3632v0 = true;
    }

    public final void S(int i) {
        if (this.f3631u0 == i) {
            return;
        }
        this.f3631u0 = i;
        ArrayList arrayList = this.f3513R;
        arrayList.clear();
        if (this.f3631u0 == 1) {
            this.f3630t0 = this.f3504I;
        } else {
            this.f3630t0 = this.f3505J;
        }
        arrayList.add(this.f3630t0);
        C0339c[] c0339cArr = this.f3512Q;
        int length = c0339cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0339cArr[i2] = this.f3630t0;
        }
    }

    @Override // s.C0340d
    public final void b(C0315c c0315c, boolean z2) {
        C0341e c0341e = (C0341e) this.f3515T;
        if (c0341e == null) {
            return;
        }
        Object i = c0341e.i(2);
        Object i2 = c0341e.i(4);
        C0340d c0340d = this.f3515T;
        boolean z3 = c0340d != null && c0340d.f3549p0[0] == 2;
        if (this.f3631u0 == 0) {
            i = c0341e.i(3);
            i2 = c0341e.i(5);
            C0340d c0340d2 = this.f3515T;
            z3 = c0340d2 != null && c0340d2.f3549p0[1] == 2;
        }
        if (this.f3632v0) {
            C0339c c0339c = this.f3630t0;
            if (c0339c.f3493c) {
                C0318f k2 = c0315c.k(c0339c);
                c0315c.d(k2, this.f3630t0.d());
                if (this.f3628r0 != -1) {
                    if (z3) {
                        c0315c.f(c0315c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3629s0 != -1 && z3) {
                    C0318f k3 = c0315c.k(i2);
                    c0315c.f(k2, c0315c.k(i), 0, 5);
                    c0315c.f(k3, k2, 0, 5);
                }
                this.f3632v0 = false;
                return;
            }
        }
        if (this.f3628r0 != -1) {
            C0318f k4 = c0315c.k(this.f3630t0);
            c0315c.e(k4, c0315c.k(i), this.f3628r0, 8);
            if (z3) {
                c0315c.f(c0315c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3629s0 != -1) {
            C0318f k5 = c0315c.k(this.f3630t0);
            C0318f k6 = c0315c.k(i2);
            c0315c.e(k5, k6, -this.f3629s0, 8);
            if (z3) {
                c0315c.f(k5, c0315c.k(i), 0, 5);
                c0315c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            C0318f k7 = c0315c.k(this.f3630t0);
            C0318f k8 = c0315c.k(i2);
            float f2 = this.q0;
            C0314b l2 = c0315c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0315c.c(l2);
        }
    }

    @Override // s.C0340d
    public final boolean c() {
        return true;
    }

    @Override // s.C0340d
    public final C0339c i(int i) {
        int a2 = AbstractC0317e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3631u0 == 0) {
                return this.f3630t0;
            }
            return null;
        }
        if (this.f3631u0 == 1) {
            return this.f3630t0;
        }
        return null;
    }
}
