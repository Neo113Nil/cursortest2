package E;

import android.graphics.Insets;
import android.view.WindowInsets;
import x.C1528c;

/* loaded from: classes.dex */
public class X extends W {

    /* renamed from: n, reason: collision with root package name */
    public C1528c f591n;

    /* renamed from: o, reason: collision with root package name */
    public C1528c f592o;

    /* renamed from: p, reason: collision with root package name */
    public C1528c f593p;

    public X(b0 b0Var, WindowInsets windowInsets) {
        super(b0Var, windowInsets);
        this.f591n = null;
        this.f592o = null;
        this.f593p = null;
    }

    @Override // E.Z
    public C1528c f() {
        Insets mandatorySystemGestureInsets;
        if (this.f592o == null) {
            mandatorySystemGestureInsets = this.f585c.getMandatorySystemGestureInsets();
            this.f592o = C1528c.b(mandatorySystemGestureInsets);
        }
        return this.f592o;
    }

    @Override // E.Z
    public C1528c h() {
        Insets systemGestureInsets;
        if (this.f591n == null) {
            systemGestureInsets = this.f585c.getSystemGestureInsets();
            this.f591n = C1528c.b(systemGestureInsets);
        }
        return this.f591n;
    }

    @Override // E.Z
    public C1528c j() {
        Insets tappableElementInsets;
        if (this.f593p == null) {
            tappableElementInsets = this.f585c.getTappableElementInsets();
            this.f593p = C1528c.b(tappableElementInsets);
        }
        return this.f593p;
    }

    @Override // E.V, E.Z
    public void p(C1528c c1528c) {
    }
}
