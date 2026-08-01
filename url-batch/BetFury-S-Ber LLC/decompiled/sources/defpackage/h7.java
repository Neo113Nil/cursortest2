package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class h7 {
    public final a7 d;
    public je0 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public h7(s6 s6Var) {
        this.d = new a7(this, s6Var);
    }

    public final void a(xx xxVar, int i) {
        je0 j = xxVar.j(i);
        a7 a7Var = this.d;
        a7Var.g(j, 1.0f);
        a7Var.g(xxVar.j(i), -1.0f);
    }

    public final void b(je0 je0Var, je0 je0Var2, je0 je0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        a7 a7Var = this.d;
        if (z) {
            a7Var.g(je0Var, 1.0f);
            a7Var.g(je0Var2, -1.0f);
            a7Var.g(je0Var3, -1.0f);
        } else {
            a7Var.g(je0Var, -1.0f);
            a7Var.g(je0Var2, 1.0f);
            a7Var.g(je0Var3, 1.0f);
        }
    }

    public final void c(je0 je0Var, je0 je0Var2, je0 je0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        a7 a7Var = this.d;
        if (z) {
            a7Var.g(je0Var, 1.0f);
            a7Var.g(je0Var2, -1.0f);
            a7Var.g(je0Var3, 1.0f);
        } else {
            a7Var.g(je0Var, -1.0f);
            a7Var.g(je0Var2, 1.0f);
            a7Var.g(je0Var3, -1.0f);
        }
    }

    public je0 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final je0 f(boolean[] zArr, je0 je0Var) {
        ie0 ie0Var;
        a7 a7Var = this.d;
        int d = a7Var.d();
        je0 je0Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < d; i++) {
            float f2 = a7Var.f(i);
            if (f2 < 0.0f) {
                je0 e = a7Var.e(i);
                if ((zArr == null || !zArr[e.g]) && e != je0Var && (((ie0Var = e.n) == ie0.SLACK || ie0Var == ie0.ERROR) && f2 < f)) {
                    f = f2;
                    je0Var2 = e;
                }
            }
        }
        return je0Var2;
    }

    public final void g(je0 je0Var) {
        je0 je0Var2 = this.a;
        a7 a7Var = this.d;
        if (je0Var2 != null) {
            a7Var.g(je0Var2, -1.0f);
            this.a.h = -1;
            this.a = null;
        }
        float h = a7Var.h(je0Var, true) * (-1.0f);
        this.a = je0Var;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        int i = a7Var.h;
        for (int i2 = 0; i != -1 && i2 < a7Var.a; i2++) {
            float[] fArr = a7Var.g;
            fArr[i] = fArr[i] / h;
            i = a7Var.f[i];
        }
    }

    public final void h(xx xxVar, je0 je0Var, boolean z) {
        if (je0Var.k) {
            a7 a7Var = this.d;
            float c = a7Var.c(je0Var);
            this.b = (je0Var.j * c) + this.b;
            a7Var.h(je0Var, z);
            if (z) {
                je0Var.b(this);
            }
            if (a7Var.d() == 0) {
                this.e = true;
                xxVar.b = true;
            }
        }
    }

    public void i(xx xxVar, h7 h7Var, boolean z) {
        a7 a7Var = this.d;
        a7Var.getClass();
        float c = a7Var.c(h7Var.a);
        a7Var.h(h7Var.a, z);
        a7 a7Var2 = h7Var.d;
        int d = a7Var2.d();
        for (int i = 0; i < d; i++) {
            je0 e = a7Var2.e(i);
            a7Var.a(e, a7Var2.c(e) * c, z);
        }
        this.b = (h7Var.b * c) + this.b;
        if (z) {
            h7Var.a.b(this);
        }
        if (this.a == null || a7Var.d() != 0) {
            return;
        }
        this.e = true;
        xxVar.b = true;
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
        a7 a7Var = this.d;
        int d = a7Var.d();
        for (int i = 0; i < d; i++) {
            je0 e = a7Var.e(i);
            if (e != null) {
                float f = a7Var.f(i);
                if (f != 0.0f) {
                    String je0Var = e.toString();
                    if (!z) {
                        if (f < 0.0f) {
                            concat = concat.concat("- ");
                            f *= -1.0f;
                        }
                        concat = f == 1.0f ? concat.concat(je0Var) : concat + f + " " + je0Var;
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
