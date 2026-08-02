package A;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import t.C0307c;

/* loaded from: classes.dex */
public abstract class L extends S {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f12f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Method f13g;

    /* renamed from: h, reason: collision with root package name */
    public static Class f14h;

    /* renamed from: i, reason: collision with root package name */
    public static Field f15i;

    /* renamed from: j, reason: collision with root package name */
    public static Field f16j;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f17c;

    /* renamed from: d, reason: collision with root package name */
    public C0307c f18d;

    /* renamed from: e, reason: collision with root package name */
    public C0307c f19e;

    public L(T t2, WindowInsets windowInsets) {
        super(t2);
        this.f18d = null;
        this.f17c = windowInsets;
    }

    private C0307c m(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f12f) {
            n();
        }
        Method method = f13g;
        if (method != null && f14h != null && f15i != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f15i.get(f16j.get(invoke));
                if (rect != null) {
                    return C0307c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void n() {
        try {
            f13g = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f14h = cls;
            f15i = cls.getDeclaredField("mVisibleInsets");
            f16j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f15i.setAccessible(true);
            f16j.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f12f = true;
    }

    @Override // A.S
    public void d(View view) {
        C0307c m2 = m(view);
        if (m2 == null) {
            m2 = C0307c.f3436e;
        }
        o(m2);
    }

    @Override // A.S
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f19e, ((L) obj).f19e);
        }
        return false;
    }

    @Override // A.S
    public final C0307c g() {
        if (this.f18d == null) {
            WindowInsets windowInsets = this.f17c;
            this.f18d = C0307c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f18d;
    }

    @Override // A.S
    public boolean i() {
        return this.f17c.isRound();
    }

    public void o(C0307c c0307c) {
        this.f19e = c0307c;
    }

    @Override // A.S
    public void j(C0307c[] c0307cArr) {
    }

    @Override // A.S
    public void k(T t2) {
    }
}
