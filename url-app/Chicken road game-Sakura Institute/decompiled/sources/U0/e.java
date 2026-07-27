package U0;

import Z.E;
import Z.K;
import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
import s0.AbstractC1125K;
import s0.InterfaceC1134b0;

/* loaded from: classes.dex */
public final class e implements InterfaceC1134b0 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f4093a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4094b;

    public e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f4094b = new int[size];
        this.f4093a = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            this.f4094b[i2] = ((Integer) arrayList.get(i2)).intValue();
            this.f4093a[i2] = ((Float) arrayList2.get(i2)).floatValue();
        }
    }

    @Override // s0.InterfaceC1134b0
    public void a(View view, float[] fArr) {
        E.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z4 = parent instanceof View;
        float[] fArr2 = this.f4093a;
        if (z4) {
            b((View) parent, fArr);
            E.d(fArr2);
            E.h(fArr2, -view.getScrollX(), -view.getScrollY(), 0.0f);
            AbstractC1125K.m(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            E.d(fArr2);
            E.h(fArr2, left, top, 0.0f);
            AbstractC1125K.m(fArr, fArr2);
        } else {
            int[] iArr = this.f4094b;
            view.getLocationInWindow(iArr);
            E.d(fArr2);
            E.h(fArr2, -view.getScrollX(), -view.getScrollY(), 0.0f);
            AbstractC1125K.m(fArr, fArr2);
            float f4 = iArr[0];
            float f5 = iArr[1];
            E.d(fArr2);
            E.h(fArr2, f4, f5, 0.0f);
            AbstractC1125K.m(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        K.y(matrix, fArr2);
        AbstractC1125K.m(fArr, fArr2);
    }

    public e(int i2, int i4) {
        this.f4094b = new int[]{i2, i4};
        this.f4093a = new float[]{0.0f, 1.0f};
    }

    public e(int i2, int i4, int i5) {
        this.f4094b = new int[]{i2, i4, i5};
        this.f4093a = new float[]{0.0f, 0.5f, 1.0f};
    }

    public e(float[] fArr) {
        this.f4093a = fArr;
        this.f4094b = new int[2];
    }
}
