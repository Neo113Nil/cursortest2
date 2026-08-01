package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class gn {
    public final u8 a;
    public boolean c;
    public int g;
    public int h;
    public int b = Integer.MAX_VALUE;
    public int d = 4096;
    public um[] e = new um[8];
    public int f = 7;

    public gn(u8 u8Var) {
        this.a = u8Var;
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
                um umVar = this.e[length];
                umVar.getClass();
                i -= umVar.c;
                int i4 = this.h;
                um umVar2 = this.e[length];
                umVar2.getClass();
                this.h = i4 - umVar2.c;
                this.g--;
                i3++;
                length--;
            }
            um[] umVarArr = this.e;
            int i5 = i2 + 1;
            System.arraycopy(umVarArr, i5, umVarArr, i5 + i3, this.g);
            um[] umVarArr2 = this.e;
            int i6 = this.f + 1;
            Arrays.fill(umVarArr2, i6, i6 + i3, (Object) null);
            this.f += i3;
        }
    }

    public final void b(um umVar) {
        int i = umVar.c;
        int i2 = this.d;
        if (i > i2) {
            um[] umVarArr = this.e;
            q6.f0(umVarArr, 0, umVarArr.length);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
            return;
        }
        a((this.h + i) - i2);
        int i3 = this.g + 1;
        um[] umVarArr2 = this.e;
        if (i3 > umVarArr2.length) {
            um[] umVarArr3 = new um[umVarArr2.length * 2];
            System.arraycopy(umVarArr2, 0, umVarArr3, umVarArr2.length, umVarArr2.length);
            this.f = this.e.length - 1;
            this.e = umVarArr3;
        }
        int i4 = this.f;
        this.f = i4 - 1;
        this.e[i4] = umVar;
        this.g++;
        this.h += i;
    }

    public final void c(y8 y8Var) {
        y8Var.getClass();
        int[] iArr = ko.a;
        int a = y8Var.a();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < a; i++) {
            byte d = y8Var.d(i);
            byte[] bArr = r70.a;
            j2 += ko.b[d & 255];
        }
        int i2 = (int) ((j2 + 7) >> 3);
        int a2 = y8Var.a();
        u8 u8Var = this.a;
        if (i2 >= a2) {
            e(y8Var.a(), 127, 0);
            y8Var.i(u8Var, y8Var.a());
            return;
        }
        u8 u8Var2 = new u8();
        int[] iArr2 = ko.a;
        int a3 = y8Var.a();
        int i3 = 0;
        for (int i4 = 0; i4 < a3; i4++) {
            byte d2 = y8Var.d(i4);
            byte[] bArr2 = r70.a;
            int i5 = d2 & 255;
            int i6 = ko.a[i5];
            byte b = ko.b[i5];
            j = (j << b) | i6;
            i3 += b;
            while (i3 >= 8) {
                i3 -= 8;
                u8Var2.w((int) (j >> i3));
            }
        }
        if (i3 > 0) {
            u8Var2.w((int) ((j << (8 - i3)) | (255 >>> i3)));
        }
        y8 c = u8Var2.c(u8Var2.g);
        e(c.a(), 127, 128);
        c.i(u8Var, c.a());
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
            um umVar = (um) arrayList.get(i4);
            y8 g = umVar.a.g();
            y8 y8Var = umVar.b;
            Integer num = (Integer) hn.b.get(g);
            if (num != null) {
                int intValue = num.intValue();
                i2 = intValue + 1;
                if (2 <= i2 && i2 < 8) {
                    um[] umVarArr = hn.a;
                    if (zo.b(umVarArr[intValue].b, y8Var)) {
                        i = i2;
                    } else if (zo.b(umVarArr[i2].b, y8Var)) {
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
                    um umVar2 = this.e[i5];
                    umVar2.getClass();
                    if (zo.b(umVar2.a, g)) {
                        um umVar3 = this.e[i5];
                        umVar3.getClass();
                        if (zo.b(umVar3.b, y8Var)) {
                            i2 = hn.a.length + (i5 - this.f);
                            break;
                        } else if (i == -1) {
                            i = (i5 - this.f) + hn.a.length;
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
                c(y8Var);
                b(umVar);
            } else {
                y8 y8Var2 = um.d;
                g.getClass();
                y8Var2.getClass();
                if (!g.f(y8Var2, y8Var2.a()) || zo.b(um.i, g)) {
                    e(i, 63, 64);
                    c(y8Var);
                    b(umVar);
                } else {
                    e(i, 15, 0);
                    c(y8Var);
                }
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        u8 u8Var = this.a;
        if (i < i2) {
            u8Var.w(i | i3);
            return;
        }
        u8Var.w(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            u8Var.w(128 | (i4 & 127));
            i4 >>>= 7;
        }
        u8Var.w(i4);
    }
}
