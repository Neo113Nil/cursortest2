package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class ac0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static ye0 b(View view, ye0 ye0Var, Rect rect) {
        WindowInsets f = ye0Var.f();
        if (f != null) {
            return ye0.g(view, view.computeSystemWindowInsets(f, rect));
        }
        rect.setEmpty();
        return ye0Var;
    }

    public static void c(View view, zy zyVar) {
        zb0 zb0Var = zyVar != null ? new zb0(view, zyVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, zb0Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (zb0Var != null) {
            view.setOnApplyWindowInsetsListener(zb0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
