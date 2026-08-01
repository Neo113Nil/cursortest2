package z1;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public final F1.p f4429c;

    /* renamed from: f, reason: collision with root package name */
    public int f4431f;

    /* renamed from: g, reason: collision with root package name */
    public int f4432g;

    /* renamed from: a, reason: collision with root package name */
    public int f4427a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4428b = new ArrayList();
    public b[] d = new b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f4430e = 7;

    public c(r rVar) {
        this.f4429c = new F1.p(rVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.f4430e;
                if (length < i2 || i <= 0) {
                    break;
                }
                b bVar = this.d[length];
                h1.d.b(bVar);
                int i4 = bVar.f4426c;
                i -= i4;
                this.f4432g -= i4;
                this.f4431f--;
                i3++;
            }
            b[] bVarArr = this.d;
            System.arraycopy(bVarArr, i2 + 1, bVarArr, i2 + 1 + i3, this.f4431f);
            this.f4430e += i3;
        }
        return i3;
    }

    public final F1.i b(int i) {
        if (i >= 0) {
            b[] bVarArr = e.f4440a;
            if (i <= bVarArr.length - 1) {
                return bVarArr[i].f4424a;
            }
        }
        int length = this.f4430e + 1 + (i - e.f4440a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.d;
            if (length < bVarArr2.length) {
                b bVar = bVarArr2[length];
                h1.d.b(bVar);
                return bVar.f4424a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(b bVar) {
        this.f4428b.add(bVar);
        int i = this.f4427a;
        int i2 = bVar.f4426c;
        if (i2 > i) {
            b[] bVarArr = this.d;
            W0.f.t0(bVarArr, 0, bVarArr.length);
            this.f4430e = this.d.length - 1;
            this.f4431f = 0;
            this.f4432g = 0;
            return;
        }
        a((this.f4432g + i2) - i);
        int i3 = this.f4431f + 1;
        b[] bVarArr2 = this.d;
        if (i3 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f4430e = this.d.length - 1;
            this.d = bVarArr3;
        }
        int i4 = this.f4430e;
        this.f4430e = i4 - 1;
        this.d[i4] = bVar;
        this.f4431f++;
        this.f4432g += i2;
    }

    public final F1.i d() {
        int i;
        F1.p pVar = this.f4429c;
        byte i2 = pVar.i();
        byte[] bArr = t1.b.f3898a;
        int i3 = i2 & 255;
        int i4 = 0;
        boolean z2 = (i2 & 128) == 128;
        long e2 = e(i3, 127);
        if (!z2) {
            return pVar.j(e2);
        }
        F1.f fVar = new F1.f();
        int[] iArr = y.f4530a;
        h1.d.e(pVar, "source");
        w.g gVar = y.f4532c;
        w.g gVar2 = gVar;
        int i5 = 0;
        for (long j2 = 0; j2 < e2; j2++) {
            byte i6 = pVar.i();
            byte[] bArr2 = t1.b.f3898a;
            i4 = (i4 << 8) | (i6 & 255);
            i5 += 8;
            while (i5 >= 8) {
                w.g[] gVarArr = (w.g[]) gVar2.f4061c;
                h1.d.b(gVarArr);
                gVar2 = gVarArr[(i4 >>> (i5 - 8)) & 255];
                h1.d.b(gVar2);
                if (((w.g[]) gVar2.f4061c) == null) {
                    fVar.u(gVar2.f4059a);
                    i5 -= gVar2.f4060b;
                    gVar2 = gVar;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            w.g[] gVarArr2 = (w.g[]) gVar2.f4061c;
            h1.d.b(gVarArr2);
            w.g gVar3 = gVarArr2[(i4 << (8 - i5)) & 255];
            h1.d.b(gVar3);
            if (((w.g[]) gVar3.f4061c) != null || (i = gVar3.f4060b) > i5) {
                break;
            }
            fVar.u(gVar3.f4059a);
            i5 -= i;
            gVar2 = gVar;
        }
        return fVar.k(fVar.f247b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte i5 = this.f4429c.i();
            byte[] bArr = t1.b.f3898a;
            int i6 = i5 & 255;
            if ((i5 & 128) == 0) {
                return i2 + (i6 << i4);
            }
            i2 += (i5 & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
