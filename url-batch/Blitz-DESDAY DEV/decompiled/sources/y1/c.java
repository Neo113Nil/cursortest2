package y1;

import java.io.IOException;
import java.util.ArrayList;
import x.C0306g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public final E1.p f4204c;

    /* renamed from: f, reason: collision with root package name */
    public int f4206f;

    /* renamed from: g, reason: collision with root package name */
    public int f4207g;

    /* renamed from: a, reason: collision with root package name */
    public int f4202a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4203b = new ArrayList();
    public b[] d = new b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f4205e = 7;

    public c(r rVar) {
        this.f4204c = new E1.p(rVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.f4205e;
                if (length < i2 || i <= 0) {
                    break;
                }
                b bVar = this.d[length];
                g1.d.b(bVar);
                int i4 = bVar.f4201c;
                i -= i4;
                this.f4207g -= i4;
                this.f4206f--;
                i3++;
            }
            b[] bVarArr = this.d;
            System.arraycopy(bVarArr, i2 + 1, bVarArr, i2 + 1 + i3, this.f4206f);
            this.f4205e += i3;
        }
        return i3;
    }

    public final E1.i b(int i) {
        if (i >= 0) {
            b[] bVarArr = e.f4214a;
            if (i <= bVarArr.length - 1) {
                return bVarArr[i].f4199a;
            }
        }
        int length = this.f4205e + 1 + (i - e.f4214a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.d;
            if (length < bVarArr2.length) {
                b bVar = bVarArr2[length];
                g1.d.b(bVar);
                return bVar.f4199a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(b bVar) {
        this.f4203b.add(bVar);
        int i = this.f4202a;
        int i2 = bVar.f4201c;
        if (i2 > i) {
            b[] bVarArr = this.d;
            X0.i.i0(bVarArr, 0, bVarArr.length);
            this.f4205e = this.d.length - 1;
            this.f4206f = 0;
            this.f4207g = 0;
            return;
        }
        a((this.f4207g + i2) - i);
        int i3 = this.f4206f + 1;
        b[] bVarArr2 = this.d;
        if (i3 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f4205e = this.d.length - 1;
            this.d = bVarArr3;
        }
        int i4 = this.f4205e;
        this.f4205e = i4 - 1;
        this.d[i4] = bVar;
        this.f4206f++;
        this.f4207g += i2;
    }

    public final E1.i d() {
        int i;
        E1.p pVar = this.f4204c;
        byte i2 = pVar.i();
        byte[] bArr = s1.b.f3607a;
        int i3 = i2 & 255;
        int i4 = 0;
        boolean z2 = (i2 & 128) == 128;
        long e2 = e(i3, 127);
        if (!z2) {
            return pVar.j(e2);
        }
        E1.f fVar = new E1.f();
        int[] iArr = y.f4299a;
        g1.d.e(pVar, "source");
        C0306g c0306g = y.f4301c;
        C0306g c0306g2 = c0306g;
        int i5 = 0;
        for (long j2 = 0; j2 < e2; j2++) {
            byte i6 = pVar.i();
            byte[] bArr2 = s1.b.f3607a;
            i4 = (i4 << 8) | (i6 & 255);
            i5 += 8;
            while (i5 >= 8) {
                C0306g[] c0306gArr = (C0306g[]) c0306g2.f4033c;
                g1.d.b(c0306gArr);
                c0306g2 = c0306gArr[(i4 >>> (i5 - 8)) & 255];
                g1.d.b(c0306g2);
                if (((C0306g[]) c0306g2.f4033c) == null) {
                    fVar.u(c0306g2.f4031a);
                    i5 -= c0306g2.f4032b;
                    c0306g2 = c0306g;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            C0306g[] c0306gArr2 = (C0306g[]) c0306g2.f4033c;
            g1.d.b(c0306gArr2);
            C0306g c0306g3 = c0306gArr2[(i4 << (8 - i5)) & 255];
            g1.d.b(c0306g3);
            if (((C0306g[]) c0306g3.f4033c) != null || (i = c0306g3.f4032b) > i5) {
                break;
            }
            fVar.u(c0306g3.f4031a);
            i5 -= i;
            c0306g2 = c0306g;
        }
        return fVar.k(fVar.f202b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte i5 = this.f4204c.i();
            byte[] bArr = s1.b.f3607a;
            int i6 = i5 & 255;
            if ((i5 & 128) == 0) {
                return i2 + (i6 << i4);
            }
            i2 += (i5 & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
