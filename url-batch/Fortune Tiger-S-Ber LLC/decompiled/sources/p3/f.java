package p3;

import androidx.fragment.app.w0;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: f, reason: collision with root package name */
    public q f3028f;
    public long g;

    public final void A(int i4) {
        q t3 = t(2);
        byte[] bArr = t3.f3041a;
        int i5 = t3.c;
        bArr[i5] = (byte) ((i4 >>> 8) & 255);
        bArr[i5 + 1] = (byte) (i4 & 255);
        t3.c = i5 + 2;
        this.g += 2;
    }

    public final void B(String str) {
        u2.c.e(str, "string");
        C(str, 0, str.length());
    }

    public final void C(String str, int i4, int i5) {
        char charAt;
        u2.c.e(str, "string");
        if (i4 < 0) {
            throw new IllegalArgumentException(w0.e("beginIndex < 0: ", i4).toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i5 + " < " + i4).toString());
        }
        if (i5 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i5 + " > " + str.length()).toString());
        }
        while (i4 < i5) {
            char charAt2 = str.charAt(i4);
            if (charAt2 < 128) {
                q t3 = t(1);
                byte[] bArr = t3.f3041a;
                int i6 = t3.c - i4;
                int min = Math.min(i5, 8192 - i6);
                int i7 = i4 + 1;
                bArr[i4 + i6] = (byte) charAt2;
                while (true) {
                    i4 = i7;
                    if (i4 >= min || (charAt = str.charAt(i4)) >= 128) {
                        break;
                    }
                    i7 = i4 + 1;
                    bArr[i4 + i6] = (byte) charAt;
                }
                int i8 = t3.c;
                int i9 = (i6 + i4) - i8;
                t3.c = i8 + i9;
                this.g += i9;
            } else {
                if (charAt2 < 2048) {
                    q t4 = t(2);
                    byte[] bArr2 = t4.f3041a;
                    int i10 = t4.c;
                    bArr2[i10] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i10 + 1] = (byte) ((charAt2 & '?') | 128);
                    t4.c = i10 + 2;
                    this.g += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    q t5 = t(3);
                    byte[] bArr3 = t5.f3041a;
                    int i11 = t5.c;
                    bArr3[i11] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                    t5.c = i11 + 3;
                    this.g += 3;
                } else {
                    int i12 = i4 + 1;
                    char charAt3 = i12 < i5 ? str.charAt(i12) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        x(63);
                        i4 = i12;
                    } else {
                        int i13 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        q t6 = t(4);
                        byte[] bArr4 = t6.f3041a;
                        int i14 = t6.c;
                        bArr4[i14] = (byte) ((i13 >> 18) | 240);
                        bArr4[i14 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                        bArr4[i14 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                        bArr4[i14 + 3] = (byte) ((i13 & 63) | 128);
                        t6.c = i14 + 4;
                        this.g += 4;
                        i4 += 2;
                    }
                }
                i4++;
            }
        }
    }

    public final void D(int i4) {
        String str;
        if (i4 < 128) {
            x(i4);
            return;
        }
        if (i4 < 2048) {
            q t3 = t(2);
            byte[] bArr = t3.f3041a;
            int i5 = t3.c;
            bArr[i5] = (byte) ((i4 >> 6) | 192);
            bArr[i5 + 1] = (byte) ((i4 & 63) | 128);
            t3.c = i5 + 2;
            this.g += 2;
            return;
        }
        if (55296 <= i4 && i4 < 57344) {
            x(63);
            return;
        }
        if (i4 < 65536) {
            q t4 = t(3);
            byte[] bArr2 = t4.f3041a;
            int i6 = t4.c;
            bArr2[i6] = (byte) ((i4 >> 12) | 224);
            bArr2[i6 + 1] = (byte) (((i4 >> 6) & 63) | 128);
            bArr2[i6 + 2] = (byte) ((i4 & 63) | 128);
            t4.c = i6 + 3;
            this.g += 3;
            return;
        }
        if (i4 <= 1114111) {
            q t5 = t(4);
            byte[] bArr3 = t5.f3041a;
            int i7 = t5.c;
            bArr3[i7] = (byte) ((i4 >> 18) | 240);
            bArr3[i7 + 1] = (byte) (((i4 >> 12) & 63) | 128);
            bArr3[i7 + 2] = (byte) (((i4 >> 6) & 63) | 128);
            bArr3[i7 + 3] = (byte) ((i4 & 63) | 128);
            t5.c = i7 + 4;
            this.g += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i4 != 0) {
            char[] cArr = q3.b.f3137a;
            char[] cArr2 = {cArr[(i4 >> 28) & 15], cArr[(i4 >> 24) & 15], cArr[(i4 >> 20) & 15], cArr[(i4 >> 16) & 15], cArr[(i4 >> 12) & 15], cArr[(i4 >> 8) & 15], cArr[(i4 >> 4) & 15], cArr[i4 & 15]};
            int i8 = 0;
            while (i8 < 8 && cArr2[i8] == '0') {
                i8++;
            }
            if (i8 < 0) {
                throw new IndexOutOfBoundsException("startIndex: " + i8 + ", endIndex: 8, size: 8");
            }
            if (i8 > 8) {
                throw new IllegalArgumentException("startIndex: " + i8 + " > endIndex: 8");
            }
            str = new String(cArr2, i8, 8 - i8);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // p3.v
    public final x a() {
        return x.f3051d;
    }

    @Override // p3.h
    public final i b(long j4) {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.g < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new i(q(j4));
        }
        i s2 = s((int) j4);
        skip(j4);
        return s2;
    }

    @Override // p3.v
    public final long c(long j4, f fVar) {
        u2.c.e(fVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        long j5 = this.g;
        if (j5 == 0) {
            return -1L;
        }
        if (j4 > j5) {
            j4 = j5;
        }
        fVar.e(j4, this);
        return j4;
    }

    public final Object clone() {
        f fVar = new f();
        if (this.g == 0) {
            return fVar;
        }
        q qVar = this.f3028f;
        u2.c.b(qVar);
        q c = qVar.c();
        fVar.f3028f = c;
        c.g = c;
        c.f3045f = c;
        for (q qVar2 = qVar.f3045f; qVar2 != qVar; qVar2 = qVar2.f3045f) {
            q qVar3 = c.g;
            u2.c.b(qVar3);
            u2.c.b(qVar2);
            qVar3.b(qVar2.c());
        }
        fVar.g = this.g;
        return fVar;
    }

    @Override // p3.h
    public final String d() {
        return h(Long.MAX_VALUE);
    }

    @Override // p3.t
    public final void e(long j4, f fVar) {
        q b2;
        u2.c.e(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        m0.a.g(fVar.g, 0L, j4);
        while (j4 > 0) {
            q qVar = fVar.f3028f;
            u2.c.b(qVar);
            int i4 = qVar.c;
            q qVar2 = fVar.f3028f;
            u2.c.b(qVar2);
            long j5 = i4 - qVar2.f3042b;
            int i5 = 0;
            if (j4 < j5) {
                q qVar3 = this.f3028f;
                q qVar4 = qVar3 != null ? qVar3.g : null;
                if (qVar4 != null && qVar4.f3044e) {
                    if ((qVar4.c + j4) - (qVar4.f3043d ? 0 : qVar4.f3042b) <= 8192) {
                        q qVar5 = fVar.f3028f;
                        u2.c.b(qVar5);
                        qVar5.d(qVar4, (int) j4);
                        fVar.g -= j4;
                        this.g += j4;
                        return;
                    }
                }
                q qVar6 = fVar.f3028f;
                u2.c.b(qVar6);
                int i6 = (int) j4;
                if (i6 <= 0 || i6 > qVar6.c - qVar6.f3042b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i6 >= 1024) {
                    b2 = qVar6.c();
                } else {
                    b2 = r.b();
                    byte[] bArr = qVar6.f3041a;
                    byte[] bArr2 = b2.f3041a;
                    int i7 = qVar6.f3042b;
                    n2.f.B(0, i7, i7 + i6, bArr, bArr2);
                }
                b2.c = b2.f3042b + i6;
                qVar6.f3042b += i6;
                q qVar7 = qVar6.g;
                u2.c.b(qVar7);
                qVar7.b(b2);
                fVar.f3028f = b2;
            }
            q qVar8 = fVar.f3028f;
            u2.c.b(qVar8);
            long j6 = qVar8.c - qVar8.f3042b;
            fVar.f3028f = qVar8.a();
            q qVar9 = this.f3028f;
            if (qVar9 == null) {
                this.f3028f = qVar8;
                qVar8.g = qVar8;
                qVar8.f3045f = qVar8;
            } else {
                q qVar10 = qVar9.g;
                u2.c.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                u2.c.b(qVar11);
                if (qVar11.f3044e) {
                    int i8 = qVar8.c - qVar8.f3042b;
                    q qVar12 = qVar8.g;
                    u2.c.b(qVar12);
                    int i9 = 8192 - qVar12.c;
                    q qVar13 = qVar8.g;
                    u2.c.b(qVar13);
                    if (!qVar13.f3043d) {
                        q qVar14 = qVar8.g;
                        u2.c.b(qVar14);
                        i5 = qVar14.f3042b;
                    }
                    if (i8 <= i9 + i5) {
                        q qVar15 = qVar8.g;
                        u2.c.b(qVar15);
                        qVar8.d(qVar15, i8);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            fVar.g -= j6;
            this.g += j6;
            j4 -= j6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        long j4 = this.g;
        f fVar = (f) obj;
        if (j4 != fVar.g) {
            return false;
        }
        if (j4 == 0) {
            return true;
        }
        q qVar = this.f3028f;
        u2.c.b(qVar);
        q qVar2 = fVar.f3028f;
        u2.c.b(qVar2);
        int i4 = qVar.f3042b;
        int i5 = qVar2.f3042b;
        long j5 = 0;
        while (j5 < this.g) {
            long min = Math.min(qVar.c - i4, qVar2.c - i5);
            long j6 = 0;
            while (j6 < min) {
                int i6 = i4 + 1;
                int i7 = i5 + 1;
                if (qVar.f3041a[i4] != qVar2.f3041a[i5]) {
                    return false;
                }
                j6++;
                i4 = i6;
                i5 = i7;
            }
            if (i4 == qVar.c) {
                qVar = qVar.f3045f;
                u2.c.b(qVar);
                i4 = qVar.f3042b;
            }
            if (i5 == qVar2.c) {
                qVar2 = qVar2.f3045f;
                u2.c.b(qVar2);
                i5 = qVar2.f3042b;
            }
            j5 += min;
        }
        return true;
    }

    @Override // p3.g
    public final /* bridge */ /* synthetic */ g f(i iVar) {
        u(iVar);
        return this;
    }

    @Override // p3.h
    public final int g(n nVar) {
        u2.c.e(nVar, "options");
        int b2 = q3.a.b(this, nVar, false);
        if (b2 == -1) {
            return -1;
        }
        skip(nVar.f3038f[b2].a());
        return b2;
    }

    @Override // p3.h
    public final String h(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j4).toString());
        }
        long j5 = j4 != Long.MAX_VALUE ? j4 + 1 : Long.MAX_VALUE;
        long p4 = p((byte) 10, 0L, j5);
        if (p4 != -1) {
            return q3.a.a(p4, this);
        }
        if (j5 < this.g && o(j5 - 1) == 13 && o(j5) == 10) {
            return q3.a.a(j5, this);
        }
        f fVar = new f();
        m(fVar, 0L, Math.min(32, this.g));
        throw new EOFException("\\n not found: limit=" + Math.min(this.g, j4) + " content=" + fVar.b(fVar.g).b() + (char) 8230);
    }

    public final int hashCode() {
        q qVar = this.f3028f;
        if (qVar == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = qVar.c;
            for (int i6 = qVar.f3042b; i6 < i5; i6++) {
                i4 = (i4 * 31) + qVar.f3041a[i6];
            }
            qVar = qVar.f3045f;
            u2.c.b(qVar);
        } while (qVar != this.f3028f);
        return i4;
    }

    @Override // p3.h
    public final void i(long j4) {
        if (this.g < j4) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p3.g
    public final /* bridge */ /* synthetic */ g j(String str) {
        B(str);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    @Override // p3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        int i4;
        if (this.g == 0) {
            throw new EOFException();
        }
        int i5 = 0;
        boolean z3 = false;
        long j4 = 0;
        do {
            q qVar = this.f3028f;
            u2.c.b(qVar);
            byte[] bArr = qVar.f3041a;
            int i6 = qVar.f3042b;
            int i7 = qVar.c;
            while (i6 < i7) {
                byte b2 = bArr[i6];
                if (b2 >= 48 && b2 <= 57) {
                    i4 = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i4 = b2 - 87;
                } else if (b2 < 65 || b2 > 70) {
                    z3 = true;
                    if (i5 == 0) {
                        char[] cArr = q3.b.f3137a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]})));
                    }
                    if (i6 != i7) {
                        this.f3028f = qVar.a();
                        r.a(qVar);
                    } else {
                        qVar.f3042b = i6;
                    }
                    if (!z3) {
                        break;
                    }
                } else {
                    i4 = b2 - 55;
                }
                if (((-1152921504606846976L) & j4) != 0) {
                    f fVar = new f();
                    fVar.y(j4);
                    fVar.x(b2);
                    throw new NumberFormatException("Number too large: ".concat(fVar.r(fVar.g, b3.a.f967a)));
                }
                j4 = (j4 << 4) | i4;
                i6++;
                i5++;
            }
            if (i6 != i7) {
            }
            if (!z3) {
            }
        } while (this.f3028f != null);
        this.g -= i5;
        return j4;
    }

    @Override // p3.h
    public final String l(Charset charset) {
        return r(this.g, charset);
    }

    public final void m(f fVar, long j4, long j5) {
        u2.c.e(fVar, "out");
        long j6 = j4;
        m0.a.g(this.g, j6, j5);
        if (j5 == 0) {
            return;
        }
        fVar.g += j5;
        q qVar = this.f3028f;
        while (true) {
            u2.c.b(qVar);
            long j7 = qVar.c - qVar.f3042b;
            if (j6 < j7) {
                break;
            }
            j6 -= j7;
            qVar = qVar.f3045f;
        }
        q qVar2 = qVar;
        long j8 = j5;
        while (j8 > 0) {
            u2.c.b(qVar2);
            q c = qVar2.c();
            int i4 = c.f3042b + ((int) j6);
            c.f3042b = i4;
            c.c = Math.min(i4 + ((int) j8), c.c);
            q qVar3 = fVar.f3028f;
            if (qVar3 == null) {
                c.g = c;
                c.f3045f = c;
                fVar.f3028f = c;
            } else {
                q qVar4 = qVar3.g;
                u2.c.b(qVar4);
                qVar4.b(c);
            }
            j8 -= c.c - c.f3042b;
            qVar2 = qVar2.f3045f;
            j6 = 0;
        }
    }

    public final boolean n() {
        return this.g == 0;
    }

    public final byte o(long j4) {
        m0.a.g(this.g, j4, 1L);
        q qVar = this.f3028f;
        if (qVar == null) {
            u2.c.b(null);
            throw null;
        }
        long j5 = this.g;
        if (j5 - j4 < j4) {
            while (j5 > j4) {
                qVar = qVar.g;
                u2.c.b(qVar);
                j5 -= qVar.c - qVar.f3042b;
            }
            return qVar.f3041a[(int) ((qVar.f3042b + j4) - j5)];
        }
        long j6 = 0;
        while (true) {
            int i4 = qVar.c;
            int i5 = qVar.f3042b;
            long j7 = (i4 - i5) + j6;
            if (j7 > j4) {
                return qVar.f3041a[(int) ((i5 + j4) - j6)];
            }
            qVar = qVar.f3045f;
            u2.c.b(qVar);
            j6 = j7;
        }
    }

    public final long p(byte b2, long j4, long j5) {
        q qVar;
        long j6 = 0;
        if (0 > j4 || j4 > j5) {
            throw new IllegalArgumentException(("size=" + this.g + " fromIndex=" + j4 + " toIndex=" + j5).toString());
        }
        long j7 = this.g;
        if (j5 > j7) {
            j5 = j7;
        }
        if (j4 == j5 || (qVar = this.f3028f) == null) {
            return -1L;
        }
        if (j7 - j4 < j4) {
            while (j7 > j4) {
                qVar = qVar.g;
                u2.c.b(qVar);
                j7 -= qVar.c - qVar.f3042b;
            }
            while (j7 < j5) {
                byte[] bArr = qVar.f3041a;
                int min = (int) Math.min(qVar.c, (qVar.f3042b + j5) - j7);
                for (int i4 = (int) ((qVar.f3042b + j4) - j7); i4 < min; i4++) {
                    if (bArr[i4] == b2) {
                        return (i4 - qVar.f3042b) + j7;
                    }
                }
                j7 += qVar.c - qVar.f3042b;
                qVar = qVar.f3045f;
                u2.c.b(qVar);
                j4 = j7;
            }
            return -1L;
        }
        while (true) {
            long j8 = (qVar.c - qVar.f3042b) + j6;
            if (j8 > j4) {
                break;
            }
            qVar = qVar.f3045f;
            u2.c.b(qVar);
            j6 = j8;
        }
        while (j6 < j5) {
            byte[] bArr2 = qVar.f3041a;
            int min2 = (int) Math.min(qVar.c, (qVar.f3042b + j5) - j6);
            for (int i5 = (int) ((qVar.f3042b + j4) - j6); i5 < min2; i5++) {
                if (bArr2[i5] == b2) {
                    return (i5 - qVar.f3042b) + j6;
                }
            }
            j6 += qVar.c - qVar.f3042b;
            qVar = qVar.f3045f;
            u2.c.b(qVar);
            j4 = j6;
        }
        return -1L;
    }

    public final byte[] q(long j4) {
        int min;
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.g < j4) {
            throw new EOFException();
        }
        int i4 = (int) j4;
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i4 - i5;
            m0.a.g(i4, i5, i6);
            q qVar = this.f3028f;
            if (qVar == null) {
                min = -1;
            } else {
                min = Math.min(i6, qVar.c - qVar.f3042b);
                byte[] bArr2 = qVar.f3041a;
                int i7 = qVar.f3042b;
                n2.f.B(i5, i7, i7 + min, bArr2, bArr);
                int i8 = qVar.f3042b + min;
                qVar.f3042b = i8;
                this.g -= min;
                if (i8 == qVar.c) {
                    this.f3028f = qVar.a();
                    r.a(qVar);
                }
            }
            if (min == -1) {
                throw new EOFException();
            }
            i5 += min;
        }
        return bArr;
    }

    public final String r(long j4, Charset charset) {
        u2.c.e(charset, "charset");
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.g < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        q qVar = this.f3028f;
        u2.c.b(qVar);
        int i4 = qVar.f3042b;
        if (i4 + j4 > qVar.c) {
            return new String(q(j4), charset);
        }
        int i5 = (int) j4;
        String str = new String(qVar.f3041a, i4, i5, charset);
        int i6 = qVar.f3042b + i5;
        qVar.f3042b = i6;
        this.g -= j4;
        if (i6 == qVar.c) {
            this.f3028f = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        u2.c.e(byteBuffer, "sink");
        q qVar = this.f3028f;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.c - qVar.f3042b);
        byteBuffer.put(qVar.f3041a, qVar.f3042b, min);
        int i4 = qVar.f3042b + min;
        qVar.f3042b = i4;
        this.g -= min;
        if (i4 == qVar.c) {
            this.f3028f = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    @Override // p3.h
    public final byte readByte() {
        if (this.g == 0) {
            throw new EOFException();
        }
        q qVar = this.f3028f;
        u2.c.b(qVar);
        int i4 = qVar.f3042b;
        int i5 = qVar.c;
        int i6 = i4 + 1;
        byte b2 = qVar.f3041a[i4];
        this.g--;
        if (i6 != i5) {
            qVar.f3042b = i6;
            return b2;
        }
        this.f3028f = qVar.a();
        r.a(qVar);
        return b2;
    }

    @Override // p3.h
    public final int readInt() {
        if (this.g < 4) {
            throw new EOFException();
        }
        q qVar = this.f3028f;
        u2.c.b(qVar);
        int i4 = qVar.f3042b;
        int i5 = qVar.c;
        if (i5 - i4 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = qVar.f3041a;
        int i6 = i4 + 3;
        int i7 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
        int i8 = i4 + 4;
        int i9 = (bArr[i6] & 255) | i7;
        this.g -= 4;
        if (i8 != i5) {
            qVar.f3042b = i8;
            return i9;
        }
        this.f3028f = qVar.a();
        r.a(qVar);
        return i9;
    }

    @Override // p3.h
    public final short readShort() {
        if (this.g < 2) {
            throw new EOFException();
        }
        q qVar = this.f3028f;
        u2.c.b(qVar);
        int i4 = qVar.f3042b;
        int i5 = qVar.c;
        if (i5 - i4 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = qVar.f3041a;
        int i6 = i4 + 1;
        int i7 = (bArr[i4] & 255) << 8;
        int i8 = i4 + 2;
        int i9 = (bArr[i6] & 255) | i7;
        this.g -= 2;
        if (i8 == i5) {
            this.f3028f = qVar.a();
            r.a(qVar);
        } else {
            qVar.f3042b = i8;
        }
        return (short) i9;
    }

    public final i s(int i4) {
        if (i4 == 0) {
            return i.f3029i;
        }
        m0.a.g(this.g, 0L, i4);
        q qVar = this.f3028f;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            u2.c.b(qVar);
            int i8 = qVar.c;
            int i9 = qVar.f3042b;
            if (i8 == i9) {
                throw new AssertionError("s.limit == s.pos");
            }
            i6 += i8 - i9;
            i7++;
            qVar = qVar.f3045f;
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[i7 * 2];
        q qVar2 = this.f3028f;
        int i10 = 0;
        while (i5 < i4) {
            u2.c.b(qVar2);
            bArr[i10] = qVar2.f3041a;
            i5 += qVar2.c - qVar2.f3042b;
            iArr[i10] = Math.min(i5, i4);
            iArr[i10 + i7] = qVar2.f3042b;
            qVar2.f3043d = true;
            i10++;
            qVar2 = qVar2.f3045f;
        }
        return new s(bArr, iArr);
    }

    @Override // p3.h
    public final void skip(long j4) {
        while (j4 > 0) {
            q qVar = this.f3028f;
            if (qVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j4, qVar.c - qVar.f3042b);
            long j5 = min;
            this.g -= j5;
            j4 -= j5;
            int i4 = qVar.f3042b + min;
            qVar.f3042b = i4;
            if (i4 == qVar.c) {
                this.f3028f = qVar.a();
                r.a(qVar);
            }
        }
    }

    public final q t(int i4) {
        if (i4 < 1 || i4 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f3028f;
        if (qVar == null) {
            q b2 = r.b();
            this.f3028f = b2;
            b2.g = b2;
            b2.f3045f = b2;
            return b2;
        }
        q qVar2 = qVar.g;
        u2.c.b(qVar2);
        if (qVar2.c + i4 <= 8192 && qVar2.f3044e) {
            return qVar2;
        }
        q b4 = r.b();
        qVar2.b(b4);
        return b4;
    }

    public final String toString() {
        long j4 = this.g;
        if (j4 <= 2147483647L) {
            return s((int) j4).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.g).toString());
    }

    public final void u(i iVar) {
        u2.c.e(iVar, "byteString");
        iVar.i(this, iVar.a());
    }

    public final void v(byte[] bArr, int i4) {
        u2.c.e(bArr, "source");
        int i5 = 0;
        long j4 = i4;
        m0.a.g(bArr.length, 0, j4);
        while (i5 < i4) {
            q t3 = t(1);
            int min = Math.min(i4 - i5, 8192 - t3.c);
            int i6 = i5 + min;
            n2.f.B(t3.c, i5, i6, bArr, t3.f3041a);
            t3.c += min;
            i5 = i6;
        }
        this.g += j4;
    }

    public final void w(v vVar) {
        u2.c.e(vVar, "source");
        while (vVar.c(8192L, this) != -1) {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        u2.c.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i4 = remaining;
        while (i4 > 0) {
            q t3 = t(1);
            int min = Math.min(i4, 8192 - t3.c);
            byteBuffer.get(t3.f3041a, t3.c, min);
            i4 -= min;
            t3.c += min;
        }
        this.g += remaining;
        return remaining;
    }

    @Override // p3.g
    public final /* bridge */ /* synthetic */ g writeByte(int i4) {
        x(i4);
        return this;
    }

    @Override // p3.g
    public final /* bridge */ /* synthetic */ g writeInt(int i4) {
        z(i4);
        return this;
    }

    @Override // p3.g
    public final /* bridge */ /* synthetic */ g writeShort(int i4) {
        A(i4);
        return this;
    }

    public final void x(int i4) {
        q t3 = t(1);
        byte[] bArr = t3.f3041a;
        int i5 = t3.c;
        t3.c = i5 + 1;
        bArr[i5] = (byte) i4;
        this.g++;
    }

    public final void y(long j4) {
        if (j4 == 0) {
            x(48);
            return;
        }
        long j5 = (j4 >>> 1) | j4;
        long j6 = j5 | (j5 >>> 2);
        long j7 = j6 | (j6 >>> 4);
        long j8 = j7 | (j7 >>> 8);
        long j9 = j8 | (j8 >>> 16);
        long j10 = j9 | (j9 >>> 32);
        long j11 = j10 - ((j10 >>> 1) & 6148914691236517205L);
        long j12 = ((j11 >>> 2) & 3689348814741910323L) + (j11 & 3689348814741910323L);
        long j13 = ((j12 >>> 4) + j12) & 1085102592571150095L;
        long j14 = j13 + (j13 >>> 8);
        long j15 = j14 + (j14 >>> 16);
        int i4 = (int) ((((j15 & 63) + ((j15 >>> 32) & 63)) + 3) / 4);
        q t3 = t(i4);
        byte[] bArr = t3.f3041a;
        int i5 = t3.c;
        for (int i6 = (i5 + i4) - 1; i6 >= i5; i6--) {
            bArr[i6] = q3.a.f3136a[(int) (15 & j4)];
            j4 >>>= 4;
        }
        t3.c += i4;
        this.g += i4;
    }

    public final void z(int i4) {
        q t3 = t(4);
        byte[] bArr = t3.f3041a;
        int i5 = t3.c;
        bArr[i5] = (byte) ((i4 >>> 24) & 255);
        bArr[i5 + 1] = (byte) ((i4 >>> 16) & 255);
        bArr[i5 + 2] = (byte) ((i4 >>> 8) & 255);
        bArr[i5 + 3] = (byte) (i4 & 255);
        t3.c = i5 + 4;
        this.g += 4;
    }

    @Override // p3.g
    public final g write(byte[] bArr) {
        v(bArr, bArr.length);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p3.t
    public final void close() {
    }

    @Override // p3.g, p3.t, java.io.Flushable
    public final void flush() {
    }
}
