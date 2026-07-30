package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class ap1 extends zo1 {
    public c90 i;

    public ap1(ip1 ip1Var, ap1 ap1Var) {
        super(ip1Var, ap1Var);
        this.i = null;
        this.i = ap1Var.i;
    }

    @Override // defpackage.fp1
    public ip1 b() {
        return ip1.c(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.fp1
    public ip1 c() {
        return ip1.c(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.fp1
    public final c90 j() {
        if (this.i == null) {
            WindowInsets windowInsets = this.c;
            this.i = c90.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.i;
    }

    @Override // defpackage.fp1
    public boolean o() {
        return this.c.isConsumed();
    }

    public ap1(ip1 ip1Var, WindowInsets windowInsets) {
        super(ip1Var, windowInsets);
        this.i = null;
    }
}
