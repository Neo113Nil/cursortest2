package p0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class C extends B {
    @Override // p0.B
    public final void D(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p0.B
    public final void E(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p0.B
    public final void F(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // b1.g
    public final float r(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // b1.g
    public final void y(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // p0.B, b1.g
    public final void z(View view, int i) {
        view.setTransitionVisibility(i);
    }
}
