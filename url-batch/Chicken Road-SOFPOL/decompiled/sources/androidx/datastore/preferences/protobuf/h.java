package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends j {

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f688f;

    /* renamed from: g, reason: collision with root package name */
    public int f689g;

    /* renamed from: h, reason: collision with root package name */
    public int f690h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f691j;

    /* renamed from: k, reason: collision with root package name */
    public int f692k;

    /* renamed from: l, reason: collision with root package name */
    public int f693l = Integer.MAX_VALUE;

    public h(byte[] bArr, int i, int i8, boolean z3) {
        this.f688f = bArr;
        this.f689g = i8 + i;
        this.i = i;
        this.f691j = i;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int A() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long B() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean C(int i) {
        int i8 = i & 7;
        int i9 = 0;
        if (i8 != 0) {
            if (i8 == 1) {
                K(8);
                return true;
            }
            if (i8 == 2) {
                K(G());
                return true;
            }
            if (i8 == 3) {
                D();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw a0.b();
            }
            K(4);
            return true;
        }
        int i10 = this.f689g - this.i;
        byte[] bArr = this.f688f;
        if (i10 >= 10) {
            while (i9 < 10) {
                int i11 = this.i;
                this.i = i11 + 1;
                if (bArr[i11] < 0) {
                    i9++;
                }
            }
            throw a0.c();
        }
        while (i9 < 10) {
            int i12 = this.i;
            if (i12 == this.f689g) {
                throw a0.e();
            }
            this.i = i12 + 1;
            if (bArr[i12] < 0) {
                i9++;
            }
        }
        throw a0.c();
        return true;
    }

    public final int E() {
        int i = this.i;
        if (this.f689g - i < 4) {
            throw a0.e();
        }
        this.i = i + 4;
        byte[] bArr = this.f688f;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long F() {
        int i = this.i;
        if (this.f689g - i < 8) {
            throw a0.e();
        }
        this.i = i + 8;
        byte[] bArr = this.f688f;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final int G() {
        int i;
        int i8 = this.i;
        int i9 = this.f689g;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f688f;
            byte b8 = bArr[i8];
            if (b8 >= 0) {
                this.i = i10;
                return b8;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b8;
                if (i12 < 0) {
                    i = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i = (-2080896) ^ i16;
                        } else {
                            i13 = i8 + 5;
                            byte b9 = bArr[i15];
                            int i17 = (i16 ^ (b9 << 28)) ^ 266354560;
                            if (b9 < 0) {
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
                                                    i = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i17;
                            }
                            i = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.i = i11;
                return i;
            }
        }
        return (int) I();
    }

    public final long H() {
        long j7;
        long j8;
        long j9;
        long j10;
        int i = this.i;
        int i8 = this.f689g;
        if (i8 != i) {
            int i9 = i + 1;
            byte[] bArr = this.f688f;
            byte b8 = bArr[i];
            if (b8 >= 0) {
                this.i = i9;
                return b8;
            }
            if (i8 - i9 >= 9) {
                int i10 = i + 2;
                int i11 = (bArr[i9] << 7) ^ b8;
                if (i11 < 0) {
                    j7 = i11 ^ (-128);
                } else {
                    int i12 = i + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j7 = i13 ^ 16256;
                        i10 = i12;
                    } else {
                        int i14 = i + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            j10 = (-2080896) ^ i15;
                        } else {
                            long j11 = i15;
                            i10 = i + 5;
                            long j12 = j11 ^ (bArr[i14] << 28);
                            if (j12 >= 0) {
                                j9 = 266354560;
                            } else {
                                i14 = i + 6;
                                long j13 = j12 ^ (bArr[i10] << 35);
                                if (j13 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    i10 = i + 7;
                                    j12 = j13 ^ (bArr[i14] << 42);
                                    if (j12 >= 0) {
                                        j9 = 4363953127296L;
                                    } else {
                                        i14 = i + 8;
                                        j13 = j12 ^ (bArr[i10] << 49);
                                        if (j13 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j14 = (j13 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                int i16 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i16;
                                                }
                                            }
                                            j7 = j14;
                                        }
                                    }
                                }
                                j10 = j8 ^ j13;
                            }
                            j7 = j9 ^ j12;
                        }
                        i10 = i14;
                        j7 = j10;
                    }
                }
                this.i = i10;
                return j7;
            }
        }
        return I();
    }

    public final long I() {
        long j7 = 0;
        for (int i = 0; i < 64; i += 7) {
            int i8 = this.i;
            if (i8 == this.f689g) {
                throw a0.e();
            }
            this.i = i8 + 1;
            j7 |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f688f[i8] & 128) == 0) {
                return j7;
            }
        }
        throw a0.c();
    }

    public final void J() {
        int i = this.f689g + this.f690h;
        this.f689g = i;
        int i8 = i - this.f691j;
        int i9 = this.f693l;
        if (i8 <= i9) {
            this.f690h = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f690h = i10;
        this.f689g = i - i10;
    }

    public final void K(int i) {
        if (i >= 0) {
            int i8 = this.f689g;
            int i9 = this.i;
            if (i <= i8 - i9) {
                this.i = i9 + i;
                return;
            }
        }
        if (i >= 0) {
            throw a0.e();
        }
        throw a0.d();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void a(int i) {
        if (this.f692k != i) {
            throw new a0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int b() {
        return this.i - this.f691j;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean c() {
        return this.i == this.f689g;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void h(int i) {
        this.f693l = i;
        J();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int i(int i) {
        if (i < 0) {
            throw a0.d();
        }
        int b8 = b() + i;
        if (b8 < 0) {
            throw new a0("Failed to parse the message.");
        }
        int i8 = this.f693l;
        if (b8 > i8) {
            throw a0.e();
        }
        this.f693l = b8;
        J();
        return i8;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean j() {
        return H() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final g l() {
        byte[] bArr;
        int G = G();
        byte[] bArr2 = this.f688f;
        if (G > 0) {
            int i = this.f689g;
            int i8 = this.i;
            if (G <= i - i8) {
                g c8 = g.c(bArr2, i8, G);
                this.i += G;
                return c8;
            }
        }
        if (G == 0) {
            return g.f682f;
        }
        if (G > 0) {
            int i9 = this.f689g;
            int i10 = this.i;
            if (G <= i9 - i10) {
                int i11 = G + i10;
                this.i = i11;
                bArr = Arrays.copyOfRange(bArr2, i10, i11);
                g gVar = g.f682f;
                return new g(bArr);
            }
        }
        if (G > 0) {
            throw a0.e();
        }
        if (G != 0) {
            throw a0.d();
        }
        bArr = y.f795b;
        g gVar2 = g.f682f;
        return new g(bArr);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final double m() {
        return Double.longBitsToDouble(F());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int n() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int o() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long p() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final float q() {
        return Float.intBitsToFloat(E());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int r() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long s() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int t() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long u() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int v() {
        int G = G();
        return (-(G & 1)) ^ (G >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long w() {
        long H = H();
        return (-(H & 1)) ^ (H >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String x() {
        int G = G();
        if (G > 0) {
            int i = this.f689g;
            int i8 = this.i;
            if (G <= i - i8) {
                String str = new String(this.f688f, i8, G, y.f794a);
                this.i += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            throw a0.d();
        }
        throw a0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String y() {
        int G = G();
        if (G > 0) {
            int i = this.f689g;
            int i8 = this.i;
            if (G <= i - i8) {
                String m7 = n1.f734a.m(this.f688f, i8, G);
                this.i += G;
                return m7;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G <= 0) {
            throw a0.d();
        }
        throw a0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int z() {
        if (c()) {
            this.f692k = 0;
            return 0;
        }
        int G = G();
        this.f692k = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        throw new a0("Protocol message contained an invalid tag (zero).");
    }
}
