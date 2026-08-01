package B1;

import Y.V;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public q f68a;

    /* renamed from: b, reason: collision with root package name */
    public long f69b;

    @Override // B1.v
    public final x a() {
        return x.d;
    }

    @Override // B1.h
    public final int b(n nVar) {
        d1.d.e(nVar, "options");
        int b2 = C1.a.b(this, nVar, false);
        if (b2 == -1) {
            return -1;
        }
        o(nVar.f82a[b2].a());
        return b2;
    }

    @Override // B1.v
    public final long c(f fVar, long j2) {
        d1.d.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = this.f69b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        fVar.e(this, j2);
        return j2;
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f69b != 0) {
            q qVar = this.f68a;
            d1.d.b(qVar);
            q c2 = qVar.c();
            fVar.f68a = c2;
            c2.f95g = c2;
            c2.f94f = c2;
            for (q qVar2 = qVar.f94f; qVar2 != qVar; qVar2 = qVar2.f94f) {
                q qVar3 = c2.f95g;
                d1.d.b(qVar3);
                d1.d.b(qVar2);
                qVar3.b(qVar2.c());
            }
            fVar.f69b = this.f69b;
        }
        return fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, B1.t
    public final void close() {
    }

    @Override // B1.g
    public final /* bridge */ /* synthetic */ g d(String str) {
        x(str);
        return this;
    }

    @Override // B1.t
    public final void e(f fVar, long j2) {
        q b2;
        d1.d.e(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        w1.d.m(fVar.f69b, 0L, j2);
        while (j2 > 0) {
            q qVar = fVar.f68a;
            d1.d.b(qVar);
            int i = qVar.f92c;
            q qVar2 = fVar.f68a;
            d1.d.b(qVar2);
            long j3 = i - qVar2.f91b;
            int i2 = 0;
            if (j2 < j3) {
                q qVar3 = this.f68a;
                q qVar4 = qVar3 != null ? qVar3.f95g : null;
                if (qVar4 != null && qVar4.f93e) {
                    if ((qVar4.f92c + j2) - (qVar4.d ? 0 : qVar4.f91b) <= 8192) {
                        q qVar5 = fVar.f68a;
                        d1.d.b(qVar5);
                        qVar5.d(qVar4, (int) j2);
                        fVar.f69b -= j2;
                        this.f69b += j2;
                        return;
                    }
                }
                q qVar6 = fVar.f68a;
                d1.d.b(qVar6);
                int i3 = (int) j2;
                if (i3 <= 0 || i3 > qVar6.f92c - qVar6.f91b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    b2 = qVar6.c();
                } else {
                    b2 = r.b();
                    int i4 = qVar6.f91b;
                    S0.f.c0(0, i4, i4 + i3, qVar6.f90a, b2.f90a);
                }
                b2.f92c = b2.f91b + i3;
                qVar6.f91b += i3;
                q qVar7 = qVar6.f95g;
                d1.d.b(qVar7);
                qVar7.b(b2);
                fVar.f68a = b2;
            }
            q qVar8 = fVar.f68a;
            d1.d.b(qVar8);
            long j4 = qVar8.f92c - qVar8.f91b;
            fVar.f68a = qVar8.a();
            q qVar9 = this.f68a;
            if (qVar9 == null) {
                this.f68a = qVar8;
                qVar8.f95g = qVar8;
                qVar8.f94f = qVar8;
            } else {
                q qVar10 = qVar9.f95g;
                d1.d.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.f95g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                d1.d.b(qVar11);
                if (qVar11.f93e) {
                    int i5 = qVar8.f92c - qVar8.f91b;
                    q qVar12 = qVar8.f95g;
                    d1.d.b(qVar12);
                    int i6 = 8192 - qVar12.f92c;
                    q qVar13 = qVar8.f95g;
                    d1.d.b(qVar13);
                    if (!qVar13.d) {
                        q qVar14 = qVar8.f95g;
                        d1.d.b(qVar14);
                        i2 = qVar14.f91b;
                    }
                    if (i5 <= i6 + i2) {
                        q qVar15 = qVar8.f95g;
                        d1.d.b(qVar15);
                        qVar8.d(qVar15, i5);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            fVar.f69b -= j4;
            this.f69b += j4;
            j2 -= j4;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                long j2 = this.f69b;
                f fVar = (f) obj;
                if (j2 == fVar.f69b) {
                    if (j2 != 0) {
                        q qVar = this.f68a;
                        d1.d.b(qVar);
                        q qVar2 = fVar.f68a;
                        d1.d.b(qVar2);
                        int i = qVar.f91b;
                        int i2 = qVar2.f91b;
                        long j3 = 0;
                        while (j3 < this.f69b) {
                            long min = Math.min(qVar.f92c - i, qVar2.f92c - i2);
                            long j4 = 0;
                            while (j4 < min) {
                                int i3 = i + 1;
                                byte b2 = qVar.f90a[i];
                                int i4 = i2 + 1;
                                if (b2 == qVar2.f90a[i2]) {
                                    j4++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == qVar.f92c) {
                                q qVar3 = qVar.f94f;
                                d1.d.b(qVar3);
                                i = qVar3.f91b;
                                qVar = qVar3;
                            }
                            if (i2 == qVar2.f92c) {
                                qVar2 = qVar2.f94f;
                                d1.d.b(qVar2);
                                i2 = qVar2.f91b;
                            }
                            j3 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // B1.h
    public final String f(Charset charset) {
        return n(this.f69b, charset);
    }

    @Override // B1.t, java.io.Flushable
    public final void flush() {
    }

    public final boolean g() {
        return this.f69b == 0;
    }

    public final byte h(long j2) {
        w1.d.m(this.f69b, j2, 1L);
        q qVar = this.f68a;
        if (qVar == null) {
            d1.d.b(null);
            throw null;
        }
        long j3 = this.f69b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                qVar = qVar.f95g;
                d1.d.b(qVar);
                j3 -= qVar.f92c - qVar.f91b;
            }
            return qVar.f90a[(int) ((qVar.f91b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i = qVar.f92c;
            int i2 = qVar.f91b;
            long j5 = (i - i2) + j4;
            if (j5 > j2) {
                return qVar.f90a[(int) ((i2 + j2) - j4)];
            }
            qVar = qVar.f94f;
            d1.d.b(qVar);
            j4 = j5;
        }
    }

    public final int hashCode() {
        q qVar = this.f68a;
        if (qVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = qVar.f92c;
            for (int i3 = qVar.f91b; i3 < i2; i3++) {
                i = (i * 31) + qVar.f90a[i3];
            }
            qVar = qVar.f94f;
            d1.d.b(qVar);
        } while (qVar != this.f68a);
        return i;
    }

    public final byte i() {
        if (this.f69b == 0) {
            throw new EOFException();
        }
        q qVar = this.f68a;
        d1.d.b(qVar);
        int i = qVar.f91b;
        int i2 = qVar.f92c;
        int i3 = i + 1;
        byte b2 = qVar.f90a[i];
        this.f69b--;
        if (i3 == i2) {
            this.f68a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f91b = i3;
        }
        return b2;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte[] j(long j2) {
        int min;
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f69b < j2) {
            throw new EOFException();
        }
        int i = (int) j2;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            w1.d.m(i, i2, i3);
            q qVar = this.f68a;
            if (qVar == null) {
                min = -1;
            } else {
                min = Math.min(i3, qVar.f92c - qVar.f91b);
                int i4 = qVar.f91b;
                S0.f.c0(i2, i4, i4 + min, qVar.f90a, bArr);
                int i5 = qVar.f91b + min;
                qVar.f91b = i5;
                this.f69b -= min;
                if (i5 == qVar.f92c) {
                    this.f68a = qVar.a();
                    r.a(qVar);
                }
            }
            if (min == -1) {
                throw new EOFException();
            }
            i2 += min;
        }
        return bArr;
    }

    public final i k(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f69b < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new i(j(j2));
        }
        i p2 = p((int) j2);
        o(j2);
        return p2;
    }

    public final int l() {
        if (this.f69b < 4) {
            throw new EOFException();
        }
        q qVar = this.f68a;
        d1.d.b(qVar);
        int i = qVar.f91b;
        int i2 = qVar.f92c;
        if (i2 - i < 4) {
            return ((i() & 255) << 24) | ((i() & 255) << 16) | ((i() & 255) << 8) | (i() & 255);
        }
        byte[] bArr = qVar.f90a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.f69b -= 4;
        if (i5 == i2) {
            this.f68a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f91b = i5;
        }
        return i6;
    }

    public final short m() {
        if (this.f69b < 2) {
            throw new EOFException();
        }
        q qVar = this.f68a;
        d1.d.b(qVar);
        int i = qVar.f91b;
        int i2 = qVar.f92c;
        if (i2 - i < 2) {
            return (short) (((i() & 255) << 8) | (i() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = qVar.f90a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f69b -= 2;
        if (i5 == i2) {
            this.f68a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f91b = i5;
        }
        return (short) i6;
    }

    public final String n(long j2, Charset charset) {
        d1.d.e(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f69b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        q qVar = this.f68a;
        d1.d.b(qVar);
        int i = qVar.f91b;
        if (i + j2 > qVar.f92c) {
            return new String(j(j2), charset);
        }
        int i2 = (int) j2;
        String str = new String(qVar.f90a, i, i2, charset);
        int i3 = qVar.f91b + i2;
        qVar.f91b = i3;
        this.f69b -= j2;
        if (i3 == qVar.f92c) {
            this.f68a = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    public final void o(long j2) {
        while (j2 > 0) {
            q qVar = this.f68a;
            if (qVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, qVar.f92c - qVar.f91b);
            long j3 = min;
            this.f69b -= j3;
            j2 -= j3;
            int i = qVar.f91b + min;
            qVar.f91b = i;
            if (i == qVar.f92c) {
                this.f68a = qVar.a();
                r.a(qVar);
            }
        }
    }

    public final i p(int i) {
        if (i == 0) {
            return i.d;
        }
        w1.d.m(this.f69b, 0L, i);
        q qVar = this.f68a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            d1.d.b(qVar);
            int i5 = qVar.f92c;
            int i6 = qVar.f91b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            qVar = qVar.f94f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        q qVar2 = this.f68a;
        int i7 = 0;
        while (i2 < i) {
            d1.d.b(qVar2);
            bArr[i7] = qVar2.f90a;
            i2 += qVar2.f92c - qVar2.f91b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = qVar2.f91b;
            qVar2.d = true;
            i7++;
            qVar2 = qVar2.f94f;
        }
        return new s(bArr, iArr);
    }

    public final q q(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f68a;
        if (qVar == null) {
            q b2 = r.b();
            this.f68a = b2;
            b2.f95g = b2;
            b2.f94f = b2;
            return b2;
        }
        q qVar2 = qVar.f95g;
        d1.d.b(qVar2);
        if (qVar2.f92c + i <= 8192 && qVar2.f93e) {
            return qVar2;
        }
        q b3 = r.b();
        qVar2.b(b3);
        return b3;
    }

    public final void r(int i, int i2, byte[] bArr) {
        d1.d.e(bArr, "source");
        long j2 = i2;
        w1.d.m(bArr.length, i, j2);
        int i3 = i2 + i;
        while (i < i3) {
            q q2 = q(1);
            int min = Math.min(i3 - i, 8192 - q2.f92c);
            int i4 = i + min;
            S0.f.c0(q2.f92c, i, i4, bArr, q2.f90a);
            q2.f92c += min;
            i = i4;
        }
        this.f69b += j2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        d1.d.e(byteBuffer, "sink");
        q qVar = this.f68a;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f92c - qVar.f91b);
        byteBuffer.put(qVar.f90a, qVar.f91b, min);
        int i = qVar.f91b + min;
        qVar.f91b = i;
        this.f69b -= min;
        if (i == qVar.f92c) {
            this.f68a = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    public final void s(i iVar) {
        d1.d.e(iVar, "byteString");
        iVar.i(this, iVar.a());
    }

    public final void t(v vVar) {
        d1.d.e(vVar, "source");
        while (vVar.c(this, 8192L) != -1) {
        }
    }

    public final String toString() {
        long j2 = this.f69b;
        if (j2 <= 2147483647L) {
            return p((int) j2).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f69b).toString());
    }

    public final void u(int i) {
        q q2 = q(1);
        int i2 = q2.f92c;
        q2.f92c = i2 + 1;
        q2.f90a[i2] = (byte) i;
        this.f69b++;
    }

    public final void v(long j2) {
        if (j2 == 0) {
            u(48);
            return;
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + 3) / 4);
        q q2 = q(i);
        int i2 = q2.f92c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            q2.f90a[i3] = C1.a.f133a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        q2.f92c += i;
        this.f69b += i;
    }

    public final void w(int i) {
        q q2 = q(4);
        int i2 = q2.f92c;
        byte[] bArr = q2.f90a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        q2.f92c = i2 + 4;
        this.f69b += 4;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        d1.d.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            q q2 = q(1);
            int min = Math.min(i, 8192 - q2.f92c);
            byteBuffer.get(q2.f90a, q2.f92c, min);
            i -= min;
            q2.f92c += min;
        }
        this.f69b += remaining;
        return remaining;
    }

    public final void x(String str) {
        d1.d.e(str, "string");
        y(str, 0, str.length());
    }

    public final void y(String str, int i, int i2) {
        char charAt;
        d1.d.e(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(V.e("beginIndex < 0: ", i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                q q2 = q(1);
                int i3 = q2.f92c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = q2.f90a;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = q2.f92c;
                int i6 = (i3 + i) - i5;
                q2.f92c = i5 + i6;
                this.f69b += i6;
            } else {
                if (charAt2 < 2048) {
                    q q3 = q(2);
                    int i7 = q3.f92c;
                    byte[] bArr2 = q3.f90a;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    q3.f92c = i7 + 2;
                    this.f69b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    q q4 = q(3);
                    int i8 = q4.f92c;
                    byte[] bArr3 = q4.f90a;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    q4.f92c = i8 + 3;
                    this.f69b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        u(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        q q5 = q(4);
                        int i11 = q5.f92c;
                        byte[] bArr4 = q5.f90a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        q5.f92c = i11 + 4;
                        this.f69b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void z(int i) {
        String str;
        int i2 = 0;
        if (i < 128) {
            u(i);
            return;
        }
        if (i < 2048) {
            q q2 = q(2);
            int i3 = q2.f92c;
            byte[] bArr = q2.f90a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            q2.f92c = i3 + 2;
            this.f69b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            u(63);
            return;
        }
        if (i < 65536) {
            q q3 = q(3);
            int i4 = q3.f92c;
            byte[] bArr2 = q3.f90a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            q3.f92c = i4 + 3;
            this.f69b += 3;
            return;
        }
        if (i <= 1114111) {
            q q4 = q(4);
            int i5 = q4.f92c;
            byte[] bArr3 = q4.f90a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            q4.f92c = i5 + 4;
            this.f69b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = C1.b.f134a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i2 < 8 && cArr2[i2] == '0') {
                i2++;
            }
            if (i2 < 0) {
                throw new IndexOutOfBoundsException("startIndex: " + i2 + ", endIndex: 8, size: 8");
            }
            if (i2 > 8) {
                throw new IllegalArgumentException("startIndex: " + i2 + " > endIndex: 8");
            }
            str = new String(cArr2, i2, 8 - i2);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
}
