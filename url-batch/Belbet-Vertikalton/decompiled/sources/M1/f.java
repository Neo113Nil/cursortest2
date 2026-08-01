package M1;

import G1.AbstractC0001b;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public q f826a;

    /* renamed from: b, reason: collision with root package name */
    public long f827b;

    public final i B(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f827b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new i(z(j));
        }
        i H = H((int) j);
        G(j);
        return H;
    }

    public final int D() {
        if (this.f827b < 4) {
            throw new EOFException();
        }
        q qVar = this.f826a;
        j1.h.b(qVar);
        int i = qVar.f850b;
        int i2 = qVar.f851c;
        if (i2 - i < 4) {
            return ((q() & 255) << 24) | ((q() & 255) << 16) | ((q() & 255) << 8) | (q() & 255);
        }
        byte[] bArr = qVar.f849a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.f827b -= 4;
        if (i5 == i2) {
            this.f826a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f850b = i5;
        }
        return i6;
    }

    public final short E() {
        if (this.f827b < 2) {
            throw new EOFException();
        }
        q qVar = this.f826a;
        j1.h.b(qVar);
        int i = qVar.f850b;
        int i2 = qVar.f851c;
        if (i2 - i < 2) {
            return (short) (((q() & 255) << 8) | (q() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = qVar.f849a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f827b -= 2;
        if (i5 == i2) {
            this.f826a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f850b = i5;
        }
        return (short) i6;
    }

    public final String F(long j, Charset charset) {
        j1.h.e(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f827b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        q qVar = this.f826a;
        j1.h.b(qVar);
        int i = qVar.f850b;
        if (i + j > qVar.f851c) {
            return new String(z(j), charset);
        }
        int i2 = (int) j;
        String str = new String(qVar.f849a, i, i2, charset);
        int i3 = qVar.f850b + i2;
        qVar.f850b = i3;
        this.f827b -= j;
        if (i3 == qVar.f851c) {
            this.f826a = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    public final void G(long j) {
        while (j > 0) {
            q qVar = this.f826a;
            if (qVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, qVar.f851c - qVar.f850b);
            long j2 = min;
            this.f827b -= j2;
            j -= j2;
            int i = qVar.f850b + min;
            qVar.f850b = i;
            if (i == qVar.f851c) {
                this.f826a = qVar.a();
                r.a(qVar);
            }
        }
    }

    public final i H(int i) {
        if (i == 0) {
            return i.f828d;
        }
        H1.l.h(this.f827b, 0L, i);
        q qVar = this.f826a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            j1.h.b(qVar);
            int i5 = qVar.f851c;
            int i6 = qVar.f850b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            qVar = qVar.f853f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        q qVar2 = this.f826a;
        int i7 = 0;
        while (i2 < i) {
            j1.h.b(qVar2);
            bArr[i7] = qVar2.f849a;
            i2 += qVar2.f851c - qVar2.f850b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = qVar2.f850b;
            qVar2.f852d = true;
            i7++;
            qVar2 = qVar2.f853f;
        }
        return new s(bArr, iArr);
    }

    public final q I(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f826a;
        if (qVar == null) {
            q b2 = r.b();
            this.f826a = b2;
            b2.f854g = b2;
            b2.f853f = b2;
            return b2;
        }
        q qVar2 = qVar.f854g;
        j1.h.b(qVar2);
        if (qVar2.f851c + i <= 8192 && qVar2.e) {
            return qVar2;
        }
        q b3 = r.b();
        qVar2.b(b3);
        return b3;
    }

    public final void J(int i, int i2, byte[] bArr) {
        j1.h.e(bArr, "source");
        long j = i2;
        H1.l.h(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            q I2 = I(1);
            int min = Math.min(i3 - i, 8192 - I2.f851c);
            int i4 = i + min;
            X0.j.m0(I2.f851c, i, i4, bArr, I2.f849a);
            I2.f851c += min;
            i = i4;
        }
        this.f827b += j;
    }

    public final void K(i iVar) {
        j1.h.e(iVar, "byteString");
        iVar.i(this, iVar.a());
    }

    public final void L(v vVar) {
        j1.h.e(vVar, "source");
        while (vVar.h(this, 8192L) != -1) {
        }
    }

    public final void M(int i) {
        q I2 = I(1);
        int i2 = I2.f851c;
        I2.f851c = i2 + 1;
        I2.f849a[i2] = (byte) i;
        this.f827b++;
    }

    public final void N(long j) {
        if (j == 0) {
            M(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        q I2 = I(i);
        int i2 = I2.f851c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            I2.f849a[i3] = N1.a.f970a[(int) (15 & j)];
            j >>>= 4;
        }
        I2.f851c += i;
        this.f827b += i;
    }

    public final void O(int i) {
        q I2 = I(4);
        int i2 = I2.f851c;
        byte[] bArr = I2.f849a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        I2.f851c = i2 + 4;
        this.f827b += 4;
    }

    public final void P(String str) {
        j1.h.e(str, "string");
        Q(str, 0, str.length());
    }

    public final void Q(String str, int i, int i2) {
        char charAt;
        j1.h.e(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0001b.e("beginIndex < 0: ", i).toString());
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
                q I2 = I(1);
                int i3 = I2.f851c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = I2.f849a;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = I2.f851c;
                int i6 = (i3 + i) - i5;
                I2.f851c = i5 + i6;
                this.f827b += i6;
            } else {
                if (charAt2 < 2048) {
                    q I3 = I(2);
                    int i7 = I3.f851c;
                    byte[] bArr2 = I3.f849a;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    I3.f851c = i7 + 2;
                    this.f827b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    q I4 = I(3);
                    int i8 = I4.f851c;
                    byte[] bArr3 = I4.f849a;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    I4.f851c = i8 + 3;
                    this.f827b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        M(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        q I5 = I(4);
                        int i11 = I5.f851c;
                        byte[] bArr4 = I5.f849a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        I5.f851c = i11 + 4;
                        this.f827b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void R(int i) {
        String str;
        int i2 = 0;
        if (i < 128) {
            M(i);
            return;
        }
        if (i < 2048) {
            q I2 = I(2);
            int i3 = I2.f851c;
            byte[] bArr = I2.f849a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            I2.f851c = i3 + 2;
            this.f827b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            M(63);
            return;
        }
        if (i < 65536) {
            q I3 = I(3);
            int i4 = I3.f851c;
            byte[] bArr2 = I3.f849a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            I3.f851c = i4 + 3;
            this.f827b += 3;
            return;
        }
        if (i <= 1114111) {
            q I4 = I(4);
            int i5 = I4.f851c;
            byte[] bArr3 = I4.f849a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            I4.f851c = i5 + 4;
            this.f827b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = N1.b.f971a;
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
        return this.f827b == 0;
    }

    @Override // M1.v
    public final x b() {
        return x.f860d;
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f827b != 0) {
            q qVar = this.f826a;
            j1.h.b(qVar);
            q c2 = qVar.c();
            fVar.f826a = c2;
            c2.f854g = c2;
            c2.f853f = c2;
            for (q qVar2 = qVar.f853f; qVar2 != qVar; qVar2 = qVar2.f853f) {
                q qVar3 = c2.f854g;
                j1.h.b(qVar3);
                j1.h.b(qVar2);
                qVar3.b(qVar2.c());
            }
            fVar.f827b = this.f827b;
        }
        return fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, M1.t
    public final void close() {
    }

    public final byte d(long j) {
        H1.l.h(this.f827b, j, 1L);
        q qVar = this.f826a;
        if (qVar == null) {
            j1.h.b(null);
            throw null;
        }
        long j2 = this.f827b;
        if (j2 - j < j) {
            while (j2 > j) {
                qVar = qVar.f854g;
                j1.h.b(qVar);
                j2 -= qVar.f851c - qVar.f850b;
            }
            return qVar.f849a[(int) ((qVar.f850b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = qVar.f851c;
            int i2 = qVar.f850b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return qVar.f849a[(int) ((i2 + j) - j3)];
            }
            qVar = qVar.f853f;
            j1.h.b(qVar);
            j3 = j4;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                long j = this.f827b;
                f fVar = (f) obj;
                if (j == fVar.f827b) {
                    if (j != 0) {
                        q qVar = this.f826a;
                        j1.h.b(qVar);
                        q qVar2 = fVar.f826a;
                        j1.h.b(qVar2);
                        int i = qVar.f850b;
                        int i2 = qVar2.f850b;
                        long j2 = 0;
                        while (j2 < this.f827b) {
                            long min = Math.min(qVar.f851c - i, qVar2.f851c - i2);
                            long j3 = 0;
                            while (j3 < min) {
                                int i3 = i + 1;
                                byte b2 = qVar.f849a[i];
                                int i4 = i2 + 1;
                                if (b2 == qVar2.f849a[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == qVar.f851c) {
                                q qVar3 = qVar.f853f;
                                j1.h.b(qVar3);
                                i = qVar3.f850b;
                                qVar = qVar3;
                            }
                            if (i2 == qVar2.f851c) {
                                qVar2 = qVar2.f853f;
                                j1.h.b(qVar2);
                                i2 = qVar2.f850b;
                            }
                            j2 += min;
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

    @Override // M1.v
    public final long h(f fVar, long j) {
        j1.h.e(fVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        long j2 = this.f827b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        fVar.n(this, j);
        return j;
    }

    public final int hashCode() {
        q qVar = this.f826a;
        if (qVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = qVar.f851c;
            for (int i3 = qVar.f850b; i3 < i2; i3++) {
                i = (i * 31) + qVar.f849a[i3];
            }
            qVar = qVar.f853f;
            j1.h.b(qVar);
        } while (qVar != this.f826a);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // M1.t
    public final void n(f fVar, long j) {
        q b2;
        j1.h.e(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        H1.l.h(fVar.f827b, 0L, j);
        while (j > 0) {
            q qVar = fVar.f826a;
            j1.h.b(qVar);
            int i = qVar.f851c;
            q qVar2 = fVar.f826a;
            j1.h.b(qVar2);
            long j2 = i - qVar2.f850b;
            int i2 = 0;
            if (j < j2) {
                q qVar3 = this.f826a;
                q qVar4 = qVar3 != null ? qVar3.f854g : null;
                if (qVar4 != null && qVar4.e) {
                    if ((qVar4.f851c + j) - (qVar4.f852d ? 0 : qVar4.f850b) <= 8192) {
                        q qVar5 = fVar.f826a;
                        j1.h.b(qVar5);
                        qVar5.d(qVar4, (int) j);
                        fVar.f827b -= j;
                        this.f827b += j;
                        return;
                    }
                }
                q qVar6 = fVar.f826a;
                j1.h.b(qVar6);
                int i3 = (int) j;
                if (i3 <= 0 || i3 > qVar6.f851c - qVar6.f850b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    b2 = qVar6.c();
                } else {
                    b2 = r.b();
                    int i4 = qVar6.f850b;
                    X0.j.m0(0, i4, i4 + i3, qVar6.f849a, b2.f849a);
                }
                b2.f851c = b2.f850b + i3;
                qVar6.f850b += i3;
                q qVar7 = qVar6.f854g;
                j1.h.b(qVar7);
                qVar7.b(b2);
                fVar.f826a = b2;
            }
            q qVar8 = fVar.f826a;
            j1.h.b(qVar8);
            long j3 = qVar8.f851c - qVar8.f850b;
            fVar.f826a = qVar8.a();
            q qVar9 = this.f826a;
            if (qVar9 == null) {
                this.f826a = qVar8;
                qVar8.f854g = qVar8;
                qVar8.f853f = qVar8;
            } else {
                q qVar10 = qVar9.f854g;
                j1.h.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.f854g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                j1.h.b(qVar11);
                if (qVar11.e) {
                    int i5 = qVar8.f851c - qVar8.f850b;
                    q qVar12 = qVar8.f854g;
                    j1.h.b(qVar12);
                    int i6 = 8192 - qVar12.f851c;
                    q qVar13 = qVar8.f854g;
                    j1.h.b(qVar13);
                    if (!qVar13.f852d) {
                        q qVar14 = qVar8.f854g;
                        j1.h.b(qVar14);
                        i2 = qVar14.f850b;
                    }
                    if (i5 <= i6 + i2) {
                        q qVar15 = qVar8.f854g;
                        j1.h.b(qVar15);
                        qVar8.d(qVar15, i5);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            fVar.f827b -= j3;
            this.f827b += j3;
            j -= j3;
        }
    }

    @Override // M1.g
    public final /* bridge */ /* synthetic */ g p(String str) {
        P(str);
        return this;
    }

    public final byte q() {
        if (this.f827b == 0) {
            throw new EOFException();
        }
        q qVar = this.f826a;
        j1.h.b(qVar);
        int i = qVar.f850b;
        int i2 = qVar.f851c;
        int i3 = i + 1;
        byte b2 = qVar.f849a[i];
        this.f827b--;
        if (i3 == i2) {
            this.f826a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f850b = i3;
        }
        return b2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        j1.h.e(byteBuffer, "sink");
        q qVar = this.f826a;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f851c - qVar.f850b);
        byteBuffer.put(qVar.f849a, qVar.f850b, min);
        int i = qVar.f850b + min;
        qVar.f850b = i;
        this.f827b -= min;
        if (i == qVar.f851c) {
            this.f826a = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    public final String toString() {
        long j = this.f827b;
        if (j <= 2147483647L) {
            return H((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f827b).toString());
    }

    @Override // M1.h
    public final int v(n nVar) {
        j1.h.e(nVar, "options");
        int b2 = N1.a.b(this, nVar, false);
        if (b2 == -1) {
            return -1;
        }
        G(nVar.f841a[b2].a());
        return b2;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        j1.h.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            q I2 = I(1);
            int min = Math.min(i, 8192 - I2.f851c);
            byteBuffer.get(I2.f849a, I2.f851c, min);
            i -= min;
            I2.f851c += min;
        }
        this.f827b += remaining;
        return remaining;
    }

    @Override // M1.h
    public final String y(Charset charset) {
        return F(this.f827b, charset);
    }

    public final byte[] z(long j) {
        int min;
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (this.f827b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            H1.l.h(i, i2, i3);
            q qVar = this.f826a;
            if (qVar == null) {
                min = -1;
            } else {
                min = Math.min(i3, qVar.f851c - qVar.f850b);
                int i4 = qVar.f850b;
                X0.j.m0(i2, i4, i4 + min, qVar.f849a, bArr);
                int i5 = qVar.f850b + min;
                qVar.f850b = i5;
                this.f827b -= min;
                if (i5 == qVar.f851c) {
                    this.f826a = qVar.a();
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
}
