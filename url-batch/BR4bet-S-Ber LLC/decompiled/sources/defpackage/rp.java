package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class rp {
    public final e10 c;
    public int f;
    public int g;
    public int a = 4096;
    public final ArrayList b = new ArrayList();
    public gp[] d = new gp[8];
    public int e = 7;

    public rp(lq lqVar) {
        this.c = new e10(lqVar);
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
                gp gpVar = this.d[length];
                gpVar.getClass();
                int i4 = gpVar.c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
            }
            gp[] gpVarArr = this.d;
            System.arraycopy(gpVarArr, i2 + 1, gpVarArr, i2 + 1 + i3, this.f);
            this.e += i3;
        }
        return i3;
    }

    public final l9 b(int i) {
        if (i >= 0) {
            gp[] gpVarArr = tp.a;
            if (i <= gpVarArr.length - 1) {
                return gpVarArr[i].a;
            }
        }
        int length = this.e + 1 + (i - tp.a.length);
        if (length >= 0) {
            gp[] gpVarArr2 = this.d;
            if (length < gpVarArr2.length) {
                gp gpVar = gpVarArr2[length];
                gpVar.getClass();
                return gpVar.a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(gp gpVar) {
        this.b.add(gpVar);
        int i = gpVar.c;
        int i2 = this.a;
        if (i > i2) {
            gp[] gpVarArr = this.d;
            a7.b0(gpVarArr, 0, gpVarArr.length);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        gp[] gpVarArr2 = this.d;
        if (i3 > gpVarArr2.length) {
            gp[] gpVarArr3 = new gp[gpVarArr2.length * 2];
            System.arraycopy(gpVarArr2, 0, gpVarArr3, gpVarArr2.length, gpVarArr2.length);
            this.e = this.d.length - 1;
            this.d = gpVarArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.d[i4] = gpVar;
        this.f++;
        this.g += i;
    }

    public final l9 d() {
        e10 e10Var = this.c;
        byte readByte = e10Var.readByte();
        byte[] bArr = cb0.a;
        int i = readByte & 255;
        int i2 = 0;
        boolean z = (readByte & 128) == 128;
        long e = e(i, 127);
        if (!z) {
            return e10Var.c(e);
        }
        h9 h9Var = new h9();
        int[] iArr = vq.a;
        e10Var.getClass();
        rd rdVar = vq.c;
        rd rdVar2 = rdVar;
        int i3 = 0;
        for (long j = 0; j < e; j++) {
            byte readByte2 = e10Var.readByte();
            byte[] bArr2 = cb0.a;
            i2 = (i2 << 8) | (readByte2 & 255);
            i3 += 8;
            while (i3 >= 8) {
                rd[] rdVarArr = (rd[]) rdVar2.c;
                rdVarArr.getClass();
                rdVar2 = rdVarArr[(i2 >>> (i3 - 8)) & 255];
                rdVar2.getClass();
                if (((rd[]) rdVar2.c) == null) {
                    h9Var.w(rdVar2.a);
                    i3 -= rdVar2.b;
                    rdVar2 = rdVar;
                } else {
                    i3 -= 8;
                }
            }
        }
        while (i3 > 0) {
            rd[] rdVarArr2 = (rd[]) rdVar2.c;
            rdVarArr2.getClass();
            rd rdVar3 = rdVarArr2[(i2 << (8 - i3)) & 255];
            rdVar3.getClass();
            int i4 = rdVar3.b;
            if (((rd[]) rdVar3.c) != null || i4 > i3) {
                break;
            }
            h9Var.w(rdVar3.a);
            i3 -= i4;
            rdVar2 = rdVar;
        }
        return h9Var.c(h9Var.g);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = cb0.a;
            int i5 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
