package m0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: m0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231C extends C0230B {
    @Override // h0.a0
    public final float l(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // h0.a0
    public final void r(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // m0.C0230B, h0.a0
    public final void s(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // m0.C0230B
    public final void w(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // m0.C0230B
    public final void x(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // m0.C0230B
    public final void y(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
