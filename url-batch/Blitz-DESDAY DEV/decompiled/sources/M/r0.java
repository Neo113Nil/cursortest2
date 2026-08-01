package M;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class r0 extends q0 {

    /* renamed from: n, reason: collision with root package name */
    public E.c f585n;

    /* renamed from: o, reason: collision with root package name */
    public E.c f586o;

    /* renamed from: p, reason: collision with root package name */
    public E.c f587p;

    public r0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
        this.f585n = null;
        this.f586o = null;
        this.f587p = null;
    }

    @Override // M.t0
    public E.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f586o == null) {
            mandatorySystemGestureInsets = this.f578c.getMandatorySystemGestureInsets();
            this.f586o = E.c.c(mandatorySystemGestureInsets);
        }
        return this.f586o;
    }

    @Override // M.t0
    public E.c i() {
        Insets systemGestureInsets;
        if (this.f585n == null) {
            systemGestureInsets = this.f578c.getSystemGestureInsets();
            this.f585n = E.c.c(systemGestureInsets);
        }
        return this.f585n;
    }

    @Override // M.t0
    public E.c k() {
        Insets tappableElementInsets;
        if (this.f587p == null) {
            tappableElementInsets = this.f578c.getTappableElementInsets();
            this.f587p = E.c.c(tappableElementInsets);
        }
        return this.f587p;
    }

    @Override // M.o0, M.t0
    public v0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f578c.inset(i, i2, i3, i4);
        return v0.g(null, inset);
    }

    @Override // M.p0, M.t0
    public void q(E.c cVar) {
    }
}
