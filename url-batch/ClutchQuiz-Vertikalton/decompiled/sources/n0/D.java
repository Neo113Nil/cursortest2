package n0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class D extends C {
    @Override // h0.g
    public final float e(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // h0.g
    public final void l(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // n0.C, h0.g
    public final void m(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // n0.C
    public final void q(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // n0.C
    public final void r(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // n0.C
    public final void s(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
