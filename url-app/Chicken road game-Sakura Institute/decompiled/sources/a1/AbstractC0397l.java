package a1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.chicken.road.kedro.laqer.R;

/* renamed from: a1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0397l {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static C0383T b(View view, C0383T c0383t, Rect rect) {
        WindowInsets a4 = c0383t.a();
        if (a4 != null) {
            return C0383T.b(view, view.computeSystemWindowInsets(a4, rect));
        }
        rect.setEmpty();
        return c0383t;
    }

    public static boolean c(View view, float f4, float f5, boolean z4) {
        return view.dispatchNestedFling(f4, f5, z4);
    }

    public static boolean d(View view, float f4, float f5) {
        return view.dispatchNestedPreFling(f4, f5);
    }

    public static boolean e(View view, int i2, int i4, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i2, i4, iArr, iArr2);
    }

    public static boolean f(View view, int i2, int i4, int i5, int i6, int[] iArr) {
        return view.dispatchNestedScroll(i2, i4, i5, i6, iArr);
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

    public static C0383T j(View view) {
        if (!AbstractC0369E.f4843d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC0369E.f4840a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC0369E.f4841b.get(obj);
            Rect rect2 = (Rect) AbstractC0369E.f4842c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            AbstractC0374J c0373i = i2 >= 30 ? new C0373I() : i2 >= 29 ? new C0372H() : new C0370F();
            c0373i.e(V0.c.b(rect.left, rect.top, rect.right, rect.bottom));
            c0373i.g(V0.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C0383T b4 = c0373i.b();
            b4.f4871a.q(b4);
            b4.f4871a.d(view.getRootView());
            return b4;
        } catch (IllegalAccessException e4) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e4.getMessage(), e4);
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

    public static void s(View view, float f4) {
        view.setElevation(f4);
    }

    public static void t(View view, boolean z4) {
        view.setNestedScrollingEnabled(z4);
    }

    public static void u(View view, InterfaceC0391f interfaceC0391f) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0391f);
        }
        if (interfaceC0391f == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0396k(view, interfaceC0391f));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f4) {
        view.setTranslationZ(f4);
    }

    public static void x(View view, float f4) {
        view.setZ(f4);
    }

    public static boolean y(View view, int i2) {
        return view.startNestedScroll(i2);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
