package O;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.icefishing.icefishingliveapp.C5284R;

/* loaded from: classes.dex */
public abstract class L {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C5284R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static A0 b(View view, A0 a02, Rect rect) {
        WindowInsets g9 = a02.g();
        if (g9 != null) {
            return A0.h(view, view.computeSystemWindowInsets(g9, rect));
        }
        rect.setEmpty();
        return a02;
    }

    public static boolean c(View view, float f6, float f9, boolean z8) {
        return view.dispatchNestedFling(f6, f9, z8);
    }

    public static boolean d(View view, float f6, float f9) {
        return view.dispatchNestedPreFling(f6, f9);
    }

    public static boolean e(View view, int i, int i4, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i4, iArr, iArr2);
    }

    public static boolean f(View view, int i, int i4, int i9, int i10, int[] iArr) {
        return view.dispatchNestedScroll(i, i4, i9, i10, iArr);
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

    public static A0 j(View view) {
        if (!o0.f2304d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = o0.f2301a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) o0.f2302b.get(obj);
            Rect rect2 = (Rect) o0.f2303c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            s0 r0Var = i >= 30 ? new r0() : i >= 29 ? new q0() : new p0();
            r0Var.e(G.e.b(rect.left, rect.top, rect.right, rect.bottom));
            r0Var.g(G.e.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            A0 b9 = r0Var.b();
            b9.f2213a.p(b9);
            b9.f2213a.d(view.getRootView());
            return b9;
        } catch (IllegalAccessException e6) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e6.getMessage(), e6);
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

    public static void s(View view, float f6) {
        view.setElevation(f6);
    }

    public static void t(View view, boolean z8) {
        view.setNestedScrollingEnabled(z8);
    }

    public static void u(View view, InterfaceC0358u interfaceC0358u) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(C5284R.id.tag_on_apply_window_listener, interfaceC0358u);
        }
        if (interfaceC0358u == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C5284R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new K(view, interfaceC0358u));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f6) {
        view.setTranslationZ(f6);
    }

    public static void x(View view, float f6) {
        view.setZ(f6);
    }

    public static boolean y(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
