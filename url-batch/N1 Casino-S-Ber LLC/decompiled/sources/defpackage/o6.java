package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class o6 {
    public final h6 d;
    public e30 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public o6(a6 a6Var) {
        this.d = new h6(this, a6Var);
    }

    public final void a(kq kqVar, int i) {
        e30 j = kqVar.j(i);
        h6 h6Var = this.d;
        h6Var.g(j, 1.0f);
        h6Var.g(kqVar.j(i), -1.0f);
    }

    public final void b(e30 e30Var, e30 e30Var2, e30 e30Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        h6 h6Var = this.d;
        if (z) {
            h6Var.g(e30Var, 1.0f);
            h6Var.g(e30Var2, -1.0f);
            h6Var.g(e30Var3, -1.0f);
        } else {
            h6Var.g(e30Var, -1.0f);
            h6Var.g(e30Var2, 1.0f);
            h6Var.g(e30Var3, 1.0f);
        }
    }

    public final void c(e30 e30Var, e30 e30Var2, e30 e30Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        h6 h6Var = this.d;
        if (z) {
            h6Var.g(e30Var, 1.0f);
            h6Var.g(e30Var2, -1.0f);
            h6Var.g(e30Var3, 1.0f);
        } else {
            h6Var.g(e30Var, -1.0f);
            h6Var.g(e30Var2, 1.0f);
            h6Var.g(e30Var3, -1.0f);
        }
    }

    public e30 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final e30 f(boolean[] zArr, e30 e30Var) {
        int i;
        h6 h6Var = this.d;
        int d = h6Var.d();
        e30 e30Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < d; i2++) {
            float f2 = h6Var.f(i2);
            if (f2 < 0.0f) {
                e30 e = h6Var.e(i2);
                if ((zArr == null || !zArr[e.g]) && e != e30Var && (((i = e.q) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    e30Var2 = e;
                }
            }
        }
        return e30Var2;
    }

    public final void g(e30 e30Var) {
        e30 e30Var2 = this.a;
        h6 h6Var = this.d;
        if (e30Var2 != null) {
            h6Var.g(e30Var2, -1.0f);
            this.a.h = -1;
            this.a = null;
        }
        float h = h6Var.h(e30Var, true) * (-1.0f);
        this.a = e30Var;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        int i = h6Var.h;
        for (int i2 = 0; i != -1 && i2 < h6Var.a; i2++) {
            float[] fArr = h6Var.g;
            fArr[i] = fArr[i] / h;
            i = h6Var.f[i];
        }
    }

    public final void h(kq kqVar, e30 e30Var, boolean z) {
        if (e30Var.k) {
            h6 h6Var = this.d;
            float c = h6Var.c(e30Var);
            this.b = (e30Var.j * c) + this.b;
            h6Var.h(e30Var, z);
            if (z) {
                e30Var.b(this);
            }
            if (h6Var.d() == 0) {
                this.e = true;
                kqVar.b = true;
            }
        }
    }

    public void i(kq kqVar, o6 o6Var, boolean z) {
        h6 h6Var = this.d;
        h6Var.getClass();
        float c = h6Var.c(o6Var.a);
        h6Var.h(o6Var.a, z);
        h6 h6Var2 = o6Var.d;
        int d = h6Var2.d();
        for (int i = 0; i < d; i++) {
            e30 e = h6Var2.e(i);
            h6Var.a(e, h6Var2.c(e) * c, z);
        }
        this.b = (o6Var.b * c) + this.b;
        if (z) {
            o6Var.a.b(this);
        }
        if (this.a == null || h6Var.d() != 0) {
            return;
        }
        this.e = true;
        kqVar.b = true;
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
        h6 h6Var = this.d;
        int d = h6Var.d();
        for (int i = 0; i < d; i++) {
            e30 e = h6Var.e(i);
            if (e != null) {
                float f = h6Var.f(i);
                if (f != 0.0f) {
                    String e30Var = e.toString();
                    if (!z) {
                        if (f < 0.0f) {
                            concat = concat.concat("- ");
                            f *= -1.0f;
                        }
                        concat = f == 1.0f ? concat.concat(e30Var) : concat + f + " " + e30Var;
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
