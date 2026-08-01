package p0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: p0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322C extends C0321B {
    @Override // H1.l
    public final float B(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // H1.l
    public final void e0(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // p0.C0321B, H1.l
    public final void f0(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p0.C0321B
    public final void k0(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p0.C0321B
    public final void l0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p0.C0321B
    public final void m0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
