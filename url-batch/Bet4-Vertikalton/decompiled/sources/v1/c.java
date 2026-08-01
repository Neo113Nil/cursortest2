package v1;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public final B1.p f4061c;

    /* renamed from: f, reason: collision with root package name */
    public int f4063f;

    /* renamed from: g, reason: collision with root package name */
    public int f4064g;

    /* renamed from: a, reason: collision with root package name */
    public int f4059a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4060b = new ArrayList();
    public b[] d = new b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f4062e = 7;

    public c(r rVar) {
        this.f4061c = new B1.p(rVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.f4062e;
                if (length < i2 || i <= 0) {
                    break;
                }
                b bVar = this.d[length];
                d1.d.b(bVar);
                int i4 = bVar.f4058c;
                i -= i4;
                this.f4064g -= i4;
                this.f4063f--;
                i3++;
            }
            b[] bVarArr = this.d;
            System.arraycopy(bVarArr, i2 + 1, bVarArr, i2 + 1 + i3, this.f4063f);
            this.f4062e += i3;
        }
        return i3;
    }

    public final B1.i b(int i) {
        if (i >= 0) {
            b[] bVarArr = e.f4071a;
            if (i <= bVarArr.length - 1) {
                return bVarArr[i].f4056a;
            }
        }
        int length = this.f4062e + 1 + (i - e.f4071a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.d;
            if (length < bVarArr2.length) {
                b bVar = bVarArr2[length];
                d1.d.b(bVar);
                return bVar.f4056a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(b bVar) {
        this.f4060b.add(bVar);
        int i = this.f4059a;
        int i2 = bVar.f4058c;
        if (i2 > i) {
            b[] bVarArr = this.d;
            S0.f.f0(bVarArr, 0, bVarArr.length);
            this.f4062e = this.d.length - 1;
            this.f4063f = 0;
            this.f4064g = 0;
            return;
        }
        a((this.f4064g + i2) - i);
        int i3 = this.f4063f + 1;
        b[] bVarArr2 = this.d;
        if (i3 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f4062e = this.d.length - 1;
            this.d = bVarArr3;
        }
        int i4 = this.f4062e;
        this.f4062e = i4 - 1;
        this.d[i4] = bVar;
        this.f4063f++;
        this.f4064g += i2;
    }

    public final B1.i d() {
        int i;
        B1.p pVar = this.f4061c;
        byte i2 = pVar.i();
        byte[] bArr = p1.b.f3455a;
        int i3 = i2 & 255;
        int i4 = 0;
        boolean z2 = (i2 & 128) == 128;
        long e2 = e(i3, 127);
        if (!z2) {
            return pVar.j(e2);
        }
        B1.f fVar = new B1.f();
        int[] iArr = y.f4156a;
        d1.d.e(pVar, "source");
        v.g gVar = y.f4158c;
        v.g gVar2 = gVar;
        int i5 = 0;
        for (long j2 = 0; j2 < e2; j2++) {
            byte i6 = pVar.i();
            byte[] bArr2 = p1.b.f3455a;
            i4 = (i4 << 8) | (i6 & 255);
            i5 += 8;
            while (i5 >= 8) {
                v.g[] gVarArr = (v.g[]) gVar2.f3914c;
                d1.d.b(gVarArr);
                gVar2 = gVarArr[(i4 >>> (i5 - 8)) & 255];
                d1.d.b(gVar2);
                if (((v.g[]) gVar2.f3914c) == null) {
                    fVar.u(gVar2.f3912a);
                    i5 -= gVar2.f3913b;
                    gVar2 = gVar;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            v.g[] gVarArr2 = (v.g[]) gVar2.f3914c;
            d1.d.b(gVarArr2);
            v.g gVar3 = gVarArr2[(i4 << (8 - i5)) & 255];
            d1.d.b(gVar3);
            if (((v.g[]) gVar3.f3914c) != null || (i = gVar3.f3913b) > i5) {
                break;
            }
            fVar.u(gVar3.f3912a);
            i5 -= i;
            gVar2 = gVar;
        }
        return fVar.k(fVar.f69b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte i5 = this.f4061c.i();
            byte[] bArr = p1.b.f3455a;
            int i6 = i5 & 255;
            if ((i5 & 128) == 0) {
                return i2 + (i6 << i4);
            }
            i2 += (i5 & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
