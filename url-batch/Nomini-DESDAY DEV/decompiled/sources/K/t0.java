package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class t0 extends s0 {

    /* renamed from: n, reason: collision with root package name */
    public C.d f457n;

    /* renamed from: o, reason: collision with root package name */
    public C.d f458o;

    /* renamed from: p, reason: collision with root package name */
    public C.d f459p;

    public t0(x0 x0Var, WindowInsets windowInsets) {
        super(x0Var, windowInsets);
        this.f457n = null;
        this.f458o = null;
        this.f459p = null;
    }

    @Override // K.v0
    public C.d g() {
        Insets mandatorySystemGestureInsets;
        if (this.f458o == null) {
            mandatorySystemGestureInsets = this.f452c.getMandatorySystemGestureInsets();
            this.f458o = C.d.c(mandatorySystemGestureInsets);
        }
        return this.f458o;
    }

    @Override // K.v0
    public C.d i() {
        Insets systemGestureInsets;
        if (this.f457n == null) {
            systemGestureInsets = this.f452c.getSystemGestureInsets();
            this.f457n = C.d.c(systemGestureInsets);
        }
        return this.f457n;
    }

    @Override // K.v0
    public C.d k() {
        Insets tappableElementInsets;
        if (this.f459p == null) {
            tappableElementInsets = this.f452c.getTappableElementInsets();
            this.f459p = C.d.c(tappableElementInsets);
        }
        return this.f459p;
    }

    @Override // K.q0, K.v0
    public x0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f452c.inset(i, i2, i3, i4);
        return x0.g(null, inset);
    }

    @Override // K.r0, K.v0
    public void q(C.d dVar) {
    }
}
