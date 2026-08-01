package t;

import java.util.ArrayList;
import r.AbstractC0290e;
import r.C0287b;
import r.C0288c;
import r.C0291f;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3884q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3885r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3886s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f3887t0 = this.f3759J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3888u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3889v0;

    public h() {
        this.f3767R.clear();
        this.f3767R.add(this.f3887t0);
        int length = this.f3766Q.length;
        for (int i = 0; i < length; i++) {
            this.f3766Q[i] = this.f3887t0;
        }
    }

    @Override // t.d
    public final boolean A() {
        return this.f3889v0;
    }

    @Override // t.d
    public final boolean B() {
        return this.f3889v0;
    }

    @Override // t.d
    public final void Q(C0288c c0288c, boolean z2) {
        if (this.f3769T == null) {
            return;
        }
        c cVar = this.f3887t0;
        c0288c.getClass();
        int n2 = C0288c.n(cVar);
        if (this.f3888u0 == 1) {
            this.f3774Y = n2;
            this.f3775Z = 0;
            L(this.f3769T.k());
            O(0);
            return;
        }
        this.f3774Y = 0;
        this.f3775Z = n2;
        O(this.f3769T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3887t0.l(i);
        this.f3889v0 = true;
    }

    public final void S(int i) {
        if (this.f3888u0 == i) {
            return;
        }
        this.f3888u0 = i;
        ArrayList arrayList = this.f3767R;
        arrayList.clear();
        if (this.f3888u0 == 1) {
            this.f3887t0 = this.f3758I;
        } else {
            this.f3887t0 = this.f3759J;
        }
        arrayList.add(this.f3887t0);
        c[] cVarArr = this.f3766Q;
        int length = cVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            cVarArr[i2] = this.f3887t0;
        }
    }

    @Override // t.d
    public final void b(C0288c c0288c, boolean z2) {
        e eVar = (e) this.f3769T;
        if (eVar == null) {
            return;
        }
        Object i = eVar.i(2);
        Object i2 = eVar.i(4);
        d dVar = this.f3769T;
        boolean z3 = dVar != null && dVar.p0[0] == 2;
        if (this.f3888u0 == 0) {
            i = eVar.i(3);
            i2 = eVar.i(5);
            d dVar2 = this.f3769T;
            z3 = dVar2 != null && dVar2.p0[1] == 2;
        }
        if (this.f3889v0) {
            c cVar = this.f3887t0;
            if (cVar.f3746c) {
                C0291f k2 = c0288c.k(cVar);
                c0288c.d(k2, this.f3887t0.d());
                if (this.f3885r0 != -1) {
                    if (z3) {
                        c0288c.f(c0288c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3886s0 != -1 && z3) {
                    C0291f k3 = c0288c.k(i2);
                    c0288c.f(k2, c0288c.k(i), 0, 5);
                    c0288c.f(k3, k2, 0, 5);
                }
                this.f3889v0 = false;
                return;
            }
        }
        if (this.f3885r0 != -1) {
            C0291f k4 = c0288c.k(this.f3887t0);
            c0288c.e(k4, c0288c.k(i), this.f3885r0, 8);
            if (z3) {
                c0288c.f(c0288c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3886s0 != -1) {
            C0291f k5 = c0288c.k(this.f3887t0);
            C0291f k6 = c0288c.k(i2);
            c0288c.e(k5, k6, -this.f3886s0, 8);
            if (z3) {
                c0288c.f(k5, c0288c.k(i), 0, 5);
                c0288c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f3884q0 != -1.0f) {
            C0291f k7 = c0288c.k(this.f3887t0);
            C0291f k8 = c0288c.k(i2);
            float f2 = this.f3884q0;
            C0287b l2 = c0288c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0288c.c(l2);
        }
    }

    @Override // t.d
    public final boolean c() {
        return true;
    }

    @Override // t.d
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
            if (this.f3888u0 == 0) {
                return this.f3887t0;
            }
            return null;
        }
        if (this.f3888u0 == 1) {
            return this.f3887t0;
        }
        return null;
    }
}
