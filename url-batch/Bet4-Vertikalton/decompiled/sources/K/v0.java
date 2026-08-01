package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class v0 extends u0 {

    /* renamed from: n, reason: collision with root package name */
    public C.c f509n;

    /* renamed from: o, reason: collision with root package name */
    public C.c f510o;

    /* renamed from: p, reason: collision with root package name */
    public C.c f511p;

    public v0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
        this.f509n = null;
        this.f510o = null;
        this.f511p = null;
    }

    @Override // K.x0
    public C.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f510o == null) {
            mandatorySystemGestureInsets = this.f500c.getMandatorySystemGestureInsets();
            this.f510o = C.c.c(mandatorySystemGestureInsets);
        }
        return this.f510o;
    }

    @Override // K.x0
    public C.c i() {
        Insets systemGestureInsets;
        if (this.f509n == null) {
            systemGestureInsets = this.f500c.getSystemGestureInsets();
            this.f509n = C.c.c(systemGestureInsets);
        }
        return this.f509n;
    }

    @Override // K.x0
    public C.c k() {
        Insets tappableElementInsets;
        if (this.f511p == null) {
            tappableElementInsets = this.f500c.getTappableElementInsets();
            this.f511p = C.c.c(tappableElementInsets);
        }
        return this.f511p;
    }

    @Override // K.s0, K.x0
    public z0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f500c.inset(i, i2, i3, i4);
        return z0.g(null, inset);
    }

    @Override // K.t0, K.x0
    public void q(C.c cVar) {
    }
}
