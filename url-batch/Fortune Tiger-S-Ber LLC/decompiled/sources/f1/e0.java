package f1;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e0 extends d0 {
    @Override // k3.m
    public final float A(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // k3.m
    public final void U(View view, float f4) {
        view.setTransitionAlpha(f4);
    }

    @Override // f1.d0, k3.m
    public final void V(View view, int i4) {
        view.setTransitionVisibility(i4);
    }

    @Override // f1.d0
    public final void W(View view, int i4, int i5, int i6, int i7) {
        view.setLeftTopRightBottom(i4, i5, i6, i7);
    }

    @Override // f1.d0
    public final void X(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // f1.d0
    public final void Y(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
