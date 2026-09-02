package n6;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import l5.AbstractC0505i;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: f, reason: collision with root package name */
    public r f5523f;

    /* renamed from: g, reason: collision with root package name */
    public long f5524g;

    @Override // n6.h
    public final void C(long j4) {
        if (this.f5524g < j4) {
            throw new EOFException();
        }
    }

    @Override // n6.g
    public final /* bridge */ /* synthetic */ g D(String str) {
        O(str);
        return this;
    }

    public final r F(int i7) {
        if (i7 < 1 || i7 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        r rVar = this.f5523f;
        if (rVar == null) {
            r b7 = s.b();
            this.f5523f = b7;
            b7.f5556g = b7;
            b7.f5555f = b7;
            return b7;
        }
        r rVar2 = rVar.f5556g;
        kotlin.jvm.internal.i.b(rVar2);
        if (rVar2.f5552c + i7 <= 8192 && rVar2.f5554e) {
            return rVar2;
        }
        r b8 = s.b();
        rVar2.b(b8);
        return b8;
    }

    public final void G(i byteString) {
        kotlin.jvm.internal.i.e(byteString, "byteString");
        byteString.l(this, byteString.a());
    }

    public final long H(w source) {
        kotlin.jvm.internal.i.e(source, "source");
        long j4 = 0;
        while (true) {
            long i7 = source.i(8192L, this);
            if (i7 == -1) {
                return j4;
            }
            j4 += i7;
        }
    }

    public final void I(int i7) {
        r F6 = F(1);
        byte[] bArr = F6.f5550a;
        int i8 = F6.f5552c;
        F6.f5552c = i8 + 1;
        bArr[i8] = (byte) i7;
        this.f5524g++;
    }

    public final void J(long j4) {
        boolean z5;
        if (j4 == 0) {
            I(48);
            return;
        }
        if (j4 < 0) {
            j4 = -j4;
            if (j4 < 0) {
                O("-9223372036854775808");
                return;
            }
            z5 = true;
        } else {
            z5 = false;
        }
        byte[] bArr = o6.a.f5623a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j4)) * 10) >>> 5;
        int i7 = numberOfLeadingZeros + (j4 > o6.a.f5624b[numberOfLeadingZeros] ? 1 : 0);
        if (z5) {
            i7++;
        }
        r F6 = F(i7);
        byte[] bArr2 = F6.f5550a;
        int i8 = F6.f5552c + i7;
        while (j4 != 0) {
            long j7 = 10;
            i8--;
            bArr2[i8] = o6.a.f5623a[(int) (j4 % j7)];
            j4 /= j7;
        }
        if (z5) {
            bArr2[i8 - 1] = 45;
        }
        F6.f5552c += i7;
        this.f5524g += i7;
    }

    public final void K(long j4) {
        if (j4 == 0) {
            I(48);
            return;
        }
        long j7 = (j4 >>> 1) | j4;
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
        int i7 = (int) ((((j17 & 63) + ((j17 >>> 32) & 63)) + 3) / 4);
        r F6 = F(i7);
        byte[] bArr = F6.f5550a;
        int i8 = F6.f5552c;
        for (int i9 = (i8 + i7) - 1; i9 >= i8; i9--) {
            bArr[i9] = o6.a.f5623a[(int) (15 & j4)];
            j4 >>>= 4;
        }
        F6.f5552c += i7;
        this.f5524g += i7;
    }

    public final void L(int i7) {
        r F6 = F(4);
        byte[] bArr = F6.f5550a;
        int i8 = F6.f5552c;
        bArr[i8] = (byte) ((i7 >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i7 & 255);
        F6.f5552c = i8 + 4;
        this.f5524g += 4;
    }

    public final void M(long j4) {
        long j7 = ((j4 & 255) << 56) | (((-72057594037927936L) & j4) >>> 56) | ((71776119061217280L & j4) >>> 40) | ((280375465082880L & j4) >>> 24) | ((1095216660480L & j4) >>> 8) | ((4278190080L & j4) << 8) | ((16711680 & j4) << 24) | ((65280 & j4) << 40);
        r F6 = F(8);
        byte[] bArr = F6.f5550a;
        int i7 = F6.f5552c;
        bArr[i7] = (byte) ((j7 >>> 56) & 255);
        bArr[i7 + 1] = (byte) ((j7 >>> 48) & 255);
        bArr[i7 + 2] = (byte) ((j7 >>> 40) & 255);
        bArr[i7 + 3] = (byte) ((j7 >>> 32) & 255);
        bArr[i7 + 4] = (byte) ((j7 >>> 24) & 255);
        bArr[i7 + 5] = (byte) ((j7 >>> 16) & 255);
        bArr[i7 + 6] = (byte) ((j7 >>> 8) & 255);
        bArr[i7 + 7] = (byte) (j7 & 255);
        F6.f5552c = i7 + 8;
        this.f5524g += 8;
    }

    public final void N(int i7) {
        r F6 = F(2);
        byte[] bArr = F6.f5550a;
        int i8 = F6.f5552c;
        bArr[i8] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 1] = (byte) (i7 & 255);
        F6.f5552c = i8 + 2;
        this.f5524g += 2;
    }

    public final void O(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        P(string, 0, string.length());
    }

    public final void P(String string, int i7, int i8) {
        char charAt;
        kotlin.jvm.internal.i.e(string, "string");
        if (i7 < 0) {
            throw new IllegalArgumentException(W4.o.c("beginIndex < 0: ", i7).toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(C1.c.f(i8, i7, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i8 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i8 + " > " + string.length()).toString());
        }
        while (i7 < i8) {
            char charAt2 = string.charAt(i7);
            if (charAt2 < 128) {
                r F6 = F(1);
                byte[] bArr = F6.f5550a;
                int i9 = F6.f5552c - i7;
                int min = Math.min(i8, 8192 - i9);
                int i10 = i7 + 1;
                bArr[i7 + i9] = (byte) charAt2;
                while (true) {
                    i7 = i10;
                    if (i7 >= min || (charAt = string.charAt(i7)) >= 128) {
                        break;
                    }
                    i10 = i7 + 1;
                    bArr[i7 + i9] = (byte) charAt;
                }
                int i11 = F6.f5552c;
                int i12 = (i9 + i7) - i11;
                F6.f5552c = i11 + i12;
                this.f5524g += i12;
            } else {
                if (charAt2 < 2048) {
                    r F7 = F(2);
                    byte[] bArr2 = F7.f5550a;
                    int i13 = F7.f5552c;
                    bArr2[i13] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i13 + 1] = (byte) ((charAt2 & '?') | 128);
                    F7.f5552c = i13 + 2;
                    this.f5524g += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    r F8 = F(3);
                    byte[] bArr3 = F8.f5550a;
                    int i14 = F8.f5552c;
                    bArr3[i14] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i14 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i14 + 2] = (byte) ((charAt2 & '?') | 128);
                    F8.f5552c = i14 + 3;
                    this.f5524g += 3;
                } else {
                    int i15 = i7 + 1;
                    char charAt3 = i15 < i8 ? string.charAt(i15) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        I(63);
                        i7 = i15;
                    } else {
                        int i16 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        r F9 = F(4);
                        byte[] bArr4 = F9.f5550a;
                        int i17 = F9.f5552c;
                        bArr4[i17] = (byte) ((i16 >> 18) | 240);
                        bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                        F9.f5552c = i17 + 4;
                        this.f5524g += 4;
                        i7 += 2;
                    }
                }
                i7++;
            }
        }
    }

    public final void Q(int i7) {
        if (i7 < 128) {
            I(i7);
            return;
        }
        if (i7 < 2048) {
            r F6 = F(2);
            byte[] bArr = F6.f5550a;
            int i8 = F6.f5552c;
            bArr[i8] = (byte) ((i7 >> 6) | 192);
            bArr[i8 + 1] = (byte) ((i7 & 63) | 128);
            F6.f5552c = i8 + 2;
            this.f5524g += 2;
            return;
        }
        if (55296 <= i7 && i7 < 57344) {
            I(63);
            return;
        }
        if (i7 < 65536) {
            r F7 = F(3);
            byte[] bArr2 = F7.f5550a;
            int i9 = F7.f5552c;
            bArr2[i9] = (byte) ((i7 >> 12) | 224);
            bArr2[i9 + 1] = (byte) (((i7 >> 6) & 63) | 128);
            bArr2[i9 + 2] = (byte) ((i7 & 63) | 128);
            F7.f5552c = i9 + 3;
            this.f5524g += 3;
            return;
        }
        if (i7 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.g(i7)));
        }
        r F8 = F(4);
        byte[] bArr3 = F8.f5550a;
        int i10 = F8.f5552c;
        bArr3[i10] = (byte) ((i7 >> 18) | 240);
        bArr3[i10 + 1] = (byte) (((i7 >> 12) & 63) | 128);
        bArr3[i10 + 2] = (byte) (((i7 >> 6) & 63) | 128);
        bArr3[i10 + 3] = (byte) ((i7 & 63) | 128);
        F8.f5552c = i10 + 4;
        this.f5524g += 4;
    }

    public final void a(f out, long j4, long j7) {
        kotlin.jvm.internal.i.e(out, "out");
        long j8 = j4;
        b.d(this.f5524g, j8, j7);
        if (j7 == 0) {
            return;
        }
        out.f5524g += j7;
        r rVar = this.f5523f;
        while (true) {
            kotlin.jvm.internal.i.b(rVar);
            long j9 = rVar.f5552c - rVar.f5551b;
            if (j8 < j9) {
                break;
            }
            j8 -= j9;
            rVar = rVar.f5555f;
        }
        r rVar2 = rVar;
        long j10 = j7;
        while (j10 > 0) {
            kotlin.jvm.internal.i.b(rVar2);
            r c7 = rVar2.c();
            int i7 = c7.f5551b + ((int) j8);
            c7.f5551b = i7;
            c7.f5552c = Math.min(i7 + ((int) j10), c7.f5552c);
            r rVar3 = out.f5523f;
            if (rVar3 == null) {
                c7.f5556g = c7;
                c7.f5555f = c7;
                out.f5523f = c7;
            } else {
                r rVar4 = rVar3.f5556g;
                kotlin.jvm.internal.i.b(rVar4);
                rVar4.b(c7);
            }
            j10 -= c7.f5552c - c7.f5551b;
            rVar2 = rVar2.f5555f;
            j8 = 0;
        }
    }

    @Override // n6.w
    public final y b() {
        return y.f5562d;
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f5524g == 0) {
            return fVar;
        }
        r rVar = this.f5523f;
        kotlin.jvm.internal.i.b(rVar);
        r c7 = rVar.c();
        fVar.f5523f = c7;
        c7.f5556g = c7;
        c7.f5555f = c7;
        for (r rVar2 = rVar.f5555f; rVar2 != rVar; rVar2 = rVar2.f5555f) {
            r rVar3 = c7.f5556g;
            kotlin.jvm.internal.i.b(rVar3);
            kotlin.jvm.internal.i.b(rVar2);
            rVar3.b(rVar2.c());
        }
        fVar.f5524g = this.f5524g;
        return fVar;
    }

    public final boolean d() {
        return this.f5524g == 0;
    }

    public final byte e(long j4) {
        b.d(this.f5524g, j4, 1L);
        r rVar = this.f5523f;
        if (rVar == null) {
            kotlin.jvm.internal.i.b(null);
            throw null;
        }
        long j7 = this.f5524g;
        if (j7 - j4 < j4) {
            while (j7 > j4) {
                rVar = rVar.f5556g;
                kotlin.jvm.internal.i.b(rVar);
                j7 -= rVar.f5552c - rVar.f5551b;
            }
            return rVar.f5550a[(int) ((rVar.f5551b + j4) - j7)];
        }
        long j8 = 0;
        while (true) {
            int i7 = rVar.f5552c;
            int i8 = rVar.f5551b;
            long j9 = (i7 - i8) + j8;
            if (j9 > j4) {
                return rVar.f5550a[(int) ((i8 + j4) - j8)];
            }
            rVar = rVar.f5555f;
            kotlin.jvm.internal.i.b(rVar);
            j8 = j9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        long j4 = this.f5524g;
        f fVar = (f) obj;
        if (j4 != fVar.f5524g) {
            return false;
        }
        if (j4 == 0) {
            return true;
        }
        r rVar = this.f5523f;
        kotlin.jvm.internal.i.b(rVar);
        r rVar2 = fVar.f5523f;
        kotlin.jvm.internal.i.b(rVar2);
        int i7 = rVar.f5551b;
        int i8 = rVar2.f5551b;
        long j7 = 0;
        while (j7 < this.f5524g) {
            long min = Math.min(rVar.f5552c - i7, rVar2.f5552c - i8);
            long j8 = 0;
            while (j8 < min) {
                int i9 = i7 + 1;
                int i10 = i8 + 1;
                if (rVar.f5550a[i7] != rVar2.f5550a[i8]) {
                    return false;
                }
                j8++;
                i7 = i9;
                i8 = i10;
            }
            if (i7 == rVar.f5552c) {
                rVar = rVar.f5555f;
                kotlin.jvm.internal.i.b(rVar);
                i7 = rVar.f5551b;
            }
            if (i8 == rVar2.f5552c) {
                rVar2 = rVar2.f5555f;
                kotlin.jvm.internal.i.b(rVar2);
                i8 = rVar2.f5551b;
            }
            j7 += min;
        }
        return true;
    }

    @Override // n6.h
    public final i f(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f5524g < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new i(h(j4));
        }
        i y = y((int) j4);
        skip(j4);
        return y;
    }

    public final long g(byte b7, long j4, long j7) {
        r rVar;
        long j8 = 0;
        if (0 > j4 || j4 > j7) {
            throw new IllegalArgumentException(("size=" + this.f5524g + " fromIndex=" + j4 + " toIndex=" + j7).toString());
        }
        long j9 = this.f5524g;
        if (j7 > j9) {
            j7 = j9;
        }
        if (j4 == j7 || (rVar = this.f5523f) == null) {
            return -1L;
        }
        if (j9 - j4 < j4) {
            while (j9 > j4) {
                rVar = rVar.f5556g;
                kotlin.jvm.internal.i.b(rVar);
                j9 -= rVar.f5552c - rVar.f5551b;
            }
            while (j9 < j7) {
                byte[] bArr = rVar.f5550a;
                int min = (int) Math.min(rVar.f5552c, (rVar.f5551b + j7) - j9);
                for (int i7 = (int) ((rVar.f5551b + j4) - j9); i7 < min; i7++) {
                    if (bArr[i7] == b7) {
                        return (i7 - rVar.f5551b) + j9;
                    }
                }
                j9 += rVar.f5552c - rVar.f5551b;
                rVar = rVar.f5555f;
                kotlin.jvm.internal.i.b(rVar);
                j4 = j9;
            }
            return -1L;
        }
        while (true) {
            long j10 = (rVar.f5552c - rVar.f5551b) + j8;
            if (j10 > j4) {
                break;
            }
            rVar = rVar.f5555f;
            kotlin.jvm.internal.i.b(rVar);
            j8 = j10;
        }
        while (j8 < j7) {
            byte[] bArr2 = rVar.f5550a;
            int min2 = (int) Math.min(rVar.f5552c, (rVar.f5551b + j7) - j8);
            for (int i8 = (int) ((rVar.f5551b + j4) - j8); i8 < min2; i8++) {
                if (bArr2[i8] == b7) {
                    return (i8 - rVar.f5551b) + j8;
                }
            }
            j8 += rVar.f5552c - rVar.f5551b;
            rVar = rVar.f5555f;
            kotlin.jvm.internal.i.b(rVar);
            j4 = j8;
        }
        return -1L;
    }

    public final byte[] h(long j4) {
        int min;
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f5524g < j4) {
            throw new EOFException();
        }
        int i7 = (int) j4;
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int i9 = i7 - i8;
            b.d(i7, i8, i9);
            r rVar = this.f5523f;
            if (rVar == null) {
                min = -1;
            } else {
                min = Math.min(i9, rVar.f5552c - rVar.f5551b);
                byte[] bArr2 = rVar.f5550a;
                int i10 = rVar.f5551b;
                AbstractC0505i.F(i8, i10, i10 + min, bArr2, bArr);
                int i11 = rVar.f5551b + min;
                rVar.f5551b = i11;
                this.f5524g -= min;
                if (i11 == rVar.f5552c) {
                    this.f5523f = rVar.a();
                    s.a(rVar);
                }
            }
            if (min == -1) {
                throw new EOFException();
            }
            i8 += min;
        }
        return bArr;
    }

    public final int hashCode() {
        r rVar = this.f5523f;
        if (rVar == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i8 = rVar.f5552c;
            for (int i9 = rVar.f5551b; i9 < i8; i9++) {
                i7 = (i7 * 31) + rVar.f5550a[i9];
            }
            rVar = rVar.f5555f;
            kotlin.jvm.internal.i.b(rVar);
        } while (rVar != this.f5523f);
        return i7;
    }

    @Override // n6.w
    public final long i(long j4, f sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        long j7 = this.f5524g;
        if (j7 == 0) {
            return -1L;
        }
        if (j4 > j7) {
            j4 = j7;
        }
        sink.l(j4, this);
        return j4;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // n6.g
    public final /* bridge */ /* synthetic */ g k(long j4) {
        M(j4);
        return this;
    }

    @Override // n6.u
    public final void l(long j4, f source) {
        r b7;
        kotlin.jvm.internal.i.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        b.d(source.f5524g, 0L, j4);
        while (j4 > 0) {
            r rVar = source.f5523f;
            kotlin.jvm.internal.i.b(rVar);
            int i7 = rVar.f5552c;
            r rVar2 = source.f5523f;
            kotlin.jvm.internal.i.b(rVar2);
            long j7 = i7 - rVar2.f5551b;
            int i8 = 0;
            if (j4 < j7) {
                r rVar3 = this.f5523f;
                r rVar4 = rVar3 != null ? rVar3.f5556g : null;
                if (rVar4 != null && rVar4.f5554e) {
                    if ((rVar4.f5552c + j4) - (rVar4.f5553d ? 0 : rVar4.f5551b) <= 8192) {
                        r rVar5 = source.f5523f;
                        kotlin.jvm.internal.i.b(rVar5);
                        rVar5.d(rVar4, (int) j4);
                        source.f5524g -= j4;
                        this.f5524g += j4;
                        return;
                    }
                }
                r rVar6 = source.f5523f;
                kotlin.jvm.internal.i.b(rVar6);
                int i9 = (int) j4;
                if (i9 <= 0 || i9 > rVar6.f5552c - rVar6.f5551b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i9 >= 1024) {
                    b7 = rVar6.c();
                } else {
                    b7 = s.b();
                    byte[] bArr = rVar6.f5550a;
                    byte[] bArr2 = b7.f5550a;
                    int i10 = rVar6.f5551b;
                    AbstractC0505i.F(0, i10, i10 + i9, bArr, bArr2);
                }
                b7.f5552c = b7.f5551b + i9;
                rVar6.f5551b += i9;
                r rVar7 = rVar6.f5556g;
                kotlin.jvm.internal.i.b(rVar7);
                rVar7.b(b7);
                source.f5523f = b7;
            }
            r rVar8 = source.f5523f;
            kotlin.jvm.internal.i.b(rVar8);
            long j8 = rVar8.f5552c - rVar8.f5551b;
            source.f5523f = rVar8.a();
            r rVar9 = this.f5523f;
            if (rVar9 == null) {
                this.f5523f = rVar8;
                rVar8.f5556g = rVar8;
                rVar8.f5555f = rVar8;
            } else {
                r rVar10 = rVar9.f5556g;
                kotlin.jvm.internal.i.b(rVar10);
                rVar10.b(rVar8);
                r rVar11 = rVar8.f5556g;
                if (rVar11 == rVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.i.b(rVar11);
                if (rVar11.f5554e) {
                    int i11 = rVar8.f5552c - rVar8.f5551b;
                    r rVar12 = rVar8.f5556g;
                    kotlin.jvm.internal.i.b(rVar12);
                    int i12 = 8192 - rVar12.f5552c;
                    r rVar13 = rVar8.f5556g;
                    kotlin.jvm.internal.i.b(rVar13);
                    if (!rVar13.f5553d) {
                        r rVar14 = rVar8.f5556g;
                        kotlin.jvm.internal.i.b(rVar14);
                        i8 = rVar14.f5551b;
                    }
                    if (i11 <= i12 + i8) {
                        r rVar15 = rVar8.f5556g;
                        kotlin.jvm.internal.i.b(rVar15);
                        rVar8.d(rVar15, i11);
                        rVar8.a();
                        s.a(rVar8);
                    }
                }
            }
            source.f5524g -= j8;
            this.f5524g += j8;
            j4 -= j8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[EDGE_INSN: B:40:0x00a2->B:37:0x00a2 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m() {
        int i7;
        if (this.f5524g == 0) {
            throw new EOFException();
        }
        int i8 = 0;
        boolean z5 = false;
        long j4 = 0;
        do {
            r rVar = this.f5523f;
            kotlin.jvm.internal.i.b(rVar);
            byte[] bArr = rVar.f5550a;
            int i9 = rVar.f5551b;
            int i10 = rVar.f5552c;
            while (i9 < i10) {
                byte b7 = bArr[i9];
                if (b7 >= 48 && b7 <= 57) {
                    i7 = b7 - 48;
                } else if (b7 >= 97 && b7 <= 102) {
                    i7 = b7 - 87;
                } else if (b7 < 65 || b7 > 70) {
                    z5 = true;
                    if (i8 == 0) {
                        char[] cArr = o6.b.f5625a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b7 >> 4) & 15], cArr[b7 & 15]})));
                    }
                    if (i9 != i10) {
                        this.f5523f = rVar.a();
                        s.a(rVar);
                    } else {
                        rVar.f5551b = i9;
                    }
                    if (!z5) {
                        break;
                    }
                } else {
                    i7 = b7 - 55;
                }
                if (((-1152921504606846976L) & j4) != 0) {
                    f fVar = new f();
                    fVar.K(j4);
                    fVar.I(b7);
                    throw new NumberFormatException("Number too large: ".concat(fVar.v()));
                }
                j4 = (j4 << 4) | i7;
                i9++;
                i8++;
            }
            if (i9 != i10) {
            }
            if (!z5) {
            }
        } while (this.f5523f != null);
        this.f5524g -= i8;
        return j4;
    }

    public final String n(long j4, Charset charset) {
        kotlin.jvm.internal.i.e(charset, "charset");
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f5524g < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        r rVar = this.f5523f;
        kotlin.jvm.internal.i.b(rVar);
        int i7 = rVar.f5551b;
        if (i7 + j4 > rVar.f5552c) {
            return new String(h(j4), charset);
        }
        int i8 = (int) j4;
        String str = new String(rVar.f5550a, i7, i8, charset);
        int i9 = rVar.f5551b + i8;
        rVar.f5551b = i9;
        this.f5524g -= j4;
        if (i9 == rVar.f5552c) {
            this.f5523f = rVar.a();
            s.a(rVar);
        }
        return str;
    }

    @Override // n6.h
    public final byte[] q() {
        return h(this.f5524g);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        r rVar = this.f5523f;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), rVar.f5552c - rVar.f5551b);
        sink.put(rVar.f5550a, rVar.f5551b, min);
        int i7 = rVar.f5551b + min;
        rVar.f5551b = i7;
        this.f5524g -= min;
        if (i7 == rVar.f5552c) {
            this.f5523f = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    @Override // n6.h
    public final byte readByte() {
        if (this.f5524g == 0) {
            throw new EOFException();
        }
        r rVar = this.f5523f;
        kotlin.jvm.internal.i.b(rVar);
        int i7 = rVar.f5551b;
        int i8 = rVar.f5552c;
        int i9 = i7 + 1;
        byte b7 = rVar.f5550a[i7];
        this.f5524g--;
        if (i9 != i8) {
            rVar.f5551b = i9;
            return b7;
        }
        this.f5523f = rVar.a();
        s.a(rVar);
        return b7;
    }

    @Override // n6.h
    public final int readInt() {
        if (this.f5524g < 4) {
            throw new EOFException();
        }
        r rVar = this.f5523f;
        kotlin.jvm.internal.i.b(rVar);
        int i7 = rVar.f5551b;
        int i8 = rVar.f5552c;
        if (i8 - i7 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = rVar.f5550a;
        int i9 = i7 + 3;
        int i10 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 2] & 255) << 8);
        int i11 = i7 + 4;
        int i12 = (bArr[i9] & 255) | i10;
        this.f5524g -= 4;
        if (i11 != i8) {
            rVar.f5551b = i11;
            return i12;
        }
        this.f5523f = rVar.a();
        s.a(rVar);
        return i12;
    }

    @Override // n6.h
    public final short readShort() {
        if (this.f5524g < 2) {
            throw new EOFException();
        }
        r rVar = this.f5523f;
        kotlin.jvm.internal.i.b(rVar);
        int i7 = rVar.f5551b;
        int i8 = rVar.f5552c;
        if (i8 - i7 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = rVar.f5550a;
        int i9 = i7 + 1;
        int i10 = (bArr[i7] & 255) << 8;
        int i11 = i7 + 2;
        int i12 = (bArr[i9] & 255) | i10;
        this.f5524g -= 2;
        if (i11 == i8) {
            this.f5523f = rVar.a();
            s.a(rVar);
        } else {
            rVar.f5551b = i11;
        }
        return (short) i12;
    }

    @Override // n6.g
    public final g s(int i7) {
        L(b.e(i7));
        return this;
    }

    @Override // n6.h
    public final void skip(long j4) {
        while (j4 > 0) {
            r rVar = this.f5523f;
            if (rVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j4, rVar.f5552c - rVar.f5551b);
            long j7 = min;
            this.f5524g -= j7;
            j4 -= j7;
            int i7 = rVar.f5551b + min;
            rVar.f5551b = i7;
            if (i7 == rVar.f5552c) {
                this.f5523f = rVar.a();
                s.a(rVar);
            }
        }
    }

    public final String toString() {
        long j4 = this.f5524g;
        if (j4 <= 2147483647L) {
            return y((int) j4).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f5524g).toString());
    }

    @Override // n6.g
    public final /* bridge */ /* synthetic */ g u(i iVar) {
        G(iVar);
        return this;
    }

    public final String v() {
        return n(this.f5524g, F5.a.f785a);
    }

    @Override // n6.h
    public final String w(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j4).toString());
        }
        long j7 = j4 != Long.MAX_VALUE ? j4 + 1 : Long.MAX_VALUE;
        long g7 = g((byte) 10, 0L, j7);
        if (g7 != -1) {
            return o6.a.a(g7, this);
        }
        if (j7 < this.f5524g && e(j7 - 1) == 13 && e(j7) == 10) {
            return o6.a.a(j7, this);
        }
        f fVar = new f();
        a(fVar, 0L, Math.min(32, this.f5524g));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f5524g, j4) + " content=" + fVar.f(fVar.f5524g).b() + (char) 8230);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.i.e(source, "source");
        int remaining = source.remaining();
        int i7 = remaining;
        while (i7 > 0) {
            r F6 = F(1);
            int min = Math.min(i7, 8192 - F6.f5552c);
            source.get(F6.f5550a, F6.f5552c, min);
            i7 -= min;
            F6.f5552c += min;
        }
        this.f5524g += remaining;
        return remaining;
    }

    @Override // n6.g
    public final /* bridge */ /* synthetic */ g writeByte(int i7) {
        I(i7);
        return this;
    }

    @Override // n6.g
    public final /* bridge */ /* synthetic */ g writeInt(int i7) {
        L(i7);
        return this;
    }

    @Override // n6.g
    public final /* bridge */ /* synthetic */ g writeShort(int i7) {
        N(i7);
        return this;
    }

    public final i y(int i7) {
        if (i7 == 0) {
            return i.f5525i;
        }
        b.d(this.f5524g, 0L, i7);
        r rVar = this.f5523f;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            kotlin.jvm.internal.i.b(rVar);
            int i11 = rVar.f5552c;
            int i12 = rVar.f5551b;
            if (i11 == i12) {
                throw new AssertionError("s.limit == s.pos");
            }
            i9 += i11 - i12;
            i10++;
            rVar = rVar.f5555f;
        }
        byte[][] bArr = new byte[i10][];
        int[] iArr = new int[i10 * 2];
        r rVar2 = this.f5523f;
        int i13 = 0;
        while (i8 < i7) {
            kotlin.jvm.internal.i.b(rVar2);
            bArr[i13] = rVar2.f5550a;
            i8 += rVar2.f5552c - rVar2.f5551b;
            iArr[i13] = Math.min(i8, i7);
            iArr[i13 + i10] = rVar2.f5551b;
            rVar2.f5553d = true;
            i13++;
            rVar2 = rVar2.f5555f;
        }
        return new t(bArr, iArr);
    }

    @Override // n6.g
    public final g write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] source, int i7, int i8) {
        kotlin.jvm.internal.i.e(source, "source");
        long j4 = i8;
        b.d(source.length, i7, j4);
        int i9 = i8 + i7;
        while (i7 < i9) {
            r F6 = F(1);
            int min = Math.min(i9 - i7, 8192 - F6.f5552c);
            int i10 = i7 + min;
            AbstractC0505i.F(F6.f5552c, i7, i10, source, F6.f5550a);
            F6.f5552c += min;
            i7 = i10;
        }
        this.f5524g += j4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, n6.u
    public final void close() {
    }

    @Override // n6.g, n6.u, java.io.Flushable
    public final void flush() {
    }
}
