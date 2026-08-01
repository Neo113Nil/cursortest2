package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ia0 extends ha0 {
    @Override // defpackage.j8
    public final void S(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.ha0
    public final void Z(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.ha0
    public final void a0(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.ha0
    public final void b0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.ha0
    public final void c0(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.j8
    public final float x(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }
}
