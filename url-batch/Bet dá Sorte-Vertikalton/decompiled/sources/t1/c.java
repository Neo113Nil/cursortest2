package t1;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public final z1.p f3841c;

    /* renamed from: f, reason: collision with root package name */
    public int f3843f;

    /* renamed from: g, reason: collision with root package name */
    public int f3844g;

    /* renamed from: a, reason: collision with root package name */
    public int f3839a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3840b = new ArrayList();
    public C0303b[] d = new C0303b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f3842e = 7;

    public c(r rVar) {
        this.f3841c = new z1.p(rVar);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.d.length;
            while (true) {
                length--;
                i2 = this.f3842e;
                if (length < i2 || i <= 0) {
                    break;
                }
                C0303b c0303b = this.d[length];
                b1.d.b(c0303b);
                int i4 = c0303b.f3838c;
                i -= i4;
                this.f3844g -= i4;
                this.f3843f--;
                i3++;
            }
            C0303b[] c0303bArr = this.d;
            System.arraycopy(c0303bArr, i2 + 1, c0303bArr, i2 + 1 + i3, this.f3843f);
            this.f3842e += i3;
        }
        return i3;
    }

    public final z1.i b(int i) {
        if (i >= 0) {
            C0303b[] c0303bArr = e.f3851a;
            if (i <= c0303bArr.length - 1) {
                return c0303bArr[i].f3836a;
            }
        }
        int length = this.f3842e + 1 + (i - e.f3851a.length);
        if (length >= 0) {
            C0303b[] c0303bArr2 = this.d;
            if (length < c0303bArr2.length) {
                C0303b c0303b = c0303bArr2[length];
                b1.d.b(c0303b);
                return c0303b.f3836a;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(C0303b c0303b) {
        this.f3840b.add(c0303b);
        int i = this.f3839a;
        int i2 = c0303b.f3838c;
        if (i2 > i) {
            C0303b[] c0303bArr = this.d;
            T0.g.u0(c0303bArr, 0, c0303bArr.length);
            this.f3842e = this.d.length - 1;
            this.f3843f = 0;
            this.f3844g = 0;
            return;
        }
        a((this.f3844g + i2) - i);
        int i3 = this.f3843f + 1;
        C0303b[] c0303bArr2 = this.d;
        if (i3 > c0303bArr2.length) {
            C0303b[] c0303bArr3 = new C0303b[c0303bArr2.length * 2];
            System.arraycopy(c0303bArr2, 0, c0303bArr3, c0303bArr2.length, c0303bArr2.length);
            this.f3842e = this.d.length - 1;
            this.d = c0303bArr3;
        }
        int i4 = this.f3842e;
        this.f3842e = i4 - 1;
        this.d[i4] = c0303b;
        this.f3843f++;
        this.f3844g += i2;
    }

    public final z1.i d() {
        int i;
        z1.p pVar = this.f3841c;
        byte i2 = pVar.i();
        byte[] bArr = n1.b.f3319a;
        int i3 = i2 & 255;
        int i4 = 0;
        boolean z2 = (i2 & 128) == 128;
        long e2 = e(i3, 127);
        if (!z2) {
            return pVar.j(e2);
        }
        z1.f fVar = new z1.f();
        int[] iArr = z.f3939a;
        b1.d.e(pVar, "source");
        y yVar = z.f3941c;
        y yVar2 = yVar;
        int i5 = 0;
        for (long j2 = 0; j2 < e2; j2++) {
            byte i6 = pVar.i();
            byte[] bArr2 = n1.b.f3319a;
            i4 = (i4 << 8) | (i6 & 255);
            i5 += 8;
            while (i5 >= 8) {
                y[] yVarArr = (y[]) yVar2.f3938c;
                b1.d.b(yVarArr);
                yVar2 = yVarArr[(i4 >>> (i5 - 8)) & 255];
                b1.d.b(yVar2);
                if (((y[]) yVar2.f3938c) == null) {
                    fVar.u(yVar2.f3936a);
                    i5 -= yVar2.f3937b;
                    yVar2 = yVar;
                } else {
                    i5 -= 8;
                }
            }
        }
        while (i5 > 0) {
            y[] yVarArr2 = (y[]) yVar2.f3938c;
            b1.d.b(yVarArr2);
            y yVar3 = yVarArr2[(i4 << (8 - i5)) & 255];
            b1.d.b(yVar3);
            if (((y[]) yVar3.f3938c) != null || (i = yVar3.f3937b) > i5) {
                break;
            }
            fVar.u(yVar3.f3936a);
            i5 -= i;
            yVar2 = yVar;
        }
        return fVar.k(fVar.f4269b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte i5 = this.f3841c.i();
            byte[] bArr = n1.b.f3319a;
            int i6 = i5 & 255;
            if ((i5 & 128) == 0) {
                return i2 + (i6 << i4);
            }
            i2 += (i5 & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
