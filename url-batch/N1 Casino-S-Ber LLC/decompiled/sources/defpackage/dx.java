package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class dx extends o6 {
    public e30[] f;
    public e30[] g;
    public int h;
    public q4 i;

    @Override // defpackage.o6
    public final e30 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            e30[] e30VarArr = this.f;
            e30 e30Var = e30VarArr[i2];
            if (!zArr[e30Var.g]) {
                q4 q4Var = this.i;
                q4Var.g = e30Var;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((e30) q4Var.g).m[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    e30 e30Var2 = e30VarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = e30Var2.m[i3];
                            float f3 = ((e30) q4Var.g).m[i3];
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

    @Override // defpackage.o6
    public final boolean e() {
        return this.h == 0;
    }

    @Override // defpackage.o6
    public final void i(kq kqVar, o6 o6Var, boolean z) {
        e30 e30Var = o6Var.a;
        if (e30Var == null) {
            return;
        }
        float[] fArr = e30Var.m;
        h6 h6Var = o6Var.d;
        int d = h6Var.d();
        for (int i = 0; i < d; i++) {
            e30 e = h6Var.e(i);
            float f = h6Var.f(i);
            q4 q4Var = this.i;
            q4Var.g = e;
            if (e.f) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((e30) q4Var.g).m;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((e30) q4Var.g).m[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((dx) q4Var.h).k((e30) q4Var.g);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((e30) q4Var.g).m[i3] = f4;
                    } else {
                        ((e30) q4Var.g).m[i3] = 0.0f;
                    }
                }
                j(e);
            }
            this.b = (o6Var.b * f) + this.b;
        }
        k(e30Var);
    }

    public final void j(e30 e30Var) {
        int i;
        e30[] e30VarArr;
        int i2 = this.h + 1;
        e30[] e30VarArr2 = this.f;
        if (i2 > e30VarArr2.length) {
            e30[] e30VarArr3 = (e30[]) Arrays.copyOf(e30VarArr2, e30VarArr2.length * 2);
            this.f = e30VarArr3;
            this.g = (e30[]) Arrays.copyOf(e30VarArr3, e30VarArr3.length * 2);
        }
        e30[] e30VarArr4 = this.f;
        int i3 = this.h;
        e30VarArr4[i3] = e30Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && e30VarArr4[i3].g > e30Var.g) {
            int i5 = 0;
            while (true) {
                i = this.h;
                e30VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                e30VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(e30VarArr, 0, i, new ja(5));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        e30Var.f = true;
        e30Var.a(this);
    }

    public final void k(e30 e30Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == e30Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        e30Var.f = false;
                        return;
                    } else {
                        e30[] e30VarArr = this.f;
                        int i3 = i + 1;
                        e30VarArr[i] = e30VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.o6
    public final String toString() {
        q4 q4Var = this.i;
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            q4Var.g = this.f[i];
            str = str + q4Var + " ";
        }
        return str;
    }
}
