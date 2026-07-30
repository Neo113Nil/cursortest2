package K6;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: K6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134e {

    /* renamed from: a, reason: collision with root package name */
    public int f1509a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1510b;

    /* renamed from: c, reason: collision with root package name */
    public final T6.q f1511c;

    /* renamed from: d, reason: collision with root package name */
    public C0133d[] f1512d;

    /* renamed from: e, reason: collision with root package name */
    public int f1513e;

    /* renamed from: f, reason: collision with root package name */
    public int f1514f;

    /* renamed from: g, reason: collision with root package name */
    public int f1515g;

    public C0134e(u source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f1509a = 4096;
        this.f1510b = new ArrayList();
        this.f1511c = T6.b.b(source);
        this.f1512d = new C0133d[8];
        this.f1513e = 7;
    }

    public final int a(int i2) {
        int i5;
        int i7 = 0;
        if (i2 > 0) {
            int length = this.f1512d.length;
            while (true) {
                length--;
                i5 = this.f1513e;
                if (length < i5 || i2 <= 0) {
                    break;
                }
                C0133d c0133d = this.f1512d[length];
                Intrinsics.b(c0133d);
                int i8 = c0133d.f1508c;
                i2 -= i8;
                this.f1515g -= i8;
                this.f1514f--;
                i7++;
            }
            C0133d[] c0133dArr = this.f1512d;
            System.arraycopy(c0133dArr, i5 + 1, c0133dArr, i5 + 1 + i7, this.f1514f);
            this.f1513e += i7;
        }
        return i7;
    }

    public final T6.i b(int i2) {
        if (i2 >= 0) {
            C0133d[] c0133dArr = g.f1524a;
            if (i2 <= c0133dArr.length - 1) {
                return c0133dArr[i2].f1506a;
            }
        }
        int length = this.f1513e + 1 + (i2 - g.f1524a.length);
        if (length >= 0) {
            C0133d[] c0133dArr2 = this.f1512d;
            if (length < c0133dArr2.length) {
                C0133d c0133d = c0133dArr2[length];
                Intrinsics.b(c0133d);
                return c0133d.f1506a;
            }
        }
        throw new IOException("Header index too large " + (i2 + 1));
    }

    public final void c(C0133d c0133d) {
        this.f1510b.add(c0133d);
        int i2 = c0133d.f1508c;
        int i5 = this.f1509a;
        if (i2 > i5) {
            C0133d[] c0133dArr = this.f1512d;
            kotlin.collections.o.i(c0133dArr, 0, c0133dArr.length);
            this.f1513e = this.f1512d.length - 1;
            this.f1514f = 0;
            this.f1515g = 0;
            return;
        }
        a((this.f1515g + i2) - i5);
        int i7 = this.f1514f + 1;
        C0133d[] c0133dArr2 = this.f1512d;
        if (i7 > c0133dArr2.length) {
            C0133d[] c0133dArr3 = new C0133d[c0133dArr2.length * 2];
            System.arraycopy(c0133dArr2, 0, c0133dArr3, c0133dArr2.length, c0133dArr2.length);
            this.f1513e = this.f1512d.length - 1;
            this.f1512d = c0133dArr3;
        }
        int i8 = this.f1513e;
        this.f1513e = i8 - 1;
        this.f1512d[i8] = c0133d;
        this.f1514f++;
        this.f1515g += i2;
    }

    public final T6.i d() {
        T6.q source = this.f1511c;
        byte readByte = source.readByte();
        byte[] bArr = E6.c.f709a;
        int i2 = readByte & 255;
        int i5 = 0;
        boolean z7 = (readByte & 128) == 128;
        long e7 = e(i2, 127);
        if (!z7) {
            return source.e(e7);
        }
        T6.f sink = new T6.f();
        int[] iArr = C.f1483a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        B b7 = C.f1485c;
        B b8 = b7;
        int i7 = 0;
        for (long j = 0; j < e7; j++) {
            byte readByte2 = source.readByte();
            byte[] bArr2 = E6.c.f709a;
            i5 = (i5 << 8) | (readByte2 & 255);
            i7 += 8;
            while (i7 >= 8) {
                B[] bArr3 = (B[]) b8.f1482c;
                Intrinsics.b(bArr3);
                b8 = bArr3[(i5 >>> (i7 - 8)) & 255];
                Intrinsics.b(b8);
                if (((B[]) b8.f1482c) == null) {
                    sink.H(b8.f1480a);
                    i7 -= b8.f1481b;
                    b8 = b7;
                } else {
                    i7 -= 8;
                }
            }
        }
        while (i7 > 0) {
            B[] bArr4 = (B[]) b8.f1482c;
            Intrinsics.b(bArr4);
            B b9 = bArr4[(i5 << (8 - i7)) & 255];
            Intrinsics.b(b9);
            int i8 = b9.f1481b;
            if (((B[]) b9.f1482c) != null || i8 > i7) {
                break;
            }
            sink.H(b9.f1480a);
            i7 -= i8;
            b8 = b7;
        }
        return sink.e(sink.f2617e);
    }

    public final int e(int i2, int i5) {
        int i7 = i2 & i5;
        if (i7 < i5) {
            return i7;
        }
        int i8 = 0;
        while (true) {
            byte readByte = this.f1511c.readByte();
            byte[] bArr = E6.c.f709a;
            int i9 = readByte & 255;
            if ((readByte & 128) == 0) {
                return i5 + (i9 << i8);
            }
            i5 += (readByte & Byte.MAX_VALUE) << i8;
            i8 += 7;
        }
    }
}
