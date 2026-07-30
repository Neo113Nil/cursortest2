package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class dp1 extends cp1 {
    public static final ip1 m = ip1.c(null, WindowInsets.CONSUMED);

    public dp1(ip1 ip1Var, WindowInsets windowInsets) {
        super(ip1Var, windowInsets);
    }

    @Override // defpackage.zo1, defpackage.fp1
    public c90 g(int i) {
        return c90.b(this.c.getInsets(gp1.a(i)));
    }

    @Override // defpackage.zo1, defpackage.fp1
    public c90 h(int i) {
        return c90.b(this.c.getInsetsIgnoringVisibility(gp1.a(i)));
    }

    @Override // defpackage.zo1, defpackage.fp1
    public boolean q(int i) {
        return this.c.isVisible(gp1.a(i));
    }

    public dp1(ip1 ip1Var, dp1 dp1Var) {
        super(ip1Var, dp1Var);
    }

    @Override // defpackage.zo1, defpackage.fp1
    public final void d(View view) {
    }
}
