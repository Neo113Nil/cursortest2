package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f539i;

    /* renamed from: r, reason: collision with root package name */
    public int f540r;

    /* renamed from: s, reason: collision with root package name */
    public int f541s;

    /* renamed from: t, reason: collision with root package name */
    public int f542t;

    /* renamed from: u, reason: collision with root package name */
    public final int f543u;

    /* renamed from: v, reason: collision with root package name */
    public int f544v;

    /* renamed from: w, reason: collision with root package name */
    public int f545w = Integer.MAX_VALUE;

    public g(byte[] bArr, int i3, int i10, boolean z10) {
        this.f539i = bArr;
        this.f540r = i10 + i3;
        this.f542t = i3;
        this.f543u = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int A() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long B() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final boolean C(int i3) {
        int i10 = i3 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                L(8);
                return true;
            }
            if (i10 == 2) {
                L(H());
                return true;
            }
            if (i10 == 3) {
                D();
                a(((i3 >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw z.b();
            }
            L(4);
            return true;
        }
        int i12 = this.f540r - this.f542t;
        byte[] bArr = this.f539i;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f542t;
                this.f542t = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw z.c();
        }
        while (i11 < 10) {
            int i14 = this.f542t;
            if (i14 == this.f540r) {
                throw z.e();
            }
            this.f542t = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw z.c();
        return true;
    }

    public final int F() {
        int i3 = this.f542t;
        if (this.f540r - i3 < 4) {
            throw z.e();
        }
        this.f542t = i3 + 4;
        byte[] bArr = this.f539i;
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public final long G() {
        int i3 = this.f542t;
        if (this.f540r - i3 < 8) {
            throw z.e();
        }
        this.f542t = i3 + 8;
        byte[] bArr = this.f539i;
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public final int H() {
        int i3;
        int i10 = this.f542t;
        int i11 = this.f540r;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f539i;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f542t = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    i3 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i3 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i3 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b11 = bArr[i17];
                            int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i3 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i3 = i19;
                            }
                            i3 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f542t = i13;
                return i3;
            }
        }
        return (int) J();
    }

    public final long I() {
        long j;
        long j3;
        long j10;
        long j11;
        int i3 = this.f542t;
        int i10 = this.f540r;
        if (i10 != i3) {
            int i11 = i3 + 1;
            byte[] bArr = this.f539i;
            byte b10 = bArr[i3];
            if (b10 >= 0) {
                this.f542t = i11;
                return b10;
            }
            if (i10 - i11 >= 9) {
                int i12 = i3 + 2;
                int i13 = (bArr[i11] << 7) ^ b10;
                if (i13 < 0) {
                    j = i13 ^ (-128);
                } else {
                    int i14 = i3 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i3 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j11 = (-2080896) ^ i17;
                        } else {
                            long j12 = i17;
                            i12 = i3 + 5;
                            long j13 = j12 ^ (bArr[i16] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                i16 = i3 + 6;
                                long j14 = j13 ^ (bArr[i12] << 35);
                                if (j14 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i12 = i3 + 7;
                                    j13 = j14 ^ (bArr[i16] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i16 = i3 + 8;
                                        j14 = j13 ^ (bArr[i12] << 49);
                                        if (j14 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i12 = i3 + 9;
                                            long j15 = (j14 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i18 = i3 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j = j15;
                                        }
                                    }
                                }
                                j11 = j3 ^ j14;
                            }
                            j = j10 ^ j13;
                        }
                        i12 = i16;
                        j = j11;
                    }
                }
                this.f542t = i12;
                return j;
            }
        }
        return J();
    }

    public final long J() {
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            int i10 = this.f542t;
            if (i10 == this.f540r) {
                throw z.e();
            }
            this.f542t = i10 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i3;
            if ((this.f539i[i10] & 128) == 0) {
                return j;
            }
        }
        throw z.c();
    }

    public final void K() {
        int i3 = this.f540r + this.f541s;
        this.f540r = i3;
        int i10 = i3 - this.f543u;
        int i11 = this.f545w;
        if (i10 <= i11) {
            this.f541s = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f541s = i12;
        this.f540r = i3 - i12;
    }

    public final void L(int i3) {
        if (i3 >= 0) {
            int i10 = this.f540r;
            int i11 = this.f542t;
            if (i3 <= i10 - i11) {
                this.f542t = i11 + i3;
                return;
            }
        }
        if (i3 >= 0) {
            throw z.e();
        }
        throw z.d();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void a(int i3) {
        if (this.f544v != i3) {
            throw new z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int c() {
        return this.f542t - this.f543u;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final boolean d() {
        return this.f542t == this.f540r;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void i(int i3) {
        this.f545w = i3;
        K();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int j(int i3) {
        if (i3 < 0) {
            throw z.d();
        }
        int c10 = c() + i3;
        if (c10 < 0) {
            throw new z("Failed to parse the message.");
        }
        int i10 = this.f545w;
        if (c10 > i10) {
            throw z.e();
        }
        this.f545w = c10;
        K();
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final boolean k() {
        return I() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final f l() {
        byte[] bArr;
        int H = H();
        byte[] bArr2 = this.f539i;
        if (H > 0) {
            int i3 = this.f540r;
            int i10 = this.f542t;
            if (H <= i3 - i10) {
                f e2 = f.e(bArr2, i10, H);
                this.f542t += H;
                return e2;
            }
        }
        if (H == 0) {
            return f.f533i;
        }
        if (H > 0) {
            int i11 = this.f540r;
            int i12 = this.f542t;
            if (H <= i11 - i12) {
                int i13 = H + i12;
                this.f542t = i13;
                bArr = Arrays.copyOfRange(bArr2, i12, i13);
                f fVar = f.f533i;
                return new f(bArr);
            }
        }
        if (H > 0) {
            throw z.e();
        }
        if (H != 0) {
            throw z.d();
        }
        bArr = x.f648b;
        f fVar2 = f.f533i;
        return new f(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final double m() {
        return Double.longBitsToDouble(G());
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int n() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int o() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long p() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final float q() {
        return Float.intBitsToFloat(F());
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int r() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long s() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int t() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long u() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int v() {
        int H = H();
        return (-(H & 1)) ^ (H >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long w() {
        long I = I();
        return (-(I & 1)) ^ (I >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final String x() {
        int H = H();
        if (H > 0) {
            int i3 = this.f540r;
            int i10 = this.f542t;
            if (H <= i3 - i10) {
                String str = new String(this.f539i, i10, H, x.f647a);
                this.f542t += H;
                return str;
            }
        }
        if (H == 0) {
            return "";
        }
        if (H < 0) {
            throw z.d();
        }
        throw z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final String y() {
        int H = H();
        if (H > 0) {
            int i3 = this.f540r;
            int i10 = this.f542t;
            if (H <= i3 - i10) {
                String u2 = m1.f585a.u(this.f539i, i10, H);
                this.f542t += H;
                return u2;
            }
        }
        if (H == 0) {
            return "";
        }
        if (H <= 0) {
            throw z.d();
        }
        throw z.e();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int z() {
        if (d()) {
            this.f544v = 0;
            return 0;
        }
        int H = H();
        this.f544v = H;
        if ((H >>> 3) != 0) {
            return H;
        }
        throw new z("Protocol message contained an invalid tag (zero).");
    }
}
