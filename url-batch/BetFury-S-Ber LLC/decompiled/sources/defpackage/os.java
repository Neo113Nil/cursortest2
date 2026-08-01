package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class os extends rf {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public xe t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public os() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.rf
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.rf
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.rf
    public final void Q(xx xxVar, boolean z) {
        if (this.U == null) {
            return;
        }
        xe xeVar = this.t0;
        xxVar.getClass();
        int n = xx.n(xeVar);
        if (this.u0 == 1) {
            this.Z = n;
            this.a0 = 0;
            L(this.U.k());
            O(0);
            return;
        }
        this.Z = 0;
        this.a0 = n;
        O(this.U.q());
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
        xe[] xeVarArr = this.Q;
        int length = xeVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            xeVarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.rf
    public final void b(xx xxVar, boolean z) {
        sf sfVar = (sf) this.U;
        if (sfVar == null) {
            return;
        }
        Object i = sfVar.i(we.LEFT);
        Object i2 = sfVar.i(we.RIGHT);
        rf rfVar = this.U;
        boolean z2 = rfVar != null && rfVar.T[0] == qf.WRAP_CONTENT;
        if (this.u0 == 0) {
            i = sfVar.i(we.TOP);
            i2 = sfVar.i(we.BOTTOM);
            rf rfVar2 = this.U;
            z2 = rfVar2 != null && rfVar2.T[1] == qf.WRAP_CONTENT;
        }
        if (this.v0) {
            xe xeVar = this.t0;
            if (xeVar.c) {
                je0 k = xxVar.k(xeVar);
                xxVar.d(k, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        xxVar.f(xxVar.k(i2), k, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    je0 k2 = xxVar.k(i2);
                    xxVar.f(k, xxVar.k(i), 0, 5);
                    xxVar.f(k2, k, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            je0 k3 = xxVar.k(this.t0);
            xxVar.e(k3, xxVar.k(i), this.r0, 8);
            if (z2) {
                xxVar.f(xxVar.k(i2), k3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            je0 k4 = xxVar.k(this.t0);
            je0 k5 = xxVar.k(i2);
            xxVar.e(k4, k5, -this.s0, 8);
            if (z2) {
                xxVar.f(k4, xxVar.k(i), 0, 5);
                xxVar.f(k5, k4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            je0 k6 = xxVar.k(this.t0);
            je0 k7 = xxVar.k(i2);
            float f = this.q0;
            h7 l = xxVar.l();
            l.d.g(k6, -1.0f);
            l.d.g(k7, f);
            xxVar.c(l);
        }
    }

    @Override // defpackage.rf
    public final boolean c() {
        return true;
    }

    @Override // defpackage.rf
    public final xe i(we weVar) {
        int i = ns.a[weVar.ordinal()];
        if (i == 1 || i == 2) {
            if (this.u0 == 1) {
                return this.t0;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.u0 == 0) {
            return this.t0;
        }
        return null;
    }
}
