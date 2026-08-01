package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class s0 extends r0 {

    /* renamed from: n, reason: collision with root package name */
    public C.d f441n;

    /* renamed from: o, reason: collision with root package name */
    public C.d f442o;

    /* renamed from: p, reason: collision with root package name */
    public C.d f443p;

    public s0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f441n = null;
        this.f442o = null;
        this.f443p = null;
    }

    @Override // K.u0
    public C.d g() {
        Insets mandatorySystemGestureInsets;
        if (this.f442o == null) {
            mandatorySystemGestureInsets = this.f434c.getMandatorySystemGestureInsets();
            this.f442o = C.d.c(mandatorySystemGestureInsets);
        }
        return this.f442o;
    }

    @Override // K.u0
    public C.d i() {
        Insets systemGestureInsets;
        if (this.f441n == null) {
            systemGestureInsets = this.f434c.getSystemGestureInsets();
            this.f441n = C.d.c(systemGestureInsets);
        }
        return this.f441n;
    }

    @Override // K.u0
    public C.d k() {
        Insets tappableElementInsets;
        if (this.f443p == null) {
            tappableElementInsets = this.f434c.getTappableElementInsets();
            this.f443p = C.d.c(tappableElementInsets);
        }
        return this.f443p;
    }

    @Override // K.p0, K.u0
    public w0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f434c.inset(i, i2, i3, i4);
        return w0.g(null, inset);
    }

    @Override // K.q0, K.u0
    public void q(C.d dVar) {
    }
}
