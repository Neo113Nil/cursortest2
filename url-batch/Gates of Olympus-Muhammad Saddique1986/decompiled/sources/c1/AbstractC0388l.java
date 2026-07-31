package c1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.gatesof.olympus.martu.marku.R;

/* renamed from: c1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0388l {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static U b(View view, U u3, Rect rect) {
        WindowInsets a3 = u3.a();
        if (a3 != null) {
            return U.b(view, view.computeSystemWindowInsets(a3, rect));
        }
        rect.setEmpty();
        return u3;
    }

    public static boolean c(View view, float f3, float f4, boolean z3) {
        return view.dispatchNestedFling(f3, f4, z3);
    }

    public static boolean d(View view, float f3, float f4) {
        return view.dispatchNestedPreFling(f3, f4);
    }

    public static boolean e(View view, int i3, int i4, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i3, i4, iArr, iArr2);
    }

    public static boolean f(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        return view.dispatchNestedScroll(i3, i4, i5, i6, iArr);
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

    public static U j(View view) {
        if (!G.f5561d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = G.f5558a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) G.f5559b.get(obj);
            Rect rect2 = (Rect) G.f5560c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i3 = Build.VERSION.SDK_INT;
            K j3 = i3 >= 30 ? new J() : i3 >= 29 ? new I() : new H();
            j3.e(X0.c.b(rect.left, rect.top, rect.right, rect.bottom));
            j3.g(X0.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            U b3 = j3.b();
            b3.f5589a.q(b3);
            b3.f5589a.d(view.getRootView());
            return b3;
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

    public static void t(View view, boolean z3) {
        view.setNestedScrollingEnabled(z3);
    }

    public static void u(View view, InterfaceC0382f interfaceC0382f) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0382f);
        }
        if (interfaceC0382f == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0387k(view, interfaceC0382f));
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

    public static boolean y(View view, int i3) {
        return view.startNestedScroll(i3);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
