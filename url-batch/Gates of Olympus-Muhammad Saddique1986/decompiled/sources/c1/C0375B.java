package c1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.gatesof.olympus.martu.marku.R;
import o1.InterpolatorC0745a;
import r.RunnableC0841C;
import r.Y;

/* renamed from: c1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375B extends E {

    /* renamed from: d, reason: collision with root package name */
    public static final PathInterpolator f5547d = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final InterpolatorC0745a f5548e = new InterpolatorC0745a(InterpolatorC0745a.f7437c);

    /* renamed from: f, reason: collision with root package name */
    public static final DecelerateInterpolator f5549f = new DecelerateInterpolator();

    public static void d(View view, F f3) {
        RunnableC0841C i3 = i(view);
        if (i3 != null) {
            i3.b(f3);
            if (i3.f7954e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                d(viewGroup.getChildAt(i4), f3);
            }
        }
    }

    public static void e(View view, WindowInsets windowInsets, boolean z3) {
        RunnableC0841C i3 = i(view);
        if (i3 != null) {
            i3.f7953d = windowInsets;
            if (!z3) {
                z3 = true;
                i3.f7956g = true;
                i3.f7957h = true;
                if (i3.f7954e != 0) {
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

    public static void f(View view, U u3) {
        RunnableC0841C i3 = i(view);
        if (i3 != null) {
            Y y3 = i3.f7955f;
            Y.a(y3, u3);
            if (y3.f8020r) {
                u3 = U.f5588b;
            }
            if (i3.f7954e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                f(viewGroup.getChildAt(i4), u3);
            }
        }
    }

    public static void g(View view) {
        RunnableC0841C i3 = i(view);
        if (i3 != null) {
            i3.f7956g = false;
            if (i3.f7954e == 0) {
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

    public static RunnableC0841C i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0374A) {
            return ((ViewOnApplyWindowInsetsListenerC0374A) tag).f5545a;
        }
        return null;
    }
}
