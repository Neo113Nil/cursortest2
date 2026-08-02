package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ru {
    ry a = null;
    public float b = 0.0f;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public rt e;

    public ru(byo byoVar) {
        this.e = new rt(this, byoVar);
    }

    public static final boolean l(ry ryVar) {
        return ryVar.l <= 1;
    }

    public final ry a(boolean[] zArr, ry ryVar) {
        int i;
        int i2 = this.e.a;
        ry ryVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float b = this.e.b(i3);
            if (b < 0.0f) {
                ry d = this.e.d(i3);
                if ((zArr == null || !zArr[d.c]) && d != ryVar && (((i = d.n) == 3 || i == 4) && b < f)) {
                    f = b;
                    ryVar2 = d;
                }
            }
        }
        return ryVar2;
    }

    final void b(ry ryVar) {
        ry ryVar2 = this.a;
        if (ryVar2 != null) {
            this.e.g(ryVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(ryVar, true);
        this.a = ryVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        rt rtVar = this.e;
        int i = rtVar.e;
        for (int i2 = 0; i != -1 && i2 < rtVar.a; i2++) {
            float[] fArr = rtVar.d;
            fArr[i] = fArr[i] / f;
            i = rtVar.c[i];
        }
    }

    public final void c(rv rvVar, ry ryVar, boolean z) {
        if (ryVar == null || !ryVar.g) {
            return;
        }
        this.b += ryVar.f * this.e.a(ryVar);
        this.e.c(ryVar, z);
        if (z) {
            ryVar.b(this);
        }
        if (this.e.a == 0) {
            this.d = true;
            rvVar.c = true;
        }
    }

    public void d(rv rvVar, ru ruVar, boolean z) {
        rt rtVar = this.e;
        float a = rtVar.a(ruVar.a);
        rtVar.c(ruVar.a, z);
        rt rtVar2 = ruVar.e;
        int i = rtVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            ry d = rtVar2.d(i2);
            rtVar.e(d, rtVar2.a(d) * a, z);
        }
        this.b += ruVar.b * a;
        if (z) {
            ruVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        rvVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(rv rvVar, int i) {
        this.e.g(rvVar.p(i), 1.0f);
        this.e.g(rvVar.p(i), -1.0f);
    }

    public final void g(ry ryVar, ry ryVar2, ry ryVar3, ry ryVar4, float f) {
        this.e.g(ryVar, -1.0f);
        this.e.g(ryVar2, 1.0f);
        this.e.g(ryVar3, f);
        this.e.g(ryVar4, -f);
    }

    public final void h(ry ryVar, ry ryVar2, ry ryVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(ryVar, 1.0f);
                this.e.g(ryVar2, -1.0f);
                this.e.g(ryVar3, -1.0f);
                return;
            }
        }
        this.e.g(ryVar, -1.0f);
        this.e.g(ryVar2, 1.0f);
        this.e.g(ryVar3, 1.0f);
    }

    public final void i(ry ryVar, ry ryVar2, ry ryVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(ryVar, 1.0f);
                this.e.g(ryVar2, -1.0f);
                this.e.g(ryVar3, 1.0f);
                return;
            }
        }
        this.e.g(ryVar, -1.0f);
        this.e.g(ryVar2, 1.0f);
        this.e.g(ryVar3, -1.0f);
    }

    public final void j(ry ryVar, ry ryVar2, ry ryVar3, ry ryVar4, float f) {
        this.e.g(ryVar3, 0.5f);
        this.e.g(ryVar4, 0.5f);
        this.e.g(ryVar, -0.5f);
        this.e.g(ryVar2, -0.5f);
        this.b = -f;
    }

    public ry k(boolean[] zArr) {
        return a(zArr, null);
    }

    public String toString() {
        boolean z;
        String str;
        ry ryVar = this.a;
        String concat = ryVar == null ? "0" : "".concat(ryVar.toString());
        float f = this.b;
        String concat2 = concat.concat(" = ");
        if (f != 0.0f) {
            concat2 = concat2 + f;
            z = true;
        } else {
            z = false;
        }
        int i = this.e.a;
        for (int i2 = 0; i2 < i; i2++) {
            ry d = this.e.d(i2);
            if (d != null) {
                float b = this.e.b(i2);
                if (b != 0.0f) {
                    String ryVar2 = d.toString();
                    if (z) {
                        if (b > 0.0f) {
                            str = " + ";
                        } else {
                            b = -b;
                            str = " - ";
                        }
                        concat2 = concat2.concat(str);
                    } else if (b < 0.0f) {
                        b = -b;
                        concat2 = concat2.concat("- ");
                    }
                    concat2 = b == 1.0f ? concat2.concat(ryVar2) : concat2 + b + " " + ryVar2;
                    z = true;
                }
            }
        }
        return !z ? concat2.concat("0.0") : concat2;
    }

    public ru() {
    }
}
