package L;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class s0 extends x0 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f566h = false;
    public static Method i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f567j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f568k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f569l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f570c;
    public D.c[] d;

    /* renamed from: e, reason: collision with root package name */
    public D.c f571e;

    /* renamed from: f, reason: collision with root package name */
    public z0 f572f;

    /* renamed from: g, reason: collision with root package name */
    public D.c f573g;

    public s0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var);
        this.f571e = null;
        this.f570c = windowInsets;
    }

    private D.c r(int i2, boolean z2) {
        D.c cVar = D.c.f113e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                cVar = D.c.a(cVar, s(i3, z2));
            }
        }
        return cVar;
    }

    private D.c t() {
        z0 z0Var = this.f572f;
        return z0Var != null ? z0Var.f589a.h() : D.c.f113e;
    }

    private D.c u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f566h) {
            v();
        }
        Method method = i;
        if (method != null && f567j != null && f568k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f568k.get(f569l.get(invoke));
                if (rect != null) {
                    return D.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f567j = cls;
            f568k = cls.getDeclaredField("mVisibleInsets");
            f569l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f568k.setAccessible(true);
            f569l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f566h = true;
    }

    @Override // L.x0
    public void d(View view) {
        D.c u2 = u(view);
        if (u2 == null) {
            u2 = D.c.f113e;
        }
        w(u2);
    }

    @Override // L.x0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f573g, ((s0) obj).f573g);
        }
        return false;
    }

    @Override // L.x0
    public D.c f(int i2) {
        return r(i2, false);
    }

    @Override // L.x0
    public final D.c j() {
        if (this.f571e == null) {
            WindowInsets windowInsets = this.f570c;
            this.f571e = D.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f571e;
    }

    @Override // L.x0
    public z0 l(int i2, int i3, int i4, int i5) {
        z0 g2 = z0.g(null, this.f570c);
        int i6 = Build.VERSION.SDK_INT;
        r0 q0Var = i6 >= 30 ? new q0(g2) : i6 >= 29 ? new p0(g2) : new o0(g2);
        q0Var.g(z0.e(j(), i2, i3, i4, i5));
        q0Var.e(z0.e(h(), i2, i3, i4, i5));
        return q0Var.b();
    }

    @Override // L.x0
    public boolean n() {
        return this.f570c.isRound();
    }

    @Override // L.x0
    public void o(D.c[] cVarArr) {
        this.d = cVarArr;
    }

    @Override // L.x0
    public void p(z0 z0Var) {
        this.f572f = z0Var;
    }

    public D.c s(int i2, boolean z2) {
        D.c h2;
        int i3;
        if (i2 == 1) {
            return z2 ? D.c.b(0, Math.max(t().f115b, j().f115b), 0, 0) : D.c.b(0, j().f115b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                D.c t2 = t();
                D.c h3 = h();
                return D.c.b(Math.max(t2.f114a, h3.f114a), 0, Math.max(t2.f116c, h3.f116c), Math.max(t2.d, h3.d));
            }
            D.c j2 = j();
            z0 z0Var = this.f572f;
            h2 = z0Var != null ? z0Var.f589a.h() : null;
            int i4 = j2.d;
            if (h2 != null) {
                i4 = Math.min(i4, h2.d);
            }
            return D.c.b(j2.f114a, 0, j2.f116c, i4);
        }
        D.c cVar = D.c.f113e;
        if (i2 == 8) {
            D.c[] cVarArr = this.d;
            h2 = cVarArr != null ? cVarArr[A1.m.H(8)] : null;
            if (h2 != null) {
                return h2;
            }
            D.c j3 = j();
            D.c t3 = t();
            int i5 = j3.d;
            if (i5 > t3.d) {
                return D.c.b(0, 0, 0, i5);
            }
            D.c cVar2 = this.f573g;
            return (cVar2 == null || cVar2.equals(cVar) || (i3 = this.f573g.d) <= t3.d) ? cVar : D.c.b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return i();
        }
        if (i2 == 32) {
            return g();
        }
        if (i2 == 64) {
            return k();
        }
        if (i2 != 128) {
            return cVar;
        }
        z0 z0Var2 = this.f572f;
        C0012j e2 = z0Var2 != null ? z0Var2.f589a.e() : e();
        if (e2 == null) {
            return cVar;
        }
        int i6 = Build.VERSION.SDK_INT;
        return D.c.b(i6 >= 28 ? AbstractC0011i.d(e2.f537a) : 0, i6 >= 28 ? AbstractC0011i.f(e2.f537a) : 0, i6 >= 28 ? AbstractC0011i.e(e2.f537a) : 0, i6 >= 28 ? AbstractC0011i.c(e2.f537a) : 0);
    }

    public void w(D.c cVar) {
        this.f573g = cVar;
    }
}
