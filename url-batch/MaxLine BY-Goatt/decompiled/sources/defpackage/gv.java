package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gv extends iv {
    public final byte[] o;
    public int p;
    public int q;
    public int r;
    public final int s;
    public int t;
    public int u = Integer.MAX_VALUE;

    public gv(byte[] bArr, int i, int i2, boolean z) {
        this.o = bArr;
        this.p = i2 + i;
        this.r = i;
        this.s = i;
    }

    @Override // defpackage.iv
    public final int A() {
        return G();
    }

    @Override // defpackage.iv
    public final long B() {
        return H();
    }

    @Override // defpackage.iv
    public final boolean C(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                K(8);
                return true;
            }
            if (i2 == 2) {
                K(G());
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
            K(4);
            return true;
        }
        int i4 = this.p - this.r;
        byte[] bArr = this.o;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.r;
                this.r = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw u41.c();
        }
        while (i3 < 10) {
            int i6 = this.r;
            if (i6 == this.p) {
                throw u41.e();
            }
            this.r = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        throw u41.c();
        return true;
    }

    public final int E() {
        int i = this.r;
        if (this.p - i < 4) {
            throw u41.e();
        }
        this.r = i + 4;
        byte[] bArr = this.o;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long F() {
        int i = this.r;
        if (this.p - i < 8) {
            throw u41.e();
        }
        this.r = i + 8;
        byte[] bArr = this.o;
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int G() {
        int i;
        int i2 = this.r;
        int i3 = this.p;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.o;
            byte b = bArr[i2];
            if (b >= 0) {
                this.r = i4;
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
                this.r = i5;
                return i;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.r;
        int i2 = this.p;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.o;
            byte b = bArr[i];
            if (b >= 0) {
                this.r = i3;
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
                this.r = i4;
                return j;
            }
        }
        return I();
    }

    public final long I() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.r;
            if (i2 == this.p) {
                throw u41.e();
            }
            this.r = i2 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.o[i2] & 128) == 0) {
                return j;
            }
        }
        throw u41.c();
    }

    public final void J() {
        int i = this.p + this.q;
        this.p = i;
        int i2 = i - this.s;
        int i3 = this.u;
        if (i2 <= i3) {
            this.q = 0;
            return;
        }
        int i4 = i2 - i3;
        this.q = i4;
        this.p = i - i4;
    }

    public final void K(int i) {
        if (i >= 0) {
            int i2 = this.p;
            int i3 = this.r;
            if (i <= i2 - i3) {
                this.r = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw u41.e();
        }
        throw u41.d();
    }

    @Override // defpackage.iv
    public final void b(int i) {
        if (this.t != i) {
            throw new u41("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.iv
    public final int c() {
        return this.r - this.s;
    }

    @Override // defpackage.iv
    public final boolean d() {
        return this.r == this.p;
    }

    @Override // defpackage.iv
    public final void i(int i) {
        this.u = i;
        J();
    }

    @Override // defpackage.iv
    public final int j(int i) {
        if (i < 0) {
            throw u41.d();
        }
        int c = c() + i;
        if (c < 0) {
            throw new u41("Failed to parse the message.");
        }
        int i2 = this.u;
        if (c > i2) {
            throw u41.e();
        }
        this.u = c;
        J();
        return i2;
    }

    @Override // defpackage.iv
    public final boolean k() {
        return H() != 0;
    }

    @Override // defpackage.iv
    public final cr l() {
        byte[] bArr;
        int G = G();
        byte[] bArr2 = this.o;
        if (G > 0) {
            int i = this.p;
            int i2 = this.r;
            if (G <= i - i2) {
                cr c = er.c(bArr2, i2, G);
                this.r += G;
                return c;
            }
        }
        if (G == 0) {
            return er.n;
        }
        if (G > 0) {
            int i3 = this.p;
            int i4 = this.r;
            if (G <= i3 - i4) {
                int i5 = G + i4;
                this.r = i5;
                bArr = Arrays.copyOfRange(bArr2, i4, i5);
                cr crVar = er.n;
                return new cr(bArr);
            }
        }
        if (G > 0) {
            throw u41.e();
        }
        if (G != 0) {
            throw u41.d();
        }
        bArr = f41.b;
        cr crVar2 = er.n;
        return new cr(bArr);
    }

    @Override // defpackage.iv
    public final double m() {
        return Double.longBitsToDouble(F());
    }

    @Override // defpackage.iv
    public final int n() {
        return G();
    }

    @Override // defpackage.iv
    public final int o() {
        return E();
    }

    @Override // defpackage.iv
    public final long p() {
        return F();
    }

    @Override // defpackage.iv
    public final float q() {
        return Float.intBitsToFloat(E());
    }

    @Override // defpackage.iv
    public final int r() {
        return G();
    }

    @Override // defpackage.iv
    public final long s() {
        return H();
    }

    @Override // defpackage.iv
    public final int t() {
        return E();
    }

    @Override // defpackage.iv
    public final long u() {
        return F();
    }

    @Override // defpackage.iv
    public final int v() {
        int G = G();
        return (-(G & 1)) ^ (G >>> 1);
    }

    @Override // defpackage.iv
    public final long w() {
        long H = H();
        return (-(H & 1)) ^ (H >>> 1);
    }

    @Override // defpackage.iv
    public final String x() {
        int G = G();
        if (G > 0) {
            int i = this.p;
            int i2 = this.r;
            if (G <= i - i2) {
                String str = new String(this.o, i2, G, f41.a);
                this.r += G;
                return str;
            }
        }
        if (G == 0) {
            return BuildConfig.FLAVOR;
        }
        if (G < 0) {
            throw u41.d();
        }
        throw u41.e();
    }

    @Override // defpackage.iv
    public final String y() {
        int G = G();
        if (G > 0) {
            int i = this.p;
            int i2 = this.r;
            if (G <= i - i2) {
                String g = l33.a.g(this.o, i2, G);
                this.r += G;
                return g;
            }
        }
        if (G == 0) {
            return BuildConfig.FLAVOR;
        }
        if (G <= 0) {
            throw u41.d();
        }
        throw u41.e();
    }

    @Override // defpackage.iv
    public final int z() {
        if (d()) {
            this.t = 0;
            return 0;
        }
        int G = G();
        this.t = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        throw new u41("Protocol message contained an invalid tag (zero).");
    }
}
