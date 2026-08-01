package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class s0 extends r0 {

    /* renamed from: n, reason: collision with root package name */
    public C.c f438n;

    /* renamed from: o, reason: collision with root package name */
    public C.c f439o;

    /* renamed from: p, reason: collision with root package name */
    public C.c f440p;

    public s0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f438n = null;
        this.f439o = null;
        this.f440p = null;
    }

    @Override // K.u0
    public C.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f439o == null) {
            mandatorySystemGestureInsets = this.f431c.getMandatorySystemGestureInsets();
            this.f439o = C.c.c(mandatorySystemGestureInsets);
        }
        return this.f439o;
    }

    @Override // K.u0
    public C.c i() {
        Insets systemGestureInsets;
        if (this.f438n == null) {
            systemGestureInsets = this.f431c.getSystemGestureInsets();
            this.f438n = C.c.c(systemGestureInsets);
        }
        return this.f438n;
    }

    @Override // K.u0
    public C.c k() {
        Insets tappableElementInsets;
        if (this.f440p == null) {
            tappableElementInsets = this.f431c.getTappableElementInsets();
            this.f440p = C.c.c(tappableElementInsets);
        }
        return this.f440p;
    }

    @Override // K.p0, K.u0
    public w0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f431c.inset(i, i2, i3, i4);
        return w0.g(null, inset);
    }

    @Override // K.q0, K.u0
    public void q(C.c cVar) {
    }
}
