package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hv extends iv {
    public final FileInputStream o;
    public final byte[] p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v = Integer.MAX_VALUE;

    public hv(FileInputStream fileInputStream) {
        Charset charset = f41.a;
        this.o = fileInputStream;
        this.p = new byte[4096];
        this.q = 0;
        this.s = 0;
        this.u = 0;
    }

    @Override // defpackage.iv
    public final int A() {
        return J();
    }

    @Override // defpackage.iv
    public final long B() {
        return K();
    }

    @Override // defpackage.iv
    public final boolean C(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                O(8);
                return true;
            }
            if (i2 == 2) {
                O(J());
                return true;
            }
            if (i2 == 3) {
                D();
                b(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw u41.b();
            }
            O(4);
            return true;
        }
        int i4 = this.q - this.s;
        byte[] bArr = this.p;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.s;
                this.s = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw u41.c();
        }
        while (i3 < 10) {
            if (this.s == this.q) {
                N(1);
            }
            int i6 = this.s;
            this.s = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw u41.c();
        return true;
    }

    public final byte[] E(int i) {
        byte[] F = F(i);
        if (F != null) {
            return F;
        }
        int i2 = this.s;
        int i3 = this.q;
        int i4 = i3 - i2;
        this.u += i3;
        this.s = 0;
        this.q = 0;
        ArrayList G = G(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.p, i2, bArr, 0, i4);
        int size = G.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = G.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i) {
        if (i == 0) {
            return f41.b;
        }
        if (i < 0) {
            throw u41.d();
        }
        int i2 = this.u;
        int i3 = this.s;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new u41("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.v;
        if (i4 > i5) {
            O((i5 - i2) - i3);
            throw u41.e();
        }
        int i6 = this.q - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.o;
        if (i7 >= 4096) {
            try {
                if (i7 > fileInputStream.available()) {
                    return null;
                }
            } catch (u41 e) {
                e.m = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.p, this.s, bArr, 0, i6);
        this.u += this.q;
        this.s = 0;
        this.q = 0;
        while (i6 < i) {
            try {
                int read = fileInputStream.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw u41.e();
                }
                this.u += read;
                i6 += read;
            } catch (u41 e2) {
                e2.m = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.o.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw u41.e();
                }
                this.u += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() {
        int i = this.s;
        if (this.q - i < 4) {
            N(4);
            i = this.s;
        }
        this.s = i + 4;
        byte[] bArr = this.p;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long I() {
        int i = this.s;
        if (this.q - i < 8) {
            N(8);
            i = this.s;
        }
        this.s = i + 8;
        byte[] bArr = this.p;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int J() {
        int i;
        int i2 = this.s;
        int i3 = this.q;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.p;
            byte b = bArr[i2];
            if (b >= 0) {
                this.s = i4;
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
                this.s = i5;
                return i;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.s;
        int i2 = this.q;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.p;
            byte b = bArr[i];
            if (b >= 0) {
                this.s = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i8] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.s = i4;
                return j;
            }
        }
        return L();
    }

    public final long L() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.s == this.q) {
                N(1);
            }
            int i2 = this.s;
            this.s = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.p[i2] & 128) == 0) {
                return j;
            }
        }
        throw u41.c();
    }

    public final void M() {
        int i = this.q + this.r;
        this.q = i;
        int i2 = this.u + i;
        int i3 = this.v;
        if (i2 <= i3) {
            this.r = 0;
            return;
        }
        int i4 = i2 - i3;
        this.r = i4;
        this.q = i - i4;
    }

    public final void N(int i) {
        if (P(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.u) - this.s) {
            throw u41.e();
        }
        throw new u41("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void O(int i) {
        int i2 = this.q;
        int i3 = this.s;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.s = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.o;
        if (i < 0) {
            throw u41.d();
        }
        int i5 = this.u;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.v;
        if (i7 > i8) {
            O((i8 - i5) - i3);
            throw u41.e();
        }
        this.u = i6;
        this.q = 0;
        this.s = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long skip = fileInputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (u41 e) {
                    e.m = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.u += i4;
                M();
                throw th;
            }
        }
        this.u += i4;
        M();
        if (i4 >= i) {
            return;
        }
        int i9 = this.q;
        int i10 = i9 - this.s;
        this.s = i9;
        N(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.q;
            if (i11 <= i12) {
                this.s = i11;
                return;
            } else {
                i10 += i12;
                this.s = i12;
                N(1);
            }
        }
    }

    public final boolean P(int i) {
        FileInputStream fileInputStream = this.o;
        int i2 = this.s;
        int i3 = i2 + i;
        int i4 = this.q;
        if (i3 <= i4) {
            lh.g(in1.l(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.u;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.v) {
            byte[] bArr = this.p;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.u += i2;
                this.q -= i2;
                this.s = 0;
            }
            int i6 = this.q;
            try {
                int read = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.u) - i6));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.q += read;
                    M();
                    if (this.q >= i) {
                        return true;
                    }
                    return P(i);
                }
            } catch (u41 e) {
                e.m = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.iv
    public final void b(int i) {
        if (this.t != i) {
            throw new u41("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.iv
    public final int c() {
        return this.u + this.s;
    }

    @Override // defpackage.iv
    public final boolean d() {
        return this.s == this.q && !P(1);
    }

    @Override // defpackage.iv
    public final void i(int i) {
        this.v = i;
        M();
    }

    @Override // defpackage.iv
    public final int j(int i) {
        if (i < 0) {
            throw u41.d();
        }
        int i2 = this.u + this.s + i;
        if (i2 < 0) {
            throw new u41("Failed to parse the message.");
        }
        int i3 = this.v;
        if (i2 > i3) {
            throw u41.e();
        }
        this.v = i2;
        M();
        return i3;
    }

    @Override // defpackage.iv
    public final boolean k() {
        return K() != 0;
    }

    @Override // defpackage.iv
    public final cr l() {
        int J = J();
        int i = this.q;
        int i2 = this.s;
        int i3 = i - i2;
        byte[] bArr = this.p;
        if (J <= i3 && J > 0) {
            cr c = er.c(bArr, i2, J);
            this.s += J;
            return c;
        }
        if (J == 0) {
            return er.n;
        }
        if (J < 0) {
            throw u41.d();
        }
        byte[] F = F(J);
        if (F != null) {
            return er.c(F, 0, F.length);
        }
        int i4 = this.s;
        int i5 = this.q;
        int i6 = i5 - i4;
        this.u += i5;
        this.s = 0;
        this.q = 0;
        ArrayList G = G(J - i6);
        byte[] bArr2 = new byte[J];
        System.arraycopy(bArr, i4, bArr2, 0, i6);
        int size = G.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = G.get(i7);
            i7++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
            i6 += bArr3.length;
        }
        cr crVar = er.n;
        return new cr(bArr2);
    }

    @Override // defpackage.iv
    public final double m() {
        return Double.longBitsToDouble(I());
    }

    @Override // defpackage.iv
    public final int n() {
        return J();
    }

    @Override // defpackage.iv
    public final int o() {
        return H();
    }

    @Override // defpackage.iv
    public final long p() {
        return I();
    }

    @Override // defpackage.iv
    public final float q() {
        return Float.intBitsToFloat(H());
    }

    @Override // defpackage.iv
    public final int r() {
        return J();
    }

    @Override // defpackage.iv
    public final long s() {
        return K();
    }

    @Override // defpackage.iv
    public final int t() {
        return H();
    }

    @Override // defpackage.iv
    public final long u() {
        return I();
    }

    @Override // defpackage.iv
    public final int v() {
        int J = J();
        return (-(J & 1)) ^ (J >>> 1);
    }

    @Override // defpackage.iv
    public final long w() {
        long K = K();
        return (-(K & 1)) ^ (K >>> 1);
    }

    @Override // defpackage.iv
    public final String x() {
        int J = J();
        byte[] bArr = this.p;
        if (J > 0) {
            int i = this.q;
            int i2 = this.s;
            if (J <= i - i2) {
                String str = new String(bArr, i2, J, f41.a);
                this.s += J;
                return str;
            }
        }
        if (J == 0) {
            return BuildConfig.FLAVOR;
        }
        if (J < 0) {
            throw u41.d();
        }
        if (J > this.q) {
            return new String(E(J), f41.a);
        }
        N(J);
        String str2 = new String(bArr, this.s, J, f41.a);
        this.s += J;
        return str2;
    }

    @Override // defpackage.iv
    public final String y() {
        int J = J();
        int i = this.s;
        int i2 = this.q;
        int i3 = i2 - i;
        byte[] bArr = this.p;
        if (J <= i3 && J > 0) {
            this.s = i + J;
        } else {
            if (J == 0) {
                return BuildConfig.FLAVOR;
            }
            if (J < 0) {
                throw u41.d();
            }
            i = 0;
            if (J <= i2) {
                N(J);
                this.s = J;
            } else {
                bArr = E(J);
            }
        }
        return l33.a.g(bArr, i, J);
    }

    @Override // defpackage.iv
    public final int z() {
        if (d()) {
            this.t = 0;
            return 0;
        }
        int J = J();
        this.t = J;
        if ((J >>> 3) != 0) {
            return J;
        }
        throw new u41("Protocol message contained an invalid tag (zero).");
    }
}
