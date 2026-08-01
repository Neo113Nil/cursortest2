package k1;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e0 extends d0 {
    @Override // b4.d
    public final float A(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // b4.d
    public final void T(View view, float f5) {
        view.setTransitionAlpha(f5);
    }

    @Override // k1.d0, b4.d
    public final void U(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // k1.d0
    public final void Z(View view, int i, int i4, int i5, int i6) {
        view.setLeftTopRightBottom(i, i4, i5, i6);
    }

    @Override // k1.d0
    public final void a0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // k1.d0
    public final void b0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
