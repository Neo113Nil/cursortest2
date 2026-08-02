package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.apps.authenticator2.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zc extends zf {
    public static final Interpolator a = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final Interpolator b = new adw();
    public static final Interpolator c = new DecelerateInterpolator(1.5f);
    public static final Interpolator d = new AccelerateInterpolator(1.5f);

    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    static yy b(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof zb) {
            return ((zb) tag).a;
        }
        return null;
    }

    static void c(View view, zz zzVar, List list) {
        yy b2 = b(view);
        if (b2 != null) {
            b2.a(zzVar, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                c(viewGroup.getChildAt(i), zzVar, list);
            }
        }
    }

    static void d(View view, brn brnVar) {
        yy b2 = b(view);
        if (b2 != null) {
            b2.b(brnVar);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), brnVar);
            }
        }
    }

    static void e(View view, brn brnVar, zz zzVar, boolean z) {
        yy b2 = b(view);
        if (b2 != null) {
            b2.a = zzVar;
            if (!z) {
                b2.c(brnVar);
                z = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), brnVar, zzVar, z);
            }
        }
    }

    public static void f(View view, brn brnVar, yx yxVar) {
        yy b2 = b(view);
        if (b2 != null) {
            b2.d(brnVar, yxVar);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), brnVar, yxVar);
            }
        }
    }
}
