package k0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: k0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0175A {
    public static void a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static void b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
