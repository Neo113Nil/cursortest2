package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zo extends zw {
    private static boolean f = false;
    private static Method g;
    private static Class j;
    private static Field k;
    private static Field l;
    final WindowInsets a;
    vb b;
    int c;
    int d;
    int e;
    private vb[] m;
    private vb n;
    private zz o;
    private Rect[][] p;
    private Rect[][] q;

    public zo(zz zzVar, WindowInsets windowInsets) {
        super(zzVar);
        this.n = null;
        this.p = new Rect[10][];
        this.q = new Rect[10][];
        this.a = windowInsets;
    }

    private vb D(int i, boolean z) {
        vb vbVar = vb.a;
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0) {
                vbVar = vb.b(vbVar, b(i2, z));
            }
        }
        return vbVar;
    }

    private vb E() {
        zz zzVar = this.o;
        return zzVar != null ? zzVar.h() : vb.a;
    }

    private vb F(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f) {
            I();
        }
        Method method = g;
        if (method != null && j != null && k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) k.get(l.get(invoke));
                if (rect != null) {
                    return vb.d(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
            }
        }
        return null;
    }

    private xh G(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.i.b.r()) {
            return xh.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        xt g2 = yg.g(display, 0);
        xt g3 = yg.g(display, 1);
        xt g4 = yg.g(display, 2);
        xt g5 = yg.g(display, 3);
        return xh.a(point.x, point.y, false, g2 != null ? g2.a : 0, g3 != null ? g3.a : 0, g4 != null ? g4.a : 0, g5 != null ? g5.a : 0);
    }

    private static List H(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[yl.c(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    int length = rectArr3.length;
                    int length2 = rectArr2.length;
                    Rect[] rectArr4 = new Rect[length + length2];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, length);
                    System.arraycopy(rectArr2, 0, rectArr4, length, length2);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private static void I() {
        try {
            g = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). ".concat(String.valueOf(e.getMessage())), e);
        }
        f = true;
    }

    private Rect[] J(vb vbVar) {
        ArrayList arrayList = new ArrayList();
        int i = vbVar.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, i, this.d));
        }
        int i2 = vbVar.c;
        if (i2 != 0) {
            arrayList.add(new Rect(0, 0, this.e, i2));
        }
        int i3 = vbVar.d;
        if (i3 != 0) {
            int i4 = this.e;
            arrayList.add(new Rect(i4 - i3, 0, i4, this.d));
        }
        int i5 = vbVar.e;
        if (i5 != 0) {
            int i6 = this.d;
            arrayList.add(new Rect(0, i6 - i5, this.e, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    static boolean s(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.zw
    public vb a(int i) {
        return D(i, false);
    }

    protected vb b(int i, boolean z) {
        vb h;
        vb vbVar;
        int safeInsetTop;
        int safeInsetBottom;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    vb[] vbVarArr = this.m;
                    h = vbVarArr != null ? vbVarArr[yl.c(8)] : null;
                    if (h != null) {
                        return h;
                    }
                    vb d = d();
                    vb E = E();
                    int i2 = d.e;
                    int i3 = E.e;
                    if (i2 > i3 || ((vbVar = this.b) != null && !vbVar.equals(vb.a) && (i2 = this.b.e) > i3)) {
                        return vb.d(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return B();
                    }
                    if (i == 32) {
                        return A();
                    }
                    if (i == 64) {
                        return C();
                    }
                    if (i == 128) {
                        zz zzVar = this.o;
                        xf k2 = zzVar != null ? zzVar.k() : y();
                        if (k2 != null) {
                            DisplayCutout displayCutout = k2.a;
                            int a = k2.a();
                            safeInsetTop = displayCutout.getSafeInsetTop();
                            int b = k2.b();
                            safeInsetBottom = displayCutout.getSafeInsetBottom();
                            return vb.d(a, safeInsetTop, b, safeInsetBottom);
                        }
                    }
                }
            } else {
                if (z) {
                    vb E2 = E();
                    vb t = t();
                    return vb.d(Math.max(E2.b, t.b), 0, Math.max(E2.d, t.d), Math.max(E2.e, t.e));
                }
                if ((this.c & 2) == 0) {
                    vb d2 = d();
                    zz zzVar2 = this.o;
                    h = zzVar2 != null ? zzVar2.h() : null;
                    int i4 = d2.e;
                    if (h != null) {
                        i4 = Math.min(i4, h.e);
                    }
                    return vb.d(d2.b, 0, d2.d, i4);
                }
            }
        } else {
            if (z) {
                return vb.d(0, Math.max(E().c, d().c), 0, 0);
            }
            if ((this.c & 4) == 0) {
                return vb.d(0, d().c, 0, 0);
            }
        }
        return vb.a;
    }

    @Override // defpackage.zw
    public vb c(int i) {
        return D(i, true);
    }

    @Override // defpackage.zw
    public final vb d() {
        vb vbVar = this.n;
        if (vbVar != null) {
            return vbVar;
        }
        WindowInsets windowInsets = this.a;
        vb d = vb.d(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.n = d;
        return d;
    }

    @Override // defpackage.zw
    public zz e(int i, int i2, int i3, int i4) {
        zz q = zz.q(this.a, null);
        zn zmVar = Build.VERSION.SDK_INT >= 36 ? new zm(q) : Build.VERSION.SDK_INT >= 35 ? new zl(q) : Build.VERSION.SDK_INT >= 34 ? new zk(q) : Build.VERSION.SDK_INT >= 31 ? new zj(q) : Build.VERSION.SDK_INT >= 30 ? new zi(q) : Build.VERSION.SDK_INT >= 29 ? new zh(q) : new zg(q);
        zmVar.c(zz.j(d(), i, i2, i3, i4));
        zmVar.b(zz.j(t(), i, i2, i3, i4));
        return zmVar.a();
    }

    @Override // defpackage.zw
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zo zoVar = (zo) obj;
        return Objects.equals(this.b, zoVar.b) && s(this.c, zoVar.c);
    }

    @Override // defpackage.zw
    public List f(int i) {
        return H(this.p, i);
    }

    @Override // defpackage.zw
    public List g(int i) {
        return H(this.q, i);
    }

    @Override // defpackage.zw
    public void h(View view) {
        this.e = view.getWidth();
        this.d = view.getHeight();
        vb F = F(view);
        if (F == null) {
            F = vb.a;
        }
        m(F);
    }

    @Override // defpackage.zw
    public void i(View view) {
        G(view);
    }

    @Override // defpackage.zw
    public void j() {
        for (int i = 1; i <= 512; i += i) {
            int c = yl.c(i);
            this.p[c] = J(a(i));
            if (i != 8) {
                this.q[c] = J(c(i));
            }
        }
    }

    @Override // defpackage.zw
    public void l(vb[] vbVarArr) {
        this.m = vbVarArr;
    }

    public void m(vb vbVar) {
        this.b = vbVar;
    }

    @Override // defpackage.zw
    public void n(zz zzVar) {
        this.o = zzVar;
    }

    @Override // defpackage.zw
    public void o(int i) {
        this.c = i;
    }

    @Override // defpackage.zw
    public void p(Rect[][] rectArr) {
        rectArr.getClass();
        this.p = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.zw
    public void q(Rect[][] rectArr) {
        rectArr.getClass();
        this.q = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.zw
    public boolean r() {
        return this.a.isRound();
    }

    @Override // defpackage.zw
    public void k(xh xhVar) {
    }
}
