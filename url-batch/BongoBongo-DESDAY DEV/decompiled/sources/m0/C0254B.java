package m0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: m0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254B extends C0253A {
    @Override // h.AbstractC0112a
    public final float m(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // h.AbstractC0112a
    public final void r(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // m0.C0253A, h.AbstractC0112a
    public final void s(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // m0.C0253A
    public final void v(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // m0.C0253A
    public final void w(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // m0.C0253A
    public final void x(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
