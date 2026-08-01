package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class qe0 extends pe0 {
    public er s;
    public er t;
    public er u;

    public qe0(ye0 ye0Var, WindowInsets windowInsets) {
        super(ye0Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.ve0
    public er j() {
        Insets mandatorySystemGestureInsets;
        if (this.t == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.t = er.d(mandatorySystemGestureInsets);
        }
        return this.t;
    }

    @Override // defpackage.ve0
    public er l() {
        Insets systemGestureInsets;
        if (this.s == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.s = er.d(systemGestureInsets);
        }
        return this.s;
    }

    @Override // defpackage.ve0
    public er n() {
        Insets tappableElementInsets;
        if (this.u == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.u = er.d(tappableElementInsets);
        }
        return this.u;
    }

    @Override // defpackage.ne0, defpackage.ve0
    public ye0 q(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return ye0.g(null, inset);
    }

    @Override // defpackage.oe0, defpackage.ve0
    public void w(er erVar) {
    }
}
