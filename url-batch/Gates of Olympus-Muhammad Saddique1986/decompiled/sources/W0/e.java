package W0;

import android.graphics.Matrix;
import android.view.View;
import b0.G;
import b0.M;
import java.util.ArrayList;
import u0.InterfaceC1091b0;
import u0.L;

/* loaded from: classes.dex */
public final class e implements InterfaceC1091b0 {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f4595a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4596b;

    public e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f4596b = new int[size];
        this.f4595a = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            this.f4596b[i3] = ((Integer) arrayList.get(i3)).intValue();
            this.f4595a[i3] = ((Float) arrayList2.get(i3)).floatValue();
        }
    }

    @Override // u0.InterfaceC1091b0
    public void a(View view, float[] fArr) {
        G.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z3 = parent instanceof View;
        float[] fArr2 = this.f4595a;
        if (z3) {
            b((View) parent, fArr);
            G.d(fArr2);
            G.h(fArr2, -view.getScrollX(), -view.getScrollY(), 0.0f);
            L.x(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            G.d(fArr2);
            G.h(fArr2, left, top, 0.0f);
            L.x(fArr, fArr2);
        } else {
            int[] iArr = this.f4596b;
            view.getLocationInWindow(iArr);
            G.d(fArr2);
            G.h(fArr2, -view.getScrollX(), -view.getScrollY(), 0.0f);
            L.x(fArr, fArr2);
            float f3 = iArr[0];
            float f4 = iArr[1];
            G.d(fArr2);
            G.h(fArr2, f3, f4, 0.0f);
            L.x(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        M.y(matrix, fArr2);
        L.x(fArr, fArr2);
    }

    public e(int i3, int i4) {
        this.f4596b = new int[]{i3, i4};
        this.f4595a = new float[]{0.0f, 1.0f};
    }

    public e(int i3, int i4, int i5) {
        this.f4596b = new int[]{i3, i4, i5};
        this.f4595a = new float[]{0.0f, 0.5f, 1.0f};
    }

    public e(float[] fArr) {
        this.f4595a = fArr;
        this.f4596b = new int[2];
    }
}
