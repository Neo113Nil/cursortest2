package N2;

import T2.C0231f;
import T2.C0234i;
import h2.AbstractC0508a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: N2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205c {

    /* renamed from: c, reason: collision with root package name */
    public final T2.z f3591c;

    /* renamed from: f, reason: collision with root package name */
    public int f3594f;

    /* renamed from: g, reason: collision with root package name */
    public int f3595g;

    /* renamed from: a, reason: collision with root package name */
    public int f3589a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3590b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C0204b[] f3592d = new C0204b[8];

    /* renamed from: e, reason: collision with root package name */
    public int f3593e = 7;

    public C0205c(s sVar) {
        this.f3591c = AbstractC0508a.p(sVar);
    }

    public final int a(int i3) {
        int i4;
        int i5 = 0;
        if (i3 > 0) {
            int length = this.f3592d.length;
            while (true) {
                length--;
                i4 = this.f3593e;
                if (length < i4 || i3 <= 0) {
                    break;
                }
                C0204b c0204b = this.f3592d[length];
                f2.j.c(c0204b);
                int i6 = c0204b.f3588c;
                i3 -= i6;
                this.f3595g -= i6;
                this.f3594f--;
                i5++;
            }
            C0204b[] c0204bArr = this.f3592d;
            System.arraycopy(c0204bArr, i4 + 1, c0204bArr, i4 + 1 + i5, this.f3594f);
            this.f3593e += i5;
        }
        return i5;
    }

    public final C0234i b(int i3) {
        if (i3 >= 0) {
            C0204b[] c0204bArr = e.f3605a;
            if (i3 <= c0204bArr.length - 1) {
                return c0204bArr[i3].f3586a;
            }
        }
        int length = this.f3593e + 1 + (i3 - e.f3605a.length);
        if (length >= 0) {
            C0204b[] c0204bArr2 = this.f3592d;
            if (length < c0204bArr2.length) {
                C0204b c0204b = c0204bArr2[length];
                f2.j.c(c0204b);
                return c0204b.f3586a;
            }
        }
        throw new IOException("Header index too large " + (i3 + 1));
    }

    public final void c(C0204b c0204b) {
        this.f3590b.add(c0204b);
        int i3 = this.f3589a;
        int i4 = c0204b.f3588c;
        if (i4 > i3) {
            S1.k.r0(r7, null, 0, this.f3592d.length);
            this.f3593e = this.f3592d.length - 1;
            this.f3594f = 0;
            this.f3595g = 0;
            return;
        }
        a((this.f3595g + i4) - i3);
        int i5 = this.f3594f + 1;
        C0204b[] c0204bArr = this.f3592d;
        if (i5 > c0204bArr.length) {
            C0204b[] c0204bArr2 = new C0204b[c0204bArr.length * 2];
            System.arraycopy(c0204bArr, 0, c0204bArr2, c0204bArr.length, c0204bArr.length);
            this.f3593e = this.f3592d.length - 1;
            this.f3592d = c0204bArr2;
        }
        int i6 = this.f3593e;
        this.f3593e = i6 - 1;
        this.f3592d[i6] = c0204b;
        this.f3594f++;
        this.f3595g += i4;
    }

    public final C0234i d() {
        int i3;
        T2.z zVar = this.f3591c;
        byte d3 = zVar.d();
        byte[] bArr = H2.b.f2632a;
        int i4 = d3 & 255;
        int i5 = 0;
        boolean z3 = (d3 & 128) == 128;
        long e3 = e(i4, 127);
        if (!z3) {
            return zVar.e(e3);
        }
        C0231f c0231f = new C0231f();
        int[] iArr = A.f3573a;
        f2.j.f(zVar, "source");
        z zVar2 = A.f3575c;
        z zVar3 = zVar2;
        int i6 = 0;
        for (long j3 = 0; j3 < e3; j3++) {
            byte d4 = zVar.d();
            byte[] bArr2 = H2.b.f2632a;
            i5 = (i5 << 8) | (d4 & 255);
            i6 += 8;
            while (i6 >= 8) {
                z[] zVarArr = (z[]) zVar3.f3714f;
                f2.j.c(zVarArr);
                zVar3 = zVarArr[(i5 >>> (i6 - 8)) & 255];
                f2.j.c(zVar3);
                if (((z[]) zVar3.f3714f) == null) {
                    c0231f.E(zVar3.f3712d);
                    i6 -= zVar3.f3713e;
                    zVar3 = zVar2;
                } else {
                    i6 -= 8;
                }
            }
        }
        while (i6 > 0) {
            z[] zVarArr2 = (z[]) zVar3.f3714f;
            f2.j.c(zVarArr2);
            z zVar4 = zVarArr2[(i5 << (8 - i6)) & 255];
            f2.j.c(zVar4);
            if (((z[]) zVar4.f3714f) != null || (i3 = zVar4.f3713e) > i6) {
                break;
            }
            c0231f.E(zVar4.f3712d);
            i6 -= i3;
            zVar3 = zVar2;
        }
        return c0231f.n(c0231f.f4409e);
    }

    public final int e(int i3, int i4) {
        int i5 = i3 & i4;
        if (i5 < i4) {
            return i5;
        }
        int i6 = 0;
        while (true) {
            byte d3 = this.f3591c.d();
            byte[] bArr = H2.b.f2632a;
            int i7 = d3 & 255;
            if ((d3 & 128) == 0) {
                return i4 + (i7 << i6);
            }
            i4 += (d3 & Byte.MAX_VALUE) << i6;
            i6 += 7;
        }
    }
}
