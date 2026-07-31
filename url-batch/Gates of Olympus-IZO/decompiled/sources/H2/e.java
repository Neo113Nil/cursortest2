package H2;

import N2.C0150f;
import N2.C0153i;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public final C0150f f1945b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1947d;

    /* renamed from: h, reason: collision with root package name */
    public int f1951h;

    /* renamed from: i, reason: collision with root package name */
    public int f1952i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1944a = true;

    /* renamed from: c, reason: collision with root package name */
    public int f1946c = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f1948e = 4096;

    /* renamed from: f, reason: collision with root package name */
    public C0081c[] f1949f = new C0081c[8];

    /* renamed from: g, reason: collision with root package name */
    public int f1950g = 7;

    public e(C0150f c0150f) {
        this.f1945b = c0150f;
    }

    public final void a(int i3) {
        int i4;
        if (i3 > 0) {
            int length = this.f1949f.length - 1;
            int i5 = 0;
            while (true) {
                i4 = this.f1950g;
                if (length < i4 || i3 <= 0) {
                    break;
                }
                C0081c c0081c = this.f1949f[length];
                Z1.i.c(c0081c);
                i3 -= c0081c.f1936c;
                int i6 = this.f1952i;
                C0081c c0081c2 = this.f1949f[length];
                Z1.i.c(c0081c2);
                this.f1952i = i6 - c0081c2.f1936c;
                this.f1951h--;
                i5++;
                length--;
            }
            C0081c[] c0081cArr = this.f1949f;
            int i7 = i4 + 1;
            System.arraycopy(c0081cArr, i7, c0081cArr, i7 + i5, this.f1951h);
            C0081c[] c0081cArr2 = this.f1949f;
            int i8 = this.f1950g + 1;
            Arrays.fill(c0081cArr2, i8, i8 + i5, (Object) null);
            this.f1950g += i5;
        }
    }

    public final void b(C0081c c0081c) {
        int i3 = this.f1948e;
        int i4 = c0081c.f1936c;
        if (i4 > i3) {
            C0081c[] c0081cArr = this.f1949f;
            M1.k.c0(c0081cArr, 0, c0081cArr.length);
            this.f1950g = this.f1949f.length - 1;
            this.f1951h = 0;
            this.f1952i = 0;
            return;
        }
        a((this.f1952i + i4) - i3);
        int i5 = this.f1951h + 1;
        C0081c[] c0081cArr2 = this.f1949f;
        if (i5 > c0081cArr2.length) {
            C0081c[] c0081cArr3 = new C0081c[c0081cArr2.length * 2];
            System.arraycopy(c0081cArr2, 0, c0081cArr3, c0081cArr2.length, c0081cArr2.length);
            this.f1950g = this.f1949f.length - 1;
            this.f1949f = c0081cArr3;
        }
        int i6 = this.f1950g;
        this.f1950g = i6 - 1;
        this.f1949f[i6] = c0081c;
        this.f1951h++;
        this.f1952i += i4;
    }

    public final void c(C0153i c0153i) {
        Z1.i.f(c0153i, "data");
        C0150f c0150f = this.f1945b;
        if (this.f1944a) {
            int[] iArr = A.f1921a;
            int b2 = c0153i.b();
            long j3 = 0;
            for (int i3 = 0; i3 < b2; i3++) {
                byte g3 = c0153i.g(i3);
                byte[] bArr = B2.c.f415a;
                j3 += A.f1922b[g3 & 255];
            }
            if (((int) ((j3 + 7) >> 3)) < c0153i.b()) {
                C0150f c0150f2 = new C0150f();
                int[] iArr2 = A.f1921a;
                int b3 = c0153i.b();
                long j4 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < b3; i5++) {
                    byte g4 = c0153i.g(i5);
                    byte[] bArr2 = B2.c.f415a;
                    int i6 = g4 & 255;
                    int i7 = A.f1921a[i6];
                    byte b4 = A.f1922b[i6];
                    j4 = (j4 << b4) | i7;
                    i4 += b4;
                    while (i4 >= 8) {
                        i4 -= 8;
                        c0150f2.Q((int) (j4 >> i4));
                    }
                }
                if (i4 > 0) {
                    c0150f2.Q((int) ((255 >>> i4) | (j4 << (8 - i4))));
                }
                C0153i m3 = c0150f2.m(c0150f2.f2929e);
                e(m3.b(), 127, 128);
                c0150f.L(m3);
                return;
            }
        }
        e(c0153i.b(), 127, 0);
        c0150f.L(c0153i);
    }

    public final void d(ArrayList arrayList) {
        int i3;
        int i4;
        if (this.f1947d) {
            int i5 = this.f1946c;
            if (i5 < this.f1948e) {
                e(i5, 31, 32);
            }
            this.f1947d = false;
            this.f1946c = Integer.MAX_VALUE;
            e(this.f1948e, 31, 32);
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C0081c c0081c = (C0081c) arrayList.get(i6);
            C0153i n3 = c0081c.f1934a.n();
            Integer num = (Integer) f.f1954b.get(n3);
            C0153i c0153i = c0081c.f1935b;
            if (num != null) {
                int intValue = num.intValue();
                i4 = intValue + 1;
                if (2 <= i4 && i4 < 8) {
                    C0081c[] c0081cArr = f.f1953a;
                    if (Z1.i.a(c0081cArr[intValue].f1935b, c0153i)) {
                        i3 = i4;
                    } else if (Z1.i.a(c0081cArr[i4].f1935b, c0153i)) {
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
                int i7 = this.f1950g + 1;
                int length = this.f1949f.length;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    C0081c c0081c2 = this.f1949f[i7];
                    Z1.i.c(c0081c2);
                    if (Z1.i.a(c0081c2.f1934a, n3)) {
                        C0081c c0081c3 = this.f1949f[i7];
                        Z1.i.c(c0081c3);
                        if (Z1.i.a(c0081c3.f1935b, c0153i)) {
                            i4 = f.f1953a.length + (i7 - this.f1950g);
                            break;
                        } else if (i3 == -1) {
                            i3 = (i7 - this.f1950g) + f.f1953a.length;
                        }
                    }
                    i7++;
                }
            }
            if (i4 != -1) {
                e(i4, 127, 128);
            } else if (i3 == -1) {
                this.f1945b.Q(64);
                c(n3);
                c(c0153i);
                b(c0081c);
            } else {
                C0153i c0153i2 = C0081c.f1928d;
                n3.getClass();
                Z1.i.f(c0153i2, "prefix");
                if (!n3.j(0, c0153i2, c0153i2.b()) || Z1.i.a(C0081c.f1933i, n3)) {
                    e(i3, 63, 64);
                    c(c0153i);
                    b(c0081c);
                } else {
                    e(i3, 15, 0);
                    c(c0153i);
                }
            }
        }
    }

    public final void e(int i3, int i4, int i5) {
        C0150f c0150f = this.f1945b;
        if (i3 < i4) {
            c0150f.Q(i3 | i5);
            return;
        }
        c0150f.Q(i5 | i4);
        int i6 = i3 - i4;
        while (i6 >= 128) {
            c0150f.Q(128 | (i6 & 127));
            i6 >>>= 7;
        }
        c0150f.Q(i6);
    }
}
