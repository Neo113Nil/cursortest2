package o3;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.appsflyer.R;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l0 extends p0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f7417e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final g4.a f7418f = new g4.a();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f7419h = new AccelerateInterpolator(1.5f);

    public static void f(View view, q0 q0Var) {
        androidx.datastore.preferences.protobuf.i j = j(view);
        if (j != null) {
            j.e(q0Var);
            if (j.f559d == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                f(viewGroup.getChildAt(i3), q0Var);
            }
        }
    }

    public static void g(View view, q0 q0Var, k1 k1Var, boolean z10) {
        androidx.datastore.preferences.protobuf.i j = j(view);
        if (j != null) {
            j.f560e = k1Var;
            if (!z10) {
                j.f(q0Var);
                z10 = j.f559d == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                g(viewGroup.getChildAt(i3), q0Var, k1Var, z10);
            }
        }
    }

    public static void h(View view, k1 k1Var, List list) {
        androidx.datastore.preferences.protobuf.i j = j(view);
        if (j != null) {
            k1Var = j.g(k1Var, list);
            if (j.f559d == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                h(viewGroup.getChildAt(i3), k1Var, list);
            }
        }
    }

    public static void i(View view, q0 q0Var, c6.e eVar) {
        androidx.datastore.preferences.protobuf.i j = j(view);
        if (j != null) {
            j.h(q0Var, eVar);
            if (j.f559d == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                i(viewGroup.getChildAt(i3), q0Var, eVar);
            }
        }
    }

    public static androidx.datastore.preferences.protobuf.i j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof k0) {
            return ((k0) tag).f7412a;
        }
        return null;
    }
}
