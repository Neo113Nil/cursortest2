package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class lt {
    public final t9 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public xs[] e = new xs[8];
    public int f = 7;

    public lt(t9 t9Var) {
        this.a = t9Var;
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
                xs xsVar = this.e[length];
                xsVar.getClass();
                i -= xsVar.c;
                int i4 = this.h;
                xs xsVar2 = this.e[length];
                xsVar2.getClass();
                this.h = i4 - xsVar2.c;
                this.g--;
                i3++;
                length--;
            }
            xs[] xsVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(xsVarArr, i5, xsVarArr, i5 + i3, this.g);
            xs[] xsVarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(xsVarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(xs xsVar) {
        int i = xsVar.c;
        int i2 = this.d;
        if (i > i2) {
            xs[] xsVarArr = this.e;
            j7.a0(xsVarArr, 0, xsVarArr.length);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        xs[] xsVarArr2 = this.e;
        if (i3 > xsVarArr2.length) {
            xs[] xsVarArr3 = new xs[xsVarArr2.length * 2];
            System.arraycopy(xsVarArr2, 0, xsVarArr3, xsVarArr2.length, xsVarArr2.length);
            this.f = this.e.length - 1;
            this.e = xsVarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = xsVar;
        this.g++;
        this.h += i;
    }

    public final void c(y9 y9Var) {
        y9Var.getClass();
        int[] iArr = pu.a;
        int a = y9Var.a();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < a; i++) {
            byte d = y9Var.d(i);
            byte[] bArr = zk0.a;
            j2 += pu.b[d & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int a2 = y9Var.a();
        t9 t9Var = this.a;
        if (i2 >= a2) {
            e(y9Var.a(), 127, 0);
            y9Var.i(t9Var, y9Var.a());
            return;
        }
        t9 t9Var2 = new t9();
        int[] iArr2 = pu.a;
        int a3 = y9Var.a();
        int i3 = 0;
        for (int i4 = 0; i4 < a3; i4++) {
            byte d2 = y9Var.d(i4);
            byte[] bArr2 = zk0.a;
            int i5 = d2 & 255;
            int i6 = pu.a[i5];
            byte b = pu.b[i5];
            j = (j << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                t9Var2.T((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            t9Var2.T((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        y9 j3 = t9Var2.j(t9Var2.g);
        e(j3.a(), 127, 128);
        j3.i(t9Var, j3.a());
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
            xs xsVar = (xs) arrayList.get(i4);
            y9 g = xsVar.a.g();
            y9 y9Var = xsVar.b;
            Integer num = (Integer) mt.b.get(g);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    xs[] xsVarArr = mt.a;
                    if (mv.c(xsVarArr[intValue].b, y9Var)) {
                        i = i2;
                    } else if (mv.c(xsVarArr[i2].b, y9Var)) {
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
                    xs xsVar2 = this.e[i5];
                    xsVar2.getClass();
                    if (mv.c(xsVar2.a, g)) {
                        xs xsVar3 = this.e[i5];
                        xsVar3.getClass();
                        if (mv.c(xsVar3.b, y9Var)) {
                            i2 = mt.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + mt.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.a.T(64);
                c(g);
                c(y9Var);
                b(xsVar);
            } else {
                y9 y9Var2 = xs.d;
                g.getClass();
                y9Var2.getClass();
                if (!g.f(y9Var2, y9Var2.a()) || mv.c(xs.i, g)) {
                    e(i, 63, 64);
                    c(y9Var);
                    b(xsVar);
                } else {
                    e(i, 15, 0);
                    c(y9Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        t9 t9Var = this.a;
        if (i < i2) {
            t9Var.T(i | i3);
            return;
        }
        t9Var.T(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            t9Var.T(128 | (i4 & 127));
            i4 >>>= 7;
        }
        t9Var.T(i4);
    }
}
