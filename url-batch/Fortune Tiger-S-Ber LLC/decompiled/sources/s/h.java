package s;

import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3305q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3306r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3307s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f3308t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3309u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3310v0;

    public h() {
        this.R.clear();
        this.R.add(this.f3308t0);
        int length = this.Q.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.Q[i4] = this.f3308t0;
        }
    }

    @Override // s.d
    public final boolean A() {
        return this.f3310v0;
    }

    @Override // s.d
    public final boolean B() {
        return this.f3310v0;
    }

    @Override // s.d
    public final void Q(q.c cVar, boolean z3) {
        if (this.T == null) {
            return;
        }
        c cVar2 = this.f3308t0;
        cVar.getClass();
        int n3 = q.c.n(cVar2);
        if (this.f3309u0 == 1) {
            this.Y = n3;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = n3;
        O(this.T.q());
        L(0);
    }

    public final void R(int i4) {
        this.f3308t0.l(i4);
        this.f3310v0 = true;
    }

    public final void S(int i4) {
        if (this.f3309u0 == i4) {
            return;
        }
        this.f3309u0 = i4;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f3309u0 == 1) {
            this.f3308t0 = this.I;
        } else {
            this.f3308t0 = this.J;
        }
        arrayList.add(this.f3308t0);
        c[] cVarArr = this.Q;
        int length = cVarArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            cVarArr[i5] = this.f3308t0;
        }
    }

    @Override // s.d
    public final void b(q.c cVar, boolean z3) {
        e eVar = (e) this.T;
        if (eVar == null) {
            return;
        }
        Object i4 = eVar.i(2);
        Object i5 = eVar.i(4);
        d dVar = this.T;
        boolean z4 = dVar != null && dVar.f3259p0[0] == 2;
        if (this.f3309u0 == 0) {
            i4 = eVar.i(3);
            i5 = eVar.i(5);
            d dVar2 = this.T;
            z4 = dVar2 != null && dVar2.f3259p0[1] == 2;
        }
        if (this.f3310v0) {
            c cVar2 = this.f3308t0;
            if (cVar2.c) {
                q.f k4 = cVar.k(cVar2);
                cVar.d(k4, this.f3308t0.d());
                if (this.f3306r0 != -1) {
                    if (z4) {
                        cVar.f(cVar.k(i5), k4, 0, 5);
                    }
                } else if (this.f3307s0 != -1 && z4) {
                    q.f k5 = cVar.k(i5);
                    cVar.f(k4, cVar.k(i4), 0, 5);
                    cVar.f(k5, k4, 0, 5);
                }
                this.f3310v0 = false;
                return;
            }
        }
        if (this.f3306r0 != -1) {
            q.f k6 = cVar.k(this.f3308t0);
            cVar.e(k6, cVar.k(i4), this.f3306r0, 8);
            if (z4) {
                cVar.f(cVar.k(i5), k6, 0, 5);
                return;
            }
            return;
        }
        if (this.f3307s0 != -1) {
            q.f k7 = cVar.k(this.f3308t0);
            q.f k8 = cVar.k(i5);
            cVar.e(k7, k8, -this.f3307s0, 8);
            if (z4) {
                cVar.f(k7, cVar.k(i4), 0, 5);
                cVar.f(k8, k7, 0, 5);
                return;
            }
            return;
        }
        if (this.f3305q0 != -1.0f) {
            q.f k9 = cVar.k(this.f3308t0);
            q.f k10 = cVar.k(i5);
            float f4 = this.f3305q0;
            q.b l4 = cVar.l();
            l4.f3063d.g(k9, -1.0f);
            l4.f3063d.g(k10, f4);
            cVar.c(l4);
        }
    }

    @Override // s.d
    public final boolean c() {
        return true;
    }

    @Override // s.d
    public final c i(int i4) {
        int a4 = q.e.a(i4);
        if (a4 != 1) {
            if (a4 != 2) {
                if (a4 != 3) {
                    if (a4 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3309u0 == 0) {
                return this.f3308t0;
            }
            return null;
        }
        if (this.f3309u0 == 1) {
            return this.f3308t0;
        }
        return null;
    }
}
