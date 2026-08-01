package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class y6 {
    public final r6 d;
    public g60 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public y6(k6 k6Var) {
        this.d = new r6(this, k6Var);
    }

    public final void a(ys ysVar, int i) {
        g60 j = ysVar.j(i);
        r6 r6Var = this.d;
        r6Var.g(j, 1.0f);
        r6Var.g(ysVar.j(i), -1.0f);
    }

    public final void b(g60 g60Var, g60 g60Var2, g60 g60Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        r6 r6Var = this.d;
        if (z) {
            r6Var.g(g60Var, 1.0f);
            r6Var.g(g60Var2, -1.0f);
            r6Var.g(g60Var3, -1.0f);
        } else {
            r6Var.g(g60Var, -1.0f);
            r6Var.g(g60Var2, 1.0f);
            r6Var.g(g60Var3, 1.0f);
        }
    }

    public final void c(g60 g60Var, g60 g60Var2, g60 g60Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        r6 r6Var = this.d;
        if (z) {
            r6Var.g(g60Var, 1.0f);
            r6Var.g(g60Var2, -1.0f);
            r6Var.g(g60Var3, 1.0f);
        } else {
            r6Var.g(g60Var, -1.0f);
            r6Var.g(g60Var2, 1.0f);
            r6Var.g(g60Var3, -1.0f);
        }
    }

    public g60 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final g60 f(boolean[] zArr, g60 g60Var) {
        int i;
        r6 r6Var = this.d;
        int d = r6Var.d();
        g60 g60Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f2 = r6Var.f(i2);
            if (f2 < 0.0f) {
                g60 e = r6Var.e(i2);
                if ((zArr == null || !zArr[e.g]) && e != g60Var && (((i = e.q) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    g60Var2 = e;
                }
            }
        }
        return g60Var2;
    }

    public final void g(g60 g60Var) {
        g60 g60Var2 = this.a;
        r6 r6Var = this.d;
        if (g60Var2 != null) {
            r6Var.g(g60Var2, -1.0f);
            this.a.h = -1;
            this.a = null;
        }
        float h = r6Var.h(g60Var, true) * (-1.0f);
        this.a = g60Var;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        int i = r6Var.h;
        for (int i2 = 0; i != -1 && i2 < r6Var.a; i2++) {
            float[] fArr = r6Var.g;
            fArr[i] = fArr[i] / h;
            i = r6Var.f[i];
        }
    }

    public final void h(ys ysVar, g60 g60Var, boolean z) {
        if (g60Var.k) {
            r6 r6Var = this.d;
            float c = r6Var.c(g60Var);
            this.b = (g60Var.j * c) + this.b;
            r6Var.h(g60Var, z);
            if (z) {
                g60Var.b(this);
            }
            if (r6Var.d() == 0) {
                this.e = true;
                ysVar.b = true;
            }
        }
    }

    public void i(ys ysVar, y6 y6Var, boolean z) {
        r6 r6Var = this.d;
        r6Var.getClass();
        float c = r6Var.c(y6Var.a);
        r6Var.h(y6Var.a, z);
        r6 r6Var2 = y6Var.d;
        int d = r6Var2.d();
        for (int i = 0; i < d; i++) {
            g60 e = r6Var2.e(i);
            r6Var.a(e, r6Var2.c(e) * c, z);
        }
        this.b = (y6Var.b * c) + this.b;
        if (z) {
            y6Var.a.b(this);
        }
        if (this.a == null || r6Var.d() != 0) {
            return;
        }
        this.e = true;
        ysVar.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z;
        String concat = (this.a == null ? "0" : "" + this.a).concat(" = ");
        if (this.b != 0.0f) {
            concat = concat + this.b;
            z = true;
        } else {
            z = false;
        }
        r6 r6Var = this.d;
        int d = r6Var.d();
        for (int i = 0; i < d; i++) {
            g60 e = r6Var.e(i);
            if (e != null) {
                float f = r6Var.f(i);
                if (f != 0.0f) {
                    String g60Var = e.toString();
                    if (!z) {
                        if (f < 0.0f) {
                            concat = concat.concat("- ");
                            f *= -1.0f;
                        }
                        concat = f == 1.0f ? concat.concat(g60Var) : concat + f + " " + g60Var;
                        z = true;
                    } else if (f > 0.0f) {
                        concat = concat.concat(" + ");
                        if (f == 1.0f) {
                        }
                        z = true;
                    } else {
                        concat = concat.concat(" - ");
                        f *= -1.0f;
                        if (f == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        return !z ? concat.concat("0.0") : concat;
    }
}
