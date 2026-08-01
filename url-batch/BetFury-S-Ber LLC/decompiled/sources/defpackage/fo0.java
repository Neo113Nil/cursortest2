package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.trembin.nirefon.betfury.R;
import java.util.List;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class fo0 extends io0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final ho f = new ho(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, jo0 jo0Var) {
        co0 k = k(view);
        if (k != null) {
            k.a(jo0Var);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), jo0Var);
            }
        }
    }

    public static void g(View view, jo0 jo0Var, dp0 dp0Var, boolean z) {
        co0 k = k(view);
        if (k != null) {
            k.a = dp0Var;
            if (!z) {
                k.b(jo0Var);
                z = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), jo0Var, dp0Var, z);
            }
        }
    }

    public static void h(View view, dp0 dp0Var, List list) {
        co0 k = k(view);
        if (k != null) {
            k.c(dp0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), dp0Var, list);
            }
        }
    }

    public static void i(View view, jo0 jo0Var, tl0 tl0Var) {
        co0 k = k(view);
        if (k != null) {
            k.d(jo0Var, tl0Var);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), jo0Var, tl0Var);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static co0 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof eo0) {
            return ((eo0) tag).a;
        }
        return null;
    }
}
