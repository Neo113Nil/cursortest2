package v;

import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3683q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3684r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3685s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f3686t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3687u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3688v0;

    public h() {
        this.R.clear();
        this.R.add(this.f3686t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.f3686t0;
        }
    }

    @Override // v.d
    public final boolean A() {
        return this.f3688v0;
    }

    @Override // v.d
    public final boolean B() {
        return this.f3688v0;
    }

    @Override // v.d
    public final void Q(t.c cVar, boolean z4) {
        if (this.T == null) {
            return;
        }
        c cVar2 = this.f3686t0;
        cVar.getClass();
        int n4 = t.c.n(cVar2);
        if (this.f3687u0 == 1) {
            this.Y = n4;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = n4;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.f3686t0.l(i);
        this.f3688v0 = true;
    }

    public final void S(int i) {
        if (this.f3687u0 == i) {
            return;
        }
        this.f3687u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f3687u0 == 1) {
            this.f3686t0 = this.I;
        } else {
            this.f3686t0 = this.J;
        }
        arrayList.add(this.f3686t0);
        c[] cVarArr = this.Q;
        int length = cVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            cVarArr[i4] = this.f3686t0;
        }
    }

    @Override // v.d
    public final void b(t.c cVar, boolean z4) {
        e eVar = (e) this.T;
        if (eVar == null) {
            return;
        }
        Object i = eVar.i(2);
        Object i4 = eVar.i(4);
        d dVar = this.T;
        boolean z5 = dVar != null && dVar.f3637p0[0] == 2;
        if (this.f3687u0 == 0) {
            i = eVar.i(3);
            i4 = eVar.i(5);
            d dVar2 = this.T;
            z5 = dVar2 != null && dVar2.f3637p0[1] == 2;
        }
        if (this.f3688v0) {
            c cVar2 = this.f3686t0;
            if (cVar2.f3607c) {
                t.f k4 = cVar.k(cVar2);
                cVar.d(k4, this.f3686t0.d());
                if (this.f3684r0 != -1) {
                    if (z5) {
                        cVar.f(cVar.k(i4), k4, 0, 5);
                    }
                } else if (this.f3685s0 != -1 && z5) {
                    t.f k5 = cVar.k(i4);
                    cVar.f(k4, cVar.k(i), 0, 5);
                    cVar.f(k5, k4, 0, 5);
                }
                this.f3688v0 = false;
                return;
            }
        }
        if (this.f3684r0 != -1) {
            t.f k6 = cVar.k(this.f3686t0);
            cVar.e(k6, cVar.k(i), this.f3684r0, 8);
            if (z5) {
                cVar.f(cVar.k(i4), k6, 0, 5);
                return;
            }
            return;
        }
        if (this.f3685s0 != -1) {
            t.f k7 = cVar.k(this.f3686t0);
            t.f k8 = cVar.k(i4);
            cVar.e(k7, k8, -this.f3685s0, 8);
            if (z5) {
                cVar.f(k7, cVar.k(i), 0, 5);
                cVar.f(k8, k7, 0, 5);
                return;
            }
            return;
        }
        if (this.f3683q0 != -1.0f) {
            t.f k9 = cVar.k(this.f3686t0);
            t.f k10 = cVar.k(i4);
            float f5 = this.f3683q0;
            t.b l4 = cVar.l();
            l4.d.g(k9, -1.0f);
            l4.d.g(k10, f5);
            cVar.c(l4);
        }
    }

    @Override // v.d
    public final boolean c() {
        return true;
    }

    @Override // v.d
    public final c i(int i) {
        int a5 = t.e.a(i);
        if (a5 != 1) {
            if (a5 != 2) {
                if (a5 != 3) {
                    if (a5 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3687u0 == 0) {
                return this.f3686t0;
            }
            return null;
        }
        if (this.f3687u0 == 1) {
            return this.f3686t0;
        }
        return null;
    }
}
