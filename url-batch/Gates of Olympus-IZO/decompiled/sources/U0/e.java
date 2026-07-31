package U0;

import android.graphics.Matrix;
import android.view.View;
import b0.AbstractC0259J;
import java.util.ArrayList;
import u0.L;
import u0.W;

/* loaded from: classes.dex */
public final class e implements W {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f3327a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3328b;

    public e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f3328b = new int[size];
        this.f3327a = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            this.f3328b[i3] = ((Integer) arrayList.get(i3)).intValue();
            this.f3327a[i3] = ((Float) arrayList2.get(i3)).floatValue();
        }
    }

    @Override // u0.W
    public void a(View view, float[] fArr) {
        AbstractC0259J.w(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z3 = parent instanceof View;
        float[] fArr2 = this.f3327a;
        if (z3) {
            b((View) parent, fArr);
            AbstractC0259J.w(fArr2);
            AbstractC0259J.H(fArr2, -view.getScrollX(), -view.getScrollY());
            L.t(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            AbstractC0259J.w(fArr2);
            AbstractC0259J.H(fArr2, left, top);
            L.t(fArr, fArr2);
        } else {
            int[] iArr = this.f3328b;
            view.getLocationInWindow(iArr);
            AbstractC0259J.w(fArr2);
            AbstractC0259J.H(fArr2, -view.getScrollX(), -view.getScrollY());
            L.t(fArr, fArr2);
            float f3 = iArr[0];
            float f4 = iArr[1];
            AbstractC0259J.w(fArr2);
            AbstractC0259J.H(fArr2, f3, f4);
            L.t(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC0259J.z(fArr2, matrix);
        L.t(fArr, fArr2);
    }

    public e(int i3, int i4) {
        this.f3328b = new int[]{i3, i4};
        this.f3327a = new float[]{0.0f, 1.0f};
    }

    public e(int i3, int i4, int i5) {
        this.f3328b = new int[]{i3, i4, i5};
        this.f3327a = new float[]{0.0f, 0.5f, 1.0f};
    }

    public e(float[] fArr) {
        this.f3327a = fArr;
        this.f3328b = new int[2];
    }
}
