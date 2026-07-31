package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes5.dex */
class ViewUtilsApi21 extends ViewUtilsApi19 {
    private static boolean sTryHiddenSetAnimationMatrix = true;
    private static boolean sTryHiddenTransformMatrixToGlobal = true;
    private static boolean sTryHiddenTransformMatrixToLocal = true;

    ViewUtilsApi21() {
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void transformMatrixToGlobal(View view, Matrix matrix) {
        if (sTryHiddenTransformMatrixToGlobal) {
            try {
                Api29Impl.transformMatrixToGlobal(view, matrix);
            } catch (NoSuchMethodError unused) {
                sTryHiddenTransformMatrixToGlobal = false;
            }
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void transformMatrixToLocal(View view, Matrix matrix) {
        if (sTryHiddenTransformMatrixToLocal) {
            try {
                Api29Impl.transformMatrixToLocal(view, matrix);
            } catch (NoSuchMethodError unused) {
                sTryHiddenTransformMatrixToLocal = false;
            }
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void setAnimationMatrix(View view, Matrix matrix) {
        if (sTryHiddenSetAnimationMatrix) {
            try {
                Api29Impl.setAnimationMatrix(view, matrix);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetAnimationMatrix = false;
            }
        }
    }

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static void transformMatrixToGlobal(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        @DoNotInline
        static void transformMatrixToLocal(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }

        @DoNotInline
        static void setAnimationMatrix(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }
    }
}
