package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443h extends AbstractC0445j {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f5346c;

    /* renamed from: d, reason: collision with root package name */
    public int f5347d;

    /* renamed from: e, reason: collision with root package name */
    public int f5348e;

    /* renamed from: f, reason: collision with root package name */
    public int f5349f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5350g;

    /* renamed from: h, reason: collision with root package name */
    public int f5351h;

    /* renamed from: i, reason: collision with root package name */
    public int f5352i = Integer.MAX_VALUE;

    public C0443h(byte[] bArr, int i2, int i4, boolean z4) {
        this.f5346c = bArr;
        this.f5347d = i4 + i2;
        this.f5349f = i2;
        this.f5350g = i2;
    }

    public final int A() {
        int i2;
        int i4 = this.f5349f;
        int i5 = this.f5347d;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f5346c;
            byte b4 = bArr[i4];
            if (b4 >= 0) {
                this.f5349f = i6;
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
                this.f5349f = i7;
                return i2;
            }
        }
        return (int) C();
    }

    public final long B() {
        long j4;
        long j5;
        long j6;
        long j7;
        int i2 = this.f5349f;
        int i4 = this.f5347d;
        if (i4 != i2) {
            int i5 = i2 + 1;
            byte[] bArr = this.f5346c;
            byte b4 = bArr[i2];
            if (b4 >= 0) {
                this.f5349f = i5;
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
                this.f5349f = i6;
                return j4;
            }
        }
        return C();
    }

    public final long C() {
        long j4 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            int i4 = this.f5349f;
            if (i4 == this.f5347d) {
                throw C0460z.e();
            }
            this.f5349f = i4 + 1;
            j4 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((this.f5346c[i4] & 128) == 0) {
                return j4;
            }
        }
        throw C0460z.c();
    }

    public final void D() {
        int i2 = this.f5347d + this.f5348e;
        this.f5347d = i2;
        int i4 = i2 - this.f5350g;
        int i5 = this.f5352i;
        if (i4 <= i5) {
            this.f5348e = 0;
            return;
        }
        int i6 = i4 - i5;
        this.f5348e = i6;
        this.f5347d = i2 - i6;
    }

    public final void E(int i2) {
        if (i2 >= 0) {
            int i4 = this.f5347d;
            int i5 = this.f5349f;
            if (i2 <= i4 - i5) {
                this.f5349f = i5 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw C0460z.e();
        }
        throw C0460z.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final void a(int i2) {
        if (this.f5351h != i2) {
            throw new C0460z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int b() {
        return this.f5349f - this.f5350g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final boolean c() {
        return this.f5349f == this.f5347d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final void d(int i2) {
        this.f5352i = i2;
        D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int e(int i2) {
        if (i2 < 0) {
            throw C0460z.d();
        }
        int b4 = b() + i2;
        if (b4 < 0) {
            throw new C0460z("Failed to parse the message.");
        }
        int i4 = this.f5352i;
        if (b4 > i4) {
            throw C0460z.e();
        }
        this.f5352i = b4;
        D();
        return i4;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final boolean f() {
        return B() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final C0442g g() {
        byte[] bArr;
        int A4 = A();
        byte[] bArr2 = this.f5346c;
        if (A4 > 0) {
            int i2 = this.f5347d;
            int i4 = this.f5349f;
            if (A4 <= i2 - i4) {
                C0442g j4 = C0442g.j(bArr2, i4, A4);
                this.f5349f += A4;
                return j4;
            }
        }
        if (A4 == 0) {
            return C0442g.f5338i;
        }
        if (A4 > 0) {
            int i5 = this.f5347d;
            int i6 = this.f5349f;
            if (A4 <= i5 - i6) {
                int i7 = A4 + i6;
                this.f5349f = i7;
                bArr = Arrays.copyOfRange(bArr2, i6, i7);
                C0442g c0442g = C0442g.f5338i;
                return new C0442g(bArr);
            }
        }
        if (A4 > 0) {
            throw C0460z.e();
        }
        if (A4 != 0) {
            throw C0460z.d();
        }
        bArr = AbstractC0458x.f5410b;
        C0442g c0442g2 = C0442g.f5338i;
        return new C0442g(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final double h() {
        return Double.longBitsToDouble(z());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int i() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int j() {
        return y();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final long k() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final float l() {
        return Float.intBitsToFloat(y());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int m() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final long n() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int o() {
        return y();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final long p() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int q() {
        int A4 = A();
        return (-(A4 & 1)) ^ (A4 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final long r() {
        long B = B();
        return (-(B & 1)) ^ (B >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final String s() {
        int A4 = A();
        if (A4 > 0) {
            int i2 = this.f5347d;
            int i4 = this.f5349f;
            if (A4 <= i2 - i4) {
                String str = new String(this.f5346c, i4, A4, AbstractC0458x.f5409a);
                this.f5349f += A4;
                return str;
            }
        }
        if (A4 == 0) {
            return "";
        }
        if (A4 < 0) {
            throw C0460z.d();
        }
        throw C0460z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final String t() {
        int A4 = A();
        if (A4 > 0) {
            int i2 = this.f5347d;
            int i4 = this.f5349f;
            if (A4 <= i2 - i4) {
                String a4 = v0.f5408a.a(this.f5346c, i4, A4);
                this.f5349f += A4;
                return a4;
            }
        }
        if (A4 == 0) {
            return "";
        }
        if (A4 <= 0) {
            throw C0460z.d();
        }
        throw C0460z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int u() {
        if (c()) {
            this.f5351h = 0;
            return 0;
        }
        int A4 = A();
        this.f5351h = A4;
        if ((A4 >>> 3) != 0) {
            return A4;
        }
        throw new C0460z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final int v() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final long w() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0445j
    public final boolean x(int i2) {
        int u4;
        int i4 = i2 & 7;
        int i5 = 0;
        if (i4 == 0) {
            int i6 = this.f5347d - this.f5349f;
            byte[] bArr = this.f5346c;
            if (i6 >= 10) {
                while (i5 < 10) {
                    int i7 = this.f5349f;
                    this.f5349f = i7 + 1;
                    if (bArr[i7] < 0) {
                        i5++;
                    }
                }
                throw C0460z.c();
            }
            while (i5 < 10) {
                int i8 = this.f5349f;
                if (i8 == this.f5347d) {
                    throw C0460z.e();
                }
                this.f5349f = i8 + 1;
                if (bArr[i8] < 0) {
                    i5++;
                }
            }
            throw C0460z.c();
            return true;
        }
        if (i4 == 1) {
            E(8);
            return true;
        }
        if (i4 == 2) {
            E(A());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw C0460z.b();
            }
            E(4);
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

    public final int y() {
        int i2 = this.f5349f;
        if (this.f5347d - i2 < 4) {
            throw C0460z.e();
        }
        this.f5349f = i2 + 4;
        byte[] bArr = this.f5346c;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final long z() {
        int i2 = this.f5349f;
        if (this.f5347d - i2 < 8) {
            throw C0460z.e();
        }
        this.f5349f = i2 + 8;
        byte[] bArr = this.f5346c;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }
}
