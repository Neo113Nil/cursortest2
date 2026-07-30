package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class zo1 extends fp1 {
    public final WindowInsets c;
    public c90[] d;
    public c90 e;
    public ip1 f;
    public c90 g;
    public int h;

    public zo1(ip1 ip1Var, zo1 zo1Var) {
        this(ip1Var, new WindowInsets(zo1Var.c));
    }

    public static boolean A(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    private c90 v(int i, boolean z) {
        c90 c90Var = c90.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                c90 w = w(i2, z);
                c90Var = c90.a(Math.max(c90Var.a, w.a), Math.max(c90Var.b, w.b), Math.max(c90Var.c, w.c), Math.max(c90Var.d, w.d));
            }
        }
        return c90Var;
    }

    private c90 x() {
        ip1 ip1Var = this.f;
        return ip1Var != null ? ip1Var.a.j() : c90.e;
    }

    private c90 y(View view) {
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @Override // defpackage.fp1
    public void d(View view) {
        c90 y = y(view);
        if (y == null) {
            y = c90.e;
        }
        s(y);
    }

    @Override // defpackage.fp1
    public void e(ip1 ip1Var) {
        ip1Var.a.t(this.f);
        c90 c90Var = this.g;
        fp1 fp1Var = ip1Var.a;
        fp1Var.s(c90Var);
        fp1Var.u(this.h);
    }

    @Override // defpackage.fp1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        zo1 zo1Var = (zo1) obj;
        return Objects.equals(this.g, zo1Var.g) && A(this.h, zo1Var.h);
    }

    @Override // defpackage.fp1
    public c90 g(int i) {
        return v(i, false);
    }

    @Override // defpackage.fp1
    public c90 h(int i) {
        return v(i, true);
    }

    @Override // defpackage.fp1
    public final c90 l() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = c90.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.fp1
    public ip1 n(int i, int i2, int i3, int i4) {
        ip1 c = ip1.c(null, this.c);
        yo1 xo1Var = Build.VERSION.SDK_INT >= 34 ? new xo1(c) : new wo1(c);
        xo1Var.d(ip1.a(l(), i, i2, i3, i4));
        xo1Var.c(ip1.a(j(), i, i2, i3, i4));
        return xo1Var.b();
    }

    @Override // defpackage.fp1
    public boolean p() {
        return this.c.isRound();
    }

    @Override // defpackage.fp1
    public boolean q(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !z(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.fp1
    public void r(c90[] c90VarArr) {
        this.d = c90VarArr;
    }

    @Override // defpackage.fp1
    public void s(c90 c90Var) {
        this.g = c90Var;
    }

    @Override // defpackage.fp1
    public void t(ip1 ip1Var) {
        this.f = ip1Var;
    }

    @Override // defpackage.fp1
    public void u(int i) {
        this.h = i;
    }

    public c90 w(int i, boolean z) {
        c90 j;
        int i2;
        c90 c90Var = c90.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    c90[] c90VarArr = this.d;
                    j = c90VarArr != null ? c90VarArr[3] : null;
                    if (j != null) {
                        return j;
                    }
                    c90 l = l();
                    c90 x = x();
                    int i3 = l.d;
                    if (i3 > x.d) {
                        return c90.a(0, 0, 0, i3);
                    }
                    c90 c90Var2 = this.g;
                    if (c90Var2 != null && !c90Var2.equals(c90Var) && (i2 = this.g.d) > x.d) {
                        return c90.a(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return k();
                    }
                    if (i == 32) {
                        return i();
                    }
                    if (i == 64) {
                        return m();
                    }
                    if (i == 128) {
                        ip1 ip1Var = this.f;
                        ms f = ip1Var != null ? ip1Var.a.f() : f();
                        if (f != null) {
                            DisplayCutout displayCutout = f.a;
                            return c90.a(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                        }
                    }
                }
            } else {
                if (z) {
                    c90 x2 = x();
                    c90 j2 = j();
                    return c90.a(Math.max(x2.a, j2.a), 0, Math.max(x2.c, j2.c), Math.max(x2.d, j2.d));
                }
                if ((this.h & 2) == 0) {
                    c90 l2 = l();
                    ip1 ip1Var2 = this.f;
                    j = ip1Var2 != null ? ip1Var2.a.j() : null;
                    int i4 = l2.d;
                    if (j != null) {
                        i4 = Math.min(i4, j.d);
                    }
                    return c90.a(l2.a, 0, l2.c, i4);
                }
            }
        } else {
            if (z) {
                return c90.a(0, Math.max(x().b, l().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return c90.a(0, l().b, 0, 0);
            }
        }
        return c90Var;
    }

    public boolean z(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !w(i, false).equals(c90.e);
    }

    public zo1(ip1 ip1Var, WindowInsets windowInsets) {
        super(ip1Var);
        this.e = null;
        this.c = windowInsets;
    }
}
