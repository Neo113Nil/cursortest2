package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class un {
    public final ry c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public mn[] d = new mn[8];
    public int e = 7;

    public un(po poVar) {
        this.c = new ry(poVar);
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
                mn mnVar = this.d[length];
                mnVar.getClass();
                int i4 = mnVar.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            mn[] mnVarArr = this.d;
            System.arraycopy(mnVarArr, i2 + 1, mnVarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final t8 b(int i) {
        if (i >= 0) {
            mn[] mnVarArr = wn.a;
            if (i <= mnVarArr.length - 1) {
                return mnVarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - wn.a.length);
        if (length >= 0) {
            mn[] mnVarArr2 = this.d;
            if (length < mnVarArr2.length) {
                mn mnVar = mnVarArr2[length];
                mnVar.getClass();
                return mnVar.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(mn mnVar) {
        this.b.add(mnVar);
        int i = mnVar.c;
        int i2 = this.a;
        if (i > i2) {
            mn[] mnVarArr = this.d;
            h7.i0(mnVarArr, 0, mnVarArr.length);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        mn[] mnVarArr2 = this.d;
        if (i3 > mnVarArr2.length) {
            mn[] mnVarArr3 = new mn[mnVarArr2.length * 2];
            System.arraycopy(mnVarArr2, 0, mnVarArr3, mnVarArr2.length, mnVarArr2.length);
            this.e = this.d.length - 1;
            this.d = mnVarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = mnVar;
        this.f++;
        this.g += i;
    }

    public final t8 d() {
        ry ryVar = this.c;
        byte readByte = ryVar.readByte();
        byte[] bArr = y70.a;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long e = e(i, 127);
        if (!z) {
            return ryVar.c(e);
        }
        p8 p8Var = new p8();
        int[] iArr = zo.a;
        ryVar.getClass();
        vc vcVar = zo.c;
        vc vcVar2 = vcVar;
        int i3 = 0;
        for (long j = 0; j < e; j++) {
            byte readByte2 = ryVar.readByte();
            byte[] bArr2 = y70.a;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                vc[] vcVarArr = (vc[]) vcVar2.c;
                vcVarArr.getClass();
                vcVar2 = vcVarArr[(i2 >>> (i3 - 8)) & 255];
                vcVar2.getClass();
                if (((vc[]) vcVar2.c) == null) {
                    p8Var.w(vcVar2.a);
                    i3 -= vcVar2.b;
                    vcVar2 = vcVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            vc[] vcVarArr2 = (vc[]) vcVar2.c;
            vcVarArr2.getClass();
            vc vcVar3 = vcVarArr2[(i2 << (8 - i3)) & 255];
            vcVar3.getClass();
            int i4 = vcVar3.b;
            if (((vc[]) vcVar3.c) != null || i4 > i3) {
                break;
            }
            p8Var.w(vcVar3.a);
            i3 -= i4;
            vcVar2 = vcVar;
        }
        return p8Var.c(p8Var.g);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = y70.a;
            int i5 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
