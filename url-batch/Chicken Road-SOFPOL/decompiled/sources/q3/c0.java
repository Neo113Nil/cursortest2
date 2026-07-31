package q3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static l1 b(View view, l1 l1Var, Rect rect) {
        WindowInsets c8 = l1Var.c();
        if (c8 != null) {
            return l1.d(view, view.computeSystemWindowInsets(c8, rect));
        }
        rect.setEmpty();
        return l1Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static String e(View view) {
        return view.getTransitionName();
    }

    public static float f(View view) {
        return view.getZ();
    }

    public static void g(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void h(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void i(View view, p pVar) {
        b0 b0Var = pVar != null ? new b0(view, pVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, b0Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (b0Var != null) {
            view.setOnApplyWindowInsetsListener(b0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void j(View view) {
        view.stopNestedScroll();
    }
}
