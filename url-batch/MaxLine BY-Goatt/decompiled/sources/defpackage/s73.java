package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class s73 extends r73 {
    public z21 r;

    public s73(c83 c83Var, WindowInsets windowInsets) {
        super(c83Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.z73
    public c83 b() {
        return c83.c(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.z73
    public c83 c() {
        return c83.c(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.z73
    public final z21 k() {
        if (this.r == null) {
            WindowInsets windowInsets = this.c;
            this.r = z21.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.r;
    }

    @Override // defpackage.z73
    public boolean r() {
        return this.c.isConsumed();
    }

    @Override // defpackage.z73
    public void x(z21 z21Var) {
        this.r = z21Var;
    }
}
