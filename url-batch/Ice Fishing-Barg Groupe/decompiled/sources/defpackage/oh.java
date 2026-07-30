package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class oh implements mh {
    public final Matrix PxuCJdSBwIXG = new Matrix();
    public final int[] lS5Rgt96tfkO = new int[2];

    @Override // defpackage.mh
    public void PxuCJdSBwIXG(View view, float[] fArr) {
        Matrix matrix = this.PxuCJdSBwIXG;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.lS5Rgt96tfkO;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        fx1.uy1Qfkdvj4xZ(matrix, fArr);
    }
}
