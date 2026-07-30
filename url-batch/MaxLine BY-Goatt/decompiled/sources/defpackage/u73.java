package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class u73 extends t73 {
    public z21 s;
    public z21 t;
    public z21 u;

    public u73(c83 c83Var, WindowInsets windowInsets) {
        super(c83Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.z73
    public z21 j() {
        if (this.t == null) {
            this.t = z21.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.t;
    }

    @Override // defpackage.z73
    public z21 l() {
        if (this.s == null) {
            this.s = z21.c(this.c.getSystemGestureInsets());
        }
        return this.s;
    }

    @Override // defpackage.z73
    public z21 n() {
        if (this.u == null) {
            this.u = z21.c(this.c.getTappableElementInsets());
        }
        return this.u;
    }

    @Override // defpackage.r73, defpackage.z73
    public c83 q(int i, int i2, int i3, int i4) {
        return c83.c(null, this.c.inset(i, i2, i3, i4));
    }

    @Override // defpackage.s73, defpackage.z73
    public void x(z21 z21Var) {
    }
}
