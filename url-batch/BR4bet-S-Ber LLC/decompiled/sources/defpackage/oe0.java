package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class oe0 extends ne0 {
    public er r;

    public oe0(ye0 ye0Var, WindowInsets windowInsets) {
        super(ye0Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.ve0
    public ye0 b() {
        return ye0.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.ve0
    public ye0 c() {
        return ye0.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.ve0
    public final er k() {
        if (this.r == null) {
            WindowInsets windowInsets = this.c;
            this.r = er.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.r;
    }

    @Override // defpackage.ve0
    public boolean r() {
        return this.c.isConsumed();
    }

    @Override // defpackage.ve0
    public void w(er erVar) {
        this.r = erVar;
    }
}
