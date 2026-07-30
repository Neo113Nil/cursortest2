package defpackage;

import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class y6 implements vk0 {
    public final /* synthetic */ pn1 a;
    public final /* synthetic */ jd0 b;

    public y6(pn1 pn1Var, jd0 jd0Var) {
        this.a = pn1Var;
        this.b = jd0Var;
    }

    @Override // defpackage.vk0
    public final wk0 f(ej0 ej0Var, List list, long j) {
        pn1 pn1Var = this.a;
        if (pn1Var.getChildCount() == 0) {
            return xk0.q(ej0Var, mm.j(j), mm.i(j), y3.k);
        }
        if (mm.j(j) != 0) {
            pn1Var.getChildAt(0).setMinimumWidth(mm.j(j));
        }
        if (mm.i(j) != 0) {
            pn1Var.getChildAt(0).setMinimumHeight(mm.i(j));
        }
        int j2 = mm.j(j);
        int h = mm.h(j);
        ViewGroup.LayoutParams layoutParams = pn1Var.getLayoutParams();
        layoutParams.getClass();
        int e = c7.e(pn1Var, j2, h, layoutParams.width);
        int i = mm.i(j);
        int g = mm.g(j);
        ViewGroup.LayoutParams layoutParams2 = pn1Var.getLayoutParams();
        layoutParams2.getClass();
        pn1Var.measure(e, c7.e(pn1Var, i, g, layoutParams2.height));
        return xk0.q(ej0Var, pn1Var.getMeasuredWidth(), pn1Var.getMeasuredHeight(), new w6(pn1Var, this.b, 1));
    }
}
