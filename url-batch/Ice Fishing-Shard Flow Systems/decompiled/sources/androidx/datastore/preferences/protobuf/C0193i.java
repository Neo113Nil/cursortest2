package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193i extends B6.c {

    /* renamed from: c, reason: collision with root package name */
    public final FileInputStream f3510c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f3511d;

    /* renamed from: e, reason: collision with root package name */
    public int f3512e;

    /* renamed from: f, reason: collision with root package name */
    public int f3513f;

    /* renamed from: g, reason: collision with root package name */
    public int f3514g;

    /* renamed from: h, reason: collision with root package name */
    public int f3515h;

    /* renamed from: i, reason: collision with root package name */
    public int f3516i;
    public int j = Integer.MAX_VALUE;

    public C0193i(FileInputStream fileInputStream) {
        Charset charset = AbstractC0207x.f3571a;
        this.f3510c = fileInputStream;
        this.f3511d = new byte[4096];
        this.f3512e = 0;
        this.f3514g = 0;
        this.f3516i = 0;
    }

    public final byte[] A(int i2) {
        if (i2 == 0) {
            return AbstractC0207x.f3572b;
        }
        if (i2 < 0) {
            throw C0209z.d();
        }
        int i5 = this.f3516i;
        int i7 = this.f3514g;
        int i8 = i5 + i7 + i2;
        if (i8 - Integer.MAX_VALUE > 0) {
            throw new C0209z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i9 = this.j;
        if (i8 > i9) {
            J((i9 - i5) - i7);
            throw C0209z.e();
        }
        int i10 = this.f3512e - i7;
        int i11 = i2 - i10;
        FileInputStream fileInputStream = this.f3510c;
        if (i11 >= 4096) {
            try {
                if (i11 > fileInputStream.available()) {
                    return null;
                }
            } catch (C0209z e7) {
                e7.f3573d = true;
                throw e7;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f3511d, this.f3514g, bArr, 0, i10);
        this.f3516i += this.f3512e;
        this.f3514g = 0;
        this.f3512e = 0;
        while (i10 < i2) {
            try {
                int read = fileInputStream.read(bArr, i10, i2 - i10);
                if (read == -1) {
                    throw C0209z.e();
                }
                this.f3516i += read;
                i10 += read;
            } catch (C0209z e8) {
                e8.f3573d = true;
                throw e8;
            }
        }
        return bArr;
    }

    public final ArrayList B(int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int min = Math.min(i2, 4096);
            byte[] bArr = new byte[min];
            int i5 = 0;
            while (i5 < min) {
                int read = this.f3510c.read(bArr, i5, min - i5);
                if (read == -1) {
                    throw C0209z.e();
                }
                this.f3516i += read;
                i5 += read;
            }
            i2 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int i2 = this.f3514g;
        if (this.f3512e - i2 < 4) {
            I(4);
            i2 = this.f3514g;
        }
        this.f3514g = i2 + 4;
        byte[] bArr = this.f3511d;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final long D() {
        int i2 = this.f3514g;
        if (this.f3512e - i2 < 8) {
            I(8);
            i2 = this.f3514g;
        }
        this.f3514g = i2 + 8;
        byte[] bArr = this.f3511d;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public final int E() {
        int i2;
        int i5 = this.f3514g;
        int i7 = this.f3512e;
        if (i7 != i5) {
            int i8 = i5 + 1;
            byte[] bArr = this.f3511d;
            byte b7 = bArr[i5];
            if (b7 >= 0) {
                this.f3514g = i8;
                return b7;
            }
            if (i7 - i8 >= 9) {
                int i9 = i5 + 2;
                int i10 = (bArr[i8] << 7) ^ b7;
                if (i10 < 0) {
                    i2 = i10 ^ (-128);
                } else {
                    int i11 = i5 + 3;
                    int i12 = (bArr[i9] << 14) ^ i10;
                    if (i12 >= 0) {
                        i2 = i12 ^ 16256;
                    } else {
                        int i13 = i5 + 4;
                        int i14 = i12 ^ (bArr[i11] << 21);
                        if (i14 < 0) {
                            i2 = (-2080896) ^ i14;
                        } else {
                            i11 = i5 + 5;
                            byte b8 = bArr[i13];
                            int i15 = (i14 ^ (b8 << 28)) ^ 266354560;
                            if (b8 < 0) {
                                i13 = i5 + 6;
                                if (bArr[i11] < 0) {
                                    i11 = i5 + 7;
                                    if (bArr[i13] < 0) {
                                        i13 = i5 + 8;
                                        if (bArr[i11] < 0) {
                                            i11 = i5 + 9;
                                            if (bArr[i13] < 0) {
                                                int i16 = i5 + 10;
                                                if (bArr[i11] >= 0) {
                                                    i9 = i16;
                                                    i2 = i15;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i15;
                            }
                            i2 = i15;
                        }
                        i9 = i13;
                    }
                    i9 = i11;
                }
                this.f3514g = i9;
                return i2;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j;
        long j7;
        long j8;
        long j9;
        int i2 = this.f3514g;
        int i5 = this.f3512e;
        if (i5 != i2) {
            int i7 = i2 + 1;
            byte[] bArr = this.f3511d;
            byte b7 = bArr[i2];
            if (b7 >= 0) {
                this.f3514g = i7;
                return b7;
            }
            if (i5 - i7 >= 9) {
                int i8 = i2 + 2;
                int i9 = (bArr[i7] << 7) ^ b7;
                if (i9 < 0) {
                    j = i9 ^ (-128);
                } else {
                    int i10 = i2 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        j = i11 ^ 16256;
                        i8 = i10;
                    } else {
                        int i12 = i2 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            j9 = (-2080896) ^ i13;
                        } else {
                            long j10 = i13;
                            i8 = i2 + 5;
                            long j11 = j10 ^ (bArr[i12] << 28);
                            if (j11 >= 0) {
                                j8 = 266354560;
                            } else {
                                i12 = i2 + 6;
                                long j12 = j11 ^ (bArr[i8] << 35);
                                if (j12 < 0) {
                                    j7 = -34093383808L;
                                } else {
                                    i8 = i2 + 7;
                                    j11 = j12 ^ (bArr[i12] << 42);
                                    if (j11 >= 0) {
                                        j8 = 4363953127296L;
                                    } else {
                                        i12 = i2 + 8;
                                        j12 = j11 ^ (bArr[i8] << 49);
                                        if (j12 < 0) {
                                            j7 = -558586000294016L;
                                        } else {
                                            i8 = i2 + 9;
                                            long j13 = (j12 ^ (bArr[i12] << 56)) ^ 71499008037633920L;
                                            if (j13 < 0) {
                                                int i14 = i2 + 10;
                                                if (bArr[i8] >= 0) {
                                                    i8 = i14;
                                                }
                                            }
                                            j = j13;
                                        }
                                    }
                                }
                                j9 = j7 ^ j12;
                            }
                            j = j8 ^ j11;
                        }
                        i8 = i12;
                        j = j9;
                    }
                }
                this.f3514g = i8;
                return j;
            }
        }
        return G();
    }

    public final long G() {
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.f3514g == this.f3512e) {
                I(1);
            }
            int i5 = this.f3514g;
            this.f3514g = i5 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i2;
            if ((this.f3511d[i5] & 128) == 0) {
                return j;
            }
        }
        throw C0209z.c();
    }

    public final void H() {
        int i2 = this.f3512e + this.f3513f;
        this.f3512e = i2;
        int i5 = this.f3516i + i2;
        int i7 = this.j;
        if (i5 <= i7) {
            this.f3513f = 0;
            return;
        }
        int i8 = i5 - i7;
        this.f3513f = i8;
        this.f3512e = i2 - i8;
    }

    public final void I(int i2) {
        if (K(i2)) {
            return;
        }
        if (i2 <= (Integer.MAX_VALUE - this.f3516i) - this.f3514g) {
            throw C0209z.e();
        }
        throw new C0209z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void J(int i2) {
        int i5 = this.f3512e;
        int i7 = this.f3514g;
        int i8 = i5 - i7;
        if (i2 <= i8 && i2 >= 0) {
            this.f3514g = i7 + i2;
            return;
        }
        FileInputStream fileInputStream = this.f3510c;
        if (i2 < 0) {
            throw C0209z.d();
        }
        int i9 = this.f3516i;
        int i10 = i9 + i7;
        int i11 = i10 + i2;
        int i12 = this.j;
        if (i11 > i12) {
            J((i12 - i9) - i7);
            throw C0209z.e();
        }
        this.f3516i = i10;
        this.f3512e = 0;
        this.f3514g = 0;
        while (i8 < i2) {
            long j = i2 - i8;
            try {
                try {
                    long skip = fileInputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i8 += (int) skip;
                    }
                } catch (C0209z e7) {
                    e7.f3573d = true;
                    throw e7;
                }
            } catch (Throwable th) {
                this.f3516i += i8;
                H();
                throw th;
            }
        }
        this.f3516i += i8;
        H();
        if (i8 >= i2) {
            return;
        }
        int i13 = this.f3512e;
        int i14 = i13 - this.f3514g;
        this.f3514g = i13;
        I(1);
        while (true) {
            int i15 = i2 - i14;
            int i16 = this.f3512e;
            if (i15 <= i16) {
                this.f3514g = i15;
                return;
            } else {
                i14 += i16;
                this.f3514g = i16;
                I(1);
            }
        }
    }

    public final boolean K(int i2) {
        FileInputStream fileInputStream = this.f3510c;
        int i5 = this.f3514g;
        int i7 = i5 + i2;
        int i8 = this.f3512e;
        if (i7 <= i8) {
            throw new IllegalStateException(C4.p.h(i2, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i9 = this.f3516i;
        if (i2 <= (Integer.MAX_VALUE - i9) - i5 && i9 + i5 + i2 <= this.j) {
            byte[] bArr = this.f3511d;
            if (i5 > 0) {
                if (i8 > i5) {
                    System.arraycopy(bArr, i5, bArr, 0, i8 - i5);
                }
                this.f3516i += i5;
                this.f3512e -= i5;
                this.f3514g = 0;
            }
            int i10 = this.f3512e;
            try {
                int read = fileInputStream.read(bArr, i10, Math.min(bArr.length - i10, (Integer.MAX_VALUE - this.f3516i) - i10));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.f3512e += read;
                    H();
                    if (this.f3512e >= i2) {
                        return true;
                    }
                    return K(i2);
                }
            } catch (C0209z e7) {
                e7.f3573d = true;
                throw e7;
            }
        }
        return false;
    }

    @Override // B6.c
    public final void a(int i2) {
        if (this.f3515h != i2) {
            throw new C0209z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // B6.c
    public final int b() {
        return this.f3516i + this.f3514g;
    }

    @Override // B6.c
    public final boolean c() {
        return this.f3514g == this.f3512e && !K(1);
    }

    @Override // B6.c
    public final void d(int i2) {
        this.j = i2;
        H();
    }

    @Override // B6.c
    public final int e(int i2) {
        if (i2 < 0) {
            throw C0209z.d();
        }
        int i5 = this.f3516i + this.f3514g + i2;
        if (i5 < 0) {
            throw new C0209z("Failed to parse the message.");
        }
        int i7 = this.j;
        if (i5 > i7) {
            throw C0209z.e();
        }
        this.j = i5;
        H();
        return i7;
    }

    @Override // B6.c
    public final boolean f() {
        return F() != 0;
    }

    @Override // B6.c
    public final C0191g g() {
        int E7 = E();
        int i2 = this.f3512e;
        int i5 = this.f3514g;
        int i7 = i2 - i5;
        byte[] bArr = this.f3511d;
        if (E7 <= i7 && E7 > 0) {
            C0191g c7 = C0191g.c(bArr, i5, E7);
            this.f3514g += E7;
            return c7;
        }
        if (E7 == 0) {
            return C0191g.f3498i;
        }
        if (E7 < 0) {
            throw C0209z.d();
        }
        byte[] A7 = A(E7);
        if (A7 != null) {
            return C0191g.c(A7, 0, A7.length);
        }
        int i8 = this.f3514g;
        int i9 = this.f3512e;
        int i10 = i9 - i8;
        this.f3516i += i9;
        this.f3514g = 0;
        this.f3512e = 0;
        ArrayList B7 = B(E7 - i10);
        byte[] bArr2 = new byte[E7];
        System.arraycopy(bArr, i8, bArr2, 0, i10);
        int size = B7.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = B7.get(i11);
            i11++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i10, bArr3.length);
            i10 += bArr3.length;
        }
        C0191g c0191g = C0191g.f3498i;
        return new C0191g(bArr2);
    }

    @Override // B6.c
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // B6.c
    public final int i() {
        return E();
    }

    @Override // B6.c
    public final int j() {
        return C();
    }

    @Override // B6.c
    public final long k() {
        return D();
    }

    @Override // B6.c
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // B6.c
    public final int m() {
        return E();
    }

    @Override // B6.c
    public final long n() {
        return F();
    }

    @Override // B6.c
    public final int o() {
        return C();
    }

    @Override // B6.c
    public final long p() {
        return D();
    }

    @Override // B6.c
    public final int q() {
        int E7 = E();
        return (-(E7 & 1)) ^ (E7 >>> 1);
    }

    @Override // B6.c
    public final long r() {
        long F4 = F();
        return (-(F4 & 1)) ^ (F4 >>> 1);
    }

    @Override // B6.c
    public final String s() {
        int E7 = E();
        byte[] bArr = this.f3511d;
        if (E7 > 0) {
            int i2 = this.f3512e;
            int i5 = this.f3514g;
            if (E7 <= i2 - i5) {
                String str = new String(bArr, i5, E7, AbstractC0207x.f3571a);
                this.f3514g += E7;
                return str;
            }
        }
        if (E7 == 0) {
            return "";
        }
        if (E7 < 0) {
            throw C0209z.d();
        }
        if (E7 > this.f3512e) {
            return new String(z(E7), AbstractC0207x.f3571a);
        }
        I(E7);
        String str2 = new String(bArr, this.f3514g, E7, AbstractC0207x.f3571a);
        this.f3514g += E7;
        return str2;
    }

    @Override // B6.c
    public final String t() {
        int E7 = E();
        int i2 = this.f3514g;
        int i5 = this.f3512e;
        int i7 = i5 - i2;
        byte[] bArr = this.f3511d;
        if (E7 <= i7 && E7 > 0) {
            this.f3514g = i2 + E7;
        } else {
            if (E7 == 0) {
                return "";
            }
            if (E7 < 0) {
                throw C0209z.d();
            }
            i2 = 0;
            if (E7 <= i5) {
                I(E7);
                this.f3514g = E7;
            } else {
                bArr = z(E7);
            }
        }
        return l0.f3536a.t(bArr, i2, E7);
    }

    @Override // B6.c
    public final int u() {
        if (c()) {
            this.f3515h = 0;
            return 0;
        }
        int E7 = E();
        this.f3515h = E7;
        if ((E7 >>> 3) != 0) {
            return E7;
        }
        throw new C0209z("Protocol message contained an invalid tag (zero).");
    }

    @Override // B6.c
    public final int v() {
        return E();
    }

    @Override // B6.c
    public final long w() {
        return F();
    }

    @Override // B6.c
    public final boolean x(int i2) {
        int i5 = i2 & 7;
        int i7 = 0;
        if (i5 != 0) {
            if (i5 == 1) {
                J(8);
                return true;
            }
            if (i5 == 2) {
                J(E());
                return true;
            }
            if (i5 == 3) {
                y();
                a(((i2 >>> 3) << 3) | 4);
                return true;
            }
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw C0209z.b();
            }
            J(4);
            return true;
        }
        int i8 = this.f3512e - this.f3514g;
        byte[] bArr = this.f3511d;
        if (i8 >= 10) {
            while (i7 < 10) {
                int i9 = this.f3514g;
                this.f3514g = i9 + 1;
                if (bArr[i9] < 0) {
                    i7++;
                }
            }
            throw C0209z.c();
        }
        while (i7 < 10) {
            if (this.f3514g == this.f3512e) {
                I(1);
            }
            int i10 = this.f3514g;
            this.f3514g = i10 + 1;
            if (bArr[i10] < 0) {
                i7++;
            }
        }
        throw C0209z.c();
        return true;
    }

    public final byte[] z(int i2) {
        byte[] A7 = A(i2);
        if (A7 != null) {
            return A7;
        }
        int i5 = this.f3514g;
        int i7 = this.f3512e;
        int i8 = i7 - i5;
        this.f3516i += i7;
        this.f3514g = 0;
        this.f3512e = 0;
        ArrayList B7 = B(i2 - i8);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f3511d, i5, bArr, 0, i8);
        int size = B7.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = B7.get(i9);
            i9++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i8, bArr2.length);
            i8 += bArr2.length;
        }
        return bArr;
    }
}
