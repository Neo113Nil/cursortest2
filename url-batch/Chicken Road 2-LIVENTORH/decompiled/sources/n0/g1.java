package n0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class g1 extends n1 {
    public static boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f2735j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f2736k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f2737l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f2738m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f2739c;
    public f0.c[] d;

    /* renamed from: e, reason: collision with root package name */
    public f0.c f2740e;

    /* renamed from: f, reason: collision with root package name */
    public q1 f2741f;

    /* renamed from: g, reason: collision with root package name */
    public f0.c f2742g;

    /* renamed from: h, reason: collision with root package name */
    public int f2743h;

    public g1(q1 q1Var, WindowInsets windowInsets) {
        super(q1Var);
        this.f2740e = null;
        this.f2739c = windowInsets;
    }

    private f0.c t(int i4, boolean z3) {
        f0.c cVar = f0.c.f1265e;
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0) {
                cVar = f0.c.a(cVar, u(i5, z3));
            }
        }
        return cVar;
    }

    private f0.c v() {
        q1 q1Var = this.f2741f;
        return q1Var != null ? q1Var.f2775a.i() : f0.c.f1265e;
    }

    private f0.c w(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!i) {
            x();
        }
        Method method = f2735j;
        if (method != null && f2736k != null && f2737l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f2737l.get(f2738m.get(invoke));
                if (rect != null) {
                    return f0.c.c(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
        }
        return null;
    }

    private static void x() {
        try {
            f2735j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2736k = cls;
            f2737l = cls.getDeclaredField("mVisibleInsets");
            f2738m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2737l.setAccessible(true);
            f2738m.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        i = true;
    }

    public static boolean z(int i4, int i5) {
        return (i4 & 6) == (i5 & 6);
    }

    @Override // n0.n1
    public void d(View view) {
        f0.c w3 = w(view);
        if (w3 == null) {
            w3 = f0.c.f1265e;
        }
        y(w3);
    }

    @Override // n0.n1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Objects.equals(this.f2742g, g1Var.f2742g) && z(this.f2743h, g1Var.f2743h);
    }

    @Override // n0.n1
    public f0.c f(int i4) {
        return t(i4, false);
    }

    @Override // n0.n1
    public f0.c g(int i4) {
        return t(i4, true);
    }

    @Override // n0.n1
    public final f0.c k() {
        if (this.f2740e == null) {
            WindowInsets windowInsets = this.f2739c;
            this.f2740e = f0.c.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2740e;
    }

    @Override // n0.n1
    public q1 m(int i4, int i5, int i6, int i7) {
        q1 g4 = q1.g(null, this.f2739c);
        int i8 = Build.VERSION.SDK_INT;
        f1 e1Var = i8 >= 34 ? new e1(g4) : i8 >= 31 ? new d1(g4) : i8 >= 30 ? new c1(g4) : i8 >= 29 ? new b1(g4) : new z0(g4);
        e1Var.g(q1.e(k(), i4, i5, i6, i7));
        e1Var.e(q1.e(i(), i4, i5, i6, i7));
        return e1Var.b();
    }

    @Override // n0.n1
    public boolean o() {
        return this.f2739c.isRound();
    }

    @Override // n0.n1
    public void p(f0.c[] cVarArr) {
        this.d = cVarArr;
    }

    @Override // n0.n1
    public void q(q1 q1Var) {
        this.f2741f = q1Var;
    }

    @Override // n0.n1
    public void s(int i4) {
        this.f2743h = i4;
    }

    public f0.c u(int i4, boolean z3) {
        f0.c i5;
        int i6;
        f0.c cVar = f0.c.f1265e;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 8) {
                    f0.c[] cVarArr = this.d;
                    i5 = cVarArr != null ? cVarArr[h.a.M(8)] : null;
                    if (i5 != null) {
                        return i5;
                    }
                    f0.c k4 = k();
                    f0.c v3 = v();
                    int i7 = k4.d;
                    if (i7 > v3.d) {
                        return f0.c.c(0, 0, 0, i7);
                    }
                    f0.c cVar2 = this.f2742g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i6 = this.f2742g.d) > v3.d) {
                        return f0.c.c(0, 0, 0, i6);
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
                        q1 q1Var = this.f2741f;
                        h e4 = q1Var != null ? q1Var.f2775a.e() : e();
                        if (e4 != null) {
                            int i8 = Build.VERSION.SDK_INT;
                            return f0.c.c(i8 >= 28 ? g0.a.d(e4.f2744a) : 0, i8 >= 28 ? g0.a.f(e4.f2744a) : 0, i8 >= 28 ? g0.a.e(e4.f2744a) : 0, i8 >= 28 ? g0.a.c(e4.f2744a) : 0);
                        }
                    }
                }
            } else {
                if (z3) {
                    f0.c v4 = v();
                    f0.c i9 = i();
                    return f0.c.c(Math.max(v4.f1266a, i9.f1266a), 0, Math.max(v4.f1268c, i9.f1268c), Math.max(v4.d, i9.d));
                }
                if ((this.f2743h & 2) == 0) {
                    f0.c k5 = k();
                    q1 q1Var2 = this.f2741f;
                    i5 = q1Var2 != null ? q1Var2.f2775a.i() : null;
                    int i10 = k5.d;
                    if (i5 != null) {
                        i10 = Math.min(i10, i5.d);
                    }
                    return f0.c.c(k5.f1266a, 0, k5.f1268c, i10);
                }
            }
        } else {
            if (z3) {
                return f0.c.c(0, Math.max(v().f1267b, k().f1267b), 0, 0);
            }
            if ((this.f2743h & 4) == 0) {
                return f0.c.c(0, k().f1267b, 0, 0);
            }
        }
        return cVar;
    }

    public void y(f0.c cVar) {
        this.f2742g = cVar;
    }
}
