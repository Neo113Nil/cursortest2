package M;

import a.AbstractC0058a;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class m0 extends r0 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f773h = false;
    public static Method i;
    public static Class j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f774k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f775l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f776c;

    /* renamed from: d, reason: collision with root package name */
    public E.c[] f777d;
    public E.c e;

    /* renamed from: f, reason: collision with root package name */
    public t0 f778f;

    /* renamed from: g, reason: collision with root package name */
    public E.c f779g;

    public m0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var);
        this.e = null;
        this.f776c = windowInsets;
    }

    private E.c r(int i2, boolean z2) {
        E.c cVar = E.c.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                cVar = E.c.a(cVar, s(i3, z2));
            }
        }
        return cVar;
    }

    private E.c t() {
        t0 t0Var = this.f778f;
        return t0Var != null ? t0Var.f794a.h() : E.c.e;
    }

    private E.c u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f773h) {
            v();
        }
        Method method = i;
        if (method != null && j != null && f774k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f774k.get(f775l.get(invoke));
                if (rect != null) {
                    return E.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            f774k = cls.getDeclaredField("mVisibleInsets");
            f775l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f774k.setAccessible(true);
            f775l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f773h = true;
    }

    @Override // M.r0
    public void d(View view) {
        E.c u2 = u(view);
        if (u2 == null) {
            u2 = E.c.e;
        }
        w(u2);
    }

    @Override // M.r0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f779g, ((m0) obj).f779g);
        }
        return false;
    }

    @Override // M.r0
    public E.c f(int i2) {
        return r(i2, false);
    }

    @Override // M.r0
    public final E.c j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.f776c;
            this.e = E.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // M.r0
    public t0 l(int i2, int i3, int i4, int i5) {
        t0 g2 = t0.g(null, this.f776c);
        int i6 = Build.VERSION.SDK_INT;
        l0 k0Var = i6 >= 30 ? new k0(g2) : i6 >= 29 ? new j0(g2) : new i0(g2);
        k0Var.g(t0.e(j(), i2, i3, i4, i5));
        k0Var.e(t0.e(h(), i2, i3, i4, i5));
        return k0Var.b();
    }

    @Override // M.r0
    public boolean n() {
        return this.f776c.isRound();
    }

    @Override // M.r0
    public void o(E.c[] cVarArr) {
        this.f777d = cVarArr;
    }

    @Override // M.r0
    public void p(t0 t0Var) {
        this.f778f = t0Var;
    }

    public E.c s(int i2, boolean z2) {
        E.c h2;
        int i3;
        if (i2 == 1) {
            return z2 ? E.c.b(0, Math.max(t().f280b, j().f280b), 0, 0) : E.c.b(0, j().f280b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                E.c t2 = t();
                E.c h3 = h();
                return E.c.b(Math.max(t2.f279a, h3.f279a), 0, Math.max(t2.f281c, h3.f281c), Math.max(t2.f282d, h3.f282d));
            }
            E.c j2 = j();
            t0 t0Var = this.f778f;
            h2 = t0Var != null ? t0Var.f794a.h() : null;
            int i4 = j2.f282d;
            if (h2 != null) {
                i4 = Math.min(i4, h2.f282d);
            }
            return E.c.b(j2.f279a, 0, j2.f281c, i4);
        }
        E.c cVar = E.c.e;
        if (i2 == 8) {
            E.c[] cVarArr = this.f777d;
            h2 = cVarArr != null ? cVarArr[AbstractC0058a.F(8)] : null;
            if (h2 != null) {
                return h2;
            }
            E.c j3 = j();
            E.c t3 = t();
            int i5 = j3.f282d;
            if (i5 > t3.f282d) {
                return E.c.b(0, 0, 0, i5);
            }
            E.c cVar2 = this.f779g;
            return (cVar2 == null || cVar2.equals(cVar) || (i3 = this.f779g.f282d) <= t3.f282d) ? cVar : E.c.b(0, 0, 0, i3);
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
        t0 t0Var2 = this.f778f;
        C0013i e = t0Var2 != null ? t0Var2.f794a.e() : e();
        if (e == null) {
            return cVar;
        }
        int i6 = Build.VERSION.SDK_INT;
        return E.c.b(i6 >= 28 ? AbstractC0012h.d(e.f760a) : 0, i6 >= 28 ? AbstractC0012h.f(e.f760a) : 0, i6 >= 28 ? AbstractC0012h.e(e.f760a) : 0, i6 >= 28 ? AbstractC0012h.c(e.f760a) : 0);
    }

    public void w(E.c cVar) {
        this.f779g = cVar;
    }
}
