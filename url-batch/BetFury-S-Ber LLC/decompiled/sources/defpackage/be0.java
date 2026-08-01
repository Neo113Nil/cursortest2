package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class be0 extends q8 {
    public static final int[] C = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager A;
    public boolean B;

    public be0(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static be0 f(CoordinatorLayout coordinatorLayout, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (coordinatorLayout instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) coordinatorLayout;
                break;
            }
            if (coordinatorLayout instanceof FrameLayout) {
                if (coordinatorLayout.getId() == 16908290) {
                    viewGroup = (ViewGroup) coordinatorLayout;
                    break;
                }
                viewGroup2 = coordinatorLayout;
            }
            if (coordinatorLayout != 0) {
                Object parent = coordinatorLayout.getParent();
                coordinatorLayout = parent instanceof View ? (View) parent : 0;
            }
            if (coordinatorLayout == 0) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            s9.k("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        be0 be0Var = new be0(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) be0Var.i.getChildAt(0)).getMessageView().setText(charSequence);
        be0Var.k = i;
        return be0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0029, code lost:
    
        if (r1.isTouchExplorationEnabled() != false) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        wi i = wi.i();
        AccessibilityManager accessibilityManager = this.A;
        int i2 = this.k;
        boolean z = false;
        if (i2 != -2) {
            int i3 = Build.VERSION.SDK_INT;
            boolean z2 = this.B;
            if (i3 >= 29) {
                i2 = accessibilityManager.getRecommendedTimeoutMillis(i2, (z2 ? 4 : 0) | 3);
            } else if (z2) {
            }
            n8 n8Var = this.t;
            synchronized (i.f) {
                try {
                    if (i.l(n8Var)) {
                        de0 de0Var = (de0) i.h;
                        de0Var.b = i2;
                        ((Handler) i.g).removeCallbacksAndMessages(de0Var);
                        i.s((de0) i.h);
                        return;
                    }
                    de0 de0Var2 = (de0) i.i;
                    if (de0Var2 != null && de0Var2.a.get() == n8Var) {
                        z = true;
                    }
                    if (z) {
                        ((de0) i.i).b = i2;
                    } else {
                        i.i = new de0(i2, n8Var);
                    }
                    de0 de0Var3 = (de0) i.h;
                    if (de0Var3 == null || !i.d(de0Var3, 4)) {
                        i.h = null;
                        i.t();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        i2 = -2;
        n8 n8Var2 = this.t;
        synchronized (i.f) {
        }
    }
}
