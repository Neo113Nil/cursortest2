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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class so0 extends ap0 {
    public static boolean m = false;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public fv[] d;
    public fv e;
    public dp0 f;
    public fv g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public so0(dp0 dp0Var, WindowInsets windowInsets) {
        super(dp0Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private lk A(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.s()) {
            return lk.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        wa0 q2 = n9.q(display, 0);
        wa0 q3 = n9.q(display, 1);
        wa0 q4 = n9.q(display, 2);
        wa0 q5 = n9.q(display, 3);
        return lk.a(point.x, point.y, false, q2 != null ? q2.b : 0, q3 != null ? q3.b : 0, q4 != null ? q4.b : 0, q5 != null ? q5.b : 0);
    }

    private static List<Rect> B(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[zb0.i(i2)]) != null) {
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

    private Rect[] C(fv fvVar) {
        ArrayList arrayList = new ArrayList();
        int i = fvVar.a;
        int i2 = fvVar.d;
        int i3 = fvVar.c;
        int i4 = fvVar.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, fvVar.a, this.i));
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

    private fv D(int i, boolean z) {
        fv fvVar = fv.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                fvVar = fv.a(fvVar, E(i2, z));
            }
        }
        return fvVar;
    }

    private fv F() {
        dp0 dp0Var = this.f;
        return dp0Var != null ? dp0Var.a.k() : fv.e;
    }

    private fv G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            s9.y("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
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
                    return fv.c(rect.left, rect.top, rect.right, rect.bottom);
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

    public fv E(int i, boolean z) {
        fv k;
        int i2;
        fv fvVar = fv.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    fv[] fvVarArr = this.d;
                    k = fvVarArr != null ? fvVarArr[zb0.i(8)] : null;
                    if (k != null) {
                        return k;
                    }
                    fv m2 = m();
                    fv F = F();
                    int i3 = m2.d;
                    if (i3 > F.d) {
                        return fv.c(0, 0, 0, i3);
                    }
                    fv fvVar2 = this.g;
                    if (fvVar2 != null && !fvVar2.equals(fvVar) && (i2 = this.g.d) > F.d) {
                        return fv.c(0, 0, 0, i2);
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
                        dp0 dp0Var = this.f;
                        jk g = dp0Var != null ? dp0Var.a.g() : g();
                        if (g != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return fv.c(i4 >= 28 ? bj.e(g.a) : 0, i4 >= 28 ? bj.g(g.a) : 0, i4 >= 28 ? bj.f(g.a) : 0, i4 >= 28 ? bj.d(g.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    fv F2 = F();
                    fv k2 = k();
                    return fv.c(Math.max(F2.a, k2.a), 0, Math.max(F2.c, k2.c), Math.max(F2.d, k2.d));
                }
                if ((this.h & 2) == 0) {
                    fv m3 = m();
                    dp0 dp0Var2 = this.f;
                    k = dp0Var2 != null ? dp0Var2.a.k() : null;
                    int i5 = m3.d;
                    if (k != null) {
                        i5 = Math.min(i5, k.d);
                    }
                    return fv.c(m3.a, 0, m3.c, i5);
                }
            }
        } else {
            if (z) {
                return fv.c(0, Math.max(F().b, m().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return fv.c(0, m().b, 0, 0);
            }
        }
        return fvVar;
    }

    public void I(fv fvVar) {
        this.g = fvVar;
    }

    @Override // defpackage.ap0
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        fv G = G(view);
        if (G == null) {
            G = fv.e;
        }
        I(G);
    }

    @Override // defpackage.ap0
    public List<Rect> e(int i) {
        return B(this.k, i);
    }

    @Override // defpackage.ap0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        so0 so0Var = (so0) obj;
        return Objects.equals(this.g, so0Var.g) && J(this.h, so0Var.h);
    }

    @Override // defpackage.ap0
    public List<Rect> f(int i) {
        return B(this.l, i);
    }

    @Override // defpackage.ap0
    public fv h(int i) {
        return D(i, false);
    }

    @Override // defpackage.ap0
    public fv i(int i) {
        return D(i, true);
    }

    @Override // defpackage.ap0
    public final fv m() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = fv.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.ap0
    public void o(View view) {
        A(view);
    }

    @Override // defpackage.ap0
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int i2 = zb0.i(i);
            this.k[i2] = C(h(i));
            if (i != 8) {
                this.l[i2] = C(i(i));
            }
        }
    }

    @Override // defpackage.ap0
    public dp0 q(int i, int i2, int i3, int i4) {
        dp0 g = dp0.g(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        ro0 qo0Var = i5 >= 36 ? new qo0(g) : i5 >= 35 ? new po0(g) : i5 >= 34 ? new oo0(g) : i5 >= 31 ? new no0(g) : i5 >= 30 ? new mo0(g) : i5 >= 29 ? new lo0(g) : new ko0(g);
        qo0Var.h(dp0.e(m(), i, i2, i3, i4));
        qo0Var.f(dp0.e(k(), i, i2, i3, i4));
        return qo0Var.b();
    }

    @Override // defpackage.ap0
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.ap0
    public void u(fv[] fvVarArr) {
        this.d = fvVarArr;
    }

    @Override // defpackage.ap0
    public void v(dp0 dp0Var) {
        this.f = dp0Var;
    }

    @Override // defpackage.ap0
    public void x(int i) {
        this.h = i;
    }

    @Override // defpackage.ap0
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.ap0
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.ap0
    public void t(lk lkVar) {
    }
}
