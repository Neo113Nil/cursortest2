package W;

import E.AbstractC0005f;
import a.AbstractC0124a;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f3347d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f3348e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final v2.M f3349f = v2.M.j(5, StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f3350g = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3351a;

    /* renamed from: b, reason: collision with root package name */
    public int f3352b;

    /* renamed from: c, reason: collision with root package name */
    public int f3353c;

    public u() {
        this.f3351a = J.f3264b;
    }

    public static int b(int i4, int i5, int i6, int i7) {
        byte b4 = (byte) i6;
        return O3.d.n((byte) 0, U.i.b(((i4 & 7) << 2) | ((i5 & 48) >> 4)), U.i.b(((((byte) i5) & 15) << 4) | ((b4 & 60) >> 2)), U.i.b(((b4 & 3) << 6) | (((byte) i7) & 63)));
    }

    public static int d(Charset charset) {
        AbstractC0124a.k(f3349f.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    public static boolean e(byte b4) {
        return (b4 & 192) == 128;
    }

    public final int A() {
        f(4);
        byte[] bArr = this.f3351a;
        int i4 = this.f3352b;
        int i5 = i4 + 1;
        this.f3352b = i5;
        int i6 = (bArr[i4] & 255) << 8;
        this.f3352b = i4 + 2;
        int i7 = (bArr[i5] & 255) | i6;
        this.f3352b = i4 + 4;
        return i7;
    }

    public final long B() {
        f(4);
        byte[] bArr = this.f3351a;
        int i4 = this.f3352b;
        this.f3352b = i4 + 1;
        this.f3352b = i4 + 2;
        this.f3352b = i4 + 3;
        long j4 = ((bArr[i4] & 255) << 24) | ((bArr[r3] & 255) << 16) | ((bArr[r8] & 255) << 8);
        this.f3352b = i4 + 4;
        return (bArr[r5] & 255) | j4;
    }

    public final int C() {
        f(3);
        byte[] bArr = this.f3351a;
        int i4 = this.f3352b;
        int i5 = i4 + 1;
        this.f3352b = i5;
        int i6 = (bArr[i4] & 255) << 16;
        int i7 = i4 + 2;
        this.f3352b = i7;
        int i8 = ((bArr[i5] & 255) << 8) | i6;
        this.f3352b = i4 + 3;
        return (bArr[i7] & 255) | i8;
    }

    public final int D() {
        int m4 = m();
        if (m4 >= 0) {
            return m4;
        }
        throw new IllegalStateException(AbstractC0005f.j(m4, "Top bit not zero: "));
    }

    public final int E() {
        long j4 = 0;
        for (int i4 = 0; i4 < 9; i4++) {
            if (this.f3352b == this.f3353c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long z = z();
            j4 |= (127 & z) << (i4 * 7);
            if ((z & 128) == 0) {
                break;
            }
        }
        return O3.d.g(j4);
    }

    public final long F() {
        long t4 = t();
        if (t4 >= 0) {
            return t4;
        }
        throw new IllegalStateException("Top bit not zero: " + t4);
    }

    public final int G() {
        f(2);
        byte[] bArr = this.f3351a;
        int i4 = this.f3352b;
        int i5 = i4 + 1;
        this.f3352b = i5;
        int i6 = (bArr[i4] & 255) << 8;
        this.f3352b = i4 + 2;
        return (bArr[i5] & 255) | i6;
    }

    public final long H() {
        int i4;
        f(1);
        long j4 = this.f3351a[this.f3352b];
        int i5 = 7;
        while (true) {
            if (i5 < 0) {
                break;
            }
            if (((1 << i5) & j4) != 0) {
                i5--;
            } else if (i5 < 6) {
                j4 &= r6 - 1;
                i4 = 7 - i5;
            } else if (i5 == 7) {
                i4 = 1;
            }
        }
        i4 = 0;
        if (i4 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j4);
        }
        f(i4);
        for (int i6 = 1; i6 < i4; i6++) {
            if ((this.f3351a[this.f3352b + i6] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j4);
            }
            j4 = (j4 << 6) | (r4 & 63);
        }
        this.f3352b += i4;
        return j4;
    }

    public final Charset I() {
        if (a() >= 3) {
            byte[] bArr = this.f3351a;
            int i4 = this.f3352b;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f3352b = i4 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f3351a;
        int i5 = this.f3352b;
        byte b4 = bArr2[i5];
        if (b4 == -2 && bArr2[i5 + 1] == -1) {
            this.f3352b = i5 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b4 != -1 || bArr2[i5 + 1] != -2) {
            return null;
        }
        this.f3352b = i5 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final void J(int i4) {
        byte[] bArr = this.f3351a;
        if (bArr.length < i4) {
            bArr = new byte[i4];
        }
        K(i4, bArr);
    }

    public final void K(int i4, byte[] bArr) {
        this.f3351a = bArr;
        this.f3353c = i4;
        this.f3352b = 0;
    }

    public final void L(int i4) {
        AbstractC0124a.h(i4 >= 0 && i4 <= this.f3351a.length);
        this.f3353c = i4;
    }

    public final void M(int i4) {
        AbstractC0124a.h(i4 >= 0 && i4 <= this.f3353c);
        this.f3352b = i4;
    }

    public final void N(int i4) {
        M(this.f3352b + i4);
    }

    public final int a() {
        return Math.max(this.f3353c - this.f3352b, 0);
    }

    public final void c(int i4) {
        byte[] bArr = this.f3351a;
        if (i4 > bArr.length) {
            this.f3351a = Arrays.copyOf(bArr, i4);
        }
    }

    public final void f(int i4) {
        if (!f3350g.get() || a() >= i4) {
            return;
        }
        StringBuilder r4 = AbstractC0005f.r(i4, "bytesNeeded= ", ", bytesLeft=");
        r4.append(a());
        throw new IndexOutOfBoundsException(r4.toString());
    }

    public final char g(int i4, ByteOrder byteOrder) {
        byte b4;
        byte b5;
        f(2);
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f3351a;
            int i5 = this.f3352b + i4;
            b4 = bArr[i5];
            b5 = bArr[i5 + 1];
        } else {
            byte[] bArr2 = this.f3351a;
            int i6 = this.f3352b + i4;
            b4 = bArr2[i6 + 1];
            b5 = bArr2[i6];
        }
        return (char) ((b4 << 8) | (b5 & 255));
    }

    public final int h(Charset charset) {
        int i4;
        int i5;
        AbstractC0124a.k(f3349f.contains(charset), "Unsupported charset: %s", charset);
        if (a() < d(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f3352b + ", limit=" + this.f3353c);
        }
        int i6 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b4 = this.f3351a[this.f3352b];
            if ((b4 & 128) != 0) {
                return 0;
            }
            i4 = b4 & 255;
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte b5 = this.f3351a[this.f3352b];
            int i7 = (b5 & 128) == 0 ? 1 : ((b5 & 224) == 192 && a() >= 2 && e(this.f3351a[this.f3352b + 1])) ? 2 : ((this.f3351a[this.f3352b] & 240) == 224 && a() >= 3 && e(this.f3351a[this.f3352b + 1]) && e(this.f3351a[this.f3352b + 2])) ? 3 : ((this.f3351a[this.f3352b] & 248) == 240 && a() >= 4 && e(this.f3351a[this.f3352b + 1]) && e(this.f3351a[this.f3352b + 2]) && e(this.f3351a[this.f3352b + 3])) ? 4 : 0;
            if (i7 == 1) {
                i5 = this.f3351a[this.f3352b] & 255;
            } else if (i7 == 2) {
                byte[] bArr = this.f3351a;
                int i8 = this.f3352b;
                i5 = b(0, 0, bArr[i8], bArr[i8 + 1]);
            } else if (i7 == 3) {
                byte[] bArr2 = this.f3351a;
                int i9 = this.f3352b;
                i5 = b(0, bArr2[i9] & 15, bArr2[i9 + 1], bArr2[i9 + 2]);
            } else {
                if (i7 != 4) {
                    return 0;
                }
                byte[] bArr3 = this.f3351a;
                int i10 = this.f3352b;
                i5 = b(bArr3[i10], bArr3[i10 + 1], bArr3[i10 + 2], bArr3[i10 + 3]);
            }
            i6 = i7;
            i4 = i5;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char g4 = g(0, byteOrder);
            if (!Character.isHighSurrogate(g4) || a() < 4) {
                i4 = g4;
                i6 = 2;
            } else {
                i4 = Character.toCodePoint(g4, g(2, byteOrder));
                i6 = 4;
            }
        }
        return (i4 << 8) | i6;
    }

    public final int i() {
        if (a() >= 4) {
            int m4 = m();
            this.f3352b -= 4;
            return m4;
        }
        throw new IndexOutOfBoundsException("position=" + this.f3352b + ", limit=" + this.f3353c);
    }

    public final int j() {
        f(1);
        return this.f3351a[this.f3352b] & 255;
    }

    public final void k(byte[] bArr, int i4, int i5) {
        f(i5);
        System.arraycopy(this.f3351a, this.f3352b, bArr, i4, i5);
        this.f3352b += i5;
    }

    public final char l(Charset charset, char[] cArr) {
        int h2;
        if (a() >= d(charset) && (h2 = h(charset)) != 0) {
            long j4 = h2 >>> 8;
            AbstractC0124a.i((j4 >> 32) == 0, "out of range: %s", j4);
            int i4 = (int) j4;
            if (!Character.isSupplementaryCodePoint(i4)) {
                long j5 = i4;
                char c4 = (char) j5;
                AbstractC0124a.i(((long) c4) == j5, "Out of range: %s", j5);
                for (char c5 : cArr) {
                    if (c5 == c4) {
                        this.f3352b = O3.d.g(h2 & KotlinVersion.MAX_COMPONENT_VALUE) + this.f3352b;
                        return c4;
                    }
                }
            }
        }
        return (char) 0;
    }

    public final int m() {
        f(4);
        byte[] bArr = this.f3351a;
        int i4 = this.f3352b;
        int i5 = i4 + 1;
        this.f3352b = i5;
        int i6 = (bArr[i4] & 255) << 24;
        int i7 = i4 + 2;
        this.f3352b = i7;
        int i8 = ((bArr[i5] & 255) << 16) | i6;
        int i9 = i4 + 3;
        this.f3352b = i9;
        int i10 = i8 | ((bArr[i7] & 255) << 8);
        this.f3352b = i4 + 4;
        return (bArr[i9] & 255) | i10;
    }

    public final String n(Charset charset) {
        int i4;
        AbstractC0124a.k(f3349f.contains(charset), "Unsupported charset: %s", charset);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            I();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i4 = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i4 = 2;
        }
        int i5 = this.f3352b;
        while (true) {
            int i6 = this.f3353c;
            if (i5 >= i6 - (i4 - 1)) {
                i5 = i6;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && J.J(this.f3351a[i5])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.f3351a;
                if (bArr[i5] == 0 && J.J(bArr[i5 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.f3351a;
                if (bArr2[i5 + 1] == 0 && J.J(bArr2[i5])) {
                    break;
                }
            }
            i5 += i4;
        }
        String x4 = x(i5 - this.f3352b, charset);
        if (this.f3352b != this.f3353c && l(charset, f3347d) == '\r') {
            l(charset, f3348e);
        }
        return x4;
    }

    public final int o() {
        f(4);
        byte[] bArr = this.f3351a;
        int i4 = this.f3352b;
        int i5 = i4 + 1;
        this.f3352b = i5;
        int i6 = bArr[i4] & 255;
        int i7 = i4 + 2;
        this.f3352b = i7;
        int i8 = ((bArr[i5] & 255) << 8) | i6;
        int i9 = i4 + 3;
        this.f3352b = i9;
        int i10 = i8 | ((bArr[i7] & 255) << 16);
        this.f3352b = i4 + 4;
        return ((bArr[i9] & 255) << 24) | i10;
    }

    public final long p() {
        f(8);
        byte[] bArr = this.f3351a;
        int i4 = this.f3352b;
        this.f3352b = i4 + 1;
        this.f3352b = i4 + 2;
        this.f3352b = i4 + 3;
        long j4 = (bArr[i4] & 255) | ((bArr[r3] & 255) << 8) | ((bArr[r8] & 255) << 16);
        this.f3352b = i4 + 4;
        long j5 = j4 | ((bArr[r5] & 255) << 24);
        this.f3352b = i4 + 5;
        long j6 = j5 | ((bArr[r8] & 255) << 32);
        this.f3352b = i4 + 6;
        long j7 = j6 | ((bArr[r5] & 255) << 40);
        this.f3352b = i4 + 7;
        long j8 = j7 | ((bArr[r8] & 255) << 48);
        this.f3352b = i4 + 8;
        return ((bArr[r5] & 255) << 56) | j8;
    }

    public final long q() {
        f(4);
        byte[] bArr = this.f3351a;
        int i4 = this.f3352b;
        this.f3352b = i4 + 1;
        this.f3352b = i4 + 2;
        this.f3352b = i4 + 3;
        long j4 = (bArr[i4] & 255) | ((bArr[r3] & 255) << 8) | ((bArr[r8] & 255) << 16);
        this.f3352b = i4 + 4;
        return ((bArr[r5] & 255) << 24) | j4;
    }

    public final int r() {
        int o = o();
        if (o >= 0) {
            return o;
        }
        throw new IllegalStateException(AbstractC0005f.j(o, "Top bit not zero: "));
    }

    public final int s() {
        f(2);
        byte[] bArr = this.f3351a;
        int i4 = this.f3352b;
        int i5 = i4 + 1;
        this.f3352b = i5;
        int i6 = bArr[i4] & 255;
        this.f3352b = i4 + 2;
        return ((bArr[i5] & 255) << 8) | i6;
    }

    public final long t() {
        f(8);
        byte[] bArr = this.f3351a;
        int i4 = this.f3352b;
        this.f3352b = i4 + 1;
        this.f3352b = i4 + 2;
        this.f3352b = i4 + 3;
        long j4 = ((bArr[i4] & 255) << 56) | ((bArr[r3] & 255) << 48) | ((bArr[r8] & 255) << 40);
        this.f3352b = i4 + 4;
        long j5 = j4 | ((bArr[r5] & 255) << 32);
        this.f3352b = i4 + 5;
        long j6 = j5 | ((bArr[r8] & 255) << 24);
        this.f3352b = i4 + 6;
        long j7 = j6 | ((bArr[r5] & 255) << 16);
        this.f3352b = i4 + 7;
        long j8 = j7 | ((bArr[r8] & 255) << 8);
        this.f3352b = i4 + 8;
        return (bArr[r5] & 255) | j8;
    }

    public final String u() {
        if (a() == 0) {
            return null;
        }
        int i4 = this.f3352b;
        while (i4 < this.f3353c && this.f3351a[i4] != 0) {
            i4++;
        }
        byte[] bArr = this.f3351a;
        int i5 = this.f3352b;
        String str = J.f3263a;
        String str2 = new String(bArr, i5, i4 - i5, StandardCharsets.UTF_8);
        this.f3352b = i4;
        if (i4 < this.f3353c) {
            this.f3352b = i4 + 1;
        }
        return str2;
    }

    public final String v(int i4) {
        f(i4);
        if (i4 == 0) {
            return "";
        }
        int i5 = this.f3352b;
        int i6 = (i5 + i4) - 1;
        int i7 = (i6 >= this.f3353c || this.f3351a[i6] != 0) ? i4 : i4 - 1;
        byte[] bArr = this.f3351a;
        String str = J.f3263a;
        String str2 = new String(bArr, i5, i7, StandardCharsets.UTF_8);
        this.f3352b += i4;
        return str2;
    }

    public final short w() {
        f(2);
        byte[] bArr = this.f3351a;
        int i4 = this.f3352b;
        int i5 = i4 + 1;
        this.f3352b = i5;
        int i6 = (bArr[i4] & 255) << 8;
        this.f3352b = i4 + 2;
        return (short) ((bArr[i5] & 255) | i6);
    }

    public final String x(int i4, Charset charset) {
        f(i4);
        String str = new String(this.f3351a, this.f3352b, i4, charset);
        this.f3352b += i4;
        return str;
    }

    public final int y() {
        return (z() << 21) | (z() << 14) | (z() << 7) | z();
    }

    public final int z() {
        f(1);
        byte[] bArr = this.f3351a;
        int i4 = this.f3352b;
        this.f3352b = i4 + 1;
        return bArr[i4] & 255;
    }

    public u(int i4) {
        this.f3351a = new byte[i4];
        this.f3353c = i4;
    }

    public u(byte[] bArr) {
        this.f3351a = bArr;
        this.f3353c = bArr.length;
    }

    public u(int i4, byte[] bArr) {
        this.f3351a = bArr;
        this.f3353c = i4;
    }
}
