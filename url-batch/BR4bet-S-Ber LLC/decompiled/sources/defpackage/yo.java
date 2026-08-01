package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class yo extends ae {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public ld t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public yo() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.ae
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.ae
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.ae
    public final void Q(ys ysVar, boolean z) {
        if (this.T == null) {
            return;
        }
        ld ldVar = this.t0;
        ysVar.getClass();
        int n = ys.n(ldVar);
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
        ld[] ldVarArr = this.Q;
        int length = ldVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            ldVarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.ae
    public final void b(ys ysVar, boolean z) {
        be beVar = (be) this.T;
        if (beVar == null) {
            return;
        }
        Object i = beVar.i(2);
        Object i2 = beVar.i(4);
        ae aeVar = this.T;
        boolean z2 = aeVar != null && aeVar.p0[0] == 2;
        if (this.u0 == 0) {
            i = beVar.i(3);
            i2 = beVar.i(5);
            ae aeVar2 = this.T;
            z2 = aeVar2 != null && aeVar2.p0[1] == 2;
        }
        if (this.v0) {
            ld ldVar = this.t0;
            if (ldVar.c) {
                g60 k = ysVar.k(ldVar);
                ysVar.d(k, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        ysVar.f(ysVar.k(i2), k, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    g60 k2 = ysVar.k(i2);
                    ysVar.f(k, ysVar.k(i), 0, 5);
                    ysVar.f(k2, k, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            g60 k3 = ysVar.k(this.t0);
            ysVar.e(k3, ysVar.k(i), this.r0, 8);
            if (z2) {
                ysVar.f(ysVar.k(i2), k3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            g60 k4 = ysVar.k(this.t0);
            g60 k5 = ysVar.k(i2);
            ysVar.e(k4, k5, -this.s0, 8);
            if (z2) {
                ysVar.f(k4, ysVar.k(i), 0, 5);
                ysVar.f(k5, k4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            g60 k6 = ysVar.k(this.t0);
            g60 k7 = ysVar.k(i2);
            float f = this.q0;
            y6 l = ysVar.l();
            l.d.g(k6, -1.0f);
            l.d.g(k7, f);
            ysVar.c(l);
        }
    }

    @Override // defpackage.ae
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ae
    public final ld i(int i) {
        int j = f60.j(i);
        if (j != 1) {
            if (j != 2) {
                if (j != 3) {
                    if (j != 4) {
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
