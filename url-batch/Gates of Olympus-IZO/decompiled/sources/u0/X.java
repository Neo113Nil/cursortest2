package u0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import b0.AbstractC0259J;

/* loaded from: classes.dex */
public final class X implements W {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f8265a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f8266b = new int[2];

    @Override // u0.W
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f8265a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f8266b;
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i3, iArr[1] - i4);
        AbstractC0259J.z(fArr, matrix);
    }
}
