package s;

import java.util.ArrayList;
import q.AbstractC0287e;
import q.C0284b;
import q.C0285c;
import q.C0288f;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3678q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3679r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3680s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f3681t0 = this.f3557J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3682u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3683v0;

    public h() {
        this.f3565R.clear();
        this.f3565R.add(this.f3681t0);
        int length = this.f3564Q.length;
        for (int i = 0; i < length; i++) {
            this.f3564Q[i] = this.f3681t0;
        }
    }

    @Override // s.d
    public final boolean A() {
        return this.f3683v0;
    }

    @Override // s.d
    public final boolean B() {
        return this.f3683v0;
    }

    @Override // s.d
    public final void Q(C0285c c0285c, boolean z2) {
        if (this.f3567T == null) {
            return;
        }
        c cVar = this.f3681t0;
        c0285c.getClass();
        int n2 = C0285c.n(cVar);
        if (this.f3682u0 == 1) {
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
        this.f3681t0.l(i);
        this.f3683v0 = true;
    }

    public final void S(int i) {
        if (this.f3682u0 == i) {
            return;
        }
        this.f3682u0 = i;
        ArrayList arrayList = this.f3565R;
        arrayList.clear();
        if (this.f3682u0 == 1) {
            this.f3681t0 = this.f3556I;
        } else {
            this.f3681t0 = this.f3557J;
        }
        arrayList.add(this.f3681t0);
        c[] cVarArr = this.f3564Q;
        int length = cVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            cVarArr[i2] = this.f3681t0;
        }
    }

    @Override // s.d
    public final void b(C0285c c0285c, boolean z2) {
        e eVar = (e) this.f3567T;
        if (eVar == null) {
            return;
        }
        Object i = eVar.i(2);
        Object i2 = eVar.i(4);
        d dVar = this.f3567T;
        boolean z3 = dVar != null && dVar.f3600p0[0] == 2;
        if (this.f3682u0 == 0) {
            i = eVar.i(3);
            i2 = eVar.i(5);
            d dVar2 = this.f3567T;
            z3 = dVar2 != null && dVar2.f3600p0[1] == 2;
        }
        if (this.f3683v0) {
            c cVar = this.f3681t0;
            if (cVar.f3545c) {
                C0288f k2 = c0285c.k(cVar);
                c0285c.d(k2, this.f3681t0.d());
                if (this.f3679r0 != -1) {
                    if (z3) {
                        c0285c.f(c0285c.k(i2), k2, 0, 5);
                    }
                } else if (this.f3680s0 != -1 && z3) {
                    C0288f k3 = c0285c.k(i2);
                    c0285c.f(k2, c0285c.k(i), 0, 5);
                    c0285c.f(k3, k2, 0, 5);
                }
                this.f3683v0 = false;
                return;
            }
        }
        if (this.f3679r0 != -1) {
            C0288f k4 = c0285c.k(this.f3681t0);
            c0285c.e(k4, c0285c.k(i), this.f3679r0, 8);
            if (z3) {
                c0285c.f(c0285c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f3680s0 != -1) {
            C0288f k5 = c0285c.k(this.f3681t0);
            C0288f k6 = c0285c.k(i2);
            c0285c.e(k5, k6, -this.f3680s0, 8);
            if (z3) {
                c0285c.f(k5, c0285c.k(i), 0, 5);
                c0285c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f3678q0 != -1.0f) {
            C0288f k7 = c0285c.k(this.f3681t0);
            C0288f k8 = c0285c.k(i2);
            float f2 = this.f3678q0;
            C0284b l2 = c0285c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0285c.c(l2);
        }
    }

    @Override // s.d
    public final boolean c() {
        return true;
    }

    @Override // s.d
    public final c i(int i) {
        int a2 = AbstractC0287e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3682u0 == 0) {
                return this.f3681t0;
            }
            return null;
        }
        if (this.f3682u0 == 1) {
            return this.f3681t0;
        }
        return null;
    }
}
