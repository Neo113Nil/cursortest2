package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class p8 implements r8, q8, Cloneable, ByteChannel {
    public f20 f;
    public long g;

    public final void A(String str) {
        str.getClass();
        B(str, 0, str.length());
    }

    public final void B(String str, int i, int i2) {
        char charAt;
        str.getClass();
        if (i < 0) {
            o8.e(o30.e("beginIndex < 0: ", i));
            return;
        }
        if (i2 < i) {
            o8.e(o30.d(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            o8.l("endIndex > string.length: ", i2, " > ", str.length());
            return;
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                f20 t = t(1);
                byte[] bArr = t.a;
                int i3 = t.c - i;
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
                int i5 = t.c;
                int i6 = (i3 + i) - i5;
                t.c = i5 + i6;
                this.g += i6;
            } else {
                if (charAt2 < 2048) {
                    f20 t2 = t(2);
                    byte[] bArr2 = t2.a;
                    int i7 = t2.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    t2.c = i7 + 2;
                    this.g += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    f20 t3 = t(3);
                    byte[] bArr3 = t3.a;
                    int i8 = t3.c;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    t3.c = i8 + 3;
                    this.g += 3;
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        w(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        f20 t4 = t(4);
                        byte[] bArr4 = t4.a;
                        int i11 = t4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        t4.c = i11 + 4;
                        this.g += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void C(int i) {
        String str;
        if (i < 128) {
            w(i);
            return;
        }
        if (i < 2048) {
            f20 t = t(2);
            byte[] bArr = t.a;
            int i2 = t.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            t.c = i2 + 2;
            this.g += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            w(63);
            return;
        }
        if (i < 65536) {
            f20 t2 = t(3);
            byte[] bArr2 = t2.a;
            int i3 = t2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            t2.c = i3 + 3;
            this.g += 3;
            return;
        }
        if (i <= 1114111) {
            f20 t3 = t(4);
            byte[] bArr3 = t3.a;
            int i4 = t3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            t3.c = i4 + 4;
            this.g += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = j8.a;
            int i5 = 0;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            if (i5 < 0) {
                throw new IndexOutOfBoundsException("startIndex: " + i5 + ", endIndex: 8, size: 8");
            }
            if (i5 > 8) {
                o8.d(i5, " > endIndex: 8", "startIndex: ");
                return;
            }
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.q30
    public final d60 a() {
        return d60.d;
    }

    @Override // defpackage.q30
    public final long b(long j, p8 p8Var) {
        p8Var.getClass();
        if (j < 0) {
            o8.m("byteCount < 0: ", j);
            return 0L;
        }
        long j2 = this.g;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        p8Var.e(j, this);
        return j;
    }

    @Override // defpackage.r8
    public final t8 c(long j) {
        if (j < 0 || j > 2147483647L) {
            o8.m("byteCount: ", j);
            return null;
        }
        if (this.g < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new t8(q(j));
        }
        t8 s = s((int) j);
        skip(j);
        return s;
    }

    public final Object clone() {
        p8 p8Var = new p8();
        if (this.g == 0) {
            return p8Var;
        }
        f20 f20Var = this.f;
        f20Var.getClass();
        f20 c = f20Var.c();
        p8Var.f = c;
        c.g = c;
        c.f = c;
        for (f20 f20Var2 = f20Var.f; f20Var2 != f20Var; f20Var2 = f20Var2.f) {
            f20 f20Var3 = c.g;
            f20Var3.getClass();
            f20Var2.getClass();
            f20Var3.b(f20Var2.c());
        }
        p8Var.g = this.g;
        return p8Var;
    }

    @Override // defpackage.r8
    public final String d() {
        return f(Long.MAX_VALUE);
    }

    @Override // defpackage.i30
    public final void e(long j, p8 p8Var) {
        f20 b;
        p8Var.getClass();
        if (p8Var == this) {
            o8.j("source == this");
            return;
        }
        op.g(p8Var.g, 0L, j);
        while (j > 0) {
            f20 f20Var = p8Var.f;
            f20Var.getClass();
            int i = f20Var.c;
            f20 f20Var2 = p8Var.f;
            f20Var2.getClass();
            long j2 = i - f20Var2.b;
            int i2 = 0;
            if (j < j2) {
                f20 f20Var3 = this.f;
                f20 f20Var4 = f20Var3 != null ? f20Var3.g : null;
                if (f20Var4 != null && f20Var4.e) {
                    if ((f20Var4.c + j) - (f20Var4.d ? 0 : f20Var4.b) <= 8192) {
                        f20 f20Var5 = p8Var.f;
                        f20Var5.getClass();
                        f20Var5.d(f20Var4, (int) j);
                        p8Var.g -= j;
                        this.g += j;
                        return;
                    }
                }
                f20 f20Var6 = p8Var.f;
                f20Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > f20Var6.c - f20Var6.b) {
                    o8.j("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    b = f20Var6.c();
                } else {
                    b = g20.b();
                    byte[] bArr = f20Var6.a;
                    byte[] bArr2 = b.a;
                    int i4 = f20Var6.b;
                    h7.f0(bArr, bArr2, 0, i4, i4 + i3);
                }
                b.c = b.b + i3;
                f20Var6.b += i3;
                f20 f20Var7 = f20Var6.g;
                f20Var7.getClass();
                f20Var7.b(b);
                p8Var.f = b;
            }
            f20 f20Var8 = p8Var.f;
            f20Var8.getClass();
            long j3 = f20Var8.c - f20Var8.b;
            p8Var.f = f20Var8.a();
            f20 f20Var9 = this.f;
            if (f20Var9 == null) {
                this.f = f20Var8;
                f20Var8.g = f20Var8;
                f20Var8.f = f20Var8;
            } else {
                f20 f20Var10 = f20Var9.g;
                f20Var10.getClass();
                f20Var10.b(f20Var8);
                f20 f20Var11 = f20Var8.g;
                if (f20Var11 == f20Var8) {
                    o8.t("cannot compact");
                    return;
                }
                f20Var11.getClass();
                if (f20Var11.e) {
                    int i5 = f20Var8.c - f20Var8.b;
                    f20 f20Var12 = f20Var8.g;
                    f20Var12.getClass();
                    int i6 = 8192 - f20Var12.c;
                    f20 f20Var13 = f20Var8.g;
                    f20Var13.getClass();
                    if (!f20Var13.d) {
                        f20 f20Var14 = f20Var8.g;
                        f20Var14.getClass();
                        i2 = f20Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        f20 f20Var15 = f20Var8.g;
                        f20Var15.getClass();
                        f20Var8.d(f20Var15, i5);
                        f20Var8.a();
                        g20.a(f20Var8);
                    }
                }
            }
            p8Var.g -= j3;
            this.g += j3;
            j -= j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        long j = this.g;
        p8 p8Var = (p8) obj;
        if (j != p8Var.g) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        f20 f20Var = this.f;
        f20Var.getClass();
        f20 f20Var2 = p8Var.f;
        f20Var2.getClass();
        int i = f20Var.b;
        int i2 = f20Var2.b;
        long j2 = 0;
        while (j2 < this.g) {
            long min = Math.min(f20Var.c - i, f20Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (f20Var.a[i] != f20Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == f20Var.c) {
                f20Var = f20Var.f;
                f20Var.getClass();
                i = f20Var.b;
            }
            if (i2 == f20Var2.c) {
                f20Var2 = f20Var2.f;
                f20Var2.getClass();
                i2 = f20Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    @Override // defpackage.r8
    public final String f(long j) {
        if (j < 0) {
            o8.m("limit < 0: ", j);
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long p = p((byte) 10, 0L, j2);
        if (p != -1) {
            return b.a(p, this);
        }
        if (j2 < this.g && o(j2 - 1) == 13 && o(j2) == 10) {
            return b.a(j2, this);
        }
        p8 p8Var = new p8();
        m(p8Var, 0L, Math.min(32L, this.g));
        throw new EOFException("\\n not found: limit=" + Math.min(this.g, j) + " content=" + p8Var.c(p8Var.g).b() + (char) 8230);
    }

    @Override // defpackage.r8
    public final int g(xw xwVar) {
        xwVar.getClass();
        int b = b.b(this, xwVar, false);
        if (b == -1) {
            return -1;
        }
        skip(xwVar.f[b].a());
        return b;
    }

    @Override // defpackage.r8
    public final void h(long j) {
        if (this.g < j) {
            throw new EOFException();
        }
    }

    public final int hashCode() {
        f20 f20Var = this.f;
        if (f20Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = f20Var.c;
            for (int i3 = f20Var.b; i3 < i2; i3++) {
                i = (i * 31) + f20Var.a[i3];
            }
            f20Var = f20Var.f;
            f20Var.getClass();
        } while (f20Var != this.f);
        return i;
    }

    @Override // defpackage.q8
    public final /* bridge */ /* synthetic */ q8 i(String str) {
        A(str);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.q8
    public final q8 j(t8 t8Var) {
        t8Var.getClass();
        t8Var.i(this, t8Var.a());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    @Override // defpackage.r8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k() {
        int i;
        if (this.g == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            f20 f20Var = this.f;
            f20Var.getClass();
            byte[] bArr = f20Var.a;
            int i3 = f20Var.b;
            int i4 = f20Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = j8.a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.f = f20Var.a();
                        g20.a(f20Var);
                    } else {
                        f20Var.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    p8 p8Var = new p8();
                    p8Var.x(j);
                    p8Var.w(b);
                    throw new NumberFormatException("Number too large: ".concat(p8Var.r(p8Var.g, v9.a)));
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

    @Override // defpackage.r8
    public final String l(Charset charset) {
        return r(this.g, charset);
    }

    public final void m(p8 p8Var, long j, long j2) {
        p8Var.getClass();
        long j3 = j;
        op.g(this.g, j3, j2);
        if (j2 == 0) {
            return;
        }
        p8Var.g += j2;
        f20 f20Var = this.f;
        while (true) {
            f20Var.getClass();
            long j4 = f20Var.c - f20Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            f20Var = f20Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            f20Var.getClass();
            f20 c = f20Var.c();
            int i = c.b + ((int) j3);
            c.b = i;
            c.c = Math.min(i + ((int) j5), c.c);
            f20 f20Var2 = p8Var.f;
            if (f20Var2 == null) {
                c.g = c;
                c.f = c;
                p8Var.f = c;
            } else {
                f20 f20Var3 = f20Var2.g;
                f20Var3.getClass();
                f20Var3.b(c);
            }
            j5 -= c.c - c.b;
            f20Var = f20Var.f;
            j3 = 0;
        }
    }

    public final boolean n() {
        return this.g == 0;
    }

    public final byte o(long j) {
        op.g(this.g, j, 1L);
        f20 f20Var = this.f;
        f20Var.getClass();
        long j2 = this.g;
        if (j2 - j < j) {
            while (j2 > j) {
                f20Var = f20Var.g;
                f20Var.getClass();
                j2 -= f20Var.c - f20Var.b;
            }
            return f20Var.a[(int) ((f20Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = f20Var.c;
            int i2 = f20Var.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return f20Var.a[(int) ((i2 + j) - j3)];
            }
            f20Var = f20Var.f;
            f20Var.getClass();
            j3 = j4;
        }
    }

    public final long p(byte b, long j, long j2) {
        f20 f20Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.g + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.g;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (f20Var = this.f) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                f20Var = f20Var.g;
                f20Var.getClass();
                j4 -= f20Var.c - f20Var.b;
            }
            while (j4 < j2) {
                byte[] bArr = f20Var.a;
                int min = (int) Math.min(f20Var.c, (f20Var.b + j2) - j4);
                for (int i = (int) ((f20Var.b + j) - j4); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - f20Var.b) + j4;
                    }
                }
                j4 += f20Var.c - f20Var.b;
                f20Var = f20Var.f;
                f20Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (f20Var.c - f20Var.b) + j3;
            if (j5 > j) {
                break;
            }
            f20Var = f20Var.f;
            f20Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = f20Var.a;
            int min2 = (int) Math.min(f20Var.c, (f20Var.b + j2) - j3);
            for (int i2 = (int) ((f20Var.b + j) - j3); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - f20Var.b) + j3;
                }
            }
            j3 += f20Var.c - f20Var.b;
            f20Var = f20Var.f;
            f20Var.getClass();
            j = j3;
        }
        return -1L;
    }

    public final byte[] q(long j) {
        int min;
        if (j < 0 || j > 2147483647L) {
            o8.m("byteCount: ", j);
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
            op.g(i, i2, i3);
            f20 f20Var = this.f;
            if (f20Var == null) {
                min = -1;
            } else {
                min = Math.min(i3, f20Var.c - f20Var.b);
                byte[] bArr2 = f20Var.a;
                int i4 = f20Var.b;
                h7.f0(bArr2, bArr, i2, i4, i4 + min);
                int i5 = f20Var.b + min;
                f20Var.b = i5;
                this.g -= min;
                if (i5 == f20Var.c) {
                    this.f = f20Var.a();
                    g20.a(f20Var);
                }
            }
            if (min == -1) {
                throw new EOFException();
            }
            i2 += min;
        }
        return bArr;
    }

    public final String r(long j, Charset charset) {
        charset.getClass();
        if (j < 0 || j > 2147483647L) {
            o8.m("byteCount: ", j);
            return null;
        }
        if (this.g < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        f20 f20Var = this.f;
        f20Var.getClass();
        int i = f20Var.b;
        if (i + j > f20Var.c) {
            return new String(q(j), charset);
        }
        int i2 = (int) j;
        String str = new String(f20Var.a, i, i2, charset);
        int i3 = f20Var.b + i2;
        f20Var.b = i3;
        this.g -= j;
        if (i3 == f20Var.c) {
            this.f = f20Var.a();
            g20.a(f20Var);
        }
        return str;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        f20 f20Var = this.f;
        if (f20Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), f20Var.c - f20Var.b);
        byteBuffer.put(f20Var.a, f20Var.b, min);
        int i = f20Var.b + min;
        f20Var.b = i;
        this.g -= min;
        if (i == f20Var.c) {
            this.f = f20Var.a();
            g20.a(f20Var);
        }
        return min;
    }

    @Override // defpackage.r8
    public final byte readByte() {
        if (this.g == 0) {
            throw new EOFException();
        }
        f20 f20Var = this.f;
        f20Var.getClass();
        int i = f20Var.b;
        int i2 = f20Var.c;
        int i3 = i + 1;
        byte b = f20Var.a[i];
        this.g--;
        if (i3 != i2) {
            f20Var.b = i3;
            return b;
        }
        this.f = f20Var.a();
        g20.a(f20Var);
        return b;
    }

    @Override // defpackage.r8
    public final int readInt() {
        if (this.g < 4) {
            throw new EOFException();
        }
        f20 f20Var = this.f;
        f20Var.getClass();
        int i = f20Var.b;
        int i2 = f20Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = f20Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.g -= 4;
        if (i5 != i2) {
            f20Var.b = i5;
            return i6;
        }
        this.f = f20Var.a();
        g20.a(f20Var);
        return i6;
    }

    @Override // defpackage.r8
    public final short readShort() {
        if (this.g < 2) {
            throw new EOFException();
        }
        f20 f20Var = this.f;
        f20Var.getClass();
        int i = f20Var.b;
        int i2 = f20Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = f20Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.g -= 2;
        if (i5 == i2) {
            this.f = f20Var.a();
            g20.a(f20Var);
        } else {
            f20Var.b = i5;
        }
        return (short) i6;
    }

    public final t8 s(int i) {
        if (i == 0) {
            return t8.i;
        }
        op.g(this.g, 0L, i);
        f20 f20Var = this.f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            f20Var.getClass();
            int i5 = f20Var.c;
            int i6 = f20Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            f20Var = f20Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        f20 f20Var2 = this.f;
        int i7 = 0;
        while (i2 < i) {
            f20Var2.getClass();
            bArr[i7] = f20Var2.a;
            i2 += f20Var2.c - f20Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = f20Var2.b;
            f20Var2.d = true;
            i7++;
            f20Var2 = f20Var2.f;
        }
        return new h20(bArr, iArr);
    }

    @Override // defpackage.r8
    public final void skip(long j) {
        while (j > 0) {
            f20 f20Var = this.f;
            if (f20Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, f20Var.c - f20Var.b);
            long j2 = min;
            this.g -= j2;
            j -= j2;
            int i = f20Var.b + min;
            f20Var.b = i;
            if (i == f20Var.c) {
                this.f = f20Var.a();
                g20.a(f20Var);
            }
        }
    }

    public final f20 t(int i) {
        if (i < 1 || i > 8192) {
            o8.j("unexpected capacity");
            return null;
        }
        f20 f20Var = this.f;
        if (f20Var == null) {
            f20 b = g20.b();
            this.f = b;
            b.g = b;
            b.f = b;
            return b;
        }
        f20 f20Var2 = f20Var.g;
        f20Var2.getClass();
        if (f20Var2.c + i <= 8192 && f20Var2.e) {
            return f20Var2;
        }
        f20 b2 = g20.b();
        f20Var2.b(b2);
        return b2;
    }

    public final String toString() {
        long j = this.g;
        if (j <= 2147483647L) {
            return s((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.g).toString());
    }

    public final void u(byte[] bArr, int i) {
        bArr.getClass();
        long j = i;
        op.g(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            f20 t = t(1);
            int min = Math.min(i - i2, 8192 - t.c);
            int i3 = i2 + min;
            h7.f0(bArr, t.a, t.c, i2, i3);
            t.c += min;
            i2 = i3;
        }
        this.g += j;
    }

    public final void v(q30 q30Var) {
        q30Var.getClass();
        while (q30Var.b(8192L, this) != -1) {
        }
    }

    public final void w(int i) {
        f20 t = t(1);
        byte[] bArr = t.a;
        int i2 = t.c;
        t.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.g++;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            f20 t = t(1);
            int min = Math.min(i, 8192 - t.c);
            byteBuffer.get(t.a, t.c, min);
            i -= min;
            t.c += min;
        }
        this.g += remaining;
        return remaining;
    }

    @Override // defpackage.q8
    public final /* bridge */ /* synthetic */ q8 writeByte(int i) {
        w(i);
        return this;
    }

    @Override // defpackage.q8
    public final /* bridge */ /* synthetic */ q8 writeInt(int i) {
        y(i);
        return this;
    }

    @Override // defpackage.q8
    public final /* bridge */ /* synthetic */ q8 writeShort(int i) {
        z(i);
        return this;
    }

    public final void x(long j) {
        if (j == 0) {
            w(48);
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
        f20 t = t(i);
        byte[] bArr = t.a;
        int i2 = t.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        t.c += i;
        this.g += i;
    }

    public final void y(int i) {
        f20 t = t(4);
        byte[] bArr = t.a;
        int i2 = t.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        t.c = i2 + 4;
        this.g += 4;
    }

    public final void z(int i) {
        f20 t = t(2);
        byte[] bArr = t.a;
        int i2 = t.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        t.c = i2 + 2;
        this.g += 2;
    }

    @Override // defpackage.q8
    public final q8 write(byte[] bArr) {
        u(bArr, bArr.length);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.i30
    public final void close() {
    }

    @Override // defpackage.q8, defpackage.i30, java.io.Flushable
    public final void flush() {
    }
}
