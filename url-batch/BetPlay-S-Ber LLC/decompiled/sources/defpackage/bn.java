package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class bn extends ed {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public pc t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public bn() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.ed
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.ed
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.ed
    public final void Q(xq xqVar, boolean z) {
        if (this.T == null) {
            return;
        }
        pc pcVar = this.t0;
        xqVar.getClass();
        int n = xq.n(pcVar);
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
        pc[] pcVarArr = this.Q;
        int length = pcVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            pcVarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.ed
    public final void b(xq xqVar, boolean z) {
        fd fdVar = (fd) this.T;
        if (fdVar == null) {
            return;
        }
        Object i = fdVar.i(2);
        Object i2 = fdVar.i(4);
        ed edVar = this.T;
        boolean z2 = edVar != null && edVar.p0[0] == 2;
        if (this.u0 == 0) {
            i = fdVar.i(3);
            i2 = fdVar.i(5);
            ed edVar2 = this.T;
            z2 = edVar2 != null && edVar2.p0[1] == 2;
        }
        if (this.v0) {
            pc pcVar = this.t0;
            if (pcVar.c) {
                p30 k = xqVar.k(pcVar);
                xqVar.d(k, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        xqVar.f(xqVar.k(i2), k, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    p30 k2 = xqVar.k(i2);
                    xqVar.f(k, xqVar.k(i), 0, 5);
                    xqVar.f(k2, k, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            p30 k3 = xqVar.k(this.t0);
            xqVar.e(k3, xqVar.k(i), this.r0, 8);
            if (z2) {
                xqVar.f(xqVar.k(i2), k3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            p30 k4 = xqVar.k(this.t0);
            p30 k5 = xqVar.k(i2);
            xqVar.e(k4, k5, -this.s0, 8);
            if (z2) {
                xqVar.f(k4, xqVar.k(i), 0, 5);
                xqVar.f(k5, k4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            p30 k6 = xqVar.k(this.t0);
            p30 k7 = xqVar.k(i2);
            float f = this.q0;
            f7 l = xqVar.l();
            l.d.g(k6, -1.0f);
            l.d.g(k7, f);
            xqVar.c(l);
        }
    }

    @Override // defpackage.ed
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ed
    public final pc i(int i) {
        int i2 = o30.i(i);
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
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
