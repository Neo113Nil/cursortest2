package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class jn0 extends in0 {
    @Override // defpackage.bd0
    public final float g(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // defpackage.bd0
    public final void j(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.in0
    public final void k(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.in0
    public final void l(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.in0
    public final void m(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.in0
    public final void n(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
