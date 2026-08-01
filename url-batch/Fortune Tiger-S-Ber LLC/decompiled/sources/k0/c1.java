package k0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class c1 extends i1 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f2718i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f2719j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f2720k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f2721l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f2722m;
    public final WindowInsets c;

    /* renamed from: d, reason: collision with root package name */
    public c0.c[] f2723d;

    /* renamed from: e, reason: collision with root package name */
    public c0.c f2724e;

    /* renamed from: f, reason: collision with root package name */
    public m1 f2725f;
    public c0.c g;
    public int h;

    public c1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var);
        this.f2724e = null;
        this.c = windowInsets;
    }

    private c0.c t(int i4, boolean z3) {
        c0.c cVar = c0.c.f977e;
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0) {
                cVar = c0.c.a(cVar, u(i5, z3));
            }
        }
        return cVar;
    }

    private c0.c v() {
        m1 m1Var = this.f2725f;
        return m1Var != null ? m1Var.f2760a.i() : c0.c.f977e;
    }

    private c0.c w(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f2718i) {
            x();
        }
        Method method = f2719j;
        if (method != null && f2720k != null && f2721l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f2721l.get(f2722m.get(invoke));
                if (rect != null) {
                    return c0.c.c(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
        }
        return null;
    }

    private static void x() {
        try {
            f2719j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2720k = cls;
            f2721l = cls.getDeclaredField("mVisibleInsets");
            f2722m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2721l.setAccessible(true);
            f2722m.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        f2718i = true;
    }

    public static boolean z(int i4, int i5) {
        return (i4 & 6) == (i5 & 6);
    }

    @Override // k0.i1
    public void d(View view) {
        c0.c w3 = w(view);
        if (w3 == null) {
            w3 = c0.c.f977e;
        }
        y(w3);
    }

    @Override // k0.i1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Objects.equals(this.g, c1Var.g) && z(this.h, c1Var.h);
    }

    @Override // k0.i1
    public c0.c f(int i4) {
        return t(i4, false);
    }

    @Override // k0.i1
    public c0.c g(int i4) {
        return t(i4, true);
    }

    @Override // k0.i1
    public final c0.c k() {
        if (this.f2724e == null) {
            WindowInsets windowInsets = this.c;
            this.f2724e = c0.c.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2724e;
    }

    @Override // k0.i1
    public m1 m(int i4, int i5, int i6, int i7) {
        m1 g = m1.g(null, this.c);
        int i8 = Build.VERSION.SDK_INT;
        b1 a1Var = i8 >= 34 ? new a1(g) : i8 >= 30 ? new z0(g) : i8 >= 29 ? new y0(g) : new x0(g);
        a1Var.g(m1.e(k(), i4, i5, i6, i7));
        a1Var.e(m1.e(i(), i4, i5, i6, i7));
        return a1Var.b();
    }

    @Override // k0.i1
    public boolean o() {
        return this.c.isRound();
    }

    @Override // k0.i1
    public void p(c0.c[] cVarArr) {
        this.f2723d = cVarArr;
    }

    @Override // k0.i1
    public void q(m1 m1Var) {
        this.f2725f = m1Var;
    }

    @Override // k0.i1
    public void s(int i4) {
        this.h = i4;
    }

    public c0.c u(int i4, boolean z3) {
        c0.c i5;
        int i6;
        c0.c cVar = c0.c.f977e;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 8) {
                    c0.c[] cVarArr = this.f2723d;
                    i5 = cVarArr != null ? cVarArr[k3.m.B(8)] : null;
                    if (i5 != null) {
                        return i5;
                    }
                    c0.c k4 = k();
                    c0.c v3 = v();
                    int i7 = k4.f980d;
                    if (i7 > v3.f980d) {
                        return c0.c.c(0, 0, 0, i7);
                    }
                    c0.c cVar2 = this.g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i6 = this.g.f980d) > v3.f980d) {
                        return c0.c.c(0, 0, 0, i6);
                    }
                } else {
                    if (i4 == 16) {
                        return j();
                    }
                    if (i4 == 32) {
                        return h();
                    }
                    if (i4 == 64) {
                        return l();
                    }
                    if (i4 == 128) {
                        m1 m1Var = this.f2725f;
                        h e4 = m1Var != null ? m1Var.f2760a.e() : e();
                        if (e4 != null) {
                            int i8 = Build.VERSION.SDK_INT;
                            return c0.c.c(i8 >= 28 ? d0.a.d(e4.f2741a) : 0, i8 >= 28 ? d0.a.f(e4.f2741a) : 0, i8 >= 28 ? d0.a.e(e4.f2741a) : 0, i8 >= 28 ? d0.a.c(e4.f2741a) : 0);
                        }
                    }
                }
            } else {
                if (z3) {
                    c0.c v4 = v();
                    c0.c i9 = i();
                    return c0.c.c(Math.max(v4.f978a, i9.f978a), 0, Math.max(v4.c, i9.c), Math.max(v4.f980d, i9.f980d));
                }
                if ((this.h & 2) == 0) {
                    c0.c k5 = k();
                    m1 m1Var2 = this.f2725f;
                    i5 = m1Var2 != null ? m1Var2.f2760a.i() : null;
                    int i10 = k5.f980d;
                    if (i5 != null) {
                        i10 = Math.min(i10, i5.f980d);
                    }
                    return c0.c.c(k5.f978a, 0, k5.c, i10);
                }
            }
        } else {
            if (z3) {
                return c0.c.c(0, Math.max(v().f979b, k().f979b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return c0.c.c(0, k().f979b, 0, 0);
            }
        }
        return cVar;
    }

    public void y(c0.c cVar) {
        this.g = cVar;
    }
}
