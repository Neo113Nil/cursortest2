package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class g00 extends y6 {
    public g60[] f;
    public g60[] g;
    public int h;
    public a5 i;

    @Override // defpackage.y6
    public final g60 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            g60[] g60VarArr = this.f;
            g60 g60Var = g60VarArr[i2];
            if (!zArr[g60Var.g]) {
                a5 a5Var = this.i;
                a5Var.g = g60Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((g60) a5Var.g).m[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    g60 g60Var2 = g60VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = g60Var2.m[i3];
                            float f3 = ((g60) a5Var.g).m[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.y6
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.y6
    public final void i(ys ysVar, y6 y6Var, boolean z) {
        g60 g60Var = y6Var.a;
        if (g60Var == null) {
            return;
        }
        float[] fArr = g60Var.m;
        r6 r6Var = y6Var.d;
        int d = r6Var.d();
        for (int i = 0; i < d; i++) {
            g60 e = r6Var.e(i);
            float f = r6Var.f(i);
            a5 a5Var = this.i;
            a5Var.g = e;
            if (e.f) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((g60) a5Var.g).m;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((g60) a5Var.g).m[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((g00) a5Var.h).k((g60) a5Var.g);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((g60) a5Var.g).m[i3] = f4;
                    } else {
                        ((g60) a5Var.g).m[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.b = (y6Var.b * f) + this.b;
        }
        k(g60Var);
    }

    public final void j(g60 g60Var) {
        int i;
        g60[] g60VarArr;
        int i2 = this.h + 1;
        g60[] g60VarArr2 = this.f;
        if (i2 > g60VarArr2.length) {
            g60[] g60VarArr3 = (g60[]) Arrays.copyOf(g60VarArr2, g60VarArr2.length * 2);
            this.f = g60VarArr3;
            this.g = (g60[]) Arrays.copyOf(g60VarArr3, g60VarArr3.length * 2);
        }
        g60[] g60VarArr4 = this.f;
        int i3 = this.h;
        g60VarArr4[i3] = g60Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && g60VarArr4[i3].g > g60Var.g) {
            int i5 = 0;
            while (true) {
                i = this.h;
                g60VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                g60VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(g60VarArr, 0, i, new cb(4));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        g60Var.f = true;
        g60Var.a(this);
    }

    public final void k(g60 g60Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == g60Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        g60Var.f = false;
                        return;
                    } else {
                        g60[] g60VarArr = this.f;
                        int i3 = i + 1;
                        g60VarArr[i] = g60VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.y6
    public final String toString() {
        a5 a5Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            a5Var.g = this.f[i];
            str = str + a5Var + " ";
        }
        return str;
    }
}
