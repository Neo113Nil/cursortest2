package M1;

import G1.AbstractC0001b;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public q f798a;

    /* renamed from: b, reason: collision with root package name */
    public long f799b;

    public final void A(int i) {
        q w2 = w(1);
        int i2 = w2.f822c;
        w2.f822c = i2 + 1;
        w2.f820a[i2] = (byte) i;
        this.f799b++;
    }

    public final void B(long j2) {
        if (j2 == 0) {
            A(48);
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
        q w2 = w(i);
        int i2 = w2.f822c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            w2.f820a[i3] = N1.a.f838a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        w2.f822c += i;
        this.f799b += i;
    }

    public final void C(int i) {
        q w2 = w(4);
        int i2 = w2.f822c;
        byte[] bArr = w2.f820a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        w2.f822c = i2 + 4;
        this.f799b += 4;
    }

    public final void D(String str) {
        k1.e.e(str, "string");
        E(str, 0, str.length());
    }

    public final void E(String str, int i, int i2) {
        char charAt;
        k1.e.e(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0001b.f("beginIndex < 0: ", i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC0001b.d(i2, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                q w2 = w(1);
                int i3 = w2.f822c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = w2.f820a;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = w2.f822c;
                int i6 = (i3 + i) - i5;
                w2.f822c = i5 + i6;
                this.f799b += i6;
            } else {
                if (charAt2 < 2048) {
                    q w3 = w(2);
                    int i7 = w3.f822c;
                    byte[] bArr2 = w3.f820a;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    w3.f822c = i7 + 2;
                    this.f799b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    q w4 = w(3);
                    int i8 = w4.f822c;
                    byte[] bArr3 = w4.f820a;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    w4.f822c = i8 + 3;
                    this.f799b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        A(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        q w5 = w(4);
                        int i11 = w5.f822c;
                        byte[] bArr4 = w5.f820a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        w5.f822c = i11 + 4;
                        this.f799b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void F(int i) {
        String str;
        int i2 = 0;
        if (i < 128) {
            A(i);
            return;
        }
        if (i < 2048) {
            q w2 = w(2);
            int i3 = w2.f822c;
            byte[] bArr = w2.f820a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            w2.f822c = i3 + 2;
            this.f799b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            A(63);
            return;
        }
        if (i < 65536) {
            q w3 = w(3);
            int i4 = w3.f822c;
            byte[] bArr2 = w3.f820a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            w3.f822c = i4 + 3;
            this.f799b += 3;
            return;
        }
        if (i <= 1114111) {
            q w4 = w(4);
            int i5 = w4.f822c;
            byte[] bArr3 = w4.f820a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            w4.f822c = i5 + 4;
            this.f799b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = N1.b.f839a;
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

    public final boolean a() {
        return this.f799b == 0;
    }

    @Override // M1.v
    public final x b() {
        return x.d;
    }

    @Override // M1.v
    public final long c(f fVar, long j2) {
        k1.e.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = this.f799b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        fVar.i(this, j2);
        return j2;
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f799b != 0) {
            q qVar = this.f798a;
            k1.e.b(qVar);
            q c2 = qVar.c();
            fVar.f798a = c2;
            c2.f825g = c2;
            c2.f824f = c2;
            for (q qVar2 = qVar.f824f; qVar2 != qVar; qVar2 = qVar2.f824f) {
                q qVar3 = c2.f825g;
                k1.e.b(qVar3);
                k1.e.b(qVar2);
                qVar3.b(qVar2.c());
            }
            fVar.f799b = this.f799b;
        }
        return fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, M1.t
    public final void close() {
    }

    public final byte d(long j2) {
        H1.d.k(this.f799b, j2, 1L);
        q qVar = this.f798a;
        if (qVar == null) {
            k1.e.b(null);
            throw null;
        }
        long j3 = this.f799b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                qVar = qVar.f825g;
                k1.e.b(qVar);
                j3 -= qVar.f822c - qVar.f821b;
            }
            return qVar.f820a[(int) ((qVar.f821b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i = qVar.f822c;
            int i2 = qVar.f821b;
            long j5 = (i - i2) + j4;
            if (j5 > j2) {
                return qVar.f820a[(int) ((i2 + j2) - j4)];
            }
            qVar = qVar.f824f;
            k1.e.b(qVar);
            j4 = j5;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                long j2 = this.f799b;
                f fVar = (f) obj;
                if (j2 == fVar.f799b) {
                    if (j2 != 0) {
                        q qVar = this.f798a;
                        k1.e.b(qVar);
                        q qVar2 = fVar.f798a;
                        k1.e.b(qVar2);
                        int i = qVar.f821b;
                        int i2 = qVar2.f821b;
                        long j3 = 0;
                        while (j3 < this.f799b) {
                            long min = Math.min(qVar.f822c - i, qVar2.f822c - i2);
                            long j4 = 0;
                            while (j4 < min) {
                                int i3 = i + 1;
                                byte b2 = qVar.f820a[i];
                                int i4 = i2 + 1;
                                if (b2 == qVar2.f820a[i2]) {
                                    j4++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == qVar.f822c) {
                                q qVar3 = qVar.f824f;
                                k1.e.b(qVar3);
                                i = qVar3.f821b;
                                qVar = qVar3;
                            }
                            if (i2 == qVar2.f822c) {
                                qVar2 = qVar2.f824f;
                                k1.e.b(qVar2);
                                i2 = qVar2.f821b;
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

    @Override // M1.t, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        q qVar = this.f798a;
        if (qVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = qVar.f822c;
            for (int i3 = qVar.f821b; i3 < i2; i3++) {
                i = (i * 31) + qVar.f820a[i3];
            }
            qVar = qVar.f824f;
            k1.e.b(qVar);
        } while (qVar != this.f798a);
        return i;
    }

    @Override // M1.t
    public final void i(f fVar, long j2) {
        q b2;
        k1.e.e(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        H1.d.k(fVar.f799b, 0L, j2);
        while (j2 > 0) {
            q qVar = fVar.f798a;
            k1.e.b(qVar);
            int i = qVar.f822c;
            q qVar2 = fVar.f798a;
            k1.e.b(qVar2);
            long j3 = i - qVar2.f821b;
            int i2 = 0;
            if (j2 < j3) {
                q qVar3 = this.f798a;
                q qVar4 = qVar3 != null ? qVar3.f825g : null;
                if (qVar4 != null && qVar4.f823e) {
                    if ((qVar4.f822c + j2) - (qVar4.d ? 0 : qVar4.f821b) <= 8192) {
                        q qVar5 = fVar.f798a;
                        k1.e.b(qVar5);
                        qVar5.d(qVar4, (int) j2);
                        fVar.f799b -= j2;
                        this.f799b += j2;
                        return;
                    }
                }
                q qVar6 = fVar.f798a;
                k1.e.b(qVar6);
                int i3 = (int) j2;
                if (i3 <= 0 || i3 > qVar6.f822c - qVar6.f821b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    b2 = qVar6.c();
                } else {
                    b2 = r.b();
                    int i4 = qVar6.f821b;
                    Y0.i.j0(0, i4, i4 + i3, qVar6.f820a, b2.f820a);
                }
                b2.f822c = b2.f821b + i3;
                qVar6.f821b += i3;
                q qVar7 = qVar6.f825g;
                k1.e.b(qVar7);
                qVar7.b(b2);
                fVar.f798a = b2;
            }
            q qVar8 = fVar.f798a;
            k1.e.b(qVar8);
            long j4 = qVar8.f822c - qVar8.f821b;
            fVar.f798a = qVar8.a();
            q qVar9 = this.f798a;
            if (qVar9 == null) {
                this.f798a = qVar8;
                qVar8.f825g = qVar8;
                qVar8.f824f = qVar8;
            } else {
                q qVar10 = qVar9.f825g;
                k1.e.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.f825g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                k1.e.b(qVar11);
                if (qVar11.f823e) {
                    int i5 = qVar8.f822c - qVar8.f821b;
                    q qVar12 = qVar8.f825g;
                    k1.e.b(qVar12);
                    int i6 = 8192 - qVar12.f822c;
                    q qVar13 = qVar8.f825g;
                    k1.e.b(qVar13);
                    if (!qVar13.d) {
                        q qVar14 = qVar8.f825g;
                        k1.e.b(qVar14);
                        i2 = qVar14.f821b;
                    }
                    if (i5 <= i6 + i2) {
                        q qVar15 = qVar8.f825g;
                        k1.e.b(qVar15);
                        qVar8.d(qVar15, i5);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            fVar.f799b -= j4;
            this.f799b += j4;
            j2 -= j4;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte j() {
        if (this.f799b == 0) {
            throw new EOFException();
        }
        q qVar = this.f798a;
        k1.e.b(qVar);
        int i = qVar.f821b;
        int i2 = qVar.f822c;
        int i3 = i + 1;
        byte b2 = qVar.f820a[i];
        this.f799b--;
        if (i3 == i2) {
            this.f798a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f821b = i3;
        }
        return b2;
    }

    public final byte[] k(long j2) {
        int min;
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f799b < j2) {
            throw new EOFException();
        }
        int i = (int) j2;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            H1.d.k(i, i2, i3);
            q qVar = this.f798a;
            if (qVar == null) {
                min = -1;
            } else {
                min = Math.min(i3, qVar.f822c - qVar.f821b);
                int i4 = qVar.f821b;
                Y0.i.j0(i2, i4, i4 + min, qVar.f820a, bArr);
                int i5 = qVar.f821b + min;
                qVar.f821b = i5;
                this.f799b -= min;
                if (i5 == qVar.f822c) {
                    this.f798a = qVar.a();
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

    @Override // M1.g
    public final /* bridge */ /* synthetic */ g l(String str) {
        D(str);
        return this;
    }

    @Override // M1.h
    public final int o(n nVar) {
        k1.e.e(nVar, "options");
        int b2 = N1.a.b(this, nVar, false);
        if (b2 == -1) {
            return -1;
        }
        u(nVar.f812a[b2].a());
        return b2;
    }

    public final i p(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f799b < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new i(k(j2));
        }
        i v2 = v((int) j2);
        u(j2);
        return v2;
    }

    @Override // M1.h
    public final String q(Charset charset) {
        return t(this.f799b, charset);
    }

    public final int r() {
        if (this.f799b < 4) {
            throw new EOFException();
        }
        q qVar = this.f798a;
        k1.e.b(qVar);
        int i = qVar.f821b;
        int i2 = qVar.f822c;
        if (i2 - i < 4) {
            return ((j() & 255) << 24) | ((j() & 255) << 16) | ((j() & 255) << 8) | (j() & 255);
        }
        byte[] bArr = qVar.f820a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.f799b -= 4;
        if (i5 == i2) {
            this.f798a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f821b = i5;
        }
        return i6;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        k1.e.e(byteBuffer, "sink");
        q qVar = this.f798a;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f822c - qVar.f821b);
        byteBuffer.put(qVar.f820a, qVar.f821b, min);
        int i = qVar.f821b + min;
        qVar.f821b = i;
        this.f799b -= min;
        if (i == qVar.f822c) {
            this.f798a = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    public final short s() {
        if (this.f799b < 2) {
            throw new EOFException();
        }
        q qVar = this.f798a;
        k1.e.b(qVar);
        int i = qVar.f821b;
        int i2 = qVar.f822c;
        if (i2 - i < 2) {
            return (short) (((j() & 255) << 8) | (j() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = qVar.f820a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f799b -= 2;
        if (i5 == i2) {
            this.f798a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f821b = i5;
        }
        return (short) i6;
    }

    public final String t(long j2, Charset charset) {
        k1.e.e(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f799b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        q qVar = this.f798a;
        k1.e.b(qVar);
        int i = qVar.f821b;
        if (i + j2 > qVar.f822c) {
            return new String(k(j2), charset);
        }
        int i2 = (int) j2;
        String str = new String(qVar.f820a, i, i2, charset);
        int i3 = qVar.f821b + i2;
        qVar.f821b = i3;
        this.f799b -= j2;
        if (i3 == qVar.f822c) {
            this.f798a = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    public final String toString() {
        long j2 = this.f799b;
        if (j2 <= 2147483647L) {
            return v((int) j2).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f799b).toString());
    }

    public final void u(long j2) {
        while (j2 > 0) {
            q qVar = this.f798a;
            if (qVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, qVar.f822c - qVar.f821b);
            long j3 = min;
            this.f799b -= j3;
            j2 -= j3;
            int i = qVar.f821b + min;
            qVar.f821b = i;
            if (i == qVar.f822c) {
                this.f798a = qVar.a();
                r.a(qVar);
            }
        }
    }

    public final i v(int i) {
        if (i == 0) {
            return i.d;
        }
        H1.d.k(this.f799b, 0L, i);
        q qVar = this.f798a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            k1.e.b(qVar);
            int i5 = qVar.f822c;
            int i6 = qVar.f821b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            qVar = qVar.f824f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        q qVar2 = this.f798a;
        int i7 = 0;
        while (i2 < i) {
            k1.e.b(qVar2);
            bArr[i7] = qVar2.f820a;
            i2 += qVar2.f822c - qVar2.f821b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = qVar2.f821b;
            qVar2.d = true;
            i7++;
            qVar2 = qVar2.f824f;
        }
        return new s(bArr, iArr);
    }

    public final q w(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f798a;
        if (qVar == null) {
            q b2 = r.b();
            this.f798a = b2;
            b2.f825g = b2;
            b2.f824f = b2;
            return b2;
        }
        q qVar2 = qVar.f825g;
        k1.e.b(qVar2);
        if (qVar2.f822c + i <= 8192 && qVar2.f823e) {
            return qVar2;
        }
        q b3 = r.b();
        qVar2.b(b3);
        return b3;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        k1.e.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            q w2 = w(1);
            int min = Math.min(i, 8192 - w2.f822c);
            byteBuffer.get(w2.f820a, w2.f822c, min);
            i -= min;
            w2.f822c += min;
        }
        this.f799b += remaining;
        return remaining;
    }

    public final void x(int i, int i2, byte[] bArr) {
        k1.e.e(bArr, "source");
        long j2 = i2;
        H1.d.k(bArr.length, i, j2);
        int i3 = i2 + i;
        while (i < i3) {
            q w2 = w(1);
            int min = Math.min(i3 - i, 8192 - w2.f822c);
            int i4 = i + min;
            Y0.i.j0(w2.f822c, i, i4, bArr, w2.f820a);
            w2.f822c += min;
            i = i4;
        }
        this.f799b += j2;
    }

    public final void y(i iVar) {
        k1.e.e(iVar, "byteString");
        iVar.i(this, iVar.a());
    }

    public final void z(v vVar) {
        k1.e.e(vVar, "source");
        while (vVar.c(this, 8192L) != -1) {
        }
    }
}
