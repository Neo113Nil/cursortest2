package androidx.transition;

import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes5.dex */
class ViewUtilsApi23 extends ViewUtilsApi22 {
    private static boolean sTryHiddenSetTransitionVisibility = true;

    ViewUtilsApi23() {
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void setTransitionVisibility(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.setTransitionVisibility(view, i);
        } else if (sTryHiddenSetTransitionVisibility) {
            try {
                Api29Impl.setTransitionVisibility(view, i);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetTransitionVisibility = false;
            }
        }
    }

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static void setTransitionVisibility(View view, int i) {
            view.setTransitionVisibility(i);
        }
    }
}
