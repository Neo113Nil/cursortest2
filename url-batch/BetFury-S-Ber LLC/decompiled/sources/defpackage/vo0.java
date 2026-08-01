package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class vo0 extends uo0 {
    public fv s;
    public fv t;
    public fv u;

    public vo0(dp0 dp0Var, WindowInsets windowInsets) {
        super(dp0Var, windowInsets);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    @Override // defpackage.ap0
    public fv j() {
        Insets mandatorySystemGestureInsets;
        if (this.t == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.t = fv.d(mandatorySystemGestureInsets);
        }
        return this.t;
    }

    @Override // defpackage.ap0
    public fv l() {
        Insets systemGestureInsets;
        if (this.s == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.s = fv.d(systemGestureInsets);
        }
        return this.s;
    }

    @Override // defpackage.ap0
    public fv n() {
        Insets tappableElementInsets;
        if (this.u == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.u = fv.d(tappableElementInsets);
        }
        return this.u;
    }

    @Override // defpackage.so0, defpackage.ap0
    public dp0 q(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return dp0.g(null, inset);
    }

    @Override // defpackage.to0, defpackage.ap0
    public void w(fv fvVar) {
    }
}
