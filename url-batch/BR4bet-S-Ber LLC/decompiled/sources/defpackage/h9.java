package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class h9 implements j9, i9, Cloneable, ByteChannel {
    public u40 f;
    public long g;

    public final void A(String str) {
        str.getClass();
        B(str, 0, str.length());
    }

    public final void B(String str, int i, int i2) {
        char charAt;
        str.getClass();
        if (i < 0) {
            g9.d(f60.e("beginIndex < 0: ", i));
            return;
        }
        if (i2 < i) {
            g9.d(f60.d(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            g9.k("endIndex > string.length: ", i2, " > ", str.length());
            return;
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                u40 t = t(1);
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
                    u40 t2 = t(2);
                    byte[] bArr2 = t2.a;
                    int i7 = t2.c;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    t2.c = i7 + 2;
                    this.g += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    u40 t3 = t(3);
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
                        u40 t4 = t(4);
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
            u40 t = t(2);
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
            u40 t2 = t(3);
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
            u40 t3 = t(4);
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
            char[] cArr = b9.a;
            int i5 = 0;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            if (i5 < 0) {
                throw new IndexOutOfBoundsException("startIndex: " + i5 + ", endIndex: 8, size: 8");
            }
            if (i5 > 8) {
                g9.c(i5, " > endIndex: 8", "startIndex: ");
                return;
            }
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.h60
    public final f90 a() {
        return f90.d;
    }

    @Override // defpackage.h60
    public final long b(long j, h9 h9Var) {
        h9Var.getClass();
        if (j < 0) {
            g9.m("byteCount < 0: ", j);
            return 0L;
        }
        long j2 = this.g;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        h9Var.e(j, this);
        return j;
    }

    @Override // defpackage.j9
    public final l9 c(long j) {
        if (j < 0 || j > 2147483647L) {
            g9.m("byteCount: ", j);
            return null;
        }
        if (this.g < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new l9(q(j));
        }
        l9 s = s((int) j);
        skip(j);
        return s;
    }

    public final Object clone() {
        h9 h9Var = new h9();
        if (this.g == 0) {
            return h9Var;
        }
        u40 u40Var = this.f;
        u40Var.getClass();
        u40 c = u40Var.c();
        h9Var.f = c;
        c.g = c;
        c.f = c;
        for (u40 u40Var2 = u40Var.f; u40Var2 != u40Var; u40Var2 = u40Var2.f) {
            u40 u40Var3 = c.g;
            u40Var3.getClass();
            u40Var2.getClass();
            u40Var3.b(u40Var2.c());
        }
        h9Var.g = this.g;
        return h9Var;
    }

    @Override // defpackage.j9
    public final String d() {
        return i(Long.MAX_VALUE);
    }

    @Override // defpackage.x50
    public final void e(long j, h9 h9Var) {
        u40 b;
        h9Var.getClass();
        if (h9Var == this) {
            g9.i("source == this");
            return;
        }
        b9.g(h9Var.g, 0L, j);
        while (j > 0) {
            u40 u40Var = h9Var.f;
            u40Var.getClass();
            int i = u40Var.c;
            u40 u40Var2 = h9Var.f;
            u40Var2.getClass();
            long j2 = i - u40Var2.b;
            int i2 = 0;
            if (j < j2) {
                u40 u40Var3 = this.f;
                u40 u40Var4 = u40Var3 != null ? u40Var3.g : null;
                if (u40Var4 != null && u40Var4.e) {
                    if ((u40Var4.c + j) - (u40Var4.d ? 0 : u40Var4.b) <= 8192) {
                        u40 u40Var5 = h9Var.f;
                        u40Var5.getClass();
                        u40Var5.d(u40Var4, (int) j);
                        h9Var.g -= j;
                        this.g += j;
                        return;
                    }
                }
                u40 u40Var6 = h9Var.f;
                u40Var6.getClass();
                int i3 = (int) j;
                if (i3 <= 0 || i3 > u40Var6.c - u40Var6.b) {
                    g9.i("byteCount out of range");
                    return;
                }
                if (i3 >= 1024) {
                    b = u40Var6.c();
                } else {
                    b = v40.b();
                    byte[] bArr = u40Var6.a;
                    byte[] bArr2 = b.a;
                    int i4 = u40Var6.b;
                    a7.Y(bArr, bArr2, 0, i4, i4 + i3);
                }
                b.c = b.b + i3;
                u40Var6.b += i3;
                u40 u40Var7 = u40Var6.g;
                u40Var7.getClass();
                u40Var7.b(b);
                h9Var.f = b;
            }
            u40 u40Var8 = h9Var.f;
            u40Var8.getClass();
            long j3 = u40Var8.c - u40Var8.b;
            h9Var.f = u40Var8.a();
            u40 u40Var9 = this.f;
            if (u40Var9 == null) {
                this.f = u40Var8;
                u40Var8.g = u40Var8;
                u40Var8.f = u40Var8;
            } else {
                u40 u40Var10 = u40Var9.g;
                u40Var10.getClass();
                u40Var10.b(u40Var8);
                u40 u40Var11 = u40Var8.g;
                if (u40Var11 == u40Var8) {
                    g9.s("cannot compact");
                    return;
                }
                u40Var11.getClass();
                if (u40Var11.e) {
                    int i5 = u40Var8.c - u40Var8.b;
                    u40 u40Var12 = u40Var8.g;
                    u40Var12.getClass();
                    int i6 = 8192 - u40Var12.c;
                    u40 u40Var13 = u40Var8.g;
                    u40Var13.getClass();
                    if (!u40Var13.d) {
                        u40 u40Var14 = u40Var8.g;
                        u40Var14.getClass();
                        i2 = u40Var14.b;
                    }
                    if (i5 <= i6 + i2) {
                        u40 u40Var15 = u40Var8.g;
                        u40Var15.getClass();
                        u40Var8.d(u40Var15, i5);
                        u40Var8.a();
                        v40.a(u40Var8);
                    }
                }
            }
            h9Var.g -= j3;
            this.g += j3;
            j -= j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9)) {
            return false;
        }
        long j = this.g;
        h9 h9Var = (h9) obj;
        if (j != h9Var.g) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        u40 u40Var = this.f;
        u40Var.getClass();
        u40 u40Var2 = h9Var.f;
        u40Var2.getClass();
        int i = u40Var.b;
        int i2 = u40Var2.b;
        long j2 = 0;
        while (j2 < this.g) {
            long min = Math.min(u40Var.c - i, u40Var2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (u40Var.a[i] != u40Var2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == u40Var.c) {
                u40Var = u40Var.f;
                u40Var.getClass();
                i = u40Var.b;
            }
            if (i2 == u40Var2.c) {
                u40Var2 = u40Var2.f;
                u40Var2.getClass();
                i2 = u40Var2.b;
            }
            j2 += min;
        }
        return true;
    }

    public final void f(h9 h9Var, long j, long j2) {
        h9Var.getClass();
        long j3 = j;
        b9.g(this.g, j3, j2);
        if (j2 == 0) {
            return;
        }
        h9Var.g += j2;
        u40 u40Var = this.f;
        while (true) {
            u40Var.getClass();
            long j4 = u40Var.c - u40Var.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            u40Var = u40Var.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            u40Var.getClass();
            u40 c = u40Var.c();
            int i = c.b + ((int) j3);
            c.b = i;
            c.c = Math.min(i + ((int) j5), c.c);
            u40 u40Var2 = h9Var.f;
            if (u40Var2 == null) {
                c.g = c;
                c.f = c;
                h9Var.f = c;
            } else {
                u40 u40Var3 = u40Var2.g;
                u40Var3.getClass();
                u40Var3.b(c);
            }
            j5 -= c.c - c.b;
            u40Var = u40Var.f;
            j3 = 0;
        }
    }

    public final boolean g() {
        return this.g == 0;
    }

    public final byte h(long j) {
        b9.g(this.g, j, 1L);
        u40 u40Var = this.f;
        u40Var.getClass();
        long j2 = this.g;
        if (j2 - j < j) {
            while (j2 > j) {
                u40Var = u40Var.g;
                u40Var.getClass();
                j2 -= u40Var.c - u40Var.b;
            }
            return u40Var.a[(int) ((u40Var.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = u40Var.c;
            int i2 = u40Var.b;
            long j4 = (i - i2) + j3;
            if (j4 > j) {
                return u40Var.a[(int) ((i2 + j) - j3)];
            }
            u40Var = u40Var.f;
            u40Var.getClass();
            j3 = j4;
        }
    }

    public final int hashCode() {
        u40 u40Var = this.f;
        if (u40Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = u40Var.c;
            for (int i3 = u40Var.b; i3 < i2; i3++) {
                i = (i * 31) + u40Var.a[i3];
            }
            u40Var = u40Var.f;
            u40Var.getClass();
        } while (u40Var != this.f);
        return i;
    }

    @Override // defpackage.j9
    public final String i(long j) {
        if (j < 0) {
            g9.m("limit < 0: ", j);
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long k = k((byte) 10, 0L, j2);
        if (k != -1) {
            return b.a(k, this);
        }
        if (j2 < this.g && h(j2 - 1) == 13 && h(j2) == 10) {
            return b.a(j2, this);
        }
        h9 h9Var = new h9();
        f(h9Var, 0L, Math.min(32L, this.g));
        throw new EOFException("\\n not found: limit=" + Math.min(this.g, j) + " content=" + h9Var.c(h9Var.g).b() + (char) 8230);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.j9
    public final int j(oz ozVar) {
        ozVar.getClass();
        int b = b.b(this, ozVar, false);
        if (b == -1) {
            return -1;
        }
        skip(ozVar.f[b].a());
        return b;
    }

    public final long k(byte b, long j, long j2) {
        u40 u40Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.g + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.g;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (u40Var = this.f) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                u40Var = u40Var.g;
                u40Var.getClass();
                j4 -= u40Var.c - u40Var.b;
            }
            while (j4 < j2) {
                byte[] bArr = u40Var.a;
                int min = (int) Math.min(u40Var.c, (u40Var.b + j2) - j4);
                for (int i = (int) ((u40Var.b + j) - j4); i < min; i++) {
                    if (bArr[i] == b) {
                        return (i - u40Var.b) + j4;
                    }
                }
                j4 += u40Var.c - u40Var.b;
                u40Var = u40Var.f;
                u40Var.getClass();
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = (u40Var.c - u40Var.b) + j3;
            if (j5 > j) {
                break;
            }
            u40Var = u40Var.f;
            u40Var.getClass();
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = u40Var.a;
            int min2 = (int) Math.min(u40Var.c, (u40Var.b + j2) - j3);
            for (int i2 = (int) ((u40Var.b + j) - j3); i2 < min2; i2++) {
                if (bArr2[i2] == b) {
                    return (i2 - u40Var.b) + j3;
                }
            }
            j3 += u40Var.c - u40Var.b;
            u40Var = u40Var.f;
            u40Var.getClass();
            j = j3;
        }
        return -1L;
    }

    @Override // defpackage.j9
    public final void l(long j) {
        if (this.g < j) {
            throw new EOFException();
        }
    }

    @Override // defpackage.i9
    public final /* bridge */ /* synthetic */ i9 m(String str) {
        A(str);
        return this;
    }

    @Override // defpackage.i9
    public final i9 n(l9 l9Var) {
        l9Var.getClass();
        l9Var.i(this, l9Var.a());
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x000c->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    @Override // defpackage.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long o() {
        int i;
        if (this.g == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            u40 u40Var = this.f;
            u40Var.getClass();
            byte[] bArr = u40Var.a;
            int i3 = u40Var.b;
            int i4 = u40Var.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else if (b < 65 || b > 70) {
                    z = true;
                    if (i2 == 0) {
                        char[] cArr = b9.a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    if (i3 != i4) {
                        this.f = u40Var.a();
                        v40.a(u40Var);
                    } else {
                        u40Var.b = i3;
                    }
                    if (!z) {
                        break;
                    }
                } else {
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    h9 h9Var = new h9();
                    h9Var.x(j);
                    h9Var.w(b);
                    throw new NumberFormatException("Number too large: ".concat(h9Var.r(h9Var.g, la.a)));
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

    @Override // defpackage.j9
    public final String p(Charset charset) {
        return r(this.g, charset);
    }

    public final byte[] q(long j) {
        int min;
        if (j < 0 || j > 2147483647L) {
            g9.m("byteCount: ", j);
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
            b9.g(i, i2, i3);
            u40 u40Var = this.f;
            if (u40Var == null) {
                min = -1;
            } else {
                min = Math.min(i3, u40Var.c - u40Var.b);
                byte[] bArr2 = u40Var.a;
                int i4 = u40Var.b;
                a7.Y(bArr2, bArr, i2, i4, i4 + min);
                int i5 = u40Var.b + min;
                u40Var.b = i5;
                this.g -= min;
                if (i5 == u40Var.c) {
                    this.f = u40Var.a();
                    v40.a(u40Var);
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
            g9.m("byteCount: ", j);
            return null;
        }
        if (this.g < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        u40 u40Var = this.f;
        u40Var.getClass();
        int i = u40Var.b;
        if (i + j > u40Var.c) {
            return new String(q(j), charset);
        }
        int i2 = (int) j;
        String str = new String(u40Var.a, i, i2, charset);
        int i3 = u40Var.b + i2;
        u40Var.b = i3;
        this.g -= j;
        if (i3 == u40Var.c) {
            this.f = u40Var.a();
            v40.a(u40Var);
        }
        return str;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        u40 u40Var = this.f;
        if (u40Var == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), u40Var.c - u40Var.b);
        byteBuffer.put(u40Var.a, u40Var.b, min);
        int i = u40Var.b + min;
        u40Var.b = i;
        this.g -= min;
        if (i == u40Var.c) {
            this.f = u40Var.a();
            v40.a(u40Var);
        }
        return min;
    }

    @Override // defpackage.j9
    public final byte readByte() {
        if (this.g == 0) {
            throw new EOFException();
        }
        u40 u40Var = this.f;
        u40Var.getClass();
        int i = u40Var.b;
        int i2 = u40Var.c;
        int i3 = i + 1;
        byte b = u40Var.a[i];
        this.g--;
        if (i3 != i2) {
            u40Var.b = i3;
            return b;
        }
        this.f = u40Var.a();
        v40.a(u40Var);
        return b;
    }

    @Override // defpackage.j9
    public final int readInt() {
        if (this.g < 4) {
            throw new EOFException();
        }
        u40 u40Var = this.f;
        u40Var.getClass();
        int i = u40Var.b;
        int i2 = u40Var.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = u40Var.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.g -= 4;
        if (i5 != i2) {
            u40Var.b = i5;
            return i6;
        }
        this.f = u40Var.a();
        v40.a(u40Var);
        return i6;
    }

    @Override // defpackage.j9
    public final short readShort() {
        if (this.g < 2) {
            throw new EOFException();
        }
        u40 u40Var = this.f;
        u40Var.getClass();
        int i = u40Var.b;
        int i2 = u40Var.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = u40Var.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.g -= 2;
        if (i5 == i2) {
            this.f = u40Var.a();
            v40.a(u40Var);
        } else {
            u40Var.b = i5;
        }
        return (short) i6;
    }

    public final l9 s(int i) {
        if (i == 0) {
            return l9.i;
        }
        b9.g(this.g, 0L, i);
        u40 u40Var = this.f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            u40Var.getClass();
            int i5 = u40Var.c;
            int i6 = u40Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            u40Var = u40Var.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        u40 u40Var2 = this.f;
        int i7 = 0;
        while (i2 < i) {
            u40Var2.getClass();
            bArr[i7] = u40Var2.a;
            i2 += u40Var2.c - u40Var2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = u40Var2.b;
            u40Var2.d = true;
            i7++;
            u40Var2 = u40Var2.f;
        }
        return new w40(bArr, iArr);
    }

    @Override // defpackage.j9
    public final void skip(long j) {
        while (j > 0) {
            u40 u40Var = this.f;
            if (u40Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, u40Var.c - u40Var.b);
            long j2 = min;
            this.g -= j2;
            j -= j2;
            int i = u40Var.b + min;
            u40Var.b = i;
            if (i == u40Var.c) {
                this.f = u40Var.a();
                v40.a(u40Var);
            }
        }
    }

    public final u40 t(int i) {
        if (i < 1 || i > 8192) {
            g9.i("unexpected capacity");
            return null;
        }
        u40 u40Var = this.f;
        if (u40Var == null) {
            u40 b = v40.b();
            this.f = b;
            b.g = b;
            b.f = b;
            return b;
        }
        u40 u40Var2 = u40Var.g;
        u40Var2.getClass();
        if (u40Var2.c + i <= 8192 && u40Var2.e) {
            return u40Var2;
        }
        u40 b2 = v40.b();
        u40Var2.b(b2);
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
        b9.g(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            u40 t = t(1);
            int min = Math.min(i - i2, 8192 - t.c);
            int i3 = i2 + min;
            a7.Y(bArr, t.a, t.c, i2, i3);
            t.c += min;
            i2 = i3;
        }
        this.g += j;
    }

    public final void v(h60 h60Var) {
        h60Var.getClass();
        while (h60Var.b(8192L, this) != -1) {
        }
    }

    public final void w(int i) {
        u40 t = t(1);
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
            u40 t = t(1);
            int min = Math.min(i, 8192 - t.c);
            byteBuffer.get(t.a, t.c, min);
            i -= min;
            t.c += min;
        }
        this.g += remaining;
        return remaining;
    }

    @Override // defpackage.i9
    public final /* bridge */ /* synthetic */ i9 writeByte(int i) {
        w(i);
        return this;
    }

    @Override // defpackage.i9
    public final /* bridge */ /* synthetic */ i9 writeInt(int i) {
        y(i);
        return this;
    }

    @Override // defpackage.i9
    public final /* bridge */ /* synthetic */ i9 writeShort(int i) {
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
        u40 t = t(i);
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
        u40 t = t(4);
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
        u40 t = t(2);
        byte[] bArr = t.a;
        int i2 = t.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        t.c = i2 + 2;
        this.g += 2;
    }

    @Override // defpackage.i9
    public final i9 write(byte[] bArr) {
        u(bArr, bArr.length);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.x50
    public final void close() {
    }

    @Override // defpackage.i9, defpackage.x50, java.io.Flushable
    public final void flush() {
    }
}
