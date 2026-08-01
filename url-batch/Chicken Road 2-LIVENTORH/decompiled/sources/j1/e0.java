package j1;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e0 extends d0 {
    @Override // h.a
    public final float I(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // h.a
    public final void m0(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // j1.d0, h.a
    public final void n0(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // j1.d0
    public final void t0(View view, int i, int i4, int i5, int i6) {
        view.setLeftTopRightBottom(i, i4, i5, i6);
    }

    @Override // j1.d0
    public final void u0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // j1.d0
    public final void v0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
