package u;

import java.util.ArrayList;
import s.AbstractC0267e;
import s.C0264b;
import s.C0265c;
import s.C0268f;

/* loaded from: classes.dex */
public final class h extends C0275d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3773q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3774r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3775s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public C0274c f3776t0 = this.f3649J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3777u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3778v0;

    public h() {
        this.f3657R.clear();
        this.f3657R.add(this.f3776t0);
        int length = this.f3656Q.length;
        for (int i = 0; i < length; i++) {
            this.f3656Q[i] = this.f3776t0;
        }
    }

    @Override // u.C0275d
    public final boolean A() {
        return this.f3778v0;
    }

    @Override // u.C0275d
    public final boolean B() {
        return this.f3778v0;
    }

    @Override // u.C0275d
    public final void Q(C0265c c0265c, boolean z2) {
        if (this.f3659T == null) {
            return;
        }
        C0274c c0274c = this.f3776t0;
        c0265c.getClass();
        int n2 = C0265c.n(c0274c);
        if (this.f3777u0 == 1) {
            this.f3664Y = n2;
            this.f3665Z = 0;
            L(this.f3659T.k());
            O(0);
            return;
        }
        this.f3664Y = 0;
        this.f3665Z = n2;
        O(this.f3659T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3776t0.l(i);
        this.f3778v0 = true;
    }

    public final void S(int i) {
        if (this.f3777u0 == i) {
            return;
        }
        this.f3777u0 = i;
        ArrayList arrayList = this.f3657R;
        arrayList.clear();
        if (this.f3777u0 == 1) {
            this.f3776t0 = this.f3648I;
        } else {
            this.f3776t0 = this.f3649J;
        }
        arrayList.add(this.f3776t0);
        C0274c[] c0274cArr = this.f3656Q;
        int length = c0274cArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0274cArr[i2] = this.f3776t0;
        }
    }

    @Override // u.C0275d
    public final void b(C0265c c0265c, boolean z2) {
        C0276e c0276e = (C0276e) this.f3659T;
        if (c0276e == null) {
            return;
        }
        Object i = c0276e.i(2);
        Object i2 = c0276e.i(4);
        C0275d c0275d = this.f3659T;
        boolean z3 = c0275d != null && c0275d.p0[0] == 2;
        if (this.f3777u0 == 0) {
            i = c0276e.i(3);
            i2 = c0276e.i(5);
            C0275d c0275d2 = this.f3659T;
            z3 = c0275d2 != null && c0275d2.p0[1] == 2;
        }
        if (this.f3778v0) {
            C0274c c0274c = this.f3776t0;
            if (c0274c.f3637c) {
                C0268f k2 = c0265c.k(c0274c);
                c0265c.d(k2, this.f3776t0.d());
                if (this.f3774r0 != -1) {
                    if (z3) {
                        c0265c.f(c0265c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3775s0 != -1 && z3) {
                    C0268f k3 = c0265c.k(i2);
                    c0265c.f(k2, c0265c.k(i), 0, 5);
                    c0265c.f(k3, k2, 0, 5);
                }
                this.f3778v0 = false;
                return;
            }
        }
        if (this.f3774r0 != -1) {
            C0268f k4 = c0265c.k(this.f3776t0);
            c0265c.e(k4, c0265c.k(i), this.f3774r0, 8);
            if (z3) {
                c0265c.f(c0265c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3775s0 != -1) {
            C0268f k5 = c0265c.k(this.f3776t0);
            C0268f k6 = c0265c.k(i2);
            c0265c.e(k5, k6, -this.f3775s0, 8);
            if (z3) {
                c0265c.f(k5, c0265c.k(i), 0, 5);
                c0265c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f3773q0 != -1.0f) {
            C0268f k7 = c0265c.k(this.f3776t0);
            C0268f k8 = c0265c.k(i2);
            float f2 = this.f3773q0;
            C0264b l2 = c0265c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0265c.c(l2);
        }
    }

    @Override // u.C0275d
    public final boolean c() {
        return true;
    }

    @Override // u.C0275d
    public final C0274c i(int i) {
        int a2 = AbstractC0267e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3777u0 == 0) {
                return this.f3776t0;
            }
            return null;
        }
        if (this.f3777u0 == 1) {
            return this.f3776t0;
        }
        return null;
    }
}
