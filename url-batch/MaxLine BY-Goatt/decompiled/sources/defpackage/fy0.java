package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fy0 {
    public final fq a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public kx0[] e = new kx0[8];
    public int f = 7;

    public fy0(fq fqVar) {
        this.a = fqVar;
    }

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f;
                if (length < i2 || i <= 0) {
                    break;
                }
                kx0 kx0Var = this.e[length];
                kx0Var.getClass();
                i -= kx0Var.c;
                int i4 = this.h;
                kx0 kx0Var2 = this.e[length];
                kx0Var2.getClass();
                this.h = i4 - kx0Var2.c;
                this.g--;
                i3++;
                length--;
            }
            kx0[] kx0VarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(kx0VarArr, i5, kx0VarArr, i5 + i3, this.g);
            kx0[] kx0VarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(kx0VarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(kx0 kx0Var) {
        int i = kx0Var.c;
        int i2 = this.d;
        if (i > i2) {
            kx0[] kx0VarArr = this.e;
            ni.k(0, kx0VarArr.length, null, kx0VarArr);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        kx0[] kx0VarArr2 = this.e;
        if (i3 > kx0VarArr2.length) {
            kx0[] kx0VarArr3 = new kx0[kx0VarArr2.length * 2];
            System.arraycopy(kx0VarArr2, 0, kx0VarArr3, kx0VarArr2.length, kx0VarArr2.length);
            this.f = this.e.length - 1;
            this.e = kx0VarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = kx0Var;
        this.g++;
        this.h += i;
    }

    public final void c(dr drVar) {
        drVar.getClass();
        int[] iArr = lz0.a;
        int c = drVar.c();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < c; i++) {
            byte h = drVar.h(i);
            byte[] bArr = n33.a;
            j2 += lz0.b[h & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int c2 = drVar.c();
        fq fqVar = this.a;
        if (i2 >= c2) {
            e(drVar.c(), 127, 0);
            fqVar.H(drVar);
            return;
        }
        fq fqVar2 = new fq();
        int[] iArr2 = lz0.a;
        int c3 = drVar.c();
        int i3 = 0;
        for (int i4 = 0; i4 < c3; i4++) {
            byte h2 = drVar.h(i4);
            byte[] bArr2 = n33.a;
            int i5 = h2 & 255;
            int i6 = lz0.a[i5];
            byte b = lz0.b[i5];
            j = (j << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                fqVar2.L((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            fqVar2.L((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        dr k = fqVar2.k(fqVar2.n);
        e(k.c(), 127, 128);
        fqVar.H(k);
    }

    public final void d(ArrayList arrayList) {
        int i;
        int i2;
        if (this.c) {
            int i3 = this.b;
            if (i3 < this.d) {
                e(i3, 31, 32);
            }
            this.c = false;
            this.b = Integer.MAX_VALUE;
            e(this.d, 31, 32);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            kx0 kx0Var = (kx0) arrayList.get(i4);
            dr o = kx0Var.a.o();
            dr drVar = kx0Var.b;
            Integer num = (Integer) gy0.b.get(o);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    kx0[] kx0VarArr = gy0.a;
                    if (Intrinsics.b(kx0VarArr[intValue].b, drVar)) {
                        i = i2;
                    } else if (Intrinsics.b(kx0VarArr[i2].b, drVar)) {
                        i2 = intValue + 2;
                        i = i2;
                    }
                }
                i = i2;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
            }
            if (i2 == -1) {
                int i5 = this.f + 1;
                int length = this.e.length;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    kx0 kx0Var2 = this.e[i5];
                    kx0Var2.getClass();
                    if (Intrinsics.b(kx0Var2.a, o)) {
                        kx0 kx0Var3 = this.e[i5];
                        kx0Var3.getClass();
                        if (Intrinsics.b(kx0Var3.b, drVar)) {
                            i2 = gy0.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + gy0.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.a.L(64);
                c(o);
                c(drVar);
                b(kx0Var);
            } else {
                dr drVar2 = kx0.d;
                o.getClass();
                drVar2.getClass();
                if (!o.k(0, drVar2, drVar2.c()) || Intrinsics.b(kx0.i, o)) {
                    e(i, 63, 64);
                    c(drVar);
                    b(kx0Var);
                } else {
                    e(i, 15, 0);
                    c(drVar);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        fq fqVar = this.a;
        if (i < i2) {
            fqVar.L(i | i3);
            return;
        }
        fqVar.L(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            fqVar.L(128 | (i4 & 127));
            i4 >>>= 7;
        }
        fqVar.L(i4);
    }
}
