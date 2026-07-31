package x1;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v0 implements u0 {

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f8593d = new Matrix();

    /* renamed from: e, reason: collision with root package name */
    public final int[] f8594e = new int[2];

    @Override // x1.u0
    public void b(View view, float[] fArr) {
        Matrix matrix = this.f8593d;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f8594e;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i8 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i8);
        f1.p.p(fArr, matrix);
    }
}
