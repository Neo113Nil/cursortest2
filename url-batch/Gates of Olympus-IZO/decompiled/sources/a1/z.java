package a1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.gates.olympus.miruv.R;
import l1.InterpolatorC0575a;
import r.RunnableC0789A;

/* loaded from: classes.dex */
public final class z extends AbstractC0161C {

    /* renamed from: d, reason: collision with root package name */
    public static final PathInterpolator f3576d = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final InterpolatorC0575a f3577e = new InterpolatorC0575a(InterpolatorC0575a.f5543c);

    /* renamed from: f, reason: collision with root package name */
    public static final DecelerateInterpolator f3578f = new DecelerateInterpolator();

    public static void d(C0162D c0162d, View view) {
        RunnableC0789A i3 = i(view);
        if (i3 != null) {
            i3.b(c0162d);
            if (i3.f6983e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                d(c0162d, viewGroup.getChildAt(i4));
            }
        }
    }

    public static void e(View view, WindowInsets windowInsets, boolean z3) {
        RunnableC0789A i3 = i(view);
        if (i3 != null) {
            i3.f6982d = windowInsets;
            if (!z3) {
                z3 = true;
                i3.f6985g = true;
                i3.f6986h = true;
                if (i3.f6983e != 0) {
                    z3 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                e(viewGroup.getChildAt(i4), windowInsets, z3);
            }
        }
    }

    public static void f(View view, Q q2) {
        RunnableC0789A i3 = i(view);
        if (i3 != null) {
            r.V v3 = i3.f6984f;
            r.V.a(v3, q2);
            if (v3.f7045r) {
                q2 = Q.f3541b;
            }
            if (i3.f6983e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                f(viewGroup.getChildAt(i4), q2);
            }
        }
    }

    public static void g(View view) {
        RunnableC0789A i3 = i(view);
        if (i3 != null) {
            i3.f6985g = false;
            if (i3.f6983e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                g(viewGroup.getChildAt(i4));
            }
        }
    }

    public static WindowInsets h(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static RunnableC0789A i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof y) {
            return ((y) tag).f3574a;
        }
        return null;
    }
}
