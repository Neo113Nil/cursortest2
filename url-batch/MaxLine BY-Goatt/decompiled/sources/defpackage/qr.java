package defpackage;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qr implements pr {
    public final int[] a;
    public final float[] b;

    public qr(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = ((Integer) arrayList.get(i)).intValue();
            this.b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // defpackage.pr
    public void a(View view, float[] fArr) {
        ti1.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.b;
        if (z) {
            b((View) parent, fArr);
            ti1.d(fArr2);
            ti1.f(fArr2, -view.getScrollX(), -view.getScrollY());
            j8.Q(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            ti1.d(fArr2);
            ti1.f(fArr2, left, top);
            j8.Q(fArr, fArr2);
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            ti1.d(fArr2);
            ti1.f(fArr2, -view.getScrollX(), -view.getScrollY());
            j8.Q(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            ti1.d(fArr2);
            ti1.f(fArr2, f, f2);
            j8.Q(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        l41.Z(matrix, fArr2);
        j8.Q(fArr, fArr2);
    }

    public qr(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public qr(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public qr(float[] fArr) {
        this.b = fArr;
        this.a = new int[2];
    }
}
