package D;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class P extends W {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f254h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f255i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f256j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f257k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f258l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f259c;

    /* renamed from: d, reason: collision with root package name */
    public w.c[] f260d;

    /* renamed from: e, reason: collision with root package name */
    public w.c f261e;

    /* renamed from: f, reason: collision with root package name */
    public Y f262f;

    /* renamed from: g, reason: collision with root package name */
    public w.c f263g;

    public P(Y y, WindowInsets windowInsets) {
        super(y);
        this.f261e = null;
        this.f259c = windowInsets;
    }

    private w.c s() {
        Y y = this.f262f;
        return y != null ? y.f272a.g() : w.c.f6126e;
    }

    private w.c t(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f254h) {
            v();
        }
        Method method = f255i;
        if (method != null && f256j != null && f257k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f257k.get(f258l.get(invoke));
                if (rect != null) {
                    return w.c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
        }
        return null;
    }

    private static void v() {
        try {
            f255i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f256j = cls;
            f257k = cls.getDeclaredField("mVisibleInsets");
            f258l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f257k.setAccessible(true);
            f258l.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        f254h = true;
    }

    @Override // D.W
    public void d(View view) {
        w.c t6 = t(view);
        if (t6 == null) {
            t6 = w.c.f6126e;
        }
        w(t6);
    }

    @Override // D.W
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f263g, ((P) obj).f263g);
        }
        return false;
    }

    @Override // D.W
    public final w.c i() {
        if (this.f261e == null) {
            WindowInsets windowInsets = this.f259c;
            this.f261e = w.c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f261e;
    }

    @Override // D.W
    public Y k(int i7, int i8, int i9, int i10) {
        Y c7 = Y.c(this.f259c, null);
        int i11 = Build.VERSION.SDK_INT;
        O n7 = i11 >= 30 ? new N(c7) : i11 >= 29 ? new M(c7) : new K(c7);
        n7.d(Y.a(i(), i7, i8, i9, i10));
        n7.c(Y.a(g(), i7, i8, i9, i10));
        return n7.b();
    }

    @Override // D.W
    public boolean m() {
        return this.f259c.isRound();
    }

    @Override // D.W
    public boolean n(int i7) {
        for (int i8 = 1; i8 <= 256; i8 <<= 1) {
            if ((i7 & i8) != 0 && !u(i8)) {
                return false;
            }
        }
        return true;
    }

    @Override // D.W
    public void o(w.c[] cVarArr) {
        this.f260d = cVarArr;
    }

    @Override // D.W
    public void p(Y y) {
        this.f262f = y;
    }

    public w.c r(int i7, boolean z5) {
        w.c g7;
        int i8;
        if (i7 == 1) {
            return z5 ? w.c.a(0, Math.max(s().f6128b, i().f6128b), 0, 0) : w.c.a(0, i().f6128b, 0, 0);
        }
        if (i7 == 2) {
            if (z5) {
                w.c s6 = s();
                w.c g8 = g();
                return w.c.a(Math.max(s6.f6127a, g8.f6127a), 0, Math.max(s6.f6129c, g8.f6129c), Math.max(s6.f6130d, g8.f6130d));
            }
            w.c i9 = i();
            Y y = this.f262f;
            g7 = y != null ? y.f272a.g() : null;
            int i10 = i9.f6130d;
            if (g7 != null) {
                i10 = Math.min(i10, g7.f6130d);
            }
            return w.c.a(i9.f6127a, 0, i9.f6129c, i10);
        }
        w.c cVar = w.c.f6126e;
        if (i7 == 8) {
            w.c[] cVarArr = this.f260d;
            g7 = cVarArr != null ? cVarArr[3] : null;
            if (g7 != null) {
                return g7;
            }
            w.c i11 = i();
            w.c s7 = s();
            int i12 = i11.f6130d;
            if (i12 > s7.f6130d) {
                return w.c.a(0, 0, 0, i12);
            }
            w.c cVar2 = this.f263g;
            if (cVar2 != null && !cVar2.equals(cVar) && (i8 = this.f263g.f6130d) > s7.f6130d) {
                return w.c.a(0, 0, 0, i8);
            }
        } else {
            if (i7 == 16) {
                return h();
            }
            if (i7 == 32) {
                return f();
            }
            if (i7 == 64) {
                return j();
            }
            if (i7 == 128) {
                Y y6 = this.f262f;
                C0092e e4 = y6 != null ? y6.f272a.e() : e();
                if (e4 != null) {
                    int i13 = Build.VERSION.SDK_INT;
                    return w.c.a(i13 >= 28 ? AbstractC0091d.d(e4.f288a) : 0, i13 >= 28 ? AbstractC0091d.f(e4.f288a) : 0, i13 >= 28 ? AbstractC0091d.e(e4.f288a) : 0, i13 >= 28 ? AbstractC0091d.c(e4.f288a) : 0);
                }
            }
        }
        return cVar;
    }

    public boolean u(int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 8 && i7 != 128) {
                return true;
            }
        }
        return !r(i7, false).equals(w.c.f6126e);
    }

    public void w(w.c cVar) {
        this.f263g = cVar;
    }
}
