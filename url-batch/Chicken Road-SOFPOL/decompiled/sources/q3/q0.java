package q3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.snovikpovik.vuevnxsj.R;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q0 extends t0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f6142e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final i4.a f6143f = new i4.a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f6144g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f6145h = new AccelerateInterpolator(1.5f);

    public static void f(View view, u0 u0Var) {
        androidx.datastore.preferences.protobuf.j k3 = k(view);
        if (k3 != null) {
            k3.d(u0Var);
            if (k3.f706d == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), u0Var);
            }
        }
    }

    public static void g(View view, u0 u0Var, l1 l1Var, boolean z3) {
        androidx.datastore.preferences.protobuf.j k3 = k(view);
        if (k3 != null) {
            k3.f707e = l1Var;
            if (!z3) {
                k3.e();
                z3 = k3.f706d == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), u0Var, l1Var, z3);
            }
        }
    }

    public static void h(View view, l1 l1Var, List list) {
        androidx.datastore.preferences.protobuf.j k3 = k(view);
        if (k3 != null) {
            l1Var = k3.f(l1Var, list);
            if (k3.f706d == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), l1Var, list);
            }
        }
    }

    public static void i(View view, u0 u0Var, a0.a0 a0Var) {
        androidx.datastore.preferences.protobuf.j k3 = k(view);
        if (k3 != null) {
            k3.g(u0Var, a0Var);
            if (k3.f706d == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), u0Var, a0Var);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static androidx.datastore.preferences.protobuf.j k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof p0) {
            return ((p0) tag).f6140a;
        }
        return null;
    }
}
