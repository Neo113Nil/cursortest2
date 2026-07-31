package a1;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class M extends L {

    /* renamed from: n, reason: collision with root package name */
    public V0.c f3536n;

    /* renamed from: o, reason: collision with root package name */
    public V0.c f3537o;
    public V0.c p;

    public M(Q q2, WindowInsets windowInsets) {
        super(q2, windowInsets);
        this.f3536n = null;
        this.f3537o = null;
        this.p = null;
    }

    @Override // a1.O
    public V0.c h() {
        Insets mandatorySystemGestureInsets;
        if (this.f3537o == null) {
            mandatorySystemGestureInsets = this.f3530c.getMandatorySystemGestureInsets();
            this.f3537o = V0.c.c(mandatorySystemGestureInsets);
        }
        return this.f3537o;
    }

    @Override // a1.O
    public V0.c j() {
        Insets systemGestureInsets;
        if (this.f3536n == null) {
            systemGestureInsets = this.f3530c.getSystemGestureInsets();
            this.f3536n = V0.c.c(systemGestureInsets);
        }
        return this.f3536n;
    }

    @Override // a1.O
    public V0.c l() {
        Insets tappableElementInsets;
        if (this.p == null) {
            tappableElementInsets = this.f3530c.getTappableElementInsets();
            this.p = V0.c.c(tappableElementInsets);
        }
        return this.p;
    }

    @Override // a1.K, a1.O
    public void r(V0.c cVar) {
    }
}
