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
    public static Class f488j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f489k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f490l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f491c;
    public C.c[] d;

    /* renamed from: e, reason: collision with root package name */
    public C.c f492e;

    /* renamed from: f, reason: collision with root package name */
    public w0 f493f;

    /* renamed from: g, reason: collision with root package name */
    public C.c f494g;

    public p0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var);
        this.f492e = null;
        this.f491c = windowInsets;
    }

    private C.c r(int i2, boolean z2) {
        C.c cVar = C.c.f58e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                cVar = C.c.a(cVar, s(i3, z2));
            }
        }
        return cVar;
    }

    private C.c t() {
        w0 w0Var = this.f493f;
        return w0Var != null ? w0Var.f509a.h() : C.c.f58e;
    }

    private C.c u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = i;
        if (method != null && f488j != null && f489k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f489k.get(f490l.get(invoke));
                if (rect != null) {
                    return C.c.b(rect.left, rect.top, rect.right, rect.bottom);
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
            f488j = cls;
            f489k = cls.getDeclaredField("mVisibleInsets");
            f490l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f489k.setAccessible(true);
            f490l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        h = true;
    }

    @Override // K.u0
    public void d(View view) {
        C.c u2 = u(view);
        if (u2 == null) {
            u2 = C.c.f58e;
        }
        w(u2);
    }

    @Override // K.u0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f494g, ((p0) obj).f494g);
        }
        return false;
    }

    @Override // K.u0
    public C.c f(int i2) {
        return r(i2, false);
    }

    @Override // K.u0
    public final C.c j() {
        if (this.f492e == null) {
            WindowInsets windowInsets = this.f491c;
            this.f492e = C.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f492e;
    }

    @Override // K.u0
    public w0 l(int i2, int i3, int i4, int i5) {
        w0 g2 = w0.g(null, this.f491c);
        int i6 = Build.VERSION.SDK_INT;
        o0 n0Var = i6 >= 30 ? new n0(g2) : i6 >= 29 ? new m0(g2) : new l0(g2);
        n0Var.g(w0.e(j(), i2, i3, i4, i5));
        n0Var.e(w0.e(h(), i2, i3, i4, i5));
        return n0Var.b();
    }

    @Override // K.u0
    public boolean n() {
        return this.f491c.isRound();
    }

    @Override // K.u0
    public void o(C.c[] cVarArr) {
        this.d = cVarArr;
    }

    @Override // K.u0
    public void p(w0 w0Var) {
        this.f493f = w0Var;
    }

    public C.c s(int i2, boolean z2) {
        C.c h2;
        int i3;
        if (i2 == 1) {
            return z2 ? C.c.b(0, Math.max(t().f60b, j().f60b), 0, 0) : C.c.b(0, j().f60b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C.c t2 = t();
                C.c h3 = h();
                return C.c.b(Math.max(t2.f59a, h3.f59a), 0, Math.max(t2.f61c, h3.f61c), Math.max(t2.d, h3.d));
            }
            C.c j2 = j();
            w0 w0Var = this.f493f;
            h2 = w0Var != null ? w0Var.f509a.h() : null;
            int i4 = j2.d;
            if (h2 != null) {
                i4 = Math.min(i4, h2.d);
            }
            return C.c.b(j2.f59a, 0, j2.f61c, i4);
        }
        C.c cVar = C.c.f58e;
        if (i2 == 8) {
            C.c[] cVarArr = this.d;
            h2 = cVarArr != null ? cVarArr[x1.l.L(8)] : null;
            if (h2 != null) {
                return h2;
            }
            C.c j3 = j();
            C.c t3 = t();
            int i5 = j3.d;
            if (i5 > t3.d) {
                return C.c.b(0, 0, 0, i5);
            }
            C.c cVar2 = this.f494g;
            return (cVar2 == null || cVar2.equals(cVar) || (i3 = this.f494g.d) <= t3.d) ? cVar : C.c.b(0, 0, 0, i3);
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
        w0 w0Var2 = this.f493f;
        C0009j e2 = w0Var2 != null ? w0Var2.f509a.e() : e();
        if (e2 == null) {
            return cVar;
        }
        int i6 = Build.VERSION.SDK_INT;
        return C.c.b(i6 >= 28 ? AbstractC0008i.d(e2.f468a) : 0, i6 >= 28 ? AbstractC0008i.f(e2.f468a) : 0, i6 >= 28 ? AbstractC0008i.e(e2.f468a) : 0, i6 >= 28 ? AbstractC0008i.c(e2.f468a) : 0);
    }

    public void w(C.c cVar) {
        this.f494g = cVar;
    }
}
