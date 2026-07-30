package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class Lr {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f26229d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f26230e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC2917aC f26231f = AbstractC2917aC.o(new Object[]{StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE}, 5);

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f26232g = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public byte[] f26233a;

    /* renamed from: b, reason: collision with root package name */
    public int f26234b;

    /* renamed from: c, reason: collision with root package name */
    public int f26235c;

    public Lr(byte[] bArr, int i) {
        this.f26233a = bArr;
        this.f26235c = i;
    }

    public static int u(Charset charset) {
        PA.M(f26231f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean w(byte b9) {
        return (b9 & 192) == 128;
    }

    public static int x(int i, int i4, int i9, int i10) {
        return AbstractC3194fG.w((byte) 0, XC.a(((i & 7) << 2) | ((i4 & 48) >> 4)), XC.a(((i9 & 60) >> 2) | ((i4 & 15) << 4)), XC.a((i10 & 63) | ((i9 & 3) << 6)));
    }

    public final void A(int i) {
        byte[] bArr = this.f26233a;
        if (i > bArr.length) {
            this.f26233a = Arrays.copyOf(bArr, i);
        }
    }

    public final int B() {
        return Math.max(this.f26235c - this.f26234b, 0);
    }

    public final void C(int i) {
        boolean z8 = false;
        if (i >= 0 && i <= this.f26233a.length) {
            z8 = true;
        }
        PA.n(z8);
        this.f26235c = i;
    }

    public final int D() {
        return this.f26234b;
    }

    public final void E(int i) {
        boolean z8 = false;
        if (i >= 0 && i <= this.f26235c) {
            z8 = true;
        }
        PA.n(z8);
        this.f26234b = i;
    }

    public final byte[] F() {
        return this.f26233a;
    }

    public final void G(int i) {
        E(this.f26234b + i);
    }

    public final void H(byte[] bArr, int i, int i4) {
        v(i4);
        System.arraycopy(this.f26233a, this.f26234b, bArr, i, i4);
        this.f26234b += i4;
    }

    public final int I() {
        v(1);
        return this.f26233a[this.f26234b] & 255;
    }

    public final int J() {
        if (B() >= 4) {
            this.f26234b -= 4;
            return b();
        }
        int i = this.f26234b;
        int i4 = this.f26235c;
        throw new IndexOutOfBoundsException(D.y.n(new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i4).length()), "position=", i, ", limit=", i4));
    }

    public final int K() {
        v(1);
        byte[] bArr = this.f26233a;
        int i = this.f26234b;
        this.f26234b = i + 1;
        return bArr[i] & 255;
    }

    public final int L() {
        v(2);
        byte[] bArr = this.f26233a;
        int i = this.f26234b;
        int i4 = i + 1;
        this.f26234b = i4;
        int i9 = bArr[i] & 255;
        this.f26234b = i + 2;
        return (bArr[i4] & 255) | (i9 << 8);
    }

    public final int M() {
        v(2);
        byte[] bArr = this.f26233a;
        int i = this.f26234b;
        int i4 = i + 1;
        this.f26234b = i4;
        int i9 = bArr[i] & 255;
        this.f26234b = i + 2;
        return ((bArr[i4] & 255) << 8) | i9;
    }

    public final short N() {
        v(2);
        byte[] bArr = this.f26233a;
        int i = this.f26234b;
        int i4 = i + 1;
        this.f26234b = i4;
        int i9 = bArr[i] & 255;
        this.f26234b = i + 2;
        return (short) ((bArr[i4] & 255) | (i9 << 8));
    }

    public final int O() {
        v(3);
        byte[] bArr = this.f26233a;
        int i = this.f26234b;
        int i4 = i + 1;
        this.f26234b = i4;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f26234b = i10;
        int i11 = bArr[i4] & 255;
        this.f26234b = i + 3;
        return (bArr[i10] & 255) | (i9 << 16) | (i11 << 8);
    }

    public final long P() {
        v(4);
        byte[] bArr = this.f26233a;
        int i = this.f26234b;
        int i4 = i + 1;
        this.f26234b = i4;
        long j9 = bArr[i];
        int i9 = i + 2;
        this.f26234b = i9;
        long j10 = bArr[i4];
        this.f26234b = i + 3;
        long j11 = bArr[i9];
        this.f26234b = i + 4;
        return (bArr[r3] & 255) | ((j9 & 255) << 24) | ((j10 & 255) << 16) | ((j11 & 255) << 8);
    }

    public final long a() {
        v(4);
        byte[] bArr = this.f26233a;
        int i = this.f26234b;
        int i4 = i + 1;
        this.f26234b = i4;
        long j9 = bArr[i];
        int i9 = i + 2;
        this.f26234b = i9;
        long j10 = bArr[i4];
        this.f26234b = i + 3;
        long j11 = bArr[i9];
        this.f26234b = i + 4;
        return ((bArr[r3] & 255) << 24) | (255 & j9) | ((j10 & 255) << 8) | ((j11 & 255) << 16);
    }

    public final int b() {
        v(4);
        byte[] bArr = this.f26233a;
        int i = this.f26234b;
        int i4 = i + 1;
        this.f26234b = i4;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f26234b = i10;
        int i11 = bArr[i4] & 255;
        int i12 = i + 3;
        this.f26234b = i12;
        int i13 = bArr[i10] & 255;
        this.f26234b = i + 4;
        return (bArr[i12] & 255) | (i9 << 24) | (i11 << 16) | (i13 << 8);
    }

    public final int c() {
        v(4);
        byte[] bArr = this.f26233a;
        int i = this.f26234b;
        int i4 = i + 1;
        this.f26234b = i4;
        int i9 = bArr[i] & 255;
        int i10 = i + 2;
        this.f26234b = i10;
        int i11 = bArr[i4] & 255;
        int i12 = i + 3;
        this.f26234b = i12;
        int i13 = bArr[i10] & 255;
        this.f26234b = i + 4;
        return ((bArr[i12] & 255) << 24) | (i11 << 8) | i9 | (i13 << 16);
    }

    public final long d() {
        v(8);
        byte[] bArr = this.f26233a;
        int i = this.f26234b;
        int i4 = i + 1;
        this.f26234b = i4;
        long j9 = bArr[i];
        int i9 = i + 2;
        this.f26234b = i9;
        long j10 = bArr[i4];
        int i10 = i + 3;
        this.f26234b = i10;
        long j11 = bArr[i9];
        int i11 = i + 4;
        this.f26234b = i11;
        long j12 = bArr[i10];
        int i12 = i + 5;
        this.f26234b = i12;
        long j13 = bArr[i11];
        int i13 = i + 6;
        this.f26234b = i13;
        long j14 = bArr[i12];
        this.f26234b = i + 7;
        long j15 = bArr[i13];
        this.f26234b = i + 8;
        return ((j15 & 255) << 8) | ((j9 & 255) << 56) | ((j10 & 255) << 48) | ((j11 & 255) << 40) | ((j12 & 255) << 32) | ((j13 & 255) << 24) | ((j14 & 255) << 16) | (bArr[r4] & 255);
    }

    public final long e() {
        v(8);
        byte[] bArr = this.f26233a;
        int i = this.f26234b;
        int i4 = i + 1;
        this.f26234b = i4;
        long j9 = bArr[i];
        int i9 = i + 2;
        this.f26234b = i9;
        long j10 = bArr[i4];
        int i10 = i + 3;
        this.f26234b = i10;
        long j11 = bArr[i9];
        int i11 = i + 4;
        this.f26234b = i11;
        long j12 = bArr[i10];
        int i12 = i + 5;
        this.f26234b = i12;
        long j13 = bArr[i11];
        int i13 = i + 6;
        this.f26234b = i13;
        long j14 = bArr[i12];
        this.f26234b = i + 7;
        long j15 = bArr[i13];
        this.f26234b = i + 8;
        return ((j15 & 255) << 48) | (j9 & 255) | ((j10 & 255) << 8) | ((j11 & 255) << 16) | ((j12 & 255) << 24) | ((j13 & 255) << 32) | ((j14 & 255) << 40) | ((bArr[r4] & 255) << 56);
    }

    public final int f() {
        v(4);
        byte[] bArr = this.f26233a;
        int i = this.f26234b;
        int i4 = i + 1;
        this.f26234b = i4;
        int i9 = bArr[i] & 255;
        this.f26234b = i + 2;
        int i10 = bArr[i4] & 255;
        this.f26234b = i + 4;
        return (i9 << 8) | i10;
    }

    public final int g() {
        return (K() << 21) | (K() << 14) | (K() << 7) | K();
    }

    public final int h() {
        int b9 = b();
        if (b9 >= 0) {
            return b9;
        }
        throw new IllegalStateException(D.y.j(b9, "Top bit not zero: ", new StringBuilder(String.valueOf(b9).length() + 18)));
    }

    public final int i() {
        int c4 = c();
        if (c4 >= 0) {
            return c4;
        }
        throw new IllegalStateException(D.y.j(c4, "Top bit not zero: ", new StringBuilder(String.valueOf(c4).length() + 18)));
    }

    public final long j() {
        long d2 = d();
        if (d2 >= 0) {
            return d2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(d2);
        throw new IllegalStateException(sb.toString());
    }

    public final String k(int i, Charset charset) {
        v(i);
        byte[] bArr = this.f26233a;
        int i4 = this.f26234b;
        String str = new String(bArr, i4, i, charset);
        this.f26234b = i4 + i;
        return str;
    }

    public final String l(int i) {
        v(i);
        if (i == 0) {
            return "";
        }
        int i4 = this.f26234b;
        int i9 = (i4 + i) - 1;
        int i10 = (i9 >= this.f26235c || this.f26233a[i9] != 0) ? i : i - 1;
        byte[] bArr = this.f26233a;
        String str = AbstractC3548lu.f32613a;
        String str2 = new String(bArr, i4, i10, StandardCharsets.UTF_8);
        this.f26234b += i;
        return str2;
    }

    public final String m() {
        if (B() == 0) {
            return null;
        }
        int i = this.f26234b;
        while (i < this.f26235c && this.f26233a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f26233a;
        int i4 = this.f26234b;
        String str = AbstractC3548lu.f32613a;
        String str2 = new String(bArr, i4, i - i4, StandardCharsets.UTF_8);
        this.f26234b = i;
        if (i < this.f26235c) {
            this.f26234b = i + 1;
        }
        return str2;
    }

    public final String n(Charset charset) {
        int i;
        PA.M(f26231f.contains(charset), "Unsupported charset: %s", charset);
        if (B() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            q();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            i = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i4 = this.f26234b;
        while (true) {
            int i9 = this.f26235c;
            if (i4 >= i9 - (i - 1)) {
                i4 = i9;
                break;
            }
            if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
                byte b9 = this.f26233a[i4];
                String str = AbstractC3548lu.f32613a;
                if (b9 != 10) {
                    if (b9 == 13) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f26233a;
                if (bArr[i4] == 0) {
                    byte b10 = bArr[i4 + 1];
                    String str2 = AbstractC3548lu.f32613a;
                    if (b10 != 10) {
                        if (b10 == 13) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.f26233a;
                if (bArr2[i4 + 1] == 0) {
                    byte b11 = bArr2[i4];
                    String str3 = AbstractC3548lu.f32613a;
                    if (b11 == 10 || b11 == 13) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i4 += i;
        }
        String k6 = k(i4 - this.f26234b, charset);
        if (this.f26234b != this.f26235c && s(charset, f26229d) == '\r') {
            s(charset, f26230e);
        }
        return k6;
    }

    public final long o() {
        int i;
        v(1);
        long j9 = this.f26233a[this.f26234b];
        int i4 = 7;
        while (true) {
            i = 0;
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j9) != 0) {
                i4--;
            } else if (i4 < 6) {
                j9 &= r7 - 1;
                i = 7 - i4;
            } else if (i4 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(j9).length() + 35);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j9);
            throw new NumberFormatException(sb.toString());
        }
        v(i);
        for (int i9 = 1; i9 < i; i9++) {
            if ((this.f26233a[this.f26234b + i9] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j9).length() + 42);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j9);
                throw new NumberFormatException(sb2.toString());
            }
            j9 = (j9 << 6) | (r3 & com.anythink.core.common.s.a.c.f16476c);
        }
        this.f26234b += i;
        return j9;
    }

    public final long p() {
        long j9 = 0;
        for (int i = 0; i < 9; i++) {
            if (this.f26234b == this.f26235c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long K8 = K();
            j9 |= (127 & K8) << (i * 7);
            if ((K8 & 128) == 0) {
                return j9;
            }
        }
        return j9;
    }

    public final Charset q() {
        if (B() >= 3) {
            byte[] bArr = this.f26233a;
            int i = this.f26234b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f26234b = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (B() < 2) {
            return null;
        }
        byte[] bArr2 = this.f26233a;
        int i4 = this.f26234b;
        byte b9 = bArr2[i4];
        if (b9 == -2) {
            if (bArr2[i4 + 1] != -1) {
                return null;
            }
            this.f26234b = i4 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b9 != -1 || bArr2[i4 + 1] != -2) {
            return null;
        }
        this.f26234b = i4 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final char r(int i, ByteOrder byteOrder) {
        byte b9;
        byte b10;
        v(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f26233a;
            int i4 = this.f26234b + i;
            b9 = bArr[i4];
            b10 = bArr[i4 + 1];
        } else {
            byte[] bArr2 = this.f26233a;
            int i9 = this.f26234b + i;
            b9 = bArr2[i9 + 1];
            b10 = bArr2[i9];
        }
        return (char) ((b9 << 8) | (b10 & 255));
    }

    public final char s(Charset charset, char[] cArr) {
        int t9;
        if (B() >= u(charset) && (t9 = t(charset)) != 0) {
            if (!Character.isSupplementaryCodePoint(r0)) {
                long j9 = r0;
                char c4 = (char) j9;
                PA.J(((long) c4) == j9, "Out of range: %s", j9);
                for (char c9 : cArr) {
                    if (c9 == c4) {
                        this.f26234b = AbstractC3194fG.c(t9 & com.anythink.basead.exoplayer.k.p.f8630b) + this.f26234b;
                        return c4;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int t(Charset charset) {
        int i;
        int i4;
        int i9;
        PA.M(f26231f.contains(charset), "Unsupported charset: %s", charset);
        if (B() < u(charset)) {
            int i10 = this.f26234b;
            int i11 = this.f26235c;
            throw new IndexOutOfBoundsException(D.y.n(new StringBuilder(String.valueOf(i10).length() + 17 + String.valueOf(i11).length()), "position=", i10, ", limit=", i11));
        }
        int i12 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b9 = this.f26233a[this.f26234b];
            if ((b9 & com.anythink.core.common.s.a.c.f16474a) == 0) {
                i = b9 & 255;
                return (i << 8) | i12;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte b10 = this.f26233a[this.f26234b];
            if ((b10 & com.anythink.core.common.s.a.c.f16474a) == 0) {
                i4 = 1;
            } else if ((b10 & 224) == 192 && B() >= 2 && w(this.f26233a[this.f26234b + 1])) {
                i4 = 2;
            } else {
                if ((this.f26233a[this.f26234b] & 240) == 224 && B() >= 3) {
                    byte[] bArr = this.f26233a;
                    int i13 = this.f26234b;
                    if (w(bArr[i13 + 1]) && w(bArr[i13 + 2])) {
                        i4 = 3;
                    }
                }
                if ((this.f26233a[this.f26234b] & 248) == 240 && B() >= 4) {
                    byte[] bArr2 = this.f26233a;
                    int i14 = this.f26234b;
                    if (w(bArr2[i14 + 1]) && w(bArr2[i14 + 2]) && w(bArr2[i14 + 3])) {
                        i4 = 4;
                    }
                }
                i4 = 0;
            }
            if (i4 == 1) {
                i9 = this.f26233a[this.f26234b] & 255;
            } else if (i4 == 2) {
                byte[] bArr3 = this.f26233a;
                int i15 = this.f26234b;
                i9 = x(0, 0, bArr3[i15], bArr3[i15 + 1]);
            } else {
                if (i4 != 3) {
                    if (i4 == 4) {
                        byte[] bArr4 = this.f26233a;
                        int i16 = this.f26234b;
                        i9 = x(bArr4[i16], bArr4[i16 + 1], bArr4[i16 + 2], bArr4[i16 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.f26233a;
                int i17 = this.f26234b;
                i9 = x(0, bArr5[i17] & 15, bArr5[i17 + 1], bArr5[i17 + 2]);
            }
            i12 = i4;
            i = i9;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char r9 = r(0, byteOrder);
            if (!Character.isHighSurrogate(r9) || B() < 4) {
                i = r9;
                i12 = 2;
            } else {
                i = Character.toCodePoint(r9, r(2, byteOrder));
                i12 = 4;
            }
        }
        return (i << 8) | i12;
    }

    public final void v(int i) {
        if (!f26232g.get() || B() >= i) {
            return;
        }
        int B8 = B();
        throw new IndexOutOfBoundsException(D.y.n(new StringBuilder(String.valueOf(i).length() + 25 + String.valueOf(B8).length()), "bytesNeeded= ", i, ", bytesLeft=", B8));
    }

    public final void y(int i) {
        byte[] bArr = this.f26233a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        z(i, bArr);
    }

    public final void z(int i, byte[] bArr) {
        this.f26233a = bArr;
        this.f26235c = i;
        this.f26234b = 0;
    }

    public Lr() {
        this.f26233a = AbstractC3548lu.f32614b;
    }

    public Lr(int i) {
        this.f26233a = new byte[i];
        this.f26235c = i;
    }

    public Lr(byte[] bArr) {
        this.f26233a = bArr;
        this.f26235c = bArr.length;
    }
}
