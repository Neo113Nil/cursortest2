package a1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class J extends O {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f3525h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f3526i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f3527j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f3528k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f3529l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f3530c;

    /* renamed from: d, reason: collision with root package name */
    public V0.c[] f3531d;

    /* renamed from: e, reason: collision with root package name */
    public V0.c f3532e;

    /* renamed from: f, reason: collision with root package name */
    public Q f3533f;

    /* renamed from: g, reason: collision with root package name */
    public V0.c f3534g;

    public J(Q q2, WindowInsets windowInsets) {
        super(q2);
        this.f3532e = null;
        this.f3530c = windowInsets;
    }

    private V0.c s(int i3, boolean z3) {
        V0.c cVar = V0.c.f3348e;
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                cVar = V0.c.a(cVar, t(i4, z3));
            }
        }
        return cVar;
    }

    private V0.c u() {
        Q q2 = this.f3533f;
        return q2 != null ? q2.f3542a.i() : V0.c.f3348e;
    }

    private V0.c v(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f3525h) {
            x();
        }
        Method method = f3526i;
        if (method != null && f3527j != null && f3528k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f3528k.get(f3529l.get(invoke));
                if (rect != null) {
                    return V0.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
        }
        return null;
    }

    private static void x() {
        try {
            f3526i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f3527j = cls;
            f3528k = cls.getDeclaredField("mVisibleInsets");
            f3529l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f3528k.setAccessible(true);
            f3529l.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
        }
        f3525h = true;
    }

    @Override // a1.O
    public void d(View view) {
        V0.c v3 = v(view);
        if (v3 == null) {
            v3 = V0.c.f3348e;
        }
        y(v3);
    }

    @Override // a1.O
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f3534g, ((J) obj).f3534g);
        }
        return false;
    }

    @Override // a1.O
    public V0.c f(int i3) {
        return s(i3, false);
    }

    @Override // a1.O
    public V0.c g(int i3) {
        return s(i3, true);
    }

    @Override // a1.O
    public final V0.c k() {
        if (this.f3532e == null) {
            WindowInsets windowInsets = this.f3530c;
            this.f3532e = V0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f3532e;
    }

    @Override // a1.O
    public boolean n() {
        return this.f3530c.isRound();
    }

    @Override // a1.O
    public boolean o(int i3) {
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i3 & i4) != 0 && !w(i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // a1.O
    public void p(V0.c[] cVarArr) {
        this.f3531d = cVarArr;
    }

    @Override // a1.O
    public void q(Q q2) {
        this.f3533f = q2;
    }

    public V0.c t(int i3, boolean z3) {
        V0.c i4;
        int i5;
        if (i3 == 1) {
            return z3 ? V0.c.b(0, Math.max(u().f3350b, k().f3350b), 0, 0) : V0.c.b(0, k().f3350b, 0, 0);
        }
        if (i3 == 2) {
            if (z3) {
                V0.c u3 = u();
                V0.c i6 = i();
                return V0.c.b(Math.max(u3.f3349a, i6.f3349a), 0, Math.max(u3.f3351c, i6.f3351c), Math.max(u3.f3352d, i6.f3352d));
            }
            V0.c k3 = k();
            Q q2 = this.f3533f;
            i4 = q2 != null ? q2.f3542a.i() : null;
            int i7 = k3.f3352d;
            if (i4 != null) {
                i7 = Math.min(i7, i4.f3352d);
            }
            return V0.c.b(k3.f3349a, 0, k3.f3351c, i7);
        }
        V0.c cVar = V0.c.f3348e;
        if (i3 == 8) {
            V0.c[] cVarArr = this.f3531d;
            i4 = cVarArr != null ? cVarArr[M1.B.E(8)] : null;
            if (i4 != null) {
                return i4;
            }
            V0.c k4 = k();
            V0.c u4 = u();
            int i8 = k4.f3352d;
            if (i8 > u4.f3352d) {
                return V0.c.b(0, 0, 0, i8);
            }
            V0.c cVar2 = this.f3534g;
            return (cVar2 == null || cVar2.equals(cVar) || (i5 = this.f3534g.f3352d) <= u4.f3352d) ? cVar : V0.c.b(0, 0, 0, i5);
        }
        if (i3 == 16) {
            return j();
        }
        if (i3 == 32) {
            return h();
        }
        if (i3 == 64) {
            return l();
        }
        if (i3 != 128) {
            return cVar;
        }
        Q q3 = this.f3533f;
        C0167e e3 = q3 != null ? q3.f3542a.e() : e();
        if (e3 == null) {
            return cVar;
        }
        int i9 = Build.VERSION.SDK_INT;
        return V0.c.b(i9 >= 28 ? AbstractC0165c.d(e3.f3550a) : 0, i9 >= 28 ? AbstractC0165c.f(e3.f3550a) : 0, i9 >= 28 ? AbstractC0165c.e(e3.f3550a) : 0, i9 >= 28 ? AbstractC0165c.c(e3.f3550a) : 0);
    }

    public boolean w(int i3) {
        if (i3 != 1 && i3 != 2) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 8 && i3 != 128) {
                return true;
            }
        }
        return !t(i3, false).equals(V0.c.f3348e);
    }

    public void y(V0.c cVar) {
        this.f3534g = cVar;
    }
}
