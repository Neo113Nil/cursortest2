package s1;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f8490a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f8491b;

    public z0(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f8490a = new int[size];
        this.f8491b = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            this.f8490a[i7] = ((Integer) arrayList.get(i7)).intValue();
            this.f8491b[i7] = ((Float) arrayList2.get(i7)).floatValue();
        }
    }

    @Override // s1.y0
    public void a(View view, float[] fArr) {
        z0.f0.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z8 = parent instanceof View;
        float[] fArr2 = this.f8491b;
        if (z8) {
            b((View) parent, fArr);
            z0.f0.d(fArr2);
            z0.f0.h(fArr2, -view.getScrollX(), -view.getScrollY());
            j0.x(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            z0.f0.d(fArr2);
            z0.f0.h(fArr2, left, top);
            j0.x(fArr, fArr2);
        } else {
            int[] iArr = this.f8490a;
            view.getLocationInWindow(iArr);
            z0.f0.d(fArr2);
            z0.f0.h(fArr2, -view.getScrollX(), -view.getScrollY());
            j0.x(fArr, fArr2);
            float f9 = iArr[0];
            float f10 = iArr[1];
            z0.f0.d(fArr2);
            z0.f0.h(fArr2, f9, f10);
            j0.x(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        z0.l0.r(matrix, fArr2);
        j0.x(fArr, fArr2);
    }

    public z0(int i7, int i8) {
        this.f8490a = new int[]{i7, i8};
        this.f8491b = new float[]{0.0f, 1.0f};
    }

    public z0(int i7, int i8, int i9) {
        this.f8490a = new int[]{i7, i8, i9};
        this.f8491b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public z0(float[] fArr) {
        this.f8491b = fArr;
        this.f8490a = new int[2];
    }
}
