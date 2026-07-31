package k0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
class L extends K {
    L() {
    }

    @Override // k0.AbstractC3191D, k0.M
    public float b(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // k0.I, k0.M
    public void d(View view, int i4, int i5, int i6, int i7) {
        view.setLeftTopRightBottom(i4, i5, i6, i7);
    }

    @Override // k0.AbstractC3191D, k0.M
    public void e(View view, float f4) {
        view.setTransitionAlpha(f4);
    }

    @Override // k0.K, k0.M
    public void f(View view, int i4) {
        view.setTransitionVisibility(i4);
    }

    @Override // k0.G, k0.M
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // k0.G, k0.M
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
