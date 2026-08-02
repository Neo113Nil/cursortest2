package E;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class O extends N {
    public x.b o;

    /* renamed from: p, reason: collision with root package name */
    public x.b f264p;

    /* renamed from: q, reason: collision with root package name */
    public x.b f265q;

    public O(W w3, WindowInsets windowInsets) {
        super(w3, windowInsets);
        this.o = null;
        this.f264p = null;
        this.f265q = null;
    }

    @Override // E.T
    public x.b g() {
        Insets mandatorySystemGestureInsets;
        if (this.f264p == null) {
            mandatorySystemGestureInsets = this.f258c.getMandatorySystemGestureInsets();
            this.f264p = x.b.c(mandatorySystemGestureInsets);
        }
        return this.f264p;
    }

    @Override // E.T
    public x.b i() {
        Insets systemGestureInsets;
        if (this.o == null) {
            systemGestureInsets = this.f258c.getSystemGestureInsets();
            this.o = x.b.c(systemGestureInsets);
        }
        return this.o;
    }

    @Override // E.T
    public x.b k() {
        Insets tappableElementInsets;
        if (this.f265q == null) {
            tappableElementInsets = this.f258c.getTappableElementInsets();
            this.f265q = x.b.c(tappableElementInsets);
        }
        return this.f265q;
    }

    @Override // E.M, E.T
    public void q(x.b bVar) {
    }
}
