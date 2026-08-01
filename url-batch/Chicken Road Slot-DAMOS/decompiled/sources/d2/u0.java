package d2;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u0 implements t0 {

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f3541d = new Matrix();

    /* renamed from: e, reason: collision with root package name */
    public final int[] f3542e = new int[2];

    @Override // d2.t0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f3541d;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f3542e;
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i10 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i3, iArr[1] - i10);
        k1.v.p(fArr, matrix);
    }
}
