package w;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p.C0217c;

/* loaded from: classes.dex */
public abstract class J extends P {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f3028h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f3029i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f3030j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f3031k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f3032l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f3033c;

    /* renamed from: d, reason: collision with root package name */
    public C0217c[] f3034d;

    /* renamed from: e, reason: collision with root package name */
    public C0217c f3035e;

    /* renamed from: f, reason: collision with root package name */
    public S f3036f;

    /* renamed from: g, reason: collision with root package name */
    public C0217c f3037g;

    public J(S s2, WindowInsets windowInsets) {
        super(s2);
        this.f3035e = null;
        this.f3033c = windowInsets;
    }

    private C0217c r() {
        S s2 = this.f3036f;
        return s2 != null ? s2.f3045a.g() : C0217c.f2807e;
    }

    private C0217c s(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f3028h) {
            u();
        }
        Method method = f3029i;
        if (method != null && f3030j != null && f3031k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f3031k.get(f3032l.get(invoke));
                if (rect != null) {
                    return C0217c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    private static void u() {
        try {
            f3029i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f3030j = cls;
            f3031k = cls.getDeclaredField("mVisibleInsets");
            f3032l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f3031k.setAccessible(true);
            f3032l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f3028h = true;
    }

    @Override // w.P
    public void d(View view) {
        C0217c s2 = s(view);
        if (s2 == null) {
            s2 = C0217c.f2807e;
        }
        v(s2);
    }

    @Override // w.P
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f3037g, ((J) obj).f3037g);
        }
        return false;
    }

    @Override // w.P
    public final C0217c i() {
        if (this.f3035e == null) {
            WindowInsets windowInsets = this.f3033c;
            this.f3035e = C0217c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f3035e;
    }

    @Override // w.P
    public boolean l() {
        return this.f3033c.isRound();
    }

    @Override // w.P
    public boolean m(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !t(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // w.P
    public void n(C0217c[] c0217cArr) {
        this.f3034d = c0217cArr;
    }

    @Override // w.P
    public void o(S s2) {
        this.f3036f = s2;
    }

    public C0217c q(int i2, boolean z2) {
        C0217c g2;
        int i3;
        if (i2 == 1) {
            return z2 ? C0217c.a(0, Math.max(r().f2809b, i().f2809b), 0, 0) : C0217c.a(0, i().f2809b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C0217c r = r();
                C0217c g3 = g();
                return C0217c.a(Math.max(r.f2808a, g3.f2808a), 0, Math.max(r.f2810c, g3.f2810c), Math.max(r.f2811d, g3.f2811d));
            }
            C0217c i4 = i();
            S s2 = this.f3036f;
            g2 = s2 != null ? s2.f3045a.g() : null;
            int i5 = i4.f2811d;
            if (g2 != null) {
                i5 = Math.min(i5, g2.f2811d);
            }
            return C0217c.a(i4.f2808a, 0, i4.f2810c, i5);
        }
        C0217c c0217c = C0217c.f2807e;
        if (i2 == 8) {
            C0217c[] c0217cArr = this.f3034d;
            g2 = c0217cArr != null ? c0217cArr[3] : null;
            if (g2 != null) {
                return g2;
            }
            C0217c i6 = i();
            C0217c r2 = r();
            int i7 = i6.f2811d;
            if (i7 > r2.f2811d) {
                return C0217c.a(0, 0, 0, i7);
            }
            C0217c c0217c2 = this.f3037g;
            return (c0217c2 == null || c0217c2.equals(c0217c) || (i3 = this.f3037g.f2811d) <= r2.f2811d) ? c0217c : C0217c.a(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return h();
        }
        if (i2 == 32) {
            return f();
        }
        if (i2 == 64) {
            return j();
        }
        if (i2 != 128) {
            return c0217c;
        }
        S s3 = this.f3036f;
        C0259e e2 = s3 != null ? s3.f3045a.e() : e();
        if (e2 == null) {
            return c0217c;
        }
        int i8 = Build.VERSION.SDK_INT;
        return C0217c.a(i8 >= 28 ? AbstractC0258d.d(e2.f3061a) : 0, i8 >= 28 ? AbstractC0258d.f(e2.f3061a) : 0, i8 >= 28 ? AbstractC0258d.e(e2.f3061a) : 0, i8 >= 28 ? AbstractC0258d.c(e2.f3061a) : 0);
    }

    public boolean t(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !q(i2, false).equals(C0217c.f2807e);
    }

    public void v(C0217c c0217c) {
        this.f3037g = c0217c;
    }
}
