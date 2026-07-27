package E;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.chickyneer.roadway.R;
import x.C1528c;

/* renamed from: E.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0048x {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static b0 b(View view, b0 b0Var, Rect rect) {
        Z z = b0Var.f601a;
        WindowInsets windowInsets = z instanceof U ? ((U) z).f585c : null;
        if (windowInsets != null) {
            return b0.a(view.computeSystemWindowInsets(windowInsets, rect), view);
        }
        rect.setEmpty();
        return b0Var;
    }

    public static boolean c(View view, float f3, float f6, boolean z) {
        return view.dispatchNestedFling(f3, f6, z);
    }

    public static boolean d(View view, float f3, float f6) {
        return view.dispatchNestedPreFling(f3, f6);
    }

    public static boolean e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
    }

    public static boolean f(View view, int i2, int i3, int i6, int i7, int[] iArr) {
        return view.dispatchNestedScroll(i2, i3, i6, i7, iArr);
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

    public static b0 j(View view) {
        if (!N.f572d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = N.f569a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) N.f570b.get(obj);
            Rect rect2 = (Rect) N.f571c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            T s2 = i2 >= 30 ? new S() : i2 >= 29 ? new Q() : new O();
            s2.c(C1528c.a(rect.left, rect.top, rect.right, rect.bottom));
            s2.d(C1528c.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
            b0 b6 = s2.b();
            b6.f601a.o(b6);
            b6.f601a.d(view.getRootView());
            return b6;
        } catch (IllegalAccessException e3) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e3.getMessage(), e3);
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

    public static void s(View view, float f3) {
        view.setElevation(f3);
    }

    public static void t(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void u(View view, r rVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, rVar);
        }
        if (rVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0047w(view, rVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f3) {
        view.setTranslationZ(f3);
    }

    public static void x(View view, float f3) {
        view.setZ(f3);
    }

    public static boolean y(View view, int i2) {
        return view.startNestedScroll(i2);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
