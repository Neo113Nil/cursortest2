package G1;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: G1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d {

    /* renamed from: c, reason: collision with root package name */
    public final M1.p f374c;

    /* renamed from: f, reason: collision with root package name */
    public int f376f;

    /* renamed from: g, reason: collision with root package name */
    public int f377g;

    /* renamed from: a, reason: collision with root package name */
    public int f372a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f373b = new ArrayList();
    public C0002c[] d = new C0002c[8];

    /* renamed from: e, reason: collision with root package name */
    public int f375e = 7;

    public C0003d(t tVar) {
        this.f374c = new M1.p(tVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.f375e;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0002c c0002c = this.d[length];
                k1.e.b(c0002c);
                int i4 = c0002c.f371c;
                i -= i4;
                this.f377g -= i4;
                this.f376f--;
                i3++;
            }
            C0002c[] c0002cArr = this.d;
            System.arraycopy(c0002cArr, i2 + 1, c0002cArr, i2 + 1 + i3, this.f376f);
            this.f375e += i3;
        }
        return i3;
    }

    public final M1.i b(int i) {
        if (i >= 0) {
            C0002c[] c0002cArr = f.f384a;
            if (i <= c0002cArr.length - 1) {
                return c0002cArr[i].f369a;
            }
        }
        int length = this.f375e + 1 + (i - f.f384a.length);
        if (length >= 0) {
            C0002c[] c0002cArr2 = this.d;
            if (length < c0002cArr2.length) {
                C0002c c0002c = c0002cArr2[length];
                k1.e.b(c0002c);
                return c0002c.f369a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C0002c c0002c) {
        this.f373b.add(c0002c);
        int i = this.f372a;
        int i2 = c0002c.f371c;
        if (i2 > i) {
            C0002c[] c0002cArr = this.d;
            Y0.i.l0(c0002cArr, 0, c0002cArr.length);
            this.f375e = this.d.length - 1;
            this.f376f = 0;
            this.f377g = 0;
            return;
        }
        a((this.f377g + i2) - i);
        int i3 = this.f376f + 1;
        C0002c[] c0002cArr2 = this.d;
        if (i3 > c0002cArr2.length) {
            C0002c[] c0002cArr3 = new C0002c[c0002cArr2.length * 2];
            System.arraycopy(c0002cArr2, 0, c0002cArr3, c0002cArr2.length, c0002cArr2.length);
            this.f375e = this.d.length - 1;
            this.d = c0002cArr3;
        }
        int i4 = this.f375e;
        this.f375e = i4 - 1;
        this.d[i4] = c0002c;
        this.f376f++;
        this.f377g += i2;
    }

    public final M1.i d() {
        int i;
        M1.p pVar = this.f374c;
        byte j2 = pVar.j();
        byte[] bArr = A1.c.f13a;
        int i2 = j2 & 255;
        int i3 = 0;
        boolean z2 = (j2 & 128) == 128;
        long e2 = e(i2, 127);
        if (!z2) {
            return pVar.k(e2);
        }
        M1.f fVar = new M1.f();
        int[] iArr = B.f359a;
        k1.e.e(pVar, "source");
        A a2 = B.f361c;
        A a3 = a2;
        int i4 = 0;
        for (long j3 = 0; j3 < e2; j3++) {
            byte j4 = pVar.j();
            byte[] bArr2 = A1.c.f13a;
            i3 = (i3 << 8) | (j4 & 255);
            i4 += 8;
            while (i4 >= 8) {
                A[] aArr = (A[]) a3.f358c;
                k1.e.b(aArr);
                a3 = aArr[(i3 >>> (i4 - 8)) & 255];
                k1.e.b(a3);
                if (((A[]) a3.f358c) == null) {
                    fVar.A(a3.f356a);
                    i4 -= a3.f357b;
                    a3 = a2;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            A[] aArr2 = (A[]) a3.f358c;
            k1.e.b(aArr2);
            A a4 = aArr2[(i3 << (8 - i4)) & 255];
            k1.e.b(a4);
            if (((A[]) a4.f358c) != null || (i = a4.f357b) > i4) {
                break;
            }
            fVar.A(a4.f356a);
            i4 -= i;
            a3 = a2;
        }
        return fVar.p(fVar.f799b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte j2 = this.f374c.j();
            byte[] bArr = A1.c.f13a;
            int i5 = j2 & 255;
            if ((j2 & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (j2 & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
