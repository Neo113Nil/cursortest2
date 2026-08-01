package k0;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class f1 extends e1 {

    /* renamed from: o, reason: collision with root package name */
    public c0.c f2732o;

    /* renamed from: p, reason: collision with root package name */
    public c0.c f2733p;

    /* renamed from: q, reason: collision with root package name */
    public c0.c f2734q;

    public f1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f2732o = null;
        this.f2733p = null;
        this.f2734q = null;
    }

    @Override // k0.i1
    public c0.c h() {
        Insets mandatorySystemGestureInsets;
        if (this.f2733p == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.f2733p = c0.c.d(mandatorySystemGestureInsets);
        }
        return this.f2733p;
    }

    @Override // k0.i1
    public c0.c j() {
        Insets systemGestureInsets;
        if (this.f2732o == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.f2732o = c0.c.d(systemGestureInsets);
        }
        return this.f2732o;
    }

    @Override // k0.i1
    public c0.c l() {
        Insets tappableElementInsets;
        if (this.f2734q == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.f2734q = c0.c.d(tappableElementInsets);
        }
        return this.f2734q;
    }

    @Override // k0.c1, k0.i1
    public m1 m(int i4, int i5, int i6, int i7) {
        WindowInsets inset;
        inset = this.c.inset(i4, i5, i6, i7);
        return m1.g(null, inset);
    }

    @Override // k0.d1, k0.i1
    public void r(c0.c cVar) {
    }
}
