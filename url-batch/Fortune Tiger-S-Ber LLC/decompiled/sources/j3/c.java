package j3;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c {
    public final p3.p c;

    /* renamed from: f, reason: collision with root package name */
    public int f2413f;
    public int g;

    /* renamed from: a, reason: collision with root package name */
    public int f2409a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2410b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public b[] f2411d = new b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f2412e = 7;

    public c(s sVar) {
        this.c = new p3.p(sVar);
    }

    public final int a(int i4) {
        int i5;
        int i6 = 0;
        if (i4 > 0) {
            int length = this.f2411d.length;
            while (true) {
                length--;
                i5 = this.f2412e;
                if (length < i5 || i4 <= 0) {
                    break;
                }
                b bVar = this.f2411d[length];
                u2.c.b(bVar);
                int i7 = bVar.c;
                i4 -= i7;
                this.g -= i7;
                this.f2413f--;
                i6++;
            }
            b[] bVarArr = this.f2411d;
            System.arraycopy(bVarArr, i5 + 1, bVarArr, i5 + 1 + i6, this.f2413f);
            this.f2412e += i6;
        }
        return i6;
    }

    public final p3.i b(int i4) {
        if (i4 >= 0) {
            b[] bVarArr = e.f2420a;
            if (i4 <= bVarArr.length - 1) {
                return bVarArr[i4].f2406a;
            }
        }
        int length = this.f2412e + 1 + (i4 - e.f2420a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.f2411d;
            if (length < bVarArr2.length) {
                b bVar = bVarArr2[length];
                u2.c.b(bVar);
                return bVar.f2406a;
            }
        }
        throw new IOException("Header index too large " + (i4 + 1));
    }

    public final void c(b bVar) {
        this.f2410b.add(bVar);
        int i4 = bVar.c;
        int i5 = this.f2409a;
        if (i4 > i5) {
            b[] bVarArr = this.f2411d;
            n2.f.F(bVarArr, 0, bVarArr.length);
            this.f2412e = this.f2411d.length - 1;
            this.f2413f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i4) - i5);
        int i6 = this.f2413f + 1;
        b[] bVarArr2 = this.f2411d;
        if (i6 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f2412e = this.f2411d.length - 1;
            this.f2411d = bVarArr3;
        }
        int i7 = this.f2412e;
        this.f2412e = i7 - 1;
        this.f2411d[i7] = bVar;
        this.f2413f++;
        this.g += i4;
    }

    public final p3.i d() {
        p3.p pVar = this.c;
        byte readByte = pVar.readByte();
        byte[] bArr = d3.c.f1490a;
        int i4 = readByte & 255;
        int i5 = 0;
        boolean z3 = (readByte & 128) == 128;
        long e4 = e(i4, 127);
        if (!z3) {
            return pVar.b(e4);
        }
        p3.f fVar = new p3.f();
        int[] iArr = a0.f2400a;
        u2.c.e(pVar, "source");
        z zVar = a0.c;
        z zVar2 = zVar;
        int i6 = 0;
        for (long j4 = 0; j4 < e4; j4++) {
            byte readByte2 = pVar.readByte();
            byte[] bArr2 = d3.c.f1490a;
            i5 = (i5 << 8) | (readByte2 & 255);
            i6 += 8;
            while (i6 >= 8) {
                z[] zVarArr = (z[]) zVar2.c;
                u2.c.b(zVarArr);
                zVar2 = zVarArr[(i5 >>> (i6 - 8)) & 255];
                u2.c.b(zVar2);
                if (((z[]) zVar2.c) == null) {
                    fVar.x(zVar2.f2494a);
                    i6 -= zVar2.f2495b;
                    zVar2 = zVar;
                } else {
                    i6 -= 8;
                }
            }
        }
        while (i6 > 0) {
            z[] zVarArr2 = (z[]) zVar2.c;
            u2.c.b(zVarArr2);
            z zVar3 = zVarArr2[(i5 << (8 - i6)) & 255];
            u2.c.b(zVar3);
            int i7 = zVar3.f2495b;
            if (((z[]) zVar3.c) != null || i7 > i6) {
                break;
            }
            fVar.x(zVar3.f2494a);
            i6 -= i7;
            zVar2 = zVar;
        }
        return fVar.b(fVar.g);
    }

    public final int e(int i4, int i5) {
        int i6 = i4 & i5;
        if (i6 < i5) {
            return i6;
        }
        int i7 = 0;
        while (true) {
            byte readByte = this.c.readByte();
            byte[] bArr = d3.c.f1490a;
            int i8 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i5 + (i8 << i7);
            }
            i5 += (readByte & Byte.MAX_VALUE) << i7;
            i7 += 7;
        }
    }
}
