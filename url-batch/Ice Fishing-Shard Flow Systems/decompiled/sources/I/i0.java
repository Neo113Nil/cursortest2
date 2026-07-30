package I;

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

/* loaded from: classes.dex */
public abstract class i0 extends r0 {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f1197m = false;

    /* renamed from: n, reason: collision with root package name */
    public static Method f1198n;

    /* renamed from: o, reason: collision with root package name */
    public static Class f1199o;

    /* renamed from: p, reason: collision with root package name */
    public static Field f1200p;

    /* renamed from: q, reason: collision with root package name */
    public static Field f1201q;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f1202c;

    /* renamed from: d, reason: collision with root package name */
    public B.c[] f1203d;

    /* renamed from: e, reason: collision with root package name */
    public B.c f1204e;

    /* renamed from: f, reason: collision with root package name */
    public v0 f1205f;

    /* renamed from: g, reason: collision with root package name */
    public B.c f1206g;

    /* renamed from: h, reason: collision with root package name */
    public int f1207h;

    /* renamed from: i, reason: collision with root package name */
    public int f1208i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public Rect[][] f1209k;

    /* renamed from: l, reason: collision with root package name */
    public Rect[][] f1210l;

    public i0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var);
        this.f1204e = null;
        this.f1209k = new Rect[10][];
        this.f1210l = new Rect[10][];
        this.f1202c = windowInsets;
    }

    private static List<Rect> A(Rect[][] rectArr, int i2) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i2 & i5) != 0 && (rectArr2 = rectArr[O6.g.P(i5)]) != null) {
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

    private Rect[] B(B.c cVar) {
        ArrayList arrayList = new ArrayList();
        int i2 = cVar.f147a;
        int i5 = cVar.f150d;
        int i7 = cVar.f149c;
        int i8 = cVar.f148b;
        if (i2 != 0) {
            arrayList.add(new Rect(0, 0, cVar.f147a, this.f1208i));
        }
        if (i8 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i8));
        }
        if (i7 != 0) {
            int i9 = this.j;
            arrayList.add(new Rect(i9 - i7, 0, i9, this.f1208i));
        }
        if (i5 != 0) {
            int i10 = this.f1208i;
            arrayList.add(new Rect(0, i10 - i5, this.j, i10));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private B.c D(int i2, boolean z7) {
        B.c cVar = B.c.f146e;
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i2 & i5) != 0) {
                B.c E7 = E(i5, z7);
                cVar = B.c.a(Math.max(cVar.f147a, E7.f147a), Math.max(cVar.f148b, E7.f148b), Math.max(cVar.f149c, E7.f149c), Math.max(cVar.f150d, E7.f150d));
            }
        }
        return cVar;
    }

    private B.c G() {
        v0 v0Var = this.f1205f;
        return v0Var != null ? v0Var.f1239a.i() : B.c.f146e;
    }

    private B.c H(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f1197m) {
            J();
        }
        Method method = f1198n;
        if (method != null && f1199o != null && f1200p != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f1200p.get(f1201q.get(invoke));
                if (rect != null) {
                    return B.c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e7) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
        }
        return null;
    }

    private static void J() {
        try {
            f1198n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f1199o = cls;
            f1200p = cls.getDeclaredField("mVisibleInsets");
            f1201q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f1200p.setAccessible(true);
            f1201q.setAccessible(true);
        } catch (ReflectiveOperationException e7) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
        }
        f1197m = true;
    }

    public static boolean L(int i2, int i5) {
        return (i2 & 6) == (i5 & 6);
    }

    private C0114j z(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f1235a.f1239a.q()) {
            return C0114j.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        C0127x D7 = V6.b.D(display, 0);
        C0127x D8 = V6.b.D(display, 1);
        C0127x D9 = V6.b.D(display, 2);
        C0127x D10 = V6.b.D(display, 3);
        return C0114j.a(point.x, point.y, false, D7 != null ? D7.f1245b : 0, D8 != null ? D8.f1245b : 0, D9 != null ? D9.f1245b : 0, D10 != null ? D10.f1245b : 0);
    }

    public B.c C(int i2) {
        return D(i2, false);
    }

    public B.c E(int i2, boolean z7) {
        B.c i5;
        int i7;
        B.c cVar = B.c.f146e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    B.c[] cVarArr = this.f1203d;
                    i5 = cVarArr != null ? cVarArr[O6.g.P(8)] : null;
                    if (i5 != null) {
                        return i5;
                    }
                    B.c k7 = k();
                    B.c G4 = G();
                    int i8 = k7.f150d;
                    if (i8 > G4.f150d) {
                        return B.c.a(0, 0, 0, i8);
                    }
                    B.c cVar2 = this.f1206g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i7 = this.f1206g.f150d) > G4.f150d) {
                        return B.c.a(0, 0, 0, i7);
                    }
                } else {
                    if (i2 == 16) {
                        return j();
                    }
                    if (i2 == 32) {
                        return h();
                    }
                    if (i2 == 64) {
                        return l();
                    }
                    if (i2 == 128) {
                        v0 v0Var = this.f1205f;
                        C0112h g7 = v0Var != null ? v0Var.f1239a.g() : g();
                        if (g7 != null) {
                            int i9 = Build.VERSION.SDK_INT;
                            return B.c.a(i9 >= 28 ? C.b.h(g7.f1191a) : 0, i9 >= 28 ? C.b.j(g7.f1191a) : 0, i9 >= 28 ? C.b.i(g7.f1191a) : 0, i9 >= 28 ? C.b.g(g7.f1191a) : 0);
                        }
                    }
                }
            } else {
                if (z7) {
                    B.c G7 = G();
                    B.c i10 = i();
                    return B.c.a(Math.max(G7.f147a, i10.f147a), 0, Math.max(G7.f149c, i10.f149c), Math.max(G7.f150d, i10.f150d));
                }
                if ((this.f1207h & 2) == 0) {
                    B.c k8 = k();
                    v0 v0Var2 = this.f1205f;
                    i5 = v0Var2 != null ? v0Var2.f1239a.i() : null;
                    int i11 = k8.f150d;
                    if (i5 != null) {
                        i11 = Math.min(i11, i5.f150d);
                    }
                    return B.c.a(k8.f147a, 0, k8.f149c, i11);
                }
            }
        } else {
            if (z7) {
                return B.c.a(0, Math.max(G().f148b, k().f148b), 0, 0);
            }
            if ((this.f1207h & 4) == 0) {
                return B.c.a(0, k().f148b, 0, 0);
            }
        }
        return cVar;
    }

    public B.c F(int i2) {
        return D(i2, true);
    }

    public boolean I(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !E(i2, false).equals(B.c.f146e);
    }

    public void K(B.c cVar) {
        this.f1206g = cVar;
    }

    @Override // I.r0
    public void d(View view) {
        this.j = view.getWidth();
        this.f1208i = view.getHeight();
        B.c H7 = H(view);
        if (H7 == null) {
            H7 = B.c.f146e;
        }
        K(H7);
    }

    @Override // I.r0
    public List<Rect> e(int i2) {
        return A(this.f1209k, i2);
    }

    @Override // I.r0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Objects.equals(this.f1206g, i0Var.f1206g) && L(this.f1207h, i0Var.f1207h);
    }

    @Override // I.r0
    public List<Rect> f(int i2) {
        return A(this.f1210l, i2);
    }

    @Override // I.r0
    public final B.c k() {
        if (this.f1204e == null) {
            WindowInsets windowInsets = this.f1202c;
            this.f1204e = B.c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f1204e;
    }

    @Override // I.r0
    public void m(View view) {
        z(view);
    }

    @Override // I.r0
    public void n() {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int P7 = O6.g.P(i2);
            this.f1209k[P7] = B(C(i2));
            if (i2 != 8) {
                this.f1210l[P7] = B(F(i2));
            }
        }
    }

    @Override // I.r0
    public v0 o(int i2, int i5, int i7, int i8) {
        v0 c7 = v0.c(this.f1202c, null);
        int i9 = Build.VERSION.SDK_INT;
        h0 g0Var = i9 >= 36 ? new g0(c7) : i9 >= 35 ? new f0(c7) : i9 >= 34 ? new e0(c7) : i9 >= 31 ? new d0(c7) : i9 >= 30 ? new c0(c7) : i9 >= 29 ? new b0(c7) : new a0(c7);
        g0Var.e(v0.a(k(), i2, i5, i7, i8));
        g0Var.d(v0.a(i(), i2, i5, i7, i8));
        return g0Var.b();
    }

    @Override // I.r0
    public boolean q() {
        return this.f1202c.isRound();
    }

    @Override // I.r0
    public boolean r(int i2) {
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i2 & i5) != 0 && !I(i5)) {
                return false;
            }
        }
        return true;
    }

    @Override // I.r0
    public void t(B.c[] cVarArr) {
        this.f1203d = cVarArr;
    }

    @Override // I.r0
    public void u(v0 v0Var) {
        this.f1205f = v0Var;
    }

    @Override // I.r0
    public void w(int i2) {
        this.f1207h = i2;
    }

    @Override // I.r0
    public void x(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f1209k = (Rect[][]) rectArr.clone();
    }

    @Override // I.r0
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f1210l = (Rect[][]) rectArr.clone();
    }

    @Override // I.r0
    public void s(C0114j c0114j) {
    }
}
