package s;

import java.util.ArrayList;
import q.AbstractC0309e;
import q.C0306b;
import q.C0307c;
import q.C0310f;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f4000q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f4001r0 = -1;
    public int s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f4002t0 = this.f3877J;

    /* renamed from: u0, reason: collision with root package name */
    public int f4003u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f4004v0;

    public h() {
        this.f3885R.clear();
        this.f3885R.add(this.f4002t0);
        int length = this.f3884Q.length;
        for (int i = 0; i < length; i++) {
            this.f3884Q[i] = this.f4002t0;
        }
    }

    @Override // s.d
    public final boolean A() {
        return this.f4004v0;
    }

    @Override // s.d
    public final boolean B() {
        return this.f4004v0;
    }

    @Override // s.d
    public final void Q(C0307c c0307c, boolean z2) {
        if (this.f3887T == null) {
            return;
        }
        c cVar = this.f4002t0;
        c0307c.getClass();
        int n2 = C0307c.n(cVar);
        if (this.f4003u0 == 1) {
            this.f3892Y = n2;
            this.f3893Z = 0;
            L(this.f3887T.k());
            O(0);
            return;
        }
        this.f3892Y = 0;
        this.f3893Z = n2;
        O(this.f3887T.q());
        L(0);
    }

    public final void R(int i) {
        this.f4002t0.l(i);
        this.f4004v0 = true;
    }

    public final void S(int i) {
        if (this.f4003u0 == i) {
            return;
        }
        this.f4003u0 = i;
        ArrayList arrayList = this.f3885R;
        arrayList.clear();
        if (this.f4003u0 == 1) {
            this.f4002t0 = this.f3876I;
        } else {
            this.f4002t0 = this.f3877J;
        }
        arrayList.add(this.f4002t0);
        c[] cVarArr = this.f3884Q;
        int length = cVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            cVarArr[i2] = this.f4002t0;
        }
    }

    @Override // s.d
    public final void b(C0307c c0307c, boolean z2) {
        e eVar = (e) this.f3887T;
        if (eVar == null) {
            return;
        }
        Object i = eVar.i(2);
        Object i2 = eVar.i(4);
        d dVar = this.f3887T;
        boolean z3 = dVar != null && dVar.f3921p0[0] == 2;
        if (this.f4003u0 == 0) {
            i = eVar.i(3);
            i2 = eVar.i(5);
            d dVar2 = this.f3887T;
            z3 = dVar2 != null && dVar2.f3921p0[1] == 2;
        }
        if (this.f4004v0) {
            c cVar = this.f4002t0;
            if (cVar.f3865c) {
                C0310f k2 = c0307c.k(cVar);
                c0307c.d(k2, this.f4002t0.d());
                if (this.f4001r0 != -1) {
                    if (z3) {
                        c0307c.f(c0307c.k(i2), k2, 0, 5);
                    }
                } else if (this.s0 != -1 && z3) {
                    C0310f k3 = c0307c.k(i2);
                    c0307c.f(k2, c0307c.k(i), 0, 5);
                    c0307c.f(k3, k2, 0, 5);
                }
                this.f4004v0 = false;
                return;
            }
        }
        if (this.f4001r0 != -1) {
            C0310f k4 = c0307c.k(this.f4002t0);
            c0307c.e(k4, c0307c.k(i), this.f4001r0, 8);
            if (z3) {
                c0307c.f(c0307c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            C0310f k5 = c0307c.k(this.f4002t0);
            C0310f k6 = c0307c.k(i2);
            c0307c.e(k5, k6, -this.s0, 8);
            if (z3) {
                c0307c.f(k5, c0307c.k(i), 0, 5);
                c0307c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f4000q0 != -1.0f) {
            C0310f k7 = c0307c.k(this.f4002t0);
            C0310f k8 = c0307c.k(i2);
            float f2 = this.f4000q0;
            C0306b l2 = c0307c.l();
            l2.d.g(k7, -1.0f);
            l2.d.g(k8, f2);
            c0307c.c(l2);
        }
    }

    @Override // s.d
    public final boolean c() {
        return true;
    }

    @Override // s.d
    public final c i(int i) {
        int a2 = AbstractC0309e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f4003u0 == 0) {
                return this.f4002t0;
            }
            return null;
        }
        if (this.f4003u0 == 1) {
            return this.f4002t0;
        }
        return null;
    }
}
