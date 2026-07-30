package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class r73 extends z73 {
    public static boolean m = false;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public z21[] d;
    public z21 e;
    public c83 f;
    public z21 g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public r73(c83 c83Var, WindowInsets windowInsets) {
        super(c83Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private yb0 B(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.s()) {
            return yb0.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        xb2 e = t8.e(display, 0);
        xb2 e2 = t8.e(display, 1);
        xb2 e3 = t8.e(display, 2);
        xb2 e4 = t8.e(display, 3);
        return yb0.a(point.x, point.y, false, e != null ? e.b : 0, e2 != null ? e2.b : 0, e3 != null ? e3.b : 0, e4 != null ? e4.b : 0);
    }

    private static List<Rect> C(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[gk2.d(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] D(z21 z21Var) {
        ArrayList arrayList = new ArrayList();
        int i = z21Var.a;
        int i2 = z21Var.d;
        int i3 = z21Var.c;
        int i4 = z21Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, z21Var.a, this.i));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i4));
        }
        if (i3 != 0) {
            int i5 = this.j;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.i));
        }
        if (i2 != 0) {
            int i6 = this.i;
            arrayList.add(new Rect(0, i6 - i2, this.j, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private z21 E(int i, boolean z) {
        z21 z21Var = z21.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                z21Var = z21.a(z21Var, F(i2, z));
            }
        }
        return z21Var;
    }

    private z21 G() {
        c83 c83Var = this.f;
        return c83Var != null ? c83Var.a.k() : z21.e;
    }

    private z21 H(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            ch2.h("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!m) {
            J();
        }
        Method method = n;
        if (method != null && o != null && p != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) p.get(q.get(invoke));
                if (rect != null) {
                    return z21.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void J() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            o = cls;
            p = cls.getDeclaredField("mVisibleInsets");
            q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            p.setAccessible(true);
            q.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        m = true;
    }

    public static boolean L(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.z73
    public void A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    public z21 F(int i, boolean z) {
        z21 k;
        int i2;
        z21 z21Var = z21.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    z21[] z21VarArr = this.d;
                    k = z21VarArr != null ? z21VarArr[gk2.d(8)] : null;
                    if (k != null) {
                        return k;
                    }
                    z21 m2 = m();
                    z21 G = G();
                    int i3 = m2.d;
                    if (i3 > G.d) {
                        return z21.b(0, 0, 0, i3);
                    }
                    z21 z21Var2 = this.g;
                    if (z21Var2 != null && !z21Var2.equals(z21Var) && (i2 = this.g.d) > G.d) {
                        return z21.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return l();
                    }
                    if (i == 32) {
                        return j();
                    }
                    if (i == 64) {
                        return n();
                    }
                    if (i == 128) {
                        c83 c83Var = this.f;
                        wb0 g = c83Var != null ? c83Var.a.g() : g();
                        if (g != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return z21.b(i4 >= 28 ? km.j(g.a) : 0, i4 >= 28 ? km.l(g.a) : 0, i4 >= 28 ? km.k(g.a) : 0, i4 >= 28 ? km.i(g.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    z21 G2 = G();
                    z21 k2 = k();
                    return z21.b(Math.max(G2.a, k2.a), 0, Math.max(G2.c, k2.c), Math.max(G2.d, k2.d));
                }
                if ((this.h & 2) == 0) {
                    z21 m3 = m();
                    c83 c83Var2 = this.f;
                    k = c83Var2 != null ? c83Var2.a.k() : null;
                    int i5 = m3.d;
                    if (k != null) {
                        i5 = Math.min(i5, k.d);
                    }
                    return z21.b(m3.a, 0, m3.c, i5);
                }
            }
        } else {
            if (z) {
                return z21.b(0, Math.max(G().b, m().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return z21.b(0, m().b, 0, 0);
            }
        }
        return z21Var;
    }

    public boolean I(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !F(i, false).equals(z21.e);
    }

    public void K(z21 z21Var) {
        this.g = z21Var;
    }

    @Override // defpackage.z73
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        z21 H = H(view);
        if (H == null) {
            H = z21.e;
        }
        K(H);
    }

    @Override // defpackage.z73
    public List<Rect> e(int i) {
        return C(this.k, i);
    }

    @Override // defpackage.z73
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        r73 r73Var = (r73) obj;
        return Objects.equals(this.g, r73Var.g) && L(this.h, r73Var.h);
    }

    @Override // defpackage.z73
    public List<Rect> f(int i) {
        return C(this.l, i);
    }

    @Override // defpackage.z73
    public z21 h(int i) {
        return E(i, false);
    }

    @Override // defpackage.z73
    public z21 i(int i) {
        return E(i, true);
    }

    @Override // defpackage.z73
    public final z21 m() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = z21.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.z73
    public void o(View view) {
        B(view);
    }

    @Override // defpackage.z73
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int d = gk2.d(i);
            this.k[d] = D(h(i));
            if (i != 8) {
                this.l[d] = D(i(i));
            }
        }
    }

    @Override // defpackage.z73
    public c83 q(int i, int i2, int i3, int i4) {
        c83 c = c83.c(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        q73 p73Var = i5 >= 36 ? new p73(c) : i5 >= 35 ? new o73(c) : i5 >= 34 ? new n73(c) : i5 >= 31 ? new m73(c) : i5 >= 30 ? new l73(c) : i5 >= 29 ? new k73(c) : new j73(c);
        p73Var.h(c83.a(m(), i, i2, i3, i4));
        p73Var.f(c83.a(k(), i, i2, i3, i4));
        return p73Var.b();
    }

    @Override // defpackage.z73
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.z73
    public boolean t(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !I(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.z73
    public void v(z21[] z21VarArr) {
        this.d = z21VarArr;
    }

    @Override // defpackage.z73
    public void w(c83 c83Var) {
        this.f = c83Var;
    }

    @Override // defpackage.z73
    public void y(int i) {
        this.h = i;
    }

    @Override // defpackage.z73
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.z73
    public void u(yb0 yb0Var) {
    }
}
