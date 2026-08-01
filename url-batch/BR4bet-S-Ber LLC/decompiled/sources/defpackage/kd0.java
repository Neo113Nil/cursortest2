package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class kd0 extends jd0 {
    @Override // defpackage.b9
    public final void Q(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.jd0
    public final void X(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.jd0
    public final void Y(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.jd0
    public final void Z(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.jd0
    public final void a0(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.b9
    public final float r(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }
}
