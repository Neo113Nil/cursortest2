package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class hb0 extends gb0 {
    public to r;

    public hb0(rb0 rb0Var, WindowInsets windowInsets) {
        super(rb0Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.ob0
    public rb0 b() {
        return rb0.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.ob0
    public rb0 c() {
        return rb0.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.ob0
    public final to k() {
        if (this.r == null) {
            WindowInsets windowInsets = this.c;
            this.r = to.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.r;
    }

    @Override // defpackage.ob0
    public boolean r() {
        return this.c.isConsumed();
    }

    @Override // defpackage.ob0
    public void w(to toVar) {
        this.r = toVar;
    }
}
