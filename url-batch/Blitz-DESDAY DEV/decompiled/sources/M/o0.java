package M;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class o0 extends t0 {
    public static boolean h = false;
    public static Method i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f575j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f576k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f577l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f578c;
    public E.c[] d;

    /* renamed from: e, reason: collision with root package name */
    public E.c f579e;

    /* renamed from: f, reason: collision with root package name */
    public v0 f580f;

    /* renamed from: g, reason: collision with root package name */
    public E.c f581g;

    public o0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var);
        this.f579e = null;
        this.f578c = windowInsets;
    }

    private E.c r(int i2, boolean z2) {
        E.c cVar = E.c.f161e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                cVar = E.c.a(cVar, s(i3, z2));
            }
        }
        return cVar;
    }

    private E.c t() {
        v0 v0Var = this.f580f;
        return v0Var != null ? v0Var.f596a.h() : E.c.f161e;
    }

    private E.c u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = i;
        if (method != null && f575j != null && f576k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f576k.get(f577l.get(invoke));
                if (rect != null) {
                    return E.c.b(rect.left, rect.top, rect.right, rect.bottom);
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
            f575j = cls;
            f576k = cls.getDeclaredField("mVisibleInsets");
            f577l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f576k.setAccessible(true);
            f577l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        h = true;
    }

    @Override // M.t0
    public void d(View view) {
        E.c u2 = u(view);
        if (u2 == null) {
            u2 = E.c.f161e;
        }
        w(u2);
    }

    @Override // M.t0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f581g, ((o0) obj).f581g);
        }
        return false;
    }

    @Override // M.t0
    public E.c f(int i2) {
        return r(i2, false);
    }

    @Override // M.t0
    public final E.c j() {
        if (this.f579e == null) {
            WindowInsets windowInsets = this.f578c;
            this.f579e = E.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f579e;
    }

    @Override // M.t0
    public v0 l(int i2, int i3, int i4, int i5) {
        v0 g2 = v0.g(null, this.f578c);
        int i6 = Build.VERSION.SDK_INT;
        n0 m0Var = i6 >= 30 ? new m0(g2) : i6 >= 29 ? new l0(g2) : new k0(g2);
        m0Var.g(v0.e(j(), i2, i3, i4, i5));
        m0Var.e(v0.e(h(), i2, i3, i4, i5));
        return m0Var.b();
    }

    @Override // M.t0
    public boolean n() {
        return this.f578c.isRound();
    }

    @Override // M.t0
    public void o(E.c[] cVarArr) {
        this.d = cVarArr;
    }

    @Override // M.t0
    public void p(v0 v0Var) {
        this.f580f = v0Var;
    }

    public E.c s(int i2, boolean z2) {
        E.c h2;
        int i3;
        if (i2 == 1) {
            return z2 ? E.c.b(0, Math.max(t().f163b, j().f163b), 0, 0) : E.c.b(0, j().f163b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                E.c t2 = t();
                E.c h3 = h();
                return E.c.b(Math.max(t2.f162a, h3.f162a), 0, Math.max(t2.f164c, h3.f164c), Math.max(t2.d, h3.d));
            }
            E.c j2 = j();
            v0 v0Var = this.f580f;
            h2 = v0Var != null ? v0Var.f596a.h() : null;
            int i4 = j2.d;
            if (h2 != null) {
                i4 = Math.min(i4, h2.d);
            }
            return E.c.b(j2.f162a, 0, j2.f164c, i4);
        }
        E.c cVar = E.c.f161e;
        if (i2 == 8) {
            E.c[] cVarArr = this.d;
            h2 = cVarArr != null ? cVarArr[z1.l.U(8)] : null;
            if (h2 != null) {
                return h2;
            }
            E.c j3 = j();
            E.c t3 = t();
            int i5 = j3.d;
            if (i5 > t3.d) {
                return E.c.b(0, 0, 0, i5);
            }
            E.c cVar2 = this.f581g;
            return (cVar2 == null || cVar2.equals(cVar) || (i3 = this.f581g.d) <= t3.d) ? cVar : E.c.b(0, 0, 0, i3);
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
        v0 v0Var2 = this.f580f;
        C0009j e2 = v0Var2 != null ? v0Var2.f596a.e() : e();
        if (e2 == null) {
            return cVar;
        }
        int i6 = Build.VERSION.SDK_INT;
        return E.c.b(i6 >= 28 ? AbstractC0008i.d(e2.f560a) : 0, i6 >= 28 ? AbstractC0008i.f(e2.f560a) : 0, i6 >= 28 ? AbstractC0008i.e(e2.f560a) : 0, i6 >= 28 ? AbstractC0008i.c(e2.f560a) : 0);
    }

    public void w(E.c cVar) {
        this.f581g = cVar;
    }
}
