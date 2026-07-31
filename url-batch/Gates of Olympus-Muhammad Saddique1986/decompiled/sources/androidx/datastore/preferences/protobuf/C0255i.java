package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255i extends AbstractC0256j {

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f5081c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5082d;

    /* renamed from: e, reason: collision with root package name */
    public int f5083e;

    /* renamed from: f, reason: collision with root package name */
    public int f5084f;

    /* renamed from: g, reason: collision with root package name */
    public int f5085g;

    /* renamed from: h, reason: collision with root package name */
    public int f5086h;

    /* renamed from: i, reason: collision with root package name */
    public int f5087i;

    /* renamed from: j, reason: collision with root package name */
    public int f5088j = Integer.MAX_VALUE;

    public C0255i(InputStream inputStream) {
        Charset charset = AbstractC0269x.f5135a;
        this.f5081c = inputStream;
        this.f5082d = new byte[4096];
        this.f5083e = 0;
        this.f5085g = 0;
        this.f5087i = 0;
    }

    public final ArrayList A(int i3) {
        ArrayList arrayList = new ArrayList();
        while (i3 > 0) {
            int min = Math.min(i3, 4096);
            byte[] bArr = new byte[min];
            int i4 = 0;
            while (i4 < min) {
                int read = this.f5081c.read(bArr, i4, min - i4);
                if (read == -1) {
                    throw C0271z.e();
                }
                this.f5087i += read;
                i4 += read;
            }
            i3 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int B() {
        int i3 = this.f5085g;
        if (this.f5083e - i3 < 4) {
            H(4);
            i3 = this.f5085g;
        }
        this.f5085g = i3 + 4;
        byte[] bArr = this.f5082d;
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public final long C() {
        int i3 = this.f5085g;
        if (this.f5083e - i3 < 8) {
            H(8);
            i3 = this.f5085g;
        }
        this.f5085g = i3 + 8;
        byte[] bArr = this.f5082d;
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public final int D() {
        int i3;
        int i4 = this.f5085g;
        int i5 = this.f5083e;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f5082d;
            byte b3 = bArr[i4];
            if (b3 >= 0) {
                this.f5085g = i6;
                return b3;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i8 = (bArr[i6] << 7) ^ b3;
                if (i8 < 0) {
                    i3 = i8 ^ (-128);
                } else {
                    int i9 = i4 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        i3 = i10 ^ 16256;
                    } else {
                        int i11 = i4 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            i3 = (-2080896) ^ i12;
                        } else {
                            i9 = i4 + 5;
                            byte b4 = bArr[i11];
                            int i13 = (i12 ^ (b4 << 28)) ^ 266354560;
                            if (b4 < 0) {
                                i11 = i4 + 6;
                                if (bArr[i9] < 0) {
                                    i9 = i4 + 7;
                                    if (bArr[i11] < 0) {
                                        i11 = i4 + 8;
                                        if (bArr[i9] < 0) {
                                            i9 = i4 + 9;
                                            if (bArr[i11] < 0) {
                                                int i14 = i4 + 10;
                                                if (bArr[i9] >= 0) {
                                                    i7 = i14;
                                                    i3 = i13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i3 = i13;
                            }
                            i3 = i13;
                        }
                        i7 = i11;
                    }
                    i7 = i9;
                }
                this.f5085g = i7;
                return i3;
            }
        }
        return (int) F();
    }

    public final long E() {
        long j3;
        long j4;
        long j5;
        long j6;
        int i3 = this.f5085g;
        int i4 = this.f5083e;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f5082d;
            byte b3 = bArr[i3];
            if (b3 >= 0) {
                this.f5085g = i5;
                return b3;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b3;
                if (i7 < 0) {
                    j3 = i7 ^ (-128);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        j3 = i9 ^ 16256;
                        i6 = i8;
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            j6 = (-2080896) ^ i11;
                        } else {
                            long j7 = i11;
                            i6 = i3 + 5;
                            long j8 = j7 ^ (bArr[i10] << 28);
                            if (j8 >= 0) {
                                j5 = 266354560;
                            } else {
                                i10 = i3 + 6;
                                long j9 = j8 ^ (bArr[i6] << 35);
                                if (j9 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i6 = i3 + 7;
                                    j8 = j9 ^ (bArr[i10] << 42);
                                    if (j8 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i10 = i3 + 8;
                                        j9 = j8 ^ (bArr[i6] << 49);
                                        if (j9 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i6 = i3 + 9;
                                            long j10 = (j9 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                int i12 = i3 + 10;
                                                if (bArr[i6] >= 0) {
                                                    i6 = i12;
                                                }
                                            }
                                            j3 = j10;
                                        }
                                    }
                                }
                                j6 = j4 ^ j9;
                            }
                            j3 = j5 ^ j8;
                        }
                        i6 = i10;
                        j3 = j6;
                    }
                }
                this.f5085g = i6;
                return j3;
            }
        }
        return F();
    }

    public final long F() {
        long j3 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            if (this.f5085g == this.f5083e) {
                H(1);
            }
            int i4 = this.f5085g;
            this.f5085g = i4 + 1;
            j3 |= (r3 & Byte.MAX_VALUE) << i3;
            if ((this.f5082d[i4] & 128) == 0) {
                return j3;
            }
        }
        throw C0271z.c();
    }

    public final void G() {
        int i3 = this.f5083e + this.f5084f;
        this.f5083e = i3;
        int i4 = this.f5087i + i3;
        int i5 = this.f5088j;
        if (i4 <= i5) {
            this.f5084f = 0;
            return;
        }
        int i6 = i4 - i5;
        this.f5084f = i6;
        this.f5083e = i3 - i6;
    }

    public final void H(int i3) {
        if (J(i3)) {
            return;
        }
        if (i3 <= (Integer.MAX_VALUE - this.f5087i) - this.f5085g) {
            throw C0271z.e();
        }
        throw new C0271z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void I(int i3) {
        int i4 = this.f5083e;
        int i5 = this.f5085g;
        if (i3 <= i4 - i5 && i3 >= 0) {
            this.f5085g = i5 + i3;
            return;
        }
        InputStream inputStream = this.f5081c;
        if (i3 < 0) {
            throw C0271z.d();
        }
        int i6 = this.f5087i;
        int i7 = i6 + i5;
        int i8 = i7 + i3;
        int i9 = this.f5088j;
        if (i8 > i9) {
            I((i9 - i6) - i5);
            throw C0271z.e();
        }
        this.f5087i = i7;
        int i10 = i4 - i5;
        this.f5083e = 0;
        this.f5085g = 0;
        while (i10 < i3) {
            long j3 = i3 - i10;
            try {
                try {
                    long skip = inputStream.skip(j3);
                    if (skip < 0 || skip > j3) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i10 += (int) skip;
                    }
                } catch (C0271z e3) {
                    e3.f5137d = true;
                    throw e3;
                }
            } catch (Throwable th) {
                this.f5087i += i10;
                G();
                throw th;
            }
        }
        this.f5087i += i10;
        G();
        if (i10 >= i3) {
            return;
        }
        int i11 = this.f5083e;
        int i12 = i11 - this.f5085g;
        this.f5085g = i11;
        H(1);
        while (true) {
            int i13 = i3 - i12;
            int i14 = this.f5083e;
            if (i13 <= i14) {
                this.f5085g = i13;
                return;
            } else {
                i12 += i14;
                this.f5085g = i14;
                H(1);
            }
        }
    }

    public final boolean J(int i3) {
        int i4 = this.f5085g;
        int i5 = i4 + i3;
        int i6 = this.f5083e;
        if (i5 <= i6) {
            throw new IllegalStateException(A.k.g(i3, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i7 = this.f5087i;
        if (i3 > (Integer.MAX_VALUE - i7) - i4 || i7 + i4 + i3 > this.f5088j) {
            return false;
        }
        byte[] bArr = this.f5082d;
        if (i4 > 0) {
            if (i6 > i4) {
                System.arraycopy(bArr, i4, bArr, 0, i6 - i4);
            }
            this.f5087i += i4;
            this.f5083e -= i4;
            this.f5085g = 0;
        }
        int i8 = this.f5083e;
        int min = Math.min(bArr.length - i8, (Integer.MAX_VALUE - this.f5087i) - i8);
        InputStream inputStream = this.f5081c;
        try {
            int read = inputStream.read(bArr, i8, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f5083e += read;
            G();
            if (this.f5083e >= i3) {
                return true;
            }
            return J(i3);
        } catch (C0271z e3) {
            e3.f5137d = true;
            throw e3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final void a(int i3) {
        if (this.f5086h != i3) {
            throw new C0271z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final int b() {
        return this.f5087i + this.f5085g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final boolean c() {
        return this.f5085g == this.f5083e && !J(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final void d(int i3) {
        this.f5088j = i3;
        G();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final int e(int i3) {
        if (i3 < 0) {
            throw C0271z.d();
        }
        int i4 = this.f5087i + this.f5085g + i3;
        int i5 = this.f5088j;
        if (i4 > i5) {
            throw C0271z.e();
        }
        this.f5088j = i4;
        G();
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final boolean f() {
        return E() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final C0253g g() {
        int D = D();
        int i3 = this.f5083e;
        int i4 = this.f5085g;
        int i5 = i3 - i4;
        byte[] bArr = this.f5082d;
        if (D <= i5 && D > 0) {
            C0253g d3 = C0253g.d(bArr, i4, D);
            this.f5085g += D;
            return d3;
        }
        if (D == 0) {
            return C0253g.f5064f;
        }
        byte[] z3 = z(D);
        if (z3 != null) {
            return C0253g.d(z3, 0, z3.length);
        }
        int i6 = this.f5085g;
        int i7 = this.f5083e;
        int i8 = i7 - i6;
        this.f5087i += i7;
        this.f5085g = 0;
        this.f5083e = 0;
        ArrayList A3 = A(D - i8);
        byte[] bArr2 = new byte[D];
        System.arraycopy(bArr, i6, bArr2, 0, i8);
        Iterator it = A3.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i8, bArr3.length);
            i8 += bArr3.length;
        }
        C0253g c0253g = C0253g.f5064f;
        return new C0253g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final double h() {
        return Double.longBitsToDouble(C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final int i() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final int j() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final long k() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final float l() {
        return Float.intBitsToFloat(B());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final int m() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final long n() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final int o() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final long p() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final int q() {
        int D = D();
        return (-(D & 1)) ^ (D >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final long r() {
        long E3 = E();
        return (-(E3 & 1)) ^ (E3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final String s() {
        int D = D();
        byte[] bArr = this.f5082d;
        if (D > 0) {
            int i3 = this.f5083e;
            int i4 = this.f5085g;
            if (D <= i3 - i4) {
                String str = new String(bArr, i4, D, AbstractC0269x.f5135a);
                this.f5085g += D;
                return str;
            }
        }
        if (D == 0) {
            return "";
        }
        if (D > this.f5083e) {
            return new String(y(D), AbstractC0269x.f5135a);
        }
        H(D);
        String str2 = new String(bArr, this.f5085g, D, AbstractC0269x.f5135a);
        this.f5085g += D;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final String t() {
        int D = D();
        int i3 = this.f5085g;
        int i4 = this.f5083e;
        int i5 = i4 - i3;
        byte[] bArr = this.f5082d;
        if (D <= i5 && D > 0) {
            this.f5085g = i3 + D;
        } else {
            if (D == 0) {
                return "";
            }
            i3 = 0;
            if (D <= i4) {
                H(D);
                this.f5085g = D;
            } else {
                bArr = y(D);
            }
        }
        return v0.f5134a.a(bArr, i3, D);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final int u() {
        if (c()) {
            this.f5086h = 0;
            return 0;
        }
        int D = D();
        this.f5086h = D;
        if ((D >>> 3) != 0) {
            return D;
        }
        throw new C0271z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final int v() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final long w() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0256j
    public final boolean x(int i3) {
        int u3;
        int i4 = i3 & 7;
        int i5 = 0;
        if (i4 == 0) {
            int i6 = this.f5083e - this.f5085g;
            byte[] bArr = this.f5082d;
            if (i6 >= 10) {
                while (i5 < 10) {
                    int i7 = this.f5085g;
                    this.f5085g = i7 + 1;
                    if (bArr[i7] < 0) {
                        i5++;
                    }
                }
                throw C0271z.c();
            }
            while (i5 < 10) {
                if (this.f5085g == this.f5083e) {
                    H(1);
                }
                int i8 = this.f5085g;
                this.f5085g = i8 + 1;
                if (bArr[i8] < 0) {
                    i5++;
                }
            }
            throw C0271z.c();
            return true;
        }
        if (i4 == 1) {
            I(8);
            return true;
        }
        if (i4 == 2) {
            I(D());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw C0271z.b();
            }
            I(4);
            return true;
        }
        do {
            u3 = u();
            if (u3 == 0) {
                break;
            }
        } while (x(u3));
        a(((i3 >>> 3) << 3) | 4);
        return true;
    }

    public final byte[] y(int i3) {
        byte[] z3 = z(i3);
        if (z3 != null) {
            return z3;
        }
        int i4 = this.f5085g;
        int i5 = this.f5083e;
        int i6 = i5 - i4;
        this.f5087i += i5;
        this.f5085g = 0;
        this.f5083e = 0;
        ArrayList A3 = A(i3 - i6);
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f5082d, i4, bArr, 0, i6);
        Iterator it = A3.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
            i6 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] z(int i3) {
        if (i3 == 0) {
            return AbstractC0269x.f5136b;
        }
        if (i3 < 0) {
            throw C0271z.d();
        }
        int i4 = this.f5087i;
        int i5 = this.f5085g;
        int i6 = i4 + i5 + i3;
        if (i6 - Integer.MAX_VALUE > 0) {
            throw new C0271z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i7 = this.f5088j;
        if (i6 > i7) {
            I((i7 - i4) - i5);
            throw C0271z.e();
        }
        int i8 = this.f5083e - i5;
        int i9 = i3 - i8;
        InputStream inputStream = this.f5081c;
        if (i9 >= 4096) {
            try {
                if (i9 > inputStream.available()) {
                    return null;
                }
            } catch (C0271z e3) {
                e3.f5137d = true;
                throw e3;
            }
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f5082d, this.f5085g, bArr, 0, i8);
        this.f5087i += this.f5083e;
        this.f5085g = 0;
        this.f5083e = 0;
        while (i8 < i3) {
            try {
                int read = inputStream.read(bArr, i8, i3 - i8);
                if (read == -1) {
                    throw C0271z.e();
                }
                this.f5087i += read;
                i8 += read;
            } catch (C0271z e4) {
                e4.f5137d = true;
                throw e4;
            }
        }
        return bArr;
    }
}
