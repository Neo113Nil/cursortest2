package M;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import b0.C0096a;
import com.winpower.neonfit.R;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 extends f0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final C0096a f732f = new C0096a(0);

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f733g = new DecelerateInterpolator();

    public static void e(View view) {
        C0008d j = j(view);
        if (j != null) {
            ((View) j.e).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z2) {
        C0008d j = j(view);
        if (j != null) {
            j.f735b = windowInsets;
            if (!z2) {
                View view2 = (View) j.e;
                int[] iArr = (int[]) j.f738f;
                view2.getLocationOnScreen(iArr);
                z2 = true;
                j.f736c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z2);
            }
        }
    }

    public static void g(View view, t0 t0Var, List list) {
        C0008d j = j(view);
        if (j != null) {
            j.b(t0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), t0Var, list);
            }
        }
    }

    public static void h(View view, B1.c cVar) {
        C0008d j = j(view);
        if (j != null) {
            View view2 = (View) j.e;
            int[] iArr = (int[]) j.f738f;
            view2.getLocationOnScreen(iArr);
            int i = j.f736c - iArr[1];
            j.f737d = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), cVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C0008d j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof b0) {
            return ((b0) tag).f730a;
        }
        return null;
    }
}
