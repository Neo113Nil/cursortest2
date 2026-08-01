package n0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.gdmhkmf.belbet.R;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class x0 extends a1 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f2848e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final a1.a f2849f = new a1.a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f2850g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, b1 b1Var) {
        b1.b k4 = k(view);
        if (k4 != null) {
            k4.a(b1Var);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), b1Var);
            }
        }
    }

    public static void g(View view, b1 b1Var, v1 v1Var, boolean z4) {
        b1.b k4 = k(view);
        if (k4 != null) {
            k4.f825a = v1Var;
            if (!z4) {
                k4.b(b1Var);
                z4 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), b1Var, v1Var, z4);
            }
        }
    }

    public static void h(View view, v1 v1Var, List list) {
        b1.b k4 = k(view);
        if (k4 != null) {
            k4.c(v1Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), v1Var, list);
            }
        }
    }

    public static void i(View view, b1 b1Var, androidx.emoji2.text.q qVar) {
        b1.b k4 = k(view);
        if (k4 != null) {
            k4.d(b1Var, qVar);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), b1Var, qVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static b1.b k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof w0) {
            return ((w0) tag).f2843a;
        }
        return null;
    }
}
