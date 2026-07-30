package K6;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: K6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135f {

    /* renamed from: a, reason: collision with root package name */
    public final T6.f f1516a;

    /* renamed from: b, reason: collision with root package name */
    public int f1517b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1518c;

    /* renamed from: d, reason: collision with root package name */
    public int f1519d;

    /* renamed from: e, reason: collision with root package name */
    public C0133d[] f1520e;

    /* renamed from: f, reason: collision with root package name */
    public int f1521f;

    /* renamed from: g, reason: collision with root package name */
    public int f1522g;

    /* renamed from: h, reason: collision with root package name */
    public int f1523h;

    public C0135f(T6.f out) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f1516a = out;
        this.f1517b = Integer.MAX_VALUE;
        this.f1519d = 4096;
        this.f1520e = new C0133d[8];
        this.f1521f = 7;
    }

    public final void a(int i2) {
        int i5;
        if (i2 > 0) {
            int length = this.f1520e.length - 1;
            int i7 = 0;
            while (true) {
                i5 = this.f1521f;
                if (length < i5 || i2 <= 0) {
                    break;
                }
                C0133d c0133d = this.f1520e[length];
                Intrinsics.b(c0133d);
                i2 -= c0133d.f1508c;
                int i8 = this.f1523h;
                C0133d c0133d2 = this.f1520e[length];
                Intrinsics.b(c0133d2);
                this.f1523h = i8 - c0133d2.f1508c;
                this.f1522g--;
                i7++;
                length--;
            }
            C0133d[] c0133dArr = this.f1520e;
            int i9 = i5 + 1;
            System.arraycopy(c0133dArr, i9, c0133dArr, i9 + i7, this.f1522g);
            C0133d[] c0133dArr2 = this.f1520e;
            int i10 = this.f1521f + 1;
            Arrays.fill(c0133dArr2, i10, i10 + i7, (Object) null);
            this.f1521f += i7;
        }
    }

    public final void b(C0133d c0133d) {
        int i2 = c0133d.f1508c;
        int i5 = this.f1519d;
        if (i2 > i5) {
            C0133d[] c0133dArr = this.f1520e;
            kotlin.collections.o.i(c0133dArr, 0, c0133dArr.length);
            this.f1521f = this.f1520e.length - 1;
            this.f1522g = 0;
            this.f1523h = 0;
            return;
        }
        a((this.f1523h + i2) - i5);
        int i7 = this.f1522g + 1;
        C0133d[] c0133dArr2 = this.f1520e;
        if (i7 > c0133dArr2.length) {
            C0133d[] c0133dArr3 = new C0133d[c0133dArr2.length * 2];
            System.arraycopy(c0133dArr2, 0, c0133dArr3, c0133dArr2.length, c0133dArr2.length);
            this.f1521f = this.f1520e.length - 1;
            this.f1520e = c0133dArr3;
        }
        int i8 = this.f1521f;
        this.f1521f = i8 - 1;
        this.f1520e[i8] = c0133d;
        this.f1522g++;
        this.f1523h += i2;
    }

    public final void c(T6.i source) {
        Intrinsics.checkNotNullParameter(source, "data");
        int[] iArr = C.f1483a;
        Intrinsics.checkNotNullParameter(source, "bytes");
        int a7 = source.a();
        long j = 0;
        long j7 = 0;
        for (int i2 = 0; i2 < a7; i2++) {
            byte d7 = source.d(i2);
            byte[] bArr = E6.c.f709a;
            j7 += C.f1484b[d7 & 255];
        }
        int i5 = (int) ((j7 + 7) >> 3);
        int a8 = source.a();
        T6.f fVar = this.f1516a;
        if (i5 >= a8) {
            e(source.a(), 127, 0);
            fVar.F(source);
            return;
        }
        T6.f sink = new T6.f();
        int[] iArr2 = C.f1483a;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int a9 = source.a();
        int i7 = 0;
        for (int i8 = 0; i8 < a9; i8++) {
            byte d8 = source.d(i8);
            byte[] bArr2 = E6.c.f709a;
            int i9 = d8 & 255;
            int i10 = C.f1483a[i9];
            byte b7 = C.f1484b[i9];
            j = (j << b7) | i10;
            i7 += b7;
            while (i7 >= 8) {
                i7 -= 8;
                sink.H((int) (j >> i7));
            }
        }
        if (i7 > 0) {
            sink.H((int) ((j << (8 - i7)) | (255 >>> i7)));
        }
        T6.i e7 = sink.e(sink.f2617e);
        e(e7.a(), 127, 128);
        fVar.F(e7);
    }

    public final void d(ArrayList headerBlock) {
        int i2;
        int i5;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f1518c) {
            int i7 = this.f1517b;
            if (i7 < this.f1519d) {
                e(i7, 31, 32);
            }
            this.f1518c = false;
            this.f1517b = Integer.MAX_VALUE;
            e(this.f1519d, 31, 32);
        }
        int size = headerBlock.size();
        for (int i8 = 0; i8 < size; i8++) {
            C0133d c0133d = (C0133d) headerBlock.get(i8);
            T6.i i9 = c0133d.f1506a.i();
            T6.i iVar = c0133d.f1507b;
            Integer num = (Integer) g.f1525b.get(i9);
            if (num != null) {
                int intValue = num.intValue();
                i5 = intValue + 1;
                if (2 <= i5 && i5 < 8) {
                    C0133d[] c0133dArr = g.f1524a;
                    if (Intrinsics.a(c0133dArr[intValue].f1507b, iVar)) {
                        i2 = i5;
                    } else if (Intrinsics.a(c0133dArr[i5].f1507b, iVar)) {
                        i5 = intValue + 2;
                        i2 = i5;
                    }
                }
                i2 = i5;
                i5 = -1;
            } else {
                i2 = -1;
                i5 = -1;
            }
            if (i5 == -1) {
                int i10 = this.f1521f + 1;
                int length = this.f1520e.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    C0133d c0133d2 = this.f1520e[i10];
                    Intrinsics.b(c0133d2);
                    if (Intrinsics.a(c0133d2.f1506a, i9)) {
                        C0133d c0133d3 = this.f1520e[i10];
                        Intrinsics.b(c0133d3);
                        if (Intrinsics.a(c0133d3.f1507b, iVar)) {
                            i5 = g.f1524a.length + (i10 - this.f1521f);
                            break;
                        } else if (i2 == -1) {
                            i2 = (i10 - this.f1521f) + g.f1524a.length;
                        }
                    }
                    i10++;
                }
            }
            if (i5 != -1) {
                e(i5, 127, 128);
            } else if (i2 == -1) {
                this.f1516a.H(64);
                c(i9);
                c(iVar);
                b(c0133d);
            } else {
                T6.i prefix = C0133d.f1500d;
                i9.getClass();
                Intrinsics.checkNotNullParameter(prefix, "prefix");
                if (!i9.f(prefix, prefix.a()) || Intrinsics.a(C0133d.f1505i, i9)) {
                    e(i2, 63, 64);
                    c(iVar);
                    b(c0133d);
                } else {
                    e(i2, 15, 0);
                    c(iVar);
                }
            }
        }
    }

    public final void e(int i2, int i5, int i7) {
        T6.f fVar = this.f1516a;
        if (i2 < i5) {
            fVar.H(i2 | i7);
            return;
        }
        fVar.H(i7 | i5);
        int i8 = i2 - i5;
        while (i8 >= 128) {
            fVar.H(128 | (i8 & 127));
            i8 >>>= 7;
        }
        fVar.H(i8);
    }
}
