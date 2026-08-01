package g4;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: f, reason: collision with root package name */
    public q f1934f;

    /* renamed from: g, reason: collision with root package name */
    public long f1935g;

    public final void A(int i) {
        q t4 = t(2);
        byte[] bArr = t4.f1951a;
        int i4 = t4.f1953c;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i4 + 1] = (byte) (i & 255);
        t4.f1953c = i4 + 2;
        this.f1935g += 2;
    }

    public final void B(String str) {
        i3.d.e(str, "string");
        C(str, 0, str.length());
    }

    public final void C(String str, int i, int i4) {
        char charAt;
        i3.d.e(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(a4.b.f("beginIndex < 0: ", i).toString());
        }
        if (i4 < i) {
            throw new IllegalArgumentException(a4.b.d(i4, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i4 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i4 + " > " + str.length()).toString());
        }
        while (i < i4) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                q t4 = t(1);
                byte[] bArr = t4.f1951a;
                int i5 = t4.f1953c - i;
                int min = Math.min(i4, 8192 - i5);
                int i6 = i + 1;
                bArr[i + i5] = (byte) charAt2;
                while (true) {
                    i = i6;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i6 = i + 1;
                    bArr[i + i5] = (byte) charAt;
                }
                int i7 = t4.f1953c;
                int i8 = (i5 + i) - i7;
                t4.f1953c = i7 + i8;
                this.f1935g += i8;
            } else {
                if (charAt2 < 2048) {
                    q t5 = t(2);
                    byte[] bArr2 = t5.f1951a;
                    int i9 = t5.f1953c;
                    bArr2[i9] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i9 + 1] = (byte) ((charAt2 & '?') | 128);
                    t5.f1953c = i9 + 2;
                    this.f1935g += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    q t6 = t(3);
                    byte[] bArr3 = t6.f1951a;
                    int i10 = t6.f1953c;
                    bArr3[i10] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i10 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i10 + 2] = (byte) ((charAt2 & '?') | 128);
                    t6.f1953c = i10 + 3;
                    this.f1935g += 3;
                } else {
                    int i11 = i + 1;
                    char charAt3 = i11 < i4 ? str.charAt(i11) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        x(63);
                        i = i11;
                    } else {
                        int i12 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        q t7 = t(4);
                        byte[] bArr4 = t7.f1951a;
                        int i13 = t7.f1953c;
                        bArr4[i13] = (byte) ((i12 >> 18) | 240);
                        bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                        bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                        bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                        t7.f1953c = i13 + 4;
                        this.f1935g += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void D(int i) {
        String str;
        if (i < 128) {
            x(i);
            return;
        }
        if (i < 2048) {
            q t4 = t(2);
            byte[] bArr = t4.f1951a;
            int i4 = t4.f1953c;
            bArr[i4] = (byte) ((i >> 6) | 192);
            bArr[i4 + 1] = (byte) ((i & 63) | 128);
            t4.f1953c = i4 + 2;
            this.f1935g += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            x(63);
            return;
        }
        if (i < 65536) {
            q t5 = t(3);
            byte[] bArr2 = t5.f1951a;
            int i5 = t5.f1953c;
            bArr2[i5] = (byte) ((i >> 12) | 224);
            bArr2[i5 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i5 + 2] = (byte) ((i & 63) | 128);
            t5.f1953c = i5 + 3;
            this.f1935g += 3;
            return;
        }
        if (i <= 1114111) {
            q t6 = t(4);
            byte[] bArr3 = t6.f1951a;
            int i6 = t6.f1953c;
            bArr3[i6] = (byte) ((i >> 18) | 240);
            bArr3[i6 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i6 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i6 + 3] = (byte) ((i & 63) | 128);
            t6.f1953c = i6 + 4;
            this.f1935g += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = h4.b.f1996a;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            int i7 = 0;
            while (i7 < 8 && cArr2[i7] == '0') {
                i7++;
            }
            if (i7 < 0) {
                throw new IndexOutOfBoundsException("startIndex: " + i7 + ", endIndex: 8, size: 8");
            }
            if (i7 > 8) {
                throw new IllegalArgumentException("startIndex: " + i7 + " > endIndex: 8");
            }
            str = new String(cArr2, i7, 8 - i7);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // g4.v
    public final x a() {
        return x.d;
    }

    @Override // g4.h
    public final i b(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1935g < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new i(q(j2));
        }
        i s3 = s((int) j2);
        skip(j2);
        return s3;
    }

    @Override // g4.v
    public final long c(long j2, f fVar) {
        i3.d.e(fVar, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j4 = this.f1935g;
        if (j4 == 0) {
            return -1L;
        }
        if (j2 > j4) {
            j2 = j4;
        }
        fVar.f(j2, this);
        return j2;
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f1935g == 0) {
            return fVar;
        }
        q qVar = this.f1934f;
        i3.d.b(qVar);
        q c5 = qVar.c();
        fVar.f1934f = c5;
        c5.f1956g = c5;
        c5.f1955f = c5;
        for (q qVar2 = qVar.f1955f; qVar2 != qVar; qVar2 = qVar2.f1955f) {
            q qVar3 = c5.f1956g;
            i3.d.b(qVar3);
            i3.d.b(qVar2);
            qVar3.b(qVar2.c());
        }
        fVar.f1935g = this.f1935g;
        return fVar;
    }

    @Override // g4.g
    public final /* bridge */ /* synthetic */ g d(i iVar) {
        u(iVar);
        return this;
    }

    @Override // g4.h
    public final String e() {
        return g(Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        long j2 = this.f1935g;
        f fVar = (f) obj;
        if (j2 != fVar.f1935g) {
            return false;
        }
        if (j2 == 0) {
            return true;
        }
        q qVar = this.f1934f;
        i3.d.b(qVar);
        q qVar2 = fVar.f1934f;
        i3.d.b(qVar2);
        int i = qVar.f1952b;
        int i4 = qVar2.f1952b;
        long j4 = 0;
        while (j4 < this.f1935g) {
            long min = Math.min(qVar.f1953c - i, qVar2.f1953c - i4);
            long j5 = 0;
            while (j5 < min) {
                int i5 = i + 1;
                int i6 = i4 + 1;
                if (qVar.f1951a[i] != qVar2.f1951a[i4]) {
                    return false;
                }
                j5++;
                i = i5;
                i4 = i6;
            }
            if (i == qVar.f1953c) {
                qVar = qVar.f1955f;
                i3.d.b(qVar);
                i = qVar.f1952b;
            }
            if (i4 == qVar2.f1953c) {
                qVar2 = qVar2.f1955f;
                i3.d.b(qVar2);
                i4 = qVar2.f1952b;
            }
            j4 += min;
        }
        return true;
    }

    @Override // g4.t
    public final void f(long j2, f fVar) {
        q b2;
        i3.d.e(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        b4.d.k(fVar.f1935g, 0L, j2);
        while (j2 > 0) {
            q qVar = fVar.f1934f;
            i3.d.b(qVar);
            int i = qVar.f1953c;
            q qVar2 = fVar.f1934f;
            i3.d.b(qVar2);
            long j4 = i - qVar2.f1952b;
            int i4 = 0;
            if (j2 < j4) {
                q qVar3 = this.f1934f;
                q qVar4 = qVar3 != null ? qVar3.f1956g : null;
                if (qVar4 != null && qVar4.f1954e) {
                    if ((qVar4.f1953c + j2) - (qVar4.d ? 0 : qVar4.f1952b) <= 8192) {
                        q qVar5 = fVar.f1934f;
                        i3.d.b(qVar5);
                        qVar5.d(qVar4, (int) j2);
                        fVar.f1935g -= j2;
                        this.f1935g += j2;
                        return;
                    }
                }
                q qVar6 = fVar.f1934f;
                i3.d.b(qVar6);
                int i5 = (int) j2;
                if (i5 <= 0 || i5 > qVar6.f1953c - qVar6.f1952b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i5 >= 1024) {
                    b2 = qVar6.c();
                } else {
                    b2 = r.b();
                    byte[] bArr = qVar6.f1951a;
                    byte[] bArr2 = b2.f1951a;
                    int i6 = qVar6.f1952b;
                    x2.g.F(0, i6, i6 + i5, bArr, bArr2);
                }
                b2.f1953c = b2.f1952b + i5;
                qVar6.f1952b += i5;
                q qVar7 = qVar6.f1956g;
                i3.d.b(qVar7);
                qVar7.b(b2);
                fVar.f1934f = b2;
            }
            q qVar8 = fVar.f1934f;
            i3.d.b(qVar8);
            long j5 = qVar8.f1953c - qVar8.f1952b;
            fVar.f1934f = qVar8.a();
            q qVar9 = this.f1934f;
            if (qVar9 == null) {
                this.f1934f = qVar8;
                qVar8.f1956g = qVar8;
                qVar8.f1955f = qVar8;
            } else {
                q qVar10 = qVar9.f1956g;
                i3.d.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.f1956g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                i3.d.b(qVar11);
                if (qVar11.f1954e) {
                    int i7 = qVar8.f1953c - qVar8.f1952b;
                    q qVar12 = qVar8.f1956g;
                    i3.d.b(qVar12);
                    int i8 = 8192 - qVar12.f1953c;
                    q qVar13 = qVar8.f1956g;
                    i3.d.b(qVar13);
                    if (!qVar13.d) {
                        q qVar14 = qVar8.f1956g;
                        i3.d.b(qVar14);
                        i4 = qVar14.f1952b;
                    }
                    if (i7 <= i8 + i4) {
                        q qVar15 = qVar8.f1956g;
                        i3.d.b(qVar15);
                        qVar8.d(qVar15, i7);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            fVar.f1935g -= j5;
            this.f1935g += j5;
            j2 -= j5;
        }
    }

    @Override // g4.h
    public final String g(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j4 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        long p4 = p((byte) 10, 0L, j4);
        if (p4 != -1) {
            return h4.a.a(p4, this);
        }
        if (j4 < this.f1935g && o(j4 - 1) == 13 && o(j4) == 10) {
            return h4.a.a(j4, this);
        }
        f fVar = new f();
        m(fVar, 0L, Math.min(32, this.f1935g));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f1935g, j2) + " content=" + fVar.b(fVar.f1935g).b() + (char) 8230);
    }

    @Override // g4.h
    public final int h(n nVar) {
        i3.d.e(nVar, "options");
        int b2 = h4.a.b(this, nVar, false);
        if (b2 == -1) {
            return -1;
        }
        skip(nVar.f1945f[b2].a());
        return b2;
    }

    public final int hashCode() {
        q qVar = this.f1934f;
        if (qVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i4 = qVar.f1953c;
            for (int i5 = qVar.f1952b; i5 < i4; i5++) {
                i = (i * 31) + qVar.f1951a[i5];
            }
            qVar = qVar.f1955f;
            i3.d.b(qVar);
        } while (qVar != this.f1934f);
        return i;
    }

    @Override // g4.h
    public final void i(long j2) {
        if (this.f1935g < j2) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // g4.g
    public final /* bridge */ /* synthetic */ g j(String str) {
        B(str);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    @Override // g4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        int i;
        if (this.f1935g == 0) {
            throw new EOFException();
        }
        int i4 = 0;
        boolean z4 = false;
        long j2 = 0;
        do {
            q qVar = this.f1934f;
            i3.d.b(qVar);
            byte[] bArr = qVar.f1951a;
            int i5 = qVar.f1952b;
            int i6 = qVar.f1953c;
            while (i5 < i6) {
                byte b2 = bArr[i5];
                if (b2 >= 48 && b2 <= 57) {
                    i = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i = b2 - 87;
                } else if (b2 < 65 || b2 > 70) {
                    z4 = true;
                    if (i4 == 0) {
                        char[] cArr = h4.b.f1996a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]})));
                    }
                    if (i5 != i6) {
                        this.f1934f = qVar.a();
                        r.a(qVar);
                    } else {
                        qVar.f1952b = i5;
                    }
                    if (!z4) {
                        break;
                    }
                } else {
                    i = b2 - 55;
                }
                if (((-1152921504606846976L) & j2) != 0) {
                    f fVar = new f();
                    fVar.y(j2);
                    fVar.x(b2);
                    throw new NumberFormatException("Number too large: ".concat(fVar.r(fVar.f1935g, p3.a.f3089a)));
                }
                j2 = (j2 << 4) | i;
                i5++;
                i4++;
            }
            if (i5 != i6) {
            }
            if (!z4) {
            }
        } while (this.f1934f != null);
        this.f1935g -= i4;
        return j2;
    }

    @Override // g4.h
    public final String l(Charset charset) {
        return r(this.f1935g, charset);
    }

    public final void m(f fVar, long j2, long j4) {
        i3.d.e(fVar, "out");
        long j5 = j2;
        b4.d.k(this.f1935g, j5, j4);
        if (j4 == 0) {
            return;
        }
        fVar.f1935g += j4;
        q qVar = this.f1934f;
        while (true) {
            i3.d.b(qVar);
            long j6 = qVar.f1953c - qVar.f1952b;
            if (j5 < j6) {
                break;
            }
            j5 -= j6;
            qVar = qVar.f1955f;
        }
        q qVar2 = qVar;
        long j7 = j4;
        while (j7 > 0) {
            i3.d.b(qVar2);
            q c5 = qVar2.c();
            int i = c5.f1952b + ((int) j5);
            c5.f1952b = i;
            c5.f1953c = Math.min(i + ((int) j7), c5.f1953c);
            q qVar3 = fVar.f1934f;
            if (qVar3 == null) {
                c5.f1956g = c5;
                c5.f1955f = c5;
                fVar.f1934f = c5;
            } else {
                q qVar4 = qVar3.f1956g;
                i3.d.b(qVar4);
                qVar4.b(c5);
            }
            j7 -= c5.f1953c - c5.f1952b;
            qVar2 = qVar2.f1955f;
            j5 = 0;
        }
    }

    public final boolean n() {
        return this.f1935g == 0;
    }

    public final byte o(long j2) {
        b4.d.k(this.f1935g, j2, 1L);
        q qVar = this.f1934f;
        if (qVar == null) {
            i3.d.b(null);
            throw null;
        }
        long j4 = this.f1935g;
        if (j4 - j2 < j2) {
            while (j4 > j2) {
                qVar = qVar.f1956g;
                i3.d.b(qVar);
                j4 -= qVar.f1953c - qVar.f1952b;
            }
            return qVar.f1951a[(int) ((qVar.f1952b + j2) - j4)];
        }
        long j5 = 0;
        while (true) {
            int i = qVar.f1953c;
            int i4 = qVar.f1952b;
            long j6 = (i - i4) + j5;
            if (j6 > j2) {
                return qVar.f1951a[(int) ((i4 + j2) - j5)];
            }
            qVar = qVar.f1955f;
            i3.d.b(qVar);
            j5 = j6;
        }
    }

    public final long p(byte b2, long j2, long j4) {
        q qVar;
        long j5 = 0;
        if (0 > j2 || j2 > j4) {
            throw new IllegalArgumentException(("size=" + this.f1935g + " fromIndex=" + j2 + " toIndex=" + j4).toString());
        }
        long j6 = this.f1935g;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j2 == j4 || (qVar = this.f1934f) == null) {
            return -1L;
        }
        if (j6 - j2 < j2) {
            while (j6 > j2) {
                qVar = qVar.f1956g;
                i3.d.b(qVar);
                j6 -= qVar.f1953c - qVar.f1952b;
            }
            while (j6 < j4) {
                byte[] bArr = qVar.f1951a;
                int min = (int) Math.min(qVar.f1953c, (qVar.f1952b + j4) - j6);
                for (int i = (int) ((qVar.f1952b + j2) - j6); i < min; i++) {
                    if (bArr[i] == b2) {
                        return (i - qVar.f1952b) + j6;
                    }
                }
                j6 += qVar.f1953c - qVar.f1952b;
                qVar = qVar.f1955f;
                i3.d.b(qVar);
                j2 = j6;
            }
            return -1L;
        }
        while (true) {
            long j7 = (qVar.f1953c - qVar.f1952b) + j5;
            if (j7 > j2) {
                break;
            }
            qVar = qVar.f1955f;
            i3.d.b(qVar);
            j5 = j7;
        }
        while (j5 < j4) {
            byte[] bArr2 = qVar.f1951a;
            int min2 = (int) Math.min(qVar.f1953c, (qVar.f1952b + j4) - j5);
            for (int i4 = (int) ((qVar.f1952b + j2) - j5); i4 < min2; i4++) {
                if (bArr2[i4] == b2) {
                    return (i4 - qVar.f1952b) + j5;
                }
            }
            j5 += qVar.f1953c - qVar.f1952b;
            qVar = qVar.f1955f;
            i3.d.b(qVar);
            j2 = j5;
        }
        return -1L;
    }

    public final byte[] q(long j2) {
        int min;
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1935g < j2) {
            throw new EOFException();
        }
        int i = (int) j2;
        byte[] bArr = new byte[i];
        int i4 = 0;
        while (i4 < i) {
            int i5 = i - i4;
            b4.d.k(i, i4, i5);
            q qVar = this.f1934f;
            if (qVar == null) {
                min = -1;
            } else {
                min = Math.min(i5, qVar.f1953c - qVar.f1952b);
                byte[] bArr2 = qVar.f1951a;
                int i6 = qVar.f1952b;
                x2.g.F(i4, i6, i6 + min, bArr2, bArr);
                int i7 = qVar.f1952b + min;
                qVar.f1952b = i7;
                this.f1935g -= min;
                if (i7 == qVar.f1953c) {
                    this.f1934f = qVar.a();
                    r.a(qVar);
                }
            }
            if (min == -1) {
                throw new EOFException();
            }
            i4 += min;
        }
        return bArr;
    }

    public final String r(long j2, Charset charset) {
        i3.d.e(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1935g < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        q qVar = this.f1934f;
        i3.d.b(qVar);
        int i = qVar.f1952b;
        if (i + j2 > qVar.f1953c) {
            return new String(q(j2), charset);
        }
        int i4 = (int) j2;
        String str = new String(qVar.f1951a, i, i4, charset);
        int i5 = qVar.f1952b + i4;
        qVar.f1952b = i5;
        this.f1935g -= j2;
        if (i5 == qVar.f1953c) {
            this.f1934f = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        i3.d.e(byteBuffer, "sink");
        q qVar = this.f1934f;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f1953c - qVar.f1952b);
        byteBuffer.put(qVar.f1951a, qVar.f1952b, min);
        int i = qVar.f1952b + min;
        qVar.f1952b = i;
        this.f1935g -= min;
        if (i == qVar.f1953c) {
            this.f1934f = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    @Override // g4.h
    public final byte readByte() {
        if (this.f1935g == 0) {
            throw new EOFException();
        }
        q qVar = this.f1934f;
        i3.d.b(qVar);
        int i = qVar.f1952b;
        int i4 = qVar.f1953c;
        int i5 = i + 1;
        byte b2 = qVar.f1951a[i];
        this.f1935g--;
        if (i5 != i4) {
            qVar.f1952b = i5;
            return b2;
        }
        this.f1934f = qVar.a();
        r.a(qVar);
        return b2;
    }

    @Override // g4.h
    public final int readInt() {
        if (this.f1935g < 4) {
            throw new EOFException();
        }
        q qVar = this.f1934f;
        i3.d.b(qVar);
        int i = qVar.f1952b;
        int i4 = qVar.f1953c;
        if (i4 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = qVar.f1951a;
        int i5 = i + 3;
        int i6 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i7 = i + 4;
        int i8 = (bArr[i5] & 255) | i6;
        this.f1935g -= 4;
        if (i7 != i4) {
            qVar.f1952b = i7;
            return i8;
        }
        this.f1934f = qVar.a();
        r.a(qVar);
        return i8;
    }

    @Override // g4.h
    public final short readShort() {
        if (this.f1935g < 2) {
            throw new EOFException();
        }
        q qVar = this.f1934f;
        i3.d.b(qVar);
        int i = qVar.f1952b;
        int i4 = qVar.f1953c;
        if (i4 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = qVar.f1951a;
        int i5 = i + 1;
        int i6 = (bArr[i] & 255) << 8;
        int i7 = i + 2;
        int i8 = (bArr[i5] & 255) | i6;
        this.f1935g -= 2;
        if (i7 == i4) {
            this.f1934f = qVar.a();
            r.a(qVar);
        } else {
            qVar.f1952b = i7;
        }
        return (short) i8;
    }

    public final i s(int i) {
        if (i == 0) {
            return i.i;
        }
        b4.d.k(this.f1935g, 0L, i);
        q qVar = this.f1934f;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            i3.d.b(qVar);
            int i7 = qVar.f1953c;
            int i8 = qVar.f1952b;
            if (i7 == i8) {
                throw new AssertionError("s.limit == s.pos");
            }
            i5 += i7 - i8;
            i6++;
            qVar = qVar.f1955f;
        }
        byte[][] bArr = new byte[i6][];
        int[] iArr = new int[i6 * 2];
        q qVar2 = this.f1934f;
        int i9 = 0;
        while (i4 < i) {
            i3.d.b(qVar2);
            bArr[i9] = qVar2.f1951a;
            i4 += qVar2.f1953c - qVar2.f1952b;
            iArr[i9] = Math.min(i4, i);
            iArr[i9 + i6] = qVar2.f1952b;
            qVar2.d = true;
            i9++;
            qVar2 = qVar2.f1955f;
        }
        return new s(bArr, iArr);
    }

    @Override // g4.h
    public final void skip(long j2) {
        while (j2 > 0) {
            q qVar = this.f1934f;
            if (qVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, qVar.f1953c - qVar.f1952b);
            long j4 = min;
            this.f1935g -= j4;
            j2 -= j4;
            int i = qVar.f1952b + min;
            qVar.f1952b = i;
            if (i == qVar.f1953c) {
                this.f1934f = qVar.a();
                r.a(qVar);
            }
        }
    }

    public final q t(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f1934f;
        if (qVar == null) {
            q b2 = r.b();
            this.f1934f = b2;
            b2.f1956g = b2;
            b2.f1955f = b2;
            return b2;
        }
        q qVar2 = qVar.f1956g;
        i3.d.b(qVar2);
        if (qVar2.f1953c + i <= 8192 && qVar2.f1954e) {
            return qVar2;
        }
        q b5 = r.b();
        qVar2.b(b5);
        return b5;
    }

    public final String toString() {
        long j2 = this.f1935g;
        if (j2 <= 2147483647L) {
            return s((int) j2).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f1935g).toString());
    }

    public final void u(i iVar) {
        i3.d.e(iVar, "byteString");
        iVar.i(this, iVar.a());
    }

    public final void v(byte[] bArr, int i) {
        i3.d.e(bArr, "source");
        int i4 = 0;
        long j2 = i;
        b4.d.k(bArr.length, 0, j2);
        while (i4 < i) {
            q t4 = t(1);
            int min = Math.min(i - i4, 8192 - t4.f1953c);
            int i5 = i4 + min;
            x2.g.F(t4.f1953c, i4, i5, bArr, t4.f1951a);
            t4.f1953c += min;
            i4 = i5;
        }
        this.f1935g += j2;
    }

    public final void w(v vVar) {
        i3.d.e(vVar, "source");
        while (vVar.c(8192L, this) != -1) {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        i3.d.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            q t4 = t(1);
            int min = Math.min(i, 8192 - t4.f1953c);
            byteBuffer.get(t4.f1951a, t4.f1953c, min);
            i -= min;
            t4.f1953c += min;
        }
        this.f1935g += remaining;
        return remaining;
    }

    @Override // g4.g
    public final /* bridge */ /* synthetic */ g writeByte(int i) {
        x(i);
        return this;
    }

    @Override // g4.g
    public final /* bridge */ /* synthetic */ g writeInt(int i) {
        z(i);
        return this;
    }

    @Override // g4.g
    public final /* bridge */ /* synthetic */ g writeShort(int i) {
        A(i);
        return this;
    }

    public final void x(int i) {
        q t4 = t(1);
        byte[] bArr = t4.f1951a;
        int i4 = t4.f1953c;
        t4.f1953c = i4 + 1;
        bArr[i4] = (byte) i;
        this.f1935g++;
    }

    public final void y(long j2) {
        if (j2 == 0) {
            x(48);
            return;
        }
        long j4 = (j2 >>> 1) | j2;
        long j5 = j4 | (j4 >>> 2);
        long j6 = j5 | (j5 >>> 4);
        long j7 = j6 | (j6 >>> 8);
        long j8 = j7 | (j7 >>> 16);
        long j9 = j8 | (j8 >>> 32);
        long j10 = j9 - ((j9 >>> 1) & 6148914691236517205L);
        long j11 = ((j10 >>> 2) & 3689348814741910323L) + (j10 & 3689348814741910323L);
        long j12 = ((j11 >>> 4) + j11) & 1085102592571150095L;
        long j13 = j12 + (j12 >>> 8);
        long j14 = j13 + (j13 >>> 16);
        int i = (int) ((((j14 & 63) + ((j14 >>> 32) & 63)) + 3) / 4);
        q t4 = t(i);
        byte[] bArr = t4.f1951a;
        int i4 = t4.f1953c;
        for (int i5 = (i4 + i) - 1; i5 >= i4; i5--) {
            bArr[i5] = h4.a.f1995a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        t4.f1953c += i;
        this.f1935g += i;
    }

    public final void z(int i) {
        q t4 = t(4);
        byte[] bArr = t4.f1951a;
        int i4 = t4.f1953c;
        bArr[i4] = (byte) ((i >>> 24) & 255);
        bArr[i4 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i4 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i4 + 3] = (byte) (i & 255);
        t4.f1953c = i4 + 4;
        this.f1935g += 4;
    }

    @Override // g4.g
    public final g write(byte[] bArr) {
        v(bArr, bArr.length);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, g4.t
    public final void close() {
    }

    @Override // g4.g, g4.t, java.io.Flushable
    public final void flush() {
    }
}
