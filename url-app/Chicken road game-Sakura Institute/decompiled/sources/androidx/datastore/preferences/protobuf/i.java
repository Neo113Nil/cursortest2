package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f832c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f833d;

    /* renamed from: e, reason: collision with root package name */
    public int f834e;

    /* renamed from: f, reason: collision with root package name */
    public int f835f;

    /* renamed from: g, reason: collision with root package name */
    public int f836g;

    /* renamed from: h, reason: collision with root package name */
    public int f837h;

    /* renamed from: i, reason: collision with root package name */
    public int f838i;

    /* renamed from: j, reason: collision with root package name */
    public int f839j = Integer.MAX_VALUE;

    public i(InputStream inputStream) {
        Charset charset = x.f922a;
        this.f832c = inputStream;
        this.f833d = new byte[4096];
        this.f834e = 0;
        this.f836g = 0;
        this.f838i = 0;
    }

    public final ArrayList A(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, 4096);
            byte[] bArr = new byte[min];
            int i8 = 0;
            while (i8 < min) {
                int read = this.f832c.read(bArr, i8, min - i8);
                if (read == -1) {
                    throw z.e();
                }
                this.f838i += read;
                i8 += read;
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int B() {
        int i7 = this.f836g;
        if (this.f834e - i7 < 4) {
            H(4);
            i7 = this.f836g;
        }
        this.f836g = i7 + 4;
        byte[] bArr = this.f833d;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long C() {
        int i7 = this.f836g;
        if (this.f834e - i7 < 8) {
            H(8);
            i7 = this.f836g;
        }
        this.f836g = i7 + 8;
        byte[] bArr = this.f833d;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final int D() {
        int i7;
        int i8 = this.f836g;
        int i9 = this.f834e;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f833d;
            byte b9 = bArr[i8];
            if (b9 >= 0) {
                this.f836g = i10;
                return b9;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b9;
                if (i12 < 0) {
                    i7 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i7 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i7 = (-2080896) ^ i16;
                        } else {
                            i13 = i8 + 5;
                            byte b10 = bArr[i15];
                            int i17 = (i16 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i7 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i17;
                            }
                            i7 = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.f836g = i11;
                return i7;
            }
        }
        return (int) F();
    }

    public final long E() {
        long j8;
        long j9;
        long j10;
        long j11;
        int i7 = this.f836g;
        int i8 = this.f834e;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f833d;
            byte b9 = bArr[i7];
            if (b9 >= 0) {
                this.f836g = i9;
                return b9;
            }
            if (i8 - i9 >= 9) {
                int i10 = i7 + 2;
                int i11 = (bArr[i9] << 7) ^ b9;
                if (i11 < 0) {
                    j8 = i11 ^ (-128);
                } else {
                    int i12 = i7 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j8 = i13 ^ 16256;
                        i10 = i12;
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            j11 = (-2080896) ^ i15;
                        } else {
                            long j12 = i15;
                            i10 = i7 + 5;
                            long j13 = j12 ^ (bArr[i14] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                i14 = i7 + 6;
                                long j14 = j13 ^ (bArr[i10] << 35);
                                if (j14 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    i10 = i7 + 7;
                                    j13 = j14 ^ (bArr[i14] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i14 = i7 + 8;
                                        j14 = j13 ^ (bArr[i10] << 49);
                                        if (j14 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i10 = i7 + 9;
                                            long j15 = (j14 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i16 = i7 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i16;
                                                }
                                            }
                                            j8 = j15;
                                        }
                                    }
                                }
                                j11 = j9 ^ j14;
                            }
                            j8 = j10 ^ j13;
                        }
                        i10 = i14;
                        j8 = j11;
                    }
                }
                this.f836g = i10;
                return j8;
            }
        }
        return F();
    }

    public final long F() {
        long j8 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f836g == this.f834e) {
                H(1);
            }
            int i8 = this.f836g;
            this.f836g = i8 + 1;
            j8 |= (r3 & Byte.MAX_VALUE) << i7;
            if ((this.f833d[i8] & 128) == 0) {
                return j8;
            }
        }
        throw z.c();
    }

    public final void G() {
        int i7 = this.f834e + this.f835f;
        this.f834e = i7;
        int i8 = this.f838i + i7;
        int i9 = this.f839j;
        if (i8 <= i9) {
            this.f835f = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f835f = i10;
        this.f834e = i7 - i10;
    }

    public final void H(int i7) {
        if (J(i7)) {
            return;
        }
        if (i7 <= (Integer.MAX_VALUE - this.f838i) - this.f836g) {
            throw z.e();
        }
        throw new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void I(int i7) {
        int i8 = this.f834e;
        int i9 = this.f836g;
        if (i7 <= i8 - i9 && i7 >= 0) {
            this.f836g = i9 + i7;
            return;
        }
        InputStream inputStream = this.f832c;
        if (i7 < 0) {
            throw z.d();
        }
        int i10 = this.f838i;
        int i11 = i10 + i9;
        int i12 = i11 + i7;
        int i13 = this.f839j;
        if (i12 > i13) {
            I((i13 - i10) - i9);
            throw z.e();
        }
        this.f838i = i11;
        int i14 = i8 - i9;
        this.f834e = 0;
        this.f836g = 0;
        while (i14 < i7) {
            long j8 = i7 - i14;
            try {
                try {
                    long skip = inputStream.skip(j8);
                    if (skip < 0 || skip > j8) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i14 += (int) skip;
                    }
                } catch (z e9) {
                    e9.f928f = true;
                    throw e9;
                }
            } catch (Throwable th) {
                this.f838i += i14;
                G();
                throw th;
            }
        }
        this.f838i += i14;
        G();
        if (i14 >= i7) {
            return;
        }
        int i15 = this.f834e;
        int i16 = i15 - this.f836g;
        this.f836g = i15;
        H(1);
        while (true) {
            int i17 = i7 - i16;
            int i18 = this.f834e;
            if (i17 <= i18) {
                this.f836g = i17;
                return;
            } else {
                i16 += i18;
                this.f836g = i18;
                H(1);
            }
        }
    }

    public final boolean J(int i7) {
        InputStream inputStream = this.f832c;
        int i8 = this.f836g;
        int i9 = i8 + i7;
        int i10 = this.f834e;
        if (i9 <= i10) {
            throw new IllegalStateException(a0.m.g(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i11 = this.f838i;
        if (i7 <= (Integer.MAX_VALUE - i11) - i8 && i11 + i8 + i7 <= this.f839j) {
            byte[] bArr = this.f833d;
            if (i8 > 0) {
                if (i10 > i8) {
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f838i += i8;
                this.f834e -= i8;
                this.f836g = 0;
            }
            int i12 = this.f834e;
            try {
                int read = inputStream.read(bArr, i12, Math.min(bArr.length - i12, (Integer.MAX_VALUE - this.f838i) - i12));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.f834e += read;
                    G();
                    if (this.f834e >= i7) {
                        return true;
                    }
                    return J(i7);
                }
            } catch (z e9) {
                e9.f928f = true;
                throw e9;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void a(int i7) {
        if (this.f837h != i7) {
            throw new z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int b() {
        return this.f838i + this.f836g;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean c() {
        return this.f836g == this.f834e && !J(1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void d(int i7) {
        this.f839j = i7;
        G();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int e(int i7) {
        if (i7 < 0) {
            throw z.d();
        }
        int i8 = this.f838i + this.f836g + i7;
        int i9 = this.f839j;
        if (i8 > i9) {
            throw z.e();
        }
        this.f839j = i8;
        G();
        return i9;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean f() {
        return E() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final g g() {
        int D = D();
        int i7 = this.f834e;
        int i8 = this.f836g;
        int i9 = i7 - i8;
        byte[] bArr = this.f833d;
        if (D <= i9 && D > 0) {
            g m8 = g.m(bArr, i8, D);
            this.f836g += D;
            return m8;
        }
        if (D == 0) {
            return g.f816h;
        }
        byte[] z8 = z(D);
        if (z8 != null) {
            return g.m(z8, 0, z8.length);
        }
        int i10 = this.f836g;
        int i11 = this.f834e;
        int i12 = i11 - i10;
        this.f838i += i11;
        this.f836g = 0;
        this.f834e = 0;
        ArrayList A = A(D - i12);
        byte[] bArr2 = new byte[D];
        System.arraycopy(bArr, i10, bArr2, 0, i12);
        int size = A.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = A.get(i13);
            i13++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i12, bArr3.length);
            i12 += bArr3.length;
        }
        g gVar = g.f816h;
        return new g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final double h() {
        return Double.longBitsToDouble(C());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int i() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int j() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long k() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final float l() {
        return Float.intBitsToFloat(B());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int m() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long n() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int o() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long p() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int q() {
        int D = D();
        return (-(D & 1)) ^ (D >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long r() {
        long E = E();
        return (-(E & 1)) ^ (E >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String s() {
        int D = D();
        byte[] bArr = this.f833d;
        if (D > 0) {
            int i7 = this.f834e;
            int i8 = this.f836g;
            if (D <= i7 - i8) {
                String str = new String(bArr, i8, D, x.f922a);
                this.f836g += D;
                return str;
            }
        }
        if (D == 0) {
            return "";
        }
        if (D > this.f834e) {
            return new String(y(D), x.f922a);
        }
        H(D);
        String str2 = new String(bArr, this.f836g, D, x.f922a);
        this.f836g += D;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String t() {
        int D = D();
        int i7 = this.f836g;
        int i8 = this.f834e;
        int i9 = i8 - i7;
        byte[] bArr = this.f833d;
        if (D <= i9 && D > 0) {
            this.f836g = i7 + D;
        } else {
            if (D == 0) {
                return "";
            }
            i7 = 0;
            if (D <= i8) {
                H(D);
                this.f836g = D;
            } else {
                bArr = y(D);
            }
        }
        return u1.f915a.a(bArr, i7, D);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int u() {
        if (c()) {
            this.f837h = 0;
            return 0;
        }
        int D = D();
        this.f837h = D;
        if ((D >>> 3) != 0) {
            return D;
        }
        throw new z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int v() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long w() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean x(int i7) {
        int u8;
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            int i10 = this.f834e - this.f836g;
            byte[] bArr = this.f833d;
            if (i10 >= 10) {
                while (i9 < 10) {
                    int i11 = this.f836g;
                    this.f836g = i11 + 1;
                    if (bArr[i11] < 0) {
                        i9++;
                    }
                }
                throw z.c();
            }
            while (i9 < 10) {
                if (this.f836g == this.f834e) {
                    H(1);
                }
                int i12 = this.f836g;
                this.f836g = i12 + 1;
                if (bArr[i12] < 0) {
                    i9++;
                }
            }
            throw z.c();
            return true;
        }
        if (i8 == 1) {
            I(8);
            return true;
        }
        if (i8 == 2) {
            I(D());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw z.b();
            }
            I(4);
            return true;
        }
        do {
            u8 = u();
            if (u8 == 0) {
                break;
            }
        } while (x(u8));
        a(((i7 >>> 3) << 3) | 4);
        return true;
    }

    public final byte[] y(int i7) {
        byte[] z8 = z(i7);
        if (z8 != null) {
            return z8;
        }
        int i8 = this.f836g;
        int i9 = this.f834e;
        int i10 = i9 - i8;
        this.f838i += i9;
        this.f836g = 0;
        this.f834e = 0;
        ArrayList A = A(i7 - i10);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f833d, i8, bArr, 0, i10);
        int size = A.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = A.get(i11);
            i11++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
            i10 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] z(int i7) {
        if (i7 == 0) {
            return x.f923b;
        }
        if (i7 < 0) {
            throw z.d();
        }
        int i8 = this.f838i;
        int i9 = this.f836g;
        int i10 = i8 + i9 + i7;
        if (i10 - Integer.MAX_VALUE > 0) {
            throw new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i11 = this.f839j;
        if (i10 > i11) {
            I((i11 - i8) - i9);
            throw z.e();
        }
        int i12 = this.f834e - i9;
        int i13 = i7 - i12;
        InputStream inputStream = this.f832c;
        if (i13 >= 4096) {
            try {
                if (i13 > inputStream.available()) {
                    return null;
                }
            } catch (z e9) {
                e9.f928f = true;
                throw e9;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f833d, this.f836g, bArr, 0, i12);
        this.f838i += this.f834e;
        this.f836g = 0;
        this.f834e = 0;
        while (i12 < i7) {
            try {
                int read = inputStream.read(bArr, i12, i7 - i12);
                if (read == -1) {
                    throw z.e();
                }
                this.f838i += read;
                i12 += read;
            } catch (z e10) {
                e10.f928f = true;
                throw e10;
            }
        }
        return bArr;
    }
}
