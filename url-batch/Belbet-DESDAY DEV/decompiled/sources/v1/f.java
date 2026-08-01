package v1;

import X.V;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public q f4073a;

    /* renamed from: b, reason: collision with root package name */
    public long f4074b;

    @Override // v1.v
    public final x a() {
        return x.d;
    }

    @Override // v1.v
    public final long b(f fVar, long j2) {
        X0.d.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = this.f4074b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        fVar.c(this, j2);
        return j2;
    }

    @Override // v1.t
    public final void c(f fVar, long j2) {
        q b2;
        X0.d.e(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        i1.s.f(fVar.f4074b, 0L, j2);
        while (j2 > 0) {
            q qVar = fVar.f4073a;
            X0.d.b(qVar);
            int i = qVar.f4096c;
            q qVar2 = fVar.f4073a;
            X0.d.b(qVar2);
            long j3 = i - qVar2.f4095b;
            int i2 = 0;
            if (j2 < j3) {
                q qVar3 = this.f4073a;
                q qVar4 = qVar3 != null ? qVar3.f4099g : null;
                if (qVar4 != null && qVar4.f4097e) {
                    if ((qVar4.f4096c + j2) - (qVar4.d ? 0 : qVar4.f4095b) <= 8192) {
                        q qVar5 = fVar.f4073a;
                        X0.d.b(qVar5);
                        qVar5.d(qVar4, (int) j2);
                        fVar.f4074b -= j2;
                        this.f4074b += j2;
                        return;
                    }
                }
                q qVar6 = fVar.f4073a;
                X0.d.b(qVar6);
                int i3 = (int) j2;
                if (i3 <= 0 || i3 > qVar6.f4096c - qVar6.f4095b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    b2 = qVar6.c();
                } else {
                    b2 = r.b();
                    int i4 = qVar6.f4095b;
                    Q0.g.d0(0, i4, i4 + i3, qVar6.f4094a, b2.f4094a);
                }
                b2.f4096c = b2.f4095b + i3;
                qVar6.f4095b += i3;
                q qVar7 = qVar6.f4099g;
                X0.d.b(qVar7);
                qVar7.b(b2);
                fVar.f4073a = b2;
            }
            q qVar8 = fVar.f4073a;
            X0.d.b(qVar8);
            long j4 = qVar8.f4096c - qVar8.f4095b;
            fVar.f4073a = qVar8.a();
            q qVar9 = this.f4073a;
            if (qVar9 == null) {
                this.f4073a = qVar8;
                qVar8.f4099g = qVar8;
                qVar8.f4098f = qVar8;
            } else {
                q qVar10 = qVar9.f4099g;
                X0.d.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.f4099g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                X0.d.b(qVar11);
                if (qVar11.f4097e) {
                    int i5 = qVar8.f4096c - qVar8.f4095b;
                    q qVar12 = qVar8.f4099g;
                    X0.d.b(qVar12);
                    int i6 = 8192 - qVar12.f4096c;
                    q qVar13 = qVar8.f4099g;
                    X0.d.b(qVar13);
                    if (!qVar13.d) {
                        q qVar14 = qVar8.f4099g;
                        X0.d.b(qVar14);
                        i2 = qVar14.f4095b;
                    }
                    if (i5 <= i6 + i2) {
                        q qVar15 = qVar8.f4099g;
                        X0.d.b(qVar15);
                        qVar8.d(qVar15, i5);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            fVar.f4074b -= j4;
            this.f4074b += j4;
            j2 -= j4;
        }
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f4074b != 0) {
            q qVar = this.f4073a;
            X0.d.b(qVar);
            q c2 = qVar.c();
            fVar.f4073a = c2;
            c2.f4099g = c2;
            c2.f4098f = c2;
            for (q qVar2 = qVar.f4098f; qVar2 != qVar; qVar2 = qVar2.f4098f) {
                q qVar3 = c2.f4099g;
                X0.d.b(qVar3);
                X0.d.b(qVar2);
                qVar3.b(qVar2.c());
            }
            fVar.f4074b = this.f4074b;
        }
        return fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, v1.t
    public final void close() {
    }

    @Override // v1.g
    public final /* bridge */ /* synthetic */ g d(String str) {
        v(str);
        return this;
    }

    public final boolean e() {
        return this.f4074b == 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                long j2 = this.f4074b;
                f fVar = (f) obj;
                if (j2 == fVar.f4074b) {
                    if (j2 != 0) {
                        q qVar = this.f4073a;
                        X0.d.b(qVar);
                        q qVar2 = fVar.f4073a;
                        X0.d.b(qVar2);
                        int i = qVar.f4095b;
                        int i2 = qVar2.f4095b;
                        long j3 = 0;
                        while (j3 < this.f4074b) {
                            long min = Math.min(qVar.f4096c - i, qVar2.f4096c - i2);
                            long j4 = 0;
                            while (j4 < min) {
                                int i3 = i + 1;
                                byte b2 = qVar.f4094a[i];
                                int i4 = i2 + 1;
                                if (b2 == qVar2.f4094a[i2]) {
                                    j4++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == qVar.f4096c) {
                                q qVar3 = qVar.f4098f;
                                X0.d.b(qVar3);
                                i = qVar3.f4095b;
                                qVar = qVar3;
                            }
                            if (i2 == qVar2.f4096c) {
                                qVar2 = qVar2.f4098f;
                                X0.d.b(qVar2);
                                i2 = qVar2.f4095b;
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

    public final byte f(long j2) {
        i1.s.f(this.f4074b, j2, 1L);
        q qVar = this.f4073a;
        if (qVar == null) {
            X0.d.b(null);
            throw null;
        }
        long j3 = this.f4074b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                qVar = qVar.f4099g;
                X0.d.b(qVar);
                j3 -= qVar.f4096c - qVar.f4095b;
            }
            return qVar.f4094a[(int) ((qVar.f4095b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i = qVar.f4096c;
            int i2 = qVar.f4095b;
            long j5 = (i - i2) + j4;
            if (j5 > j2) {
                return qVar.f4094a[(int) ((i2 + j2) - j4)];
            }
            qVar = qVar.f4098f;
            X0.d.b(qVar);
            j4 = j5;
        }
    }

    @Override // v1.t, java.io.Flushable
    public final void flush() {
    }

    public final byte g() {
        if (this.f4074b == 0) {
            throw new EOFException();
        }
        q qVar = this.f4073a;
        X0.d.b(qVar);
        int i = qVar.f4095b;
        int i2 = qVar.f4096c;
        int i3 = i + 1;
        byte b2 = qVar.f4094a[i];
        this.f4074b--;
        if (i3 == i2) {
            this.f4073a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f4095b = i3;
        }
        return b2;
    }

    public final byte[] h(long j2) {
        int min;
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f4074b < j2) {
            throw new EOFException();
        }
        int i = (int) j2;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            i1.s.f(i, i2, i3);
            q qVar = this.f4073a;
            if (qVar == null) {
                min = -1;
            } else {
                min = Math.min(i3, qVar.f4096c - qVar.f4095b);
                int i4 = qVar.f4095b;
                Q0.g.d0(i2, i4, i4 + min, qVar.f4094a, bArr);
                int i5 = qVar.f4095b + min;
                qVar.f4095b = i5;
                this.f4074b -= min;
                if (i5 == qVar.f4096c) {
                    this.f4073a = qVar.a();
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

    public final int hashCode() {
        q qVar = this.f4073a;
        if (qVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = qVar.f4096c;
            for (int i3 = qVar.f4095b; i3 < i2; i3++) {
                i = (i * 31) + qVar.f4094a[i3];
            }
            qVar = qVar.f4098f;
            X0.d.b(qVar);
        } while (qVar != this.f4073a);
        return i;
    }

    public final i i(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f4074b < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new i(h(j2));
        }
        i n2 = n((int) j2);
        m(j2);
        return n2;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final int j() {
        if (this.f4074b < 4) {
            throw new EOFException();
        }
        q qVar = this.f4073a;
        X0.d.b(qVar);
        int i = qVar.f4095b;
        int i2 = qVar.f4096c;
        if (i2 - i < 4) {
            return ((g() & 255) << 24) | ((g() & 255) << 16) | ((g() & 255) << 8) | (g() & 255);
        }
        byte[] bArr = qVar.f4094a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.f4074b -= 4;
        if (i5 == i2) {
            this.f4073a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f4095b = i5;
        }
        return i6;
    }

    public final short k() {
        if (this.f4074b < 2) {
            throw new EOFException();
        }
        q qVar = this.f4073a;
        X0.d.b(qVar);
        int i = qVar.f4095b;
        int i2 = qVar.f4096c;
        if (i2 - i < 2) {
            return (short) (((g() & 255) << 8) | (g() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = qVar.f4094a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f4074b -= 2;
        if (i5 == i2) {
            this.f4073a = qVar.a();
            r.a(qVar);
        } else {
            qVar.f4095b = i5;
        }
        return (short) i6;
    }

    public final String l(long j2, Charset charset) {
        X0.d.e(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f4074b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        q qVar = this.f4073a;
        X0.d.b(qVar);
        int i = qVar.f4095b;
        if (i + j2 > qVar.f4096c) {
            return new String(h(j2), charset);
        }
        int i2 = (int) j2;
        String str = new String(qVar.f4094a, i, i2, charset);
        int i3 = qVar.f4095b + i2;
        qVar.f4095b = i3;
        this.f4074b -= j2;
        if (i3 == qVar.f4096c) {
            this.f4073a = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    public final void m(long j2) {
        while (j2 > 0) {
            q qVar = this.f4073a;
            if (qVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, qVar.f4096c - qVar.f4095b);
            long j3 = min;
            this.f4074b -= j3;
            j2 -= j3;
            int i = qVar.f4095b + min;
            qVar.f4095b = i;
            if (i == qVar.f4096c) {
                this.f4073a = qVar.a();
                r.a(qVar);
            }
        }
    }

    public final i n(int i) {
        if (i == 0) {
            return i.d;
        }
        i1.s.f(this.f4074b, 0L, i);
        q qVar = this.f4073a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            X0.d.b(qVar);
            int i5 = qVar.f4096c;
            int i6 = qVar.f4095b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            qVar = qVar.f4098f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        q qVar2 = this.f4073a;
        int i7 = 0;
        while (i2 < i) {
            X0.d.b(qVar2);
            bArr[i7] = qVar2.f4094a;
            i2 += qVar2.f4096c - qVar2.f4095b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = qVar2.f4095b;
            qVar2.d = true;
            i7++;
            qVar2 = qVar2.f4098f;
        }
        return new s(bArr, iArr);
    }

    public final q o(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f4073a;
        if (qVar == null) {
            q b2 = r.b();
            this.f4073a = b2;
            b2.f4099g = b2;
            b2.f4098f = b2;
            return b2;
        }
        q qVar2 = qVar.f4099g;
        X0.d.b(qVar2);
        if (qVar2.f4096c + i <= 8192 && qVar2.f4097e) {
            return qVar2;
        }
        q b3 = r.b();
        qVar2.b(b3);
        return b3;
    }

    public final void p(int i, int i2, byte[] bArr) {
        X0.d.e(bArr, "source");
        long j2 = i2;
        i1.s.f(bArr.length, i, j2);
        int i3 = i2 + i;
        while (i < i3) {
            q o2 = o(1);
            int min = Math.min(i3 - i, 8192 - o2.f4096c);
            int i4 = i + min;
            Q0.g.d0(o2.f4096c, i, i4, bArr, o2.f4094a);
            o2.f4096c += min;
            i = i4;
        }
        this.f4074b += j2;
    }

    public final void q(i iVar) {
        X0.d.e(iVar, "byteString");
        iVar.i(this, iVar.a());
    }

    public final void r(v vVar) {
        while (vVar.b(this, 8192L) != -1) {
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        X0.d.e(byteBuffer, "sink");
        q qVar = this.f4073a;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f4096c - qVar.f4095b);
        byteBuffer.put(qVar.f4094a, qVar.f4095b, min);
        int i = qVar.f4095b + min;
        qVar.f4095b = i;
        this.f4074b -= min;
        if (i == qVar.f4096c) {
            this.f4073a = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    public final void s(int i) {
        q o2 = o(1);
        int i2 = o2.f4096c;
        o2.f4096c = i2 + 1;
        o2.f4094a[i2] = (byte) i;
        this.f4074b++;
    }

    public final void t(long j2) {
        if (j2 == 0) {
            s(48);
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
        q o2 = o(i);
        int i2 = o2.f4096c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            o2.f4094a[i3] = w1.a.f4172a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        o2.f4096c += i;
        this.f4074b += i;
    }

    public final String toString() {
        long j2 = this.f4074b;
        if (j2 <= 2147483647L) {
            return n((int) j2).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f4074b).toString());
    }

    public final void u(int i) {
        q o2 = o(4);
        int i2 = o2.f4096c;
        byte[] bArr = o2.f4094a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        o2.f4096c = i2 + 4;
        this.f4074b += 4;
    }

    public final void v(String str) {
        X0.d.e(str, "string");
        w(str, 0, str.length());
    }

    public final void w(String str, int i, int i2) {
        char charAt;
        X0.d.e(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(V.d("beginIndex < 0: ", i).toString());
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
                q o2 = o(1);
                int i3 = o2.f4096c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = o2.f4094a;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = o2.f4096c;
                int i6 = (i3 + i) - i5;
                o2.f4096c = i5 + i6;
                this.f4074b += i6;
            } else {
                if (charAt2 < 2048) {
                    q o3 = o(2);
                    int i7 = o3.f4096c;
                    byte[] bArr2 = o3.f4094a;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    o3.f4096c = i7 + 2;
                    this.f4074b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    q o4 = o(3);
                    int i8 = o4.f4096c;
                    byte[] bArr3 = o4.f4094a;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    o4.f4096c = i8 + 3;
                    this.f4074b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        s(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        q o5 = o(4);
                        int i11 = o5.f4096c;
                        byte[] bArr4 = o5.f4094a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        o5.f4096c = i11 + 4;
                        this.f4074b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        X0.d.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            q o2 = o(1);
            int min = Math.min(i, 8192 - o2.f4096c);
            byteBuffer.get(o2.f4094a, o2.f4096c, min);
            i -= min;
            o2.f4096c += min;
        }
        this.f4074b += remaining;
        return remaining;
    }

    public final void x(int i) {
        String str;
        int i2 = 0;
        if (i < 128) {
            s(i);
            return;
        }
        if (i < 2048) {
            q o2 = o(2);
            int i3 = o2.f4096c;
            byte[] bArr = o2.f4094a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            o2.f4096c = i3 + 2;
            this.f4074b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            s(63);
            return;
        }
        if (i < 65536) {
            q o3 = o(3);
            int i4 = o3.f4096c;
            byte[] bArr2 = o3.f4094a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            o3.f4096c = i4 + 3;
            this.f4074b += 3;
            return;
        }
        if (i <= 1114111) {
            q o4 = o(4);
            int i5 = o4.f4096c;
            byte[] bArr3 = o4.f4094a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            o4.f4096c = i5 + 4;
            this.f4074b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = w1.b.f4173a;
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
