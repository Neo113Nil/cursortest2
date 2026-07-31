package y2;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f8825q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f8826r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f8827s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f8828t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f8829u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f8830v0;

    public h() {
        this.R.clear();
        this.R.add(this.f8828t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.f8828t0;
        }
    }

    @Override // y2.d
    public final boolean A() {
        return this.f8830v0;
    }

    @Override // y2.d
    public final boolean B() {
        return this.f8830v0;
    }

    @Override // y2.d
    public final void Q(w2.c cVar, boolean z3) {
        if (this.T == null) {
            return;
        }
        c cVar2 = this.f8828t0;
        cVar.getClass();
        int n6 = w2.c.n(cVar2);
        if (this.f8829u0 == 1) {
            this.Y = n6;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = n6;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.f8828t0.l(i);
        this.f8830v0 = true;
    }

    public final void S(int i) {
        if (this.f8829u0 == i) {
            return;
        }
        this.f8829u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f8829u0 == 1) {
            this.f8828t0 = this.I;
        } else {
            this.f8828t0 = this.J;
        }
        arrayList.add(this.f8828t0);
        c[] cVarArr = this.Q;
        int length = cVarArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            cVarArr[i8] = this.f8828t0;
        }
    }

    @Override // y2.d
    public final void b(w2.c cVar, boolean z3) {
        e eVar = (e) this.T;
        if (eVar == null) {
            return;
        }
        Object i = eVar.i(2);
        Object i8 = eVar.i(4);
        d dVar = this.T;
        boolean z7 = dVar != null && dVar.f8777p0[0] == 2;
        if (this.f8829u0 == 0) {
            i = eVar.i(3);
            i8 = eVar.i(5);
            d dVar2 = this.T;
            z7 = dVar2 != null && dVar2.f8777p0[1] == 2;
        }
        if (this.f8830v0) {
            c cVar2 = this.f8828t0;
            if (cVar2.f8741c) {
                w2.f k3 = cVar.k(cVar2);
                cVar.d(k3, this.f8828t0.d());
                if (this.f8826r0 != -1) {
                    if (z7) {
                        cVar.f(cVar.k(i8), k3, 0, 5);
                    }
                } else if (this.f8827s0 != -1 && z7) {
                    w2.f k7 = cVar.k(i8);
                    cVar.f(k3, cVar.k(i), 0, 5);
                    cVar.f(k7, k3, 0, 5);
                }
                this.f8830v0 = false;
                return;
            }
        }
        if (this.f8826r0 != -1) {
            w2.f k8 = cVar.k(this.f8828t0);
            cVar.e(k8, cVar.k(i), this.f8826r0, 8);
            if (z7) {
                cVar.f(cVar.k(i8), k8, 0, 5);
                return;
            }
            return;
        }
        if (this.f8827s0 != -1) {
            w2.f k9 = cVar.k(this.f8828t0);
            w2.f k10 = cVar.k(i8);
            cVar.e(k9, k10, -this.f8827s0, 8);
            if (z7) {
                cVar.f(k9, cVar.k(i), 0, 5);
                cVar.f(k10, k9, 0, 5);
                return;
            }
            return;
        }
        if (this.f8825q0 != -1.0f) {
            w2.f k11 = cVar.k(this.f8828t0);
            w2.f k12 = cVar.k(i8);
            float f6 = this.f8825q0;
            w2.b l3 = cVar.l();
            l3.f7843d.g(k11, -1.0f);
            l3.f7843d.g(k12, f6);
            cVar.c(l3);
        }
    }

    @Override // y2.d
    public final boolean c() {
        return true;
    }

    @Override // y2.d
    public final c i(int i) {
        int a8 = w2.e.a(i);
        if (a8 != 1) {
            if (a8 != 2) {
                if (a8 != 3) {
                    if (a8 != 4) {
                        return null;
                    }
                }
            }
            if (this.f8829u0 == 0) {
                return this.f8828t0;
            }
            return null;
        }
        if (this.f8829u0 == 1) {
            return this.f8828t0;
        }
        return null;
    }
}
