package s1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a1 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f8129a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f8130b = new int[2];

    @Override // s1.y0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f8129a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f8130b;
        view.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        int i8 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i7, iArr[1] - i8);
        z0.l0.r(matrix, fArr);
    }
}
