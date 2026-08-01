package l0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: l0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251D extends C0250C {
    @Override // h1.d
    public final float j(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // h1.d
    public final void p(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // l0.C0250C, h1.d
    public final void q(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // l0.C0250C
    public final void t(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // l0.C0250C
    public final void u(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // l0.C0250C
    public final void v(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
