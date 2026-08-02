package p1;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class B extends A {
    @Override // p1.A
    public final void P(View view, int i4, int i5, int i6, int i7) {
        view.setLeftTopRightBottom(i4, i5, i6, i7);
    }

    @Override // p1.A
    public final void Q(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p1.A
    public final void R(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // U.i
    public final float l(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // U.i
    public final void w(View view, float f4) {
        view.setTransitionAlpha(f4);
    }

    @Override // p1.A, U.i
    public final void x(View view, int i4) {
        view.setTransitionVisibility(i4);
    }
}
