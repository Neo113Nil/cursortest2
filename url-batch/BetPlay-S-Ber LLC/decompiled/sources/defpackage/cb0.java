package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.awerser.monnit.betplay.R;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class cb0 extends fb0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final si f = new si(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, gb0 gb0Var) {
        za0 k = k(view);
        if (k != null) {
            k.onEnd(gb0Var);
            if (k.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), gb0Var);
            }
        }
    }

    public static void g(View view, gb0 gb0Var, ac0 ac0Var, boolean z) {
        za0 k = k(view);
        if (k != null) {
            k.mDispachedInsets = ac0Var;
            if (!z) {
                k.onPrepare(gb0Var);
                z = k.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), gb0Var, ac0Var, z);
            }
        }
    }

    public static void h(View view, ac0 ac0Var, List list) {
        za0 k = k(view);
        if (k != null) {
            ac0Var = k.onProgress(ac0Var, list);
            if (k.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), ac0Var, list);
            }
        }
    }

    public static void i(View view, gb0 gb0Var, ya0 ya0Var) {
        za0 k = k(view);
        if (k != null) {
            k.onStart(gb0Var, ya0Var);
            if (k.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), gb0Var, ya0Var);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static za0 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof bb0) {
            return ((bb0) tag).a;
        }
        return null;
    }
}
