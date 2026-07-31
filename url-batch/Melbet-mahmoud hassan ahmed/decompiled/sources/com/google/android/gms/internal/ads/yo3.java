package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
final class yo3 extends cp3 {

    /* renamed from: f, reason: collision with root package name */
    private final Iterable<ByteBuffer> f14767f;

    /* renamed from: g, reason: collision with root package name */
    private final Iterator<ByteBuffer> f14768g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f14769h;

    /* renamed from: i, reason: collision with root package name */
    private int f14770i;

    /* renamed from: j, reason: collision with root package name */
    private int f14771j;

    /* renamed from: k, reason: collision with root package name */
    private int f14772k;

    /* renamed from: l, reason: collision with root package name */
    private int f14773l;

    /* renamed from: m, reason: collision with root package name */
    private int f14774m;

    /* renamed from: n, reason: collision with root package name */
    private long f14775n;

    /* renamed from: o, reason: collision with root package name */
    private long f14776o;

    /* renamed from: p, reason: collision with root package name */
    private long f14777p;

    /* synthetic */ yo3(Iterable iterable, int i7, boolean z6, xo3 xo3Var) {
        super(null);
        this.f14772k = Integer.MAX_VALUE;
        this.f14770i = i7;
        this.f14767f = iterable;
        this.f14768g = iterable.iterator();
        this.f14774m = 0;
        if (i7 != 0) {
            G();
            return;
        }
        this.f14769h = kq3.f7589e;
        this.f14775n = 0L;
        this.f14776o = 0L;
        this.f14777p = 0L;
    }

    private final int C() {
        return (int) (((this.f14770i - this.f14774m) - this.f14775n) + this.f14776o);
    }

    private final void D() {
        if (!this.f14768g.hasNext()) {
            throw mq3.j();
        }
        G();
    }

    private final void E(byte[] bArr, int i7, int i8) {
        if (i8 > C()) {
            if (i8 > 0) {
                throw mq3.j();
            }
            return;
        }
        int i9 = i8;
        while (i9 > 0) {
            if (this.f14777p - this.f14775n == 0) {
                D();
            }
            int min = Math.min(i9, (int) (this.f14777p - this.f14775n));
            long j7 = min;
            gt3.w(this.f14775n, bArr, i8 - i9, j7);
            i9 -= min;
            this.f14775n += j7;
        }
    }

    private final void F() {
        int i7 = this.f14770i + this.f14771j;
        this.f14770i = i7;
        int i8 = this.f14772k;
        if (i7 <= i8) {
            this.f14771j = 0;
            return;
        }
        int i9 = i7 - i8;
        this.f14771j = i9;
        this.f14770i = i7 - i9;
    }

    private final void G() {
        ByteBuffer next = this.f14768g.next();
        this.f14769h = next;
        this.f14774m += (int) (this.f14775n - this.f14776o);
        long position = next.position();
        this.f14775n = position;
        this.f14776o = position;
        this.f14777p = this.f14769h.limit();
        long m7 = gt3.m(this.f14769h);
        this.f14775n += m7;
        this.f14776o += m7;
        this.f14777p += m7;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final void A(int i7) {
        if (this.f14773l != i7) {
            throw mq3.b();
        }
    }

    public final void B(int i7) {
        if (i7 < 0 || i7 > ((this.f14770i - this.f14774m) - this.f14775n) + this.f14776o) {
            if (i7 >= 0) {
                throw mq3.j();
            }
            throw mq3.f();
        }
        while (i7 > 0) {
            if (this.f14777p - this.f14775n == 0) {
                D();
            }
            int min = Math.min(i7, (int) (this.f14777p - this.f14775n));
            i7 -= min;
            this.f14775n += min;
        }
    }

    public final byte H() {
        if (this.f14777p - this.f14775n == 0) {
            D();
        }
        long j7 = this.f14775n;
        this.f14775n = 1 + j7;
        return gt3.i(j7);
    }

    public final int I() {
        int H;
        byte H2;
        long j7 = this.f14777p;
        long j8 = this.f14775n;
        if (j7 - j8 >= 4) {
            this.f14775n = 4 + j8;
            H = (gt3.i(j8) & 255) | ((gt3.i(1 + j8) & 255) << 8) | ((gt3.i(2 + j8) & 255) << 16);
            H2 = gt3.i(j8 + 3);
        } else {
            H = (H() & 255) | ((H() & 255) << 8) | ((H() & 255) << 16);
            H2 = H();
        }
        return H | ((H2 & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (com.google.android.gms.internal.ads.gt3.i(r4) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int J() {
        int i7;
        long j7 = this.f14775n;
        if (this.f14777p != j7) {
            long j8 = j7 + 1;
            byte i8 = gt3.i(j7);
            if (i8 >= 0) {
                this.f14775n++;
                return i8;
            }
            if (this.f14777p - this.f14775n >= 10) {
                long j9 = j8 + 1;
                int i9 = i8 ^ (gt3.i(j8) << 7);
                if (i9 < 0) {
                    i7 = i9 ^ (-128);
                } else {
                    long j10 = j9 + 1;
                    int i10 = i9 ^ (gt3.i(j9) << 14);
                    if (i10 >= 0) {
                        i7 = i10 ^ 16256;
                    } else {
                        j9 = j10 + 1;
                        int i11 = i10 ^ (gt3.i(j10) << 21);
                        if (i11 < 0) {
                            i7 = i11 ^ (-2080896);
                        } else {
                            j10 = j9 + 1;
                            byte i12 = gt3.i(j9);
                            i7 = (i11 ^ (i12 << 28)) ^ 266354560;
                            if (i12 < 0) {
                                j9 = j10 + 1;
                                if (gt3.i(j10) < 0) {
                                    j10 = j9 + 1;
                                    if (gt3.i(j9) < 0) {
                                        j9 = j10 + 1;
                                        if (gt3.i(j10) < 0) {
                                            j10 = j9 + 1;
                                            if (gt3.i(j9) < 0) {
                                                j9 = j10 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j9 = j10;
                }
                this.f14775n = j9;
                return i7;
            }
        }
        return (int) M();
    }

    public final long K() {
        long H;
        byte H2;
        long j7 = this.f14777p;
        long j8 = this.f14775n;
        if (j7 - j8 >= 8) {
            this.f14775n = 8 + j8;
            H = (gt3.i(j8) & 255) | ((gt3.i(1 + j8) & 255) << 8) | ((gt3.i(2 + j8) & 255) << 16) | ((gt3.i(3 + j8) & 255) << 24) | ((gt3.i(4 + j8) & 255) << 32) | ((gt3.i(5 + j8) & 255) << 40) | ((gt3.i(6 + j8) & 255) << 48);
            H2 = gt3.i(j8 + 7);
        } else {
            H = (H() & 255) | ((H() & 255) << 8) | ((H() & 255) << 16) | ((H() & 255) << 24) | ((H() & 255) << 32) | ((H() & 255) << 40) | ((H() & 255) << 48);
            H2 = H();
        }
        return H | ((H2 & 255) << 56);
    }

    public final long L() {
        long i7;
        long j7;
        long j8;
        int i8;
        long j9 = this.f14775n;
        if (this.f14777p != j9) {
            long j10 = j9 + 1;
            byte i9 = gt3.i(j9);
            if (i9 >= 0) {
                this.f14775n++;
                return i9;
            }
            if (this.f14777p - this.f14775n >= 10) {
                long j11 = j10 + 1;
                int i10 = i9 ^ (gt3.i(j10) << 7);
                if (i10 >= 0) {
                    long j12 = j11 + 1;
                    int i11 = i10 ^ (gt3.i(j11) << 14);
                    if (i11 >= 0) {
                        i7 = i11 ^ 16256;
                    } else {
                        j11 = j12 + 1;
                        int i12 = i11 ^ (gt3.i(j12) << 21);
                        if (i12 < 0) {
                            i8 = i12 ^ (-2080896);
                        } else {
                            j12 = j11 + 1;
                            long i13 = i12 ^ (gt3.i(j11) << 28);
                            if (i13 < 0) {
                                long j13 = j12 + 1;
                                long i14 = i13 ^ (gt3.i(j12) << 35);
                                if (i14 < 0) {
                                    j7 = -34093383808L;
                                } else {
                                    j12 = j13 + 1;
                                    i13 = i14 ^ (gt3.i(j13) << 42);
                                    if (i13 >= 0) {
                                        j8 = 4363953127296L;
                                    } else {
                                        j13 = j12 + 1;
                                        i14 = i13 ^ (gt3.i(j12) << 49);
                                        if (i14 < 0) {
                                            j7 = -558586000294016L;
                                        } else {
                                            j12 = j13 + 1;
                                            i7 = (i14 ^ (gt3.i(j13) << 56)) ^ 71499008037633920L;
                                            if (i7 < 0) {
                                                long j14 = 1 + j12;
                                                if (gt3.i(j12) >= 0) {
                                                    j11 = j14;
                                                    this.f14775n = j11;
                                                    return i7;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i14 ^ j7;
                                j11 = j13;
                                this.f14775n = j11;
                                return i7;
                            }
                            j8 = 266354560;
                            i7 = i13 ^ j8;
                        }
                    }
                    j11 = j12;
                    this.f14775n = j11;
                    return i7;
                }
                i8 = i10 ^ (-128);
                i7 = i8;
                this.f14775n = j11;
                return i7;
            }
        }
        return M();
    }

    final long M() {
        long j7 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            j7 |= (r3 & Byte.MAX_VALUE) << i7;
            if ((H() & 128) == 0) {
                return j7;
            }
        }
        throw mq3.e();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final void a(int i7) {
        this.f14772k = i7;
        F();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final boolean b() {
        return (((long) this.f14774m) + this.f14775n) - this.f14776o == ((long) this.f14770i);
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final boolean c() {
        return L() != 0;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final boolean d(int i7) {
        int q7;
        int i8 = i7 & 7;
        if (i8 == 0) {
            for (int i9 = 0; i9 < 10; i9++) {
                if (H() >= 0) {
                    return true;
                }
            }
            throw mq3.e();
        }
        if (i8 == 1) {
            B(8);
            return true;
        }
        if (i8 == 2) {
            B(J());
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
        return Double.longBitsToDouble(K());
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final float i() {
        return Float.intBitsToFloat(I());
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int j() {
        return (int) ((this.f14774m + this.f14775n) - this.f14776o);
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int k(int i7) {
        if (i7 < 0) {
            throw mq3.f();
        }
        int j7 = i7 + j();
        int i8 = this.f14772k;
        if (j7 > i8) {
            throw mq3.j();
        }
        this.f14772k = j7;
        F();
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int l() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int m() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int n() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int o() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int p() {
        return cp3.e(J());
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int q() {
        if (b()) {
            this.f14773l = 0;
            return 0;
        }
        int J = J();
        this.f14773l = J;
        if ((J >>> 3) != 0) {
            return J;
        }
        throw mq3.c();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int r() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long s() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long t() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long u() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long v() {
        return cp3.f(L());
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long w() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final uo3 x() {
        int J = J();
        if (J > 0) {
            long j7 = J;
            long j8 = this.f14777p;
            long j9 = this.f14775n;
            if (j7 <= j8 - j9) {
                byte[] bArr = new byte[J];
                gt3.w(j9, bArr, 0L, j7);
                this.f14775n += j7;
                return uo3.N(bArr);
            }
        }
        if (J > 0 && J <= C()) {
            byte[] bArr2 = new byte[J];
            E(bArr2, 0, J);
            return uo3.N(bArr2);
        }
        if (J == 0) {
            return uo3.f12885g;
        }
        if (J < 0) {
            throw mq3.f();
        }
        throw mq3.j();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final String y() {
        int J = J();
        if (J > 0) {
            long j7 = J;
            long j8 = this.f14777p;
            long j9 = this.f14775n;
            if (j7 <= j8 - j9) {
                byte[] bArr = new byte[J];
                gt3.w(j9, bArr, 0L, j7);
                String str = new String(bArr, kq3.f7586b);
                this.f14775n += j7;
                return str;
            }
        }
        if (J > 0 && J <= C()) {
            byte[] bArr2 = new byte[J];
            E(bArr2, 0, J);
            return new String(bArr2, kq3.f7586b);
        }
        if (J == 0) {
            return "";
        }
        if (J < 0) {
            throw mq3.f();
        }
        throw mq3.j();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final String z() {
        int J = J();
        if (J > 0) {
            long j7 = J;
            long j8 = this.f14777p;
            long j9 = this.f14775n;
            if (j7 <= j8 - j9) {
                String g7 = lt3.g(this.f14769h, (int) (j9 - this.f14776o), J);
                this.f14775n += j7;
                return g7;
            }
        }
        if (J >= 0 && J <= C()) {
            byte[] bArr = new byte[J];
            E(bArr, 0, J);
            return lt3.h(bArr, 0, J);
        }
        if (J == 0) {
            return "";
        }
        if (J <= 0) {
            throw mq3.f();
        }
        throw mq3.j();
    }
}
