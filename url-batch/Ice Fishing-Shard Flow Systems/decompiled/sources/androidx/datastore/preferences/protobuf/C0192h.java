package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192h extends B6.c {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3502c;

    /* renamed from: d, reason: collision with root package name */
    public int f3503d;

    /* renamed from: e, reason: collision with root package name */
    public int f3504e;

    /* renamed from: f, reason: collision with root package name */
    public int f3505f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3506g;

    /* renamed from: h, reason: collision with root package name */
    public int f3507h;

    /* renamed from: i, reason: collision with root package name */
    public int f3508i = Integer.MAX_VALUE;

    public C0192h(byte[] bArr, int i2, int i5, boolean z7) {
        this.f3502c = bArr;
        this.f3503d = i5 + i2;
        this.f3505f = i2;
        this.f3506g = i2;
    }

    public final long A() {
        int i2 = this.f3505f;
        if (this.f3503d - i2 < 8) {
            throw C0209z.e();
        }
        this.f3505f = i2 + 8;
        byte[] bArr = this.f3502c;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public final int B() {
        int i2;
        int i5 = this.f3505f;
        int i7 = this.f3503d;
        if (i7 != i5) {
            int i8 = i5 + 1;
            byte[] bArr = this.f3502c;
            byte b7 = bArr[i5];
            if (b7 >= 0) {
                this.f3505f = i8;
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
                this.f3505f = i9;
                return i2;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j;
        long j7;
        long j8;
        long j9;
        int i2 = this.f3505f;
        int i5 = this.f3503d;
        if (i5 != i2) {
            int i7 = i2 + 1;
            byte[] bArr = this.f3502c;
            byte b7 = bArr[i2];
            if (b7 >= 0) {
                this.f3505f = i7;
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
                this.f3505f = i8;
                return j;
            }
        }
        return D();
    }

    public final long D() {
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            int i5 = this.f3505f;
            if (i5 == this.f3503d) {
                throw C0209z.e();
            }
            this.f3505f = i5 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i2;
            if ((this.f3502c[i5] & 128) == 0) {
                return j;
            }
        }
        throw C0209z.c();
    }

    public final void E() {
        int i2 = this.f3503d + this.f3504e;
        this.f3503d = i2;
        int i5 = i2 - this.f3506g;
        int i7 = this.f3508i;
        if (i5 <= i7) {
            this.f3504e = 0;
            return;
        }
        int i8 = i5 - i7;
        this.f3504e = i8;
        this.f3503d = i2 - i8;
    }

    public final void F(int i2) {
        if (i2 >= 0) {
            int i5 = this.f3503d;
            int i7 = this.f3505f;
            if (i2 <= i5 - i7) {
                this.f3505f = i7 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw C0209z.e();
        }
        throw C0209z.d();
    }

    @Override // B6.c
    public final void a(int i2) {
        if (this.f3507h != i2) {
            throw new C0209z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // B6.c
    public final int b() {
        return this.f3505f - this.f3506g;
    }

    @Override // B6.c
    public final boolean c() {
        return this.f3505f == this.f3503d;
    }

    @Override // B6.c
    public final void d(int i2) {
        this.f3508i = i2;
        E();
    }

    @Override // B6.c
    public final int e(int i2) {
        if (i2 < 0) {
            throw C0209z.d();
        }
        int b7 = b() + i2;
        if (b7 < 0) {
            throw new C0209z("Failed to parse the message.");
        }
        int i5 = this.f3508i;
        if (b7 > i5) {
            throw C0209z.e();
        }
        this.f3508i = b7;
        E();
        return i5;
    }

    @Override // B6.c
    public final boolean f() {
        return C() != 0;
    }

    @Override // B6.c
    public final C0191g g() {
        byte[] bArr;
        int B7 = B();
        byte[] bArr2 = this.f3502c;
        if (B7 > 0) {
            int i2 = this.f3503d;
            int i5 = this.f3505f;
            if (B7 <= i2 - i5) {
                C0191g c7 = C0191g.c(bArr2, i5, B7);
                this.f3505f += B7;
                return c7;
            }
        }
        if (B7 == 0) {
            return C0191g.f3498i;
        }
        if (B7 > 0) {
            int i7 = this.f3503d;
            int i8 = this.f3505f;
            if (B7 <= i7 - i8) {
                int i9 = B7 + i8;
                this.f3505f = i9;
                bArr = Arrays.copyOfRange(bArr2, i8, i9);
                C0191g c0191g = C0191g.f3498i;
                return new C0191g(bArr);
            }
        }
        if (B7 > 0) {
            throw C0209z.e();
        }
        if (B7 != 0) {
            throw C0209z.d();
        }
        bArr = AbstractC0207x.f3572b;
        C0191g c0191g2 = C0191g.f3498i;
        return new C0191g(bArr);
    }

    @Override // B6.c
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // B6.c
    public final int i() {
        return B();
    }

    @Override // B6.c
    public final int j() {
        return z();
    }

    @Override // B6.c
    public final long k() {
        return A();
    }

    @Override // B6.c
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // B6.c
    public final int m() {
        return B();
    }

    @Override // B6.c
    public final long n() {
        return C();
    }

    @Override // B6.c
    public final int o() {
        return z();
    }

    @Override // B6.c
    public final long p() {
        return A();
    }

    @Override // B6.c
    public final int q() {
        int B7 = B();
        return (-(B7 & 1)) ^ (B7 >>> 1);
    }

    @Override // B6.c
    public final long r() {
        long C7 = C();
        return (-(C7 & 1)) ^ (C7 >>> 1);
    }

    @Override // B6.c
    public final String s() {
        int B7 = B();
        if (B7 > 0) {
            int i2 = this.f3503d;
            int i5 = this.f3505f;
            if (B7 <= i2 - i5) {
                String str = new String(this.f3502c, i5, B7, AbstractC0207x.f3571a);
                this.f3505f += B7;
                return str;
            }
        }
        if (B7 == 0) {
            return "";
        }
        if (B7 < 0) {
            throw C0209z.d();
        }
        throw C0209z.e();
    }

    @Override // B6.c
    public final String t() {
        int B7 = B();
        if (B7 > 0) {
            int i2 = this.f3503d;
            int i5 = this.f3505f;
            if (B7 <= i2 - i5) {
                String t6 = l0.f3536a.t(this.f3502c, i5, B7);
                this.f3505f += B7;
                return t6;
            }
        }
        if (B7 == 0) {
            return "";
        }
        if (B7 <= 0) {
            throw C0209z.d();
        }
        throw C0209z.e();
    }

    @Override // B6.c
    public final int u() {
        if (c()) {
            this.f3507h = 0;
            return 0;
        }
        int B7 = B();
        this.f3507h = B7;
        if ((B7 >>> 3) != 0) {
            return B7;
        }
        throw new C0209z("Protocol message contained an invalid tag (zero).");
    }

    @Override // B6.c
    public final int v() {
        return B();
    }

    @Override // B6.c
    public final long w() {
        return C();
    }

    @Override // B6.c
    public final boolean x(int i2) {
        int i5 = i2 & 7;
        int i7 = 0;
        if (i5 != 0) {
            if (i5 == 1) {
                F(8);
                return true;
            }
            if (i5 == 2) {
                F(B());
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
            F(4);
            return true;
        }
        int i8 = this.f3503d - this.f3505f;
        byte[] bArr = this.f3502c;
        if (i8 >= 10) {
            while (i7 < 10) {
                int i9 = this.f3505f;
                this.f3505f = i9 + 1;
                if (bArr[i9] < 0) {
                    i7++;
                }
            }
            throw C0209z.c();
        }
        while (i7 < 10) {
            int i10 = this.f3505f;
            if (i10 == this.f3503d) {
                throw C0209z.e();
            }
            this.f3505f = i10 + 1;
            if (bArr[i10] < 0) {
                i7++;
            }
        }
        throw C0209z.c();
        return true;
    }

    public final int z() {
        int i2 = this.f3505f;
        if (this.f3503d - i2 < 4) {
            throw C0209z.e();
        }
        this.f3505f = i2 + 4;
        byte[] bArr = this.f3502c;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }
}
