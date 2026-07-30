package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rh extends th {
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public int h;
    public int i = Integer.MAX_VALUE;

    public rh(byte[] bArr, int i, int i2, boolean z) {
        this.c = bArr;
        this.d = i2 + i;
        this.f = i;
        this.g = i;
    }

    public final long A() {
        int i = this.f;
        if (this.d - i < 8) {
            throw sa0.e();
        }
        this.f = i + 8;
        byte[] bArr = this.c;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int B() {
        int i;
        int i2 = this.f;
        int i3 = this.d;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.c;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f = i4;
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
                this.f = i5;
                return i;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f;
        int i2 = this.d;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.c;
            byte b = bArr[i];
            if (b >= 0) {
                this.f = i3;
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
                this.f = i4;
                return j;
            }
        }
        return D();
    }

    public final long D() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f;
            if (i2 == this.d) {
                throw sa0.e();
            }
            this.f = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.c[i2] & 128) == 0) {
                return j;
            }
        }
        throw sa0.c();
    }

    public final void E() {
        int i = this.d + this.e;
        this.d = i;
        int i2 = i - this.g;
        int i3 = this.i;
        if (i2 <= i3) {
            this.e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.e = i4;
        this.d = i - i4;
    }

    public final void F(int i) {
        if (i >= 0) {
            int i2 = this.d;
            int i3 = this.f;
            if (i <= i2 - i3) {
                this.f = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw sa0.e();
        }
        throw sa0.d();
    }

    @Override // defpackage.th
    public final void a(int i) {
        if (this.h != i) {
            throw new sa0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.th
    public final int b() {
        return this.f - this.g;
    }

    @Override // defpackage.th
    public final boolean c() {
        return this.f == this.d;
    }

    @Override // defpackage.th
    public final void d(int i) {
        this.i = i;
        E();
    }

    @Override // defpackage.th
    public final int e(int i) {
        if (i < 0) {
            throw sa0.d();
        }
        int b = b() + i;
        if (b < 0) {
            throw new sa0("Failed to parse the message.");
        }
        int i2 = this.i;
        if (b > i2) {
            throw sa0.e();
        }
        this.i = b;
        E();
        return i2;
    }

    @Override // defpackage.th
    public final boolean f() {
        return C() != 0;
    }

    @Override // defpackage.th
    public final ff g() {
        byte[] bArr;
        int B = B();
        byte[] bArr2 = this.c;
        if (B > 0) {
            int i = this.d;
            int i2 = this.f;
            if (B <= i - i2) {
                ff d = ff.d(bArr2, i2, B);
                this.f += B;
                return d;
            }
        }
        if (B == 0) {
            return ff.g;
        }
        if (B > 0) {
            int i3 = this.d;
            int i4 = this.f;
            if (B <= i3 - i4) {
                int i5 = B + i4;
                this.f = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                ff ffVar = ff.g;
                return new ff(bArr);
            }
        }
        if (B > 0) {
            throw sa0.e();
        }
        if (B != 0) {
            throw sa0.d();
        }
        bArr = ia0.b;
        ff ffVar2 = ff.g;
        return new ff(bArr);
    }

    @Override // defpackage.th
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // defpackage.th
    public final int i() {
        return B();
    }

    @Override // defpackage.th
    public final int j() {
        return z();
    }

    @Override // defpackage.th
    public final long k() {
        return A();
    }

    @Override // defpackage.th
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // defpackage.th
    public final int m() {
        return B();
    }

    @Override // defpackage.th
    public final long n() {
        return C();
    }

    @Override // defpackage.th
    public final int o() {
        return z();
    }

    @Override // defpackage.th
    public final long p() {
        return A();
    }

    @Override // defpackage.th
    public final int q() {
        int B = B();
        return (-(B & 1)) ^ (B >>> 1);
    }

    @Override // defpackage.th
    public final long r() {
        long C = C();
        return (-(C & 1)) ^ (C >>> 1);
    }

    @Override // defpackage.th
    public final String s() {
        int B = B();
        if (B > 0) {
            int i = this.d;
            int i2 = this.f;
            if (B <= i - i2) {
                String str = new String(this.c, i2, B, ia0.a);
                this.f += B;
                return str;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B < 0) {
            throw sa0.d();
        }
        throw sa0.e();
    }

    @Override // defpackage.th
    public final String t() {
        int B = B();
        if (B > 0) {
            int i = this.d;
            int i2 = this.f;
            if (B <= i - i2) {
                String m = bm1.a.m(this.c, i2, B);
                this.f += B;
                return m;
            }
        }
        if (B == 0) {
            return "";
        }
        if (B <= 0) {
            throw sa0.d();
        }
        throw sa0.e();
    }

    @Override // defpackage.th
    public final int u() {
        if (c()) {
            this.h = 0;
            return 0;
        }
        int B = B();
        this.h = B;
        if ((B >>> 3) != 0) {
            return B;
        }
        throw new sa0("Protocol message contained an invalid tag (zero).");
    }

    @Override // defpackage.th
    public final int v() {
        return B();
    }

    @Override // defpackage.th
    public final long w() {
        return C();
    }

    @Override // defpackage.th
    public final boolean x(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                F(8);
                return true;
            }
            if (i2 == 2) {
                F(B());
                return true;
            }
            if (i2 == 3) {
                y();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw sa0.b();
            }
            F(4);
            return true;
        }
        int i4 = this.d - this.f;
        byte[] bArr = this.c;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.f;
                this.f = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw sa0.c();
        }
        while (i3 < 10) {
            int i6 = this.f;
            if (i6 == this.d) {
                throw sa0.e();
            }
            this.f = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw sa0.c();
        return true;
    }

    public final int z() {
        int i = this.f;
        if (this.d - i < 4) {
            throw sa0.e();
        }
        this.f = i + 4;
        byte[] bArr = this.c;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
