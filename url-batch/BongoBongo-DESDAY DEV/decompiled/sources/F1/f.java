package F1;

import Z.V;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public q f246a;

    /* renamed from: b, reason: collision with root package name */
    public long f247b;

    @Override // F1.v
    public final x a() {
        return x.d;
    }

    @Override // F1.t
    public final void b(f fVar, long j2) {
        q b2;
        h1.d.e(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        A1.d.k(fVar.f247b, 0L, j2);
        while (j2 > 0) {
            q qVar = fVar.f246a;
            h1.d.b(qVar);
            int i = qVar.f270c;
            q qVar2 = fVar.f246a;
            h1.d.b(qVar2);
            long j3 = i - qVar2.f269b;
            int i2 = 0;
            if (j2 < j3) {
                q qVar3 = this.f246a;
                q qVar4 = qVar3 != null ? qVar3.f273g : null;
                if (qVar4 != null && qVar4.f271e) {
                    if ((qVar4.f270c + j2) - (qVar4.d ? 0 : qVar4.f269b) <= 8192) {
                        q qVar5 = fVar.f246a;
                        h1.d.b(qVar5);
                        qVar5.d(qVar4, (int) j2);
                        fVar.f247b -= j2;
                        this.f247b += j2;
                        return;
                    }
                }
                q qVar6 = fVar.f246a;
                h1.d.b(qVar6);
                int i3 = (int) j2;
                if (i3 <= 0 || i3 > qVar6.f270c - qVar6.f269b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    b2 = qVar6.c();
                } else {
                    b2 = r.b();
                    int i4 = qVar6.f269b;
                    W0.f.q0(0, i4, i4 + i3, qVar6.f268a, b2.f268a);
                }
                b2.f270c = b2.f269b + i3;
                qVar6.f269b += i3;
                q qVar7 = qVar6.f273g;
                h1.d.b(qVar7);
                qVar7.b(b2);
                fVar.f246a = b2;
            }
            q qVar8 = fVar.f246a;
            h1.d.b(qVar8);
            long j4 = qVar8.f270c - qVar8.f269b;
            fVar.f246a = qVar8.a();
            q qVar9 = this.f246a;
            if (qVar9 == null) {
                this.f246a = qVar8;
                qVar8.f273g = qVar8;
                qVar8.f272f = qVar8;
            } else {
                q qVar10 = qVar9.f273g;
                h1.d.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.f273g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                h1.d.b(qVar11);
                if (qVar11.f271e) {
                    int i5 = qVar8.f270c - qVar8.f269b;
                    q qVar12 = qVar8.f273g;
                    h1.d.b(qVar12);
                    int i6 = 8192 - qVar12.f270c;
                    q qVar13 = qVar8.f273g;
                    h1.d.b(qVar13);
                    if (!qVar13.d) {
                        q qVar14 = qVar8.f273g;
                        h1.d.b(qVar14);
                        i2 = qVar14.f269b;
                    }
                    if (i5 <= i6 + i2) {
                        q qVar15 = qVar8.f273g;
                        h1.d.b(qVar15);
                        qVar8.d(qVar15, i5);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            fVar.f247b -= j4;
            this.f247b += j4;
            j2 -= j4;
        }
    }

    @Override // F1.h
    public final int c(n nVar) {
        h1.d.e(nVar, "options");
        int b2 = G1.a.b(this, nVar, false);
        if (b2 == -1) {
            return -1;
        }
        o(nVar.f260a[b2].a());
        return b2;
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f247b != 0) {
            q qVar = this.f246a;
            h1.d.b(qVar);
            q c2 = qVar.c();
            fVar.f246a = c2;
            c2.f273g = c2;
            c2.f272f = c2;
            for (q qVar2 = qVar.f272f; qVar2 != qVar; qVar2 = qVar2.f272f) {
                q qVar3 = c2.f273g;
                h1.d.b(qVar3);
                h1.d.b(qVar2);
                qVar3.b(qVar2.c());
            }
            fVar.f247b = this.f247b;
        }
        return fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, F1.t
    public final void close() {
    }

    @Override // F1.v
    public final long d(f fVar, long j2) {
        h1.d.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = this.f247b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        fVar.b(this, j2);
        return j2;
    }

    @Override // F1.g
    public final /* bridge */ /* synthetic */ g e(String str) {
        x(str);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                long j2 = this.f247b;
                f fVar = (f) obj;
                if (j2 == fVar.f247b) {
                    if (j2 != 0) {
                        q qVar = this.f246a;
                        h1.d.b(qVar);
                        q qVar2 = fVar.f246a;
                        h1.d.b(qVar2);
                        int i = qVar.f269b;
                        int i2 = qVar2.f269b;
                        long j3 = 0;
                        while (j3 < this.f247b) {
                            long min = Math.min(qVar.f270c - i, qVar2.f270c - i2);
                            long j4 = 0;
                            while (j4 < min) {
                                int i3 = i + 1;
                                byte b2 = qVar.f268a[i];
                                int i4 = i2 + 1;
                                if (b2 == qVar2.f268a[i2]) {
                                    j4++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == qVar.f270c) {
                                q qVar3 = qVar.f272f;
                                h1.d.b(qVar3);
                                i = qVar3.f269b;
                                qVar = qVar3;
                            }
                            if (i2 == qVar2.f270c) {
                                qVar2 = qVar2.f272f;
                                h1.d.b(qVar2);
                                i2 = qVar2.f269b;
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

    @Override // F1.h
    public final String f(Charset charset) {
        return n(this.f247b, charset);
    }

    @Override // F1.t, java.io.Flushable
    public final void flush() {
    }

    public final boolean g() {
        return this.f247b == 0;
    }

    public final byte h(long j2) {
        A1.d.k(this.f247b, j2, 1L);
        q qVar = this.f246a;
        if (qVar == null) {
            h1.d.b(null);
            throw null;
        }
        long j3 = this.f247b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                qVar = qVar.f273g;
                h1.d.b(qVar);
                j3 -= qVar.f270c - qVar.f269b;
            }
            return qVar.f268a[(int) ((qVar.f269b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i = qVar.f270c;
            int i2 = qVar.f269b;
            long j5 = (i - i2) + j4;
            if (j5 > j2) {
                return qVar.f268a[(int) ((i2 + j2) - j4)];
            }
            qVar = qVar.f272f;
            h1.d.b(qVar);
            j4 = j5;
        }
    }

    public final int hashCode() {
        q qVar = this.f246a;
        if (qVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = qVar.f270c;
            for (int i3 = qVar.f269b; i3 < i2; i3++) {
                i = (i * 31) + qVar.f268a[i3];
            }
            qVar = qVar.f272f;
            h1.d.b(qVar);
        } while (qVar != this.f246a);
        return i;
    }

    public final byte i() {
        if (this.f247b == 0) {
            throw new EOFException();
        }
        q qVar = this.f246a;
        h1.d.b(qVar);
        int i = qVar.f269b;
        int i2 = qVar.f270c;
        int i3 = i + 1;
        byte b2 = qVar.f268a[i];
        this.f247b--;
        if (i3 == i2) {
            this.f246a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f269b = i3;
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
        if (this.f247b < j2) {
            throw new EOFException();
        }
        int i = (int) j2;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            A1.d.k(i, i2, i3);
            q qVar = this.f246a;
            if (qVar == null) {
                min = -1;
            } else {
                min = Math.min(i3, qVar.f270c - qVar.f269b);
                int i4 = qVar.f269b;
                W0.f.q0(i2, i4, i4 + min, qVar.f268a, bArr);
                int i5 = qVar.f269b + min;
                qVar.f269b = i5;
                this.f247b -= min;
                if (i5 == qVar.f270c) {
                    this.f246a = qVar.a();
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
        if (this.f247b < j2) {
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
        if (this.f247b < 4) {
            throw new EOFException();
        }
        q qVar = this.f246a;
        h1.d.b(qVar);
        int i = qVar.f269b;
        int i2 = qVar.f270c;
        if (i2 - i < 4) {
            return ((i() & 255) << 24) | ((i() & 255) << 16) | ((i() & 255) << 8) | (i() & 255);
        }
        byte[] bArr = qVar.f268a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.f247b -= 4;
        if (i5 == i2) {
            this.f246a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f269b = i5;
        }
        return i6;
    }

    public final short m() {
        if (this.f247b < 2) {
            throw new EOFException();
        }
        q qVar = this.f246a;
        h1.d.b(qVar);
        int i = qVar.f269b;
        int i2 = qVar.f270c;
        if (i2 - i < 2) {
            return (short) (((i() & 255) << 8) | (i() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = qVar.f268a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f247b -= 2;
        if (i5 == i2) {
            this.f246a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f269b = i5;
        }
        return (short) i6;
    }

    public final String n(long j2, Charset charset) {
        h1.d.e(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f247b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        q qVar = this.f246a;
        h1.d.b(qVar);
        int i = qVar.f269b;
        if (i + j2 > qVar.f270c) {
            return new String(j(j2), charset);
        }
        int i2 = (int) j2;
        String str = new String(qVar.f268a, i, i2, charset);
        int i3 = qVar.f269b + i2;
        qVar.f269b = i3;
        this.f247b -= j2;
        if (i3 == qVar.f270c) {
            this.f246a = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    public final void o(long j2) {
        while (j2 > 0) {
            q qVar = this.f246a;
            if (qVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, qVar.f270c - qVar.f269b);
            long j3 = min;
            this.f247b -= j3;
            j2 -= j3;
            int i = qVar.f269b + min;
            qVar.f269b = i;
            if (i == qVar.f270c) {
                this.f246a = qVar.a();
                r.a(qVar);
            }
        }
    }

    public final i p(int i) {
        if (i == 0) {
            return i.d;
        }
        A1.d.k(this.f247b, 0L, i);
        q qVar = this.f246a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            h1.d.b(qVar);
            int i5 = qVar.f270c;
            int i6 = qVar.f269b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            qVar = qVar.f272f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        q qVar2 = this.f246a;
        int i7 = 0;
        while (i2 < i) {
            h1.d.b(qVar2);
            bArr[i7] = qVar2.f268a;
            i2 += qVar2.f270c - qVar2.f269b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = qVar2.f269b;
            qVar2.d = true;
            i7++;
            qVar2 = qVar2.f272f;
        }
        return new s(bArr, iArr);
    }

    public final q q(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f246a;
        if (qVar == null) {
            q b2 = r.b();
            this.f246a = b2;
            b2.f273g = b2;
            b2.f272f = b2;
            return b2;
        }
        q qVar2 = qVar.f273g;
        h1.d.b(qVar2);
        if (qVar2.f270c + i <= 8192 && qVar2.f271e) {
            return qVar2;
        }
        q b3 = r.b();
        qVar2.b(b3);
        return b3;
    }

    public final void r(int i, int i2, byte[] bArr) {
        h1.d.e(bArr, "source");
        long j2 = i2;
        A1.d.k(bArr.length, i, j2);
        int i3 = i2 + i;
        while (i < i3) {
            q q2 = q(1);
            int min = Math.min(i3 - i, 8192 - q2.f270c);
            int i4 = i + min;
            W0.f.q0(q2.f270c, i, i4, bArr, q2.f268a);
            q2.f270c += min;
            i = i4;
        }
        this.f247b += j2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        h1.d.e(byteBuffer, "sink");
        q qVar = this.f246a;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f270c - qVar.f269b);
        byteBuffer.put(qVar.f268a, qVar.f269b, min);
        int i = qVar.f269b + min;
        qVar.f269b = i;
        this.f247b -= min;
        if (i == qVar.f270c) {
            this.f246a = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    public final void s(i iVar) {
        h1.d.e(iVar, "byteString");
        iVar.i(this, iVar.a());
    }

    public final void t(v vVar) {
        h1.d.e(vVar, "source");
        while (vVar.d(this, 8192L) != -1) {
        }
    }

    public final String toString() {
        long j2 = this.f247b;
        if (j2 <= 2147483647L) {
            return p((int) j2).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f247b).toString());
    }

    public final void u(int i) {
        q q2 = q(1);
        int i2 = q2.f270c;
        q2.f270c = i2 + 1;
        q2.f268a[i2] = (byte) i;
        this.f247b++;
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
        int i2 = q2.f270c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            q2.f268a[i3] = G1.a.f286a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        q2.f270c += i;
        this.f247b += i;
    }

    public final void w(int i) {
        q q2 = q(4);
        int i2 = q2.f270c;
        byte[] bArr = q2.f268a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        q2.f270c = i2 + 4;
        this.f247b += 4;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        h1.d.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            q q2 = q(1);
            int min = Math.min(i, 8192 - q2.f270c);
            byteBuffer.get(q2.f268a, q2.f270c, min);
            i -= min;
            q2.f270c += min;
        }
        this.f247b += remaining;
        return remaining;
    }

    public final void x(String str) {
        h1.d.e(str, "string");
        y(str, 0, str.length());
    }

    public final void y(String str, int i, int i2) {
        char charAt;
        h1.d.e(str, "string");
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
                int i3 = q2.f270c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = q2.f268a;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = q2.f270c;
                int i6 = (i3 + i) - i5;
                q2.f270c = i5 + i6;
                this.f247b += i6;
            } else {
                if (charAt2 < 2048) {
                    q q3 = q(2);
                    int i7 = q3.f270c;
                    byte[] bArr2 = q3.f268a;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    q3.f270c = i7 + 2;
                    this.f247b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    q q4 = q(3);
                    int i8 = q4.f270c;
                    byte[] bArr3 = q4.f268a;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    q4.f270c = i8 + 3;
                    this.f247b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        u(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        q q5 = q(4);
                        int i11 = q5.f270c;
                        byte[] bArr4 = q5.f268a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        q5.f270c = i11 + 4;
                        this.f247b += 4;
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
            int i3 = q2.f270c;
            byte[] bArr = q2.f268a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            q2.f270c = i3 + 2;
            this.f247b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            u(63);
            return;
        }
        if (i < 65536) {
            q q3 = q(3);
            int i4 = q3.f270c;
            byte[] bArr2 = q3.f268a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            q3.f270c = i4 + 3;
            this.f247b += 3;
            return;
        }
        if (i <= 1114111) {
            q q4 = q(4);
            int i5 = q4.f270c;
            byte[] bArr3 = q4.f268a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            q4.f270c = i5 + 4;
            this.f247b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = G1.b.f287a;
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
