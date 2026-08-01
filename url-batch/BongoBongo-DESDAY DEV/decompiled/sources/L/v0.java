package L;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class v0 extends u0 {

    /* renamed from: n, reason: collision with root package name */
    public D.c f579n;

    /* renamed from: o, reason: collision with root package name */
    public D.c f580o;

    /* renamed from: p, reason: collision with root package name */
    public D.c f581p;

    public v0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
        this.f579n = null;
        this.f580o = null;
        this.f581p = null;
    }

    @Override // L.x0
    public D.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f580o == null) {
            mandatorySystemGestureInsets = this.f570c.getMandatorySystemGestureInsets();
            this.f580o = D.c.c(mandatorySystemGestureInsets);
        }
        return this.f580o;
    }

    @Override // L.x0
    public D.c i() {
        Insets systemGestureInsets;
        if (this.f579n == null) {
            systemGestureInsets = this.f570c.getSystemGestureInsets();
            this.f579n = D.c.c(systemGestureInsets);
        }
        return this.f579n;
    }

    @Override // L.x0
    public D.c k() {
        Insets tappableElementInsets;
        if (this.f581p == null) {
            tappableElementInsets = this.f570c.getTappableElementInsets();
            this.f581p = D.c.c(tappableElementInsets);
        }
        return this.f581p;
    }

    @Override // L.s0, L.x0
    public z0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f570c.inset(i, i2, i3, i4);
        return z0.g(null, inset);
    }

    @Override // L.t0, L.x0
    public void q(D.c cVar) {
    }
}
