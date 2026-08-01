package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class k60 extends h7 {
    public je0[] f;
    public je0[] g;
    public int h;
    public i5 i;

    @Override // defpackage.h7
    public final je0 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            je0[] je0VarArr = this.f;
            je0 je0Var = je0VarArr[i2];
            if (!zArr[je0Var.g]) {
                i5 i5Var = this.i;
                i5Var.g = je0Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((je0) i5Var.g).m[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    je0 je0Var2 = je0VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = je0Var2.m[i3];
                            float f3 = ((je0) i5Var.g).m[i3];
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

    @Override // defpackage.h7
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.h7
    public final void i(xx xxVar, h7 h7Var, boolean z) {
        je0 je0Var = h7Var.a;
        if (je0Var == null) {
            return;
        }
        float[] fArr = je0Var.m;
        a7 a7Var = h7Var.d;
        int d = a7Var.d();
        for (int i = 0; i < d; i++) {
            je0 e = a7Var.e(i);
            float f = a7Var.f(i);
            i5 i5Var = this.i;
            i5Var.g = e;
            if (e.f) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((je0) i5Var.g).m;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((je0) i5Var.g).m[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((k60) i5Var.h).k((je0) i5Var.g);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((je0) i5Var.g).m[i3] = f4;
                    } else {
                        ((je0) i5Var.g).m[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.b = (h7Var.b * f) + this.b;
        }
        k(je0Var);
    }

    public final void j(je0 je0Var) {
        int i;
        je0[] je0VarArr;
        int i2 = this.h + 1;
        je0[] je0VarArr2 = this.f;
        if (i2 > je0VarArr2.length) {
            je0[] je0VarArr3 = (je0[]) Arrays.copyOf(je0VarArr2, je0VarArr2.length * 2);
            this.f = je0VarArr3;
            this.g = (je0[]) Arrays.copyOf(je0VarArr3, je0VarArr3.length * 2);
        }
        je0[] je0VarArr4 = this.f;
        int i3 = this.h;
        je0VarArr4[i3] = je0Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && je0VarArr4[i3].g > je0Var.g) {
            int i5 = 0;
            while (true) {
                i = this.h;
                je0VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                je0VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(je0VarArr, 0, i, new yb(4));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        je0Var.f = true;
        je0Var.a(this);
    }

    public final void k(je0 je0Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == je0Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        je0Var.f = false;
                        return;
                    } else {
                        je0[] je0VarArr = this.f;
                        int i3 = i + 1;
                        je0VarArr[i] = je0VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.h7
    public final String toString() {
        i5 i5Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            i5Var.g = this.f[i];
            str = str + i5Var + " ";
        }
        return str;
    }
}
