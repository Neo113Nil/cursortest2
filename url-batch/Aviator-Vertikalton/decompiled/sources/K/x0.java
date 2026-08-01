package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class x0 extends w0 {

    /* renamed from: n, reason: collision with root package name */
    public C.d f511n;

    /* renamed from: o, reason: collision with root package name */
    public C.d f512o;

    /* renamed from: p, reason: collision with root package name */
    public C.d f513p;

    public x0(B0 b02, WindowInsets windowInsets) {
        super(b02, windowInsets);
        this.f511n = null;
        this.f512o = null;
        this.f513p = null;
    }

    @Override // K.z0
    public C.d g() {
        Insets mandatorySystemGestureInsets;
        if (this.f512o == null) {
            mandatorySystemGestureInsets = this.f505c.getMandatorySystemGestureInsets();
            this.f512o = C.d.c(mandatorySystemGestureInsets);
        }
        return this.f512o;
    }

    @Override // K.z0
    public C.d i() {
        Insets systemGestureInsets;
        if (this.f511n == null) {
            systemGestureInsets = this.f505c.getSystemGestureInsets();
            this.f511n = C.d.c(systemGestureInsets);
        }
        return this.f511n;
    }

    @Override // K.z0
    public C.d k() {
        Insets tappableElementInsets;
        if (this.f513p == null) {
            tappableElementInsets = this.f505c.getTappableElementInsets();
            this.f513p = C.d.c(tappableElementInsets);
        }
        return this.f513p;
    }

    @Override // K.u0, K.z0
    public B0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f505c.inset(i, i2, i3, i4);
        return B0.g(null, inset);
    }

    @Override // K.v0, K.z0
    public void q(C.d dVar) {
    }
}
