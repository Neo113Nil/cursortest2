package androidx.datastore.preferences.protobuf;

import A.AbstractC0017m;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444i extends AbstractC0445j {

    /* renamed from: c, reason: collision with root package name */
    public final InputStream f5355c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5356d;

    /* renamed from: e, reason: collision with root package name */
    public int f5357e;

    /* renamed from: f, reason: collision with root package name */
    public int f5358f;

    /* renamed from: g, reason: collision with root package name */
    public int f5359g;

    /* renamed from: h, reason: collision with root package name */
    public int f5360h;

    /* renamed from: i, reason: collision with root package name */
    public int f5361i;

    /* renamed from: j, reason: collision with root package name */
    public int f5362j = Integer.MAX_VALUE;

    public C0444i(InputStream inputStream) {
        AbstractC0458x.a(inputStream, "input");
        this.f5355c = inputStream;
        this.f5356d = new byte[4096];
        this.f5357e = 0;
        this.f5359g = 0;
        this.f5361i = 0;
    }

    public final ArrayList A(int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int min = Math.min(i2, 4096);
            byte[] bArr = new byte[min];
            int i4 = 0;
            while (i4 < min) {
                int read = this.f5355c.read(bArr, i4, min - i4);
                if (read == -1) {
                    throw C0460z.e();
                }
                this.f5361i += read;
                i4 += read;
            }
            i2 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int B() {
        int i2 = this.f5359g;
        if (this.f5357e - i2 < 4) {
            H(4);
            i2 = this.f5359g;
        }
        this.f5359g = i2 + 4;
        byte[] bArr = this.f5356d;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final long C() {
        int i2 = this.f5359g;
        if (this.f5357e - i2 < 8) {
            H(8);
            i2 = this.f5359g;
        }
        this.f5359g = i2 + 8;
        byte[] bArr = this.f5356d;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public final int D() {
        int i2;
        int i4 = this.f5359g;
        int i5 = this.f5357e;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f5356d;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.f5359g = i6;
                return b4;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i8 = (bArr[i6] << 7) ^ b4;
                if (i8 < 0) {
                    i2 = i8 ^ (-128);
                } else {
                    int i9 = i4 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        i2 = i10 ^ 16256;
                    } else {
                        int i11 = i4 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            i2 = (-2080896) ^ i12;
                        } else {
                            i9 = i4 + 5;
                            byte b5 = bArr[i11];
                            int i13 = (i12 ^ (b5 << 28)) ^ 266354560;
                            if (b5 < 0) {
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
                                                    i2 = i13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i13;
                            }
                            i2 = i13;
                        }
                        i7 = i11;
                    }
                    i7 = i9;
                }
                this.f5359g = i7;
                return i2;
            }
        }
        return (int) F();
    }

    public final long E() {
        long j4;
        long j5;
        long j6;
        long j7;
        int i2 = this.f5359g;
        int i4 = this.f5357e;
        if (i4 != i2) {
            int i5 = i2 + 1;
            byte[] bArr = this.f5356d;
            byte b4 = bArr[i2];
            if (b4 >= 0) {
                this.f5359g = i5;
                return b4;
            }
            if (i4 - i5 >= 9) {
                int i6 = i2 + 2;
                int i7 = (bArr[i5] << 7) ^ b4;
                if (i7 < 0) {
                    j4 = i7 ^ (-128);
                } else {
                    int i8 = i2 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        j4 = i9 ^ 16256;
                        i6 = i8;
                    } else {
                        int i10 = i2 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            j7 = (-2080896) ^ i11;
                        } else {
                            long j8 = i11;
                            i6 = i2 + 5;
                            long j9 = j8 ^ (bArr[i10] << 28);
                            if (j9 >= 0) {
                                j6 = 266354560;
                            } else {
                                i10 = i2 + 6;
                                long j10 = j9 ^ (bArr[i6] << 35);
                                if (j10 < 0) {
                                    j5 = -34093383808L;
                                } else {
                                    i6 = i2 + 7;
                                    j9 = j10 ^ (bArr[i10] << 42);
                                    if (j9 >= 0) {
                                        j6 = 4363953127296L;
                                    } else {
                                        i10 = i2 + 8;
                                        j10 = j9 ^ (bArr[i6] << 49);
                                        if (j10 < 0) {
                                            j5 = -558586000294016L;
                                        } else {
                                            i6 = i2 + 9;
                                            long j11 = (j10 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j11 < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i6] >= 0) {
                                                    i6 = i12;
                                                }
                                            }
                                            j4 = j11;
                                        }
                                    }
                                }
                                j7 = j5 ^ j10;
                            }
                            j4 = j6 ^ j9;
                        }
                        i6 = i10;
                        j4 = j7;
                    }
                }
                this.f5359g = i6;
                return j4;
            }
        }
        return F();
    }

    public final long F() {
        long j4 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.f5359g == this.f5357e) {
                H(1);
            }
            int i4 = this.f5359g;
            this.f5359g = i4 + 1;
            j4 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((this.f5356d[i4] & 128) == 0) {
                return j4;
            }
        }
        throw C0460z.c();
    }

    public final void G() {
        int i2 = this.f5357e + this.f5358f;
        this.f5357e = i2;
        int i4 = this.f5361i + i2;
        int i5 = this.f5362j;
        if (i4 <= i5) {
            this.f5358f = 0;
            return;
        }
        int i6 = i4 - i5;
        this.f5358f = i6;
        this.f5357e = i2 - i6;
    }

    public final void H(int i2) {
        if (J(i2)) {
            return;
        }
        if (i2 <= (Integer.MAX_VALUE - this.f5361i) - this.f5359g) {
            throw C0460z.e();
        }
        throw new C0460z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void I(int i2) {
        int i4 = this.f5357e;
        int i5 = this.f5359g;
        if (i2 <= i4 - i5 && i2 >= 0) {
            this.f5359g = i5 + i2;
            return;
        }
        InputStream inputStream = this.f5355c;
        if (i2 < 0) {
            throw C0460z.d();
        }
        int i6 = this.f5361i;
        int i7 = i6 + i5;
        int i8 = i7 + i2;
        int i9 = this.f5362j;
        if (i8 > i9) {
            I((i9 - i6) - i5);
            throw C0460z.e();
        }
        this.f5361i = i7;
        int i10 = i4 - i5;
        this.f5357e = 0;
        this.f5359g = 0;
        while (i10 < i2) {
            long j4 = i2 - i10;
            try {
                try {
                    long skip = inputStream.skip(j4);
                    if (skip < 0 || skip > j4) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i10 += (int) skip;
                    }
                } catch (C0460z e4) {
                    e4.f5411d = true;
                    throw e4;
                }
            } catch (Throwable th) {
                this.f5361i += i10;
                G();
                throw th;
            }
        }
        this.f5361i += i10;
        G();
        if (i10 >= i2) {
            return;
        }
        int i11 = this.f5357e;
        int i12 = i11 - this.f5359g;
        this.f5359g = i11;
        H(1);
        while (true) {
            int i13 = i2 - i12;
            int i14 = this.f5357e;
            if (i13 <= i14) {
                this.f5359g = i13;
                return;
            } else {
                i12 += i14;
                this.f5359g = i14;
                H(1);
            }
        }
    }

    public final boolean J(int i2) {
        int i4 = this.f5359g;
        int i5 = i4 + i2;
        int i6 = this.f5357e;
        if (i5 <= i6) {
            throw new IllegalStateException(AbstractC0017m.h(i2, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i7 = this.f5361i;
        if (i2 > (Integer.MAX_VALUE - i7) - i4 || i7 + i4 + i2 > this.f5362j) {
            return false;
        }
        byte[] bArr = this.f5356d;
        if (i4 > 0) {
            if (i6 > i4) {
                System.arraycopy(bArr, i4, bArr, 0, i6 - i4);
            }
            this.f5361i += i4;
            this.f5357e -= i4;
            this.f5359g = 0;
        }
        int i8 = this.f5357e;
        int min = Math.min(bArr.length - i8, (Integer.MAX_VALUE - this.f5361i) - i8);
        InputStream inputStream = this.f5355c;
        try {
            int read = inputStream.read(bArr, i8, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f5357e += read;
            G();
            if (this.f5357e >= i2) {
                return true;
            }
            return J(i2);
        } catch (C0460z e4) {
            e4.f5411d = true;
            throw e4;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final void a(int i2) {
        if (this.f5360h != i2) {
            throw new C0460z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int b() {
        return this.f5361i + this.f5359g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final boolean c() {
        return this.f5359g == this.f5357e && !J(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final void d(int i2) {
        this.f5362j = i2;
        G();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int e(int i2) {
        if (i2 < 0) {
            throw C0460z.d();
        }
        int i4 = this.f5361i + this.f5359g + i2;
        int i5 = this.f5362j;
        if (i4 > i5) {
            throw C0460z.e();
        }
        this.f5362j = i4;
        G();
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final boolean f() {
        return E() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final C0442g g() {
        int D3 = D();
        int i2 = this.f5357e;
        int i4 = this.f5359g;
        int i5 = i2 - i4;
        byte[] bArr = this.f5356d;
        if (D3 <= i5 && D3 > 0) {
            C0442g j4 = C0442g.j(bArr, i4, D3);
            this.f5359g += D3;
            return j4;
        }
        if (D3 == 0) {
            return C0442g.f5338i;
        }
        byte[] z4 = z(D3);
        if (z4 != null) {
            return C0442g.j(z4, 0, z4.length);
        }
        int i6 = this.f5359g;
        int i7 = this.f5357e;
        int i8 = i7 - i6;
        this.f5361i += i7;
        this.f5359g = 0;
        this.f5357e = 0;
        ArrayList A4 = A(D3 - i8);
        byte[] bArr2 = new byte[D3];
        System.arraycopy(bArr, i6, bArr2, 0, i8);
        Iterator it = A4.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i8, bArr3.length);
            i8 += bArr3.length;
        }
        C0442g c0442g = C0442g.f5338i;
        return new C0442g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final double h() {
        return Double.longBitsToDouble(C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int i() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int j() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final long k() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final float l() {
        return Float.intBitsToFloat(B());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int m() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final long n() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int o() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final long p() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int q() {
        int D3 = D();
        return (-(D3 & 1)) ^ (D3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final long r() {
        long E3 = E();
        return (-(E3 & 1)) ^ (E3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final String s() {
        int D3 = D();
        byte[] bArr = this.f5356d;
        if (D3 > 0) {
            int i2 = this.f5357e;
            int i4 = this.f5359g;
            if (D3 <= i2 - i4) {
                String str = new String(bArr, i4, D3, AbstractC0458x.f5409a);
                this.f5359g += D3;
                return str;
            }
        }
        if (D3 == 0) {
            return "";
        }
        if (D3 > this.f5357e) {
            return new String(y(D3), AbstractC0458x.f5409a);
        }
        H(D3);
        String str2 = new String(bArr, this.f5359g, D3, AbstractC0458x.f5409a);
        this.f5359g += D3;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final String t() {
        int D3 = D();
        int i2 = this.f5359g;
        int i4 = this.f5357e;
        int i5 = i4 - i2;
        byte[] bArr = this.f5356d;
        if (D3 <= i5 && D3 > 0) {
            this.f5359g = i2 + D3;
        } else {
            if (D3 == 0) {
                return "";
            }
            i2 = 0;
            if (D3 <= i4) {
                H(D3);
                this.f5359g = D3;
            } else {
                bArr = y(D3);
            }
        }
        return v0.f5408a.a(bArr, i2, D3);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int u() {
        if (c()) {
            this.f5360h = 0;
            return 0;
        }
        int D3 = D();
        this.f5360h = D3;
        if ((D3 >>> 3) != 0) {
            return D3;
        }
        throw new C0460z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int v() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final long w() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final boolean x(int i2) {
        int u4;
        int i4 = i2 & 7;
        int i5 = 0;
        if (i4 == 0) {
            int i6 = this.f5357e - this.f5359g;
            byte[] bArr = this.f5356d;
            if (i6 >= 10) {
                while (i5 < 10) {
                    int i7 = this.f5359g;
                    this.f5359g = i7 + 1;
                    if (bArr[i7] < 0) {
                        i5++;
                    }
                }
                throw C0460z.c();
            }
            while (i5 < 10) {
                if (this.f5359g == this.f5357e) {
                    H(1);
                }
                int i8 = this.f5359g;
                this.f5359g = i8 + 1;
                if (bArr[i8] < 0) {
                    i5++;
                }
            }
            throw C0460z.c();
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
                throw C0460z.b();
            }
            I(4);
            return true;
        }
        do {
            u4 = u();
            if (u4 == 0) {
                break;
            }
        } while (x(u4));
        a(((i2 >>> 3) << 3) | 4);
        return true;
    }

    public final byte[] y(int i2) {
        byte[] z4 = z(i2);
        if (z4 != null) {
            return z4;
        }
        int i4 = this.f5359g;
        int i5 = this.f5357e;
        int i6 = i5 - i4;
        this.f5361i += i5;
        this.f5359g = 0;
        this.f5357e = 0;
        ArrayList A4 = A(i2 - i6);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f5356d, i4, bArr, 0, i6);
        Iterator it = A4.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
            i6 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] z(int i2) {
        if (i2 == 0) {
            return AbstractC0458x.f5410b;
        }
        if (i2 < 0) {
            throw C0460z.d();
        }
        int i4 = this.f5361i;
        int i5 = this.f5359g;
        int i6 = i4 + i5 + i2;
        if (i6 - Integer.MAX_VALUE > 0) {
            throw new C0460z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i7 = this.f5362j;
        if (i6 > i7) {
            I((i7 - i4) - i5);
            throw C0460z.e();
        }
        int i8 = this.f5357e - i5;
        int i9 = i2 - i8;
        InputStream inputStream = this.f5355c;
        if (i9 >= 4096) {
            try {
                if (i9 > inputStream.available()) {
                    return null;
                }
            } catch (C0460z e4) {
                e4.f5411d = true;
                throw e4;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f5356d, this.f5359g, bArr, 0, i8);
        this.f5361i += this.f5357e;
        this.f5359g = 0;
        this.f5357e = 0;
        while (i8 < i2) {
            try {
                int read = inputStream.read(bArr, i8, i2 - i8);
                if (read == -1) {
                    throw C0460z.e();
                }
                this.f5361i += read;
                i8 += read;
            } catch (C0460z e5) {
                e5.f5411d = true;
                throw e5;
            }
        }
        return bArr;
    }
}
