package v1;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public r f4487a;

    /* renamed from: b, reason: collision with root package name */
    public long f4488b;

    @Override // v1.w
    public final y a() {
        return y.f4525d;
    }

    @Override // v1.h
    public final int b(o oVar) {
        X0.f.e(oVar, "options");
        int b2 = w1.a.b(this, oVar, false);
        if (b2 == -1) {
            return -1;
        }
        o(oVar.f4504a[b2].a());
        return b2;
    }

    @Override // v1.w
    public final long c(f fVar, long j2) {
        X0.f.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = this.f4488b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        fVar.d(this, j2);
        return j2;
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f4488b != 0) {
            r rVar = this.f4487a;
            X0.f.b(rVar);
            r c2 = rVar.c();
            fVar.f4487a = c2;
            c2.f4518g = c2;
            c2.f4517f = c2;
            for (r rVar2 = rVar.f4517f; rVar2 != rVar; rVar2 = rVar2.f4517f) {
                r rVar3 = c2.f4518g;
                X0.f.b(rVar3);
                X0.f.b(rVar2);
                rVar3.b(rVar2.c());
            }
            fVar.f4488b = this.f4488b;
        }
        return fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, v1.u
    public final void close() {
    }

    @Override // v1.u
    public final void d(f fVar, long j2) {
        r b2;
        X0.f.e(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        i1.r.e(fVar.f4488b, 0L, j2);
        while (j2 > 0) {
            r rVar = fVar.f4487a;
            X0.f.b(rVar);
            int i = rVar.f4514c;
            r rVar2 = fVar.f4487a;
            X0.f.b(rVar2);
            long j3 = i - rVar2.f4513b;
            int i2 = 0;
            if (j2 < j3) {
                r rVar3 = this.f4487a;
                r rVar4 = rVar3 != null ? rVar3.f4518g : null;
                if (rVar4 != null && rVar4.f4516e) {
                    if ((rVar4.f4514c + j2) - (rVar4.f4515d ? 0 : rVar4.f4513b) <= 8192) {
                        r rVar5 = fVar.f4487a;
                        X0.f.b(rVar5);
                        rVar5.d(rVar4, (int) j2);
                        fVar.f4488b -= j2;
                        this.f4488b += j2;
                        return;
                    }
                }
                r rVar6 = fVar.f4487a;
                X0.f.b(rVar6);
                int i3 = (int) j2;
                if (i3 <= 0 || i3 > rVar6.f4514c - rVar6.f4513b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    b2 = rVar6.c();
                } else {
                    b2 = s.b();
                    int i4 = rVar6.f4513b;
                    O0.g.u0(0, i4, i4 + i3, rVar6.f4512a, b2.f4512a);
                }
                b2.f4514c = b2.f4513b + i3;
                rVar6.f4513b += i3;
                r rVar7 = rVar6.f4518g;
                X0.f.b(rVar7);
                rVar7.b(b2);
                fVar.f4487a = b2;
            }
            r rVar8 = fVar.f4487a;
            X0.f.b(rVar8);
            long j4 = rVar8.f4514c - rVar8.f4513b;
            fVar.f4487a = rVar8.a();
            r rVar9 = this.f4487a;
            if (rVar9 == null) {
                this.f4487a = rVar8;
                rVar8.f4518g = rVar8;
                rVar8.f4517f = rVar8;
            } else {
                r rVar10 = rVar9.f4518g;
                X0.f.b(rVar10);
                rVar10.b(rVar8);
                r rVar11 = rVar8.f4518g;
                if (rVar11 == rVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                X0.f.b(rVar11);
                if (rVar11.f4516e) {
                    int i5 = rVar8.f4514c - rVar8.f4513b;
                    r rVar12 = rVar8.f4518g;
                    X0.f.b(rVar12);
                    int i6 = 8192 - rVar12.f4514c;
                    r rVar13 = rVar8.f4518g;
                    X0.f.b(rVar13);
                    if (!rVar13.f4515d) {
                        r rVar14 = rVar8.f4518g;
                        X0.f.b(rVar14);
                        i2 = rVar14.f4513b;
                    }
                    if (i5 <= i6 + i2) {
                        r rVar15 = rVar8.f4518g;
                        X0.f.b(rVar15);
                        rVar8.d(rVar15, i5);
                        rVar8.a();
                        s.a(rVar8);
                    }
                }
            }
            fVar.f4488b -= j4;
            this.f4488b += j4;
            j2 -= j4;
        }
    }

    @Override // v1.g
    public final /* bridge */ /* synthetic */ g e(String str) {
        x(str);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                long j2 = this.f4488b;
                f fVar = (f) obj;
                if (j2 == fVar.f4488b) {
                    if (j2 != 0) {
                        r rVar = this.f4487a;
                        X0.f.b(rVar);
                        r rVar2 = fVar.f4487a;
                        X0.f.b(rVar2);
                        int i = rVar.f4513b;
                        int i2 = rVar2.f4513b;
                        long j3 = 0;
                        while (j3 < this.f4488b) {
                            long min = Math.min(rVar.f4514c - i, rVar2.f4514c - i2);
                            long j4 = 0;
                            while (j4 < min) {
                                int i3 = i + 1;
                                byte b2 = rVar.f4512a[i];
                                int i4 = i2 + 1;
                                if (b2 == rVar2.f4512a[i2]) {
                                    j4++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == rVar.f4514c) {
                                r rVar3 = rVar.f4517f;
                                X0.f.b(rVar3);
                                i = rVar3.f4513b;
                                rVar = rVar3;
                            }
                            if (i2 == rVar2.f4514c) {
                                rVar2 = rVar2.f4517f;
                                X0.f.b(rVar2);
                                i2 = rVar2.f4513b;
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

    @Override // v1.h
    public final String f(Charset charset) {
        return n(this.f4488b, charset);
    }

    @Override // v1.u, java.io.Flushable
    public final void flush() {
    }

    public final boolean g() {
        return this.f4488b == 0;
    }

    public final byte h(long j2) {
        i1.r.e(this.f4488b, j2, 1L);
        r rVar = this.f4487a;
        if (rVar == null) {
            X0.f.b(null);
            throw null;
        }
        long j3 = this.f4488b;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                rVar = rVar.f4518g;
                X0.f.b(rVar);
                j3 -= rVar.f4514c - rVar.f4513b;
            }
            return rVar.f4512a[(int) ((rVar.f4513b + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i = rVar.f4514c;
            int i2 = rVar.f4513b;
            long j5 = (i - i2) + j4;
            if (j5 > j2) {
                return rVar.f4512a[(int) ((i2 + j2) - j4)];
            }
            rVar = rVar.f4517f;
            X0.f.b(rVar);
            j4 = j5;
        }
    }

    public final int hashCode() {
        r rVar = this.f4487a;
        if (rVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = rVar.f4514c;
            for (int i3 = rVar.f4513b; i3 < i2; i3++) {
                i = (i * 31) + rVar.f4512a[i3];
            }
            rVar = rVar.f4517f;
            X0.f.b(rVar);
        } while (rVar != this.f4487a);
        return i;
    }

    public final byte i() {
        if (this.f4488b == 0) {
            throw new EOFException();
        }
        r rVar = this.f4487a;
        X0.f.b(rVar);
        int i = rVar.f4513b;
        int i2 = rVar.f4514c;
        int i3 = i + 1;
        byte b2 = rVar.f4512a[i];
        this.f4488b--;
        if (i3 == i2) {
            this.f4487a = rVar.a();
            s.a(rVar);
        } else {
            rVar.f4513b = i3;
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
        if (this.f4488b < j2) {
            throw new EOFException();
        }
        int i = (int) j2;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            i1.r.e(i, i2, i3);
            r rVar = this.f4487a;
            if (rVar == null) {
                min = -1;
            } else {
                min = Math.min(i3, rVar.f4514c - rVar.f4513b);
                int i4 = rVar.f4513b;
                O0.g.u0(i2, i4, i4 + min, rVar.f4512a, bArr);
                int i5 = rVar.f4513b + min;
                rVar.f4513b = i5;
                this.f4488b -= min;
                if (i5 == rVar.f4514c) {
                    this.f4487a = rVar.a();
                    s.a(rVar);
                }
            }
            if (min == -1) {
                throw new EOFException();
            }
            i2 += min;
        }
        return bArr;
    }

    public final j k(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f4488b < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new j(j(j2));
        }
        j p2 = p((int) j2);
        o(j2);
        return p2;
    }

    public final int l() {
        if (this.f4488b < 4) {
            throw new EOFException();
        }
        r rVar = this.f4487a;
        X0.f.b(rVar);
        int i = rVar.f4513b;
        int i2 = rVar.f4514c;
        if (i2 - i < 4) {
            return ((i() & 255) << 24) | ((i() & 255) << 16) | ((i() & 255) << 8) | (i() & 255);
        }
        byte[] bArr = rVar.f4512a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.f4488b -= 4;
        if (i5 == i2) {
            this.f4487a = rVar.a();
            s.a(rVar);
        } else {
            rVar.f4513b = i5;
        }
        return i6;
    }

    public final short m() {
        if (this.f4488b < 2) {
            throw new EOFException();
        }
        r rVar = this.f4487a;
        X0.f.b(rVar);
        int i = rVar.f4513b;
        int i2 = rVar.f4514c;
        if (i2 - i < 2) {
            return (short) (((i() & 255) << 8) | (i() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = rVar.f4512a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f4488b -= 2;
        if (i5 == i2) {
            this.f4487a = rVar.a();
            s.a(rVar);
        } else {
            rVar.f4513b = i5;
        }
        return (short) i6;
    }

    public final String n(long j2, Charset charset) {
        X0.f.e(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f4488b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        r rVar = this.f4487a;
        X0.f.b(rVar);
        int i = rVar.f4513b;
        if (i + j2 > rVar.f4514c) {
            return new String(j(j2), charset);
        }
        int i2 = (int) j2;
        String str = new String(rVar.f4512a, i, i2, charset);
        int i3 = rVar.f4513b + i2;
        rVar.f4513b = i3;
        this.f4488b -= j2;
        if (i3 == rVar.f4514c) {
            this.f4487a = rVar.a();
            s.a(rVar);
        }
        return str;
    }

    public final void o(long j2) {
        while (j2 > 0) {
            r rVar = this.f4487a;
            if (rVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, rVar.f4514c - rVar.f4513b);
            long j3 = min;
            this.f4488b -= j3;
            j2 -= j3;
            int i = rVar.f4513b + min;
            rVar.f4513b = i;
            if (i == rVar.f4514c) {
                this.f4487a = rVar.a();
                s.a(rVar);
            }
        }
    }

    public final j p(int i) {
        if (i == 0) {
            return j.f4489d;
        }
        i1.r.e(this.f4488b, 0L, i);
        r rVar = this.f4487a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            X0.f.b(rVar);
            int i5 = rVar.f4514c;
            int i6 = rVar.f4513b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            rVar = rVar.f4517f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        r rVar2 = this.f4487a;
        int i7 = 0;
        while (i2 < i) {
            X0.f.b(rVar2);
            bArr[i7] = rVar2.f4512a;
            i2 += rVar2.f4514c - rVar2.f4513b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = rVar2.f4513b;
            rVar2.f4515d = true;
            i7++;
            rVar2 = rVar2.f4517f;
        }
        return new t(bArr, iArr);
    }

    public final r q(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        r rVar = this.f4487a;
        if (rVar == null) {
            r b2 = s.b();
            this.f4487a = b2;
            b2.f4518g = b2;
            b2.f4517f = b2;
            return b2;
        }
        r rVar2 = rVar.f4518g;
        X0.f.b(rVar2);
        if (rVar2.f4514c + i <= 8192 && rVar2.f4516e) {
            return rVar2;
        }
        r b3 = s.b();
        rVar2.b(b3);
        return b3;
    }

    public final void r(int i, int i2, byte[] bArr) {
        X0.f.e(bArr, "source");
        long j2 = i2;
        i1.r.e(bArr.length, i, j2);
        int i3 = i2 + i;
        while (i < i3) {
            r q2 = q(1);
            int min = Math.min(i3 - i, 8192 - q2.f4514c);
            int i4 = i + min;
            O0.g.u0(q2.f4514c, i, i4, bArr, q2.f4512a);
            q2.f4514c += min;
            i = i4;
        }
        this.f4488b += j2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        X0.f.e(byteBuffer, "sink");
        r rVar = this.f4487a;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), rVar.f4514c - rVar.f4513b);
        byteBuffer.put(rVar.f4512a, rVar.f4513b, min);
        int i = rVar.f4513b + min;
        rVar.f4513b = i;
        this.f4488b -= min;
        if (i == rVar.f4514c) {
            this.f4487a = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    public final void s(j jVar) {
        X0.f.e(jVar, "byteString");
        jVar.i(this, jVar.a());
    }

    public final void t(w wVar) {
        X0.f.e(wVar, "source");
        while (wVar.c(this, 8192L) != -1) {
        }
    }

    public final String toString() {
        long j2 = this.f4488b;
        if (j2 <= 2147483647L) {
            return p((int) j2).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f4488b).toString());
    }

    public final void u(int i) {
        r q2 = q(1);
        int i2 = q2.f4514c;
        q2.f4514c = i2 + 1;
        q2.f4512a[i2] = (byte) i;
        this.f4488b++;
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
        r q2 = q(i);
        int i2 = q2.f4514c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            q2.f4512a[i3] = w1.a.f4591a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        q2.f4514c += i;
        this.f4488b += i;
    }

    public final void w(int i) {
        r q2 = q(4);
        int i2 = q2.f4514c;
        byte[] bArr = q2.f4512a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        q2.f4514c = i2 + 4;
        this.f4488b += 4;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        X0.f.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            r q2 = q(1);
            int min = Math.min(i, 8192 - q2.f4514c);
            byteBuffer.get(q2.f4512a, q2.f4514c, min);
            i -= min;
            q2.f4514c += min;
        }
        this.f4488b += remaining;
        return remaining;
    }

    public final void x(String str) {
        X0.f.e(str, "string");
        y(str, 0, str.length());
    }

    public final void y(String str, int i, int i2) {
        char charAt;
        X0.f.e(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(X0.e.d("beginIndex < 0: ", i).toString());
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
                r q2 = q(1);
                int i3 = q2.f4514c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = q2.f4512a;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = q2.f4514c;
                int i6 = (i3 + i) - i5;
                q2.f4514c = i5 + i6;
                this.f4488b += i6;
            } else {
                if (charAt2 < 2048) {
                    r q3 = q(2);
                    int i7 = q3.f4514c;
                    byte[] bArr2 = q3.f4512a;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    q3.f4514c = i7 + 2;
                    this.f4488b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    r q4 = q(3);
                    int i8 = q4.f4514c;
                    byte[] bArr3 = q4.f4512a;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    q4.f4514c = i8 + 3;
                    this.f4488b += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        u(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        r q5 = q(4);
                        int i11 = q5.f4514c;
                        byte[] bArr4 = q5.f4512a;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        q5.f4514c = i11 + 4;
                        this.f4488b += 4;
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
            r q2 = q(2);
            int i3 = q2.f4514c;
            byte[] bArr = q2.f4512a;
            bArr[i3] = (byte) ((i >> 6) | 192);
            bArr[1 + i3] = (byte) ((i & 63) | 128);
            q2.f4514c = i3 + 2;
            this.f4488b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            u(63);
            return;
        }
        if (i < 65536) {
            r q3 = q(3);
            int i4 = q3.f4514c;
            byte[] bArr2 = q3.f4512a;
            bArr2[i4] = (byte) ((i >> 12) | 224);
            bArr2[1 + i4] = (byte) (((i >> 6) & 63) | 128);
            bArr2[2 + i4] = (byte) ((i & 63) | 128);
            q3.f4514c = i4 + 3;
            this.f4488b += 3;
            return;
        }
        if (i <= 1114111) {
            r q4 = q(4);
            int i5 = q4.f4514c;
            byte[] bArr3 = q4.f4512a;
            bArr3[i5] = (byte) ((i >> 18) | 240);
            bArr3[1 + i5] = (byte) (((i >> 12) & 63) | 128);
            bArr3[2 + i5] = (byte) (((i >> 6) & 63) | 128);
            bArr3[3 + i5] = (byte) ((i & 63) | 128);
            q4.f4514c = i5 + 4;
            this.f4488b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = w1.b.f4592a;
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
