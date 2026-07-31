package D;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.strategylink.Row.Five.R;

/* renamed from: D.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0108v {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static Y b(View view, Y y, Rect rect) {
        WindowInsets b7 = y.b();
        if (b7 != null) {
            return Y.c(view.computeSystemWindowInsets(b7, rect), view);
        }
        rect.setEmpty();
        return y;
    }

    public static boolean c(View view, float f7, float f8, boolean z5) {
        return view.dispatchNestedFling(f7, f8, z5);
    }

    public static boolean d(View view, float f7, float f8) {
        return view.dispatchNestedPreFling(f7, f8);
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

    public static Y j(View view) {
        if (J.f246d && view.isAttachedToWindow()) {
            try {
                Object obj = J.f243a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) J.f244b.get(obj);
                    Rect rect2 = (Rect) J.f245c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i7 = Build.VERSION.SDK_INT;
                        O n7 = i7 >= 30 ? new N() : i7 >= 29 ? new M() : new K();
                        n7.c(w.c.a(rect.left, rect.top, rect.right, rect.bottom));
                        n7.d(w.c.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        Y b7 = n7.b();
                        b7.f272a.p(b7);
                        b7.f272a.d(view.getRootView());
                        return b7;
                    }
                }
            } catch (IllegalAccessException e4) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e4.getMessage(), e4);
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

    public static void s(View view, float f7) {
        view.setElevation(f7);
    }

    public static void t(View view, boolean z5) {
        view.setNestedScrollingEnabled(z5);
    }

    public static void u(View view, InterfaceC0103p interfaceC0103p) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0103p);
        }
        if (interfaceC0103p == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0107u(view, interfaceC0103p));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f7) {
        view.setTranslationZ(f7);
    }

    public static void x(View view, float f7) {
        view.setZ(f7);
    }

    public static boolean y(View view, int i7) {
        return view.startNestedScroll(i7);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
