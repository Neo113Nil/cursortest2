package w1;

import java.io.IOException;
import java.util.ArrayList;
import v.C0320g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public final C1.p f4089c;

    /* renamed from: f, reason: collision with root package name */
    public int f4091f;

    /* renamed from: g, reason: collision with root package name */
    public int f4092g;

    /* renamed from: a, reason: collision with root package name */
    public int f4087a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4088b = new ArrayList();
    public b[] d = new b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f4090e = 7;

    public c(r rVar) {
        this.f4089c = new C1.p(rVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.f4090e;
                if (length < i2 || i <= 0) {
                    break;
                }
                b bVar = this.d[length];
                e1.d.b(bVar);
                int i4 = bVar.f4086c;
                i -= i4;
                this.f4092g -= i4;
                this.f4091f--;
                i3++;
            }
            b[] bVarArr = this.d;
            System.arraycopy(bVarArr, i2 + 1, bVarArr, i2 + 1 + i3, this.f4091f);
            this.f4090e += i3;
        }
        return i3;
    }

    public final C1.i b(int i) {
        if (i >= 0) {
            b[] bVarArr = e.f4099a;
            if (i <= bVarArr.length - 1) {
                return bVarArr[i].f4084a;
            }
        }
        int length = this.f4090e + 1 + (i - e.f4099a.length);
        if (length >= 0) {
            b[] bVarArr2 = this.d;
            if (length < bVarArr2.length) {
                b bVar = bVarArr2[length];
                e1.d.b(bVar);
                return bVar.f4084a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(b bVar) {
        this.f4088b.add(bVar);
        int i = this.f4087a;
        int i2 = bVar.f4086c;
        if (i2 > i) {
            b[] bVarArr = this.d;
            W0.g.r0(bVarArr, 0, bVarArr.length);
            this.f4090e = this.d.length - 1;
            this.f4091f = 0;
            this.f4092g = 0;
            return;
        }
        a((this.f4092g + i2) - i);
        int i3 = this.f4091f + 1;
        b[] bVarArr2 = this.d;
        if (i3 > bVarArr2.length) {
            b[] bVarArr3 = new b[bVarArr2.length * 2];
            System.arraycopy(bVarArr2, 0, bVarArr3, bVarArr2.length, bVarArr2.length);
            this.f4090e = this.d.length - 1;
            this.d = bVarArr3;
        }
        int i4 = this.f4090e;
        this.f4090e = i4 - 1;
        this.d[i4] = bVar;
        this.f4091f++;
        this.f4092g += i2;
    }

    public final C1.i d() {
        int i;
        C1.p pVar = this.f4089c;
        byte i2 = pVar.i();
        byte[] bArr = q1.b.f3491a;
        int i3 = i2 & 255;
        int i4 = 0;
        boolean z2 = (i2 & 128) == 128;
        long e2 = e(i3, 127);
        if (!z2) {
            return pVar.j(e2);
        }
        C1.f fVar = new C1.f();
        int[] iArr = y.f4184a;
        e1.d.e(pVar, "source");
        C0320g c0320g = y.f4186c;
        C0320g c0320g2 = c0320g;
        int i5 = 0;
        for (long j2 = 0; j2 < e2; j2++) {
            byte i6 = pVar.i();
            byte[] bArr2 = q1.b.f3491a;
            i4 = (i4 << 8) | (i6 & 255);
            i5 += 8;
            while (i5 >= 8) {
                C0320g[] c0320gArr = (C0320g[]) c0320g2.f3916c;
                e1.d.b(c0320gArr);
                c0320g2 = c0320gArr[(i4 >>> (i5 - 8)) & 255];
                e1.d.b(c0320g2);
                if (((C0320g[]) c0320g2.f3916c) == null) {
                    fVar.u(c0320g2.f3914a);
                    i5 -= c0320g2.f3915b;
                    c0320g2 = c0320g;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            C0320g[] c0320gArr2 = (C0320g[]) c0320g2.f3916c;
            e1.d.b(c0320gArr2);
            C0320g c0320g3 = c0320gArr2[(i4 << (8 - i5)) & 255];
            e1.d.b(c0320g3);
            if (((C0320g[]) c0320g3.f3916c) != null || (i = c0320g3.f3915b) > i5) {
                break;
            }
            fVar.u(c0320g3.f3914a);
            i5 -= i;
            c0320g2 = c0320g;
        }
        return fVar.k(fVar.f182b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte i5 = this.f4089c.i();
            byte[] bArr = q1.b.f3491a;
            int i6 = i5 & 255;
            if ((i5 & 128) == 0) {
                return i2 + (i6 << i4);
            }
            i2 += (i5 & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
