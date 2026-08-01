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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class ne0 extends ve0 {
    public static boolean m = false;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public er[] d;
    public er e;
    public ye0 f;
    public er g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public ne0(ye0 ye0Var, WindowInsets windowInsets) {
        super(ye0Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private ci A(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.s()) {
            return ci.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        u30 q2 = b9.q(display, 0);
        u30 q3 = b9.q(display, 1);
        u30 q4 = b9.q(display, 2);
        u30 q5 = b9.q(display, 3);
        return ci.a(point.x, point.y, false, q2 != null ? q2.b : 0, q3 != null ? q3.b : 0, q4 != null ? q4.b : 0, q5 != null ? q5.b : 0);
    }

    private static List<Rect> B(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[kr.G(i2)]) != null) {
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

    private Rect[] C(er erVar) {
        ArrayList arrayList = new ArrayList();
        int i = erVar.a;
        int i2 = erVar.d;
        int i3 = erVar.c;
        int i4 = erVar.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, erVar.a, this.i));
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

    private er D(int i, boolean z) {
        er erVar = er.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                erVar = er.a(erVar, E(i2, z));
            }
        }
        return erVar;
    }

    private er F() {
        ye0 ye0Var = this.f;
        return ye0Var != null ? ye0Var.a.k() : er.e;
    }

    private er G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            g9.u("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
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
                    return er.c(rect.left, rect.top, rect.right, rect.bottom);
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

    public er E(int i, boolean z) {
        er k;
        int i2;
        er erVar = er.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    er[] erVarArr = this.d;
                    k = erVarArr != null ? erVarArr[kr.G(8)] : null;
                    if (k != null) {
                        return k;
                    }
                    er m2 = m();
                    er F = F();
                    int i3 = m2.d;
                    if (i3 > F.d) {
                        return er.c(0, 0, 0, i3);
                    }
                    er erVar2 = this.g;
                    if (erVar2 != null && !erVar2.equals(erVar) && (i2 = this.g.d) > F.d) {
                        return er.c(0, 0, 0, i2);
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
                        ye0 ye0Var = this.f;
                        ai g = ye0Var != null ? ye0Var.a.g() : g();
                        if (g != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return er.c(i4 >= 28 ? wg.e(g.a) : 0, i4 >= 28 ? wg.g(g.a) : 0, i4 >= 28 ? wg.f(g.a) : 0, i4 >= 28 ? wg.d(g.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    er F2 = F();
                    er k2 = k();
                    return er.c(Math.max(F2.a, k2.a), 0, Math.max(F2.c, k2.c), Math.max(F2.d, k2.d));
                }
                if ((this.h & 2) == 0) {
                    er m3 = m();
                    ye0 ye0Var2 = this.f;
                    k = ye0Var2 != null ? ye0Var2.a.k() : null;
                    int i5 = m3.d;
                    if (k != null) {
                        i5 = Math.min(i5, k.d);
                    }
                    return er.c(m3.a, 0, m3.c, i5);
                }
            }
        } else {
            if (z) {
                return er.c(0, Math.max(F().b, m().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return er.c(0, m().b, 0, 0);
            }
        }
        return erVar;
    }

    public void I(er erVar) {
        this.g = erVar;
    }

    @Override // defpackage.ve0
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        er G = G(view);
        if (G == null) {
            G = er.e;
        }
        I(G);
    }

    @Override // defpackage.ve0
    public List<Rect> e(int i) {
        return B(this.k, i);
    }

    @Override // defpackage.ve0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        ne0 ne0Var = (ne0) obj;
        return Objects.equals(this.g, ne0Var.g) && J(this.h, ne0Var.h);
    }

    @Override // defpackage.ve0
    public List<Rect> f(int i) {
        return B(this.l, i);
    }

    @Override // defpackage.ve0
    public er h(int i) {
        return D(i, false);
    }

    @Override // defpackage.ve0
    public er i(int i) {
        return D(i, true);
    }

    @Override // defpackage.ve0
    public final er m() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = er.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.ve0
    public void o(View view) {
        A(view);
    }

    @Override // defpackage.ve0
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int G = kr.G(i);
            this.k[G] = C(h(i));
            if (i != 8) {
                this.l[G] = C(i(i));
            }
        }
    }

    @Override // defpackage.ve0
    public ye0 q(int i, int i2, int i3, int i4) {
        ye0 g = ye0.g(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        me0 le0Var = i5 >= 36 ? new le0(g) : i5 >= 35 ? new ke0(g) : i5 >= 34 ? new je0(g) : i5 >= 31 ? new ie0(g) : i5 >= 30 ? new he0(g) : i5 >= 29 ? new ge0(g) : new fe0(g);
        le0Var.h(ye0.e(m(), i, i2, i3, i4));
        le0Var.f(ye0.e(k(), i, i2, i3, i4));
        return le0Var.b();
    }

    @Override // defpackage.ve0
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.ve0
    public void u(er[] erVarArr) {
        this.d = erVarArr;
    }

    @Override // defpackage.ve0
    public void v(ye0 ye0Var) {
        this.f = ye0Var;
    }

    @Override // defpackage.ve0
    public void x(int i) {
        this.h = i;
    }

    @Override // defpackage.ve0
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.ve0
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.ve0
    public void t(ci ciVar) {
    }
}
