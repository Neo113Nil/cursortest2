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
    public static Class f417j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f418k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f419l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f420c;
    public C.d[] d;

    /* renamed from: e, reason: collision with root package name */
    public C.d f421e;

    /* renamed from: f, reason: collision with root package name */
    public w0 f422f;

    /* renamed from: g, reason: collision with root package name */
    public C.d f423g;

    public p0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var);
        this.f421e = null;
        this.f420c = windowInsets;
    }

    private C.d r(int i2, boolean z2) {
        C.d dVar = C.d.f141e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                dVar = C.d.a(dVar, s(i3, z2));
            }
        }
        return dVar;
    }

    private C.d t() {
        w0 w0Var = this.f422f;
        return w0Var != null ? w0Var.f438a.h() : C.d.f141e;
    }

    private C.d u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = i;
        if (method != null && f417j != null && f418k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f418k.get(f419l.get(invoke));
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
            f417j = cls;
            f418k = cls.getDeclaredField("mVisibleInsets");
            f419l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f418k.setAccessible(true);
            f419l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        h = true;
    }

    @Override // K.u0
    public void d(View view) {
        C.d u2 = u(view);
        if (u2 == null) {
            u2 = C.d.f141e;
        }
        w(u2);
    }

    @Override // K.u0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f423g, ((p0) obj).f423g);
        }
        return false;
    }

    @Override // K.u0
    public C.d f(int i2) {
        return r(i2, false);
    }

    @Override // K.u0
    public final C.d j() {
        if (this.f421e == null) {
            WindowInsets windowInsets = this.f420c;
            this.f421e = C.d.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f421e;
    }

    @Override // K.u0
    public w0 l(int i2, int i3, int i4, int i5) {
        w0 g2 = w0.g(null, this.f420c);
        int i6 = Build.VERSION.SDK_INT;
        o0 n0Var = i6 >= 30 ? new n0(g2) : i6 >= 29 ? new m0(g2) : new l0(g2);
        n0Var.g(w0.e(j(), i2, i3, i4, i5));
        n0Var.e(w0.e(h(), i2, i3, i4, i5));
        return n0Var.b();
    }

    @Override // K.u0
    public boolean n() {
        return this.f420c.isRound();
    }

    @Override // K.u0
    public void o(C.d[] dVarArr) {
        this.d = dVarArr;
    }

    @Override // K.u0
    public void p(w0 w0Var) {
        this.f422f = w0Var;
    }

    public C.d s(int i2, boolean z2) {
        C.d h2;
        int i3;
        if (i2 == 1) {
            return z2 ? C.d.b(0, Math.max(t().f143b, j().f143b), 0, 0) : C.d.b(0, j().f143b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C.d t2 = t();
                C.d h3 = h();
                return C.d.b(Math.max(t2.f142a, h3.f142a), 0, Math.max(t2.f144c, h3.f144c), Math.max(t2.d, h3.d));
            }
            C.d j2 = j();
            w0 w0Var = this.f422f;
            h2 = w0Var != null ? w0Var.f438a.h() : null;
            int i4 = j2.d;
            if (h2 != null) {
                i4 = Math.min(i4, h2.d);
            }
            return C.d.b(j2.f142a, 0, j2.f144c, i4);
        }
        C.d dVar = C.d.f141e;
        if (i2 == 8) {
            C.d[] dVarArr = this.d;
            h2 = dVarArr != null ? dVarArr[u1.d.L(8)] : null;
            if (h2 != null) {
                return h2;
            }
            C.d j3 = j();
            C.d t3 = t();
            int i5 = j3.d;
            if (i5 > t3.d) {
                return C.d.b(0, 0, 0, i5);
            }
            C.d dVar2 = this.f423g;
            return (dVar2 == null || dVar2.equals(dVar) || (i3 = this.f423g.d) <= t3.d) ? dVar : C.d.b(0, 0, 0, i3);
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
        w0 w0Var2 = this.f422f;
        C0009j e2 = w0Var2 != null ? w0Var2.f438a.e() : e();
        if (e2 == null) {
            return dVar;
        }
        int i6 = Build.VERSION.SDK_INT;
        return C.d.b(i6 >= 28 ? AbstractC0008i.d(e2.f397a) : 0, i6 >= 28 ? AbstractC0008i.f(e2.f397a) : 0, i6 >= 28 ? AbstractC0008i.e(e2.f397a) : 0, i6 >= 28 ? AbstractC0008i.c(e2.f397a) : 0);
    }

    public void w(C.d dVar) {
        this.f423g = dVar;
    }
}
