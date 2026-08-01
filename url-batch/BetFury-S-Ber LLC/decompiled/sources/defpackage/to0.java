package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class to0 extends so0 {
    public fv r;

    public to0(dp0 dp0Var, WindowInsets windowInsets) {
        super(dp0Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.ap0
    public dp0 b() {
        return dp0.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.ap0
    public dp0 c() {
        return dp0.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.ap0
    public final fv k() {
        if (this.r == null) {
            WindowInsets windowInsets = this.c;
            this.r = fv.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.r;
    }

    @Override // defpackage.ap0
    public boolean r() {
        return this.c.isConsumed();
    }

    @Override // defpackage.ap0
    public void w(fv fvVar) {
        this.r = fvVar;
    }
}
