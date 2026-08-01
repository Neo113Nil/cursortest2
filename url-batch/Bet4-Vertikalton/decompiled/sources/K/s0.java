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
public abstract class s0 extends x0 {
    public static boolean h = false;
    public static Method i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f497j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f498k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f499l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f500c;
    public C.c[] d;

    /* renamed from: e, reason: collision with root package name */
    public C.c f501e;

    /* renamed from: f, reason: collision with root package name */
    public z0 f502f;

    /* renamed from: g, reason: collision with root package name */
    public C.c f503g;

    public s0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var);
        this.f501e = null;
        this.f500c = windowInsets;
    }

    private C.c r(int i2, boolean z2) {
        C.c cVar = C.c.f106e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                cVar = C.c.a(cVar, s(i3, z2));
            }
        }
        return cVar;
    }

    private C.c t() {
        z0 z0Var = this.f502f;
        return z0Var != null ? z0Var.f519a.h() : C.c.f106e;
    }

    private C.c u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = i;
        if (method != null && f497j != null && f498k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f498k.get(f499l.get(invoke));
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
            f497j = cls;
            f498k = cls.getDeclaredField("mVisibleInsets");
            f499l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f498k.setAccessible(true);
            f499l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        h = true;
    }

    @Override // K.x0
    public void d(View view) {
        C.c u2 = u(view);
        if (u2 == null) {
            u2 = C.c.f106e;
        }
        w(u2);
    }

    @Override // K.x0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f503g, ((s0) obj).f503g);
        }
        return false;
    }

    @Override // K.x0
    public C.c f(int i2) {
        return r(i2, false);
    }

    @Override // K.x0
    public final C.c j() {
        if (this.f501e == null) {
            WindowInsets windowInsets = this.f500c;
            this.f501e = C.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f501e;
    }

    @Override // K.x0
    public z0 l(int i2, int i3, int i4, int i5) {
        z0 g2 = z0.g(null, this.f500c);
        int i6 = Build.VERSION.SDK_INT;
        r0 q0Var = i6 >= 30 ? new q0(g2) : i6 >= 29 ? new p0(g2) : new o0(g2);
        q0Var.g(z0.e(j(), i2, i3, i4, i5));
        q0Var.e(z0.e(h(), i2, i3, i4, i5));
        return q0Var.b();
    }

    @Override // K.x0
    public boolean n() {
        return this.f500c.isRound();
    }

    @Override // K.x0
    public void o(C.c[] cVarArr) {
        this.d = cVarArr;
    }

    @Override // K.x0
    public void p(z0 z0Var) {
        this.f502f = z0Var;
    }

    public C.c s(int i2, boolean z2) {
        C.c h2;
        int i3;
        if (i2 == 1) {
            return z2 ? C.c.b(0, Math.max(t().f108b, j().f108b), 0, 0) : C.c.b(0, j().f108b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C.c t2 = t();
                C.c h3 = h();
                return C.c.b(Math.max(t2.f107a, h3.f107a), 0, Math.max(t2.f109c, h3.f109c), Math.max(t2.d, h3.d));
            }
            C.c j2 = j();
            z0 z0Var = this.f502f;
            h2 = z0Var != null ? z0Var.f519a.h() : null;
            int i4 = j2.d;
            if (h2 != null) {
                i4 = Math.min(i4, h2.d);
            }
            return C.c.b(j2.f107a, 0, j2.f109c, i4);
        }
        C.c cVar = C.c.f106e;
        if (i2 == 8) {
            C.c[] cVarArr = this.d;
            h2 = cVarArr != null ? cVarArr[w1.d.P(8)] : null;
            if (h2 != null) {
                return h2;
            }
            C.c j3 = j();
            C.c t3 = t();
            int i5 = j3.d;
            if (i5 > t3.d) {
                return C.c.b(0, 0, 0, i5);
            }
            C.c cVar2 = this.f503g;
            return (cVar2 == null || cVar2.equals(cVar) || (i3 = this.f503g.d) <= t3.d) ? cVar : C.c.b(0, 0, 0, i3);
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
        z0 z0Var2 = this.f502f;
        C0012j e2 = z0Var2 != null ? z0Var2.f519a.e() : e();
        if (e2 == null) {
            return cVar;
        }
        int i6 = Build.VERSION.SDK_INT;
        return C.c.b(i6 >= 28 ? AbstractC0011i.d(e2.f469a) : 0, i6 >= 28 ? AbstractC0011i.f(e2.f469a) : 0, i6 >= 28 ? AbstractC0011i.e(e2.f469a) : 0, i6 >= 28 ? AbstractC0011i.c(e2.f469a) : 0);
    }

    public void w(C.c cVar) {
        this.f503g = cVar;
    }
}
