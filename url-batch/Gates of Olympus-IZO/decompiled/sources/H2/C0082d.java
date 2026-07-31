package H2;

import N2.C0150f;
import N2.C0153i;
import a.AbstractC0157a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: H2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082d {

    /* renamed from: c, reason: collision with root package name */
    public final N2.z f1939c;

    /* renamed from: f, reason: collision with root package name */
    public int f1942f;

    /* renamed from: g, reason: collision with root package name */
    public int f1943g;

    /* renamed from: a, reason: collision with root package name */
    public int f1937a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1938b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public C0081c[] f1940d = new C0081c[8];

    /* renamed from: e, reason: collision with root package name */
    public int f1941e = 7;

    public C0082d(s sVar) {
        this.f1939c = AbstractC0157a.j(sVar);
    }

    public final int a(int i3) {
        int i4;
        int i5 = 0;
        if (i3 > 0) {
            int length = this.f1940d.length;
            while (true) {
                length--;
                i4 = this.f1941e;
                if (length < i4 || i3 <= 0) {
                    break;
                }
                C0081c c0081c = this.f1940d[length];
                Z1.i.c(c0081c);
                int i6 = c0081c.f1936c;
                i3 -= i6;
                this.f1943g -= i6;
                this.f1942f--;
                i5++;
            }
            C0081c[] c0081cArr = this.f1940d;
            System.arraycopy(c0081cArr, i4 + 1, c0081cArr, i4 + 1 + i5, this.f1942f);
            this.f1941e += i5;
        }
        return i5;
    }

    public final C0153i b(int i3) {
        if (i3 >= 0) {
            C0081c[] c0081cArr = f.f1953a;
            if (i3 <= c0081cArr.length - 1) {
                return c0081cArr[i3].f1934a;
            }
        }
        int length = this.f1941e + 1 + (i3 - f.f1953a.length);
        if (length >= 0) {
            C0081c[] c0081cArr2 = this.f1940d;
            if (length < c0081cArr2.length) {
                C0081c c0081c = c0081cArr2[length];
                Z1.i.c(c0081c);
                return c0081c.f1934a;
            }
        }
        throw new IOException("Header index too large " + (i3 + 1));
    }

    public final void c(C0081c c0081c) {
        this.f1938b.add(c0081c);
        int i3 = this.f1937a;
        int i4 = c0081c.f1936c;
        if (i4 > i3) {
            M1.k.c0(r7, 0, this.f1940d.length);
            this.f1941e = this.f1940d.length - 1;
            this.f1942f = 0;
            this.f1943g = 0;
            return;
        }
        a((this.f1943g + i4) - i3);
        int i5 = this.f1942f + 1;
        C0081c[] c0081cArr = this.f1940d;
        if (i5 > c0081cArr.length) {
            C0081c[] c0081cArr2 = new C0081c[c0081cArr.length * 2];
            System.arraycopy(c0081cArr, 0, c0081cArr2, c0081cArr.length, c0081cArr.length);
            this.f1941e = this.f1940d.length - 1;
            this.f1940d = c0081cArr2;
        }
        int i6 = this.f1941e;
        this.f1941e = i6 - 1;
        this.f1940d[i6] = c0081c;
        this.f1942f++;
        this.f1943g += i4;
    }

    public final C0153i d() {
        int i3;
        N2.z zVar = this.f1939c;
        byte e3 = zVar.e();
        byte[] bArr = B2.c.f415a;
        int i4 = e3 & 255;
        int i5 = 0;
        boolean z3 = (e3 & 128) == 128;
        long e4 = e(i4, 127);
        if (!z3) {
            return zVar.h(e4);
        }
        C0150f c0150f = new C0150f();
        int[] iArr = A.f1921a;
        Z1.i.f(zVar, "source");
        z zVar2 = A.f1923c;
        z zVar3 = zVar2;
        int i6 = 0;
        for (long j3 = 0; j3 < e4; j3++) {
            byte e5 = zVar.e();
            byte[] bArr2 = B2.c.f415a;
            i5 = (i5 << 8) | (e5 & 255);
            i6 += 8;
            while (i6 >= 8) {
                z[] zVarArr = (z[]) zVar3.f2057c;
                Z1.i.c(zVarArr);
                zVar3 = zVarArr[(i5 >>> (i6 - 8)) & 255];
                Z1.i.c(zVar3);
                if (((z[]) zVar3.f2057c) == null) {
                    c0150f.Q(zVar3.f2055a);
                    i6 -= zVar3.f2056b;
                    zVar3 = zVar2;
                } else {
                    i6 -= 8;
                }
            }
        }
        while (i6 > 0) {
            z[] zVarArr2 = (z[]) zVar3.f2057c;
            Z1.i.c(zVarArr2);
            z zVar4 = zVarArr2[(i5 << (8 - i6)) & 255];
            Z1.i.c(zVar4);
            if (((z[]) zVar4.f2057c) != null || (i3 = zVar4.f2056b) > i6) {
                break;
            }
            c0150f.Q(zVar4.f2055a);
            i6 -= i3;
            zVar3 = zVar2;
        }
        return c0150f.m(c0150f.f2929e);
    }

    public final int e(int i3, int i4) {
        int i5 = i3 & i4;
        if (i5 < i4) {
            return i5;
        }
        int i6 = 0;
        while (true) {
            byte e3 = this.f1939c.e();
            byte[] bArr = B2.c.f415a;
            int i7 = e3 & 255;
            if ((e3 & 128) == 0) {
                return i4 + (i7 << i6);
            }
            i4 += (e3 & Byte.MAX_VALUE) << i6;
            i6 += 7;
        }
    }
}
