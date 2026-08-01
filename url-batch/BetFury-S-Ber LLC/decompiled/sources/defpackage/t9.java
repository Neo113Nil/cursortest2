package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class t9 implements w9, v9, Cloneable, ByteChannel {
    public kc0 f;
    public long g;

    @Override // defpackage.w9
    public final int B(f50 f50Var) {
        f50Var.getClass();
        int b = b.b(this, f50Var, false);
        if (b == -1) {
            return -1;
        }
        skip(f50Var.f[b].a());
        return b;
    }

    public final byte[] D(long j) {
        int min;
        if (j < 0 || j > 2147483647L) {
            s9.n("byteCount: ", j);
            return null;
        }
        if (this.g < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            n9.b(i, i2, i3);
            kc0 kc0Var = this.f;
            if (kc0Var == null) {
                min = -1;
            } else {
                min = Math.min(i3, kc0Var.c - kc0Var.b);
                byte[] bArr2 = kc0Var.a;
                int i4 = kc0Var.b;
                j7.X(bArr2, bArr, i2, i4, i4 + min);
                int i5 = kc0Var.b + min;
                kc0Var.b = i5;
                this.g -= min;
                if (i5 == kc0Var.c) {
                    this.f = kc0Var.a();
                    nc0.a(kc0Var);
                }
            }
            if (min == -1) {
                throw new EOFException();
            }
            i2 += min;
        }
        return bArr;
    }

    @Override // defpackage.w9
    public final void H(long j) {
        if (this.g < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.v9
    public final /* bridge */ /* synthetic */ v9 I(String str) {
        X(str);
        return this;
    }

    @Override // defpackage.v9
    public final v9 K(y9 y9Var) {
        y9Var.getClass();
        y9Var.i(this, y9Var.a());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    @Override // defpackage.w9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long L() {
        int i;
        if (this.g == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            kc0 kc0Var = this.f;
            kc0Var.getClass();
            byte[] bArr = kc0Var.a;
            int i3 = kc0Var.b;
            int i4 = kc0Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = n9.a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.f = kc0Var.a();
                        nc0.a(kc0Var);
                    } else {
                        kc0Var.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    t9 t9Var = new t9();
                    t9Var.U(j);
                    t9Var.T(b);
                    throw new NumberFormatException("Number too large: ".concat(t9Var.O(t9Var.g, fb.a)));
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.f != null);
        this.g -= i2;
        return j;
    }

    @Override // defpackage.w9
    public final String M(Charset charset) {
        return O(this.g, charset);
    }

    public final String O(long j, Charset charset) {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            s9.n("byteCount: ", j);
            return null;
        }
        if (this.g < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        kc0 kc0Var = this.f;
        kc0Var.getClass();
        int i = kc0Var.b;
        if (i + j > kc0Var.c) {
            return new String(D(j), charset);
        }
        int i2 = (int) j;
        String str = new String(kc0Var.a, i, i2, charset);
        int i3 = kc0Var.b + i2;
        kc0Var.b = i3;
        this.g -= j;
        if (i3 == kc0Var.c) {
            this.f = kc0Var.a();
            nc0.a(kc0Var);
        }
        return str;
    }

    public final y9 P(int i) {
        if (i == 0) {
            return y9.i;
        }
        n9.b(this.g, 0L, i);
        kc0 kc0Var = this.f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            kc0Var.getClass();
            int i5 = kc0Var.c;
            int i6 = kc0Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            kc0Var = kc0Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        kc0 kc0Var2 = this.f;
        int i7 = 0;
        while (i2 < i) {
            kc0Var2.getClass();
            bArr[i7] = kc0Var2.a;
            i2 += kc0Var2.c - kc0Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = kc0Var2.b;
            kc0Var2.d = true;
            i7++;
            kc0Var2 = kc0Var2.f;
        }
        return new oc0(bArr, iArr);
    }

    public final kc0 Q(int i) {
        if (i < 1 || i > 8192) {
            s9.k("unexpected capacity");
            return null;
        }
        kc0 kc0Var = this.f;
        if (kc0Var == null) {
            kc0 b = nc0.b();
            this.f = b;
            b.g = b;
            b.f = b;
            return b;
        }
        kc0 kc0Var2 = kc0Var.g;
        kc0Var2.getClass();
        if (kc0Var2.c + i <= 8192 && kc0Var2.e) {
            return kc0Var2;
        }
        kc0 b2 = nc0.b();
        kc0Var2.b(b2);
        return b2;
    }

    public final void R(int i, byte[] bArr) {
        bArr.getClass();
        long j = i;
        n9.b(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            kc0 Q = Q(1);
            int min = Math.min(i - i2, 8192 - Q.c);
            int i3 = i2 + min;
            j7.X(bArr, Q.a, Q.c, i2, i3);
            Q.c += min;
            i2 = i3;
        }
        this.g += j;
    }

    public final void S(ke0 ke0Var) {
        ke0Var.getClass();
        while (ke0Var.c(8192L, this) != -1) {
        }
    }

    public final void T(int i) {
        kc0 Q = Q(1);
        byte[] bArr = Q.a;
        int i2 = Q.c;
        Q.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.g++;
    }

    public final void U(long j) {
        if (j == 0) {
            T(48);
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
        kc0 Q = Q(i);
        byte[] bArr = Q.a;
        int i2 = Q.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        Q.c += i;
        this.g += i;
    }

    public final void V(int i) {
        kc0 Q = Q(4);
        byte[] bArr = Q.a;
        int i2 = Q.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        Q.c = i2 + 4;
        this.g += 4;
    }

    public final void W(int i) {
        kc0 Q = Q(2);
        byte[] bArr = Q.a;
        int i2 = Q.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        Q.c = i2 + 2;
        this.g += 2;
    }

    public final void X(String str) {
        str.getClass();
        Y(str, 0, str.length());
    }

    public final void Y(String str, int i, int i2) {
        char charAt;
        str.getClass();
        if (i < 0) {
            s9.e(r7.b("beginIndex < 0: ", i));
            return;
        }
        if (i2 < i) {
            s9.e(r7.a(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            s9.m("endIndex > string.length: ", i2, " > ", str.length());
            return;
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                kc0 Q = Q(1);
                byte[] bArr = Q.a;
                int i3 = Q.c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = Q.c;
                int i6 = (i3 + i) - i5;
                Q.c = i5 + i6;
                this.g += i6;
            } else {
                if (charAt2 < 2048) {
                    kc0 Q2 = Q(2);
                    byte[] bArr2 = Q2.a;
                    int i7 = Q2.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    Q2.c = i7 + 2;
                    this.g += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    kc0 Q3 = Q(3);
                    byte[] bArr3 = Q3.a;
                    int i8 = Q3.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    Q3.c = i8 + 3;
                    this.g += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        T(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        kc0 Q4 = Q(4);
                        byte[] bArr4 = Q4.a;
                        int i11 = Q4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        Q4.c = i11 + 4;
                        this.g += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void Z(int i) {
        String str;
        if (i < 128) {
            T(i);
            return;
        }
        if (i < 2048) {
            kc0 Q = Q(2);
            byte[] bArr = Q.a;
            int i2 = Q.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            Q.c = i2 + 2;
            this.g += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            T(63);
            return;
        }
        if (i < 65536) {
            kc0 Q2 = Q(3);
            byte[] bArr2 = Q2.a;
            int i3 = Q2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            Q2.c = i3 + 3;
            this.g += 3;
            return;
        }
        if (i <= 1114111) {
            kc0 Q3 = Q(4);
            byte[] bArr3 = Q3.a;
            int i4 = Q3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            Q3.c = i4 + 4;
            this.g += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = n9.a;
            int i5 = 0;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            if (i5 < 0) {
                throw new IndexOutOfBoundsException("startIndex: " + i5 + ", endIndex: 8, size: 8");
            }
            if (i5 > 8) {
                s9.d(i5, " > endIndex: 8", "startIndex: ");
                return;
            }
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.ke0
    public final gi0 a() {
        return gi0.d;
    }

    @Override // defpackage.ke0
    public final long c(long j, t9 t9Var) {
        t9Var.getClass();
        if (j < 0) {
            s9.n("byteCount < 0: ", j);
            return 0L;
        }
        long j2 = this.g;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        t9Var.v(j, this);
        return j;
    }

    public final Object clone() {
        t9 t9Var = new t9();
        if (this.g == 0) {
            return t9Var;
        }
        kc0 kc0Var = this.f;
        kc0Var.getClass();
        kc0 c = kc0Var.c();
        t9Var.f = c;
        c.g = c;
        c.f = c;
        for (kc0 kc0Var2 = kc0Var.f; kc0Var2 != kc0Var; kc0Var2 = kc0Var2.f) {
            kc0 kc0Var3 = c.g;
            kc0Var3.getClass();
            kc0Var2.getClass();
            kc0Var3.b(kc0Var2.c());
        }
        t9Var.g = this.g;
        return t9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9)) {
            return false;
        }
        long j = this.g;
        t9 t9Var = (t9) obj;
        if (j != t9Var.g) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        kc0 kc0Var = this.f;
        kc0Var.getClass();
        kc0 kc0Var2 = t9Var.f;
        kc0Var2.getClass();
        int i = kc0Var.b;
        int i2 = kc0Var2.b;
        long j2 = 0;
        while (j2 < this.g) {
            long min = Math.min(kc0Var.c - i, kc0Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (kc0Var.a[i] != kc0Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == kc0Var.c) {
                kc0Var = kc0Var.f;
                kc0Var.getClass();
                i = kc0Var.b;
            }
            if (i2 == kc0Var2.c) {
                kc0Var2 = kc0Var2.f;
                kc0Var2.getClass();
                i2 = kc0Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    public final int hashCode() {
        kc0 kc0Var = this.f;
        if (kc0Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = kc0Var.c;
            for (int i3 = kc0Var.b; i3 < i2; i3++) {
                i = (i * 31) + kc0Var.a[i3];
            }
            kc0Var = kc0Var.f;
            kc0Var.getClass();
        } while (kc0Var != this.f);
        return i;
    }

    public final void i(t9 t9Var, long j, long j2) {
        t9Var.getClass();
        long j3 = j;
        n9.b(this.g, j3, j2);
        if (j2 == 0) {
            return;
        }
        t9Var.g += j2;
        kc0 kc0Var = this.f;
        while (true) {
            kc0Var.getClass();
            long j4 = kc0Var.c - kc0Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            kc0Var = kc0Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            kc0Var.getClass();
            kc0 c = kc0Var.c();
            int i = c.b + ((int) j3);
            c.b = i;
            c.c = Math.min(i + ((int) j5), c.c);
            kc0 kc0Var2 = t9Var.f;
            if (kc0Var2 == null) {
                c.g = c;
                c.f = c;
                t9Var.f = c;
            } else {
                kc0 kc0Var3 = kc0Var2.g;
                kc0Var3.getClass();
                kc0Var3.b(c);
            }
            j5 -= c.c - c.b;
            kc0Var = kc0Var.f;
            j3 = 0;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.w9
    public final y9 j(long j) {
        if (j < 0 || j > 2147483647L) {
            s9.n("byteCount: ", j);
            return null;
        }
        if (this.g < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new y9(D(j));
        }
        y9 P = P((int) j);
        skip(j);
        return P;
    }

    @Override // defpackage.w9
    public final String m() {
        return y(Long.MAX_VALUE);
    }

    public final boolean n() {
        return this.g == 0;
    }

    public final byte r(long j) {
        n9.b(this.g, j, 1L);
        kc0 kc0Var = this.f;
        kc0Var.getClass();
        long j2 = this.g;
        if (j2 - j < j) {
            while (j2 > j) {
                kc0Var = kc0Var.g;
                kc0Var.getClass();
                j2 -= kc0Var.c - kc0Var.b;
            }
            return kc0Var.a[(int) ((kc0Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = kc0Var.c;
            int i2 = kc0Var.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return kc0Var.a[(int) ((i2 + j) - j3)];
            }
            kc0Var = kc0Var.f;
            kc0Var.getClass();
            j3 = j4;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        kc0 kc0Var = this.f;
        if (kc0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), kc0Var.c - kc0Var.b);
        byteBuffer.put(kc0Var.a, kc0Var.b, min);
        int i = kc0Var.b + min;
        kc0Var.b = i;
        this.g -= min;
        if (i == kc0Var.c) {
            this.f = kc0Var.a();
            nc0.a(kc0Var);
        }
        return min;
    }

    @Override // defpackage.w9
    public final byte readByte() {
        if (this.g == 0) {
            throw new EOFException();
        }
        kc0 kc0Var = this.f;
        kc0Var.getClass();
        int i = kc0Var.b;
        int i2 = kc0Var.c;
        int i3 = i + 1;
        byte b = kc0Var.a[i];
        this.g--;
        if (i3 != i2) {
            kc0Var.b = i3;
            return b;
        }
        this.f = kc0Var.a();
        nc0.a(kc0Var);
        return b;
    }

    @Override // defpackage.w9
    public final int readInt() {
        if (this.g < 4) {
            throw new EOFException();
        }
        kc0 kc0Var = this.f;
        kc0Var.getClass();
        int i = kc0Var.b;
        int i2 = kc0Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = kc0Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.g -= 4;
        if (i5 != i2) {
            kc0Var.b = i5;
            return i6;
        }
        this.f = kc0Var.a();
        nc0.a(kc0Var);
        return i6;
    }

    @Override // defpackage.w9
    public final short readShort() {
        if (this.g < 2) {
            throw new EOFException();
        }
        kc0 kc0Var = this.f;
        kc0Var.getClass();
        int i = kc0Var.b;
        int i2 = kc0Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = kc0Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.g -= 2;
        if (i5 == i2) {
            this.f = kc0Var.a();
            nc0.a(kc0Var);
        } else {
            kc0Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.w9
    public final void skip(long j) {
        while (j > 0) {
            kc0 kc0Var = this.f;
            if (kc0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, kc0Var.c - kc0Var.b);
            long j2 = min;
            this.g -= j2;
            j -= j2;
            int i = kc0Var.b + min;
            kc0Var.b = i;
            if (i == kc0Var.c) {
                this.f = kc0Var.a();
                nc0.a(kc0Var);
            }
        }
    }

    public final String toString() {
        long j = this.g;
        if (j <= 2147483647L) {
            return P((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.g).toString());
    }

    @Override // defpackage.ae0
    public final void v(long j, t9 t9Var) {
        kc0 b;
        t9Var.getClass();
        if (t9Var == this) {
            s9.k("source == this");
            return;
        }
        n9.b(t9Var.g, 0L, j);
        while (j > 0) {
            kc0 kc0Var = t9Var.f;
            kc0Var.getClass();
            int i = kc0Var.c;
            kc0 kc0Var2 = t9Var.f;
            kc0Var2.getClass();
            long j2 = i - kc0Var2.b;
            int i2 = 0;
            if (j < j2) {
                kc0 kc0Var3 = this.f;
                kc0 kc0Var4 = kc0Var3 != null ? kc0Var3.g : null;
                if (kc0Var4 != null && kc0Var4.e) {
                    if ((kc0Var4.c + j) - (kc0Var4.d ? 0 : kc0Var4.b) <= 8192) {
                        kc0 kc0Var5 = t9Var.f;
                        kc0Var5.getClass();
                        kc0Var5.d(kc0Var4, (int) j);
                        t9Var.g -= j;
                        this.g += j;
                        return;
                    }
                }
                kc0 kc0Var6 = t9Var.f;
                kc0Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > kc0Var6.c - kc0Var6.b) {
                    s9.k("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    b = kc0Var6.c();
                } else {
                    b = nc0.b();
                    byte[] bArr = kc0Var6.a;
                    byte[] bArr2 = b.a;
                    int i4 = kc0Var6.b;
                    j7.X(bArr, bArr2, 0, i4, i4 + i3);
                }
                b.c = b.b + i3;
                kc0Var6.b += i3;
                kc0 kc0Var7 = kc0Var6.g;
                kc0Var7.getClass();
                kc0Var7.b(b);
                t9Var.f = b;
            }
            kc0 kc0Var8 = t9Var.f;
            kc0Var8.getClass();
            long j3 = kc0Var8.c - kc0Var8.b;
            t9Var.f = kc0Var8.a();
            kc0 kc0Var9 = this.f;
            if (kc0Var9 == null) {
                this.f = kc0Var8;
                kc0Var8.g = kc0Var8;
                kc0Var8.f = kc0Var8;
            } else {
                kc0 kc0Var10 = kc0Var9.g;
                kc0Var10.getClass();
                kc0Var10.b(kc0Var8);
                kc0 kc0Var11 = kc0Var8.g;
                if (kc0Var11 == kc0Var8) {
                    s9.u("cannot compact");
                    return;
                }
                kc0Var11.getClass();
                if (kc0Var11.e) {
                    int i5 = kc0Var8.c - kc0Var8.b;
                    kc0 kc0Var12 = kc0Var8.g;
                    kc0Var12.getClass();
                    int i6 = 8192 - kc0Var12.c;
                    kc0 kc0Var13 = kc0Var8.g;
                    kc0Var13.getClass();
                    if (!kc0Var13.d) {
                        kc0 kc0Var14 = kc0Var8.g;
                        kc0Var14.getClass();
                        i2 = kc0Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        kc0 kc0Var15 = kc0Var8.g;
                        kc0Var15.getClass();
                        kc0Var8.d(kc0Var15, i5);
                        kc0Var8.a();
                        nc0.a(kc0Var8);
                    }
                }
            }
            t9Var.g -= j3;
            this.g += j3;
            j -= j3;
        }
    }

    public final long w(byte b, long j, long j2) {
        kc0 kc0Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.g + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.g;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (kc0Var = this.f) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                kc0Var = kc0Var.g;
                kc0Var.getClass();
                j4 -= kc0Var.c - kc0Var.b;
            }
            while (j4 < j2) {
                byte[] bArr = kc0Var.a;
                int min = (int) Math.min(kc0Var.c, (kc0Var.b + j2) - j4);
                for (int i = (int) ((kc0Var.b + j) - j4); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - kc0Var.b) + j4;
                    }
                }
                j4 += kc0Var.c - kc0Var.b;
                kc0Var = kc0Var.f;
                kc0Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (kc0Var.c - kc0Var.b) + j3;
            if (j5 > j) {
                break;
            }
            kc0Var = kc0Var.f;
            kc0Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = kc0Var.a;
            int min2 = (int) Math.min(kc0Var.c, (kc0Var.b + j2) - j3);
            for (int i2 = (int) ((kc0Var.b + j) - j3); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - kc0Var.b) + j3;
                }
            }
            j3 += kc0Var.c - kc0Var.b;
            kc0Var = kc0Var.f;
            kc0Var.getClass();
            j = j3;
        }
        return -1L;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            kc0 Q = Q(1);
            int min = Math.min(i, 8192 - Q.c);
            byteBuffer.get(Q.a, Q.c, min);
            i -= min;
            Q.c += min;
        }
        this.g += remaining;
        return remaining;
    }

    @Override // defpackage.v9
    public final /* bridge */ /* synthetic */ v9 writeByte(int i) {
        T(i);
        return this;
    }

    @Override // defpackage.v9
    public final /* bridge */ /* synthetic */ v9 writeInt(int i) {
        V(i);
        return this;
    }

    @Override // defpackage.v9
    public final /* bridge */ /* synthetic */ v9 writeShort(int i) {
        W(i);
        return this;
    }

    @Override // defpackage.w9
    public final String y(long j) {
        if (j < 0) {
            s9.n("limit < 0: ", j);
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long w = w((byte) 10, 0L, j2);
        if (w != -1) {
            return b.a(w, this);
        }
        if (j2 < this.g && r(j2 - 1) == 13 && r(j2) == 10) {
            return b.a(j2, this);
        }
        t9 t9Var = new t9();
        i(t9Var, 0L, Math.min(32L, this.g));
        throw new EOFException("\\n not found: limit=" + Math.min(this.g, j) + " content=" + t9Var.j(t9Var.g).b() + (char) 8230);
    }

    @Override // defpackage.v9
    public final v9 write(byte[] bArr) {
        R(bArr.length, bArr);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.ae0
    public final void close() {
    }

    @Override // defpackage.v9, defpackage.ae0, java.io.Flushable
    public final void flush() {
    }
}
