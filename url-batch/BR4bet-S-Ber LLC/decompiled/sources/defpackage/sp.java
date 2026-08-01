package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class sp {
    public final h9 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public gp[] e = new gp[8];
    public int f = 7;

    public sp(h9 h9Var) {
        this.a = h9Var;
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
                gp gpVar = this.e[length];
                gpVar.getClass();
                i -= gpVar.c;
                int i4 = this.h;
                gp gpVar2 = this.e[length];
                gpVar2.getClass();
                this.h = i4 - gpVar2.c;
                this.g--;
                i3++;
                length--;
            }
            gp[] gpVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(gpVarArr, i5, gpVarArr, i5 + i3, this.g);
            gp[] gpVarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(gpVarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(gp gpVar) {
        int i = gpVar.c;
        int i2 = this.d;
        if (i > i2) {
            gp[] gpVarArr = this.e;
            a7.b0(gpVarArr, 0, gpVarArr.length);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        gp[] gpVarArr2 = this.e;
        if (i3 > gpVarArr2.length) {
            gp[] gpVarArr3 = new gp[gpVarArr2.length * 2];
            System.arraycopy(gpVarArr2, 0, gpVarArr3, gpVarArr2.length, gpVarArr2.length);
            this.f = this.e.length - 1;
            this.e = gpVarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = gpVar;
        this.g++;
        this.h += i;
    }

    public final void c(l9 l9Var) {
        l9Var.getClass();
        int[] iArr = vq.a;
        int a = l9Var.a();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < a; i++) {
            byte d = l9Var.d(i);
            byte[] bArr = cb0.a;
            j2 += vq.b[d & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int a2 = l9Var.a();
        h9 h9Var = this.a;
        if (i2 >= a2) {
            e(l9Var.a(), 127, 0);
            l9Var.i(h9Var, l9Var.a());
            return;
        }
        h9 h9Var2 = new h9();
        int[] iArr2 = vq.a;
        int a3 = l9Var.a();
        int i3 = 0;
        for (int i4 = 0; i4 < a3; i4++) {
            byte d2 = l9Var.d(i4);
            byte[] bArr2 = cb0.a;
            int i5 = d2 & 255;
            int i6 = vq.a[i5];
            byte b = vq.b[i5];
            j = (j << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                h9Var2.w((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            h9Var2.w((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        l9 c = h9Var2.c(h9Var2.g);
        e(c.a(), 127, 128);
        c.i(h9Var, c.a());
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
            gp gpVar = (gp) arrayList.get(i4);
            l9 g = gpVar.a.g();
            l9 l9Var = gpVar.b;
            Integer num = (Integer) tp.b.get(g);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    gp[] gpVarArr = tp.a;
                    if (kr.b(gpVarArr[intValue].b, l9Var)) {
                        i = i2;
                    } else if (kr.b(gpVarArr[i2].b, l9Var)) {
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
                    gp gpVar2 = this.e[i5];
                    gpVar2.getClass();
                    if (kr.b(gpVar2.a, g)) {
                        gp gpVar3 = this.e[i5];
                        gpVar3.getClass();
                        if (kr.b(gpVar3.b, l9Var)) {
                            i2 = tp.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + tp.a.length;
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
                c(l9Var);
                b(gpVar);
            } else {
                l9 l9Var2 = gp.d;
                g.getClass();
                l9Var2.getClass();
                if (!g.f(l9Var2, l9Var2.a()) || kr.b(gp.i, g)) {
                    e(i, 63, 64);
                    c(l9Var);
                    b(gpVar);
                } else {
                    e(i, 15, 0);
                    c(l9Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        h9 h9Var = this.a;
        if (i < i2) {
            h9Var.w(i | i3);
            return;
        }
        h9Var.w(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            h9Var.w(128 | (i4 & 127));
            i4 >>>= 7;
        }
        h9Var.w(i4);
    }
}
