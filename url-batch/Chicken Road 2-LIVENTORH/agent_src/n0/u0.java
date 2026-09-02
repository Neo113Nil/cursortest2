package n0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.oriondriftchasers.arordrft.R;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class u0 extends x0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f2784e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final z0.a f2785f = new z0.a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f2786g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f2787h = new AccelerateInterpolator(1.5f);

    public static void f(View view, y0 y0Var) {
        a1.b k4 = k(view);
        if (k4 != null) {
            k4.a(y0Var);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), y0Var);
            }
        }
    }

    public static void g(View view, y0 y0Var, q1 q1Var, boolean z3) {
        a1.b k4 = k(view);
        if (k4 != null) {
            k4.f106a = q1Var;
            if (!z3) {
                k4.b(y0Var);
                z3 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), y0Var, q1Var, z3);
            }
        }
    }

    public static void h(View view, q1 q1Var, List list) {
        a1.b k4 = k(view);
        if (k4 != null) {
            k4.c(q1Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), q1Var, list);
            }
        }
    }

    public static void i(View view, y0 y0Var, androidx.emoji2.text.q qVar) {
        a1.b k4 = k(view);
        if (k4 != null) {
            k4.d(y0Var, qVar);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), y0Var, qVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static a1.b k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof t0) {
            return ((t0) tag).f2782a;
        }
        return null;
    }
}
