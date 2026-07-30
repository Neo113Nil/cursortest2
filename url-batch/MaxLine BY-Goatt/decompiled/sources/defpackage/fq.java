package defpackage;

import com.facebook.internal.NativeProtocol;
import com.google.firebase.encoders.json.BuildConfig;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fq implements pq, oq, Cloneable, ByteChannel {
    public ug2 m;
    public long n;

    public final dr A(int i) {
        if (i == 0) {
            return dr.p;
        }
        o70.r(this.n, 0L, i);
        ug2 ug2Var = this.m;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            ug2Var.getClass();
            int i5 = ug2Var.c;
            int i6 = ug2Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            ug2Var = ug2Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        ug2 ug2Var2 = this.m;
        int i7 = 0;
        while (i2 < i) {
            ug2Var2.getClass();
            bArr[i7] = ug2Var2.a;
            i2 += ug2Var2.c - ug2Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = ug2Var2.b;
            ug2Var2.d = true;
            i7++;
            ug2Var2 = ug2Var2.f;
        }
        return new yg2(bArr, iArr);
    }

    public final ug2 B(int i) {
        if (i < 1 || i > 8192) {
            lh.e("unexpected capacity");
            return null;
        }
        ug2 ug2Var = this.m;
        if (ug2Var == null) {
            ug2 b = xg2.b();
            this.m = b;
            b.g = b;
            b.f = b;
            return b;
        }
        ug2 ug2Var2 = ug2Var.g;
        ug2Var2.getClass();
        if (ug2Var2.c + i <= 8192 && ug2Var2.e) {
            return ug2Var2;
        }
        ug2 b2 = xg2.b();
        ug2Var2.b(b2);
        return b2;
    }

    public final void C(int i, byte[] bArr) {
        bArr.getClass();
        long j = i;
        o70.r(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            ug2 B = B(1);
            int min = Math.min(i - i2, 8192 - B.c);
            int i3 = i2 + min;
            ni.c(B.c, i2, i3, bArr, B.a);
            B.c += min;
            i2 = i3;
        }
        this.n += j;
    }

    @Override // defpackage.pq
    public final void F(long j) {
        if (this.n < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.oq
    public final /* bridge */ /* synthetic */ oq G(String str) {
        Q(str);
        return this;
    }

    public final void H(dr drVar) {
        drVar.getClass();
        drVar.q(this, drVar.c());
    }

    public final void J(pn2 pn2Var) {
        pn2Var.getClass();
        while (pn2Var.h(8192L, this) != -1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    @Override // defpackage.pq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long K() {
        int i;
        if (this.n == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            ug2 ug2Var = this.m;
            ug2Var.getClass();
            byte[] bArr = ug2Var.a;
            int i3 = ug2Var.b;
            int i4 = ug2Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = ap.a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.m = ug2Var.a();
                        xg2.a(ug2Var);
                    } else {
                        ug2Var.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    fq fqVar = new fq();
                    fqVar.N(j);
                    fqVar.L(b);
                    throw new NumberFormatException("Number too large: ".concat(fqVar.y(fqVar.n, yt.b)));
                }
                j = (j << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z) {
            }
        } while (this.m != null);
        this.n -= i2;
        return j;
    }

    public final void L(int i) {
        ug2 B = B(1);
        byte[] bArr = B.a;
        int i2 = B.c;
        B.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.n++;
    }

    public final void N(long j) {
        if (j == 0) {
            L(48);
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
        ug2 B = B(i);
        byte[] bArr = B.a;
        int i2 = B.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = f.a[(int) (15 & j)];
            j >>>= 4;
        }
        B.c += i;
        this.n += i;
    }

    public final void O(int i) {
        ug2 B = B(4);
        byte[] bArr = B.a;
        int i2 = B.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        B.c = i2 + 4;
        this.n += 4;
    }

    public final void P(int i) {
        ug2 B = B(2);
        byte[] bArr = B.a;
        int i2 = B.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        B.c = i2 + 2;
        this.n += 2;
    }

    public final void Q(String str) {
        str.getClass();
        R(str, 0, str.length());
    }

    public final void R(String str, int i, int i2) {
        char charAt;
        str.getClass();
        if (i < 0) {
            lh.c(in1.k(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            lh.c(q40.j("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder n = in1.n(i2, "endIndex > string.length: ", " > ");
            n.append(str.length());
            throw new IllegalArgumentException(n.toString().toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                ug2 B = B(1);
                byte[] bArr = B.a;
                int i3 = B.c - i;
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
                int i5 = B.c;
                int i6 = (i3 + i) - i5;
                B.c = i5 + i6;
                this.n += i6;
            } else {
                if (charAt2 < 2048) {
                    ug2 B2 = B(2);
                    byte[] bArr2 = B2.a;
                    int i7 = B2.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    B2.c = i7 + 2;
                    this.n += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    ug2 B3 = B(3);
                    byte[] bArr3 = B3.a;
                    int i8 = B3.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    B3.c = i8 + 3;
                    this.n += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        L(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
                        ug2 B4 = B(4);
                        byte[] bArr4 = B4.a;
                        int i11 = B4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        B4.c = i11 + 4;
                        this.n += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void S(int i) {
        if (i < 128) {
            L(i);
            return;
        }
        if (i < 2048) {
            ug2 B = B(2);
            byte[] bArr = B.a;
            int i2 = B.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            B.c = i2 + 2;
            this.n += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            L(63);
            return;
        }
        if (i < 65536) {
            ug2 B2 = B(3);
            byte[] bArr2 = B2.a;
            int i3 = B2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            B2.c = i3 + 3;
            this.n += 3;
            return;
        }
        if (i > 1114111) {
            lh.e("Unexpected code point: 0x".concat(o70.N(i)));
            return;
        }
        ug2 B3 = B(4);
        byte[] bArr3 = B3.a;
        int i4 = B3.c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        B3.c = i4 + 4;
        this.n += 4;
    }

    public final long b() {
        long j = this.n;
        if (j == 0) {
            return 0L;
        }
        ug2 ug2Var = this.m;
        ug2Var.getClass();
        ug2 ug2Var2 = ug2Var.g;
        ug2Var2.getClass();
        return (ug2Var2.c >= 8192 || !ug2Var2.e) ? j : j - (r2 - ug2Var2.b);
    }

    public final Object clone() {
        fq fqVar = new fq();
        if (this.n == 0) {
            return fqVar;
        }
        ug2 ug2Var = this.m;
        ug2Var.getClass();
        ug2 c = ug2Var.c();
        fqVar.m = c;
        c.g = c;
        c.f = c;
        for (ug2 ug2Var2 = ug2Var.f; ug2Var2 != ug2Var; ug2Var2 = ug2Var2.f) {
            ug2 ug2Var3 = c.g;
            ug2Var3.getClass();
            ug2Var2.getClass();
            ug2Var3.b(ug2Var2.c());
        }
        fqVar.n = this.n;
        return fqVar;
    }

    @Override // defpackage.pn2
    public final rx2 e() {
        return rx2.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fq)) {
            return false;
        }
        long j = this.n;
        fq fqVar = (fq) obj;
        if (j != fqVar.n) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        ug2 ug2Var = this.m;
        ug2Var.getClass();
        ug2 ug2Var2 = fqVar.m;
        ug2Var2.getClass();
        int i = ug2Var.b;
        int i2 = ug2Var2.b;
        long j2 = 0;
        while (j2 < this.n) {
            long min = Math.min(ug2Var.c - i, ug2Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (ug2Var.a[i] != ug2Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == ug2Var.c) {
                ug2Var = ug2Var.f;
                ug2Var.getClass();
                i = ug2Var.b;
            }
            if (i2 == ug2Var2.c) {
                ug2Var2 = ug2Var2.f;
                ug2Var2.getClass();
                i2 = ug2Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    public final void f(fq fqVar, long j, long j2) {
        fqVar.getClass();
        long j3 = j;
        o70.r(this.n, j3, j2);
        if (j2 == 0) {
            return;
        }
        fqVar.n += j2;
        ug2 ug2Var = this.m;
        while (true) {
            ug2Var.getClass();
            long j4 = ug2Var.c - ug2Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            ug2Var = ug2Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            ug2Var.getClass();
            ug2 c = ug2Var.c();
            int i = c.b + ((int) j3);
            c.b = i;
            c.c = Math.min(i + ((int) j5), c.c);
            ug2 ug2Var2 = fqVar.m;
            if (ug2Var2 == null) {
                c.g = c;
                c.f = c;
                fqVar.m = c;
            } else {
                ug2 ug2Var3 = ug2Var2.g;
                ug2Var3.getClass();
                ug2Var3.b(c);
            }
            j5 -= c.c - c.b;
            ug2Var = ug2Var.f;
            j3 = 0;
        }
    }

    @Override // defpackage.pn2
    public final long h(long j, fq fqVar) {
        fqVar.getClass();
        if (j < 0) {
            lh.c(q40.i(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.n;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        fqVar.u(j, this);
        return j;
    }

    public final int hashCode() {
        ug2 ug2Var = this.m;
        if (ug2Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ug2Var.c;
            for (int i3 = ug2Var.b; i3 < i2; i3++) {
                i = (i * 31) + ug2Var.a[i3];
            }
            ug2Var = ug2Var.f;
            ug2Var.getClass();
        } while (ug2Var != this.m);
        return i;
    }

    @Override // defpackage.oq
    public final /* bridge */ /* synthetic */ oq i(dr drVar) {
        H(drVar);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.pq
    public final dr k(long j) {
        if (j < 0 || j > 2147483647L) {
            lh.c(q40.i(j, "byteCount: "));
            return null;
        }
        if (this.n < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new dr(s(j));
        }
        dr A = A((int) j);
        skip(j);
        return A;
    }

    public final boolean m() {
        return this.n == 0;
    }

    public final byte n(long j) {
        o70.r(this.n, j, 1L);
        ug2 ug2Var = this.m;
        ug2Var.getClass();
        long j2 = this.n;
        if (j2 - j < j) {
            while (j2 > j) {
                ug2Var = ug2Var.g;
                ug2Var.getClass();
                j2 -= ug2Var.c - ug2Var.b;
            }
            return ug2Var.a[(int) ((ug2Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = ug2Var.c;
            int i2 = ug2Var.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return ug2Var.a[(int) ((i2 + j) - j3)];
            }
            ug2Var = ug2Var.f;
            ug2Var.getClass();
            j3 = j4;
        }
    }

    public final long o(byte b, long j, long j2) {
        ug2 ug2Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.n + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.n;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (ug2Var = this.m) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                ug2Var = ug2Var.g;
                ug2Var.getClass();
                j4 -= ug2Var.c - ug2Var.b;
            }
            while (j4 < j2) {
                byte[] bArr = ug2Var.a;
                int min = (int) Math.min(ug2Var.c, (ug2Var.b + j2) - j4);
                for (int i = (int) ((ug2Var.b + j) - j4); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - ug2Var.b) + j4;
                    }
                }
                j4 += ug2Var.c - ug2Var.b;
                ug2Var = ug2Var.f;
                ug2Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (ug2Var.c - ug2Var.b) + j3;
            if (j5 > j) {
                break;
            }
            ug2Var = ug2Var.f;
            ug2Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = ug2Var.a;
            int min2 = (int) Math.min(ug2Var.c, (ug2Var.b + j2) - j3);
            for (int i2 = (int) ((ug2Var.b + j) - j3); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - ug2Var.b) + j3;
                }
            }
            j3 += ug2Var.c - ug2Var.b;
            ug2Var = ug2Var.f;
            ug2Var.getClass();
            j = j3;
        }
        return -1L;
    }

    public final long p(dr drVar) {
        int i;
        int i2;
        drVar.getClass();
        drVar.getClass();
        ug2 ug2Var = this.m;
        if (ug2Var == null) {
            return -1L;
        }
        long j = this.n;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                ug2Var = ug2Var.g;
                ug2Var.getClass();
                j -= ug2Var.c - ug2Var.b;
            }
            if (drVar.c() == 2) {
                byte h = drVar.h(0);
                byte h2 = drVar.h(1);
                while (j < this.n) {
                    byte[] bArr = ug2Var.a;
                    i = (int) ((ug2Var.b + j2) - j);
                    int i3 = ug2Var.c;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b != h && b != h2) {
                            i++;
                        }
                        i2 = ug2Var.b;
                    }
                    j2 = (ug2Var.c - ug2Var.b) + j;
                    ug2Var = ug2Var.f;
                    ug2Var.getClass();
                    j = j2;
                }
                return -1L;
            }
            byte[] g = drVar.g();
            while (j < this.n) {
                byte[] bArr2 = ug2Var.a;
                i = (int) ((ug2Var.b + j2) - j);
                int i4 = ug2Var.c;
                while (i < i4) {
                    byte b2 = bArr2[i];
                    for (byte b3 : g) {
                        if (b2 == b3) {
                            i2 = ug2Var.b;
                        }
                    }
                    i++;
                }
                j2 = (ug2Var.c - ug2Var.b) + j;
                ug2Var = ug2Var.f;
                ug2Var.getClass();
                j = j2;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = (ug2Var.c - ug2Var.b) + j;
            if (j3 > 0) {
                break;
            }
            ug2Var = ug2Var.f;
            ug2Var.getClass();
            j = j3;
        }
        if (drVar.c() == 2) {
            byte h3 = drVar.h(0);
            byte h4 = drVar.h(1);
            while (j < this.n) {
                byte[] bArr3 = ug2Var.a;
                i = (int) ((ug2Var.b + j2) - j);
                int i5 = ug2Var.c;
                while (i < i5) {
                    byte b4 = bArr3[i];
                    if (b4 != h3 && b4 != h4) {
                        i++;
                    }
                    i2 = ug2Var.b;
                }
                j2 = (ug2Var.c - ug2Var.b) + j;
                ug2Var = ug2Var.f;
                ug2Var.getClass();
                j = j2;
            }
            return -1L;
        }
        byte[] g2 = drVar.g();
        while (j < this.n) {
            byte[] bArr4 = ug2Var.a;
            i = (int) ((ug2Var.b + j2) - j);
            int i6 = ug2Var.c;
            while (i < i6) {
                byte b5 = bArr4[i];
                for (byte b6 : g2) {
                    if (b5 == b6) {
                        i2 = ug2Var.b;
                    }
                }
                i++;
            }
            j2 = (ug2Var.c - ug2Var.b) + j;
            ug2Var = ug2Var.f;
            ug2Var.getClass();
            j = j2;
        }
        return -1L;
        return (i - i2) + j;
    }

    public final boolean q(dr drVar) {
        drVar.getClass();
        int c = drVar.c();
        if (c >= 0 && this.n >= c && drVar.c() >= c) {
            for (int i = 0; i < c; i++) {
                if (n(i) == drVar.h(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.pq
    public final String r() {
        return z(Long.MAX_VALUE);
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        o70.r(bArr.length, i, i2);
        ug2 ug2Var = this.m;
        if (ug2Var == null) {
            return -1;
        }
        int min = Math.min(i2, ug2Var.c - ug2Var.b);
        byte[] bArr2 = ug2Var.a;
        int i3 = ug2Var.b;
        ni.c(i, i3, i3 + min, bArr2, bArr);
        int i4 = ug2Var.b + min;
        ug2Var.b = i4;
        this.n -= min;
        if (i4 == ug2Var.c) {
            this.m = ug2Var.a();
            xg2.a(ug2Var);
        }
        return min;
    }

    @Override // defpackage.pq
    public final byte readByte() {
        if (this.n == 0) {
            throw new EOFException();
        }
        ug2 ug2Var = this.m;
        ug2Var.getClass();
        int i = ug2Var.b;
        int i2 = ug2Var.c;
        int i3 = i + 1;
        byte b = ug2Var.a[i];
        this.n--;
        if (i3 != i2) {
            ug2Var.b = i3;
            return b;
        }
        this.m = ug2Var.a();
        xg2.a(ug2Var);
        return b;
    }

    @Override // defpackage.pq
    public final int readInt() {
        if (this.n < 4) {
            throw new EOFException();
        }
        ug2 ug2Var = this.m;
        ug2Var.getClass();
        int i = ug2Var.b;
        int i2 = ug2Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = ug2Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.n -= 4;
        if (i5 != i2) {
            ug2Var.b = i5;
            return i6;
        }
        this.m = ug2Var.a();
        xg2.a(ug2Var);
        return i6;
    }

    @Override // defpackage.pq
    public final short readShort() {
        if (this.n < 2) {
            throw new EOFException();
        }
        ug2 ug2Var = this.m;
        ug2Var.getClass();
        int i = ug2Var.b;
        int i2 = ug2Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = ug2Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.n -= 2;
        if (i5 == i2) {
            this.m = ug2Var.a();
            xg2.a(ug2Var);
        } else {
            ug2Var.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.pq
    public final boolean request(long j) {
        return this.n >= j;
    }

    public final byte[] s(long j) {
        if (j < 0 || j > 2147483647L) {
            lh.c(q40.i(j, "byteCount: "));
            return null;
        }
        if (this.n < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = read(bArr, i2, i - i2);
            if (read == -1) {
                throw new EOFException();
            }
            i2 += read;
        }
        return bArr;
    }

    @Override // defpackage.pq
    public final void skip(long j) {
        while (j > 0) {
            ug2 ug2Var = this.m;
            if (ug2Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, ug2Var.c - ug2Var.b);
            long j2 = min;
            this.n -= j2;
            j -= j2;
            int i = ug2Var.b + min;
            ug2Var.b = i;
            if (i == ug2Var.c) {
                this.m = ug2Var.a();
                xg2.a(ug2Var);
            }
        }
    }

    public final String toString() {
        long j = this.n;
        if (j <= 2147483647L) {
            return A((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.n).toString());
    }

    @Override // defpackage.ol2
    public final void u(long j, fq fqVar) {
        ug2 b;
        fqVar.getClass();
        if (fqVar == this) {
            lh.e("source == this");
            return;
        }
        o70.r(fqVar.n, 0L, j);
        while (j > 0) {
            ug2 ug2Var = fqVar.m;
            ug2Var.getClass();
            int i = ug2Var.c;
            ug2 ug2Var2 = fqVar.m;
            ug2Var2.getClass();
            long j2 = i - ug2Var2.b;
            int i2 = 0;
            if (j < j2) {
                ug2 ug2Var3 = this.m;
                ug2 ug2Var4 = ug2Var3 != null ? ug2Var3.g : null;
                if (ug2Var4 != null && ug2Var4.e) {
                    if ((ug2Var4.c + j) - (ug2Var4.d ? 0 : ug2Var4.b) <= 8192) {
                        ug2 ug2Var5 = fqVar.m;
                        ug2Var5.getClass();
                        ug2Var5.d(ug2Var4, (int) j);
                        fqVar.n -= j;
                        this.n += j;
                        return;
                    }
                }
                ug2 ug2Var6 = fqVar.m;
                ug2Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > ug2Var6.c - ug2Var6.b) {
                    lh.e("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    b = ug2Var6.c();
                } else {
                    b = xg2.b();
                    byte[] bArr = ug2Var6.a;
                    byte[] bArr2 = b.a;
                    int i4 = ug2Var6.b;
                    ni.c(0, i4, i4 + i3, bArr, bArr2);
                }
                b.c = b.b + i3;
                ug2Var6.b += i3;
                ug2 ug2Var7 = ug2Var6.g;
                ug2Var7.getClass();
                ug2Var7.b(b);
                fqVar.m = b;
            }
            ug2 ug2Var8 = fqVar.m;
            ug2Var8.getClass();
            long j3 = ug2Var8.c - ug2Var8.b;
            fqVar.m = ug2Var8.a();
            ug2 ug2Var9 = this.m;
            if (ug2Var9 == null) {
                this.m = ug2Var8;
                ug2Var8.g = ug2Var8;
                ug2Var8.f = ug2Var8;
            } else {
                ug2 ug2Var10 = ug2Var9.g;
                ug2Var10.getClass();
                ug2Var10.b(ug2Var8);
                ug2 ug2Var11 = ug2Var8.g;
                if (ug2Var11 == ug2Var8) {
                    lh.g("cannot compact");
                    return;
                }
                ug2Var11.getClass();
                if (ug2Var11.e) {
                    int i5 = ug2Var8.c - ug2Var8.b;
                    ug2 ug2Var12 = ug2Var8.g;
                    ug2Var12.getClass();
                    int i6 = 8192 - ug2Var12.c;
                    ug2 ug2Var13 = ug2Var8.g;
                    ug2Var13.getClass();
                    if (!ug2Var13.d) {
                        ug2 ug2Var14 = ug2Var8.g;
                        ug2Var14.getClass();
                        i2 = ug2Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        ug2 ug2Var15 = ug2Var8.g;
                        ug2Var15.getClass();
                        ug2Var8.d(ug2Var15, i5);
                        ug2Var8.a();
                        xg2.a(ug2Var8);
                    }
                }
            }
            fqVar.n -= j3;
            this.n += j3;
            j -= j3;
        }
    }

    public final short v() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            ug2 B = B(1);
            int min = Math.min(i, 8192 - B.c);
            byteBuffer.get(B.a, B.c, min);
            i -= min;
            B.c += min;
        }
        this.n += remaining;
        return remaining;
    }

    @Override // defpackage.oq
    public final /* bridge */ /* synthetic */ oq writeByte(int i) {
        L(i);
        return this;
    }

    @Override // defpackage.oq
    public final /* bridge */ /* synthetic */ oq writeInt(int i) {
        O(i);
        return this;
    }

    @Override // defpackage.oq
    public final /* bridge */ /* synthetic */ oq writeShort(int i) {
        P(i);
        return this;
    }

    @Override // defpackage.pq
    public final long x(n62 n62Var) {
        long j = this.n;
        if (j > 0) {
            n62Var.u(j, this);
        }
        return j;
    }

    public final String y(long j, Charset charset) {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            lh.c(q40.i(j, "byteCount: "));
            return null;
        }
        if (this.n < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return BuildConfig.FLAVOR;
        }
        ug2 ug2Var = this.m;
        ug2Var.getClass();
        int i = ug2Var.b;
        if (i + j > ug2Var.c) {
            return new String(s(j), charset);
        }
        int i2 = (int) j;
        String str = new String(ug2Var.a, i, i2, charset);
        int i3 = ug2Var.b + i2;
        ug2Var.b = i3;
        this.n -= j;
        if (i3 == ug2Var.c) {
            this.m = ug2Var.a();
            xg2.a(ug2Var);
        }
        return str;
    }

    @Override // defpackage.pq
    public final String z(long j) {
        if (j < 0) {
            lh.c(q40.i(j, "limit < 0: "));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long o = o((byte) 10, 0L, j2);
        if (o != -1) {
            return f.a(o, this);
        }
        if (j2 < this.n && n(j2 - 1) == 13 && n(j2) == 10) {
            return f.a(j2, this);
        }
        fq fqVar = new fq();
        f(fqVar, 0L, Math.min(32L, this.n));
        throw new EOFException("\\n not found: limit=" + Math.min(this.n, j) + " content=" + fqVar.k(fqVar.n).d() + (char) 8230);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.ol2
    public final void close() {
    }

    @Override // defpackage.oq, defpackage.ol2, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.pq
    public final fq t() {
        return this;
    }

    @Override // defpackage.oq
    public final oq write(byte[] bArr) {
        C(bArr.length, bArr);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ug2 ug2Var = this.m;
        if (ug2Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), ug2Var.c - ug2Var.b);
        byteBuffer.put(ug2Var.a, ug2Var.b, min);
        int i = ug2Var.b + min;
        ug2Var.b = i;
        this.n -= min;
        if (i == ug2Var.c) {
            this.m = ug2Var.a();
            xg2.a(ug2Var);
        }
        return min;
    }
}
