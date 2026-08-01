package s;

import java.util.ArrayList;
import q.AbstractC0317e;
import q.C0314b;
import q.C0315c;
import q.C0318f;

/* loaded from: classes.dex */
public final class h extends C0325d {

    /* renamed from: q0, reason: collision with root package name */
    public float f4136q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f4137r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f4138s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C0324c f4139t0 = this.f4013J;

    /* renamed from: u0, reason: collision with root package name */
    public int f4140u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f4141v0;

    public h() {
        this.f4021R.clear();
        this.f4021R.add(this.f4139t0);
        int length = this.f4020Q.length;
        for (int i = 0; i < length; i++) {
            this.f4020Q[i] = this.f4139t0;
        }
    }

    @Override // s.C0325d
    public final boolean A() {
        return this.f4141v0;
    }

    @Override // s.C0325d
    public final boolean B() {
        return this.f4141v0;
    }

    @Override // s.C0325d
    public final void Q(C0315c c0315c, boolean z2) {
        if (this.f4023T == null) {
            return;
        }
        C0324c c0324c = this.f4139t0;
        c0315c.getClass();
        int n2 = C0315c.n(c0324c);
        if (this.f4140u0 == 1) {
            this.f4028Y = n2;
            this.f4029Z = 0;
            L(this.f4023T.k());
            O(0);
            return;
        }
        this.f4028Y = 0;
        this.f4029Z = n2;
        O(this.f4023T.q());
        L(0);
    }

    public final void R(int i) {
        this.f4139t0.l(i);
        this.f4141v0 = true;
    }

    public final void S(int i) {
        if (this.f4140u0 == i) {
            return;
        }
        this.f4140u0 = i;
        ArrayList arrayList = this.f4021R;
        arrayList.clear();
        if (this.f4140u0 == 1) {
            this.f4139t0 = this.f4012I;
        } else {
            this.f4139t0 = this.f4013J;
        }
        arrayList.add(this.f4139t0);
        C0324c[] c0324cArr = this.f4020Q;
        int length = c0324cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0324cArr[i2] = this.f4139t0;
        }
    }

    @Override // s.C0325d
    public final void b(C0315c c0315c, boolean z2) {
        C0326e c0326e = (C0326e) this.f4023T;
        if (c0326e == null) {
            return;
        }
        Object i = c0326e.i(2);
        Object i2 = c0326e.i(4);
        C0325d c0325d = this.f4023T;
        boolean z3 = c0325d != null && c0325d.f4057p0[0] == 2;
        if (this.f4140u0 == 0) {
            i = c0326e.i(3);
            i2 = c0326e.i(5);
            C0325d c0325d2 = this.f4023T;
            z3 = c0325d2 != null && c0325d2.f4057p0[1] == 2;
        }
        if (this.f4141v0) {
            C0324c c0324c = this.f4139t0;
            if (c0324c.f4000c) {
                C0318f k2 = c0315c.k(c0324c);
                c0315c.d(k2, this.f4139t0.d());
                if (this.f4137r0 != -1) {
                    if (z3) {
                        c0315c.f(c0315c.k(i2), k2, 0, 5);
                    }
                } else if (this.f4138s0 != -1 && z3) {
                    C0318f k3 = c0315c.k(i2);
                    c0315c.f(k2, c0315c.k(i), 0, 5);
                    c0315c.f(k3, k2, 0, 5);
                }
                this.f4141v0 = false;
                return;
            }
        }
        if (this.f4137r0 != -1) {
            C0318f k4 = c0315c.k(this.f4139t0);
            c0315c.e(k4, c0315c.k(i), this.f4137r0, 8);
            if (z3) {
                c0315c.f(c0315c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f4138s0 != -1) {
            C0318f k5 = c0315c.k(this.f4139t0);
            C0318f k6 = c0315c.k(i2);
            c0315c.e(k5, k6, -this.f4138s0, 8);
            if (z3) {
                c0315c.f(k5, c0315c.k(i), 0, 5);
                c0315c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f4136q0 != -1.0f) {
            C0318f k7 = c0315c.k(this.f4139t0);
            C0318f k8 = c0315c.k(i2);
            float f2 = this.f4136q0;
            C0314b l2 = c0315c.l();
            l2.f3900d.g(k7, -1.0f);
            l2.f3900d.g(k8, f2);
            c0315c.c(l2);
        }
    }

    @Override // s.C0325d
    public final boolean c() {
        return true;
    }

    @Override // s.C0325d
    public final C0324c i(int i) {
        int a2 = AbstractC0317e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f4140u0 == 0) {
                return this.f4139t0;
            }
            return null;
        }
        if (this.f4140u0 == 1) {
            return this.f4139t0;
        }
        return null;
    }
}
