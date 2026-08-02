package E;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.fc.barca.football.R;

/* renamed from: E.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0018t {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static ColorStateList b(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode c(View view) {
        return view.getBackgroundTintMode();
    }

    public static void d(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void e(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void f(View view, InterfaceC0010k interfaceC0010k) {
        ViewOnApplyWindowInsetsListenerC0017s viewOnApplyWindowInsetsListenerC0017s = interfaceC0010k != null ? new ViewOnApplyWindowInsetsListenerC0017s(view, interfaceC0010k) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC0017s);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC0017s != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0017s);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void g(View view) {
        view.stopNestedScroll();
    }
}
