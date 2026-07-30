package defpackage;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nh implements mh {
    public final int[] PxuCJdSBwIXG;
    public final float[] lS5Rgt96tfkO;

    public nh(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.PxuCJdSBwIXG = new int[size];
        this.lS5Rgt96tfkO = new float[size];
        for (int i = 0; i < size; i++) {
            this.PxuCJdSBwIXG[i] = ((Integer) arrayList.get(i)).intValue();
            this.lS5Rgt96tfkO[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // defpackage.mh
    public void PxuCJdSBwIXG(View view, float[] fArr) {
        d51.Y1f8riQaR6yg(fArr);
        lS5Rgt96tfkO(view, fArr);
    }

    public void lS5Rgt96tfkO(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.lS5Rgt96tfkO;
        if (z) {
            lS5Rgt96tfkO((View) parent, fArr);
            d51.Y1f8riQaR6yg(fArr2);
            d51.a92UlCVFR9N8(fArr2, -view.getScrollX(), -view.getScrollY());
            f2.nLZGh9p8gVSu(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            d51.Y1f8riQaR6yg(fArr2);
            d51.a92UlCVFR9N8(fArr2, left, top);
            f2.nLZGh9p8gVSu(fArr, fArr2);
        } else {
            int[] iArr = this.PxuCJdSBwIXG;
            view.getLocationInWindow(iArr);
            d51.Y1f8riQaR6yg(fArr2);
            d51.a92UlCVFR9N8(fArr2, -view.getScrollX(), -view.getScrollY());
            f2.nLZGh9p8gVSu(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            d51.Y1f8riQaR6yg(fArr2);
            d51.a92UlCVFR9N8(fArr2, f, f2);
            f2.nLZGh9p8gVSu(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        fx1.uy1Qfkdvj4xZ(matrix, fArr2);
        f2.nLZGh9p8gVSu(fArr, fArr2);
    }

    public nh(int i, int i2) {
        this.PxuCJdSBwIXG = new int[]{i, i2};
        this.lS5Rgt96tfkO = new float[]{0.0f, 1.0f};
    }

    public nh(int i, int i2, int i3) {
        this.PxuCJdSBwIXG = new int[]{i, i2, i3};
        this.lS5Rgt96tfkO = new float[]{0.0f, 0.5f, 1.0f};
    }

    public nh(float[] fArr) {
        this.lS5Rgt96tfkO = fArr;
        this.PxuCJdSBwIXG = new int[2];
    }
}
