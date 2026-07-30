package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.majelw.libystne.R;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d73 extends h73 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final hk0 f = new hk0();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(i73 i73Var, View view) {
        iv k = k(view);
        if (k != null) {
            k.e(i73Var);
            if (k.m == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(i73Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void g(View view, i73 i73Var, c83 c83Var, boolean z) {
        iv k = k(view);
        if (k != null) {
            k.n = c83Var;
            if (!z) {
                k.f(i73Var);
                z = k.m == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), i73Var, c83Var, z);
            }
        }
    }

    public static void h(View view, c83 c83Var, List list) {
        iv k = k(view);
        if (k != null) {
            c83Var = k.g(c83Var, list);
            if (k.m == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), c83Var, list);
            }
        }
    }

    public static void i(View view, i73 i73Var, tt1 tt1Var) {
        iv k = k(view);
        if (k != null) {
            k.h(i73Var, tt1Var);
            if (k.m == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), i73Var, tt1Var);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static iv k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof c73) {
            return ((c73) tag).a;
        }
        return null;
    }
}
