package k0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: k0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178E extends C0177D {
    @Override // k0.k
    public final float k(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // k0.k
    public final void r(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // k0.C0177D, k0.k
    public final void s(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // k0.C0177D
    public final void u(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // k0.C0177D
    public final void v(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // k0.C0177D
    public final void w(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
