package l0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: l0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254D extends C0253C {
    @Override // i0.g
    public final float l(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // i0.g
    public final void q(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // l0.C0253C, i0.g
    public final void r(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // l0.C0253C
    public final void u(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // l0.C0253C
    public final void v(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // l0.C0253C
    public final void w(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
