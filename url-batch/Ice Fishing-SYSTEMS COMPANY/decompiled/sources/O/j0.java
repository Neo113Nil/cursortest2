package O;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.google.android.gms.internal.ads.C2561Fo;
import com.icefishing.icefishingliveapp.C5284R;
import g0.C4519a;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 extends m0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f2277e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final C4519a f2278f = new C4519a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f2279g = new DecelerateInterpolator();

    public static void e(View view) {
        C2561Fo j9 = j(view);
        if (j9 != null) {
            ((View) j9.f25020w).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z8) {
        C2561Fo j9 = j(view);
        if (j9 != null) {
            j9.f25019v = windowInsets;
            if (!z8) {
                View view2 = (View) j9.f25020w;
                int[] iArr = (int[]) j9.f25021x;
                view2.getLocationOnScreen(iArr);
                z8 = true;
                j9.f25017n = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z8);
            }
        }
    }

    public static void g(View view, A0 a02, List list) {
        C2561Fo j9 = j(view);
        if (j9 != null) {
            j9.f(a02, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), a02, list);
            }
        }
    }

    public static void h(View view, S0.e eVar) {
        C2561Fo j9 = j(view);
        if (j9 != null) {
            View view2 = (View) j9.f25020w;
            int[] iArr = (int[]) j9.f25021x;
            view2.getLocationOnScreen(iArr);
            int i = j9.f25017n - iArr[1];
            j9.f25018u = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                h(viewGroup.getChildAt(i4), eVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(C5284R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C2561Fo j(View view) {
        Object tag = view.getTag(C5284R.id.tag_window_insets_animation_callback);
        if (tag instanceof i0) {
            return ((i0) tag).f2275a;
        }
        return null;
    }
}
