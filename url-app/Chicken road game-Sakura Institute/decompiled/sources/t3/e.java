package t3;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import z2.C1436t;
import z3.C1448f;
import z3.C1451i;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10772a;

    /* renamed from: b, reason: collision with root package name */
    public final C1448f f10773b;

    /* renamed from: c, reason: collision with root package name */
    public int f10774c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10775d;

    /* renamed from: e, reason: collision with root package name */
    public int f10776e;

    /* renamed from: f, reason: collision with root package name */
    public C1212c[] f10777f;

    /* renamed from: g, reason: collision with root package name */
    public int f10778g;

    /* renamed from: h, reason: collision with root package name */
    public int f10779h;

    /* renamed from: i, reason: collision with root package name */
    public int f10780i;

    public e(C1448f out) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f10772a = true;
        this.f10773b = out;
        this.f10774c = Integer.MAX_VALUE;
        this.f10776e = 4096;
        this.f10777f = new C1212c[8];
        this.f10778g = 7;
    }

    public final void a(int i2) {
        int i4;
        if (i2 > 0) {
            int length = this.f10777f.length - 1;
            int i5 = 0;
            while (true) {
                i4 = this.f10778g;
                if (length < i4 || i2 <= 0) {
                    break;
                }
                C1212c c1212c = this.f10777f[length];
                Intrinsics.c(c1212c);
                i2 -= c1212c.f10764c;
                int i6 = this.f10780i;
                C1212c c1212c2 = this.f10777f[length];
                Intrinsics.c(c1212c2);
                this.f10780i = i6 - c1212c2.f10764c;
                this.f10779h--;
                i5++;
                length--;
            }
            C1212c[] c1212cArr = this.f10777f;
            int i7 = i4 + 1;
            System.arraycopy(c1212cArr, i7, c1212cArr, i7 + i5, this.f10779h);
            C1212c[] c1212cArr2 = this.f10777f;
            int i8 = this.f10778g + 1;
            Arrays.fill(c1212cArr2, i8, i8 + i5, (Object) null);
            this.f10778g += i5;
        }
    }

    public final void b(C1212c c1212c) {
        int i2 = this.f10776e;
        int i4 = c1212c.f10764c;
        if (i4 > i2) {
            C1212c[] c1212cArr = this.f10777f;
            C1436t.k(c1212cArr, 0, c1212cArr.length);
            this.f10778g = this.f10777f.length - 1;
            this.f10779h = 0;
            this.f10780i = 0;
            return;
        }
        a((this.f10780i + i4) - i2);
        int i5 = this.f10779h + 1;
        C1212c[] c1212cArr2 = this.f10777f;
        if (i5 > c1212cArr2.length) {
            C1212c[] c1212cArr3 = new C1212c[c1212cArr2.length * 2];
            System.arraycopy(c1212cArr2, 0, c1212cArr3, c1212cArr2.length, c1212cArr2.length);
            this.f10778g = this.f10777f.length - 1;
            this.f10777f = c1212cArr3;
        }
        int i6 = this.f10778g;
        this.f10778g = i6 - 1;
        this.f10777f[i6] = c1212c;
        this.f10779h++;
        this.f10780i += i4;
    }

    public final void c(C1451i source) {
        Intrinsics.checkNotNullParameter(source, "data");
        C1448f c1448f = this.f10773b;
        if (this.f10772a) {
            int[] iArr = z.f10883a;
            Intrinsics.checkNotNullParameter(source, "bytes");
            int c4 = source.c();
            long j4 = 0;
            for (int i2 = 0; i2 < c4; i2++) {
                byte n2 = source.n(i2);
                byte[] bArr = n3.b.f8558a;
                j4 += z.f10884b[n2 & 255];
            }
            if (((int) ((j4 + 7) >> 3)) < source.c()) {
                C1448f sink = new C1448f();
                int[] iArr2 = z.f10883a;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(sink, "sink");
                int c5 = source.c();
                long j5 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < c5; i5++) {
                    byte n4 = source.n(i5);
                    byte[] bArr2 = n3.b.f8558a;
                    int i6 = n4 & 255;
                    int i7 = z.f10883a[i6];
                    byte b4 = z.f10884b[i6];
                    j5 = (j5 << b4) | i7;
                    i4 += b4;
                    while (i4 >= 8) {
                        i4 -= 8;
                        sink.y((int) (j5 >> i4));
                    }
                }
                if (i4 > 0) {
                    sink.y((int) ((255 >>> i4) | (j5 << (8 - i4))));
                }
                C1451i j6 = sink.j(sink.f11999e);
                e(j6.c(), 127, 128);
                c1448f.v(j6);
                return;
            }
        }
        e(source.c(), 127, 0);
        c1448f.v(source);
    }

    public final void d(ArrayList headerBlock) {
        int i2;
        int i4;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f10775d) {
            int i5 = this.f10774c;
            if (i5 < this.f10776e) {
                e(i5, 31, 32);
            }
            this.f10775d = false;
            this.f10774c = Integer.MAX_VALUE;
            e(this.f10776e, 31, 32);
        }
        int size = headerBlock.size();
        for (int i6 = 0; i6 < size; i6++) {
            C1212c c1212c = (C1212c) headerBlock.get(i6);
            C1451i B = c1212c.f10762a.B();
            Integer num = (Integer) f.f10782b.get(B);
            C1451i c1451i = c1212c.f10763b;
            if (num != null) {
                int intValue = num.intValue();
                i4 = intValue + 1;
                if (2 <= i4 && i4 < 8) {
                    C1212c[] c1212cArr = f.f10781a;
                    if (Intrinsics.a(c1212cArr[intValue].f10763b, c1451i)) {
                        i2 = i4;
                    } else if (Intrinsics.a(c1212cArr[i4].f10763b, c1451i)) {
                        i4 = intValue + 2;
                        i2 = i4;
                    }
                }
                i2 = i4;
                i4 = -1;
            } else {
                i2 = -1;
                i4 = -1;
            }
            if (i4 == -1) {
                int i7 = this.f10778g + 1;
                int length = this.f10777f.length;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    C1212c c1212c2 = this.f10777f[i7];
                    Intrinsics.c(c1212c2);
                    if (Intrinsics.a(c1212c2.f10762a, B)) {
                        C1212c c1212c3 = this.f10777f[i7];
                        Intrinsics.c(c1212c3);
                        if (Intrinsics.a(c1212c3.f10763b, c1451i)) {
                            i4 = f.f10781a.length + (i7 - this.f10778g);
                            break;
                        } else if (i2 == -1) {
                            i2 = (i7 - this.f10778g) + f.f10781a.length;
                        }
                    }
                    i7++;
                }
            }
            if (i4 != -1) {
                e(i4, 127, 128);
            } else if (i2 == -1) {
                this.f10773b.y(64);
                c(B);
                c(c1451i);
                b(c1212c);
            } else {
                C1451i prefix = C1212c.f10756d;
                B.getClass();
                Intrinsics.checkNotNullParameter(prefix, "prefix");
                if (!B.r(0, prefix, prefix.c()) || Intrinsics.a(C1212c.f10761i, B)) {
                    e(i2, 63, 64);
                    c(c1451i);
                    b(c1212c);
                } else {
                    e(i2, 15, 0);
                    c(c1451i);
                }
            }
        }
    }

    public final void e(int i2, int i4, int i5) {
        C1448f c1448f = this.f10773b;
        if (i2 < i4) {
            c1448f.y(i2 | i5);
            return;
        }
        c1448f.y(i5 | i4);
        int i6 = i2 - i4;
        while (i6 >= 128) {
            c1448f.y(128 | (i6 & 127));
            i6 >>>= 7;
        }
        c1448f.y(i6);
    }
}
