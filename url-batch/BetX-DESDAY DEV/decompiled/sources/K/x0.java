package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class x0 extends w0 {

    /* renamed from: n, reason: collision with root package name */
    public C.d f512n;

    /* renamed from: o, reason: collision with root package name */
    public C.d f513o;

    /* renamed from: p, reason: collision with root package name */
    public C.d f514p;

    public x0(B0 b02, WindowInsets windowInsets) {
        super(b02, windowInsets);
        this.f512n = null;
        this.f513o = null;
        this.f514p = null;
    }

    @Override // K.z0
    public C.d g() {
        Insets mandatorySystemGestureInsets;
        if (this.f513o == null) {
            mandatorySystemGestureInsets = this.f506c.getMandatorySystemGestureInsets();
            this.f513o = C.d.c(mandatorySystemGestureInsets);
        }
        return this.f513o;
    }

    @Override // K.z0
    public C.d i() {
        Insets systemGestureInsets;
        if (this.f512n == null) {
            systemGestureInsets = this.f506c.getSystemGestureInsets();
            this.f512n = C.d.c(systemGestureInsets);
        }
        return this.f512n;
    }

    @Override // K.z0
    public C.d k() {
        Insets tappableElementInsets;
        if (this.f514p == null) {
            tappableElementInsets = this.f506c.getTappableElementInsets();
            this.f514p = C.d.c(tappableElementInsets);
        }
        return this.f514p;
    }

    @Override // K.u0, K.z0
    public B0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f506c.inset(i, i2, i3, i4);
        return B0.g(null, inset);
    }

    @Override // K.v0, K.z0
    public void q(C.d dVar) {
    }
}
