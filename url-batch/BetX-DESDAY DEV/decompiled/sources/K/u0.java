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
public abstract class u0 extends z0 {
    public static boolean h = false;
    public static Method i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f503j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f504k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f505l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f506c;

    /* renamed from: d, reason: collision with root package name */
    public C.d[] f507d;

    /* renamed from: e, reason: collision with root package name */
    public C.d f508e;

    /* renamed from: f, reason: collision with root package name */
    public B0 f509f;

    /* renamed from: g, reason: collision with root package name */
    public C.d f510g;

    public u0(B0 b02, WindowInsets windowInsets) {
        super(b02);
        this.f508e = null;
        this.f506c = windowInsets;
    }

    private C.d r(int i2, boolean z2) {
        C.d dVar = C.d.f156e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                dVar = C.d.a(dVar, s(i3, z2));
            }
        }
        return dVar;
    }

    private C.d t() {
        B0 b02 = this.f509f;
        return b02 != null ? b02.f396a.h() : C.d.f156e;
    }

    private C.d u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = i;
        if (method != null && f503j != null && f504k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f504k.get(f505l.get(invoke));
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
            f503j = cls;
            f504k = cls.getDeclaredField("mVisibleInsets");
            f505l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f504k.setAccessible(true);
            f505l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        h = true;
    }

    @Override // K.z0
    public void d(View view) {
        C.d u2 = u(view);
        if (u2 == null) {
            u2 = C.d.f156e;
        }
        w(u2);
    }

    @Override // K.z0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f510g, ((u0) obj).f510g);
        }
        return false;
    }

    @Override // K.z0
    public C.d f(int i2) {
        return r(i2, false);
    }

    @Override // K.z0
    public final C.d j() {
        if (this.f508e == null) {
            WindowInsets windowInsets = this.f506c;
            this.f508e = C.d.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f508e;
    }

    @Override // K.z0
    public B0 l(int i2, int i3, int i4, int i5) {
        B0 g2 = B0.g(null, this.f506c);
        int i6 = Build.VERSION.SDK_INT;
        t0 s0Var = i6 >= 30 ? new s0(g2) : i6 >= 29 ? new r0(g2) : new q0(g2);
        s0Var.g(B0.e(j(), i2, i3, i4, i5));
        s0Var.e(B0.e(h(), i2, i3, i4, i5));
        return s0Var.b();
    }

    @Override // K.z0
    public boolean n() {
        return this.f506c.isRound();
    }

    @Override // K.z0
    public void o(C.d[] dVarArr) {
        this.f507d = dVarArr;
    }

    @Override // K.z0
    public void p(B0 b02) {
        this.f509f = b02;
    }

    public C.d s(int i2, boolean z2) {
        C.d h2;
        int i3;
        if (i2 == 1) {
            return z2 ? C.d.b(0, Math.max(t().f158b, j().f158b), 0, 0) : C.d.b(0, j().f158b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C.d t2 = t();
                C.d h3 = h();
                return C.d.b(Math.max(t2.f157a, h3.f157a), 0, Math.max(t2.f159c, h3.f159c), Math.max(t2.f160d, h3.f160d));
            }
            C.d j2 = j();
            B0 b02 = this.f509f;
            h2 = b02 != null ? b02.f396a.h() : null;
            int i4 = j2.f160d;
            if (h2 != null) {
                i4 = Math.min(i4, h2.f160d);
            }
            return C.d.b(j2.f157a, 0, j2.f159c, i4);
        }
        C.d dVar = C.d.f156e;
        if (i2 == 8) {
            C.d[] dVarArr = this.f507d;
            h2 = dVarArr != null ? dVarArr[q1.d.H(8)] : null;
            if (h2 != null) {
                return h2;
            }
            C.d j3 = j();
            C.d t3 = t();
            int i5 = j3.f160d;
            if (i5 > t3.f160d) {
                return C.d.b(0, 0, 0, i5);
            }
            C.d dVar2 = this.f510g;
            return (dVar2 == null || dVar2.equals(dVar) || (i3 = this.f510g.f160d) <= t3.f160d) ? dVar : C.d.b(0, 0, 0, i3);
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
        B0 b03 = this.f509f;
        C0014j e2 = b03 != null ? b03.f396a.e() : e();
        if (e2 == null) {
            return dVar;
        }
        int i6 = Build.VERSION.SDK_INT;
        return C.d.b(i6 >= 28 ? AbstractC0013i.d(e2.f457a) : 0, i6 >= 28 ? AbstractC0013i.f(e2.f457a) : 0, i6 >= 28 ? AbstractC0013i.e(e2.f457a) : 0, i6 >= 28 ? AbstractC0013i.c(e2.f457a) : 0);
    }

    public void w(C.d dVar) {
        this.f510g = dVar;
    }
}
