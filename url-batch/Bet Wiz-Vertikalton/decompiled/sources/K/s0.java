package K;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class s0 extends r0 {

    /* renamed from: n, reason: collision with root package name */
    public C.c f498n;

    /* renamed from: o, reason: collision with root package name */
    public C.c f499o;

    /* renamed from: p, reason: collision with root package name */
    public C.c f500p;

    public s0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f498n = null;
        this.f499o = null;
        this.f500p = null;
    }

    @Override // K.u0
    public C.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f499o == null) {
            mandatorySystemGestureInsets = this.f491c.getMandatorySystemGestureInsets();
            this.f499o = C.c.c(mandatorySystemGestureInsets);
        }
        return this.f499o;
    }

    @Override // K.u0
    public C.c i() {
        Insets systemGestureInsets;
        if (this.f498n == null) {
            systemGestureInsets = this.f491c.getSystemGestureInsets();
            this.f498n = C.c.c(systemGestureInsets);
        }
        return this.f498n;
    }

    @Override // K.u0
    public C.c k() {
        Insets tappableElementInsets;
        if (this.f500p == null) {
            tappableElementInsets = this.f491c.getTappableElementInsets();
            this.f500p = C.c.c(tappableElementInsets);
        }
        return this.f500p;
    }

    @Override // K.p0, K.u0
    public w0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f491c.inset(i, i2, i3, i4);
        return w0.g(null, inset);
    }

    @Override // K.q0, K.u0
    public void q(C.c cVar) {
    }
}
