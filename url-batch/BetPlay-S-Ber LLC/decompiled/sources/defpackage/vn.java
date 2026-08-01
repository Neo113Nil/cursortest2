package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class vn {
    public final p8 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public mn[] e = new mn[8];
    public int f = 7;

    public vn(p8 p8Var) {
        this.a = p8Var;
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
                mn mnVar = this.e[length];
                mnVar.getClass();
                i -= mnVar.c;
                int i4 = this.h;
                mn mnVar2 = this.e[length];
                mnVar2.getClass();
                this.h = i4 - mnVar2.c;
                this.g--;
                i3++;
                length--;
            }
            mn[] mnVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(mnVarArr, i5, mnVarArr, i5 + i3, this.g);
            mn[] mnVarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(mnVarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(mn mnVar) {
        int i = mnVar.c;
        int i2 = this.d;
        if (i > i2) {
            mn[] mnVarArr = this.e;
            h7.i0(mnVarArr, 0, mnVarArr.length);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        mn[] mnVarArr2 = this.e;
        if (i3 > mnVarArr2.length) {
            mn[] mnVarArr3 = new mn[mnVarArr2.length * 2];
            System.arraycopy(mnVarArr2, 0, mnVarArr3, mnVarArr2.length, mnVarArr2.length);
            this.f = this.e.length - 1;
            this.e = mnVarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = mnVar;
        this.g++;
        this.h += i;
    }

    public final void c(t8 t8Var) {
        t8Var.getClass();
        int[] iArr = zo.a;
        int a = t8Var.a();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < a; i++) {
            byte d = t8Var.d(i);
            byte[] bArr = y70.a;
            j2 += zo.b[d & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int a2 = t8Var.a();
        p8 p8Var = this.a;
        if (i2 >= a2) {
            e(t8Var.a(), 127, 0);
            t8Var.i(p8Var, t8Var.a());
            return;
        }
        p8 p8Var2 = new p8();
        int[] iArr2 = zo.a;
        int a3 = t8Var.a();
        int i3 = 0;
        for (int i4 = 0; i4 < a3; i4++) {
            byte d2 = t8Var.d(i4);
            byte[] bArr2 = y70.a;
            int i5 = d2 & 255;
            int i6 = zo.a[i5];
            byte b = zo.b[i5];
            j = (j << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                p8Var2.w((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            p8Var2.w((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        t8 c = p8Var2.c(p8Var2.g);
        e(c.a(), 127, 128);
        c.i(p8Var, c.a());
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
            mn mnVar = (mn) arrayList.get(i4);
            t8 g = mnVar.a.g();
            t8 t8Var = mnVar.b;
            Integer num = (Integer) wn.b.get(g);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    mn[] mnVarArr = wn.a;
                    if (op.d(mnVarArr[intValue].b, t8Var)) {
                        i = i2;
                    } else if (op.d(mnVarArr[i2].b, t8Var)) {
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
                    mn mnVar2 = this.e[i5];
                    mnVar2.getClass();
                    if (op.d(mnVar2.a, g)) {
                        mn mnVar3 = this.e[i5];
                        mnVar3.getClass();
                        if (op.d(mnVar3.b, t8Var)) {
                            i2 = wn.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + wn.a.length;
                        }
                    }
                    i5++;
                }
            }
            if (i2 != -1) {
                e(i2, 127, 128);
            } else if (i == -1) {
                this.a.w(64);
                c(g);
                c(t8Var);
                b(mnVar);
            } else {
                t8 t8Var2 = mn.d;
                g.getClass();
                t8Var2.getClass();
                if (!g.f(t8Var2, t8Var2.a()) || op.d(mn.i, g)) {
                    e(i, 63, 64);
                    c(t8Var);
                    b(mnVar);
                } else {
                    e(i, 15, 0);
                    c(t8Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        p8 p8Var = this.a;
        if (i < i2) {
            p8Var.w(i | i3);
            return;
        }
        p8Var.w(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            p8Var.w(128 | (i4 & 127));
            i4 >>>= 7;
        }
        p8Var.w(i4);
    }
}
