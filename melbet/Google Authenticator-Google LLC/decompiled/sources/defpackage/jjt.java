package defpackage;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jjt extends jju {
    private final InputStream g;
    private final byte[] h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n = Integer.MAX_VALUE;

    public jjt(InputStream inputStream, int i) {
        this.g = inputStream;
        this.h = new byte[i < 8 ? 8 : i];
        this.i = 0;
        this.k = 0;
        this.m = 0;
    }

    private final void K() {
        int i = this.i + this.j;
        this.i = i;
        int i2 = this.m + i;
        int i3 = this.n;
        if (i2 <= i3) {
            this.j = 0;
            return;
        }
        int i4 = i2 - i3;
        this.j = i4;
        this.i = i - i4;
    }

    private final void R(int i) {
        if (T(i)) {
            return;
        }
        if (i <= (this.d - this.m) - this.k) {
            throw new jld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new jld("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private static boolean S(int i, int i2, int i3) {
        return i3 < i || i2 > i3 - i;
    }

    private final boolean T(int i) {
        int i2 = this.k;
        int i3 = i2 + i;
        int i4 = this.i;
        if (i3 <= i4) {
            throw new IllegalStateException(a.ai(i, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i5 = this.m;
        int i6 = i5 + i2;
        if (S(i6, i, this.d) || S(i6, i, this.n)) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.h;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.m + i2;
            this.m = i5;
            i4 = this.i - i2;
            this.i = i4;
            this.k = 0;
        }
        InputStream inputStream = this.g;
        byte[] bArr2 = this.h;
        int i7 = this.d - i5;
        int length = bArr2.length;
        int n = n(inputStream, bArr2, i4, Math.min(length - i4, i7 - i4));
        if (n != 0 && n >= -1 && n <= length) {
            if (n <= 0) {
                return false;
            }
            this.i += n;
            K();
            return this.i >= i || T(i);
        }
        throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + n + "\nThe InputStream implementation is buggy.");
    }

    private final byte[] U(int i) {
        if (i == 0) {
            return jky.a;
        }
        int i2 = this.m;
        int i3 = this.k;
        int i4 = i2 + i3;
        if (S(i4, i, this.d)) {
            throw new jld("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i5 = this.n;
        if (S(i4, i, i5)) {
            if (i5 >= i4) {
                F(i5 - i4);
            }
            throw new jld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.i - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.g.available()) {
                    return null;
                }
            } catch (jld e) {
                e.a();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.h, this.k, bArr, 0, i6);
        this.m += this.i;
        this.k = 0;
        this.i = 0;
        while (i6 < i) {
            int n = n(this.g, bArr, i6, i - i6);
            if (n == -1) {
                throw new jld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.m += n;
            i6 += n;
        }
        return bArr;
    }

    private final byte[] V(int i) {
        byte[] U = U(i);
        if (U != null) {
            return U;
        }
        int i2 = this.k;
        int i3 = this.i;
        int i4 = i3 - i2;
        this.m += i3;
        this.k = 0;
        this.i = 0;
        List<byte[]> v = v(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.h, i2, bArr, 0, i4);
        for (byte[] bArr2 : v) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    private static int n(InputStream inputStream, byte[] bArr, int i, int i2) {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (jld e) {
            e.a();
            throw e;
        }
    }

    private final List v(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int n = n(this.g, bArr, i2, min - i2);
                if (n == -1) {
                    throw new jld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.m += n;
                i2 += n;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // defpackage.jju
    public final jjq A() {
        int k = k();
        int i = this.i;
        int i2 = this.k;
        if (k <= i - i2 && k > 0) {
            jjq y = jjq.y(this.h, i2, k);
            this.k += k;
            return y;
        }
        if (k == 0) {
            return jjq.d;
        }
        if (k < 0) {
            throw new jld("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] U = U(k);
        if (U != null) {
            return jjq.y(U, 0, U.length);
        }
        int i3 = this.k;
        int i4 = this.i;
        int i5 = i4 - i3;
        this.m += i4;
        this.k = 0;
        this.i = 0;
        List<byte[]> v = v(k - i5);
        byte[] bArr = new byte[k];
        System.arraycopy(this.h, i3, bArr, 0, i5);
        for (byte[] bArr2 : v) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return jjq.u(bArr);
    }

    @Override // defpackage.jju
    public final String B() {
        int k = k();
        if (k > 0) {
            int i = this.i;
            int i2 = this.k;
            if (k <= i - i2) {
                String str = new String(this.h, i2, k, StandardCharsets.UTF_8);
                this.k += k;
                return str;
            }
        }
        if (k == 0) {
            return "";
        }
        if (k < 0) {
            throw new jld("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (k > this.i) {
            return new String(V(k), StandardCharsets.UTF_8);
        }
        R(k);
        String str2 = new String(this.h, this.k, k, StandardCharsets.UTF_8);
        this.k += k;
        return str2;
    }

    @Override // defpackage.jju
    public final String C() {
        byte[] V;
        int k = k();
        int i = this.k;
        int i2 = this.i;
        if (k <= i2 - i && k > 0) {
            V = this.h;
            this.k = i + k;
        } else {
            if (k == 0) {
                return "";
            }
            if (k < 0) {
                throw new jld("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (k <= i2) {
                R(k);
                V = this.h;
                this.k = k;
            } else {
                V = V(k);
            }
        }
        return img.b(V, i, k);
    }

    @Override // defpackage.jju
    public final void D(int i) {
        if (this.l != i) {
            throw new jld("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.jju
    public final void E(int i) {
        this.n = i;
        K();
    }

    @Override // defpackage.jju
    public final void F(int i) {
        int i2 = this.i;
        int i3 = this.k;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.k = i3 + i;
            return;
        }
        if (i < 0) {
            throw new jld("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.m + i3;
        if (S(i5, i, this.d)) {
            throw new jld("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i6 = this.n;
        if (S(i5, i, i6)) {
            if (i6 >= i5) {
                F(i6 - i5);
            }
            throw new jld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.m = i5;
        this.i = 0;
        this.k = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long skip = this.g.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(String.valueOf(this.g.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (jld e) {
                    e.a();
                    throw e;
                }
            } finally {
                this.m += i4;
                K();
            }
        }
        if (i4 >= i) {
            return;
        }
        int i7 = this.i;
        int i8 = i7 - this.k;
        this.k = i7;
        R(1);
        while (true) {
            int i9 = i - i8;
            int i10 = this.i;
            if (i9 <= i10) {
                this.k = i9;
                return;
            } else {
                i8 += i10;
                this.k = i10;
                R(1);
            }
        }
    }

    @Override // defpackage.jju
    public final boolean G() {
        return this.k == this.i && !T(1);
    }

    @Override // defpackage.jju
    public final boolean H() {
        return w() != 0;
    }

    @Override // defpackage.jju
    public final boolean I(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.i - this.k < 10) {
                while (i3 < 10) {
                    if (a() < 0) {
                        i3++;
                    }
                }
                throw new jld("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                byte[] bArr = this.h;
                int i4 = this.k;
                this.k = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw new jld("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            F(8);
            return true;
        }
        if (i2 == 2) {
            F(k());
            return true;
        }
        if (i2 == 3) {
            P();
            D(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            O();
            return false;
        }
        if (i2 != 5) {
            throw new jlc();
        }
        F(4);
        return true;
    }

    @Override // defpackage.jju
    public final byte[] J() {
        int k = k();
        int i = this.i;
        int i2 = this.k;
        if (k > i - i2 || k <= 0) {
            if (k >= 0) {
                return V(k);
            }
            throw new jld("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] copyOfRange = Arrays.copyOfRange(this.h, i2, i2 + k);
        this.k += k;
        return copyOfRange;
    }

    public final byte a() {
        if (this.k == this.i) {
            R(1);
        }
        byte[] bArr = this.h;
        int i = this.k;
        this.k = i + 1;
        return bArr[i];
    }

    @Override // defpackage.jju
    public final double b() {
        return Double.longBitsToDouble(l());
    }

    @Override // defpackage.jju
    public final float c() {
        return Float.intBitsToFloat(j());
    }

    @Override // defpackage.jju
    public final int d() {
        int i = this.n;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.m + this.k);
    }

    @Override // defpackage.jju
    public final int e() {
        return this.m + this.k;
    }

    @Override // defpackage.jju
    public final int f(int i) {
        if (i < 0) {
            throw new jld("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.m + this.k;
        if (i > Integer.MAX_VALUE - i2) {
            throw new jld("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i3 = this.n;
        if (S(i2, i, i3)) {
            throw new jld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.n = i2 + i;
        K();
        return i3;
    }

    @Override // defpackage.jju
    public final int g() {
        return k();
    }

    @Override // defpackage.jju
    public final int h() {
        return j();
    }

    @Override // defpackage.jju
    public final int i() {
        return k();
    }

    public final int j() {
        int i = this.k;
        if (this.i - i < 4) {
            R(4);
            i = this.k;
        }
        byte[] bArr = this.h;
        this.k = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    @Override // defpackage.jju
    public final int k() {
        int i;
        int i2 = this.k;
        int i3 = this.i;
        if (i3 != i2) {
            byte[] bArr = this.h;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.k = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.k = i5;
                return i;
            }
        }
        return (int) m();
    }

    public final long l() {
        int i = this.k;
        if (this.i - i < 8) {
            R(8);
            i = this.k;
        }
        byte[] bArr = this.h;
        this.k = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    final long m() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw new jld("CodedInputStream encountered a malformed varint.");
    }

    @Override // defpackage.jju
    public final int o() {
        return j();
    }

    @Override // defpackage.jju
    public final int p() {
        int k = k();
        return (-(k & 1)) ^ (k >>> 1);
    }

    @Override // defpackage.jju
    public final int q() {
        if (G()) {
            this.l = 0;
            return 0;
        }
        int k = k();
        this.l = k;
        if ((k >>> 3) != 0) {
            return k;
        }
        throw new jld("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.jju
    public final int r() {
        return k();
    }

    @Override // defpackage.jju
    public final int s(byte[] bArr, int i, int i2) {
        jju.N(bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.i;
        int i4 = this.k;
        int i5 = i3 - i4;
        if (i5 > 0) {
            int min = Math.min(i2, i5);
            System.arraycopy(this.h, this.k, bArr, i, min);
            this.k += min;
            return min;
        }
        int min2 = Math.min(i2, (this.n - this.m) - i4);
        if (min2 <= 0) {
            return -1;
        }
        int n = n(this.g, bArr, i, min2);
        if (n != -1) {
            this.m += n;
        }
        return n;
    }

    @Override // defpackage.jju
    public final long t() {
        return l();
    }

    @Override // defpackage.jju
    public final long u() {
        return w();
    }

    @Override // defpackage.jju
    public final long w() {
        long j;
        long j2;
        long j3;
        int i = this.k;
        int i2 = this.i;
        if (i2 != i) {
            byte[] bArr = this.h;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.k = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j3 = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j3 = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j3 = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = (bArr[i8] << 28) ^ i9;
                            if (j5 >= 0) {
                                j3 = j5 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j6 = (bArr[i6] << 35) ^ j5;
                                if (j6 < 0) {
                                    j = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j7 = j6 ^ (bArr[i4] << 42);
                                    if (j7 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j6 = j7 ^ (bArr[i10] << 49);
                                        if (j6 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            j7 = j6 ^ (bArr[i4] << 56);
                                            if (j7 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                i4 = i + 10;
                                                j6 = j7 ^ (bArr[i10] << 63);
                                                if (j6 >= 0) {
                                                    j = -9151873028817141888L;
                                                }
                                            }
                                        }
                                    }
                                    j3 = j2 ^ j7;
                                    i4 = i10;
                                }
                                j3 = j6 ^ j;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.k = i4;
                return j3;
            }
        }
        return m();
    }

    @Override // defpackage.jju
    public final long x() {
        return l();
    }

    @Override // defpackage.jju
    public final long y() {
        long w = w();
        return (-(w & 1)) ^ (w >>> 1);
    }

    @Override // defpackage.jju
    public final long z() {
        return w();
    }
}
