package n0;

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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class k1 extends s1 {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f2792m = false;

    /* renamed from: n, reason: collision with root package name */
    public static Method f2793n;

    /* renamed from: o, reason: collision with root package name */
    public static Class f2794o;

    /* renamed from: p, reason: collision with root package name */
    public static Field f2795p;

    /* renamed from: q, reason: collision with root package name */
    public static Field f2796q;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f2797c;
    public f0.c[] d;

    /* renamed from: e, reason: collision with root package name */
    public f0.c f2798e;

    /* renamed from: f, reason: collision with root package name */
    public v1 f2799f;

    /* renamed from: g, reason: collision with root package name */
    public f0.c f2800g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2801j;

    /* renamed from: k, reason: collision with root package name */
    public Rect[][] f2802k;

    /* renamed from: l, reason: collision with root package name */
    public Rect[][] f2803l;

    public k1(v1 v1Var, WindowInsets windowInsets) {
        super(v1Var);
        this.f2798e = null;
        this.f2802k = new Rect[10][];
        this.f2803l = new Rect[10][];
        this.f2797c = windowInsets;
    }

    private k A(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f2833a.f2842a.s()) {
            return k.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        s E = b4.l.E(display, 0);
        s E2 = b4.l.E(display, 1);
        s E3 = b4.l.E(display, 2);
        s E4 = b4.l.E(display, 3);
        return k.a(point.x, point.y, false, E != null ? E.f2828b : 0, E2 != null ? E2.f2828b : 0, E3 != null ? E3.f2828b : 0, E4 != null ? E4.f2828b : 0);
    }

    private static List<Rect> B(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i & i4) != 0 && (rectArr2 = rectArr[b4.d.C(i4)]) != null) {
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

    private Rect[] C(f0.c cVar) {
        ArrayList arrayList = new ArrayList();
        int i = cVar.f1415a;
        int i4 = cVar.d;
        int i5 = cVar.f1417c;
        int i6 = cVar.f1416b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, cVar.f1415a, this.i));
        }
        if (i6 != 0) {
            arrayList.add(new Rect(0, 0, this.f2801j, i6));
        }
        if (i5 != 0) {
            int i7 = this.f2801j;
            arrayList.add(new Rect(i7 - i5, 0, i7, this.i));
        }
        if (i4 != 0) {
            int i8 = this.i;
            arrayList.add(new Rect(0, i8 - i4, this.f2801j, i8));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private f0.c D(int i, boolean z4) {
        f0.c cVar = f0.c.f1414e;
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i & i4) != 0) {
                cVar = f0.c.a(cVar, E(i4, z4));
            }
        }
        return cVar;
    }

    private f0.c F() {
        v1 v1Var = this.f2799f;
        return v1Var != null ? v1Var.f2842a.k() : f0.c.f1414e;
    }

    private f0.c G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f2792m) {
            H();
        }
        Method method = f2793n;
        if (method != null && f2794o != null && f2795p != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f2795p.get(f2796q.get(invoke));
                if (rect != null) {
                    return f0.c.c(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
        }
        return null;
    }

    private static void H() {
        try {
            f2793n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2794o = cls;
            f2795p = cls.getDeclaredField("mVisibleInsets");
            f2796q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2795p.setAccessible(true);
            f2796q.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        f2792m = true;
    }

    public static boolean J(int i, int i4) {
        return (i & 6) == (i4 & 6);
    }

    public f0.c E(int i, boolean z4) {
        f0.c k4;
        int i4;
        f0.c cVar = f0.c.f1414e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    f0.c[] cVarArr = this.d;
                    k4 = cVarArr != null ? cVarArr[b4.d.C(8)] : null;
                    if (k4 != null) {
                        return k4;
                    }
                    f0.c m4 = m();
                    f0.c F = F();
                    int i5 = m4.d;
                    if (i5 > F.d) {
                        return f0.c.c(0, 0, 0, i5);
                    }
                    f0.c cVar2 = this.f2800g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i4 = this.f2800g.d) > F.d) {
                        return f0.c.c(0, 0, 0, i4);
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
                        v1 v1Var = this.f2799f;
                        i g3 = v1Var != null ? v1Var.f2842a.g() : g();
                        if (g3 != null) {
                            int i6 = Build.VERSION.SDK_INT;
                            return f0.c.c(i6 >= 28 ? g0.a.d(g3.f2784a) : 0, i6 >= 28 ? g0.a.f(g3.f2784a) : 0, i6 >= 28 ? g0.a.e(g3.f2784a) : 0, i6 >= 28 ? g0.a.c(g3.f2784a) : 0);
                        }
                    }
                }
            } else {
                if (z4) {
                    f0.c F2 = F();
                    f0.c k5 = k();
                    return f0.c.c(Math.max(F2.f1415a, k5.f1415a), 0, Math.max(F2.f1417c, k5.f1417c), Math.max(F2.d, k5.d));
                }
                if ((this.h & 2) == 0) {
                    f0.c m5 = m();
                    v1 v1Var2 = this.f2799f;
                    k4 = v1Var2 != null ? v1Var2.f2842a.k() : null;
                    int i7 = m5.d;
                    if (k4 != null) {
                        i7 = Math.min(i7, k4.d);
                    }
                    return f0.c.c(m5.f1415a, 0, m5.f1417c, i7);
                }
            }
        } else {
            if (z4) {
                return f0.c.c(0, Math.max(F().f1416b, m().f1416b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return f0.c.c(0, m().f1416b, 0, 0);
            }
        }
        return cVar;
    }

    public void I(f0.c cVar) {
        this.f2800g = cVar;
    }

    @Override // n0.s1
    public void d(View view) {
        this.f2801j = view.getWidth();
        this.i = view.getHeight();
        f0.c G = G(view);
        if (G == null) {
            G = f0.c.f1414e;
        }
        I(G);
    }

    @Override // n0.s1
    public List<Rect> e(int i) {
        return B(this.f2802k, i);
    }

    @Override // n0.s1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Objects.equals(this.f2800g, k1Var.f2800g) && J(this.h, k1Var.h);
    }

    @Override // n0.s1
    public List<Rect> f(int i) {
        return B(this.f2803l, i);
    }

    @Override // n0.s1
    public f0.c h(int i) {
        return D(i, false);
    }

    @Override // n0.s1
    public f0.c i(int i) {
        return D(i, true);
    }

    @Override // n0.s1
    public final f0.c m() {
        if (this.f2798e == null) {
            WindowInsets windowInsets = this.f2797c;
            this.f2798e = f0.c.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2798e;
    }

    @Override // n0.s1
    public void o(View view) {
        A(view);
    }

    @Override // n0.s1
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int C = b4.d.C(i);
            this.f2802k[C] = C(h(i));
            if (i != 8) {
                this.f2803l[C] = C(i(i));
            }
        }
    }

    @Override // n0.s1
    public v1 q(int i, int i4, int i5, int i6) {
        v1 g3 = v1.g(null, this.f2797c);
        int i7 = Build.VERSION.SDK_INT;
        j1 i1Var = i7 >= 36 ? new i1(g3) : i7 >= 35 ? new h1(g3) : i7 >= 34 ? new g1(g3) : i7 >= 31 ? new f1(g3) : i7 >= 30 ? new e1(g3) : i7 >= 29 ? new d1(g3) : new c1(g3);
        i1Var.h(v1.e(m(), i, i4, i5, i6));
        i1Var.f(v1.e(k(), i, i4, i5, i6));
        return i1Var.b();
    }

    @Override // n0.s1
    public boolean s() {
        return this.f2797c.isRound();
    }

    @Override // n0.s1
    public void u(f0.c[] cVarArr) {
        this.d = cVarArr;
    }

    @Override // n0.s1
    public void v(v1 v1Var) {
        this.f2799f = v1Var;
    }

    @Override // n0.s1
    public void x(int i) {
        this.h = i;
    }

    @Override // n0.s1
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f2802k = (Rect[][]) rectArr.clone();
    }

    @Override // n0.s1
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f2803l = (Rect[][]) rectArr.clone();
    }

    @Override // n0.s1
    public void t(k kVar) {
    }
}
