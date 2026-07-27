package a1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.chicken.road.kedro.laqer.R;
import n1.InterpolatorC0867a;
import q.RunnableC1012P;
import q.o0;

/* renamed from: a1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411z extends AbstractC0367C {

    /* renamed from: d, reason: collision with root package name */
    public static final PathInterpolator f4903d = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final InterpolatorC0867a f4904e = new InterpolatorC0867a(InterpolatorC0867a.f8553c);

    /* renamed from: f, reason: collision with root package name */
    public static final DecelerateInterpolator f4905f = new DecelerateInterpolator();

    public static void d(C0368D c0368d, View view) {
        RunnableC1012P i2 = i(view);
        if (i2 != null) {
            i2.b(c0368d);
            if (i2.f9203e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                d(c0368d, viewGroup.getChildAt(i4));
            }
        }
    }

    public static void e(View view, WindowInsets windowInsets, boolean z4) {
        RunnableC1012P i2 = i(view);
        if (i2 != null) {
            i2.f9202d = windowInsets;
            if (!z4) {
                z4 = true;
                i2.f9205j = true;
                i2.f9206k = true;
                if (i2.f9203e != 0) {
                    z4 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                e(viewGroup.getChildAt(i4), windowInsets, z4);
            }
        }
    }

    public static void f(View view, C0383T c0383t) {
        RunnableC1012P i2 = i(view);
        if (i2 != null) {
            o0 o0Var = i2.f9204i;
            o0.a(o0Var, c0383t);
            if (o0Var.f9315r) {
                c0383t = C0383T.f4870b;
            }
            if (i2.f9203e == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                f(viewGroup.getChildAt(i4), c0383t);
            }
        }
    }

    public static void g(View view) {
        RunnableC1012P i2 = i(view);
        if (i2 != null) {
            i2.f9205j = false;
            if (i2.f9203e == 0) {
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

    public static RunnableC1012P i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0410y) {
            return ((ViewOnApplyWindowInsetsListenerC0410y) tag).f4901a;
        }
        return null;
    }
}
