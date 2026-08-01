package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class s0 extends r0 {

    /* renamed from: n, reason: collision with root package name */
    public C.d f656n;

    /* renamed from: o, reason: collision with root package name */
    public C.d f657o;

    /* renamed from: p, reason: collision with root package name */
    public C.d f658p;

    public s0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f656n = null;
        this.f657o = null;
        this.f658p = null;
    }

    @Override // K.u0
    public C.d g() {
        Insets mandatorySystemGestureInsets;
        if (this.f657o == null) {
            mandatorySystemGestureInsets = this.f648c.getMandatorySystemGestureInsets();
            this.f657o = C.d.c(mandatorySystemGestureInsets);
        }
        return this.f657o;
    }

    @Override // K.u0
    public C.d i() {
        Insets systemGestureInsets;
        if (this.f656n == null) {
            systemGestureInsets = this.f648c.getSystemGestureInsets();
            this.f656n = C.d.c(systemGestureInsets);
        }
        return this.f656n;
    }

    @Override // K.u0
    public C.d k() {
        Insets tappableElementInsets;
        if (this.f658p == null) {
            tappableElementInsets = this.f648c.getTappableElementInsets();
            this.f658p = C.d.c(tappableElementInsets);
        }
        return this.f658p;
    }

    @Override // K.p0, K.u0
    public w0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f648c.inset(i, i2, i3, i4);
        return w0.g(null, inset);
    }

    @Override // K.q0, K.u0
    public void q(C.d dVar) {
    }
}
