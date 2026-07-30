package f8;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: f, reason: collision with root package name */
    public b0 f3597f;

    /* renamed from: g, reason: collision with root package name */
    public long f3598g;

    public final String D(long j8, Charset charset) {
        r6.k.f(charset, "charset");
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(a0.m.h(j8, "byteCount: ").toString());
        }
        if (this.f3598g < j8) {
            throw new EOFException();
        }
        if (j8 == 0) {
            return "";
        }
        b0 b0Var = this.f3597f;
        r6.k.c(b0Var);
        int i7 = b0Var.f3572b;
        if (i7 + j8 > b0Var.f3573c) {
            return new String(w(j8), charset);
        }
        int i8 = (int) j8;
        String str = new String(b0Var.f3571a, i7, i8, charset);
        int i9 = b0Var.f3572b + i8;
        b0Var.f3572b = i9;
        this.f3598g -= j8;
        if (i9 == b0Var.f3573c) {
            this.f3597f = b0Var.a();
            c0.a(b0Var);
        }
        return str;
    }

    public final i E(int i7) {
        if (i7 == 0) {
            return i.f3600i;
        }
        t6.a.t(this.f3598g, 0L, i7);
        b0 b0Var = this.f3597f;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            r6.k.c(b0Var);
            int i11 = b0Var.f3573c;
            int i12 = b0Var.f3572b;
            if (i11 == i12) {
                throw new AssertionError("s.limit == s.pos");
            }
            i9 += i11 - i12;
            i10++;
            b0Var = b0Var.f3576f;
        }
        byte[][] bArr = new byte[i10][];
        int[] iArr = new int[i10 * 2];
        b0 b0Var2 = this.f3597f;
        int i13 = 0;
        while (i8 < i7) {
            r6.k.c(b0Var2);
            bArr[i13] = b0Var2.f3571a;
            i8 += b0Var2.f3573c - b0Var2.f3572b;
            iArr[i13] = Math.min(i8, i7);
            iArr[i13 + i10] = b0Var2.f3572b;
            b0Var2.f3574d = true;
            i13++;
            b0Var2 = b0Var2.f3576f;
        }
        return new d0(bArr, iArr);
    }

    public final b0 F(int i7) {
        if (i7 < 1 || i7 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        b0 b0Var = this.f3597f;
        if (b0Var == null) {
            b0 b9 = c0.b();
            this.f3597f = b9;
            b9.f3577g = b9;
            b9.f3576f = b9;
            return b9;
        }
        b0 b0Var2 = b0Var.f3577g;
        r6.k.c(b0Var2);
        if (b0Var2.f3573c + i7 <= 8192 && b0Var2.f3575e) {
            return b0Var2;
        }
        b0 b10 = c0.b();
        b0Var2.b(b10);
        return b10;
    }

    public final void I(i iVar) {
        r6.k.f(iVar, "byteString");
        iVar.D(this, iVar.e());
    }

    @Override // f8.h
    public final void J(long j8) {
        if (this.f3598g < j8) {
            throw new EOFException();
        }
    }

    @Override // f8.g
    public final /* bridge */ /* synthetic */ g K(String str) {
        X(str);
        return this;
    }

    @Override // f8.h
    public final int M(v vVar) {
        r6.k.f(vVar, "options");
        int b9 = g8.a.b(this, vVar, false);
        if (b9 == -1) {
            return -1;
        }
        skip(vVar.f3643f[b9].e());
        return b9;
    }

    public final void N(g0 g0Var) {
        r6.k.f(g0Var, "source");
        while (g0Var.v(8192L, this) != -1) {
        }
    }

    @Override // f8.g
    public final /* bridge */ /* synthetic */ g P(i iVar) {
        I(iVar);
        return this;
    }

    public final void Q(int i7) {
        b0 F = F(1);
        byte[] bArr = F.f3571a;
        int i8 = F.f3573c;
        F.f3573c = i8 + 1;
        bArr[i8] = (byte) i7;
        this.f3598g++;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    @Override // f8.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long R() {
        int i7;
        if (this.f3598g == 0) {
            throw new EOFException();
        }
        int i8 = 0;
        boolean z8 = false;
        long j8 = 0;
        do {
            b0 b0Var = this.f3597f;
            r6.k.c(b0Var);
            byte[] bArr = b0Var.f3571a;
            int i9 = b0Var.f3572b;
            int i10 = b0Var.f3573c;
            while (i9 < i10) {
                byte b9 = bArr[i9];
                if (b9 >= 48 && b9 <= 57) {
                    i7 = b9 - 48;
                } else if (b9 >= 97 && b9 <= 102) {
                    i7 = b9 - 87;
                } else if (b9 < 65 || b9 > 70) {
                    z8 = true;
                    if (i8 == 0) {
                        char[] cArr = g8.b.f4537a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b9 >> 4) & 15], cArr[b9 & 15]})));
                    }
                    if (i9 != i10) {
                        this.f3597f = b0Var.a();
                        c0.a(b0Var);
                    } else {
                        b0Var.f3572b = i9;
                    }
                    if (!z8) {
                        break;
                    }
                } else {
                    i7 = b9 - 55;
                }
                if (((-1152921504606846976L) & j8) != 0) {
                    f fVar = new f();
                    fVar.T(j8);
                    fVar.Q(b9);
                    throw new NumberFormatException("Number too large: ".concat(fVar.D(fVar.f3598g, z6.a.f10114a)));
                }
                j8 = (j8 << 4) | i7;
                i9++;
                i8++;
            }
            if (i9 != i10) {
            }
            if (!z8) {
            }
        } while (this.f3597f != null);
        this.f3598g -= i8;
        return j8;
    }

    @Override // f8.h
    public final String S(Charset charset) {
        return D(this.f3598g, charset);
    }

    public final void T(long j8) {
        if (j8 == 0) {
            Q(48);
            return;
        }
        long j9 = (j8 >>> 1) | j8;
        long j10 = j9 | (j9 >>> 2);
        long j11 = j10 | (j10 >>> 4);
        long j12 = j11 | (j11 >>> 8);
        long j13 = j12 | (j12 >>> 16);
        long j14 = j13 | (j13 >>> 32);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i7 = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + 3) / 4);
        b0 F = F(i7);
        byte[] bArr = F.f3571a;
        int i8 = F.f3573c;
        for (int i9 = (i8 + i7) - 1; i9 >= i8; i9--) {
            bArr[i9] = g8.a.f4536a[(int) (15 & j8)];
            j8 >>>= 4;
        }
        F.f3573c += i7;
        this.f3598g += i7;
    }

    public final void U(int i7) {
        b0 F = F(4);
        byte[] bArr = F.f3571a;
        int i8 = F.f3573c;
        bArr[i8] = (byte) ((i7 >>> 24) & 255);
        bArr[i8 + 1] = (byte) ((i7 >>> 16) & 255);
        bArr[i8 + 2] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 3] = (byte) (i7 & 255);
        F.f3573c = i8 + 4;
        this.f3598g += 4;
    }

    public final void V(int i7) {
        b0 F = F(2);
        byte[] bArr = F.f3571a;
        int i8 = F.f3573c;
        bArr[i8] = (byte) ((i7 >>> 8) & 255);
        bArr[i8 + 1] = (byte) (i7 & 255);
        F.f3573c = i8 + 2;
        this.f3598g += 2;
    }

    public final void W(int i7, int i8, String str) {
        char charAt;
        r6.k.f(str, "string");
        if (i7 < 0) {
            throw new IllegalArgumentException(a0.m.i("beginIndex < 0: ", i7).toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(r6.i.b(i8, i7, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i8 > str.length()) {
            StringBuilder n8 = a0.m.n(i8, "endIndex > string.length: ", " > ");
            n8.append(str.length());
            throw new IllegalArgumentException(n8.toString().toString());
        }
        while (i7 < i8) {
            char charAt2 = str.charAt(i7);
            if (charAt2 < 128) {
                b0 F = F(1);
                byte[] bArr = F.f3571a;
                int i9 = F.f3573c - i7;
                int min = Math.min(i8, 8192 - i9);
                int i10 = i7 + 1;
                bArr[i7 + i9] = (byte) charAt2;
                while (true) {
                    i7 = i10;
                    if (i7 >= min || (charAt = str.charAt(i7)) >= 128) {
                        break;
                    }
                    i10 = i7 + 1;
                    bArr[i7 + i9] = (byte) charAt;
                }
                int i11 = F.f3573c;
                int i12 = (i9 + i7) - i11;
                F.f3573c = i11 + i12;
                this.f3598g += i12;
            } else {
                if (charAt2 < 2048) {
                    b0 F2 = F(2);
                    byte[] bArr2 = F2.f3571a;
                    int i13 = F2.f3573c;
                    bArr2[i13] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i13 + 1] = (byte) ((charAt2 & '?') | 128);
                    F2.f3573c = i13 + 2;
                    this.f3598g += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    b0 F3 = F(3);
                    byte[] bArr3 = F3.f3571a;
                    int i14 = F3.f3573c;
                    bArr3[i14] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i14 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i14 + 2] = (byte) ((charAt2 & '?') | 128);
                    F3.f3573c = i14 + 3;
                    this.f3598g += 3;
                } else {
                    int i15 = i7 + 1;
                    char charAt3 = i15 < i8 ? str.charAt(i15) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        Q(63);
                        i7 = i15;
                    } else {
                        int i16 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        b0 F4 = F(4);
                        byte[] bArr4 = F4.f3571a;
                        int i17 = F4.f3573c;
                        bArr4[i17] = (byte) ((i16 >> 18) | 240);
                        bArr4[i17 + 1] = (byte) (((i16 >> 12) & 63) | 128);
                        bArr4[i17 + 2] = (byte) (((i16 >> 6) & 63) | 128);
                        bArr4[i17 + 3] = (byte) ((i16 & 63) | 128);
                        F4.f3573c = i17 + 4;
                        this.f3598g += 4;
                        i7 += 2;
                    }
                }
                i7++;
            }
        }
    }

    public final void X(String str) {
        r6.k.f(str, "string");
        W(0, str.length(), str);
    }

    public final void Y(int i7) {
        String str;
        if (i7 < 128) {
            Q(i7);
            return;
        }
        if (i7 < 2048) {
            b0 F = F(2);
            byte[] bArr = F.f3571a;
            int i8 = F.f3573c;
            bArr[i8] = (byte) ((i7 >> 6) | 192);
            bArr[i8 + 1] = (byte) ((i7 & 63) | 128);
            F.f3573c = i8 + 2;
            this.f3598g += 2;
            return;
        }
        if (55296 <= i7 && i7 < 57344) {
            Q(63);
            return;
        }
        if (i7 < 65536) {
            b0 F2 = F(3);
            byte[] bArr2 = F2.f3571a;
            int i9 = F2.f3573c;
            bArr2[i9] = (byte) ((i7 >> 12) | 224);
            bArr2[i9 + 1] = (byte) (((i7 >> 6) & 63) | 128);
            bArr2[i9 + 2] = (byte) ((i7 & 63) | 128);
            F2.f3573c = i9 + 3;
            this.f3598g += 3;
            return;
        }
        if (i7 <= 1114111) {
            b0 F3 = F(4);
            byte[] bArr3 = F3.f3571a;
            int i10 = F3.f3573c;
            bArr3[i10] = (byte) ((i7 >> 18) | 240);
            bArr3[i10 + 1] = (byte) (((i7 >> 12) & 63) | 128);
            bArr3[i10 + 2] = (byte) (((i7 >> 6) & 63) | 128);
            bArr3[i10 + 3] = (byte) ((i7 & 63) | 128);
            F3.f3573c = i10 + 4;
            this.f3598g += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i7 != 0) {
            char[] cArr = g8.b.f4537a;
            char[] cArr2 = {cArr[(i7 >> 28) & 15], cArr[(i7 >> 24) & 15], cArr[(i7 >> 20) & 15], cArr[(i7 >> 16) & 15], cArr[(i7 >> 12) & 15], cArr[(i7 >> 8) & 15], cArr[(i7 >> 4) & 15], cArr[i7 & 15]};
            int i11 = 0;
            while (i11 < 8 && cArr2[i11] == '0') {
                i11++;
            }
            j1.c.N(i11, 8, 8);
            str = new String(cArr2, i11, 8 - i11);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // f8.g0
    public final i0 a() {
        return i0.f3604d;
    }

    public final void b(f fVar, long j8, long j9) {
        r6.k.f(fVar, "out");
        long j10 = j8;
        t6.a.t(this.f3598g, j10, j9);
        if (j9 == 0) {
            return;
        }
        fVar.f3598g += j9;
        b0 b0Var = this.f3597f;
        while (true) {
            r6.k.c(b0Var);
            long j11 = b0Var.f3573c - b0Var.f3572b;
            if (j10 < j11) {
                break;
            }
            j10 -= j11;
            b0Var = b0Var.f3576f;
        }
        b0 b0Var2 = b0Var;
        long j12 = j9;
        while (j12 > 0) {
            r6.k.c(b0Var2);
            b0 c4 = b0Var2.c();
            int i7 = c4.f3572b + ((int) j10);
            c4.f3572b = i7;
            c4.f3573c = Math.min(i7 + ((int) j12), c4.f3573c);
            b0 b0Var3 = fVar.f3597f;
            if (b0Var3 == null) {
                c4.f3577g = c4;
                c4.f3576f = c4;
                fVar.f3597f = c4;
            } else {
                b0 b0Var4 = b0Var3.f3577g;
                r6.k.c(b0Var4);
                b0Var4.b(c4);
            }
            j12 -= c4.f3573c - c4.f3572b;
            b0Var2 = b0Var2.f3576f;
            j10 = 0;
        }
    }

    public final boolean c() {
        return this.f3598g == 0;
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f3598g == 0) {
            return fVar;
        }
        b0 b0Var = this.f3597f;
        r6.k.c(b0Var);
        b0 c4 = b0Var.c();
        fVar.f3597f = c4;
        c4.f3577g = c4;
        c4.f3576f = c4;
        for (b0 b0Var2 = b0Var.f3576f; b0Var2 != b0Var; b0Var2 = b0Var2.f3576f) {
            b0 b0Var3 = c4.f3577g;
            r6.k.c(b0Var3);
            r6.k.c(b0Var2);
            b0Var3.b(b0Var2.c());
        }
        fVar.f3598g = this.f3598g;
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        long j8 = this.f3598g;
        f fVar = (f) obj;
        if (j8 != fVar.f3598g) {
            return false;
        }
        if (j8 == 0) {
            return true;
        }
        b0 b0Var = this.f3597f;
        r6.k.c(b0Var);
        b0 b0Var2 = fVar.f3597f;
        r6.k.c(b0Var2);
        int i7 = b0Var.f3572b;
        int i8 = b0Var2.f3572b;
        long j9 = 0;
        while (j9 < this.f3598g) {
            long min = Math.min(b0Var.f3573c - i7, b0Var2.f3573c - i8);
            long j10 = 0;
            while (j10 < min) {
                int i9 = i7 + 1;
                int i10 = i8 + 1;
                if (b0Var.f3571a[i7] != b0Var2.f3571a[i8]) {
                    return false;
                }
                j10++;
                i7 = i9;
                i8 = i10;
            }
            if (i7 == b0Var.f3573c) {
                b0Var = b0Var.f3576f;
                r6.k.c(b0Var);
                i7 = b0Var.f3572b;
            }
            if (i8 == b0Var2.f3573c) {
                b0Var2 = b0Var2.f3576f;
                r6.k.c(b0Var2);
                i8 = b0Var2.f3572b;
            }
            j9 += min;
        }
        return true;
    }

    @Override // f8.e0
    public final void f(long j8, f fVar) {
        b0 b9;
        r6.k.f(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        t6.a.t(fVar.f3598g, 0L, j8);
        while (j8 > 0) {
            b0 b0Var = fVar.f3597f;
            r6.k.c(b0Var);
            int i7 = b0Var.f3573c;
            b0 b0Var2 = fVar.f3597f;
            r6.k.c(b0Var2);
            long j9 = i7 - b0Var2.f3572b;
            int i8 = 0;
            if (j8 < j9) {
                b0 b0Var3 = this.f3597f;
                b0 b0Var4 = b0Var3 != null ? b0Var3.f3577g : null;
                if (b0Var4 != null && b0Var4.f3575e) {
                    if ((b0Var4.f3573c + j8) - (b0Var4.f3574d ? 0 : b0Var4.f3572b) <= 8192) {
                        b0 b0Var5 = fVar.f3597f;
                        r6.k.c(b0Var5);
                        b0Var5.d(b0Var4, (int) j8);
                        fVar.f3598g -= j8;
                        this.f3598g += j8;
                        return;
                    }
                }
                b0 b0Var6 = fVar.f3597f;
                r6.k.c(b0Var6);
                int i9 = (int) j8;
                if (i9 <= 0 || i9 > b0Var6.f3573c - b0Var6.f3572b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i9 >= 1024) {
                    b9 = b0Var6.c();
                } else {
                    b9 = c0.b();
                    byte[] bArr = b0Var6.f3571a;
                    byte[] bArr2 = b9.f3571a;
                    int i10 = b0Var6.f3572b;
                    e6.k.U(0, i10, i10 + i9, bArr, bArr2);
                }
                b9.f3573c = b9.f3572b + i9;
                b0Var6.f3572b += i9;
                b0 b0Var7 = b0Var6.f3577g;
                r6.k.c(b0Var7);
                b0Var7.b(b9);
                fVar.f3597f = b9;
            }
            b0 b0Var8 = fVar.f3597f;
            r6.k.c(b0Var8);
            long j10 = b0Var8.f3573c - b0Var8.f3572b;
            fVar.f3597f = b0Var8.a();
            b0 b0Var9 = this.f3597f;
            if (b0Var9 == null) {
                this.f3597f = b0Var8;
                b0Var8.f3577g = b0Var8;
                b0Var8.f3576f = b0Var8;
            } else {
                b0 b0Var10 = b0Var9.f3577g;
                r6.k.c(b0Var10);
                b0Var10.b(b0Var8);
                b0 b0Var11 = b0Var8.f3577g;
                if (b0Var11 == b0Var8) {
                    throw new IllegalStateException("cannot compact");
                }
                r6.k.c(b0Var11);
                if (b0Var11.f3575e) {
                    int i11 = b0Var8.f3573c - b0Var8.f3572b;
                    b0 b0Var12 = b0Var8.f3577g;
                    r6.k.c(b0Var12);
                    int i12 = 8192 - b0Var12.f3573c;
                    b0 b0Var13 = b0Var8.f3577g;
                    r6.k.c(b0Var13);
                    if (!b0Var13.f3574d) {
                        b0 b0Var14 = b0Var8.f3577g;
                        r6.k.c(b0Var14);
                        i8 = b0Var14.f3572b;
                    }
                    if (i11 <= i12 + i8) {
                        b0 b0Var15 = b0Var8.f3577g;
                        r6.k.c(b0Var15);
                        b0Var8.d(b0Var15, i11);
                        b0Var8.a();
                        c0.a(b0Var8);
                    }
                }
            }
            fVar.f3598g -= j10;
            this.f3598g += j10;
            j8 -= j10;
        }
    }

    @Override // f8.h
    public final i h(long j8) {
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(a0.m.h(j8, "byteCount: ").toString());
        }
        if (this.f3598g < j8) {
            throw new EOFException();
        }
        if (j8 < 4096) {
            return new i(w(j8));
        }
        i E = E((int) j8);
        skip(j8);
        return E;
    }

    public final int hashCode() {
        b0 b0Var = this.f3597f;
        if (b0Var == null) {
            return 0;
        }
        int i7 = 1;
        do {
            int i8 = b0Var.f3573c;
            for (int i9 = b0Var.f3572b; i9 < i8; i9++) {
                i7 = (i7 * 31) + b0Var.f3571a[i9];
            }
            b0Var = b0Var.f3576f;
            r6.k.c(b0Var);
        } while (b0Var != this.f3597f);
        return i7;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final byte k(long j8) {
        t6.a.t(this.f3598g, j8, 1L);
        b0 b0Var = this.f3597f;
        if (b0Var == null) {
            r6.k.c(null);
            throw null;
        }
        long j9 = this.f3598g;
        if (j9 - j8 < j8) {
            while (j9 > j8) {
                b0Var = b0Var.f3577g;
                r6.k.c(b0Var);
                j9 -= b0Var.f3573c - b0Var.f3572b;
            }
            return b0Var.f3571a[(int) ((b0Var.f3572b + j8) - j9)];
        }
        long j10 = 0;
        while (true) {
            int i7 = b0Var.f3573c;
            int i8 = b0Var.f3572b;
            long j11 = (i7 - i8) + j10;
            if (j11 > j8) {
                return b0Var.f3571a[(int) ((i8 + j8) - j10)];
            }
            b0Var = b0Var.f3576f;
            r6.k.c(b0Var);
            j10 = j11;
        }
    }

    public final long n(byte b9, long j8, long j9) {
        b0 b0Var;
        long j10 = 0;
        if (0 > j8 || j8 > j9) {
            throw new IllegalArgumentException(("size=" + this.f3598g + " fromIndex=" + j8 + " toIndex=" + j9).toString());
        }
        long j11 = this.f3598g;
        if (j9 > j11) {
            j9 = j11;
        }
        if (j8 == j9 || (b0Var = this.f3597f) == null) {
            return -1L;
        }
        if (j11 - j8 < j8) {
            while (j11 > j8) {
                b0Var = b0Var.f3577g;
                r6.k.c(b0Var);
                j11 -= b0Var.f3573c - b0Var.f3572b;
            }
            while (j11 < j9) {
                byte[] bArr = b0Var.f3571a;
                int min = (int) Math.min(b0Var.f3573c, (b0Var.f3572b + j9) - j11);
                for (int i7 = (int) ((b0Var.f3572b + j8) - j11); i7 < min; i7++) {
                    if (bArr[i7] == b9) {
                        return (i7 - b0Var.f3572b) + j11;
                    }
                }
                j11 += b0Var.f3573c - b0Var.f3572b;
                b0Var = b0Var.f3576f;
                r6.k.c(b0Var);
                j8 = j11;
            }
            return -1L;
        }
        while (true) {
            long j12 = (b0Var.f3573c - b0Var.f3572b) + j10;
            if (j12 > j8) {
                break;
            }
            b0Var = b0Var.f3576f;
            r6.k.c(b0Var);
            j10 = j12;
        }
        while (j10 < j9) {
            byte[] bArr2 = b0Var.f3571a;
            int min2 = (int) Math.min(b0Var.f3573c, (b0Var.f3572b + j9) - j10);
            for (int i8 = (int) ((b0Var.f3572b + j8) - j10); i8 < min2; i8++) {
                if (bArr2[i8] == b9) {
                    return (i8 - b0Var.f3572b) + j10;
                }
            }
            j10 += b0Var.f3573c - b0Var.f3572b;
            b0Var = b0Var.f3576f;
            r6.k.c(b0Var);
            j8 = j10;
        }
        return -1L;
    }

    @Override // f8.h
    public final String q() {
        return y(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        r6.k.f(byteBuffer, "sink");
        b0 b0Var = this.f3597f;
        if (b0Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), b0Var.f3573c - b0Var.f3572b);
        byteBuffer.put(b0Var.f3571a, b0Var.f3572b, min);
        int i7 = b0Var.f3572b + min;
        b0Var.f3572b = i7;
        this.f3598g -= min;
        if (i7 == b0Var.f3573c) {
            this.f3597f = b0Var.a();
            c0.a(b0Var);
        }
        return min;
    }

    @Override // f8.h
    public final byte readByte() {
        if (this.f3598g == 0) {
            throw new EOFException();
        }
        b0 b0Var = this.f3597f;
        r6.k.c(b0Var);
        int i7 = b0Var.f3572b;
        int i8 = b0Var.f3573c;
        int i9 = i7 + 1;
        byte b9 = b0Var.f3571a[i7];
        this.f3598g--;
        if (i9 != i8) {
            b0Var.f3572b = i9;
            return b9;
        }
        this.f3597f = b0Var.a();
        c0.a(b0Var);
        return b9;
    }

    @Override // f8.h
    public final int readInt() {
        if (this.f3598g < 4) {
            throw new EOFException();
        }
        b0 b0Var = this.f3597f;
        r6.k.c(b0Var);
        int i7 = b0Var.f3572b;
        int i8 = b0Var.f3573c;
        if (i8 - i7 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = b0Var.f3571a;
        int i9 = i7 + 3;
        int i10 = ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 2] & 255) << 8);
        int i11 = i7 + 4;
        int i12 = (bArr[i9] & 255) | i10;
        this.f3598g -= 4;
        if (i11 != i8) {
            b0Var.f3572b = i11;
            return i12;
        }
        this.f3597f = b0Var.a();
        c0.a(b0Var);
        return i12;
    }

    @Override // f8.h
    public final short readShort() {
        if (this.f3598g < 2) {
            throw new EOFException();
        }
        b0 b0Var = this.f3597f;
        r6.k.c(b0Var);
        int i7 = b0Var.f3572b;
        int i8 = b0Var.f3573c;
        if (i8 - i7 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = b0Var.f3571a;
        int i9 = i7 + 1;
        int i10 = (bArr[i7] & 255) << 8;
        int i11 = i7 + 2;
        int i12 = (bArr[i9] & 255) | i10;
        this.f3598g -= 2;
        if (i11 == i8) {
            this.f3597f = b0Var.a();
            c0.a(b0Var);
        } else {
            b0Var.f3572b = i11;
        }
        return (short) i12;
    }

    @Override // f8.h
    public final void skip(long j8) {
        while (j8 > 0) {
            b0 b0Var = this.f3597f;
            if (b0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j8, b0Var.f3573c - b0Var.f3572b);
            long j9 = min;
            this.f3598g -= j9;
            j8 -= j9;
            int i7 = b0Var.f3572b + min;
            b0Var.f3572b = i7;
            if (i7 == b0Var.f3573c) {
                this.f3597f = b0Var.a();
                c0.a(b0Var);
            }
        }
    }

    public final long t(i iVar) {
        int i7;
        int i8;
        r6.k.f(iVar, "targetBytes");
        b0 b0Var = this.f3597f;
        if (b0Var == null) {
            return -1L;
        }
        long j8 = this.f3598g;
        long j9 = 0;
        if (j8 < 0) {
            while (j8 > 0) {
                b0Var = b0Var.f3577g;
                r6.k.c(b0Var);
                j8 -= b0Var.f3573c - b0Var.f3572b;
            }
            if (iVar.e() == 2) {
                byte p6 = iVar.p(0);
                byte p8 = iVar.p(1);
                while (j8 < this.f3598g) {
                    byte[] bArr = b0Var.f3571a;
                    i7 = (int) ((b0Var.f3572b + j9) - j8);
                    int i9 = b0Var.f3573c;
                    while (i7 < i9) {
                        byte b9 = bArr[i7];
                        if (b9 != p6 && b9 != p8) {
                            i7++;
                        }
                        i8 = b0Var.f3572b;
                    }
                    j9 = (b0Var.f3573c - b0Var.f3572b) + j8;
                    b0Var = b0Var.f3576f;
                    r6.k.c(b0Var);
                    j8 = j9;
                }
                return -1L;
            }
            byte[] m8 = iVar.m();
            while (j8 < this.f3598g) {
                byte[] bArr2 = b0Var.f3571a;
                i7 = (int) ((b0Var.f3572b + j9) - j8);
                int i10 = b0Var.f3573c;
                while (i7 < i10) {
                    byte b10 = bArr2[i7];
                    for (byte b11 : m8) {
                        if (b10 == b11) {
                            i8 = b0Var.f3572b;
                        }
                    }
                    i7++;
                }
                j9 = (b0Var.f3573c - b0Var.f3572b) + j8;
                b0Var = b0Var.f3576f;
                r6.k.c(b0Var);
                j8 = j9;
            }
            return -1L;
        }
        j8 = 0;
        while (true) {
            long j10 = (b0Var.f3573c - b0Var.f3572b) + j8;
            if (j10 > 0) {
                break;
            }
            b0Var = b0Var.f3576f;
            r6.k.c(b0Var);
            j8 = j10;
        }
        if (iVar.e() == 2) {
            byte p9 = iVar.p(0);
            byte p10 = iVar.p(1);
            while (j8 < this.f3598g) {
                byte[] bArr3 = b0Var.f3571a;
                i7 = (int) ((b0Var.f3572b + j9) - j8);
                int i11 = b0Var.f3573c;
                while (i7 < i11) {
                    byte b12 = bArr3[i7];
                    if (b12 != p9 && b12 != p10) {
                        i7++;
                    }
                    i8 = b0Var.f3572b;
                }
                j9 = (b0Var.f3573c - b0Var.f3572b) + j8;
                b0Var = b0Var.f3576f;
                r6.k.c(b0Var);
                j8 = j9;
            }
            return -1L;
        }
        byte[] m9 = iVar.m();
        while (j8 < this.f3598g) {
            byte[] bArr4 = b0Var.f3571a;
            i7 = (int) ((b0Var.f3572b + j9) - j8);
            int i12 = b0Var.f3573c;
            while (i7 < i12) {
                byte b13 = bArr4[i7];
                for (byte b14 : m9) {
                    if (b13 == b14) {
                        i8 = b0Var.f3572b;
                    }
                }
                i7++;
            }
            j9 = (b0Var.f3573c - b0Var.f3572b) + j8;
            b0Var = b0Var.f3576f;
            r6.k.c(b0Var);
            j8 = j9;
        }
        return -1L;
        return (i7 - i8) + j8;
    }

    public final String toString() {
        long j8 = this.f3598g;
        if (j8 <= 2147483647L) {
            return E((int) j8).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f3598g).toString());
    }

    public final boolean u(i iVar) {
        r6.k.f(iVar, "bytes");
        int e9 = iVar.e();
        if (e9 >= 0 && this.f3598g >= e9 && iVar.e() >= e9) {
            for (int i7 = 0; i7 < e9; i7++) {
                if (k(i7) == iVar.p(i7)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // f8.g0
    public final long v(long j8, f fVar) {
        r6.k.f(fVar, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(a0.m.h(j8, "byteCount < 0: ").toString());
        }
        long j9 = this.f3598g;
        if (j9 == 0) {
            return -1L;
        }
        if (j8 > j9) {
            j8 = j9;
        }
        fVar.f(j8, this);
        return j8;
    }

    public final byte[] w(long j8) {
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(a0.m.h(j8, "byteCount: ").toString());
        }
        if (this.f3598g < j8) {
            throw new EOFException();
        }
        int i7 = (int) j8;
        byte[] bArr = new byte[i7];
        int i8 = 0;
        while (i8 < i7) {
            int read = read(bArr, i8, i7 - i8);
            if (read == -1) {
                throw new EOFException();
            }
            i8 += read;
        }
        return bArr;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        r6.k.f(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i7 = remaining;
        while (i7 > 0) {
            b0 F = F(1);
            int min = Math.min(i7, 8192 - F.f3573c);
            byteBuffer.get(F.f3571a, F.f3573c, min);
            i7 -= min;
            F.f3573c += min;
        }
        this.f3598g += remaining;
        return remaining;
    }

    @Override // f8.g
    public final /* bridge */ /* synthetic */ g writeByte(int i7) {
        Q(i7);
        return this;
    }

    @Override // f8.g
    public final /* bridge */ /* synthetic */ g writeInt(int i7) {
        U(i7);
        return this;
    }

    @Override // f8.g
    public final /* bridge */ /* synthetic */ g writeShort(int i7) {
        V(i7);
        return this;
    }

    @Override // f8.h
    public final String y(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException(a0.m.h(j8, "limit < 0: ").toString());
        }
        long j9 = j8 != Long.MAX_VALUE ? j8 + 1 : Long.MAX_VALUE;
        long n8 = n((byte) 10, 0L, j9);
        if (n8 != -1) {
            return g8.a.a(n8, this);
        }
        if (j9 < this.f3598g && k(j9 - 1) == 13 && k(j9) == 10) {
            return g8.a.a(j9, this);
        }
        f fVar = new f();
        b(fVar, 0L, Math.min(32, this.f3598g));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f3598g, j8) + " content=" + fVar.h(fVar.f3598g).g() + (char) 8230);
    }

    public final short z() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // f8.g
    public final g write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] bArr, int i7, int i8) {
        r6.k.f(bArr, "source");
        long j8 = i8;
        t6.a.t(bArr.length, i7, j8);
        int i9 = i8 + i7;
        while (i7 < i9) {
            b0 F = F(1);
            int min = Math.min(i9 - i7, 8192 - F.f3573c);
            int i10 = i7 + min;
            e6.k.U(F.f3573c, i7, i10, bArr, F.f3571a);
            F.f3573c += min;
            i7 = i10;
        }
        this.f3598g += j8;
    }

    public final int read(byte[] bArr, int i7, int i8) {
        t6.a.t(bArr.length, i7, i8);
        b0 b0Var = this.f3597f;
        if (b0Var == null) {
            return -1;
        }
        int min = Math.min(i8, b0Var.f3573c - b0Var.f3572b);
        byte[] bArr2 = b0Var.f3571a;
        int i9 = b0Var.f3572b;
        e6.k.U(i7, i9, i9 + min, bArr2, bArr);
        int i10 = b0Var.f3572b + min;
        b0Var.f3572b = i10;
        this.f3598g -= min;
        if (i10 == b0Var.f3573c) {
            this.f3597f = b0Var.a();
            c0.a(b0Var);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, f8.e0
    public final void close() {
    }

    @Override // f8.g, f8.e0, java.io.Flushable
    public final void flush() {
    }
}
