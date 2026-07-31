package q3;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class e1 extends d1 {

    /* renamed from: o, reason: collision with root package name */
    public i3.c f6097o;

    /* renamed from: p, reason: collision with root package name */
    public i3.c f6098p;

    /* renamed from: q, reason: collision with root package name */
    public i3.c f6099q;

    public e1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f6097o = null;
        this.f6098p = null;
        this.f6099q = null;
    }

    @Override // q3.i1
    public i3.c h() {
        Insets mandatorySystemGestureInsets;
        if (this.f6098p == null) {
            mandatorySystemGestureInsets = this.f6085c.getMandatorySystemGestureInsets();
            this.f6098p = i3.c.c(mandatorySystemGestureInsets);
        }
        return this.f6098p;
    }

    @Override // q3.i1
    public i3.c j() {
        Insets systemGestureInsets;
        if (this.f6097o == null) {
            systemGestureInsets = this.f6085c.getSystemGestureInsets();
            this.f6097o = i3.c.c(systemGestureInsets);
        }
        return this.f6097o;
    }

    @Override // q3.i1
    public i3.c l() {
        Insets tappableElementInsets;
        if (this.f6099q == null) {
            tappableElementInsets = this.f6085c.getTappableElementInsets();
            this.f6099q = i3.c.c(tappableElementInsets);
        }
        return this.f6099q;
    }

    @Override // q3.b1, q3.i1
    public l1 m(int i, int i8, int i9, int i10) {
        WindowInsets inset;
        inset = this.f6085c.inset(i, i8, i9, i10);
        return l1.d(null, inset);
    }

    @Override // q3.c1, q3.i1
    public void s(i3.c cVar) {
    }
}
