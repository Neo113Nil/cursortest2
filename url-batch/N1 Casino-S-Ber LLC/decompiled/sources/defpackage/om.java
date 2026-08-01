package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class om extends ad {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public lc t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public om() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.ad
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.ad
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.ad
    public final void Q(kq kqVar, boolean z) {
        if (this.T == null) {
            return;
        }
        lc lcVar = this.t0;
        kqVar.getClass();
        int n = kq.n(lcVar);
        if (this.u0 == 1) {
            this.Y = n;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = n;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 == i) {
            return;
        }
        this.u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.u0 == 1) {
            this.t0 = this.I;
        } else {
            this.t0 = this.J;
        }
        arrayList.add(this.t0);
        lc[] lcVarArr = this.Q;
        int length = lcVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            lcVarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.ad
    public final void b(kq kqVar, boolean z) {
        bd bdVar = (bd) this.T;
        if (bdVar == null) {
            return;
        }
        Object i = bdVar.i(2);
        Object i2 = bdVar.i(4);
        ad adVar = this.T;
        boolean z2 = adVar != null && adVar.p0[0] == 2;
        if (this.u0 == 0) {
            i = bdVar.i(3);
            i2 = bdVar.i(5);
            ad adVar2 = this.T;
            z2 = adVar2 != null && adVar2.p0[1] == 2;
        }
        if (this.v0) {
            lc lcVar = this.t0;
            if (lcVar.c) {
                e30 k = kqVar.k(lcVar);
                kqVar.d(k, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        kqVar.f(kqVar.k(i2), k, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    e30 k2 = kqVar.k(i2);
                    kqVar.f(k, kqVar.k(i), 0, 5);
                    kqVar.f(k2, k, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            e30 k3 = kqVar.k(this.t0);
            kqVar.e(k3, kqVar.k(i), this.r0, 8);
            if (z2) {
                kqVar.f(kqVar.k(i2), k3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            e30 k4 = kqVar.k(this.t0);
            e30 k5 = kqVar.k(i2);
            kqVar.e(k4, k5, -this.s0, 8);
            if (z2) {
                kqVar.f(k4, kqVar.k(i), 0, 5);
                kqVar.f(k5, k4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            e30 k6 = kqVar.k(this.t0);
            e30 k7 = kqVar.k(i2);
            float f = this.q0;
            o6 l = kqVar.l();
            l.d.g(k6, -1.0f);
            l.d.g(k7, f);
            kqVar.c(l);
        }
    }

    @Override // defpackage.ad
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ad
    public final lc i(int i) {
        int h = d30.h(i);
        if (h != 1) {
            if (h != 2) {
                if (h != 3) {
                    if (h != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
