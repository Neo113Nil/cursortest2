package k0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.gglhk.bofio.fortunetiger.R;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class r0 extends v0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f2773e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final w0.a f2774f = new w0.a();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, w0 w0Var) {
        o0 k4 = k(view);
        if (k4 != null) {
            k4.a(w0Var);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                f(viewGroup.getChildAt(i4), w0Var);
            }
        }
    }

    public static void g(View view, w0 w0Var, m1 m1Var, boolean z3) {
        o0 k4 = k(view);
        if (k4 != null) {
            k4.f2763a = m1Var;
            if (!z3) {
                k4.b(w0Var);
                z3 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                g(viewGroup.getChildAt(i4), w0Var, m1Var, z3);
            }
        }
    }

    public static void h(View view, m1 m1Var, List list) {
        o0 k4 = k(view);
        if (k4 != null) {
            k4.c(m1Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                h(viewGroup.getChildAt(i4), m1Var, list);
            }
        }
    }

    public static void i(View view, w0 w0Var, a2.s sVar) {
        o0 k4 = k(view);
        if (k4 != null) {
            k4.d(w0Var, sVar);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                i(viewGroup.getChildAt(i4), w0Var, sVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static o0 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof q0) {
            return ((q0) tag).f2770a;
        }
        return null;
    }
}
