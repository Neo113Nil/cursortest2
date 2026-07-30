package I;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.icefishing.icefish.ice.fishing.s294s.R;

/* loaded from: classes.dex */
public abstract class K {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static v0 b(View view, v0 v0Var, Rect rect) {
        WindowInsets b7 = v0Var.b();
        if (b7 != null) {
            return v0.c(view.computeSystemWindowInsets(b7, rect), view);
        }
        rect.setEmpty();
        return v0Var;
    }

    public static void c(View view, InterfaceC0124u interfaceC0124u) {
        J j = interfaceC0124u != null ? new J(view, interfaceC0124u) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, j);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (j != null) {
            view.setOnApplyWindowInsetsListener(j);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
