package I;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class l0 extends k0 {

    /* renamed from: s, reason: collision with root package name */
    public B.c f1216s;

    /* renamed from: t, reason: collision with root package name */
    public B.c f1217t;

    /* renamed from: u, reason: collision with root package name */
    public B.c f1218u;

    public l0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
        this.f1216s = null;
        this.f1217t = null;
        this.f1218u = null;
    }

    @Override // I.r0
    public B.c h() {
        Insets mandatorySystemGestureInsets;
        if (this.f1217t == null) {
            mandatorySystemGestureInsets = this.f1202c.getMandatorySystemGestureInsets();
            this.f1217t = B.c.b(mandatorySystemGestureInsets);
        }
        return this.f1217t;
    }

    @Override // I.r0
    public B.c j() {
        Insets systemGestureInsets;
        if (this.f1216s == null) {
            systemGestureInsets = this.f1202c.getSystemGestureInsets();
            this.f1216s = B.c.b(systemGestureInsets);
        }
        return this.f1216s;
    }

    @Override // I.r0
    public B.c l() {
        Insets tappableElementInsets;
        if (this.f1218u == null) {
            tappableElementInsets = this.f1202c.getTappableElementInsets();
            this.f1218u = B.c.b(tappableElementInsets);
        }
        return this.f1218u;
    }

    @Override // I.i0, I.r0
    public v0 o(int i2, int i5, int i7, int i8) {
        WindowInsets inset;
        inset = this.f1202c.inset(i2, i5, i7, i8);
        return v0.c(inset, null);
    }

    @Override // I.j0, I.r0
    public void v(B.c cVar) {
    }
}
