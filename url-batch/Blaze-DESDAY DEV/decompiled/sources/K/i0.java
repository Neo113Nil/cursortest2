package K;

import a0.C0059a;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.winworm.neongrid.R;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 extends l0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f483e = new PathInterpolator(RecyclerView.f1559A0, 1.1f, RecyclerView.f1559A0, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final C0059a f484f = new C0059a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f485g = new DecelerateInterpolator();

    public static void e(View view) {
        C0006d j2 = j(view);
        if (j2 != null) {
            ((View) j2.f464e).setTranslationY(RecyclerView.f1559A0);
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
        C0006d j2 = j(view);
        if (j2 != null) {
            j2.f462b = windowInsets;
            if (!z2) {
                View view2 = (View) j2.f464e;
                int[] iArr = (int[]) j2.f465f;
                view2.getLocationOnScreen(iArr);
                z2 = true;
                j2.f463c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z2);
            }
        }
    }

    public static void g(View view, z0 z0Var, List list) {
        C0006d j2 = j(view);
        if (j2 != null) {
            j2.b(z0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z0Var, list);
            }
        }
    }

    public static void h(View view, B.j jVar) {
        C0006d j2 = j(view);
        if (j2 != null) {
            View view2 = (View) j2.f464e;
            int[] iArr = (int[]) j2.f465f;
            view2.getLocationOnScreen(iArr);
            int i = j2.f463c - iArr[1];
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

    public static C0006d j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof h0) {
            return ((h0) tag).f481a;
        }
        return null;
    }
}
