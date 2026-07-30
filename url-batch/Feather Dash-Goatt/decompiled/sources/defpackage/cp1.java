package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class cp1 extends bp1 {
    public c90 j;
    public c90 k;
    public c90 l;

    public cp1(ip1 ip1Var, WindowInsets windowInsets) {
        super(ip1Var, windowInsets);
        this.j = null;
        this.k = null;
        this.l = null;
    }

    @Override // defpackage.fp1
    public c90 i() {
        if (this.k == null) {
            this.k = c90.b(this.c.getMandatorySystemGestureInsets());
        }
        return this.k;
    }

    @Override // defpackage.fp1
    public c90 k() {
        if (this.j == null) {
            this.j = c90.b(this.c.getSystemGestureInsets());
        }
        return this.j;
    }

    @Override // defpackage.fp1
    public c90 m() {
        if (this.l == null) {
            this.l = c90.b(this.c.getTappableElementInsets());
        }
        return this.l;
    }

    @Override // defpackage.zo1, defpackage.fp1
    public ip1 n(int i, int i2, int i3, int i4) {
        return ip1.c(null, this.c.inset(i, i2, i3, i4));
    }

    public cp1(ip1 ip1Var, cp1 cp1Var) {
        super(ip1Var, cp1Var);
        this.j = null;
        this.k = null;
        this.l = null;
    }
}
