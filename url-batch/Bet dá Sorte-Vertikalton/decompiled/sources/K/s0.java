package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class s0 extends r0 {

    /* renamed from: n, reason: collision with root package name */
    public C.d f427n;

    /* renamed from: o, reason: collision with root package name */
    public C.d f428o;

    /* renamed from: p, reason: collision with root package name */
    public C.d f429p;

    public s0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f427n = null;
        this.f428o = null;
        this.f429p = null;
    }

    @Override // K.u0
    public C.d g() {
        Insets mandatorySystemGestureInsets;
        if (this.f428o == null) {
            mandatorySystemGestureInsets = this.f420c.getMandatorySystemGestureInsets();
            this.f428o = C.d.c(mandatorySystemGestureInsets);
        }
        return this.f428o;
    }

    @Override // K.u0
    public C.d i() {
        Insets systemGestureInsets;
        if (this.f427n == null) {
            systemGestureInsets = this.f420c.getSystemGestureInsets();
            this.f427n = C.d.c(systemGestureInsets);
        }
        return this.f427n;
    }

    @Override // K.u0
    public C.d k() {
        Insets tappableElementInsets;
        if (this.f429p == null) {
            tappableElementInsets = this.f420c.getTappableElementInsets();
            this.f429p = C.d.c(tappableElementInsets);
        }
        return this.f429p;
    }

    @Override // K.p0, K.u0
    public w0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f420c.inset(i, i2, i3, i4);
        return w0.g(null, inset);
    }

    @Override // K.q0, K.u0
    public void q(C.d dVar) {
    }
}
