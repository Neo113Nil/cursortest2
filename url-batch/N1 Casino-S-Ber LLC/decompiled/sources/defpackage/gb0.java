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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class gb0 extends ob0 {
    public static boolean m = false;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public to[] d;
    public to e;
    public rb0 f;
    public to g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public gb0(rb0 rb0Var, WindowInsets windowInsets) {
        super(rb0Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private cg A(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.s()) {
            return cg.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        p00 G = o8.G(display, 0);
        p00 G2 = o8.G(display, 1);
        p00 G3 = o8.G(display, 2);
        p00 G4 = o8.G(display, 3);
        return cg.a(point.x, point.y, false, G != null ? G.b : 0, G2 != null ? G2.b : 0, G3 != null ? G3.b : 0, G4 != null ? G4.b : 0);
    }

    private static List<Rect> B(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[o90.d(i2)]) != null) {
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

    private Rect[] C(to toVar) {
        ArrayList arrayList = new ArrayList();
        int i = toVar.a;
        int i2 = toVar.d;
        int i3 = toVar.c;
        int i4 = toVar.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, toVar.a, this.i));
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

    private to D(int i, boolean z) {
        to toVar = to.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                toVar = to.a(toVar, E(i2, z));
            }
        }
        return toVar;
    }

    private to F() {
        rb0 rb0Var = this.f;
        return rb0Var != null ? rb0Var.a.k() : to.e;
    }

    private to G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            t8.w("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!m) {
            H();
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
                    return to.c(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void H() {
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

    public static boolean J(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    public to E(int i, boolean z) {
        to k;
        int i2;
        to toVar = to.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    to[] toVarArr = this.d;
                    k = toVarArr != null ? toVarArr[o90.d(8)] : null;
                    if (k != null) {
                        return k;
                    }
                    to m2 = m();
                    to F = F();
                    int i3 = m2.d;
                    if (i3 > F.d) {
                        return to.c(0, 0, 0, i3);
                    }
                    to toVar2 = this.g;
                    if (toVar2 != null && !toVar2.equals(toVar) && (i2 = this.g.d) > F.d) {
                        return to.c(0, 0, 0, i2);
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
                        rb0 rb0Var = this.f;
                        ag g = rb0Var != null ? rb0Var.a.g() : g();
                        if (g != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return to.c(i4 >= 28 ? zf.d(g.a) : 0, i4 >= 28 ? zf.f(g.a) : 0, i4 >= 28 ? zf.e(g.a) : 0, i4 >= 28 ? zf.c(g.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    to F2 = F();
                    to k2 = k();
                    return to.c(Math.max(F2.a, k2.a), 0, Math.max(F2.c, k2.c), Math.max(F2.d, k2.d));
                }
                if ((this.h & 2) == 0) {
                    to m3 = m();
                    rb0 rb0Var2 = this.f;
                    k = rb0Var2 != null ? rb0Var2.a.k() : null;
                    int i5 = m3.d;
                    if (k != null) {
                        i5 = Math.min(i5, k.d);
                    }
                    return to.c(m3.a, 0, m3.c, i5);
                }
            }
        } else {
            if (z) {
                return to.c(0, Math.max(F().b, m().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return to.c(0, m().b, 0, 0);
            }
        }
        return toVar;
    }

    public void I(to toVar) {
        this.g = toVar;
    }

    @Override // defpackage.ob0
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        to G = G(view);
        if (G == null) {
            G = to.e;
        }
        I(G);
    }

    @Override // defpackage.ob0
    public List<Rect> e(int i) {
        return B(this.k, i);
    }

    @Override // defpackage.ob0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        gb0 gb0Var = (gb0) obj;
        return Objects.equals(this.g, gb0Var.g) && J(this.h, gb0Var.h);
    }

    @Override // defpackage.ob0
    public List<Rect> f(int i) {
        return B(this.l, i);
    }

    @Override // defpackage.ob0
    public to h(int i) {
        return D(i, false);
    }

    @Override // defpackage.ob0
    public to i(int i) {
        return D(i, true);
    }

    @Override // defpackage.ob0
    public final to m() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = to.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.ob0
    public void o(View view) {
        A(view);
    }

    @Override // defpackage.ob0
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int d = o90.d(i);
            this.k[d] = C(h(i));
            if (i != 8) {
                this.l[d] = C(i(i));
            }
        }
    }

    @Override // defpackage.ob0
    public rb0 q(int i, int i2, int i3, int i4) {
        rb0 g = rb0.g(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        fb0 eb0Var = i5 >= 36 ? new eb0(g) : i5 >= 35 ? new db0(g) : i5 >= 34 ? new cb0(g) : i5 >= 31 ? new bb0(g) : i5 >= 30 ? new ab0(g) : i5 >= 29 ? new za0(g) : new ya0(g);
        eb0Var.h(rb0.e(m(), i, i2, i3, i4));
        eb0Var.f(rb0.e(k(), i, i2, i3, i4));
        return eb0Var.b();
    }

    @Override // defpackage.ob0
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.ob0
    public void u(to[] toVarArr) {
        this.d = toVarArr;
    }

    @Override // defpackage.ob0
    public void v(rb0 rb0Var) {
        this.f = rb0Var;
    }

    @Override // defpackage.ob0
    public void x(int i) {
        this.h = i;
    }

    @Override // defpackage.ob0
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.ob0
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.ob0
    public void t(cg cgVar) {
    }
}
