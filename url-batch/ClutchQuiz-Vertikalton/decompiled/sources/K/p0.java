package K;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class p0 extends u0 {
    public static boolean h = false;
    public static Method i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f431j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f432k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f433l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f434c;
    public C.d[] d;

    /* renamed from: e, reason: collision with root package name */
    public C.d f435e;

    /* renamed from: f, reason: collision with root package name */
    public w0 f436f;

    /* renamed from: g, reason: collision with root package name */
    public C.d f437g;

    public p0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var);
        this.f435e = null;
        this.f434c = windowInsets;
    }

    private C.d r(int i2, boolean z2) {
        C.d dVar = C.d.f93e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                dVar = C.d.a(dVar, s(i3, z2));
            }
        }
        return dVar;
    }

    private C.d t() {
        w0 w0Var = this.f436f;
        return w0Var != null ? w0Var.f451a.h() : C.d.f93e;
    }

    private C.d u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = i;
        if (method != null && f431j != null && f432k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f432k.get(f433l.get(invoke));
                if (rect != null) {
                    return C.d.b(rect.left, rect.top, rect.right, rect.bottom);
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
            f431j = cls;
            f432k = cls.getDeclaredField("mVisibleInsets");
            f433l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f432k.setAccessible(true);
            f433l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        h = true;
    }

    @Override // K.u0
    public void d(View view) {
        C.d u2 = u(view);
        if (u2 == null) {
            u2 = C.d.f93e;
        }
        w(u2);
    }

    @Override // K.u0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f437g, ((p0) obj).f437g);
        }
        return false;
    }

    @Override // K.u0
    public C.d f(int i2) {
        return r(i2, false);
    }

    @Override // K.u0
    public final C.d j() {
        if (this.f435e == null) {
            WindowInsets windowInsets = this.f434c;
            this.f435e = C.d.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f435e;
    }

    @Override // K.u0
    public w0 l(int i2, int i3, int i4, int i5) {
        w0 g2 = w0.g(null, this.f434c);
        int i6 = Build.VERSION.SDK_INT;
        o0 n0Var = i6 >= 30 ? new n0(g2) : i6 >= 29 ? new m0(g2) : new l0(g2);
        n0Var.g(w0.e(j(), i2, i3, i4, i5));
        n0Var.e(w0.e(h(), i2, i3, i4, i5));
        return n0Var.b();
    }

    @Override // K.u0
    public boolean n() {
        return this.f434c.isRound();
    }

    @Override // K.u0
    public void o(C.d[] dVarArr) {
        this.d = dVarArr;
    }

    @Override // K.u0
    public void p(w0 w0Var) {
        this.f436f = w0Var;
    }

    public C.d s(int i2, boolean z2) {
        C.d h2;
        int i3;
        if (i2 == 1) {
            return z2 ? C.d.b(0, Math.max(t().f95b, j().f95b), 0, 0) : C.d.b(0, j().f95b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C.d t2 = t();
                C.d h3 = h();
                return C.d.b(Math.max(t2.f94a, h3.f94a), 0, Math.max(t2.f96c, h3.f96c), Math.max(t2.d, h3.d));
            }
            C.d j2 = j();
            w0 w0Var = this.f436f;
            h2 = w0Var != null ? w0Var.f451a.h() : null;
            int i4 = j2.d;
            if (h2 != null) {
                i4 = Math.min(i4, h2.d);
            }
            return C.d.b(j2.f94a, 0, j2.f96c, i4);
        }
        C.d dVar = C.d.f93e;
        if (i2 == 8) {
            C.d[] dVarArr = this.d;
            h2 = dVarArr != null ? dVarArr[A.c.Y(8)] : null;
            if (h2 != null) {
                return h2;
            }
            C.d j3 = j();
            C.d t3 = t();
            int i5 = j3.d;
            if (i5 > t3.d) {
                return C.d.b(0, 0, 0, i5);
            }
            C.d dVar2 = this.f437g;
            return (dVar2 == null || dVar2.equals(dVar) || (i3 = this.f437g.d) <= t3.d) ? dVar : C.d.b(0, 0, 0, i3);
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
            return dVar;
        }
        w0 w0Var2 = this.f436f;
        C0010k e2 = w0Var2 != null ? w0Var2.f451a.e() : e();
        if (e2 == null) {
            return dVar;
        }
        int i6 = Build.VERSION.SDK_INT;
        return C.d.b(i6 >= 28 ? AbstractC0009j.d(e2.f412a) : 0, i6 >= 28 ? AbstractC0009j.f(e2.f412a) : 0, i6 >= 28 ? AbstractC0009j.e(e2.f412a) : 0, i6 >= 28 ? AbstractC0009j.c(e2.f412a) : 0);
    }

    public void w(C.d dVar) {
        this.f437g = dVar;
    }
}
