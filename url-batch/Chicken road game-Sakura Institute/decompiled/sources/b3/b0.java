package b3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.android.installreferrer.R;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 extends e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final PathInterpolator f1311d = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final o3.a f1312e = new o3.a(o3.a.f6827c);

    /* renamed from: f, reason: collision with root package name */
    public static final DecelerateInterpolator f1313f = new DecelerateInterpolator();

    public static void d(View view, f0 f0Var) {
        q.a0 i7 = i(view);
        if (i7 != null) {
            i7.b(f0Var);
            if (i7.f7248g == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                d(viewGroup.getChildAt(i8), f0Var);
            }
        }
    }

    public static void e(View view, WindowInsets windowInsets, boolean z8) {
        q.a0 i7 = i(view);
        if (i7 != null) {
            i7.f7247f = windowInsets;
            if (!z8) {
                z8 = true;
                i7.f7250i = true;
                i7.f7251j = true;
                if (i7.f7248g != 0) {
                    z8 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                e(viewGroup.getChildAt(i8), windowInsets, z8);
            }
        }
    }

    public static void f(View view, t0 t0Var) {
        q.a0 i7 = i(view);
        if (i7 != null) {
            q.u0 u0Var = i7.f7249h;
            q.u0.a(u0Var, t0Var);
            if (u0Var.f7365r) {
                t0Var = t0.f1366b;
            }
            if (i7.f7248g == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                f(viewGroup.getChildAt(i8), t0Var);
            }
        }
    }

    public static void g(View view) {
        q.a0 i7 = i(view);
        if (i7 != null) {
            i7.f7250i = false;
            if (i7.f7248g == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                g(viewGroup.getChildAt(i8));
            }
        }
    }

    public static WindowInsets h(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static q.a0 i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof a0) {
            return ((a0) tag).f1306a;
        }
        return null;
    }
}
