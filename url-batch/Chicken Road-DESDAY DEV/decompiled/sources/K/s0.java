package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class s0 extends r0 {

    /* renamed from: n, reason: collision with root package name */
    public C.c f445n;

    /* renamed from: o, reason: collision with root package name */
    public C.c f446o;

    /* renamed from: p, reason: collision with root package name */
    public C.c f447p;

    public s0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f445n = null;
        this.f446o = null;
        this.f447p = null;
    }

    @Override // K.u0
    public C.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f446o == null) {
            mandatorySystemGestureInsets = this.f438c.getMandatorySystemGestureInsets();
            this.f446o = C.c.c(mandatorySystemGestureInsets);
        }
        return this.f446o;
    }

    @Override // K.u0
    public C.c i() {
        Insets systemGestureInsets;
        if (this.f445n == null) {
            systemGestureInsets = this.f438c.getSystemGestureInsets();
            this.f445n = C.c.c(systemGestureInsets);
        }
        return this.f445n;
    }

    @Override // K.u0
    public C.c k() {
        Insets tappableElementInsets;
        if (this.f447p == null) {
            tappableElementInsets = this.f438c.getTappableElementInsets();
            this.f447p = C.c.c(tappableElementInsets);
        }
        return this.f447p;
    }

    @Override // K.p0, K.u0
    public w0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f438c.inset(i, i2, i3, i4);
        return w0.g(null, inset);
    }

    @Override // K.q0, K.u0
    public void q(C.c cVar) {
    }
}
