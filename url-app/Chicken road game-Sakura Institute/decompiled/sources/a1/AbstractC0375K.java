package a1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: a1.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0375K extends C0380P {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f4853h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f4854i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f4855j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f4856k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f4857l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f4858c;

    /* renamed from: d, reason: collision with root package name */
    public V0.c[] f4859d;

    /* renamed from: e, reason: collision with root package name */
    public V0.c f4860e;

    /* renamed from: f, reason: collision with root package name */
    public C0383T f4861f;

    /* renamed from: g, reason: collision with root package name */
    public V0.c f4862g;

    public AbstractC0375K(C0383T c0383t, WindowInsets windowInsets) {
        super(c0383t);
        this.f4860e = null;
        this.f4858c = windowInsets;
    }

    private V0.c s(int i2, boolean z4) {
        V0.c cVar = V0.c.f4142e;
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i2 & i4) != 0) {
                cVar = V0.c.a(cVar, t(i4, z4));
            }
        }
        return cVar;
    }

    private V0.c u() {
        C0383T c0383t = this.f4861f;
        return c0383t != null ? c0383t.f4871a.i() : V0.c.f4142e;
    }

    private V0.c v(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f4853h) {
            x();
        }
        Method method = f4854i;
        if (method != null && f4855j != null && f4856k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f4856k.get(f4857l.get(invoke));
                if (rect != null) {
                    return V0.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
        }
        return null;
    }

    private static void x() {
        try {
            f4854i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f4855j = cls;
            f4856k = cls.getDeclaredField("mVisibleInsets");
            f4857l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f4856k.setAccessible(true);
            f4857l.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        f4853h = true;
    }

    @Override // a1.C0380P
    public void d(View view) {
        V0.c v4 = v(view);
        if (v4 == null) {
            v4 = V0.c.f4142e;
        }
        y(v4);
    }

    @Override // a1.C0380P
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f4862g, ((AbstractC0375K) obj).f4862g);
        }
        return false;
    }

    @Override // a1.C0380P
    public V0.c f(int i2) {
        return s(i2, false);
    }

    @Override // a1.C0380P
    public V0.c g(int i2) {
        return s(i2, true);
    }

    @Override // a1.C0380P
    public final V0.c k() {
        if (this.f4860e == null) {
            WindowInsets windowInsets = this.f4858c;
            this.f4860e = V0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f4860e;
    }

    @Override // a1.C0380P
    public boolean n() {
        return this.f4858c.isRound();
    }

    @Override // a1.C0380P
    public boolean o(int i2) {
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i2 & i4) != 0 && !w(i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // a1.C0380P
    public void p(V0.c[] cVarArr) {
        this.f4859d = cVarArr;
    }

    @Override // a1.C0380P
    public void q(C0383T c0383t) {
        this.f4861f = c0383t;
    }

    public V0.c t(int i2, boolean z4) {
        V0.c i4;
        int i5;
        if (i2 == 1) {
            return z4 ? V0.c.b(0, Math.max(u().f4144b, k().f4144b), 0, 0) : V0.c.b(0, k().f4144b, 0, 0);
        }
        if (i2 == 2) {
            if (z4) {
                V0.c u4 = u();
                V0.c i6 = i();
                return V0.c.b(Math.max(u4.f4143a, i6.f4143a), 0, Math.max(u4.f4145c, i6.f4145c), Math.max(u4.f4146d, i6.f4146d));
            }
            V0.c k4 = k();
            C0383T c0383t = this.f4861f;
            i4 = c0383t != null ? c0383t.f4871a.i() : null;
            int i7 = k4.f4146d;
            if (i4 != null) {
                i7 = Math.min(i7, i4.f4146d);
            }
            return V0.c.b(k4.f4143a, 0, k4.f4145c, i7);
        }
        V0.c cVar = V0.c.f4142e;
        if (i2 == 8) {
            V0.c[] cVarArr = this.f4859d;
            i4 = cVarArr != null ? cVarArr[M1.a.G(8)] : null;
            if (i4 != null) {
                return i4;
            }
            V0.c k5 = k();
            V0.c u5 = u();
            int i8 = k5.f4146d;
            if (i8 > u5.f4146d) {
                return V0.c.b(0, 0, 0, i8);
            }
            V0.c cVar2 = this.f4862g;
            return (cVar2 == null || cVar2.equals(cVar) || (i5 = this.f4862g.f4146d) <= u5.f4146d) ? cVar : V0.c.b(0, 0, 0, i5);
        }
        if (i2 == 16) {
            return j();
        }
        if (i2 == 32) {
            return h();
        }
        if (i2 == 64) {
            return l();
        }
        if (i2 != 128) {
            return cVar;
        }
        C0383T c0383t2 = this.f4861f;
        C0390e e4 = c0383t2 != null ? c0383t2.f4871a.e() : e();
        if (e4 == null) {
            return cVar;
        }
        int i9 = Build.VERSION.SDK_INT;
        return V0.c.b(i9 >= 28 ? AbstractC0388c.d(e4.f4879a) : 0, i9 >= 28 ? AbstractC0388c.f(e4.f4879a) : 0, i9 >= 28 ? AbstractC0388c.e(e4.f4879a) : 0, i9 >= 28 ? AbstractC0388c.c(e4.f4879a) : 0);
    }

    public boolean w(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !t(i2, false).equals(V0.c.f4142e);
    }

    public void y(V0.c cVar) {
        this.f4862g = cVar;
    }
}
