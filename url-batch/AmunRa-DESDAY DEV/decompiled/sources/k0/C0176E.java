package k0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: k0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176E extends C0175D {
    @Override // k0.y
    public final float h(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // k0.y
    public final void l(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // k0.C0175D, k0.y
    public final void m(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // k0.C0175D
    public final void n(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // k0.C0175D
    public final void o(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // k0.C0175D
    public final void p(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
