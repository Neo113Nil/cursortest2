package l;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class j extends p {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f743h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f744i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f745j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f746k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f747l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f748c;

    /* renamed from: d, reason: collision with root package name */
    public h.a[] f749d;

    /* renamed from: e, reason: collision with root package name */
    public h.a f750e;

    /* renamed from: f, reason: collision with root package name */
    public r f751f;

    /* renamed from: g, reason: collision with root package name */
    public h.a f752g;

    public j(r rVar, WindowInsets windowInsets) {
        super(rVar);
        this.f750e = null;
        this.f748c = windowInsets;
    }

    private h.a r() {
        r rVar = this.f751f;
        return rVar != null ? rVar.f759a.g() : h.a.f369e;
    }

    private h.a s(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f743h) {
            u();
        }
        Method method = f744i;
        if (method != null && f745j != null && f746k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f746k.get(f747l.get(invoke));
                if (rect != null) {
                    return h.a.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    private static void u() {
        try {
            f744i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f745j = cls;
            f746k = cls.getDeclaredField("mVisibleInsets");
            f747l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f746k.setAccessible(true);
            f747l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f743h = true;
    }

    @Override // l.p
    public void d(View view) {
        h.a s2 = s(view);
        if (s2 == null) {
            s2 = h.a.f369e;
        }
        v(s2);
    }

    @Override // l.p
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f752g, ((j) obj).f752g);
        }
        return false;
    }

    @Override // l.p
    public final h.a i() {
        if (this.f750e == null) {
            WindowInsets windowInsets = this.f748c;
            this.f750e = h.a.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f750e;
    }

    @Override // l.p
    public boolean l() {
        return this.f748c.isRound();
    }

    @Override // l.p
    public boolean m(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !t(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // l.p
    public void n(h.a[] aVarArr) {
        this.f749d = aVarArr;
    }

    @Override // l.p
    public void o(r rVar) {
        this.f751f = rVar;
    }

    public h.a q(int i2, boolean z2) {
        h.a g2;
        int i3;
        if (i2 == 1) {
            return z2 ? h.a.a(0, Math.max(r().f371b, i().f371b), 0, 0) : h.a.a(0, i().f371b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                h.a r2 = r();
                h.a g3 = g();
                return h.a.a(Math.max(r2.f370a, g3.f370a), 0, Math.max(r2.f372c, g3.f372c), Math.max(r2.f373d, g3.f373d));
            }
            h.a i4 = i();
            r rVar = this.f751f;
            g2 = rVar != null ? rVar.f759a.g() : null;
            int i5 = i4.f373d;
            if (g2 != null) {
                i5 = Math.min(i5, g2.f373d);
            }
            return h.a.a(i4.f370a, 0, i4.f372c, i5);
        }
        h.a aVar = h.a.f369e;
        if (i2 == 8) {
            h.a[] aVarArr = this.f749d;
            g2 = aVarArr != null ? aVarArr[3] : null;
            if (g2 != null) {
                return g2;
            }
            h.a i6 = i();
            h.a r3 = r();
            int i7 = i6.f373d;
            if (i7 > r3.f373d) {
                return h.a.a(0, 0, 0, i7);
            }
            h.a aVar2 = this.f752g;
            if (aVar2 != null && !aVar2.equals(aVar) && (i3 = this.f752g.f373d) > r3.f373d) {
                return h.a.a(0, 0, 0, i3);
            }
        } else {
            if (i2 == 16) {
                return h();
            }
            if (i2 == 32) {
                return f();
            }
            if (i2 == 64) {
                return j();
            }
            if (i2 == 128) {
                r rVar2 = this.f751f;
                b e2 = rVar2 != null ? rVar2.f759a.e() : e();
                if (e2 != null) {
                    int i8 = Build.VERSION.SDK_INT;
                    return h.a.a(i8 >= 28 ? a.d(e2.f735a) : 0, i8 >= 28 ? a.f(e2.f735a) : 0, i8 >= 28 ? a.e(e2.f735a) : 0, i8 >= 28 ? a.c(e2.f735a) : 0);
                }
            }
        }
        return aVar;
    }

    public boolean t(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !q(i2, false).equals(h.a.f369e);
    }

    public void v(h.a aVar) {
        this.f752g = aVar;
    }
}
