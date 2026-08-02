package E;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import x.C1513b;

/* loaded from: classes.dex */
public abstract class T extends a0 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f385i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f386j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f387k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f388l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f389m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f390c;

    /* renamed from: d, reason: collision with root package name */
    public C1513b[] f391d;

    /* renamed from: e, reason: collision with root package name */
    public C1513b f392e;

    /* renamed from: f, reason: collision with root package name */
    public e0 f393f;

    /* renamed from: g, reason: collision with root package name */
    public C1513b f394g;

    /* renamed from: h, reason: collision with root package name */
    public int f395h;

    public T(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var);
        this.f392e = null;
        this.f390c = windowInsets;
    }

    private C1513b s() {
        e0 e0Var = this.f393f;
        return e0Var != null ? e0Var.f416a.g() : C1513b.f15954e;
    }

    private C1513b t(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f385i) {
            v();
        }
        Method method = f386j;
        if (method != null && f387k != null && f388l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f388l.get(f389m.get(invoke));
                if (rect != null) {
                    return C1513b.a(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
        }
        return null;
    }

    private static void v() {
        try {
            f386j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f387k = cls;
            f388l = cls.getDeclaredField("mVisibleInsets");
            f389m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f388l.setAccessible(true);
            f389m.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        f385i = true;
    }

    public static boolean x(int i4, int i5) {
        return (i4 & 6) == (i5 & 6);
    }

    @Override // E.a0
    public void d(View view) {
        C1513b t4 = t(view);
        if (t4 == null) {
            t4 = C1513b.f15954e;
        }
        w(t4);
    }

    @Override // E.a0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        T t4 = (T) obj;
        return Objects.equals(this.f394g, t4.f394g) && x(this.f395h, t4.f395h);
    }

    @Override // E.a0
    public final C1513b i() {
        if (this.f392e == null) {
            WindowInsets windowInsets = this.f390c;
            this.f392e = C1513b.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f392e;
    }

    @Override // E.a0
    public boolean l() {
        return this.f390c.isRound();
    }

    @Override // E.a0
    public boolean m(int i4) {
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0 && !u(i5)) {
                return false;
            }
        }
        return true;
    }

    @Override // E.a0
    public void n(C1513b[] c1513bArr) {
        this.f391d = c1513bArr;
    }

    @Override // E.a0
    public void o(e0 e0Var) {
        this.f393f = e0Var;
    }

    @Override // E.a0
    public void q(int i4) {
        this.f395h = i4;
    }

    public C1513b r(int i4, boolean z) {
        C1513b g4;
        int i5;
        C1513b c1513b = C1513b.f15954e;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 8) {
                    C1513b[] c1513bArr = this.f391d;
                    g4 = c1513bArr != null ? c1513bArr[3] : null;
                    if (g4 != null) {
                        return g4;
                    }
                    C1513b i6 = i();
                    C1513b s4 = s();
                    int i7 = i6.f15958d;
                    if (i7 > s4.f15958d) {
                        return C1513b.a(0, 0, 0, i7);
                    }
                    C1513b c1513b2 = this.f394g;
                    if (c1513b2 != null && !c1513b2.equals(c1513b) && (i5 = this.f394g.f15958d) > s4.f15958d) {
                        return C1513b.a(0, 0, 0, i5);
                    }
                } else {
                    if (i4 == 16) {
                        return h();
                    }
                    if (i4 == 32) {
                        return f();
                    }
                    if (i4 == 64) {
                        return j();
                    }
                    if (i4 == 128) {
                        e0 e0Var = this.f393f;
                        C0004e e4 = e0Var != null ? e0Var.f416a.e() : e();
                        if (e4 != null) {
                            int i8 = Build.VERSION.SDK_INT;
                            return C1513b.a(i8 >= 28 ? AbstractC0003d.g(e4.f414a) : 0, i8 >= 28 ? AbstractC0003d.i(e4.f414a) : 0, i8 >= 28 ? AbstractC0003d.h(e4.f414a) : 0, i8 >= 28 ? AbstractC0003d.f(e4.f414a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    C1513b s5 = s();
                    C1513b g5 = g();
                    return C1513b.a(Math.max(s5.f15955a, g5.f15955a), 0, Math.max(s5.f15957c, g5.f15957c), Math.max(s5.f15958d, g5.f15958d));
                }
                if ((this.f395h & 2) == 0) {
                    C1513b i9 = i();
                    e0 e0Var2 = this.f393f;
                    g4 = e0Var2 != null ? e0Var2.f416a.g() : null;
                    int i10 = i9.f15958d;
                    if (g4 != null) {
                        i10 = Math.min(i10, g4.f15958d);
                    }
                    return C1513b.a(i9.f15955a, 0, i9.f15957c, i10);
                }
            }
        } else {
            if (z) {
                return C1513b.a(0, Math.max(s().f15956b, i().f15956b), 0, 0);
            }
            if ((this.f395h & 4) == 0) {
                return C1513b.a(0, i().f15956b, 0, 0);
            }
        }
        return c1513b;
    }

    public boolean u(int i4) {
        if (i4 != 1 && i4 != 2) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 8 && i4 != 128) {
                return true;
            }
        }
        return !r(i4, false).equals(C1513b.f15954e);
    }

    public void w(C1513b c1513b) {
        this.f394g = c1513b;
    }
}
