package O;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class t0 extends y0 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2321h = false;
    public static Method i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f2322j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f2323k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f2324l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f2325c;

    /* renamed from: d, reason: collision with root package name */
    public G.e[] f2326d;

    /* renamed from: e, reason: collision with root package name */
    public G.e f2327e;

    /* renamed from: f, reason: collision with root package name */
    public A0 f2328f;

    /* renamed from: g, reason: collision with root package name */
    public G.e f2329g;

    public t0(A0 a02, WindowInsets windowInsets) {
        super(a02);
        this.f2327e = null;
        this.f2325c = windowInsets;
    }

    private G.e r(int i4, boolean z8) {
        G.e eVar = G.e.f1150e;
        for (int i9 = 1; i9 <= 256; i9 <<= 1) {
            if ((i4 & i9) != 0) {
                eVar = G.e.a(eVar, s(i9, z8));
            }
        }
        return eVar;
    }

    private G.e t() {
        A0 a02 = this.f2328f;
        return a02 != null ? a02.f2213a.h() : G.e.f1150e;
    }

    private G.e u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f2321h) {
            v();
        }
        Method method = i;
        if (method != null && f2322j != null && f2323k != null) {
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f2323k.get(f2324l.get(invoke));
                if (rect != null) {
                    return G.e.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e6) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
            }
        }
        return null;
    }

    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2322j = cls;
            f2323k = cls.getDeclaredField("mVisibleInsets");
            f2324l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2323k.setAccessible(true);
            f2324l.setAccessible(true);
        } catch (ReflectiveOperationException e6) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
        }
        f2321h = true;
    }

    @Override // O.y0
    public void d(View view) {
        G.e u7 = u(view);
        if (u7 == null) {
            u7 = G.e.f1150e;
        }
        w(u7);
    }

    @Override // O.y0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f2329g, ((t0) obj).f2329g);
        }
        return false;
    }

    @Override // O.y0
    public G.e f(int i4) {
        return r(i4, false);
    }

    @Override // O.y0
    public final G.e j() {
        if (this.f2327e == null) {
            WindowInsets windowInsets = this.f2325c;
            this.f2327e = G.e.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2327e;
    }

    @Override // O.y0
    public A0 l(int i4, int i9, int i10, int i11) {
        A0 h9 = A0.h(null, this.f2325c);
        int i12 = Build.VERSION.SDK_INT;
        s0 r0Var = i12 >= 30 ? new r0(h9) : i12 >= 29 ? new q0(h9) : new p0(h9);
        r0Var.g(A0.e(j(), i4, i9, i10, i11));
        r0Var.e(A0.e(h(), i4, i9, i10, i11));
        return r0Var.b();
    }

    @Override // O.y0
    public boolean n() {
        return this.f2325c.isRound();
    }

    @Override // O.y0
    public void o(G.e[] eVarArr) {
        this.f2326d = eVarArr;
    }

    @Override // O.y0
    public void p(A0 a02) {
        this.f2328f = a02;
    }

    public G.e s(int i4, boolean z8) {
        G.e h9;
        int i9;
        if (i4 == 1) {
            return z8 ? G.e.b(0, Math.max(t().f1152b, j().f1152b), 0, 0) : G.e.b(0, j().f1152b, 0, 0);
        }
        if (i4 == 2) {
            if (z8) {
                G.e t9 = t();
                G.e h10 = h();
                return G.e.b(Math.max(t9.f1151a, h10.f1151a), 0, Math.max(t9.f1153c, h10.f1153c), Math.max(t9.f1154d, h10.f1154d));
            }
            G.e j9 = j();
            A0 a02 = this.f2328f;
            h9 = a02 != null ? a02.f2213a.h() : null;
            int i10 = j9.f1154d;
            if (h9 != null) {
                i10 = Math.min(i10, h9.f1154d);
            }
            return G.e.b(j9.f1151a, 0, j9.f1153c, i10);
        }
        G.e eVar = G.e.f1150e;
        if (i4 == 8) {
            G.e[] eVarArr = this.f2326d;
            h9 = eVarArr != null ? eVarArr[com.bumptech.glide.h.o(8)] : null;
            if (h9 != null) {
                return h9;
            }
            G.e j10 = j();
            G.e t10 = t();
            int i11 = j10.f1154d;
            if (i11 > t10.f1154d) {
                return G.e.b(0, 0, 0, i11);
            }
            G.e eVar2 = this.f2329g;
            return (eVar2 == null || eVar2.equals(eVar) || (i9 = this.f2329g.f1154d) <= t10.f1154d) ? eVar : G.e.b(0, 0, 0, i9);
        }
        if (i4 == 16) {
            return i();
        }
        if (i4 == 32) {
            return g();
        }
        if (i4 == 64) {
            return k();
        }
        if (i4 != 128) {
            return eVar;
        }
        A0 a03 = this.f2328f;
        C0347i e6 = a03 != null ? a03.f2213a.e() : e();
        if (e6 == null) {
            return eVar;
        }
        int i12 = Build.VERSION.SDK_INT;
        return G.e.b(i12 >= 28 ? AbstractC0346h.d(e6.f2274a) : 0, i12 >= 28 ? AbstractC0346h.f(e6.f2274a) : 0, i12 >= 28 ? AbstractC0346h.e(e6.f2274a) : 0, i12 >= 28 ? AbstractC0346h.c(e6.f2274a) : 0);
    }

    public void w(G.e eVar) {
        this.f2329g = eVar;
    }
}
