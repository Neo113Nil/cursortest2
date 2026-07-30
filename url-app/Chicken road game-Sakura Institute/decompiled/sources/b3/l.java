package b3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.android.installreferrer.R;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class l {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static t0 b(View view, t0 t0Var, Rect rect) {
        WindowInsets a3 = t0Var.a();
        if (a3 != null) {
            return t0.b(view, view.computeSystemWindowInsets(a3, rect));
        }
        rect.setEmpty();
        return t0Var;
    }

    public static boolean c(View view, float f9, float f10, boolean z8) {
        return view.dispatchNestedFling(f9, f10, z8);
    }

    public static boolean d(View view, float f9, float f10) {
        return view.dispatchNestedPreFling(f9, f10);
    }

    public static boolean e(View view, int i7, int i8, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i7, i8, iArr, iArr2);
    }

    public static boolean f(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        return view.dispatchNestedScroll(i7, i8, i9, i10, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static t0 j(View view) {
        if (g0.f1329d && view.isAttachedToWindow()) {
            try {
                Object obj = g0.f1326a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) g0.f1327b.get(obj);
                    Rect rect2 = (Rect) g0.f1328c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i7 = Build.VERSION.SDK_INT;
                        k0 j0Var = i7 >= 30 ? new j0() : i7 >= 29 ? new i0() : new h0();
                        j0Var.e(v2.c.b(rect.left, rect.top, rect.right, rect.bottom));
                        j0Var.g(v2.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        t0 b9 = j0Var.b();
                        b9.f1367a.q(b9);
                        b9.f1367a.d(view.getRootView());
                        return b9;
                    }
                }
            } catch (IllegalAccessException e9) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e9.getMessage(), e9);
            }
        }
        return null;
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f9) {
        view.setElevation(f9);
    }

    public static void t(View view, boolean z8) {
        view.setNestedScrollingEnabled(z8);
    }

    public static void u(View view, f fVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, fVar);
        }
        if (fVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new k(view, fVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f9) {
        view.setTranslationZ(f9);
    }

    public static void x(View view, float f9) {
        view.setZ(f9);
    }

    public static boolean y(View view, int i7) {
        return view.startNestedScroll(i7);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
