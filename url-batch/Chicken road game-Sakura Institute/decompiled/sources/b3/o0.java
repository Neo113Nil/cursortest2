package b3;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class o0 extends n0 {

    /* renamed from: n, reason: collision with root package name */
    public v2.c f1355n;

    /* renamed from: o, reason: collision with root package name */
    public v2.c f1356o;

    /* renamed from: p, reason: collision with root package name */
    public v2.c f1357p;

    public o0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
        this.f1355n = null;
        this.f1356o = null;
        this.f1357p = null;
    }

    @Override // b3.q0
    public v2.c h() {
        Insets mandatorySystemGestureInsets;
        if (this.f1356o == null) {
            mandatorySystemGestureInsets = this.f1349c.getMandatorySystemGestureInsets();
            this.f1356o = v2.c.c(mandatorySystemGestureInsets);
        }
        return this.f1356o;
    }

    @Override // b3.q0
    public v2.c j() {
        Insets systemGestureInsets;
        if (this.f1355n == null) {
            systemGestureInsets = this.f1349c.getSystemGestureInsets();
            this.f1355n = v2.c.c(systemGestureInsets);
        }
        return this.f1355n;
    }

    @Override // b3.q0
    public v2.c l() {
        Insets tappableElementInsets;
        if (this.f1357p == null) {
            tappableElementInsets = this.f1349c.getTappableElementInsets();
            this.f1357p = v2.c.c(tappableElementInsets);
        }
        return this.f1357p;
    }

    @Override // b3.m0, b3.q0
    public void r(v2.c cVar) {
    }
}
