package j0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: j0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174D extends C0173C {
    @Override // i1.r
    public final float i(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // i1.r
    public final void q(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // j0.C0173C, i1.r
    public final void r(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // j0.C0173C
    public final void u(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // j0.C0173C
    public final void v(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // j0.C0173C
    public final void w(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
