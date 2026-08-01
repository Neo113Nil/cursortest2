package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class v0 extends u0 {

    /* renamed from: n, reason: collision with root package name */
    public C.c f526n;

    /* renamed from: o, reason: collision with root package name */
    public C.c f527o;

    /* renamed from: p, reason: collision with root package name */
    public C.c f528p;

    public v0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
        this.f526n = null;
        this.f527o = null;
        this.f528p = null;
    }

    @Override // K.x0
    public C.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f527o == null) {
            mandatorySystemGestureInsets = this.f517c.getMandatorySystemGestureInsets();
            this.f527o = C.c.c(mandatorySystemGestureInsets);
        }
        return this.f527o;
    }

    @Override // K.x0
    public C.c i() {
        Insets systemGestureInsets;
        if (this.f526n == null) {
            systemGestureInsets = this.f517c.getSystemGestureInsets();
            this.f526n = C.c.c(systemGestureInsets);
        }
        return this.f526n;
    }

    @Override // K.x0
    public C.c k() {
        Insets tappableElementInsets;
        if (this.f528p == null) {
            tappableElementInsets = this.f517c.getTappableElementInsets();
            this.f528p = C.c.c(tappableElementInsets);
        }
        return this.f528p;
    }

    @Override // K.s0, K.x0
    public z0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f517c.inset(i, i2, i3, i4);
        return z0.g(null, inset);
    }

    @Override // K.t0, K.x0
    public void q(C.c cVar) {
    }
}
