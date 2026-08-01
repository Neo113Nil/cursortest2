package o3;

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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class z0 extends h1 {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f7455n = false;

    /* renamed from: o, reason: collision with root package name */
    public static Method f7456o;

    /* renamed from: p, reason: collision with root package name */
    public static Class f7457p;

    /* renamed from: q, reason: collision with root package name */
    public static Field f7458q;

    /* renamed from: r, reason: collision with root package name */
    public static Field f7459r;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f7460c;

    /* renamed from: d, reason: collision with root package name */
    public h3.b[] f7461d;

    /* renamed from: e, reason: collision with root package name */
    public h3.b f7462e;

    /* renamed from: f, reason: collision with root package name */
    public k1 f7463f;
    public h3.b g;

    /* renamed from: h, reason: collision with root package name */
    public int f7464h;

    /* renamed from: i, reason: collision with root package name */
    public f f7465i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f7466k;

    /* renamed from: l, reason: collision with root package name */
    public Rect[][] f7467l;

    /* renamed from: m, reason: collision with root package name */
    public Rect[][] f7468m;

    public z0(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var);
        this.f7462e = null;
        this.f7467l = new Rect[10][];
        this.f7468m = new Rect[10][];
        this.f7460c = windowInsets;
    }

    private f D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f7398a.f7415a.t()) {
            return f.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        k H = c6.f.H(display, 0);
        k H2 = c6.f.H(display, 1);
        k H3 = c6.f.H(display, 2);
        k H4 = c6.f.H(display, 3);
        return f.a(point.x, point.y, false, H != null ? H.f7410b : 0, H2 != null ? H2.f7410b : 0, H3 != null ? H3.f7410b : 0, H4 != null ? H4.f7410b : 0);
    }

    private static List<Rect> E(Rect[][] rectArr, int i3) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i3 & i10) != 0 && (rectArr2 = rectArr[i7.a.Q(i10)]) != null) {
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

    private Rect[] F(h3.b bVar) {
        ArrayList arrayList = new ArrayList();
        int i3 = bVar.f4443a;
        int i10 = bVar.f4446d;
        int i11 = bVar.f4445c;
        int i12 = bVar.f4444b;
        if (i3 != 0) {
            arrayList.add(new Rect(0, 0, bVar.f4443a, this.j));
        }
        if (i12 != 0) {
            arrayList.add(new Rect(0, 0, this.f7466k, i12));
        }
        if (i11 != 0) {
            int i13 = this.f7466k;
            arrayList.add(new Rect(i13 - i11, 0, i13, this.j));
        }
        if (i10 != 0) {
            int i14 = this.j;
            arrayList.add(new Rect(0, i14 - i10, this.f7466k, i14));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private h3.b G(int i3, boolean z10) {
        h3.b bVar = h3.b.f4442e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i3 & i10) != 0) {
                bVar = h3.b.a(bVar, H(i10, z10));
            }
        }
        return bVar;
    }

    private h3.b I() {
        k1 k1Var = this.f7463f;
        return k1Var != null ? k1Var.f7415a.l() : h3.b.f4442e;
    }

    private h3.b J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            a2.r.r("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!f7455n) {
            L();
        }
        Method method = f7456o;
        if (method != null && f7457p != null && f7458q != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f7458q.get(f7459r.get(invoke));
                if (rect != null) {
                    return h3.b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    private static void L() {
        try {
            f7456o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f7457p = cls;
            f7458q = cls.getDeclaredField("mVisibleInsets");
            f7459r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f7458q.setAccessible(true);
            f7459r.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f7455n = true;
    }

    public static boolean M(int i3, int i10) {
        return (i3 & 6) == (i10 & 6);
    }

    @Override // o3.h1
    public void A(int i3) {
        this.f7464h = i3;
    }

    @Override // o3.h1
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f7467l = (Rect[][]) rectArr.clone();
    }

    @Override // o3.h1
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f7468m = (Rect[][]) rectArr.clone();
    }

    public h3.b H(int i3, boolean z10) {
        h3.b l10;
        int i10;
        h3.b bVar = h3.b.f4442e;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 8) {
                    h3.b[] bVarArr = this.f7461d;
                    l10 = bVarArr != null ? bVarArr[i7.a.Q(8)] : null;
                    if (l10 != null) {
                        return l10;
                    }
                    h3.b n10 = n();
                    h3.b I = I();
                    int i11 = n10.f4446d;
                    if (i11 > I.f4446d) {
                        return h3.b.b(0, 0, 0, i11);
                    }
                    h3.b bVar2 = this.g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i10 = this.g.f4446d) > I.f4446d) {
                        return h3.b.b(0, 0, 0, i10);
                    }
                } else {
                    if (i3 == 16) {
                        return m();
                    }
                    if (i3 == 32) {
                        return k();
                    }
                    if (i3 == 64) {
                        return o();
                    }
                    if (i3 == 128) {
                        k1 k1Var = this.f7463f;
                        d h10 = k1Var != null ? k1Var.f7415a.h() : h();
                        if (h10 != null) {
                            int i12 = Build.VERSION.SDK_INT;
                            return h3.b.b(i12 >= 28 ? e3.k.h(h10.f7384a) : 0, i12 >= 28 ? e3.k.j(h10.f7384a) : 0, i12 >= 28 ? e3.k.i(h10.f7384a) : 0, i12 >= 28 ? e3.k.g(h10.f7384a) : 0);
                        }
                    }
                }
            } else {
                if (z10) {
                    h3.b I2 = I();
                    h3.b l11 = l();
                    return h3.b.b(Math.max(I2.f4443a, l11.f4443a), 0, Math.max(I2.f4445c, l11.f4445c), Math.max(I2.f4446d, l11.f4446d));
                }
                if ((this.f7464h & 2) == 0) {
                    h3.b n11 = n();
                    k1 k1Var2 = this.f7463f;
                    l10 = k1Var2 != null ? k1Var2.f7415a.l() : null;
                    int i13 = n11.f4446d;
                    if (l10 != null) {
                        i13 = Math.min(i13, l10.f4446d);
                    }
                    return h3.b.b(n11.f4443a, 0, n11.f4445c, i13);
                }
            }
        } else {
            if (z10) {
                return h3.b.b(0, Math.max(I().f4444b, n().f4444b), 0, 0);
            }
            if ((this.f7464h & 4) == 0) {
                return h3.b.b(0, n().f4444b, 0, 0);
            }
        }
        return bVar;
    }

    public boolean K(int i3) {
        if (i3 != 1 && i3 != 2) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 8 && i3 != 128) {
                return true;
            }
        }
        return !H(i3, false).equals(h3.b.f4442e);
    }

    @Override // o3.h1
    public void d(View view) {
        this.f7466k = view.getWidth();
        this.j = view.getHeight();
        h3.b J = J(view);
        if (J == null) {
            J = h3.b.f4442e;
        }
        x(J);
    }

    @Override // o3.h1
    public void e(k1 k1Var) {
        k1Var.f7415a.y(this.f7463f);
        h3.b bVar = this.g;
        h1 h1Var = k1Var.f7415a;
        h1Var.x(bVar);
        h1Var.A(this.f7464h);
        h1Var.v(this.f7465i);
        h1Var.B(this.f7467l);
        h1Var.C(this.f7468m);
    }

    @Override // o3.h1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Objects.equals(this.g, z0Var.g) && M(this.f7464h, z0Var.f7464h);
    }

    @Override // o3.h1
    public List<Rect> f(int i3) {
        return E(this.f7467l, i3);
    }

    @Override // o3.h1
    public List<Rect> g(int i3) {
        return E(this.f7468m, i3);
    }

    @Override // o3.h1
    public h3.b i(int i3) {
        return G(i3, false);
    }

    @Override // o3.h1
    public h3.b j(int i3) {
        return G(i3, true);
    }

    @Override // o3.h1
    public final h3.b n() {
        if (this.f7462e == null) {
            WindowInsets windowInsets = this.f7460c;
            this.f7462e = h3.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f7462e;
    }

    @Override // o3.h1
    public void p(View view) {
        this.f7465i = D(view);
    }

    @Override // o3.h1
    public void q() {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            int Q = i7.a.Q(i3);
            this.f7467l[Q] = F(i(i3));
            if (i3 != 8) {
                this.f7468m[Q] = F(j(i3));
            }
        }
    }

    @Override // o3.h1
    public k1 r(int i3, int i10, int i11, int i12) {
        k1 c10 = k1.c(this.f7460c, null);
        int i13 = Build.VERSION.SDK_INT;
        y0 x0Var = i13 >= 36 ? new x0(c10) : i13 >= 35 ? new w0(c10) : i13 >= 34 ? new v0(c10) : i13 >= 31 ? new u0(c10) : i13 >= 30 ? new t0(c10) : i13 >= 29 ? new s0(c10) : new r0(c10);
        x0Var.h(k1.a(n(), i3, i10, i11, i12));
        x0Var.f(k1.a(l(), i3, i10, i11, i12));
        return x0Var.b();
    }

    @Override // o3.h1
    public boolean t() {
        return this.f7460c.isRound();
    }

    @Override // o3.h1
    public boolean u(int i3) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i3 & i10) != 0 && !K(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // o3.h1
    public void v(f fVar) {
        this.f7465i = fVar;
    }

    @Override // o3.h1
    public void w(h3.b[] bVarArr) {
        this.f7461d = bVarArr;
    }

    @Override // o3.h1
    public void x(h3.b bVar) {
        this.g = bVar;
    }

    @Override // o3.h1
    public void y(k1 k1Var) {
        this.f7463f = k1Var;
    }

    public z0(k1 k1Var, z0 z0Var) {
        this(k1Var, new WindowInsets(z0Var.f7460c));
    }
}
