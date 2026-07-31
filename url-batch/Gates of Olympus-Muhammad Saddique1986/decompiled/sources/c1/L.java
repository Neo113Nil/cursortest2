package c1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import h2.AbstractC0508a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class L extends Q {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f5571h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f5572i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f5573j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f5574k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f5575l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f5576c;

    /* renamed from: d, reason: collision with root package name */
    public X0.c[] f5577d;

    /* renamed from: e, reason: collision with root package name */
    public X0.c f5578e;

    /* renamed from: f, reason: collision with root package name */
    public U f5579f;

    /* renamed from: g, reason: collision with root package name */
    public X0.c f5580g;

    public L(U u3, WindowInsets windowInsets) {
        super(u3);
        this.f5578e = null;
        this.f5576c = windowInsets;
    }

    private X0.c s(int i3, boolean z3) {
        X0.c cVar = X0.c.f4622e;
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                cVar = X0.c.a(cVar, t(i4, z3));
            }
        }
        return cVar;
    }

    private X0.c u() {
        U u3 = this.f5579f;
        return u3 != null ? u3.f5589a.i() : X0.c.f4622e;
    }

    private X0.c v(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f5571h) {
            x();
        }
        Method method = f5572i;
        if (method != null && f5573j != null && f5574k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f5574k.get(f5575l.get(invoke));
                if (rect != null) {
                    return X0.c.b(rect.left, rect.top, rect.right, rect.bottom);
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
            f5572i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f5573j = cls;
            f5574k = cls.getDeclaredField("mVisibleInsets");
            f5575l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f5574k.setAccessible(true);
            f5575l.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
        }
        f5571h = true;
    }

    @Override // c1.Q
    public void d(View view) {
        X0.c v3 = v(view);
        if (v3 == null) {
            v3 = X0.c.f4622e;
        }
        y(v3);
    }

    @Override // c1.Q
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f5580g, ((L) obj).f5580g);
        }
        return false;
    }

    @Override // c1.Q
    public X0.c f(int i3) {
        return s(i3, false);
    }

    @Override // c1.Q
    public X0.c g(int i3) {
        return s(i3, true);
    }

    @Override // c1.Q
    public final X0.c k() {
        if (this.f5578e == null) {
            WindowInsets windowInsets = this.f5576c;
            this.f5578e = X0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f5578e;
    }

    @Override // c1.Q
    public boolean n() {
        return this.f5576c.isRound();
    }

    @Override // c1.Q
    public boolean o(int i3) {
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i3 & i4) != 0 && !w(i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // c1.Q
    public void p(X0.c[] cVarArr) {
        this.f5577d = cVarArr;
    }

    @Override // c1.Q
    public void q(U u3) {
        this.f5579f = u3;
    }

    public X0.c t(int i3, boolean z3) {
        X0.c i4;
        int i5;
        if (i3 == 1) {
            return z3 ? X0.c.b(0, Math.max(u().f4624b, k().f4624b), 0, 0) : X0.c.b(0, k().f4624b, 0, 0);
        }
        if (i3 == 2) {
            if (z3) {
                X0.c u3 = u();
                X0.c i6 = i();
                return X0.c.b(Math.max(u3.f4623a, i6.f4623a), 0, Math.max(u3.f4625c, i6.f4625c), Math.max(u3.f4626d, i6.f4626d));
            }
            X0.c k3 = k();
            U u4 = this.f5579f;
            i4 = u4 != null ? u4.f5589a.i() : null;
            int i7 = k3.f4626d;
            if (i4 != null) {
                i7 = Math.min(i7, i4.f4626d);
            }
            return X0.c.b(k3.f4623a, 0, k3.f4625c, i7);
        }
        X0.c cVar = X0.c.f4622e;
        if (i3 == 8) {
            X0.c[] cVarArr = this.f5577d;
            i4 = cVarArr != null ? cVarArr[AbstractC0508a.H(8)] : null;
            if (i4 != null) {
                return i4;
            }
            X0.c k4 = k();
            X0.c u5 = u();
            int i8 = k4.f4626d;
            if (i8 > u5.f4626d) {
                return X0.c.b(0, 0, 0, i8);
            }
            X0.c cVar2 = this.f5580g;
            return (cVar2 == null || cVar2.equals(cVar) || (i5 = this.f5580g.f4626d) <= u5.f4626d) ? cVar : X0.c.b(0, 0, 0, i5);
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
        U u6 = this.f5579f;
        C0381e e3 = u6 != null ? u6.f5589a.e() : e();
        if (e3 == null) {
            return cVar;
        }
        int i9 = Build.VERSION.SDK_INT;
        return X0.c.b(i9 >= 28 ? AbstractC0379c.d(e3.f5597a) : 0, i9 >= 28 ? AbstractC0379c.f(e3.f5597a) : 0, i9 >= 28 ? AbstractC0379c.e(e3.f5597a) : 0, i9 >= 28 ? AbstractC0379c.c(e3.f5597a) : 0);
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
        return !t(i3, false).equals(X0.c.f4622e);
    }

    public void y(X0.c cVar) {
        this.f5580g = cVar;
    }
}
