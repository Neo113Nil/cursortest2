package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class jb0 extends ib0 {
    public to s;
    public to t;
    public to u;

    public jb0(rb0 rb0Var, WindowInsets windowInsets) {
        super(rb0Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.ob0
    public to j() {
        Insets mandatorySystemGestureInsets;
        if (this.t == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.t = to.d(mandatorySystemGestureInsets);
        }
        return this.t;
    }

    @Override // defpackage.ob0
    public to l() {
        Insets systemGestureInsets;
        if (this.s == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.s = to.d(systemGestureInsets);
        }
        return this.s;
    }

    @Override // defpackage.ob0
    public to n() {
        Insets tappableElementInsets;
        if (this.u == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.u = to.d(tappableElementInsets);
        }
        return this.u;
    }

    @Override // defpackage.gb0, defpackage.ob0
    public rb0 q(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return rb0.g(null, inset);
    }

    @Override // defpackage.hb0, defpackage.ob0
    public void w(to toVar) {
    }
}
