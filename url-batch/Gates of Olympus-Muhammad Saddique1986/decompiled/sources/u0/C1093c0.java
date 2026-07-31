package u0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: u0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1093c0 implements InterfaceC1091b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f9319a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9320b = new int[2];

    @Override // u0.InterfaceC1091b0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f9319a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f9320b;
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i3, iArr[1] - i4);
        b0.M.y(matrix, fArr);
    }
}
