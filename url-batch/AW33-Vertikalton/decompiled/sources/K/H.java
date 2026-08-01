package K;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.luckycalc.loanfinance.R;

/* loaded from: classes.dex */
public abstract class H {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static x0 b(View view, x0 x0Var, Rect rect) {
        WindowInsets f2 = x0Var.f();
        if (f2 != null) {
            return x0.g(view, view.computeSystemWindowInsets(f2, rect));
        }
        rect.setEmpty();
        return x0Var;
    }

    public static boolean c(View view, float f2, float f3, boolean z2) {
        return view.dispatchNestedFling(f2, f3, z2);
    }

    public static boolean d(View view, float f2, float f3) {
        return view.dispatchNestedPreFling(f2, f3);
    }

    public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
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

    public static x0 j(View view) {
        if (!l0.d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = l0.f433a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) l0.f434b.get(obj);
            Rect rect2 = (Rect) l0.f435c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            p0 o0Var = i >= 30 ? new o0() : i >= 29 ? new n0() : new m0();
            o0Var.e(C.d.b(rect.left, rect.top, rect.right, rect.bottom));
            o0Var.g(C.d.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            x0 b2 = o0Var.b();
            b2.f468a.p(b2);
            b2.f468a.d(view.getRootView());
            return b2;
        } catch (IllegalAccessException e2) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
            return null;
        }
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

    public static void s(View view, float f2) {
        view.setElevation(f2);
    }

    public static void t(View view, boolean z2) {
        view.setNestedScrollingEnabled(z2);
    }

    public static void u(View view, r rVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, rVar);
        }
        if (rVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new G(view, rVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f2) {
        view.setTranslationZ(f2);
    }

    public static void x(View view, float f2) {
        view.setZ(f2);
    }

    public static boolean y(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
