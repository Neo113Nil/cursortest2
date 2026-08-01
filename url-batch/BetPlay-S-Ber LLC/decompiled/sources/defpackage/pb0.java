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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class pb0 extends xb0 {
    public static boolean m = false;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public ip[] d;
    public ip e;
    public ac0 f;
    public ip g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public pb0(ac0 ac0Var, WindowInsets windowInsets) {
        super(ac0Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private uf A(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.s()) {
            return uf.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        f10 u = l70.u(display, 0);
        f10 u2 = l70.u(display, 1);
        f10 u3 = l70.u(display, 2);
        f10 u4 = l70.u(display, 3);
        return uf.a(point.x, point.y, false, u != null ? u.b : 0, u2 != null ? u2.b : 0, u3 != null ? u3.b : 0, u4 != null ? u4.b : 0);
    }

    private static List<Rect> B(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[vw.M(i2)]) != null) {
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

    private Rect[] C(ip ipVar) {
        ArrayList arrayList = new ArrayList();
        int i = ipVar.a;
        int i2 = ipVar.d;
        int i3 = ipVar.c;
        int i4 = ipVar.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, ipVar.a, this.i));
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

    private ip D(int i, boolean z) {
        ip ipVar = ip.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                ipVar = ip.a(ipVar, E(i2, z));
            }
        }
        return ipVar;
    }

    private ip F() {
        ac0 ac0Var = this.f;
        return ac0Var != null ? ac0Var.a.k() : ip.e;
    }

    private ip G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            o8.w("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
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
                    return ip.c(rect.left, rect.top, rect.right, rect.bottom);
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

    public ip E(int i, boolean z) {
        ip k;
        int i2;
        ip ipVar = ip.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    ip[] ipVarArr = this.d;
                    k = ipVarArr != null ? ipVarArr[vw.M(8)] : null;
                    if (k != null) {
                        return k;
                    }
                    ip m2 = m();
                    ip F = F();
                    int i3 = m2.d;
                    if (i3 > F.d) {
                        return ip.c(0, 0, 0, i3);
                    }
                    ip ipVar2 = this.g;
                    if (ipVar2 != null && !ipVar2.equals(ipVar) && (i2 = this.g.d) > F.d) {
                        return ip.c(0, 0, 0, i2);
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
                        ac0 ac0Var = this.f;
                        sf g = ac0Var != null ? ac0Var.a.g() : g();
                        if (g != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return ip.c(i4 >= 28 ? rf.d(g.a) : 0, i4 >= 28 ? rf.f(g.a) : 0, i4 >= 28 ? rf.e(g.a) : 0, i4 >= 28 ? rf.c(g.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    ip F2 = F();
                    ip k2 = k();
                    return ip.c(Math.max(F2.a, k2.a), 0, Math.max(F2.c, k2.c), Math.max(F2.d, k2.d));
                }
                if ((this.h & 2) == 0) {
                    ip m3 = m();
                    ac0 ac0Var2 = this.f;
                    k = ac0Var2 != null ? ac0Var2.a.k() : null;
                    int i5 = m3.d;
                    if (k != null) {
                        i5 = Math.min(i5, k.d);
                    }
                    return ip.c(m3.a, 0, m3.c, i5);
                }
            }
        } else {
            if (z) {
                return ip.c(0, Math.max(F().b, m().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return ip.c(0, m().b, 0, 0);
            }
        }
        return ipVar;
    }

    public void I(ip ipVar) {
        this.g = ipVar;
    }

    @Override // defpackage.xb0
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        ip G = G(view);
        if (G == null) {
            G = ip.e;
        }
        I(G);
    }

    @Override // defpackage.xb0
    public List<Rect> e(int i) {
        return B(this.k, i);
    }

    @Override // defpackage.xb0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        pb0 pb0Var = (pb0) obj;
        return Objects.equals(this.g, pb0Var.g) && J(this.h, pb0Var.h);
    }

    @Override // defpackage.xb0
    public List<Rect> f(int i) {
        return B(this.l, i);
    }

    @Override // defpackage.xb0
    public ip h(int i) {
        return D(i, false);
    }

    @Override // defpackage.xb0
    public ip i(int i) {
        return D(i, true);
    }

    @Override // defpackage.xb0
    public final ip m() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = ip.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.xb0
    public void o(View view) {
        A(view);
    }

    @Override // defpackage.xb0
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int M = vw.M(i);
            this.k[M] = C(h(i));
            if (i != 8) {
                this.l[M] = C(i(i));
            }
        }
    }

    @Override // defpackage.xb0
    public ac0 q(int i, int i2, int i3, int i4) {
        ac0 g = ac0.g(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        ob0 nb0Var = i5 >= 36 ? new nb0(g) : i5 >= 35 ? new mb0(g) : i5 >= 34 ? new lb0(g) : i5 >= 31 ? new kb0(g) : i5 >= 30 ? new jb0(g) : i5 >= 29 ? new ib0(g) : new hb0(g);
        nb0Var.h(ac0.e(m(), i, i2, i3, i4));
        nb0Var.f(ac0.e(k(), i, i2, i3, i4));
        return nb0Var.b();
    }

    @Override // defpackage.xb0
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.xb0
    public void u(ip[] ipVarArr) {
        this.d = ipVarArr;
    }

    @Override // defpackage.xb0
    public void v(ac0 ac0Var) {
        this.f = ac0Var;
    }

    @Override // defpackage.xb0
    public void x(int i) {
        this.h = i;
    }

    @Override // defpackage.xb0
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.xb0
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.xb0
    public void t(uf ufVar) {
    }
}
