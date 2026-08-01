package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class qx extends f7 {
    public p30[] f;
    public p30[] g;
    public int h;
    public h5 i;

    @Override // defpackage.f7
    public final p30 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            p30[] p30VarArr = this.f;
            p30 p30Var = p30VarArr[i2];
            if (!zArr[p30Var.g]) {
                h5 h5Var = this.i;
                h5Var.g = p30Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((p30) h5Var.g).m[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    p30 p30Var2 = p30VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = p30Var2.m[i3];
                            float f3 = ((p30) h5Var.g).m[i3];
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

    @Override // defpackage.f7
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.f7
    public final void i(xq xqVar, f7 f7Var, boolean z) {
        p30 p30Var = f7Var.a;
        if (p30Var == null) {
            return;
        }
        float[] fArr = p30Var.m;
        y6 y6Var = f7Var.d;
        int d = y6Var.d();
        for (int i = 0; i < d; i++) {
            p30 e = y6Var.e(i);
            float f = y6Var.f(i);
            h5 h5Var = this.i;
            h5Var.g = e;
            if (e.f) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((p30) h5Var.g).m;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((p30) h5Var.g).m[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((qx) h5Var.h).k((p30) h5Var.g);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((p30) h5Var.g).m[i3] = f4;
                    } else {
                        ((p30) h5Var.g).m[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.b = (f7Var.b * f) + this.b;
        }
        k(p30Var);
    }

    public final void j(p30 p30Var) {
        int i;
        p30[] p30VarArr;
        int i2 = this.h + 1;
        p30[] p30VarArr2 = this.f;
        if (i2 > p30VarArr2.length) {
            p30[] p30VarArr3 = (p30[]) Arrays.copyOf(p30VarArr2, p30VarArr2.length * 2);
            this.f = p30VarArr3;
            this.g = (p30[]) Arrays.copyOf(p30VarArr3, p30VarArr3.length * 2);
        }
        p30[] p30VarArr4 = this.f;
        int i3 = this.h;
        p30VarArr4[i3] = p30Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && p30VarArr4[i3].g > p30Var.g) {
            int i5 = 0;
            while (true) {
                i = this.h;
                p30VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                p30VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(p30VarArr, 0, i, new ma(3));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        p30Var.f = true;
        p30Var.a(this);
    }

    public final void k(p30 p30Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == p30Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        p30Var.f = false;
                        return;
                    } else {
                        p30[] p30VarArr = this.f;
                        int i3 = i + 1;
                        p30VarArr[i] = p30VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.f7
    public final String toString() {
        h5 h5Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            h5Var.g = this.f[i];
            str = str + h5Var + " ";
        }
        return str;
    }
}
