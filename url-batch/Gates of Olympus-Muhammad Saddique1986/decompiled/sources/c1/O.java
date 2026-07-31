package c1;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class O extends N {

    /* renamed from: n, reason: collision with root package name */
    public X0.c f5582n;

    /* renamed from: o, reason: collision with root package name */
    public X0.c f5583o;

    /* renamed from: p, reason: collision with root package name */
    public X0.c f5584p;

    public O(U u3, WindowInsets windowInsets) {
        super(u3, windowInsets);
        this.f5582n = null;
        this.f5583o = null;
        this.f5584p = null;
    }

    @Override // c1.Q
    public X0.c h() {
        Insets mandatorySystemGestureInsets;
        if (this.f5583o == null) {
            mandatorySystemGestureInsets = this.f5576c.getMandatorySystemGestureInsets();
            this.f5583o = X0.c.c(mandatorySystemGestureInsets);
        }
        return this.f5583o;
    }

    @Override // c1.Q
    public X0.c j() {
        Insets systemGestureInsets;
        if (this.f5582n == null) {
            systemGestureInsets = this.f5576c.getSystemGestureInsets();
            this.f5582n = X0.c.c(systemGestureInsets);
        }
        return this.f5582n;
    }

    @Override // c1.Q
    public X0.c l() {
        Insets tappableElementInsets;
        if (this.f5584p == null) {
            tappableElementInsets = this.f5576c.getTappableElementInsets();
            this.f5584p = X0.c.c(tappableElementInsets);
        }
        return this.f5584p;
    }

    @Override // c1.M, c1.Q
    public void r(X0.c cVar) {
    }
}
