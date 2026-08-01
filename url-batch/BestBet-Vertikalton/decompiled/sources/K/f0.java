package K;

import a0.C0057a;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.fortunequest.neontrack.R;
import java.util.List;
import u0.C0385x;

/* loaded from: classes.dex */
public final class f0 extends i0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f611e = new PathInterpolator(RecyclerView.f1937A0, 1.1f, RecyclerView.f1937A0, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final C0057a f612f = new C0057a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f613g = new DecelerateInterpolator();

    public static void e(View view) {
        C0008d j2 = j(view);
        if (j2 != null) {
            ((View) j2.f603e).setTranslationY(RecyclerView.f1937A0);
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
        C0008d j2 = j(view);
        if (j2 != null) {
            j2.f601b = windowInsets;
            if (!z2) {
                View view2 = (View) j2.f603e;
                int[] iArr = (int[]) j2.f604f;
                view2.getLocationOnScreen(iArr);
                z2 = true;
                j2.f602c = iArr[1];
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
        C0008d j2 = j(view);
        if (j2 != null) {
            j2.d(w0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), w0Var, list);
            }
        }
    }

    public static void h(View view, C0385x c0385x) {
        C0008d j2 = j(view);
        if (j2 != null) {
            View view2 = (View) j2.f603e;
            int[] iArr = (int[]) j2.f604f;
            view2.getLocationOnScreen(iArr);
            int i = j2.f602c - iArr[1];
            j2.d = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), c0385x);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C0008d j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof e0) {
            return ((e0) tag).f608a;
        }
        return null;
    }
}
