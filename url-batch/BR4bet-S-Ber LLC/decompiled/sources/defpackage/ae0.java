package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.moontiko.really.admiralcasino.R;
import java.util.List;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ae0 extends de0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final hl f = new hl(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, ee0 ee0Var) {
        nf k = k(view);
        if (k != null) {
            k.a(ee0Var);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), ee0Var);
            }
        }
    }

    public static void g(View view, ee0 ee0Var, ye0 ye0Var, boolean z) {
        nf k = k(view);
        if (k != null) {
            k.a = ye0Var;
            if (!z) {
                k.b(ee0Var);
                z = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), ee0Var, ye0Var, z);
            }
        }
    }

    public static void h(View view, ye0 ye0Var, List list) {
        nf k = k(view);
        if (k != null) {
            k.c(ye0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), ye0Var, list);
            }
        }
    }

    public static void i(View view, ee0 ee0Var, a5 a5Var) {
        nf k = k(view);
        if (k != null) {
            k.d(ee0Var, a5Var);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), ee0Var, a5Var);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static nf k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof zd0) {
            return ((zd0) tag).a;
        }
        return null;
    }
}
