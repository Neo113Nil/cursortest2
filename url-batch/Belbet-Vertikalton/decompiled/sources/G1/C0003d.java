package G1;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: G1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d {

    /* renamed from: c, reason: collision with root package name */
    public final M1.p f357c;

    /* renamed from: f, reason: collision with root package name */
    public int f359f;

    /* renamed from: g, reason: collision with root package name */
    public int f360g;

    /* renamed from: a, reason: collision with root package name */
    public int f355a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f356b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C0002c[] f358d = new C0002c[8];
    public int e = 7;

    public C0003d(t tVar) {
        this.f357c = new M1.p(tVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f358d.length;
            while (true) {
                length--;
                i2 = this.e;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0002c c0002c = this.f358d[length];
                j1.h.b(c0002c);
                int i4 = c0002c.f354c;
                i -= i4;
                this.f360g -= i4;
                this.f359f--;
                i3++;
            }
            C0002c[] c0002cArr = this.f358d;
            System.arraycopy(c0002cArr, i2 + 1, c0002cArr, i2 + 1 + i3, this.f359f);
            this.e += i3;
        }
        return i3;
    }

    public final M1.i b(int i) {
        if (i >= 0) {
            C0002c[] c0002cArr = f.f368a;
            if (i <= c0002cArr.length - 1) {
                return c0002cArr[i].f352a;
            }
        }
        int length = this.e + 1 + (i - f.f368a.length);
        if (length >= 0) {
            C0002c[] c0002cArr2 = this.f358d;
            if (length < c0002cArr2.length) {
                C0002c c0002c = c0002cArr2[length];
                j1.h.b(c0002c);
                return c0002c.f352a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C0002c c0002c) {
        this.f356b.add(c0002c);
        int i = this.f355a;
        int i2 = c0002c.f354c;
        if (i2 > i) {
            C0002c[] c0002cArr = this.f358d;
            X0.j.o0(c0002cArr, 0, c0002cArr.length);
            this.e = this.f358d.length - 1;
            this.f359f = 0;
            this.f360g = 0;
            return;
        }
        a((this.f360g + i2) - i);
        int i3 = this.f359f + 1;
        C0002c[] c0002cArr2 = this.f358d;
        if (i3 > c0002cArr2.length) {
            C0002c[] c0002cArr3 = new C0002c[c0002cArr2.length * 2];
            System.arraycopy(c0002cArr2, 0, c0002cArr3, c0002cArr2.length, c0002cArr2.length);
            this.e = this.f358d.length - 1;
            this.f358d = c0002cArr3;
        }
        int i4 = this.e;
        this.e = i4 - 1;
        this.f358d[i4] = c0002c;
        this.f359f++;
        this.f360g += i2;
    }

    public final M1.i d() {
        int i;
        M1.p pVar = this.f357c;
        byte q2 = pVar.q();
        byte[] bArr = A1.c.f19a;
        int i2 = q2 & 255;
        int i3 = 0;
        boolean z2 = (q2 & 128) == 128;
        long e = e(i2, 127);
        if (!z2) {
            return pVar.z(e);
        }
        M1.f fVar = new M1.f();
        int[] iArr = B.f341a;
        j1.h.e(pVar, "source");
        A a2 = B.f343c;
        A a3 = a2;
        int i4 = 0;
        for (long j = 0; j < e; j++) {
            byte q3 = pVar.q();
            byte[] bArr2 = A1.c.f19a;
            i3 = (i3 << 8) | (q3 & 255);
            i4 += 8;
            while (i4 >= 8) {
                A[] aArr = (A[]) a3.f340c;
                j1.h.b(aArr);
                a3 = aArr[(i3 >>> (i4 - 8)) & 255];
                j1.h.b(a3);
                if (((A[]) a3.f340c) == null) {
                    fVar.M(a3.f338a);
                    i4 -= a3.f339b;
                    a3 = a2;
                } else {
                    i4 -= 8;
                }
            }
        }
        while (i4 > 0) {
            A[] aArr2 = (A[]) a3.f340c;
            j1.h.b(aArr2);
            A a4 = aArr2[(i3 << (8 - i4)) & 255];
            j1.h.b(a4);
            if (((A[]) a4.f340c) != null || (i = a4.f339b) > i4) {
                break;
            }
            fVar.M(a4.f338a);
            i4 -= i;
            a3 = a2;
        }
        return fVar.B(fVar.f827b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte q2 = this.f357c.q();
            byte[] bArr = A1.c.f19a;
            int i5 = q2 & 255;
            if ((q2 & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (q2 & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
