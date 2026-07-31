package D;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class T extends S {

    /* renamed from: n, reason: collision with root package name */
    public w.c f265n;

    /* renamed from: o, reason: collision with root package name */
    public w.c f266o;

    /* renamed from: p, reason: collision with root package name */
    public w.c f267p;

    public T(Y y, WindowInsets windowInsets) {
        super(y, windowInsets);
        this.f265n = null;
        this.f266o = null;
        this.f267p = null;
    }

    @Override // D.W
    public w.c f() {
        Insets mandatorySystemGestureInsets;
        if (this.f266o == null) {
            mandatorySystemGestureInsets = this.f259c.getMandatorySystemGestureInsets();
            this.f266o = w.c.b(mandatorySystemGestureInsets);
        }
        return this.f266o;
    }

    @Override // D.W
    public w.c h() {
        Insets systemGestureInsets;
        if (this.f265n == null) {
            systemGestureInsets = this.f259c.getSystemGestureInsets();
            this.f265n = w.c.b(systemGestureInsets);
        }
        return this.f265n;
    }

    @Override // D.W
    public w.c j() {
        Insets tappableElementInsets;
        if (this.f267p == null) {
            tappableElementInsets = this.f259c.getTappableElementInsets();
            this.f267p = w.c.b(tappableElementInsets);
        }
        return this.f267p;
    }

    @Override // D.P, D.W
    public Y k(int i7, int i8, int i9, int i10) {
        WindowInsets inset;
        inset = this.f259c.inset(i7, i8, i9, i10);
        return Y.c(inset, null);
    }

    @Override // D.Q, D.W
    public void q(w.c cVar) {
    }
}
