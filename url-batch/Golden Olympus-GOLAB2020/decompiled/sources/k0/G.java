package k0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
abstract class G extends AbstractC3191D {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f40873d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f40874e = true;

    G() {
    }

    @Override // k0.M
    public void g(View view, Matrix matrix) {
        if (f40873d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f40873d = false;
            }
        }
    }

    @Override // k0.M
    public void h(View view, Matrix matrix) {
        if (f40874e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f40874e = false;
            }
        }
    }
}
