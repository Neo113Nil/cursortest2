package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends j {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f823c;

    /* renamed from: d, reason: collision with root package name */
    public int f824d;

    /* renamed from: e, reason: collision with root package name */
    public int f825e;

    /* renamed from: f, reason: collision with root package name */
    public int f826f;

    /* renamed from: g, reason: collision with root package name */
    public final int f827g;

    /* renamed from: h, reason: collision with root package name */
    public int f828h;

    /* renamed from: i, reason: collision with root package name */
    public int f829i = Integer.MAX_VALUE;

    public h(byte[] bArr, int i7, int i8, boolean z8) {
        this.f823c = bArr;
        this.f824d = i8 + i7;
        this.f826f = i7;
        this.f827g = i7;
    }

    public final int A() {
        int i7;
        int i8 = this.f826f;
        int i9 = this.f824d;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f823c;
            byte b9 = bArr[i8];
            if (b9 >= 0) {
                this.f826f = i10;
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
                this.f826f = i11;
                return i7;
            }
        }
        return (int) C();
    }

    public final long B() {
        long j8;
        long j9;
        long j10;
        long j11;
        int i7 = this.f826f;
        int i8 = this.f824d;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f823c;
            byte b9 = bArr[i7];
            if (b9 >= 0) {
                this.f826f = i9;
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
                this.f826f = i10;
                return j8;
            }
        }
        return C();
    }

    public final long C() {
        long j8 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i8 = this.f826f;
            if (i8 == this.f824d) {
                throw z.e();
            }
            this.f826f = i8 + 1;
            j8 |= (r3 & Byte.MAX_VALUE) << i7;
            if ((this.f823c[i8] & 128) == 0) {
                return j8;
            }
        }
        throw z.c();
    }

    public final void D() {
        int i7 = this.f824d + this.f825e;
        this.f824d = i7;
        int i8 = i7 - this.f827g;
        int i9 = this.f829i;
        if (i8 <= i9) {
            this.f825e = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f825e = i10;
        this.f824d = i7 - i10;
    }

    public final void E(int i7) {
        if (i7 >= 0) {
            int i8 = this.f824d;
            int i9 = this.f826f;
            if (i7 <= i8 - i9) {
                this.f826f = i9 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw z.e();
        }
        throw z.d();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void a(int i7) {
        if (this.f828h != i7) {
            throw new z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int b() {
        return this.f826f - this.f827g;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean c() {
        return this.f826f == this.f824d;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void d(int i7) {
        this.f829i = i7;
        D();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int e(int i7) {
        if (i7 < 0) {
            throw z.d();
        }
        int b9 = b() + i7;
        if (b9 < 0) {
            throw new z("Failed to parse the message.");
        }
        int i8 = this.f829i;
        if (b9 > i8) {
            throw z.e();
        }
        this.f829i = b9;
        D();
        return i8;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean f() {
        return B() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final g g() {
        byte[] bArr;
        int A = A();
        byte[] bArr2 = this.f823c;
        if (A > 0) {
            int i7 = this.f824d;
            int i8 = this.f826f;
            if (A <= i7 - i8) {
                g m8 = g.m(bArr2, i8, A);
                this.f826f += A;
                return m8;
            }
        }
        if (A == 0) {
            return g.f816h;
        }
        if (A > 0) {
            int i9 = this.f824d;
            int i10 = this.f826f;
            if (A <= i9 - i10) {
                int i11 = A + i10;
                this.f826f = i11;
                bArr = Arrays.copyOfRange(bArr2, i10, i11);
                g gVar = g.f816h;
                return new g(bArr);
            }
        }
        if (A > 0) {
            throw z.e();
        }
        if (A != 0) {
            throw z.d();
        }
        bArr = x.f923b;
        g gVar2 = g.f816h;
        return new g(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final double h() {
        return Double.longBitsToDouble(z());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int i() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int j() {
        return y();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long k() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final float l() {
        return Float.intBitsToFloat(y());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int m() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long n() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int o() {
        return y();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long p() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int q() {
        int A = A();
        return (-(A & 1)) ^ (A >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long r() {
        long B = B();
        return (-(B & 1)) ^ (B >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String s() {
        int A = A();
        if (A > 0) {
            int i7 = this.f824d;
            int i8 = this.f826f;
            if (A <= i7 - i8) {
                String str = new String(this.f823c, i8, A, x.f922a);
                this.f826f += A;
                return str;
            }
        }
        if (A == 0) {
            return "";
        }
        if (A < 0) {
            throw z.d();
        }
        throw z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String t() {
        int A = A();
        if (A > 0) {
            int i7 = this.f824d;
            int i8 = this.f826f;
            if (A <= i7 - i8) {
                String a3 = u1.f915a.a(this.f823c, i8, A);
                this.f826f += A;
                return a3;
            }
        }
        if (A == 0) {
            return "";
        }
        if (A <= 0) {
            throw z.d();
        }
        throw z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int u() {
        if (c()) {
            this.f828h = 0;
            return 0;
        }
        int A = A();
        this.f828h = A;
        if ((A >>> 3) != 0) {
            return A;
        }
        throw new z("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int v() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long w() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean x(int i7) {
        int u8;
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            int i10 = this.f824d - this.f826f;
            byte[] bArr = this.f823c;
            if (i10 >= 10) {
                while (i9 < 10) {
                    int i11 = this.f826f;
                    this.f826f = i11 + 1;
                    if (bArr[i11] < 0) {
                        i9++;
                    }
                }
                throw z.c();
            }
            while (i9 < 10) {
                int i12 = this.f826f;
                if (i12 == this.f824d) {
                    throw z.e();
                }
                this.f826f = i12 + 1;
                if (bArr[i12] < 0) {
                    i9++;
                }
            }
            throw z.c();
            return true;
        }
        if (i8 == 1) {
            E(8);
            return true;
        }
        if (i8 == 2) {
            E(A());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw z.b();
            }
            E(4);
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

    public final int y() {
        int i7 = this.f826f;
        if (this.f824d - i7 < 4) {
            throw z.e();
        }
        this.f826f = i7 + 4;
        byte[] bArr = this.f823c;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long z() {
        int i7 = this.f826f;
        if (this.f824d - i7 < 8) {
            throw z.e();
        }
        this.f826f = i7 + 8;
        byte[] bArr = this.f823c;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }
}
