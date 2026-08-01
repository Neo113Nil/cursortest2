package v1;

import X.V;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public p f4050a;

    /* renamed from: b, reason: collision with root package name */
    public long f4051b;

    @Override // v1.u
    public final w a() {
        return w.d;
    }

    @Override // v1.u
    public final long b(f fVar, long j2) {
        X0.e.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = this.f4051b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        fVar.c(this, j2);
        return j2;
    }

    @Override // v1.s
    public final void c(f fVar, long j2) {
        p b2;
        X0.e.e(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        i1.r.f(fVar.f4051b, 0L, j2);
        while (j2 > 0) {
            p pVar = fVar.f4050a;
            X0.e.b(pVar);
            int i = pVar.f4072c;
            p pVar2 = fVar.f4050a;
            X0.e.b(pVar2);
            long j3 = i - pVar2.f4071b;
            int i2 = 0;
            if (j2 < j3) {
                p pVar3 = this.f4050a;
                p pVar4 = pVar3 != null ? pVar3.f4075g : null;
                if (pVar4 != null && pVar4.f4073e) {
                    if ((pVar4.f4072c + j2) - (pVar4.d ? 0 : pVar4.f4071b) <= 8192) {
                        p pVar5 = fVar.f4050a;
                        X0.e.b(pVar5);
                        pVar5.d(pVar4, (int) j2);
                        fVar.f4051b -= j2;
                        this.f4051b += j2;
                        return;
                    }
                }
                p pVar6 = fVar.f4050a;
                X0.e.b(pVar6);
                int i3 = (int) j2;
                if (i3 <= 0 || i3 > pVar6.f4072c - pVar6.f4071b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    b2 = pVar6.c();
                } else {
                    b2 = q.b();
                    int i4 = pVar6.f4071b;
                    Q0.c.d0(0, i4, i4 + i3, pVar6.f4070a, b2.f4070a);
                }
                b2.f4072c = b2.f4071b + i3;
                pVar6.f4071b += i3;
                p pVar7 = pVar6.f4075g;
                X0.e.b(pVar7);
                pVar7.b(b2);
                fVar.f4050a = b2;
            }
            p pVar8 = fVar.f4050a;
            X0.e.b(pVar8);
            long j4 = pVar8.f4072c - pVar8.f4071b;
            fVar.f4050a = pVar8.a();
            p pVar9 = this.f4050a;
            if (pVar9 == null) {
                this.f4050a = pVar8;
                pVar8.f4075g = pVar8;
                pVar8.f4074f = pVar8;
            } else {
                p pVar10 = pVar9.f4075g;
                X0.e.b(pVar10);
                pVar10.b(pVar8);
                p pVar11 = pVar8.f4075g;
                if (pVar11 == pVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                X0.e.b(pVar11);
                if (pVar11.f4073e) {
                    int i5 = pVar8.f4072c - pVar8.f4071b;
                    p pVar12 = pVar8.f4075g;
                    X0.e.b(pVar12);
                    int i6 = 8192 - pVar12.f4072c;
                    p pVar13 = pVar8.f4075g;
                    X0.e.b(pVar13);
                    if (!pVar13.d) {
                        p pVar14 = pVar8.f4075g;
                        X0.e.b(pVar14);
                        i2 = pVar14.f4071b;
                    }
                    if (i5 <= i6 + i2) {
                        p pVar15 = pVar8.f4075g;
                        X0.e.b(pVar15);
                        pVar8.d(pVar15, i5);
                        pVar8.a();
                        q.a(pVar8);
                    }
                }
            }
            fVar.f4051b -= j4;
            this.f4051b += j4;
            j2 -= j4;
        }
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f4051b != 0) {
            p pVar = this.f4050a;
            X0.e.b(pVar);
            p c2 = pVar.c();
            fVar.f4050a = c2;
            c2.f4075g = c2;
            c2.f4074f = c2;
            for (p pVar2 = pVar.f4074f; pVar2 != pVar; pVar2 = pVar2.f4074f) {
                p pVar3 = c2.f4075g;
                X0.e.b(pVar3);
                X0.e.b(pVar2);
                pVar3.b(pVar2.c());
            }
            fVar.f4051b = this.f4051b;
        }
        return fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, v1.s
    public final void close() {
    }

    @Override // v1.g
    public final /* bridge */ /* synthetic */ g d(String str) {
        v(str);
        return this;
    }

    public final boolean e() {
        return this.f4051b == 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                long j2 = this.f4051b;
                f fVar = (f) obj;
                if (j2 == fVar.f4051b) {
                    if (j2 != 0) {
                        p pVar = this.f4050a;
                        X0.e.b(pVar);
                        p pVar2 = fVar.f4050a;
                        X0.e.b(pVar2);
                        int i = pVar.f4071b;
                        int i2 = pVar2.f4071b;
                        long j3 = 0;
                        while (j3 < this.f4051b) {
                            long min = Math.min(pVar.f4072c - i, pVar2.f4072c - i2);
                            long j4 = 0;
                            while (j4 < min) {
                                int i3 = i + 1;
                                byte b2 = pVar.f4070a[i];
                                int i4 = i2 + 1;
                                if (b2 == pVar2.f4070a[i2]) {
                                    j4++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == pVar.f4072c) {
                                p pVar3 = pVar.f4074f;
                                X0.e.b(pVar3);
                                i = pVar3.f4071b;
                                pVar = pVar3;
                            }
                            if (i2 == pVar2.f4072c) {
                                pVar2 = pVar2.f4074f;
                                X0.e.b(pVar2);
                                i2 = pVar2.f4071b;
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
        i1.r.f(this.f4051b, j2, 1L);
        p pVar = this.f4050a;
        if (pVar == null) {
            X0.e.b(null);
            throw null;
        }
        long j3 = this.f4051b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                pVar = pVar.f4075g;
                X0.e.b(pVar);
                j3 -= pVar.f4072c - pVar.f4071b;
            }
            return pVar.f4070a[(int) ((pVar.f4071b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i = pVar.f4072c;
            int i2 = pVar.f4071b;
            long j5 = (i - i2) + j4;
            if (j5 > j2) {
                return pVar.f4070a[(int) ((i2 + j2) - j4)];
            }
            pVar = pVar.f4074f;
            X0.e.b(pVar);
            j4 = j5;
        }
    }

    @Override // v1.s, java.io.Flushable
    public final void flush() {
    }

    public final byte g() {
        if (this.f4051b == 0) {
            throw new EOFException();
        }
        p pVar = this.f4050a;
        X0.e.b(pVar);
        int i = pVar.f4071b;
        int i2 = pVar.f4072c;
        int i3 = i + 1;
        byte b2 = pVar.f4070a[i];
        this.f4051b--;
        if (i3 == i2) {
            this.f4050a = pVar.a();
            q.a(pVar);
        } else {
            pVar.f4071b = i3;
        }
        return b2;
    }

    public final byte[] h(long j2) {
        int min;
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f4051b < j2) {
            throw new EOFException();
        }
        int i = (int) j2;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            i1.r.f(i, i2, i3);
            p pVar = this.f4050a;
            if (pVar == null) {
                min = -1;
            } else {
                min = Math.min(i3, pVar.f4072c - pVar.f4071b);
                int i4 = pVar.f4071b;
                Q0.c.d0(i2, i4, i4 + min, pVar.f4070a, bArr);
                int i5 = pVar.f4071b + min;
                pVar.f4071b = i5;
                this.f4051b -= min;
                if (i5 == pVar.f4072c) {
                    this.f4050a = pVar.a();
                    q.a(pVar);
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
        p pVar = this.f4050a;
        if (pVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = pVar.f4072c;
            for (int i3 = pVar.f4071b; i3 < i2; i3++) {
                i = (i * 31) + pVar.f4070a[i3];
            }
            pVar = pVar.f4074f;
            X0.e.b(pVar);
        } while (pVar != this.f4050a);
        return i;
    }

    public final i i(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f4051b < j2) {
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
        if (this.f4051b < 4) {
            throw new EOFException();
        }
        p pVar = this.f4050a;
        X0.e.b(pVar);
        int i = pVar.f4071b;
        int i2 = pVar.f4072c;
        if (i2 - i < 4) {
            return ((g() & 255) << 24) | ((g() & 255) << 16) | ((g() & 255) << 8) | (g() & 255);
        }
        byte[] bArr = pVar.f4070a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.f4051b -= 4;
        if (i5 == i2) {
            this.f4050a = pVar.a();
            q.a(pVar);
        } else {
            pVar.f4071b = i5;
        }
        return i6;
    }

    public final short k() {
        if (this.f4051b < 2) {
            throw new EOFException();
        }
        p pVar = this.f4050a;
        X0.e.b(pVar);
        int i = pVar.f4071b;
        int i2 = pVar.f4072c;
        if (i2 - i < 2) {
            return (short) (((g() & 255) << 8) | (g() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = pVar.f4070a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f4051b -= 2;
        if (i5 == i2) {
            this.f4050a = pVar.a();
            q.a(pVar);
        } else {
            pVar.f4071b = i5;
        }
        return (short) i6;
    }

    public final String l(long j2, Charset charset) {
        X0.e.e(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f4051b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        p pVar = this.f4050a;
        X0.e.b(pVar);
        int i = pVar.f4071b;
        if (i + j2 > pVar.f4072c) {
            return new String(h(j2), charset);
        }
        int i2 = (int) j2;
        String str = new String(pVar.f4070a, i, i2, charset);
        int i3 = pVar.f4071b + i2;
        pVar.f4071b = i3;
        this.f4051b -= j2;
        if (i3 == pVar.f4072c) {
            this.f4050a = pVar.a();
            q.a(pVar);
        }
        return str;
    }

    public final void m(long j2) {
        while (j2 > 0) {
            p pVar = this.f4050a;
            if (pVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, pVar.f4072c - pVar.f4071b);
            long j3 = min;
            this.f4051b -= j3;
            j2 -= j3;
            int i = pVar.f4071b + min;
            pVar.f4071b = i;
            if (i == pVar.f4072c) {
                this.f4050a = pVar.a();
                q.a(pVar);
            }
        }
    }

    public final i n(int i) {
        if (i == 0) {
            return i.d;
        }
        i1.r.f(this.f4051b, 0L, i);
        p pVar = this.f4050a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            X0.e.b(pVar);
            int i5 = pVar.f4072c;
            int i6 = pVar.f4071b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            pVar = pVar.f4074f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        p pVar2 = this.f4050a;
        int i7 = 0;
        while (i2 < i) {
            X0.e.b(pVar2);
            bArr[i7] = pVar2.f4070a;
            i2 += pVar2.f4072c - pVar2.f4071b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = pVar2.f4071b;
            pVar2.d = true;
            i7++;
            pVar2 = pVar2.f4074f;
        }
        return new r(bArr, iArr);
    }

    public final p o(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        p pVar = this.f4050a;
        if (pVar == null) {
            p b2 = q.b();
            this.f4050a = b2;
            b2.f4075g = b2;
            b2.f4074f = b2;
            return b2;
        }
        p pVar2 = pVar.f4075g;
        X0.e.b(pVar2);
        if (pVar2.f4072c + i <= 8192 && pVar2.f4073e) {
            return pVar2;
        }
        p b3 = q.b();
        pVar2.b(b3);
        return b3;
    }

    public final void p(int i, int i2, byte[] bArr) {
        X0.e.e(bArr, "source");
        long j2 = i2;
        i1.r.f(bArr.length, i, j2);
        int i3 = i2 + i;
        while (i < i3) {
            p o2 = o(1);
            int min = Math.min(i3 - i, 8192 - o2.f4072c);
            int i4 = i + min;
            Q0.c.d0(o2.f4072c, i, i4, bArr, o2.f4070a);
            o2.f4072c += min;
            i = i4;
        }
        this.f4051b += j2;
    }

    public final void q(i iVar) {
        X0.e.e(iVar, "byteString");
        iVar.i(this, iVar.a());
    }

    public final void r(u uVar) {
        while (uVar.b(this, 8192L) != -1) {
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        X0.e.e(byteBuffer, "sink");
        p pVar = this.f4050a;
        if (pVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), pVar.f4072c - pVar.f4071b);
        byteBuffer.put(pVar.f4070a, pVar.f4071b, min);
        int i = pVar.f4071b + min;
        pVar.f4071b = i;
        this.f4051b -= min;
        if (i == pVar.f4072c) {
            this.f4050a = pVar.a();
            q.a(pVar);
        }
        return min;
    }

    public final void s(int i) {
        p o2 = o(1);
        int i2 = o2.f4072c;
        o2.f4072c = i2 + 1;
        o2.f4070a[i2] = (byte) i;
        this.f4051b++;
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
        p o2 = o(i);
        int i2 = o2.f4072c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            o2.f4070a[i3] = w1.a.f4148a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        o2.f4072c += i;
        this.f4051b += i;
    }

    public final String toString() {
        long j2 = this.f4051b;
        if (j2 <= 2147483647L) {
            return n((int) j2).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f4051b).toString());
    }

    public final void u(int i) {
        p o2 = o(4);
        int i2 = o2.f4072c;
        byte[] bArr = o2.f4070a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        o2.f4072c = i2 + 4;
        this.f4051b += 4;
    }

    public final void v(String str) {
        X0.e.e(str, "string");
        w(str, 0, str.length());
    }

    public final void w(String str, int i, int i2) {
        char charAt;
        X0.e.e(str, "string");
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
                p o2 = o(1);
                int i3 = o2.f4072c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = o2.f4070a;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = o2.f4072c;
                int i6 = (i3 + i) - i5;
                o2.f4072c = i5 + i6;
                this.f4051b += i6;
            } else {
                if (charAt2 < 2048) {
                    p o3 = o(2);
                    int i7 = o3.f4072c;
                    byte[] bArr2 = o3.f4070a;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    o3.f4072c = i7 + 2;
                    this.f4051b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    p o4 = o(3);
                    int i8 = o4.f4072c;
                    byte[] bArr3 = o4.f4070a;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    o4.f4072c = i8 + 3;
                    this.f4051b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        s(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        p o5 = o(4);
                        int i11 = o5.f4072c;
                        byte[] bArr4 = o5.f4070a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        o5.f4072c = i11 + 4;
                        this.f4051b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        X0.e.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            p o2 = o(1);
            int min = Math.min(i, 8192 - o2.f4072c);
            byteBuffer.get(o2.f4070a, o2.f4072c, min);
            i -= min;
            o2.f4072c += min;
        }
        this.f4051b += remaining;
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
            p o2 = o(2);
            int i3 = o2.f4072c;
            byte[] bArr = o2.f4070a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            o2.f4072c = i3 + 2;
            this.f4051b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            s(63);
            return;
        }
        if (i < 65536) {
            p o3 = o(3);
            int i4 = o3.f4072c;
            byte[] bArr2 = o3.f4070a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            o3.f4072c = i4 + 3;
            this.f4051b += 3;
            return;
        }
        if (i <= 1114111) {
            p o4 = o(4);
            int i5 = o4.f4072c;
            byte[] bArr3 = o4.f4070a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            o4.f4072c = i5 + 4;
            this.f4051b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = w1.b.f4149a;
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
