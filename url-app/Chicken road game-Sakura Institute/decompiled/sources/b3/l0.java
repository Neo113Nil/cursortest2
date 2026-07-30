package b3;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class l0 extends q0 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f1344h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f1345i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f1346j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f1347k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f1348l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f1349c;

    /* renamed from: d, reason: collision with root package name */
    public v2.c[] f1350d;

    /* renamed from: e, reason: collision with root package name */
    public v2.c f1351e;

    /* renamed from: f, reason: collision with root package name */
    public t0 f1352f;

    /* renamed from: g, reason: collision with root package name */
    public v2.c f1353g;

    public l0(t0 t0Var, WindowInsets windowInsets) {
        super(t0Var);
        this.f1351e = null;
        this.f1349c = windowInsets;
    }

    private v2.c s(int i7, boolean z8) {
        v2.c cVar = v2.c.f9101e;
        for (int i8 = 1; i8 <= 256; i8 <<= 1) {
            if ((i7 & i8) != 0) {
                cVar = v2.c.a(cVar, t(i8, z8));
            }
        }
        return cVar;
    }

    private v2.c u() {
        t0 t0Var = this.f1352f;
        return t0Var != null ? t0Var.f1367a.i() : v2.c.f9101e;
    }

    private v2.c v(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f1344h) {
            x();
        }
        Method method = f1345i;
        if (method != null && f1346j != null && f1347k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f1347k.get(f1348l.get(invoke));
                if (rect != null) {
                    return v2.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e9) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e9.getMessage(), e9);
            }
        }
        return null;
    }

    private static void x() {
        try {
            f1345i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f1346j = cls;
            f1347k = cls.getDeclaredField("mVisibleInsets");
            f1348l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f1347k.setAccessible(true);
            f1348l.setAccessible(true);
        } catch (ReflectiveOperationException e9) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e9.getMessage(), e9);
        }
        f1344h = true;
    }

    @Override // b3.q0
    public void d(View view) {
        v2.c v5 = v(view);
        if (v5 == null) {
            v5 = v2.c.f9101e;
        }
        y(v5);
    }

    @Override // b3.q0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f1353g, ((l0) obj).f1353g);
        }
        return false;
    }

    @Override // b3.q0
    public v2.c f(int i7) {
        return s(i7, false);
    }

    @Override // b3.q0
    public v2.c g(int i7) {
        return s(i7, true);
    }

    @Override // b3.q0
    public final v2.c k() {
        if (this.f1351e == null) {
            WindowInsets windowInsets = this.f1349c;
            this.f1351e = v2.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f1351e;
    }

    @Override // b3.q0
    public boolean n() {
        return this.f1349c.isRound();
    }

    @Override // b3.q0
    public boolean o(int i7) {
        for (int i8 = 1; i8 <= 256; i8 <<= 1) {
            if ((i7 & i8) != 0 && !w(i8)) {
                return false;
            }
        }
        return true;
    }

    @Override // b3.q0
    public void p(v2.c[] cVarArr) {
        this.f1350d = cVarArr;
    }

    @Override // b3.q0
    public void q(t0 t0Var) {
        this.f1352f = t0Var;
    }

    public v2.c t(int i7, boolean z8) {
        v2.c i8;
        int i9;
        if (i7 == 1) {
            return z8 ? v2.c.b(0, Math.max(u().f9103b, k().f9103b), 0, 0) : v2.c.b(0, k().f9103b, 0, 0);
        }
        if (i7 == 2) {
            if (z8) {
                v2.c u8 = u();
                v2.c i10 = i();
                return v2.c.b(Math.max(u8.f9102a, i10.f9102a), 0, Math.max(u8.f9104c, i10.f9104c), Math.max(u8.f9105d, i10.f9105d));
            }
            v2.c k8 = k();
            t0 t0Var = this.f1352f;
            i8 = t0Var != null ? t0Var.f1367a.i() : null;
            int i11 = k8.f9105d;
            if (i8 != null) {
                i11 = Math.min(i11, i8.f9105d);
            }
            return v2.c.b(k8.f9102a, 0, k8.f9104c, i11);
        }
        v2.c cVar = v2.c.f9101e;
        if (i7 == 8) {
            v2.c[] cVarArr = this.f1350d;
            i8 = cVarArr != null ? cVarArr[a8.d.K(8)] : null;
            if (i8 != null) {
                return i8;
            }
            v2.c k9 = k();
            v2.c u9 = u();
            int i12 = k9.f9105d;
            if (i12 > u9.f9105d) {
                return v2.c.b(0, 0, 0, i12);
            }
            v2.c cVar2 = this.f1353g;
            return (cVar2 == null || cVar2.equals(cVar) || (i9 = this.f1353g.f9105d) <= u9.f9105d) ? cVar : v2.c.b(0, 0, 0, i9);
        }
        if (i7 == 16) {
            return j();
        }
        if (i7 == 32) {
            return h();
        }
        if (i7 == 64) {
            return l();
        }
        if (i7 != 128) {
            return cVar;
        }
        t0 t0Var2 = this.f1352f;
        e e9 = t0Var2 != null ? t0Var2.f1367a.e() : e();
        if (e9 == null) {
            return cVar;
        }
        int i13 = Build.VERSION.SDK_INT;
        return v2.c.b(i13 >= 28 ? c.d(e9.f1318a) : 0, i13 >= 28 ? c.f(e9.f1318a) : 0, i13 >= 28 ? c.e(e9.f1318a) : 0, i13 >= 28 ? c.c(e9.f1318a) : 0);
    }

    public boolean w(int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 8 && i7 != 128) {
                return true;
            }
        }
        return !t(i7, false).equals(v2.c.f9101e);
    }

    public void y(v2.c cVar) {
        this.f1353g = cVar;
    }
}
