package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ey0 {
    public final p62 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public kx0[] d = new kx0[8];
    public int e = 7;

    public ey0(xy0 xy0Var) {
        this.c = new p62(xy0Var);
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
                kx0 kx0Var = this.d[length];
                kx0Var.getClass();
                int i4 = kx0Var.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            kx0[] kx0VarArr = this.d;
            System.arraycopy(kx0VarArr, i2 + 1, kx0VarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final dr b(int i) {
        if (i >= 0) {
            kx0[] kx0VarArr = gy0.a;
            if (i <= kx0VarArr.length - 1) {
                return kx0VarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - gy0.a.length);
        if (length >= 0) {
            kx0[] kx0VarArr2 = this.d;
            if (length < kx0VarArr2.length) {
                kx0 kx0Var = kx0VarArr2[length];
                kx0Var.getClass();
                return kx0Var.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(kx0 kx0Var) {
        this.b.add(kx0Var);
        int i = kx0Var.c;
        int i2 = this.a;
        if (i > i2) {
            ni.k(0, r7.length, null, this.d);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        kx0[] kx0VarArr = this.d;
        if (i3 > kx0VarArr.length) {
            kx0[] kx0VarArr2 = new kx0[kx0VarArr.length * 2];
            System.arraycopy(kx0VarArr, 0, kx0VarArr2, kx0VarArr.length, kx0VarArr.length);
            this.e = this.d.length - 1;
            this.d = kx0VarArr2;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = kx0Var;
        this.f++;
        this.g += i;
    }

    public final dr d() {
        p62 p62Var = this.c;
        byte readByte = p62Var.readByte();
        byte[] bArr = n33.a;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long e = e(i, 127);
        if (!z) {
            return p62Var.k(e);
        }
        fq fqVar = new fq();
        int[] iArr = lz0.a;
        p62Var.getClass();
        yq yqVar = lz0.c;
        yq yqVar2 = yqVar;
        int i3 = 0;
        for (long j = 0; j < e; j++) {
            byte readByte2 = p62Var.readByte();
            byte[] bArr2 = n33.a;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                yq[] yqVarArr = (yq[]) yqVar2.p;
                yqVarArr.getClass();
                yqVar2 = yqVarArr[(i2 >>> (i3 - 8)) & 255];
                yqVar2.getClass();
                if (((yq[]) yqVar2.p) == null) {
                    fqVar.L(yqVar2.n);
                    i3 -= yqVar2.o;
                    yqVar2 = yqVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            yq[] yqVarArr2 = (yq[]) yqVar2.p;
            yqVarArr2.getClass();
            yq yqVar3 = yqVarArr2[(i2 << (8 - i3)) & 255];
            yqVar3.getClass();
            int i4 = yqVar3.o;
            if (((yq[]) yqVar3.p) != null || i4 > i3) {
                break;
            }
            fqVar.L(yqVar3.n);
            i3 -= i4;
            yqVar2 = yqVar;
        }
        return fqVar.k(fqVar.n);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = n33.a;
            int i5 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
