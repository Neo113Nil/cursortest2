package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class ap3 extends cp3 {

    /* renamed from: f, reason: collision with root package name */
    private final InputStream f2907f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f2908g;

    /* renamed from: h, reason: collision with root package name */
    private int f2909h;

    /* renamed from: i, reason: collision with root package name */
    private int f2910i;

    /* renamed from: j, reason: collision with root package name */
    private int f2911j;

    /* renamed from: k, reason: collision with root package name */
    private int f2912k;

    /* renamed from: l, reason: collision with root package name */
    private int f2913l;

    /* renamed from: m, reason: collision with root package name */
    private int f2914m;

    /* synthetic */ ap3(InputStream inputStream, int i7, zo3 zo3Var) {
        super(null);
        this.f2914m = Integer.MAX_VALUE;
        kq3.f(inputStream, "input");
        this.f2907f = inputStream;
        this.f2908g = new byte[4096];
        this.f2909h = 0;
        this.f2911j = 0;
        this.f2913l = 0;
    }

    private final List<byte[]> C(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, 4096);
            byte[] bArr = new byte[min];
            int i8 = 0;
            while (i8 < min) {
                int read = this.f2907f.read(bArr, i8, min - i8);
                if (read == -1) {
                    throw mq3.j();
                }
                this.f2913l += read;
                i8 += read;
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void D() {
        int i7 = this.f2909h + this.f2910i;
        this.f2909h = i7;
        int i8 = this.f2913l + i7;
        int i9 = this.f2914m;
        if (i8 <= i9) {
            this.f2910i = 0;
            return;
        }
        int i10 = i8 - i9;
        this.f2910i = i10;
        this.f2909h = i7 - i10;
    }

    private final void E(int i7) {
        if (F(i7)) {
            return;
        }
        if (i7 <= (Integer.MAX_VALUE - this.f2913l) - this.f2911j) {
            throw mq3.j();
        }
        throw mq3.i();
    }

    private final boolean F(int i7) {
        int i8 = this.f2911j;
        int i9 = this.f2909h;
        if (i8 + i7 <= i9) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i7);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i10 = this.f2913l;
        if (i7 > (Integer.MAX_VALUE - i10) - i8 || i10 + i8 + i7 > this.f2914m) {
            return false;
        }
        if (i8 > 0) {
            if (i9 > i8) {
                byte[] bArr = this.f2908g;
                System.arraycopy(bArr, i8, bArr, 0, i9 - i8);
            }
            i10 = this.f2913l + i8;
            this.f2913l = i10;
            i9 = this.f2909h - i8;
            this.f2909h = i9;
            this.f2911j = 0;
        }
        try {
            int read = this.f2907f.read(this.f2908g, i9, Math.min(4096 - i9, (Integer.MAX_VALUE - i10) - i9));
            if (read == 0 || read < -1 || read > 4096) {
                String valueOf = String.valueOf(this.f2907f.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 91);
                sb2.append(valueOf);
                sb2.append("#read(byte[]) returned invalid result: ");
                sb2.append(read);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (read <= 0) {
                return false;
            }
            this.f2909h += read;
            D();
            if (this.f2909h >= i7) {
                return true;
            }
            return F(i7);
        } catch (mq3 e7) {
            e7.k();
            throw e7;
        }
    }

    private final byte[] G(int i7, boolean z6) {
        byte[] H = H(i7);
        if (H != null) {
            return H;
        }
        int i8 = this.f2911j;
        int i9 = this.f2909h;
        int i10 = i9 - i8;
        this.f2913l += i9;
        this.f2911j = 0;
        this.f2909h = 0;
        List<byte[]> C = C(i7 - i10);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f2908g, i8, bArr, 0, i10);
        for (byte[] bArr2 : C) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i10, length);
            i10 += length;
        }
        return bArr;
    }

    private final byte[] H(int i7) {
        if (i7 == 0) {
            return kq3.f7588d;
        }
        if (i7 < 0) {
            throw mq3.f();
        }
        int i8 = this.f2913l;
        int i9 = this.f2911j;
        int i10 = i8 + i9 + i7;
        if ((-2147483647) + i10 > 0) {
            throw mq3.i();
        }
        int i11 = this.f2914m;
        if (i10 > i11) {
            B((i11 - i8) - i9);
            throw mq3.j();
        }
        int i12 = this.f2909h - i9;
        int i13 = i7 - i12;
        if (i13 >= 4096) {
            try {
                if (i13 > this.f2907f.available()) {
                    return null;
                }
            } catch (mq3 e7) {
                e7.k();
                throw e7;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f2908g, this.f2911j, bArr, 0, i12);
        this.f2913l += this.f2909h;
        this.f2911j = 0;
        this.f2909h = 0;
        while (i12 < i7) {
            try {
                int read = this.f2907f.read(bArr, i12, i7 - i12);
                if (read == -1) {
                    throw mq3.j();
                }
                this.f2913l += read;
                i12 += read;
            } catch (mq3 e8) {
                e8.k();
                throw e8;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final void A(int i7) {
        if (this.f2912k != i7) {
            throw mq3.b();
        }
    }

    public final void B(int i7) {
        int i8 = this.f2909h;
        int i9 = this.f2911j;
        int i10 = i8 - i9;
        if (i7 <= i10 && i7 >= 0) {
            this.f2911j = i9 + i7;
            return;
        }
        if (i7 < 0) {
            throw mq3.f();
        }
        int i11 = this.f2913l;
        int i12 = i11 + i9;
        int i13 = this.f2914m;
        if (i12 + i7 > i13) {
            B((i13 - i11) - i9);
            throw mq3.j();
        }
        this.f2913l = i12;
        this.f2909h = 0;
        this.f2911j = 0;
        while (i10 < i7) {
            try {
                long j7 = i7 - i10;
                try {
                    long skip = this.f2907f.skip(j7);
                    if (skip < 0 || skip > j7) {
                        String valueOf = String.valueOf(this.f2907f.getClass());
                        StringBuilder sb = new StringBuilder(valueOf.length() + 92);
                        sb.append(valueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(skip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i10 += (int) skip;
                    }
                } catch (mq3 e7) {
                    e7.k();
                    throw e7;
                }
            } finally {
                this.f2913l += i10;
                D();
            }
        }
        if (i10 >= i7) {
            return;
        }
        int i14 = this.f2909h;
        int i15 = i14 - this.f2911j;
        this.f2911j = i14;
        while (true) {
            E(1);
            int i16 = i7 - i15;
            int i17 = this.f2909h;
            if (i16 <= i17) {
                this.f2911j = i16;
                return;
            } else {
                i15 += i17;
                this.f2911j = i17;
            }
        }
    }

    public final byte I() {
        if (this.f2911j == this.f2909h) {
            E(1);
        }
        byte[] bArr = this.f2908g;
        int i7 = this.f2911j;
        this.f2911j = i7 + 1;
        return bArr[i7];
    }

    public final int J() {
        int i7 = this.f2911j;
        if (this.f2909h - i7 < 4) {
            E(4);
            i7 = this.f2911j;
        }
        byte[] bArr = this.f2908g;
        this.f2911j = i7 + 4;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r2[r3] >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int K() {
        int i7;
        int i8 = this.f2911j;
        int i9 = this.f2909h;
        if (i9 != i8) {
            byte[] bArr = this.f2908g;
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f2911j = i10;
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
                this.f2911j = i11;
                return i7;
            }
        }
        return (int) N();
    }

    public final long L() {
        int i7 = this.f2911j;
        if (this.f2909h - i7 < 8) {
            E(8);
            i7 = this.f2911j;
        }
        byte[] bArr = this.f2908g;
        this.f2911j = i7 + 8;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final long M() {
        long j7;
        long j8;
        long j9;
        long j10;
        int i7;
        int i8 = this.f2911j;
        int i9 = this.f2909h;
        if (i9 != i8) {
            byte[] bArr = this.f2908g;
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f2911j = i10;
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
                                                    this.f2911j = i11;
                                                    return j8;
                                                }
                                            }
                                        }
                                    }
                                }
                                j8 = j9 ^ j12;
                                i11 = i16;
                                this.f2911j = i11;
                                return j8;
                            }
                            j10 = 266354560;
                            j7 = j11 ^ j10;
                        }
                    }
                    i11 = i13;
                    j8 = j7;
                    this.f2911j = i11;
                    return j8;
                }
                i7 = i12 ^ (-128);
                j8 = i7;
                this.f2911j = i11;
                return j8;
            }
        }
        return N();
    }

    final long N() {
        long j7 = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            j7 |= (r3 & Byte.MAX_VALUE) << i7;
            if ((I() & 128) == 0) {
                return j7;
            }
        }
        throw mq3.e();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final void a(int i7) {
        this.f2914m = i7;
        D();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final boolean b() {
        return this.f2911j == this.f2909h && !F(1);
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final boolean c() {
        return M() != 0;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final boolean d(int i7) {
        int q7;
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            if (this.f2909h - this.f2911j < 10) {
                while (i9 < 10) {
                    if (I() < 0) {
                        i9++;
                    }
                }
                throw mq3.e();
            }
            while (i9 < 10) {
                byte[] bArr = this.f2908g;
                int i10 = this.f2911j;
                this.f2911j = i10 + 1;
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
            B(K());
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
        return Double.longBitsToDouble(L());
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final float i() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int j() {
        return this.f2913l + this.f2911j;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int k(int i7) {
        if (i7 < 0) {
            throw mq3.f();
        }
        int i8 = i7 + this.f2913l + this.f2911j;
        int i9 = this.f2914m;
        if (i8 > i9) {
            throw mq3.j();
        }
        this.f2914m = i8;
        D();
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int l() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int m() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int n() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int o() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int p() {
        return cp3.e(K());
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int q() {
        if (b()) {
            this.f2912k = 0;
            return 0;
        }
        int K = K();
        this.f2912k = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw mq3.c();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final int r() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long s() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long t() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long u() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long v() {
        return cp3.f(M());
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final long w() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final uo3 x() {
        int K = K();
        int i7 = this.f2909h;
        int i8 = this.f2911j;
        if (K <= i7 - i8 && K > 0) {
            uo3 K2 = uo3.K(this.f2908g, i8, K);
            this.f2911j += K;
            return K2;
        }
        if (K == 0) {
            return uo3.f12885g;
        }
        byte[] H = H(K);
        if (H != null) {
            return uo3.J(H);
        }
        int i9 = this.f2911j;
        int i10 = this.f2909h;
        int i11 = i10 - i9;
        this.f2913l += i10;
        this.f2911j = 0;
        this.f2909h = 0;
        List<byte[]> C = C(K - i11);
        byte[] bArr = new byte[K];
        System.arraycopy(this.f2908g, i9, bArr, 0, i11);
        for (byte[] bArr2 : C) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        return uo3.N(bArr);
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final String y() {
        int K = K();
        if (K > 0) {
            int i7 = this.f2909h;
            int i8 = this.f2911j;
            if (K <= i7 - i8) {
                String str = new String(this.f2908g, i8, K, kq3.f7586b);
                this.f2911j += K;
                return str;
            }
        }
        if (K == 0) {
            return "";
        }
        if (K > this.f2909h) {
            return new String(G(K, false), kq3.f7586b);
        }
        E(K);
        String str2 = new String(this.f2908g, this.f2911j, K, kq3.f7586b);
        this.f2911j += K;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.cp3
    public final String z() {
        byte[] G;
        int K = K();
        int i7 = this.f2911j;
        int i8 = this.f2909h;
        if (K <= i8 - i7 && K > 0) {
            G = this.f2908g;
            this.f2911j = i7 + K;
        } else {
            if (K == 0) {
                return "";
            }
            if (K <= i8) {
                E(K);
                G = this.f2908g;
                this.f2911j = K;
            } else {
                G = G(K, false);
            }
            i7 = 0;
        }
        return lt3.h(G, i7, K);
    }
}
