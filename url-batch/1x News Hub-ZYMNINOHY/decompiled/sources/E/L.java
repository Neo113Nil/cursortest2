package E;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class L extends T {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f253i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f254j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f255k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f256l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f257m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f258c;

    /* renamed from: d, reason: collision with root package name */
    public x.b[] f259d;

    /* renamed from: e, reason: collision with root package name */
    public x.b f260e;
    public W f;

    /* renamed from: g, reason: collision with root package name */
    public x.b f261g;

    /* renamed from: h, reason: collision with root package name */
    public int f262h;

    public L(W w3, WindowInsets windowInsets) {
        super(w3);
        this.f260e = null;
        this.f258c = windowInsets;
    }

    private x.b s(int i3, boolean z) {
        x.b bVar = x.b.f10693e;
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                bVar = x.b.a(bVar, t(i4, z));
            }
        }
        return bVar;
    }

    private x.b u() {
        W w3 = this.f;
        return w3 != null ? w3.f270a.h() : x.b.f10693e;
    }

    private x.b v(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f253i) {
            x();
        }
        Method method = f254j;
        if (method != null && f255k != null && f256l != null) {
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f256l.get(f257m.get(invoke));
                if (rect != null) {
                    return x.b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
        }
        return null;
    }

    private static void x() {
        try {
            f254j = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f255k = cls;
            f256l = cls.getDeclaredField("mVisibleInsets");
            f257m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f256l.setAccessible(true);
            f257m.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
        }
        f253i = true;
    }

    public static boolean z(int i3, int i4) {
        return (i3 & 6) == (i4 & 6);
    }

    @Override // E.T
    public void d(View view) {
        x.b v = v(view);
        if (v == null) {
            v = x.b.f10693e;
        }
        y(v);
    }

    @Override // E.T
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        L l3 = (L) obj;
        return Objects.equals(this.f261g, l3.f261g) && z(this.f262h, l3.f262h);
    }

    @Override // E.T
    public x.b f(int i3) {
        return s(i3, false);
    }

    @Override // E.T
    public final x.b j() {
        if (this.f260e == null) {
            WindowInsets windowInsets = this.f258c;
            this.f260e = x.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f260e;
    }

    @Override // E.T
    public boolean m() {
        return this.f258c.isRound();
    }

    @Override // E.T
    public boolean n(int i3) {
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i3 & i4) != 0 && !w(i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // E.T
    public void o(x.b[] bVarArr) {
        this.f259d = bVarArr;
    }

    @Override // E.T
    public void p(W w3) {
        this.f = w3;
    }

    @Override // E.T
    public void r(int i3) {
        this.f262h = i3;
    }

    public x.b t(int i3, boolean z) {
        x.b h3;
        int i4;
        x.b bVar = x.b.f10693e;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 8) {
                    x.b[] bVarArr = this.f259d;
                    h3 = bVarArr != null ? bVarArr[S0.a.u(8)] : null;
                    if (h3 != null) {
                        return h3;
                    }
                    x.b j3 = j();
                    x.b u3 = u();
                    int i5 = j3.f10697d;
                    if (i5 > u3.f10697d) {
                        return x.b.b(0, 0, 0, i5);
                    }
                    x.b bVar2 = this.f261g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i4 = this.f261g.f10697d) > u3.f10697d) {
                        return x.b.b(0, 0, 0, i4);
                    }
                } else {
                    if (i3 == 16) {
                        return i();
                    }
                    if (i3 == 32) {
                        return g();
                    }
                    if (i3 == 64) {
                        return k();
                    }
                    if (i3 == 128) {
                        W w3 = this.f;
                        C0004e e3 = w3 != null ? w3.f270a.e() : e();
                        if (e3 != null) {
                            int i6 = Build.VERSION.SDK_INT;
                            return x.b.b(i6 >= 28 ? AbstractC0003d.g(e3.f284a) : 0, i6 >= 28 ? AbstractC0003d.i(e3.f284a) : 0, i6 >= 28 ? AbstractC0003d.h(e3.f284a) : 0, i6 >= 28 ? AbstractC0003d.f(e3.f284a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    x.b u4 = u();
                    x.b h4 = h();
                    return x.b.b(Math.max(u4.f10694a, h4.f10694a), 0, Math.max(u4.f10696c, h4.f10696c), Math.max(u4.f10697d, h4.f10697d));
                }
                if ((this.f262h & 2) == 0) {
                    x.b j4 = j();
                    W w4 = this.f;
                    h3 = w4 != null ? w4.f270a.h() : null;
                    int i7 = j4.f10697d;
                    if (h3 != null) {
                        i7 = Math.min(i7, h3.f10697d);
                    }
                    return x.b.b(j4.f10694a, 0, j4.f10696c, i7);
                }
            }
        } else {
            if (z) {
                return x.b.b(0, Math.max(u().f10695b, j().f10695b), 0, 0);
            }
            if ((this.f262h & 4) == 0) {
                return x.b.b(0, j().f10695b, 0, 0);
            }
        }
        return bVar;
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
        return !t(i3, false).equals(x.b.f10693e);
    }

    public void y(x.b bVar) {
        this.f261g = bVar;
    }
}
