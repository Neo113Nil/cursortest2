package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class kt {
    public final j70 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public xs[] d = new xs[8];
    public int e = 7;

    public kt(fu fuVar) {
        this.c = new j70(fuVar);
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
                xs xsVar = this.d[length];
                xsVar.getClass();
                int i4 = xsVar.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            xs[] xsVarArr = this.d;
            System.arraycopy(xsVarArr, i2 + 1, xsVarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final y9 b(int i) {
        if (i >= 0) {
            xs[] xsVarArr = mt.a;
            if (i <= xsVarArr.length - 1) {
                return xsVarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - mt.a.length);
        if (length >= 0) {
            xs[] xsVarArr2 = this.d;
            if (length < xsVarArr2.length) {
                xs xsVar = xsVarArr2[length];
                xsVar.getClass();
                return xsVar.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(xs xsVar) {
        this.b.add(xsVar);
        int i = xsVar.c;
        int i2 = this.a;
        if (i > i2) {
            xs[] xsVarArr = this.d;
            j7.a0(xsVarArr, 0, xsVarArr.length);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        xs[] xsVarArr2 = this.d;
        if (i3 > xsVarArr2.length) {
            xs[] xsVarArr3 = new xs[xsVarArr2.length * 2];
            System.arraycopy(xsVarArr2, 0, xsVarArr3, xsVarArr2.length, xsVarArr2.length);
            this.e = this.d.length - 1;
            this.d = xsVarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = xsVar;
        this.f++;
        this.g += i;
    }

    public final y9 d() {
        j70 j70Var = this.c;
        byte readByte = j70Var.readByte();
        byte[] bArr = zk0.a;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long e = e(i, 127);
        if (!z) {
            return j70Var.j(e);
        }
        t9 t9Var = new t9();
        int[] iArr = pu.a;
        j70Var.getClass();
        ff ffVar = pu.c;
        ff ffVar2 = ffVar;
        int i3 = 0;
        for (long j = 0; j < e; j++) {
            byte readByte2 = j70Var.readByte();
            byte[] bArr2 = zk0.a;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                ff[] ffVarArr = (ff[]) ffVar2.c;
                ffVarArr.getClass();
                ffVar2 = ffVarArr[(i2 >>> (i3 - 8)) & 255];
                ffVar2.getClass();
                if (((ff[]) ffVar2.c) == null) {
                    t9Var.T(ffVar2.a);
                    i3 -= ffVar2.b;
                    ffVar2 = ffVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            ff[] ffVarArr2 = (ff[]) ffVar2.c;
            ffVarArr2.getClass();
            ff ffVar3 = ffVarArr2[(i2 << (8 - i3)) & 255];
            ffVar3.getClass();
            int i4 = ffVar3.b;
            if (((ff[]) ffVar3.c) != null || i4 > i3) {
                break;
            }
            t9Var.T(ffVar3.a);
            i3 -= i4;
            ffVar2 = ffVar;
        }
        return t9Var.j(t9Var.g);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = zk0.a;
            int i5 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
