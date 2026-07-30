package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wm1 implements sm1 {
    public final dn0 d;
    public final en0 e;
    public final int g;
    public final pu h;
    public int[] i = rm1.a;
    public float[] j;
    public v7 k;
    public v7 l;
    public v7 m;
    public v7 n;
    public float[] o;
    public float[] p;
    public s40 q;

    public wm1(dn0 dn0Var, en0 en0Var, int i, pu puVar) {
        this.d = dn0Var;
        this.e = en0Var;
        this.g = i;
        this.h = puVar;
        float[] fArr = rm1.b;
        this.j = fArr;
        this.o = fArr;
        this.p = fArr;
        this.q = rm1.c;
    }

    public final int c(int i) {
        int i2;
        dn0 dn0Var = this.d;
        int i3 = dn0Var.b;
        if (i3 <= 0) {
            throw new IndexOutOfBoundsException("");
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = dn0Var.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float d(int i, int i2, boolean z) {
        pu puVar;
        float f;
        dn0 dn0Var = this.d;
        if (i >= dn0Var.b - 1) {
            f = i2;
        } else {
            int c = dn0Var.c(i);
            int c2 = dn0Var.c(i + 1);
            if (i2 != c) {
                int i3 = c2 - c;
                vm1 vm1Var = (vm1) this.e.b(c);
                if (vm1Var == null || (puVar = vm1Var.b) == null) {
                    puVar = this.h;
                }
                float f2 = i3;
                float a = puVar.a((i2 - c) / f2);
                return z ? a : ((f2 * a) + c) / 1000.0f;
            }
            f = c;
        }
        return f / 1000.0f;
    }

    public final void e(v7 v7Var, v7 v7Var2, v7 v7Var3) {
        float[] fArr;
        boolean z = this.q != rm1.c;
        v7 v7Var4 = this.k;
        en0 en0Var = this.e;
        dn0 dn0Var = this.d;
        if (v7Var4 == null) {
            this.k = v7Var.c();
            this.l = v7Var3.c();
            int i = dn0Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = dn0Var.c(i2) / 1000.0f;
            }
            this.j = fArr2;
            int i3 = dn0Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.i = iArr;
        }
        if (z) {
            if (this.q != rm1.c && Intrinsics.a(this.m, v7Var) && Intrinsics.a(this.n, v7Var2)) {
                return;
            }
            this.m = v7Var;
            this.n = v7Var2;
            int b = v7Var.b() + (v7Var.b() % 2);
            this.o = new float[b];
            this.p = new float[b];
            int i5 = dn0Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int c = dn0Var.c(i6);
                vm1 vm1Var = (vm1) en0Var.b(c);
                if (c == 0 && vm1Var == null) {
                    fArr = new float[b];
                    for (int i7 = 0; i7 < b; i7++) {
                        fArr[i7] = v7Var.a(i7);
                    }
                } else if (c == this.g && vm1Var == null) {
                    fArr = new float[b];
                    for (int i8 = 0; i8 < b; i8++) {
                        fArr[i8] = v7Var2.a(i8);
                    }
                } else {
                    vm1Var.getClass();
                    v7 v7Var5 = vm1Var.a;
                    float[] fArr4 = new float[b];
                    for (int i9 = 0; i9 < b; i9++) {
                        fArr4[i9] = v7Var5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.q = new s40(this.i, this.j, fArr3);
        }
    }

    @Override // defpackage.sm1
    public final int g() {
        return 0;
    }

    @Override // defpackage.qm1
    public final v7 h(long j, v7 v7Var, v7 v7Var2, v7 v7Var3) {
        long j2 = j / 1000000;
        int[] iArr = rm1.a;
        long j3 = this.g;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return v7Var3;
        }
        e(v7Var, v7Var2, v7Var3);
        v7 v7Var4 = this.l;
        v7Var4.getClass();
        int i = 0;
        if (this.q != rm1.c) {
            int i2 = (int) j4;
            float d = d(c(i2), i2, false);
            float[] fArr = this.p;
            c9[][] c9VarArr = (c9[][]) this.q.e;
            float f = c9VarArr[0][0].a;
            float f2 = c9VarArr[c9VarArr.length - 1][0].b;
            if (d < f) {
                d = f;
            }
            if (d <= f2) {
                f2 = d;
            }
            int length = fArr.length;
            boolean z = false;
            for (c9[] c9VarArr2 : c9VarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    c9 c9Var = c9VarArr2[i4];
                    if (f2 <= c9Var.b) {
                        if (c9Var.p) {
                            fArr[i3] = c9Var.q;
                            fArr[i3 + 1] = c9Var.r;
                        } else {
                            c9Var.c(f2);
                            fArr[i3] = c9Var.a();
                            fArr[i3 + 1] = c9Var.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                v7Var4.e(fArr[i], i);
                i++;
            }
        } else {
            v7 m = m((j4 - 1) * 1000000, v7Var, v7Var2, v7Var3);
            v7 m2 = m(j4 * 1000000, v7Var, v7Var2, v7Var3);
            int b = m.b();
            while (i < b) {
                v7Var4.e((m.a(i) - m2.a(i)) * 1000.0f, i);
                i++;
            }
        }
        return v7Var4;
    }

    @Override // defpackage.sm1
    public final int l() {
        return this.g;
    }

    @Override // defpackage.qm1
    public final v7 m(long j, v7 v7Var, v7 v7Var2, v7 v7Var3) {
        v7 v7Var4;
        v7 v7Var5;
        c9[][] c9VarArr;
        v7 v7Var6 = v7Var;
        long j2 = j / 1000000;
        int[] iArr = rm1.a;
        int i = this.g;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        en0 en0Var = this.e;
        vm1 vm1Var = (vm1) en0Var.b(i2);
        if (vm1Var != null) {
            return vm1Var.a;
        }
        if (i2 >= i) {
            return v7Var2;
        }
        if (i2 <= 0) {
            return v7Var6;
        }
        e(v7Var6, v7Var2, v7Var3);
        v7 v7Var7 = this.k;
        v7Var7.getClass();
        int i3 = 0;
        if (this.q != rm1.c) {
            float d = d(c(i2), i2, false);
            float[] fArr = this.o;
            c9[][] c9VarArr2 = (c9[][]) this.q.e;
            int length = c9VarArr2.length - 1;
            float f = c9VarArr2[0][0].a;
            float f2 = c9VarArr2[length][0].b;
            int length2 = fArr.length;
            if (d < f || d > f2) {
                if (d > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = d - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    c9 c9Var = c9VarArr2[length][i5];
                    boolean z = c9Var.p;
                    float f4 = c9Var.r;
                    float f5 = c9Var.q;
                    if (z) {
                        float f6 = c9Var.a;
                        float f7 = c9Var.k;
                        float f8 = c9Var.c;
                        c9VarArr = c9VarArr2;
                        fArr[i4] = (f5 * f3) + ((c9Var.e - f8) * (f - f6) * f7) + f8;
                        float f9 = (f - f6) * f7;
                        float f10 = c9Var.d;
                        fArr[i4 + 1] = (f4 * f3) + ((c9Var.f - f10) * f9) + f10;
                    } else {
                        c9VarArr = c9VarArr2;
                        c9Var.c(f);
                        fArr[i4] = (c9Var.a() * f3) + (c9Var.n * c9Var.h) + f5;
                        fArr[i4 + 1] = (c9Var.b() * f3) + (c9Var.o * c9Var.i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    c9VarArr2 = c9VarArr;
                }
            } else {
                int length3 = c9VarArr2.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        c9 c9Var2 = c9VarArr2[i6][i8];
                        if (d <= c9Var2.b) {
                            if (c9Var2.p) {
                                float f11 = c9Var2.a;
                                float f12 = c9Var2.k;
                                float f13 = c9Var2.c;
                                fArr[i7] = ((c9Var2.e - f13) * (d - f11) * f12) + f13;
                                float f14 = c9Var2.d;
                                fArr[i7 + 1] = ((c9Var2.f - f14) * (d - f11) * f12) + f14;
                            } else {
                                c9Var2.c(d);
                                fArr[i7] = (c9Var2.n * c9Var2.h) + c9Var2.q;
                                fArr[i7 + 1] = (c9Var2.o * c9Var2.i) + c9Var2.r;
                            }
                            z2 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z2) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                v7Var7.e(fArr[i9], i9);
            }
        } else {
            int c = c(i2);
            float d2 = d(c, i2, true);
            dn0 dn0Var = this.d;
            vm1 vm1Var2 = (vm1) en0Var.b(dn0Var.c(c));
            if (vm1Var2 != null && (v7Var5 = vm1Var2.a) != null) {
                v7Var6 = v7Var5;
            }
            vm1 vm1Var3 = (vm1) en0Var.b(dn0Var.c(c + 1));
            if (vm1Var3 == null || (v7Var4 = vm1Var3.a) == null) {
                v7Var4 = v7Var2;
            }
            int b = v7Var7.b();
            for (int i10 = 0; i10 < b; i10++) {
                v7Var7.e((v7Var4.a(i10) * d2) + ((1.0f - d2) * v7Var6.a(i10)), i10);
            }
        }
        return v7Var7;
    }
}
