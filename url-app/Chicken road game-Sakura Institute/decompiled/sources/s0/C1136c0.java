package s0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: s0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1136c0 implements InterfaceC1134b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f10181a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10182b = new int[2];

    @Override // s0.InterfaceC1134b0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f10181a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f10182b;
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i4 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i2, iArr[1] - i4);
        Z.K.y(matrix, fArr);
    }
}
