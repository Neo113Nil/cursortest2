package k0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class F extends E {
    @Override // k0.z
    public final float j(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // k0.z
    public final void o(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // k0.E, k0.z
    public final void p(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // k0.E
    public final void q(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // k0.E
    public final void r(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // k0.E
    public final void s(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
