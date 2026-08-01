package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class sb0 extends rb0 {
    public ip s;
    public ip t;
    public ip u;

    public sb0(ac0 ac0Var, WindowInsets windowInsets) {
        super(ac0Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.xb0
    public ip j() {
        Insets mandatorySystemGestureInsets;
        if (this.t == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.t = ip.d(mandatorySystemGestureInsets);
        }
        return this.t;
    }

    @Override // defpackage.xb0
    public ip l() {
        Insets systemGestureInsets;
        if (this.s == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.s = ip.d(systemGestureInsets);
        }
        return this.s;
    }

    @Override // defpackage.xb0
    public ip n() {
        Insets tappableElementInsets;
        if (this.u == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.u = ip.d(tappableElementInsets);
        }
        return this.u;
    }

    @Override // defpackage.pb0, defpackage.xb0
    public ac0 q(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return ac0.g(null, inset);
    }

    @Override // defpackage.qb0, defpackage.xb0
    public void w(ip ipVar) {
    }
}
