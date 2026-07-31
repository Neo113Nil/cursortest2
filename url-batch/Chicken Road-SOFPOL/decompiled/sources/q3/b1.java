package q3;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b1 extends i1 {
    public static boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f6081j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f6082k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f6083l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f6084m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f6085c;

    /* renamed from: d, reason: collision with root package name */
    public i3.c[] f6086d;

    /* renamed from: e, reason: collision with root package name */
    public i3.c f6087e;

    /* renamed from: f, reason: collision with root package name */
    public l1 f6088f;

    /* renamed from: g, reason: collision with root package name */
    public i3.c f6089g;

    /* renamed from: h, reason: collision with root package name */
    public int f6090h;

    public b1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var);
        this.f6087e = null;
        this.f6085c = windowInsets;
    }

    public static boolean B(int i8, int i9) {
        return (i8 & 6) == (i9 & 6);
    }

    private i3.c u(int i8, boolean z3) {
        i3.c cVar = i3.c.f3420e;
        for (int i9 = 1; i9 <= 512; i9 <<= 1) {
            if ((i8 & i9) != 0) {
                cVar = i3.c.a(cVar, v(i9, z3));
            }
        }
        return cVar;
    }

    private i3.c w() {
        l1 l1Var = this.f6088f;
        return l1Var != null ? l1Var.f6127a.i() : i3.c.f3420e;
    }

    private i3.c x(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!i) {
            z();
        }
        Method method = f6081j;
        if (method != null && f6082k != null && f6083l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f6083l.get(f6084m.get(invoke));
                if (rect != null) {
                    return i3.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e8) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
            }
        }
        return null;
    }

    private static void z() {
        try {
            f6081j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f6082k = cls;
            f6083l = cls.getDeclaredField("mVisibleInsets");
            f6084m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f6083l.setAccessible(true);
            f6084m.setAccessible(true);
        } catch (ReflectiveOperationException e8) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
        }
        i = true;
    }

    public void A(i3.c cVar) {
        this.f6089g = cVar;
    }

    @Override // q3.i1
    public void d(View view) {
        i3.c x7 = x(view);
        if (x7 == null) {
            x7 = i3.c.f3420e;
        }
        A(x7);
    }

    @Override // q3.i1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Objects.equals(this.f6089g, b1Var.f6089g) && B(this.f6090h, b1Var.f6090h);
    }

    @Override // q3.i1
    public i3.c f(int i8) {
        return u(i8, false);
    }

    @Override // q3.i1
    public i3.c g(int i8) {
        return u(i8, true);
    }

    @Override // q3.i1
    public final i3.c k() {
        if (this.f6087e == null) {
            WindowInsets windowInsets = this.f6085c;
            this.f6087e = i3.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f6087e;
    }

    @Override // q3.i1
    public l1 m(int i8, int i9, int i10, int i11) {
        l1 d8 = l1.d(null, this.f6085c);
        int i12 = Build.VERSION.SDK_INT;
        a1 z0Var = i12 >= 34 ? new z0(d8) : i12 >= 31 ? new y0(d8) : i12 >= 30 ? new x0(d8) : i12 >= 29 ? new w0(d8) : new v0(d8);
        z0Var.g(l1.b(k(), i8, i9, i10, i11));
        z0Var.e(l1.b(i(), i8, i9, i10, i11));
        return z0Var.b();
    }

    @Override // q3.i1
    public boolean o() {
        return this.f6085c.isRound();
    }

    @Override // q3.i1
    public boolean p(int i8) {
        for (int i9 = 1; i9 <= 512; i9 <<= 1) {
            if ((i8 & i9) != 0 && !y(i9)) {
                return false;
            }
        }
        return true;
    }

    @Override // q3.i1
    public void q(i3.c[] cVarArr) {
        this.f6086d = cVarArr;
    }

    @Override // q3.i1
    public void r(l1 l1Var) {
        this.f6088f = l1Var;
    }

    @Override // q3.i1
    public void t(int i8) {
        this.f6090h = i8;
    }

    public i3.c v(int i8, boolean z3) {
        i3.c i9;
        int i10;
        i3.c cVar = i3.c.f3420e;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 8) {
                    i3.c[] cVarArr = this.f6086d;
                    i9 = cVarArr != null ? cVarArr[h0.a.K(8)] : null;
                    if (i9 != null) {
                        return i9;
                    }
                    i3.c k3 = k();
                    i3.c w7 = w();
                    int i11 = k3.f3424d;
                    if (i11 > w7.f3424d) {
                        return i3.c.b(0, 0, 0, i11);
                    }
                    i3.c cVar2 = this.f6089g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i10 = this.f6089g.f3424d) > w7.f3424d) {
                        return i3.c.b(0, 0, 0, i10);
                    }
                } else {
                    if (i8 == 16) {
                        return j();
                    }
                    if (i8 == 32) {
                        return h();
                    }
                    if (i8 == 64) {
                        return l();
                    }
                    if (i8 == 128) {
                        l1 l1Var = this.f6088f;
                        j e8 = l1Var != null ? l1Var.f6127a.e() : e();
                        if (e8 != null) {
                            int i12 = Build.VERSION.SDK_INT;
                            return i3.c.b(i12 >= 28 ? j3.a.f(e8.f6113a) : 0, i12 >= 28 ? j3.a.h(e8.f6113a) : 0, i12 >= 28 ? j3.a.g(e8.f6113a) : 0, i12 >= 28 ? j3.a.e(e8.f6113a) : 0);
                        }
                    }
                }
            } else {
                if (z3) {
                    i3.c w8 = w();
                    i3.c i13 = i();
                    return i3.c.b(Math.max(w8.f3421a, i13.f3421a), 0, Math.max(w8.f3423c, i13.f3423c), Math.max(w8.f3424d, i13.f3424d));
                }
                if ((this.f6090h & 2) == 0) {
                    i3.c k7 = k();
                    l1 l1Var2 = this.f6088f;
                    i9 = l1Var2 != null ? l1Var2.f6127a.i() : null;
                    int i14 = k7.f3424d;
                    if (i9 != null) {
                        i14 = Math.min(i14, i9.f3424d);
                    }
                    return i3.c.b(k7.f3421a, 0, k7.f3423c, i14);
                }
            }
        } else {
            if (z3) {
                return i3.c.b(0, Math.max(w().f3422b, k().f3422b), 0, 0);
            }
            if ((this.f6090h & 4) == 0) {
                return i3.c.b(0, k().f3422b, 0, 0);
            }
        }
        return cVar;
    }

    public boolean y(int i8) {
        if (i8 != 1 && i8 != 2) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 8 && i8 != 128) {
                return true;
            }
        }
        return !v(i8, false).equals(i3.c.f3420e);
    }
}
