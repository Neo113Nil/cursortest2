package l;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import h.C0037a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class i extends o {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f960h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f961i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f962j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f963k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f964l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f965c;

    /* renamed from: d, reason: collision with root package name */
    public C0037a[] f966d;

    /* renamed from: e, reason: collision with root package name */
    public C0037a f967e;

    /* renamed from: f, reason: collision with root package name */
    public q f968f;

    /* renamed from: g, reason: collision with root package name */
    public C0037a f969g;

    public i(q qVar, WindowInsets windowInsets) {
        super(qVar);
        this.f967e = null;
        this.f965c = windowInsets;
    }

    private C0037a r() {
        q qVar = this.f968f;
        return qVar != null ? qVar.f977a.g() : C0037a.f585e;
    }

    private C0037a s(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f960h) {
            u();
        }
        Method method = f961i;
        if (method != null && f962j != null && f963k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f963k.get(f964l.get(invoke));
                if (rect != null) {
                    return C0037a.a(rect.left, rect.top, rect.right, rect.bottom);
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
            f961i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f962j = cls;
            f963k = cls.getDeclaredField("mVisibleInsets");
            f964l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f963k.setAccessible(true);
            f964l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f960h = true;
    }

    @Override // l.o
    public void d(View view) {
        C0037a s2 = s(view);
        if (s2 == null) {
            s2 = C0037a.f585e;
        }
        v(s2);
    }

    @Override // l.o
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f969g, ((i) obj).f969g);
        }
        return false;
    }

    @Override // l.o
    public final C0037a i() {
        if (this.f967e == null) {
            WindowInsets windowInsets = this.f965c;
            this.f967e = C0037a.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f967e;
    }

    @Override // l.o
    public boolean l() {
        return this.f965c.isRound();
    }

    @Override // l.o
    public boolean m(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !t(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // l.o
    public void n(C0037a[] c0037aArr) {
        this.f966d = c0037aArr;
    }

    @Override // l.o
    public void o(q qVar) {
        this.f968f = qVar;
    }

    public C0037a q(int i2, boolean z) {
        C0037a g2;
        int i3;
        if (i2 == 1) {
            return z ? C0037a.a(0, Math.max(r().f587b, i().f587b), 0, 0) : C0037a.a(0, i().f587b, 0, 0);
        }
        if (i2 == 2) {
            if (z) {
                C0037a r2 = r();
                C0037a g3 = g();
                return C0037a.a(Math.max(r2.f586a, g3.f586a), 0, Math.max(r2.f588c, g3.f588c), Math.max(r2.f589d, g3.f589d));
            }
            C0037a i4 = i();
            q qVar = this.f968f;
            g2 = qVar != null ? qVar.f977a.g() : null;
            int i5 = i4.f589d;
            if (g2 != null) {
                i5 = Math.min(i5, g2.f589d);
            }
            return C0037a.a(i4.f586a, 0, i4.f588c, i5);
        }
        C0037a c0037a = C0037a.f585e;
        if (i2 == 8) {
            C0037a[] c0037aArr = this.f966d;
            g2 = c0037aArr != null ? c0037aArr[3] : null;
            if (g2 != null) {
                return g2;
            }
            C0037a i6 = i();
            C0037a r3 = r();
            int i7 = i6.f589d;
            if (i7 > r3.f589d) {
                return C0037a.a(0, 0, 0, i7);
            }
            C0037a c0037a2 = this.f969g;
            return (c0037a2 == null || c0037a2.equals(c0037a) || (i3 = this.f969g.f589d) <= r3.f589d) ? c0037a : C0037a.a(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return h();
        }
        if (i2 == 32) {
            return f();
        }
        if (i2 == 64) {
            return j();
        }
        if (i2 != 128) {
            return c0037a;
        }
        q qVar2 = this.f968f;
        b e2 = qVar2 != null ? qVar2.f977a.e() : e();
        if (e2 == null) {
            return c0037a;
        }
        int i8 = Build.VERSION.SDK_INT;
        return C0037a.a(i8 >= 28 ? a.d(e2.f952a) : 0, i8 >= 28 ? a.f(e2.f952a) : 0, i8 >= 28 ? a.e(e2.f952a) : 0, i8 >= 28 ? a.c(e2.f952a) : 0);
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
        return !q(i2, false).equals(C0037a.f585e);
    }

    public void v(C0037a c0037a) {
        this.f969g = c0037a;
    }
}
