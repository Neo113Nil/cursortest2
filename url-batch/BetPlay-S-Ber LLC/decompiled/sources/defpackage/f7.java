package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class f7 {
    public final y6 d;
    public p30 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public f7(r6 r6Var) {
        this.d = new y6(this, r6Var);
    }

    public final void a(xq xqVar, int i) {
        p30 j = xqVar.j(i);
        y6 y6Var = this.d;
        y6Var.g(j, 1.0f);
        y6Var.g(xqVar.j(i), -1.0f);
    }

    public final void b(p30 p30Var, p30 p30Var2, p30 p30Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        y6 y6Var = this.d;
        if (z) {
            y6Var.g(p30Var, 1.0f);
            y6Var.g(p30Var2, -1.0f);
            y6Var.g(p30Var3, -1.0f);
        } else {
            y6Var.g(p30Var, -1.0f);
            y6Var.g(p30Var2, 1.0f);
            y6Var.g(p30Var3, 1.0f);
        }
    }

    public final void c(p30 p30Var, p30 p30Var2, p30 p30Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        y6 y6Var = this.d;
        if (z) {
            y6Var.g(p30Var, 1.0f);
            y6Var.g(p30Var2, -1.0f);
            y6Var.g(p30Var3, 1.0f);
        } else {
            y6Var.g(p30Var, -1.0f);
            y6Var.g(p30Var2, 1.0f);
            y6Var.g(p30Var3, -1.0f);
        }
    }

    public p30 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final p30 f(boolean[] zArr, p30 p30Var) {
        int i;
        y6 y6Var = this.d;
        int d = y6Var.d();
        p30 p30Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f2 = y6Var.f(i2);
            if (f2 < 0.0f) {
                p30 e = y6Var.e(i2);
                if ((zArr == null || !zArr[e.g]) && e != p30Var && (((i = e.q) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    p30Var2 = e;
                }
            }
        }
        return p30Var2;
    }

    public final void g(p30 p30Var) {
        p30 p30Var2 = this.a;
        y6 y6Var = this.d;
        if (p30Var2 != null) {
            y6Var.g(p30Var2, -1.0f);
            this.a.h = -1;
            this.a = null;
        }
        float h = y6Var.h(p30Var, true) * (-1.0f);
        this.a = p30Var;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        int i = y6Var.h;
        for (int i2 = 0; i != -1 && i2 < y6Var.a; i2++) {
            float[] fArr = y6Var.g;
            fArr[i] = fArr[i] / h;
            i = y6Var.f[i];
        }
    }

    public final void h(xq xqVar, p30 p30Var, boolean z) {
        if (p30Var.k) {
            y6 y6Var = this.d;
            float c = y6Var.c(p30Var);
            this.b = (p30Var.j * c) + this.b;
            y6Var.h(p30Var, z);
            if (z) {
                p30Var.b(this);
            }
            if (y6Var.d() == 0) {
                this.e = true;
                xqVar.b = true;
            }
        }
    }

    public void i(xq xqVar, f7 f7Var, boolean z) {
        y6 y6Var = this.d;
        y6Var.getClass();
        float c = y6Var.c(f7Var.a);
        y6Var.h(f7Var.a, z);
        y6 y6Var2 = f7Var.d;
        int d = y6Var2.d();
        for (int i = 0; i < d; i++) {
            p30 e = y6Var2.e(i);
            y6Var.a(e, y6Var2.c(e) * c, z);
        }
        this.b = (f7Var.b * c) + this.b;
        if (z) {
            f7Var.a.b(this);
        }
        if (this.a == null || y6Var.d() != 0) {
            return;
        }
        this.e = true;
        xqVar.b = true;
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
        y6 y6Var = this.d;
        int d = y6Var.d();
        for (int i = 0; i < d; i++) {
            p30 e = y6Var.e(i);
            if (e != null) {
                float f = y6Var.f(i);
                if (f != 0.0f) {
                    String p30Var = e.toString();
                    if (!z) {
                        if (f < 0.0f) {
                            concat = concat.concat("- ");
                            f *= -1.0f;
                        }
                        concat = f == 1.0f ? concat.concat(p30Var) : concat + f + " " + p30Var;
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
