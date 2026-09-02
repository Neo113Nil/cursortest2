package v;

import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f3465q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f3466r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3467s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f3468t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f3469u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3470v0;

    public h() {
        this.R.clear();
        this.R.add(this.f3468t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.f3468t0;
        }
    }

    @Override // v.d
    public final boolean A() {
        return this.f3470v0;
    }

    @Override // v.d
    public final boolean B() {
        return this.f3470v0;
    }

    @Override // v.d
    public final void Q(t.c cVar, boolean z3) {
        if (this.T == null) {
            return;
        }
        c cVar2 = this.f3468t0;
        cVar.getClass();
        int n4 = t.c.n(cVar2);
        if (this.f3469u0 == 1) {
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
        this.f3468t0.l(i);
        this.f3470v0 = true;
    }

    public final void S(int i) {
        if (this.f3469u0 == i) {
            return;
        }
        this.f3469u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f3469u0 == 1) {
            this.f3468t0 = this.I;
        } else {
            this.f3468t0 = this.J;
        }
        arrayList.add(this.f3468t0);
        c[] cVarArr = this.Q;
        int length = cVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            cVarArr[i4] = this.f3468t0;
        }
    }

    @Override // v.d
    public final void b(t.c cVar, boolean z3) {
        e eVar = (e) this.T;
        if (eVar == null) {
            return;
        }
        Object i = eVar.i(2);
        Object i4 = eVar.i(4);
        d dVar = this.T;
        boolean z4 = dVar != null && dVar.f3418p0[0] == 2;
        if (this.f3469u0 == 0) {
            i = eVar.i(3);
            i4 = eVar.i(5);
            d dVar2 = this.T;
            z4 = dVar2 != null && dVar2.f3418p0[1] == 2;
        }
        if (this.f3470v0) {
            c cVar2 = this.f3468t0;
            if (cVar2.f3386c) {
                t.f k4 = cVar.k(cVar2);
                cVar.d(k4, this.f3468t0.d());
                if (this.f3466r0 != -1) {
                    if (z4) {
                        cVar.f(cVar.k(i4), k4, 0, 5);
                    }
                } else if (this.f3467s0 != -1 && z4) {
                    t.f k5 = cVar.k(i4);
                    cVar.f(k4, cVar.k(i), 0, 5);
                    cVar.f(k5, k4, 0, 5);
                }
                this.f3470v0 = false;
                return;
            }
        }
        if (this.f3466r0 != -1) {
            t.f k6 = cVar.k(this.f3468t0);
            cVar.e(k6, cVar.k(i), this.f3466r0, 8);
            if (z4) {
                cVar.f(cVar.k(i4), k6, 0, 5);
                return;
            }
            return;
        }
        if (this.f3467s0 != -1) {
            t.f k7 = cVar.k(this.f3468t0);
            t.f k8 = cVar.k(i4);
            cVar.e(k7, k8, -this.f3467s0, 8);
            if (z4) {
                cVar.f(k7, cVar.k(i), 0, 5);
                cVar.f(k8, k7, 0, 5);
                return;
            }
            return;
        }
        if (this.f3465q0 != -1.0f) {
            t.f k9 = cVar.k(this.f3468t0);
            t.f k10 = cVar.k(i4);
            float f2 = this.f3465q0;
            t.b l4 = cVar.l();
            l4.d.g(k9, -1.0f);
            l4.d.g(k10, f2);
            cVar.c(l4);
        }
    }

    @Override // v.d
    public final boolean c() {
        return true;
    }

    @Override // v.d
    public final c i(int i) {
        int a2 = t.e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f3469u0 == 0) {
                return this.f3468t0;
            }
            return null;
        }
        if (this.f3469u0 == 1) {
            return this.f3468t0;
        }
        return null;
    }
}
