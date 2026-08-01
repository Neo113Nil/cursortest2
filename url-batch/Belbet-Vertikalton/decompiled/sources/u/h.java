package u;

import java.util.ArrayList;
import s.AbstractC0380e;
import s.C0377b;
import s.C0378c;
import s.C0381f;

/* loaded from: classes.dex */
public final class h extends C0387d {

    /* renamed from: q0, reason: collision with root package name */
    public float f4361q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f4362r0 = -1;
    public int s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C0386c f4363t0 = this.f4237J;

    /* renamed from: u0, reason: collision with root package name */
    public int f4364u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f4365v0;

    public h() {
        this.f4245R.clear();
        this.f4245R.add(this.f4363t0);
        int length = this.f4244Q.length;
        for (int i = 0; i < length; i++) {
            this.f4244Q[i] = this.f4363t0;
        }
    }

    @Override // u.C0387d
    public final boolean A() {
        return this.f4365v0;
    }

    @Override // u.C0387d
    public final boolean B() {
        return this.f4365v0;
    }

    @Override // u.C0387d
    public final void Q(C0378c c0378c, boolean z2) {
        if (this.f4247T == null) {
            return;
        }
        C0386c c0386c = this.f4363t0;
        c0378c.getClass();
        int n2 = C0378c.n(c0386c);
        if (this.f4364u0 == 1) {
            this.f4252Y = n2;
            this.f4253Z = 0;
            L(this.f4247T.k());
            O(0);
            return;
        }
        this.f4252Y = 0;
        this.f4253Z = n2;
        O(this.f4247T.q());
        L(0);
    }

    public final void R(int i) {
        this.f4363t0.l(i);
        this.f4365v0 = true;
    }

    public final void S(int i) {
        if (this.f4364u0 == i) {
            return;
        }
        this.f4364u0 = i;
        ArrayList arrayList = this.f4245R;
        arrayList.clear();
        if (this.f4364u0 == 1) {
            this.f4363t0 = this.f4236I;
        } else {
            this.f4363t0 = this.f4237J;
        }
        arrayList.add(this.f4363t0);
        C0386c[] c0386cArr = this.f4244Q;
        int length = c0386cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0386cArr[i2] = this.f4363t0;
        }
    }

    @Override // u.C0387d
    public final void b(C0378c c0378c, boolean z2) {
        C0388e c0388e = (C0388e) this.f4247T;
        if (c0388e == null) {
            return;
        }
        Object i = c0388e.i(2);
        Object i2 = c0388e.i(4);
        C0387d c0387d = this.f4247T;
        boolean z3 = c0387d != null && c0387d.f4281p0[0] == 2;
        if (this.f4364u0 == 0) {
            i = c0388e.i(3);
            i2 = c0388e.i(5);
            C0387d c0387d2 = this.f4247T;
            z3 = c0387d2 != null && c0387d2.f4281p0[1] == 2;
        }
        if (this.f4365v0) {
            C0386c c0386c = this.f4363t0;
            if (c0386c.f4224c) {
                C0381f k2 = c0378c.k(c0386c);
                c0378c.d(k2, this.f4363t0.d());
                if (this.f4362r0 != -1) {
                    if (z3) {
                        c0378c.f(c0378c.k(i2), k2, 0, 5);
                    }
                } else if (this.s0 != -1 && z3) {
                    C0381f k3 = c0378c.k(i2);
                    c0378c.f(k2, c0378c.k(i), 0, 5);
                    c0378c.f(k3, k2, 0, 5);
                }
                this.f4365v0 = false;
                return;
            }
        }
        if (this.f4362r0 != -1) {
            C0381f k4 = c0378c.k(this.f4363t0);
            c0378c.e(k4, c0378c.k(i), this.f4362r0, 8);
            if (z3) {
                c0378c.f(c0378c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            C0381f k5 = c0378c.k(this.f4363t0);
            C0381f k6 = c0378c.k(i2);
            c0378c.e(k5, k6, -this.s0, 8);
            if (z3) {
                c0378c.f(k5, c0378c.k(i), 0, 5);
                c0378c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f4361q0 != -1.0f) {
            C0381f k7 = c0378c.k(this.f4363t0);
            C0381f k8 = c0378c.k(i2);
            float f2 = this.f4361q0;
            C0377b l2 = c0378c.l();
            l2.f4112d.g(k7, -1.0f);
            l2.f4112d.g(k8, f2);
            c0378c.c(l2);
        }
    }

    @Override // u.C0387d
    public final boolean c() {
        return true;
    }

    @Override // u.C0387d
    public final C0386c i(int i) {
        int a2 = AbstractC0380e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f4364u0 == 0) {
                return this.f4363t0;
            }
            return null;
        }
        if (this.f4364u0 == 1) {
            return this.f4363t0;
        }
        return null;
    }
}
