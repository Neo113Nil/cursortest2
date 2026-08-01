package s;

import java.util.ArrayList;
import q.AbstractC0290e;
import q.C0287b;
import q.C0288c;
import q.C0291f;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3707q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3708r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3709s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f3710t0 = this.f3583J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3711u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3712v0;

    public h() {
        this.f3591R.clear();
        this.f3591R.add(this.f3710t0);
        int length = this.f3590Q.length;
        for (int i = 0; i < length; i++) {
            this.f3590Q[i] = this.f3710t0;
        }
    }

    @Override // s.d
    public final boolean A() {
        return this.f3712v0;
    }

    @Override // s.d
    public final boolean B() {
        return this.f3712v0;
    }

    @Override // s.d
    public final void Q(C0288c c0288c, boolean z2) {
        if (this.f3593T == null) {
            return;
        }
        c cVar = this.f3710t0;
        c0288c.getClass();
        int n2 = C0288c.n(cVar);
        if (this.f3711u0 == 1) {
            this.f3598Y = n2;
            this.f3599Z = 0;
            L(this.f3593T.k());
            O(0);
            return;
        }
        this.f3598Y = 0;
        this.f3599Z = n2;
        O(this.f3593T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3710t0.l(i);
        this.f3712v0 = true;
    }

    public final void S(int i) {
        if (this.f3711u0 == i) {
            return;
        }
        this.f3711u0 = i;
        ArrayList arrayList = this.f3591R;
        arrayList.clear();
        if (this.f3711u0 == 1) {
            this.f3710t0 = this.f3582I;
        } else {
            this.f3710t0 = this.f3583J;
        }
        arrayList.add(this.f3710t0);
        c[] cVarArr = this.f3590Q;
        int length = cVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            cVarArr[i2] = this.f3710t0;
        }
    }

    @Override // s.d
    public final void b(C0288c c0288c, boolean z2) {
        e eVar = (e) this.f3593T;
        if (eVar == null) {
            return;
        }
        Object i = eVar.i(2);
        Object i2 = eVar.i(4);
        d dVar = this.f3593T;
        boolean z3 = dVar != null && dVar.f3627p0[0] == 2;
        if (this.f3711u0 == 0) {
            i = eVar.i(3);
            i2 = eVar.i(5);
            d dVar2 = this.f3593T;
            z3 = dVar2 != null && dVar2.f3627p0[1] == 2;
        }
        if (this.f3712v0) {
            c cVar = this.f3710t0;
            if (cVar.f3571c) {
                C0291f k2 = c0288c.k(cVar);
                c0288c.d(k2, this.f3710t0.d());
                if (this.f3708r0 != -1) {
                    if (z3) {
                        c0288c.f(c0288c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3709s0 != -1 && z3) {
                    C0291f k3 = c0288c.k(i2);
                    c0288c.f(k2, c0288c.k(i), 0, 5);
                    c0288c.f(k3, k2, 0, 5);
                }
                this.f3712v0 = false;
                return;
            }
        }
        if (this.f3708r0 != -1) {
            C0291f k4 = c0288c.k(this.f3710t0);
            c0288c.e(k4, c0288c.k(i), this.f3708r0, 8);
            if (z3) {
                c0288c.f(c0288c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3709s0 != -1) {
            C0291f k5 = c0288c.k(this.f3710t0);
            C0291f k6 = c0288c.k(i2);
            c0288c.e(k5, k6, -this.f3709s0, 8);
            if (z3) {
                c0288c.f(k5, c0288c.k(i), 0, 5);
                c0288c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f3707q0 != -1.0f) {
            C0291f k7 = c0288c.k(this.f3710t0);
            C0291f k8 = c0288c.k(i2);
            float f2 = this.f3707q0;
            C0287b l2 = c0288c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0288c.c(l2);
        }
    }

    @Override // s.d
    public final boolean c() {
        return true;
    }

    @Override // s.d
    public final c i(int i) {
        int a2 = AbstractC0290e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3711u0 == 0) {
                return this.f3710t0;
            }
            return null;
        }
        if (this.f3711u0 == 1) {
            return this.f3710t0;
        }
        return null;
    }
}
