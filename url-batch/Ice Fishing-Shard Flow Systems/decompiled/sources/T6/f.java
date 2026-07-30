package T6;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: d, reason: collision with root package name */
    public r f2616d;

    /* renamed from: e, reason: collision with root package name */
    public long f2617e;

    @Override // T6.g
    public final /* bridge */ /* synthetic */ g A(String str) {
        N(str);
        return this;
    }

    public final i B(int i2) {
        if (i2 == 0) {
            return i.f2618l;
        }
        b.d(this.f2617e, 0L, i2);
        r rVar = this.f2616d;
        int i5 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i2) {
            Intrinsics.b(rVar);
            int i9 = rVar.f2645c;
            int i10 = rVar.f2644b;
            if (i9 == i10) {
                throw new AssertionError("s.limit == s.pos");
            }
            i7 += i9 - i10;
            i8++;
            rVar = rVar.f2648f;
        }
        byte[][] bArr = new byte[i8][];
        int[] iArr = new int[i8 * 2];
        r rVar2 = this.f2616d;
        int i11 = 0;
        while (i5 < i2) {
            Intrinsics.b(rVar2);
            bArr[i11] = rVar2.f2643a;
            i5 += rVar2.f2645c - rVar2.f2644b;
            iArr[i11] = Math.min(i5, i2);
            iArr[i11 + i8] = rVar2.f2644b;
            rVar2.f2646d = true;
            i11++;
            rVar2 = rVar2.f2648f;
        }
        return new t(bArr, iArr);
    }

    public final r E(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        r rVar = this.f2616d;
        if (rVar == null) {
            r b7 = s.b();
            this.f2616d = b7;
            b7.f2649g = b7;
            b7.f2648f = b7;
            return b7;
        }
        r rVar2 = rVar.f2649g;
        Intrinsics.b(rVar2);
        if (rVar2.f2645c + i2 <= 8192 && rVar2.f2647e) {
            return rVar2;
        }
        r b8 = s.b();
        rVar2.b(b8);
        return b8;
    }

    public final void F(i byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.l(this, byteString.a());
    }

    public final long G(w source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long o7 = source.o(8192L, this);
            if (o7 == -1) {
                return j;
            }
            j += o7;
        }
    }

    public final void H(int i2) {
        r E7 = E(1);
        byte[] bArr = E7.f2643a;
        int i5 = E7.f2645c;
        E7.f2645c = i5 + 1;
        bArr[i5] = (byte) i2;
        this.f2617e++;
    }

    public final void I(long j) {
        boolean z7;
        if (j == 0) {
            H(48);
            return;
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                N("-9223372036854775808");
                return;
            }
            z7 = true;
        } else {
            z7 = false;
        }
        byte[] bArr = U6.a.f2736a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        int i2 = numberOfLeadingZeros + (j > U6.a.f2737b[numberOfLeadingZeros] ? 1 : 0);
        if (z7) {
            i2++;
        }
        r E7 = E(i2);
        byte[] bArr2 = E7.f2643a;
        int i5 = E7.f2645c + i2;
        while (j != 0) {
            long j7 = 10;
            i5--;
            bArr2[i5] = U6.a.f2736a[(int) (j % j7)];
            j /= j7;
        }
        if (z7) {
            bArr2[i5 - 1] = 45;
        }
        E7.f2645c += i2;
        this.f2617e += i2;
    }

    public final void J(long j) {
        if (j == 0) {
            H(48);
            return;
        }
        long j7 = (j >>> 1) | j;
        long j8 = j7 | (j7 >>> 2);
        long j9 = j8 | (j8 >>> 4);
        long j10 = j9 | (j9 >>> 8);
        long j11 = j10 | (j10 >>> 16);
        long j12 = j11 | (j11 >>> 32);
        long j13 = j12 - ((j12 >>> 1) & 6148914691236517205L);
        long j14 = ((j13 >>> 2) & 3689348814741910323L) + (j13 & 3689348814741910323L);
        long j15 = ((j14 >>> 4) + j14) & 1085102592571150095L;
        long j16 = j15 + (j15 >>> 8);
        long j17 = j16 + (j16 >>> 16);
        int i2 = (int) ((((j17 & 63) + ((j17 >>> 32) & 63)) + 3) / 4);
        r E7 = E(i2);
        byte[] bArr = E7.f2643a;
        int i5 = E7.f2645c;
        for (int i7 = (i5 + i2) - 1; i7 >= i5; i7--) {
            bArr[i7] = U6.a.f2736a[(int) (15 & j)];
            j >>>= 4;
        }
        E7.f2645c += i2;
        this.f2617e += i2;
    }

    public final void K(int i2) {
        r E7 = E(4);
        byte[] bArr = E7.f2643a;
        int i5 = E7.f2645c;
        bArr[i5] = (byte) ((i2 >>> 24) & 255);
        bArr[i5 + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i5 + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i5 + 3] = (byte) (i2 & 255);
        E7.f2645c = i5 + 4;
        this.f2617e += 4;
    }

    public final void L(long j) {
        long j7 = ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
        r E7 = E(8);
        byte[] bArr = E7.f2643a;
        int i2 = E7.f2645c;
        bArr[i2] = (byte) ((j7 >>> 56) & 255);
        bArr[i2 + 1] = (byte) ((j7 >>> 48) & 255);
        bArr[i2 + 2] = (byte) ((j7 >>> 40) & 255);
        bArr[i2 + 3] = (byte) ((j7 >>> 32) & 255);
        bArr[i2 + 4] = (byte) ((j7 >>> 24) & 255);
        bArr[i2 + 5] = (byte) ((j7 >>> 16) & 255);
        bArr[i2 + 6] = (byte) ((j7 >>> 8) & 255);
        bArr[i2 + 7] = (byte) (j7 & 255);
        E7.f2645c = i2 + 8;
        this.f2617e += 8;
    }

    public final void M(int i2) {
        r E7 = E(2);
        byte[] bArr = E7.f2643a;
        int i5 = E7.f2645c;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i5 + 1] = (byte) (i2 & 255);
        E7.f2645c = i5 + 2;
        this.f2617e += 2;
    }

    public final void N(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        O(string, 0, string.length());
    }

    public final void O(String string, int i2, int i5) {
        char charAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i2 < 0) {
            throw new IllegalArgumentException(C4.p.g(i2, "beginIndex < 0: ").toString());
        }
        if (i5 < i2) {
            throw new IllegalArgumentException(C4.p.j("endIndex < beginIndex: ", " < ", i5, i2).toString());
        }
        if (i5 > string.length()) {
            StringBuilder k7 = C4.p.k(i5, "endIndex > string.length: ", " > ");
            k7.append(string.length());
            throw new IllegalArgumentException(k7.toString().toString());
        }
        while (i2 < i5) {
            char charAt2 = string.charAt(i2);
            if (charAt2 < 128) {
                r E7 = E(1);
                byte[] bArr = E7.f2643a;
                int i7 = E7.f2645c - i2;
                int min = Math.min(i5, 8192 - i7);
                int i8 = i2 + 1;
                bArr[i2 + i7] = (byte) charAt2;
                while (true) {
                    i2 = i8;
                    if (i2 >= min || (charAt = string.charAt(i2)) >= 128) {
                        break;
                    }
                    i8 = i2 + 1;
                    bArr[i2 + i7] = (byte) charAt;
                }
                int i9 = E7.f2645c;
                int i10 = (i7 + i2) - i9;
                E7.f2645c = i9 + i10;
                this.f2617e += i10;
            } else {
                if (charAt2 < 2048) {
                    r E8 = E(2);
                    byte[] bArr2 = E8.f2643a;
                    int i11 = E8.f2645c;
                    bArr2[i11] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i11 + 1] = (byte) ((charAt2 & '?') | 128);
                    E8.f2645c = i11 + 2;
                    this.f2617e += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    r E9 = E(3);
                    byte[] bArr3 = E9.f2643a;
                    int i12 = E9.f2645c;
                    bArr3[i12] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i12 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i12 + 2] = (byte) ((charAt2 & '?') | 128);
                    E9.f2645c = i12 + 3;
                    this.f2617e += 3;
                } else {
                    int i13 = i2 + 1;
                    char charAt3 = i13 < i5 ? string.charAt(i13) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        H(63);
                        i2 = i13;
                    } else {
                        int i14 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        r E10 = E(4);
                        byte[] bArr4 = E10.f2643a;
                        int i15 = E10.f2645c;
                        bArr4[i15] = (byte) ((i14 >> 18) | 240);
                        bArr4[i15 + 1] = (byte) (((i14 >> 12) & 63) | 128);
                        bArr4[i15 + 2] = (byte) (((i14 >> 6) & 63) | 128);
                        bArr4[i15 + 3] = (byte) ((i14 & 63) | 128);
                        E10.f2645c = i15 + 4;
                        this.f2617e += 4;
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public final void P(int i2) {
        if (i2 < 128) {
            H(i2);
            return;
        }
        if (i2 < 2048) {
            r E7 = E(2);
            byte[] bArr = E7.f2643a;
            int i5 = E7.f2645c;
            bArr[i5] = (byte) ((i2 >> 6) | 192);
            bArr[i5 + 1] = (byte) ((i2 & 63) | 128);
            E7.f2645c = i5 + 2;
            this.f2617e += 2;
            return;
        }
        if (55296 <= i2 && i2 < 57344) {
            H(63);
            return;
        }
        if (i2 < 65536) {
            r E8 = E(3);
            byte[] bArr2 = E8.f2643a;
            int i7 = E8.f2645c;
            bArr2[i7] = (byte) ((i2 >> 12) | 224);
            bArr2[i7 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i7 + 2] = (byte) ((i2 & 63) | 128);
            E8.f2645c = i7 + 3;
            this.f2617e += 3;
            return;
        }
        if (i2 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.g(i2)));
        }
        r E9 = E(4);
        byte[] bArr3 = E9.f2643a;
        int i8 = E9.f2645c;
        bArr3[i8] = (byte) ((i2 >> 18) | 240);
        bArr3[i8 + 1] = (byte) (((i2 >> 12) & 63) | 128);
        bArr3[i8 + 2] = (byte) (((i2 >> 6) & 63) | 128);
        bArr3[i8 + 3] = (byte) ((i2 & 63) | 128);
        E9.f2645c = i8 + 4;
        this.f2617e += 4;
    }

    public final void a(f out, long j, long j7) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j8 = j;
        b.d(this.f2617e, j8, j7);
        if (j7 == 0) {
            return;
        }
        out.f2617e += j7;
        r rVar = this.f2616d;
        while (true) {
            Intrinsics.b(rVar);
            long j9 = rVar.f2645c - rVar.f2644b;
            if (j8 < j9) {
                break;
            }
            j8 -= j9;
            rVar = rVar.f2648f;
        }
        r rVar2 = rVar;
        long j10 = j7;
        while (j10 > 0) {
            Intrinsics.b(rVar2);
            r c7 = rVar2.c();
            int i2 = c7.f2644b + ((int) j8);
            c7.f2644b = i2;
            c7.f2645c = Math.min(i2 + ((int) j10), c7.f2645c);
            r rVar3 = out.f2616d;
            if (rVar3 == null) {
                c7.f2649g = c7;
                c7.f2648f = c7;
                out.f2616d = c7;
            } else {
                r rVar4 = rVar3.f2649g;
                Intrinsics.b(rVar4);
                rVar4.b(c7);
            }
            j10 -= c7.f2645c - c7.f2644b;
            rVar2 = rVar2.f2648f;
            j8 = 0;
        }
    }

    @Override // T6.w
    public final y b() {
        return y.f2655d;
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f2617e == 0) {
            return fVar;
        }
        r rVar = this.f2616d;
        Intrinsics.b(rVar);
        r c7 = rVar.c();
        fVar.f2616d = c7;
        c7.f2649g = c7;
        c7.f2648f = c7;
        for (r rVar2 = rVar.f2648f; rVar2 != rVar; rVar2 = rVar2.f2648f) {
            r rVar3 = c7.f2649g;
            Intrinsics.b(rVar3);
            Intrinsics.b(rVar2);
            rVar3.b(rVar2.c());
        }
        fVar.f2617e = this.f2617e;
        return fVar;
    }

    public final boolean d() {
        return this.f2617e == 0;
    }

    @Override // T6.h
    public final i e(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f2617e < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new i(j(j));
        }
        i B7 = B((int) j);
        skip(j);
        return B7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        long j = this.f2617e;
        f fVar = (f) obj;
        if (j != fVar.f2617e) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        r rVar = this.f2616d;
        Intrinsics.b(rVar);
        r rVar2 = fVar.f2616d;
        Intrinsics.b(rVar2);
        int i2 = rVar.f2644b;
        int i5 = rVar2.f2644b;
        long j7 = 0;
        while (j7 < this.f2617e) {
            long min = Math.min(rVar.f2645c - i2, rVar2.f2645c - i5);
            long j8 = 0;
            while (j8 < min) {
                int i7 = i2 + 1;
                int i8 = i5 + 1;
                if (rVar.f2643a[i2] != rVar2.f2643a[i5]) {
                    return false;
                }
                j8++;
                i2 = i7;
                i5 = i8;
            }
            if (i2 == rVar.f2645c) {
                rVar = rVar.f2648f;
                Intrinsics.b(rVar);
                i2 = rVar.f2644b;
            }
            if (i5 == rVar2.f2645c) {
                rVar2 = rVar2.f2648f;
                Intrinsics.b(rVar2);
                i5 = rVar2.f2644b;
            }
            j7 += min;
        }
        return true;
    }

    public final byte g(long j) {
        b.d(this.f2617e, j, 1L);
        r rVar = this.f2616d;
        if (rVar == null) {
            Intrinsics.b(null);
            throw null;
        }
        long j7 = this.f2617e;
        if (j7 - j < j) {
            while (j7 > j) {
                rVar = rVar.f2649g;
                Intrinsics.b(rVar);
                j7 -= rVar.f2645c - rVar.f2644b;
            }
            return rVar.f2643a[(int) ((rVar.f2644b + j) - j7)];
        }
        long j8 = 0;
        while (true) {
            int i2 = rVar.f2645c;
            int i5 = rVar.f2644b;
            long j9 = (i2 - i5) + j8;
            if (j9 > j) {
                return rVar.f2643a[(int) ((i5 + j) - j8)];
            }
            rVar = rVar.f2648f;
            Intrinsics.b(rVar);
            j8 = j9;
        }
    }

    public final long h(byte b7, long j, long j7) {
        r rVar;
        long j8 = 0;
        if (0 > j || j > j7) {
            throw new IllegalArgumentException(("size=" + this.f2617e + " fromIndex=" + j + " toIndex=" + j7).toString());
        }
        long j9 = this.f2617e;
        if (j7 > j9) {
            j7 = j9;
        }
        if (j == j7 || (rVar = this.f2616d) == null) {
            return -1L;
        }
        if (j9 - j < j) {
            while (j9 > j) {
                rVar = rVar.f2649g;
                Intrinsics.b(rVar);
                j9 -= rVar.f2645c - rVar.f2644b;
            }
            while (j9 < j7) {
                byte[] bArr = rVar.f2643a;
                int min = (int) Math.min(rVar.f2645c, (rVar.f2644b + j7) - j9);
                for (int i2 = (int) ((rVar.f2644b + j) - j9); i2 < min; i2++) {
                    if (bArr[i2] == b7) {
                        return (i2 - rVar.f2644b) + j9;
                    }
                }
                j9 += rVar.f2645c - rVar.f2644b;
                rVar = rVar.f2648f;
                Intrinsics.b(rVar);
                j = j9;
            }
            return -1L;
        }
        while (true) {
            long j10 = (rVar.f2645c - rVar.f2644b) + j8;
            if (j10 > j) {
                break;
            }
            rVar = rVar.f2648f;
            Intrinsics.b(rVar);
            j8 = j10;
        }
        while (j8 < j7) {
            byte[] bArr2 = rVar.f2643a;
            int min2 = (int) Math.min(rVar.f2645c, (rVar.f2644b + j7) - j8);
            for (int i5 = (int) ((rVar.f2644b + j) - j8); i5 < min2; i5++) {
                if (bArr2[i5] == b7) {
                    return (i5 - rVar.f2644b) + j8;
                }
            }
            j8 += rVar.f2645c - rVar.f2644b;
            rVar = rVar.f2648f;
            Intrinsics.b(rVar);
            j = j8;
        }
        return -1L;
    }

    public final int hashCode() {
        r rVar = this.f2616d;
        if (rVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i5 = rVar.f2645c;
            for (int i7 = rVar.f2644b; i7 < i5; i7++) {
                i2 = (i2 * 31) + rVar.f2643a[i7];
            }
            rVar = rVar.f2648f;
            Intrinsics.b(rVar);
        } while (rVar != this.f2616d);
        return i2;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte[] j(long j) {
        int min;
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f2617e < j) {
            throw new EOFException();
        }
        int i2 = (int) j;
        byte[] sink = new byte[i2];
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i5 = 0;
        while (i5 < i2) {
            int i7 = i2 - i5;
            Intrinsics.checkNotNullParameter(sink, "sink");
            b.d(i2, i5, i7);
            r rVar = this.f2616d;
            if (rVar == null) {
                min = -1;
            } else {
                min = Math.min(i7, rVar.f2645c - rVar.f2644b);
                byte[] bArr = rVar.f2643a;
                int i8 = rVar.f2644b;
                kotlin.collections.o.c(i5, i8, i8 + min, bArr, sink);
                int i9 = rVar.f2644b + min;
                rVar.f2644b = i9;
                this.f2617e -= min;
                if (i9 == rVar.f2645c) {
                    this.f2616d = rVar.a();
                    s.a(rVar);
                }
            }
            if (min == -1) {
                throw new EOFException();
            }
            i5 += min;
        }
        return sink;
    }

    @Override // T6.g
    public final /* bridge */ /* synthetic */ g k(long j) {
        L(j);
        return this;
    }

    @Override // T6.h
    public final byte[] n() {
        return j(this.f2617e);
    }

    @Override // T6.w
    public final long o(long j, f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        long j7 = this.f2617e;
        if (j7 == 0) {
            return -1L;
        }
        if (j > j7) {
            j = j7;
        }
        sink.x(j, this);
        return j;
    }

    @Override // T6.g
    public final g q(int i2) {
        K(b.e(i2));
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        r rVar = this.f2616d;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), rVar.f2645c - rVar.f2644b);
        sink.put(rVar.f2643a, rVar.f2644b, min);
        int i2 = rVar.f2644b + min;
        rVar.f2644b = i2;
        this.f2617e -= min;
        if (i2 == rVar.f2645c) {
            this.f2616d = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    @Override // T6.h
    public final byte readByte() {
        if (this.f2617e == 0) {
            throw new EOFException();
        }
        r rVar = this.f2616d;
        Intrinsics.b(rVar);
        int i2 = rVar.f2644b;
        int i5 = rVar.f2645c;
        int i7 = i2 + 1;
        byte b7 = rVar.f2643a[i2];
        this.f2617e--;
        if (i7 != i5) {
            rVar.f2644b = i7;
            return b7;
        }
        this.f2616d = rVar.a();
        s.a(rVar);
        return b7;
    }

    @Override // T6.h
    public final int readInt() {
        if (this.f2617e < 4) {
            throw new EOFException();
        }
        r rVar = this.f2616d;
        Intrinsics.b(rVar);
        int i2 = rVar.f2644b;
        int i5 = rVar.f2645c;
        if (i5 - i2 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = rVar.f2643a;
        int i7 = i2 + 3;
        int i8 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 2] & 255) << 8);
        int i9 = i2 + 4;
        int i10 = (bArr[i7] & 255) | i8;
        this.f2617e -= 4;
        if (i9 != i5) {
            rVar.f2644b = i9;
            return i10;
        }
        this.f2616d = rVar.a();
        s.a(rVar);
        return i10;
    }

    @Override // T6.h
    public final short readShort() {
        if (this.f2617e < 2) {
            throw new EOFException();
        }
        r rVar = this.f2616d;
        Intrinsics.b(rVar);
        int i2 = rVar.f2644b;
        int i5 = rVar.f2645c;
        if (i5 - i2 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = rVar.f2643a;
        int i7 = i2 + 1;
        int i8 = (bArr[i2] & 255) << 8;
        int i9 = i2 + 2;
        int i10 = (bArr[i7] & 255) | i8;
        this.f2617e -= 2;
        if (i9 == i5) {
            this.f2616d = rVar.a();
            s.a(rVar);
        } else {
            rVar.f2644b = i9;
        }
        return (short) i10;
    }

    public final String s(long j, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f2617e < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        r rVar = this.f2616d;
        Intrinsics.b(rVar);
        int i2 = rVar.f2644b;
        if (i2 + j > rVar.f2645c) {
            return new String(j(j), charset);
        }
        int i5 = (int) j;
        String str = new String(rVar.f2643a, i2, i5, charset);
        int i7 = rVar.f2644b + i5;
        rVar.f2644b = i7;
        this.f2617e -= j;
        if (i7 == rVar.f2645c) {
            this.f2616d = rVar.a();
            s.a(rVar);
        }
        return str;
    }

    @Override // T6.h
    public final void skip(long j) {
        while (j > 0) {
            r rVar = this.f2616d;
            if (rVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, rVar.f2645c - rVar.f2644b);
            long j7 = min;
            this.f2617e -= j7;
            j -= j7;
            int i2 = rVar.f2644b + min;
            rVar.f2644b = i2;
            if (i2 == rVar.f2645c) {
                this.f2616d = rVar.a();
                s.a(rVar);
            }
        }
    }

    public final String t() {
        return s(this.f2617e, Charsets.UTF_8);
    }

    public final String toString() {
        long j = this.f2617e;
        if (j <= 2147483647L) {
            return B((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f2617e).toString());
    }

    @Override // T6.h
    public final String u(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j7 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long h7 = h((byte) 10, 0L, j7);
        if (h7 != -1) {
            return U6.a.a(h7, this);
        }
        if (j7 < this.f2617e && g(j7 - 1) == 13 && g(j7) == 10) {
            return U6.a.a(j7, this);
        }
        f fVar = new f();
        a(fVar, 0L, Math.min(32, this.f2617e));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f2617e, j) + " content=" + fVar.e(fVar.f2617e).b() + (char) 8230);
    }

    @Override // T6.g
    public final g write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        write(source, 0, source.length);
        return this;
    }

    @Override // T6.g
    public final /* bridge */ /* synthetic */ g writeByte(int i2) {
        H(i2);
        return this;
    }

    @Override // T6.g
    public final /* bridge */ /* synthetic */ g writeInt(int i2) {
        K(i2);
        return this;
    }

    @Override // T6.g
    public final /* bridge */ /* synthetic */ g writeShort(int i2) {
        M(i2);
        return this;
    }

    @Override // T6.u
    public final void x(long j, f source) {
        r b7;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        b.d(source.f2617e, 0L, j);
        while (j > 0) {
            r rVar = source.f2616d;
            Intrinsics.b(rVar);
            int i2 = rVar.f2645c;
            r rVar2 = source.f2616d;
            Intrinsics.b(rVar2);
            long j7 = i2 - rVar2.f2644b;
            int i5 = 0;
            if (j < j7) {
                r rVar3 = this.f2616d;
                r rVar4 = rVar3 != null ? rVar3.f2649g : null;
                if (rVar4 != null && rVar4.f2647e) {
                    if ((rVar4.f2645c + j) - (rVar4.f2646d ? 0 : rVar4.f2644b) <= 8192) {
                        r rVar5 = source.f2616d;
                        Intrinsics.b(rVar5);
                        rVar5.d(rVar4, (int) j);
                        source.f2617e -= j;
                        this.f2617e += j;
                        return;
                    }
                }
                r rVar6 = source.f2616d;
                Intrinsics.b(rVar6);
                int i7 = (int) j;
                if (i7 <= 0 || i7 > rVar6.f2645c - rVar6.f2644b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i7 >= 1024) {
                    b7 = rVar6.c();
                } else {
                    b7 = s.b();
                    byte[] bArr = rVar6.f2643a;
                    byte[] bArr2 = b7.f2643a;
                    int i8 = rVar6.f2644b;
                    kotlin.collections.o.c(0, i8, i8 + i7, bArr, bArr2);
                }
                b7.f2645c = b7.f2644b + i7;
                rVar6.f2644b += i7;
                r rVar7 = rVar6.f2649g;
                Intrinsics.b(rVar7);
                rVar7.b(b7);
                source.f2616d = b7;
            }
            r rVar8 = source.f2616d;
            Intrinsics.b(rVar8);
            long j8 = rVar8.f2645c - rVar8.f2644b;
            source.f2616d = rVar8.a();
            r rVar9 = this.f2616d;
            if (rVar9 == null) {
                this.f2616d = rVar8;
                rVar8.f2649g = rVar8;
                rVar8.f2648f = rVar8;
            } else {
                r rVar10 = rVar9.f2649g;
                Intrinsics.b(rVar10);
                rVar10.b(rVar8);
                r rVar11 = rVar8.f2649g;
                if (rVar11 == rVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                Intrinsics.b(rVar11);
                if (rVar11.f2647e) {
                    int i9 = rVar8.f2645c - rVar8.f2644b;
                    r rVar12 = rVar8.f2649g;
                    Intrinsics.b(rVar12);
                    int i10 = 8192 - rVar12.f2645c;
                    r rVar13 = rVar8.f2649g;
                    Intrinsics.b(rVar13);
                    if (!rVar13.f2646d) {
                        r rVar14 = rVar8.f2649g;
                        Intrinsics.b(rVar14);
                        i5 = rVar14.f2644b;
                    }
                    if (i9 <= i10 + i5) {
                        r rVar15 = rVar8.f2649g;
                        Intrinsics.b(rVar15);
                        rVar8.d(rVar15, i9);
                        rVar8.a();
                        s.a(rVar8);
                    }
                }
            }
            source.f2617e -= j8;
            this.f2617e += j8;
            j -= j8;
        }
    }

    @Override // T6.h
    public final void y(long j) {
        if (this.f2617e < j) {
            throw new EOFException();
        }
    }

    @Override // T6.g
    public final /* bridge */ /* synthetic */ g z(i iVar) {
        F(iVar);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            r E7 = E(1);
            int min = Math.min(i2, 8192 - E7.f2645c);
            source.get(E7.f2643a, E7.f2645c, min);
            i2 -= min;
            E7.f2645c += min;
        }
        this.f2617e += remaining;
        return remaining;
    }

    public final void write(byte[] source, int i2, int i5) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i5;
        b.d(source.length, i2, j);
        int i7 = i5 + i2;
        while (i2 < i7) {
            r E7 = E(1);
            int min = Math.min(i7 - i2, 8192 - E7.f2645c);
            int i8 = i2 + min;
            kotlin.collections.o.c(E7.f2645c, i2, i8, source, E7.f2643a);
            E7.f2645c += min;
            i2 = i8;
        }
        this.f2617e += j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, T6.u
    public final void close() {
    }

    @Override // T6.g, T6.u, java.io.Flushable
    public final void flush() {
    }
}
