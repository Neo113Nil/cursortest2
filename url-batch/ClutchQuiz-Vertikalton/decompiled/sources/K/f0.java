package K;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.clutchquizarena.app.R;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 extends i0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f393e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final Z.a f394f = new Z.a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f395g = new DecelerateInterpolator();

    public static void e(View view) {
        C0004e j2 = j(view);
        if (j2 != null) {
            ((View) j2.f389e).setTranslationY(0.0f);
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
        C0004e j2 = j(view);
        if (j2 != null) {
            j2.f387b = windowInsets;
            if (!z2) {
                View view2 = (View) j2.f389e;
                int[] iArr = (int[]) j2.f390f;
                view2.getLocationOnScreen(iArr);
                z2 = true;
                j2.f388c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z2);
            }
        }
    }

    public static void g(View view, w0 w0Var, List list) {
        C0004e j2 = j(view);
        if (j2 != null) {
            j2.b(w0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), w0Var, list);
            }
        }
    }

    public static void h(View view, B.j jVar) {
        C0004e j2 = j(view);
        if (j2 != null) {
            View view2 = (View) j2.f389e;
            int[] iArr = (int[]) j2.f390f;
            view2.getLocationOnScreen(iArr);
            int i = j2.f388c - iArr[1];
            j2.d = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), jVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C0004e j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof e0) {
            return ((e0) tag).f391a;
        }
        return null;
    }
}
