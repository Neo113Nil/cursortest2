package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ep1 extends dp1 {
    public static final ip1 n = ip1.c(null, WindowInsets.CONSUMED);

    public ep1(ip1 ip1Var, WindowInsets windowInsets) {
        super(ip1Var, windowInsets);
    }

    @Override // defpackage.dp1, defpackage.zo1, defpackage.fp1
    public c90 g(int i) {
        return c90.b(this.c.getInsets(hp1.a(i)));
    }

    @Override // defpackage.dp1, defpackage.zo1, defpackage.fp1
    public c90 h(int i) {
        return c90.b(this.c.getInsetsIgnoringVisibility(hp1.a(i)));
    }

    @Override // defpackage.dp1, defpackage.zo1, defpackage.fp1
    public boolean q(int i) {
        return this.c.isVisible(hp1.a(i));
    }

    public ep1(ip1 ip1Var, ep1 ep1Var) {
        super(ip1Var, ep1Var);
    }
}
