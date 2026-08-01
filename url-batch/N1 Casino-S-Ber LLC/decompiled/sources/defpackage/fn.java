package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class fn {
    public final cy c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public um[] d = new um[8];
    public int e = 7;

    public fn(zn znVar) {
        this.c = new cy(znVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                um umVar = this.d[length];
                umVar.getClass();
                int i4 = umVar.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            um[] umVarArr = this.d;
            System.arraycopy(umVarArr, i2 + 1, umVarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final y8 b(int i) {
        if (i >= 0) {
            um[] umVarArr = hn.a;
            if (i <= umVarArr.length - 1) {
                return umVarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - hn.a.length);
        if (length >= 0) {
            um[] umVarArr2 = this.d;
            if (length < umVarArr2.length) {
                um umVar = umVarArr2[length];
                umVar.getClass();
                return umVar.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(um umVar) {
        this.b.add(umVar);
        int i = umVar.c;
        int i2 = this.a;
        if (i > i2) {
            um[] umVarArr = this.d;
            q6.f0(umVarArr, 0, umVarArr.length);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        um[] umVarArr2 = this.d;
        if (i3 > umVarArr2.length) {
            um[] umVarArr3 = new um[umVarArr2.length * 2];
            System.arraycopy(umVarArr2, 0, umVarArr3, umVarArr2.length, umVarArr2.length);
            this.e = this.d.length - 1;
            this.d = umVarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = umVar;
        this.f++;
        this.g += i;
    }

    public final y8 d() {
        cy cyVar = this.c;
        byte readByte = cyVar.readByte();
        byte[] bArr = r70.a;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long e = e(i, 127);
        if (!z) {
            return cyVar.c(e);
        }
        u8 u8Var = new u8();
        int[] iArr = ko.a;
        cyVar.getClass();
        rc rcVar = ko.c;
        rc rcVar2 = rcVar;
        int i3 = 0;
        for (long j = 0; j < e; j++) {
            byte readByte2 = cyVar.readByte();
            byte[] bArr2 = r70.a;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                rc[] rcVarArr = (rc[]) rcVar2.c;
                rcVarArr.getClass();
                rcVar2 = rcVarArr[(i2 >>> (i3 - 8)) & 255];
                rcVar2.getClass();
                if (((rc[]) rcVar2.c) == null) {
                    u8Var.w(rcVar2.a);
                    i3 -= rcVar2.b;
                    rcVar2 = rcVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            rc[] rcVarArr2 = (rc[]) rcVar2.c;
            rcVarArr2.getClass();
            rc rcVar3 = rcVarArr2[(i2 << (8 - i3)) & 255];
            rcVar3.getClass();
            int i4 = rcVar3.b;
            if (((rc[]) rcVar3.c) != null || i4 > i3) {
                break;
            }
            u8Var.w(rcVar3.a);
            i3 -= i4;
            rcVar2 = rcVar;
        }
        return u8Var.c(u8Var.g);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = r70.a;
            int i5 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
