package c5;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 extends e0 {
    @Override // c5.e0
    public final void E(View view, int i, int i8, int i9, int i10) {
        view.setLeftTopRightBottom(i, i8, i9, i10);
    }

    @Override // c5.e0
    public final void F(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // c5.e0
    public final void G(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // a.a
    public final float n(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // a.a
    public final void y(View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    @Override // c5.e0, a.a
    public final void z(View view, int i) {
        view.setTransitionVisibility(i);
    }
}
