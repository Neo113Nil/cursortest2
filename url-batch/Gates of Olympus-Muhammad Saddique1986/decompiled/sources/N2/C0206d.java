package N2;

import T2.C0231f;
import T2.C0234i;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: N2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206d {

    /* renamed from: b, reason: collision with root package name */
    public final C0231f f3597b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3599d;

    /* renamed from: h, reason: collision with root package name */
    public int f3603h;

    /* renamed from: i, reason: collision with root package name */
    public int f3604i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3596a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f3598c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f3600e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public C0204b[] f3601f = new C0204b[8];

    /* renamed from: g, reason: collision with root package name */
    public int f3602g = 7;

    public C0206d(C0231f c0231f) {
        this.f3597b = c0231f;
    }

    public final void a(int i3) {
        int i4;
        if (i3 > 0) {
            int length = this.f3601f.length - 1;
            int i5 = 0;
            while (true) {
                i4 = this.f3602g;
                if (length < i4 || i3 <= 0) {
                    break;
                }
                C0204b c0204b = this.f3601f[length];
                f2.j.c(c0204b);
                i3 -= c0204b.f3588c;
                int i6 = this.f3604i;
                C0204b c0204b2 = this.f3601f[length];
                f2.j.c(c0204b2);
                this.f3604i = i6 - c0204b2.f3588c;
                this.f3603h--;
                i5++;
                length--;
            }
            C0204b[] c0204bArr = this.f3601f;
            int i7 = i4 + 1;
            System.arraycopy(c0204bArr, i7, c0204bArr, i7 + i5, this.f3603h);
            C0204b[] c0204bArr2 = this.f3601f;
            int i8 = this.f3602g + 1;
            Arrays.fill(c0204bArr2, i8, i8 + i5, (Object) null);
            this.f3602g += i5;
        }
    }

    public final void b(C0204b c0204b) {
        int i3 = this.f3600e;
        int i4 = c0204b.f3588c;
        if (i4 > i3) {
            C0204b[] c0204bArr = this.f3601f;
            S1.k.r0(c0204bArr, null, 0, c0204bArr.length);
            this.f3602g = this.f3601f.length - 1;
            this.f3603h = 0;
            this.f3604i = 0;
            return;
        }
        a((this.f3604i + i4) - i3);
        int i5 = this.f3603h + 1;
        C0204b[] c0204bArr2 = this.f3601f;
        if (i5 > c0204bArr2.length) {
            C0204b[] c0204bArr3 = new C0204b[c0204bArr2.length * 2];
            System.arraycopy(c0204bArr2, 0, c0204bArr3, c0204bArr2.length, c0204bArr2.length);
            this.f3602g = this.f3601f.length - 1;
            this.f3601f = c0204bArr3;
        }
        int i6 = this.f3602g;
        this.f3602g = i6 - 1;
        this.f3601f[i6] = c0204b;
        this.f3603h++;
        this.f3604i += i4;
    }

    public final void c(C0234i c0234i) {
        f2.j.f(c0234i, "data");
        C0231f c0231f = this.f3597b;
        if (this.f3596a) {
            int[] iArr = A.f3573a;
            int b3 = c0234i.b();
            long j3 = 0;
            for (int i3 = 0; i3 < b3; i3++) {
                byte g3 = c0234i.g(i3);
                byte[] bArr = H2.b.f2632a;
                j3 += A.f3574b[g3 & 255];
            }
            if (((int) ((j3 + 7) >> 3)) < c0234i.b()) {
                C0231f c0231f2 = new C0231f();
                int[] iArr2 = A.f3573a;
                int b4 = c0234i.b();
                long j4 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < b4; i5++) {
                    byte g4 = c0234i.g(i5);
                    byte[] bArr2 = H2.b.f2632a;
                    int i6 = g4 & 255;
                    int i7 = A.f3573a[i6];
                    byte b5 = A.f3574b[i6];
                    j4 = (j4 << b5) | i7;
                    i4 += b5;
                    while (i4 >= 8) {
                        i4 -= 8;
                        c0231f2.E((int) (j4 >> i4));
                    }
                }
                if (i4 > 0) {
                    c0231f2.E((int) ((255 >>> i4) | (j4 << (8 - i4))));
                }
                C0234i n3 = c0231f2.n(c0231f2.f4409e);
                e(n3.b(), 127, 128);
                c0231f.y(n3);
                return;
            }
        }
        e(c0234i.b(), 127, 0);
        c0231f.y(c0234i);
    }

    public final void d(ArrayList arrayList) {
        int i3;
        int i4;
        if (this.f3599d) {
            int i5 = this.f3598c;
            if (i5 < this.f3600e) {
                e(i5, 31, 32);
            }
            this.f3599d = false;
            this.f3598c = Integer.MAX_VALUE;
            e(this.f3600e, 31, 32);
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C0204b c0204b = (C0204b) arrayList.get(i6);
            C0234i n3 = c0204b.f3586a.n();
            Integer num = (Integer) e.f3606b.get(n3);
            C0234i c0234i = c0204b.f3587b;
            if (num != null) {
                int intValue = num.intValue();
                i4 = intValue + 1;
                if (2 <= i4 && i4 < 8) {
                    C0204b[] c0204bArr = e.f3605a;
                    if (f2.j.a(c0204bArr[intValue].f3587b, c0234i)) {
                        i3 = i4;
                    } else if (f2.j.a(c0204bArr[i4].f3587b, c0234i)) {
                        i4 = intValue + 2;
                        i3 = i4;
                    }
                }
                i3 = i4;
                i4 = -1;
            } else {
                i3 = -1;
                i4 = -1;
            }
            if (i4 == -1) {
                int i7 = this.f3602g + 1;
                int length = this.f3601f.length;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    C0204b c0204b2 = this.f3601f[i7];
                    f2.j.c(c0204b2);
                    if (f2.j.a(c0204b2.f3586a, n3)) {
                        C0204b c0204b3 = this.f3601f[i7];
                        f2.j.c(c0204b3);
                        if (f2.j.a(c0204b3.f3587b, c0234i)) {
                            i4 = e.f3605a.length + (i7 - this.f3602g);
                            break;
                        } else if (i3 == -1) {
                            i3 = (i7 - this.f3602g) + e.f3605a.length;
                        }
                    }
                    i7++;
                }
            }
            if (i4 != -1) {
                e(i4, 127, 128);
            } else if (i3 == -1) {
                this.f3597b.E(64);
                c(n3);
                c(c0234i);
                b(c0204b);
            } else {
                C0234i c0234i2 = C0204b.f3580d;
                n3.getClass();
                f2.j.f(c0234i2, "prefix");
                if (!n3.j(0, c0234i2, c0234i2.b()) || f2.j.a(C0204b.f3585i, n3)) {
                    e(i3, 63, 64);
                    c(c0234i);
                    b(c0204b);
                } else {
                    e(i3, 15, 0);
                    c(c0234i);
                }
            }
        }
    }

    public final void e(int i3, int i4, int i5) {
        C0231f c0231f = this.f3597b;
        if (i3 < i4) {
            c0231f.E(i3 | i5);
            return;
        }
        c0231f.E(i5 | i4);
        int i6 = i3 - i4;
        while (i6 >= 128) {
            c0231f.E(128 | (i6 & 127));
            i6 >>>= 7;
        }
        c0231f.E(i6);
    }
}
