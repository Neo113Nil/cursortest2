package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpm extends fpk {
    private static final int[] v = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    private final AccessibilityManager w;
    private boolean x;

    private fpm(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(context, viewGroup, view, snackbarContentLayout);
        this.w = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static fpm m(View view, int i, int i2) {
        return n(view, view.getResources().getText(i), i2);
    }

    public static fpm n(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(v);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        int i2 = R.layout.design_layout_snackbar_include;
        if (resourceId != -1 && resourceId2 != -1) {
            i2 = R.layout.mtrl_layout_snackbar_include;
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, viewGroup, false);
        fpm fpmVar = new fpm(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        fpmVar.p().a.setText(charSequence);
        fpmVar.k = i;
        return fpmVar;
    }

    private final SnackbarContentLayout p() {
        return (SnackbarContentLayout) this.j.getChildAt(0);
    }

    @Override // defpackage.fpk
    public final int a() {
        int recommendedTimeoutMillis;
        int i = this.k;
        if (i == -2) {
            return -2;
        }
        int i2 = Build.VERSION.SDK_INT;
        boolean z = this.x;
        if (i2 >= 29) {
            recommendedTimeoutMillis = this.w.getRecommendedTimeoutMillis(i, (true != z ? 0 : 4) | 3);
            return recommendedTimeoutMillis;
        }
        if (z && this.w.isTouchExplorationEnabled()) {
            return -2;
        }
        return i;
    }

    public final void o(int i, View.OnClickListener onClickListener) {
        CharSequence text = this.i.getText(i);
        Button button = p().b;
        if (TextUtils.isEmpty(text)) {
            button.setVisibility(8);
            button.setOnClickListener(null);
            this.x = false;
        } else {
            this.x = true;
            button.setVisibility(0);
            button.setText(text);
            button.setOnClickListener(new drl(this, onClickListener, 10));
        }
    }
}
