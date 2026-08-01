package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: i, reason: collision with root package name */
    public final FileInputStream f550i;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f551r;

    /* renamed from: s, reason: collision with root package name */
    public int f552s;

    /* renamed from: t, reason: collision with root package name */
    public int f553t;

    /* renamed from: u, reason: collision with root package name */
    public int f554u;

    /* renamed from: v, reason: collision with root package name */
    public int f555v;

    /* renamed from: w, reason: collision with root package name */
    public int f556w;

    /* renamed from: x, reason: collision with root package name */
    public int f557x = Integer.MAX_VALUE;

    public h(FileInputStream fileInputStream) {
        Charset charset = x.f647a;
        this.f550i = fileInputStream;
        this.f551r = new byte[4096];
        this.f552s = 0;
        this.f554u = 0;
        this.f556w = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int A() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long B() {
        return L();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final boolean C(int i3) {
        int i10 = i3 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                P(8);
                return true;
            }
            if (i10 == 2) {
                P(K());
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
            P(4);
            return true;
        }
        int i12 = this.f552s - this.f554u;
        byte[] bArr = this.f551r;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f554u;
                this.f554u = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw z.c();
        }
        while (i11 < 10) {
            if (this.f554u == this.f552s) {
                O(1);
            }
            int i14 = this.f554u;
            this.f554u = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw z.c();
        return true;
    }

    public final byte[] F(int i3) {
        byte[] G = G(i3);
        if (G != null) {
            return G;
        }
        int i10 = this.f554u;
        int i11 = this.f552s;
        int i12 = i11 - i10;
        this.f556w += i11;
        this.f554u = 0;
        this.f552s = 0;
        ArrayList H = H(i3 - i12);
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f551r, i10, bArr, 0, i12);
        int size = H.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = H.get(i13);
            i13++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
            i12 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] G(int i3) {
        if (i3 == 0) {
            return x.f648b;
        }
        if (i3 < 0) {
            throw z.d();
        }
        int i10 = this.f556w;
        int i11 = this.f554u;
        int i12 = i10 + i11 + i3;
        if (i12 - Integer.MAX_VALUE > 0) {
            throw new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.f557x;
        if (i12 > i13) {
            P((i13 - i10) - i11);
            throw z.e();
        }
        int i14 = this.f552s - i11;
        int i15 = i3 - i14;
        FileInputStream fileInputStream = this.f550i;
        if (i15 >= 4096) {
            try {
                if (i15 > fileInputStream.available()) {
                    return null;
                }
            } catch (z e2) {
                e2.f658d = true;
                throw e2;
            }
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f551r, this.f554u, bArr, 0, i14);
        this.f556w += this.f552s;
        this.f554u = 0;
        this.f552s = 0;
        while (i14 < i3) {
            try {
                int read = fileInputStream.read(bArr, i14, i3 - i14);
                if (read == -1) {
                    throw z.e();
                }
                this.f556w += read;
                i14 += read;
            } catch (z e9) {
                e9.f658d = true;
                throw e9;
            }
        }
        return bArr;
    }

    public final ArrayList H(int i3) {
        ArrayList arrayList = new ArrayList();
        while (i3 > 0) {
            int min = Math.min(i3, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                int read = this.f550i.read(bArr, i10, min - i10);
                if (read == -1) {
                    throw z.e();
                }
                this.f556w += read;
                i10 += read;
            }
            i3 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int I() {
        int i3 = this.f554u;
        if (this.f552s - i3 < 4) {
            O(4);
            i3 = this.f554u;
        }
        this.f554u = i3 + 4;
        byte[] bArr = this.f551r;
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public final long J() {
        int i3 = this.f554u;
        if (this.f552s - i3 < 8) {
            O(8);
            i3 = this.f554u;
        }
        this.f554u = i3 + 8;
        byte[] bArr = this.f551r;
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public final int K() {
        int i3;
        int i10 = this.f554u;
        int i11 = this.f552s;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f551r;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f554u = i12;
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
                this.f554u = i13;
                return i3;
            }
        }
        return (int) M();
    }

    public final long L() {
        long j;
        long j3;
        long j10;
        long j11;
        int i3 = this.f554u;
        int i10 = this.f552s;
        if (i10 != i3) {
            int i11 = i3 + 1;
            byte[] bArr = this.f551r;
            byte b10 = bArr[i3];
            if (b10 >= 0) {
                this.f554u = i11;
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
                this.f554u = i12;
                return j;
            }
        }
        return M();
    }

    public final long M() {
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            if (this.f554u == this.f552s) {
                O(1);
            }
            int i10 = this.f554u;
            this.f554u = i10 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i3;
            if ((this.f551r[i10] & 128) == 0) {
                return j;
            }
        }
        throw z.c();
    }

    public final void N() {
        int i3 = this.f552s + this.f553t;
        this.f552s = i3;
        int i10 = this.f556w + i3;
        int i11 = this.f557x;
        if (i10 <= i11) {
            this.f553t = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f553t = i12;
        this.f552s = i3 - i12;
    }

    public final void O(int i3) {
        if (Q(i3)) {
            return;
        }
        if (i3 <= (Integer.MAX_VALUE - this.f556w) - this.f554u) {
            throw z.e();
        }
        throw new z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void P(int i3) {
        int i10 = this.f552s;
        int i11 = this.f554u;
        int i12 = i10 - i11;
        if (i3 <= i12 && i3 >= 0) {
            this.f554u = i11 + i3;
            return;
        }
        FileInputStream fileInputStream = this.f550i;
        if (i3 < 0) {
            throw z.d();
        }
        int i13 = this.f556w;
        int i14 = i13 + i11;
        int i15 = i14 + i3;
        int i16 = this.f557x;
        if (i15 > i16) {
            P((i16 - i13) - i11);
            throw z.e();
        }
        this.f556w = i14;
        this.f552s = 0;
        this.f554u = 0;
        while (i12 < i3) {
            long j = i3 - i12;
            try {
                try {
                    long skip = fileInputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i12 += (int) skip;
                    }
                } catch (z e2) {
                    e2.f658d = true;
                    throw e2;
                }
            } catch (Throwable th) {
                this.f556w += i12;
                N();
                throw th;
            }
        }
        this.f556w += i12;
        N();
        if (i12 >= i3) {
            return;
        }
        int i17 = this.f552s;
        int i18 = i17 - this.f554u;
        this.f554u = i17;
        O(1);
        while (true) {
            int i19 = i3 - i18;
            int i20 = this.f552s;
            if (i19 <= i20) {
                this.f554u = i19;
                return;
            } else {
                i18 += i20;
                this.f554u = i20;
                O(1);
            }
        }
    }

    public final boolean Q(int i3) {
        FileInputStream fileInputStream = this.f550i;
        int i10 = this.f554u;
        int i11 = i10 + i3;
        int i12 = this.f552s;
        if (i11 <= i12) {
            kotlin.collections.i0.l(n0.l.f(i3, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i13 = this.f556w;
        if (i3 <= (Integer.MAX_VALUE - i13) - i10 && i13 + i10 + i3 <= this.f557x) {
            byte[] bArr = this.f551r;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f556w += i10;
                this.f552s -= i10;
                this.f554u = 0;
            }
            int i14 = this.f552s;
            try {
                int read = fileInputStream.read(bArr, i14, Math.min(bArr.length - i14, (Integer.MAX_VALUE - this.f556w) - i14));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.f552s += read;
                    N();
                    if (this.f552s >= i3) {
                        return true;
                    }
                    return Q(i3);
                }
            } catch (z e2) {
                e2.f658d = true;
                throw e2;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void a(int i3) {
        if (this.f555v != i3) {
            throw new z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int c() {
        return this.f556w + this.f554u;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final boolean d() {
        return this.f554u == this.f552s && !Q(1);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void i(int i3) {
        this.f557x = i3;
        N();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int j(int i3) {
        if (i3 < 0) {
            throw z.d();
        }
        int i10 = this.f556w + this.f554u + i3;
        if (i10 < 0) {
            throw new z("Failed to parse the message.");
        }
        int i11 = this.f557x;
        if (i10 > i11) {
            throw z.e();
        }
        this.f557x = i10;
        N();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final boolean k() {
        return L() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final f l() {
        int K = K();
        int i3 = this.f552s;
        int i10 = this.f554u;
        int i11 = i3 - i10;
        byte[] bArr = this.f551r;
        if (K <= i11 && K > 0) {
            f e2 = f.e(bArr, i10, K);
            this.f554u += K;
            return e2;
        }
        if (K == 0) {
            return f.f533i;
        }
        if (K < 0) {
            throw z.d();
        }
        byte[] G = G(K);
        if (G != null) {
            return f.e(G, 0, G.length);
        }
        int i12 = this.f554u;
        int i13 = this.f552s;
        int i14 = i13 - i12;
        this.f556w += i13;
        this.f554u = 0;
        this.f552s = 0;
        ArrayList H = H(K - i14);
        byte[] bArr2 = new byte[K];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        int size = H.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = H.get(i15);
            i15++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i14, bArr3.length);
            i14 += bArr3.length;
        }
        f fVar = f.f533i;
        return new f(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final double m() {
        return Double.longBitsToDouble(J());
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int n() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int o() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long p() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final float q() {
        return Float.intBitsToFloat(I());
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int r() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long s() {
        return L();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int t() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long u() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int v() {
        int K = K();
        return (-(K & 1)) ^ (K >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long w() {
        long L = L();
        return (-(L & 1)) ^ (L >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final String x() {
        int K = K();
        byte[] bArr = this.f551r;
        if (K > 0) {
            int i3 = this.f552s;
            int i10 = this.f554u;
            if (K <= i3 - i10) {
                String str = new String(bArr, i10, K, x.f647a);
                this.f554u += K;
                return str;
            }
        }
        if (K == 0) {
            return "";
        }
        if (K < 0) {
            throw z.d();
        }
        if (K > this.f552s) {
            return new String(F(K), x.f647a);
        }
        O(K);
        String str2 = new String(bArr, this.f554u, K, x.f647a);
        this.f554u += K;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final String y() {
        int K = K();
        int i3 = this.f554u;
        int i10 = this.f552s;
        int i11 = i10 - i3;
        byte[] bArr = this.f551r;
        if (K <= i11 && K > 0) {
            this.f554u = i3 + K;
        } else {
            if (K == 0) {
                return "";
            }
            if (K < 0) {
                throw z.d();
            }
            i3 = 0;
            if (K <= i10) {
                O(K);
                this.f554u = K;
            } else {
                bArr = F(K);
            }
        }
        return m1.f585a.u(bArr, i3, K);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int z() {
        if (d()) {
            this.f555v = 0;
            return 0;
        }
        int K = K();
        this.f555v = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw new z("Protocol message contained an invalid tag (zero).");
    }
}
