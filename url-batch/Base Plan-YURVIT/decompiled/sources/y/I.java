package y;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import r.C0224c;

/* loaded from: classes.dex */
public abstract class I extends O {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f3113h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f3114i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f3115j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f3116k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f3117l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f3118c;

    /* renamed from: d, reason: collision with root package name */
    public C0224c[] f3119d;

    /* renamed from: e, reason: collision with root package name */
    public C0224c f3120e;

    /* renamed from: f, reason: collision with root package name */
    public Q f3121f;

    /* renamed from: g, reason: collision with root package name */
    public C0224c f3122g;

    public I(Q q2, WindowInsets windowInsets) {
        super(q2);
        this.f3120e = null;
        this.f3118c = windowInsets;
    }

    private C0224c r() {
        Q q2 = this.f3121f;
        return q2 != null ? q2.f3130a.g() : C0224c.f2960e;
    }

    private C0224c s(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f3113h) {
            u();
        }
        Method method = f3114i;
        if (method != null && f3115j != null && f3116k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f3116k.get(f3117l.get(invoke));
                if (rect != null) {
                    return C0224c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    private static void u() {
        try {
            f3114i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f3115j = cls;
            f3116k = cls.getDeclaredField("mVisibleInsets");
            f3117l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f3116k.setAccessible(true);
            f3117l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f3113h = true;
    }

    @Override // y.O
    public void d(View view) {
        C0224c s2 = s(view);
        if (s2 == null) {
            s2 = C0224c.f2960e;
        }
        v(s2);
    }

    @Override // y.O
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f3122g, ((I) obj).f3122g);
        }
        return false;
    }

    @Override // y.O
    public final C0224c i() {
        if (this.f3120e == null) {
            WindowInsets windowInsets = this.f3118c;
            this.f3120e = C0224c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f3120e;
    }

    @Override // y.O
    public boolean l() {
        return this.f3118c.isRound();
    }

    @Override // y.O
    public boolean m(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !t(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // y.O
    public void n(C0224c[] c0224cArr) {
        this.f3119d = c0224cArr;
    }

    @Override // y.O
    public void o(Q q2) {
        this.f3121f = q2;
    }

    public C0224c q(int i2, boolean z2) {
        C0224c g2;
        int i3;
        if (i2 == 1) {
            return z2 ? C0224c.a(0, Math.max(r().f2962b, i().f2962b), 0, 0) : C0224c.a(0, i().f2962b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C0224c r2 = r();
                C0224c g3 = g();
                return C0224c.a(Math.max(r2.f2961a, g3.f2961a), 0, Math.max(r2.f2963c, g3.f2963c), Math.max(r2.f2964d, g3.f2964d));
            }
            C0224c i4 = i();
            Q q2 = this.f3121f;
            g2 = q2 != null ? q2.f3130a.g() : null;
            int i5 = i4.f2964d;
            if (g2 != null) {
                i5 = Math.min(i5, g2.f2964d);
            }
            return C0224c.a(i4.f2961a, 0, i4.f2963c, i5);
        }
        C0224c c0224c = C0224c.f2960e;
        if (i2 == 8) {
            C0224c[] c0224cArr = this.f3119d;
            g2 = c0224cArr != null ? c0224cArr[3] : null;
            if (g2 != null) {
                return g2;
            }
            C0224c i6 = i();
            C0224c r3 = r();
            int i7 = i6.f2964d;
            if (i7 > r3.f2964d) {
                return C0224c.a(0, 0, 0, i7);
            }
            C0224c c0224c2 = this.f3122g;
            if (c0224c2 != null && !c0224c2.equals(c0224c) && (i3 = this.f3122g.f2964d) > r3.f2964d) {
                return C0224c.a(0, 0, 0, i3);
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
                Q q3 = this.f3121f;
                C0261e e2 = q3 != null ? q3.f3130a.e() : e();
                if (e2 != null) {
                    int i8 = Build.VERSION.SDK_INT;
                    return C0224c.a(i8 >= 28 ? AbstractC0260d.d(e2.f3146a) : 0, i8 >= 28 ? AbstractC0260d.f(e2.f3146a) : 0, i8 >= 28 ? AbstractC0260d.e(e2.f3146a) : 0, i8 >= 28 ? AbstractC0260d.c(e2.f3146a) : 0);
                }
            }
        }
        return c0224c;
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
        return !q(i2, false).equals(C0224c.f2960e);
    }

    public void v(C0224c c0224c) {
        this.f3122g = c0224c;
    }
}
