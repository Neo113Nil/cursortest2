package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class wo3 extends cp3 {

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f13902f;

    /* renamed from: g, reason: collision with root package name */
    private int f13903g;

    /* renamed from: h, reason: collision with root package name */
    private int f13904h;

    /* renamed from: i, reason: collision with root package name */
    private int f13905i;

    /* renamed from: j, reason: collision with root package name */
    private final int f13906j;

    /* renamed from: k, reason: collision with root package name */
    private int f13907k;

    /* renamed from: l, reason: collision with root package name */
    private int f13908l;

    /* synthetic */ wo3(byte[] bArr, int i7, int i8, boolean z6, vo3 vo3Var) {
        super(null);
        this.f13908l = Integer.MAX_VALUE;
        this.f13902f = bArr;
        this.f13903g = i8 + i7;
        this.f13905i = i7;
        this.f13906j = i7;
    }

    private final void C() {
        int i7 = this.f13903g + this.f13904h;
        this.f13903g = i7;
        int i8 = i7 - this.f13906j;
        int i9 = this.f13908l;
        if (i8 <= i9) {
            this.f13904h = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f13904h = i10;
        this.f13903g = i7 - i10;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final void A(int i7) {
        if (this.f13907k != i7) {
            throw mq3.b();
        }
    }

    public final void B(int i7) {
        if (i7 >= 0) {
            int i8 = this.f13903g;
            int i9 = this.f13905i;
            if (i7 <= i8 - i9) {
                this.f13905i = i9 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw mq3.j();
        }
        throw mq3.f();
    }

    public final byte D() {
        int i7 = this.f13905i;
        if (i7 == this.f13903g) {
            throw mq3.j();
        }
        byte[] bArr = this.f13902f;
        this.f13905i = i7 + 1;
        return bArr[i7];
    }

    public final int E() {
        int i7 = this.f13905i;
        if (this.f13903g - i7 < 4) {
            throw mq3.j();
        }
        byte[] bArr = this.f13902f;
        this.f13905i = i7 + 4;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r2[r3] >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F() {
        int i7;
        int i8 = this.f13905i;
        int i9 = this.f13903g;
        if (i9 != i8) {
            byte[] bArr = this.f13902f;
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f13905i = i10;
                return b7;
            }
            if (i9 - i10 >= 9) {
                int i11 = i10 + 1;
                int i12 = b7 ^ (bArr[i10] << 7);
                if (i12 < 0) {
                    i7 = i12 ^ (-128);
                } else {
                    int i13 = i11 + 1;
                    int i14 = i12 ^ (bArr[i11] << 14);
                    if (i14 >= 0) {
                        i7 = i14 ^ 16256;
                    } else {
                        i11 = i13 + 1;
                        int i15 = i14 ^ (bArr[i13] << 21);
                        if (i15 < 0) {
                            i7 = i15 ^ (-2080896);
                        } else {
                            i13 = i11 + 1;
                            byte b8 = bArr[i11];
                            i7 = (i15 ^ (b8 << 28)) ^ 266354560;
                            if (b8 < 0) {
                                i11 = i13 + 1;
                                if (bArr[i13] < 0) {
                                    i13 = i11 + 1;
                                    if (bArr[i11] < 0) {
                                        i11 = i13 + 1;
                                        if (bArr[i13] < 0) {
                                            i13 = i11 + 1;
                                            if (bArr[i11] < 0) {
                                                i11 = i13 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i11 = i13;
                }
                this.f13905i = i11;
                return i7;
            }
        }
        return (int) I();
    }

    public final long G() {
        int i7 = this.f13905i;
        if (this.f13903g - i7 < 8) {
            throw mq3.j();
        }
        byte[] bArr = this.f13902f;
        this.f13905i = i7 + 8;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final long H() {
        long j7;
        long j8;
        long j9;
        long j10;
        int i7;
        int i8 = this.f13905i;
        int i9 = this.f13903g;
        if (i9 != i8) {
            byte[] bArr = this.f13902f;
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f13905i = i10;
                return b7;
            }
            if (i9 - i10 >= 9) {
                int i11 = i10 + 1;
                int i12 = b7 ^ (bArr[i10] << 7);
                if (i12 >= 0) {
                    int i13 = i11 + 1;
                    int i14 = i12 ^ (bArr[i11] << 14);
                    if (i14 >= 0) {
                        j7 = i14 ^ 16256;
                    } else {
                        i11 = i13 + 1;
                        int i15 = i14 ^ (bArr[i13] << 21);
                        if (i15 < 0) {
                            i7 = i15 ^ (-2080896);
                        } else {
                            i13 = i11 + 1;
                            long j11 = (bArr[i11] << 28) ^ i15;
                            if (j11 < 0) {
                                int i16 = i13 + 1;
                                long j12 = j11 ^ (bArr[i13] << 35);
                                if (j12 < 0) {
                                    j9 = -34093383808L;
                                } else {
                                    i13 = i16 + 1;
                                    j11 = j12 ^ (bArr[i16] << 42);
                                    if (j11 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i16 = i13 + 1;
                                        j12 = j11 ^ (bArr[i13] << 49);
                                        if (j12 < 0) {
                                            j9 = -558586000294016L;
                                        } else {
                                            i13 = i16 + 1;
                                            j7 = (j12 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i16 = i13 + 1;
                                                if (bArr[i13] >= 0) {
                                                    j8 = j7;
                                                    i11 = i16;
                                                    this.f13905i = i11;
                                                    return j8;
                                                }
                                            }
                                        }
                                    }
                                }
                                j8 = j9 ^ j12;
                                i11 = i16;
                                this.f13905i = i11;
                                return j8;
                            }
                            j10 = 266354560;
                            j7 = j11 ^ j10;
                        }
                    }
                    i11 = i13;
                    j8 = j7;
                    this.f13905i = i11;
                    return j8;
                }
                i7 = i12 ^ (-128);
                j8 = i7;
                this.f13905i = i11;
                return j8;
            }
        }
        return I();
    }

    final long I() {
        long j7 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            j7 |= (r3 & Byte.MAX_VALUE) << i7;
            if ((D() & 128) == 0) {
                return j7;
            }
        }
        throw mq3.e();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final void a(int i7) {
        this.f13908l = i7;
        C();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final boolean b() {
        return this.f13905i == this.f13903g;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final boolean c() {
        return H() != 0;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final boolean d(int i7) {
        int q7;
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            if (this.f13903g - this.f13905i < 10) {
                while (i9 < 10) {
                    if (D() < 0) {
                        i9++;
                    }
                }
                throw mq3.e();
            }
            while (i9 < 10) {
                byte[] bArr = this.f13902f;
                int i10 = this.f13905i;
                this.f13905i = i10 + 1;
                if (bArr[i10] < 0) {
                    i9++;
                }
            }
            throw mq3.e();
            return true;
        }
        if (i8 == 1) {
            B(8);
            return true;
        }
        if (i8 == 2) {
            B(F());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw mq3.a();
            }
            B(4);
            return true;
        }
        do {
            q7 = q();
            if (q7 == 0) {
                break;
            }
        } while (d(q7));
        A(((i7 >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final double h() {
        return Double.longBitsToDouble(G());
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final float i() {
        return Float.intBitsToFloat(E());
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int j() {
        return this.f13905i - this.f13906j;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int k(int i7) {
        if (i7 < 0) {
            throw mq3.f();
        }
        int i8 = i7 + (this.f13905i - this.f13906j);
        if (i8 < 0) {
            throw mq3.g();
        }
        int i9 = this.f13908l;
        if (i8 > i9) {
            throw mq3.j();
        }
        this.f13908l = i8;
        C();
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int l() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int m() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int n() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int o() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int p() {
        return cp3.e(F());
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int q() {
        if (b()) {
            this.f13907k = 0;
            return 0;
        }
        int F = F();
        this.f13907k = F;
        if ((F >>> 3) != 0) {
            return F;
        }
        throw mq3.c();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int r() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long s() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long t() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long u() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long v() {
        return cp3.f(H());
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long w() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final uo3 x() {
        int F = F();
        if (F > 0) {
            int i7 = this.f13903g;
            int i8 = this.f13905i;
            if (F <= i7 - i8) {
                uo3 K = uo3.K(this.f13902f, i8, F);
                this.f13905i += F;
                return K;
            }
        }
        if (F == 0) {
            return uo3.f12885g;
        }
        if (F > 0) {
            int i9 = this.f13903g;
            int i10 = this.f13905i;
            if (F <= i9 - i10) {
                int i11 = F + i10;
                this.f13905i = i11;
                return uo3.N(Arrays.copyOfRange(this.f13902f, i10, i11));
            }
        }
        if (F <= 0) {
            throw mq3.f();
        }
        throw mq3.j();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final String y() {
        int F = F();
        if (F > 0) {
            int i7 = this.f13903g;
            int i8 = this.f13905i;
            if (F <= i7 - i8) {
                String str = new String(this.f13902f, i8, F, kq3.f7586b);
                this.f13905i += F;
                return str;
            }
        }
        if (F == 0) {
            return "";
        }
        if (F < 0) {
            throw mq3.f();
        }
        throw mq3.j();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final String z() {
        int F = F();
        if (F > 0) {
            int i7 = this.f13903g;
            int i8 = this.f13905i;
            if (F <= i7 - i8) {
                String h7 = lt3.h(this.f13902f, i8, F);
                this.f13905i += F;
                return h7;
            }
        }
        if (F == 0) {
            return "";
        }
        if (F <= 0) {
            throw mq3.f();
        }
        throw mq3.j();
    }
}
