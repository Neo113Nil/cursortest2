package defpackage;

import android.view.View;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class q10 extends zl0 implements h10 {
    @Override // defpackage.h10
    public final void J(f10 f10Var) {
        View j = m90.j(this);
        f10Var.d(this.d.r && m90.j(this).hasFocusable());
        View findFocus = j.findFocus();
        if (findFocus != null) {
            f10Var.e(y00.a(findFocus, j));
        }
    }
}
