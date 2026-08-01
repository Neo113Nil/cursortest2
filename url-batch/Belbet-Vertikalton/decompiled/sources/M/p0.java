package M;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class p0 extends o0 {

    /* renamed from: n, reason: collision with root package name */
    public E.c f783n;

    /* renamed from: o, reason: collision with root package name */
    public E.c f784o;

    /* renamed from: p, reason: collision with root package name */
    public E.c f785p;

    public p0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var, windowInsets);
        this.f783n = null;
        this.f784o = null;
        this.f785p = null;
    }

    @Override // M.r0
    public E.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f784o == null) {
            mandatorySystemGestureInsets = this.f776c.getMandatorySystemGestureInsets();
            this.f784o = E.c.c(mandatorySystemGestureInsets);
        }
        return this.f784o;
    }

    @Override // M.r0
    public E.c i() {
        Insets systemGestureInsets;
        if (this.f783n == null) {
            systemGestureInsets = this.f776c.getSystemGestureInsets();
            this.f783n = E.c.c(systemGestureInsets);
        }
        return this.f783n;
    }

    @Override // M.r0
    public E.c k() {
        Insets tappableElementInsets;
        if (this.f785p == null) {
            tappableElementInsets = this.f776c.getTappableElementInsets();
            this.f785p = E.c.c(tappableElementInsets);
        }
        return this.f785p;
    }

    @Override // M.m0, M.r0
    public t0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f776c.inset(i, i2, i3, i4);
        return t0.g(null, inset);
    }

    @Override // M.n0, M.r0
    public void q(E.c cVar) {
    }
}
