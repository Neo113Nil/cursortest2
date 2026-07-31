package androidx.datastore.preferences.protobuf;

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: f, reason: collision with root package name */
    public final FileInputStream f698f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f699g;

    /* renamed from: h, reason: collision with root package name */
    public int f700h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f701j;

    /* renamed from: k, reason: collision with root package name */
    public int f702k;

    /* renamed from: l, reason: collision with root package name */
    public int f703l;

    /* renamed from: m, reason: collision with root package name */
    public int f704m = Integer.MAX_VALUE;

    public i(FileInputStream fileInputStream) {
        Charset charset = y.f794a;
        this.f698f = fileInputStream;
        this.f699g = new byte[4096];
        this.f700h = 0;
        this.f701j = 0;
        this.f703l = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int A() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long B() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean C(int i) {
        int i8 = i & 7;
        int i9 = 0;
        if (i8 != 0) {
            if (i8 == 1) {
                O(8);
                return true;
            }
            if (i8 == 2) {
                O(J());
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
            O(4);
            return true;
        }
        int i10 = this.f700h - this.f701j;
        byte[] bArr = this.f699g;
        if (i10 >= 10) {
            while (i9 < 10) {
                int i11 = this.f701j;
                this.f701j = i11 + 1;
                if (bArr[i11] < 0) {
                    i9++;
                }
            }
            throw a0.c();
        }
        while (i9 < 10) {
            if (this.f701j == this.f700h) {
                N(1);
            }
            int i12 = this.f701j;
            this.f701j = i12 + 1;
            if (bArr[i12] < 0) {
                i9++;
            }
        }
        throw a0.c();
        return true;
    }

    public final byte[] E(int i) {
        byte[] F = F(i);
        if (F != null) {
            return F;
        }
        int i8 = this.f701j;
        int i9 = this.f700h;
        int i10 = i9 - i8;
        this.f703l += i9;
        this.f701j = 0;
        this.f700h = 0;
        ArrayList G = G(i - i10);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f699g, i8, bArr, 0, i10);
        int size = G.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = G.get(i11);
            i11++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
            i10 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] F(int i) {
        if (i == 0) {
            return y.f795b;
        }
        if (i < 0) {
            throw a0.d();
        }
        int i8 = this.f703l;
        int i9 = this.f701j;
        int i10 = i8 + i9 + i;
        if (i10 - Integer.MAX_VALUE > 0) {
            throw new a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i11 = this.f704m;
        if (i10 > i11) {
            O((i11 - i8) - i9);
            throw a0.e();
        }
        int i12 = this.f700h - i9;
        int i13 = i - i12;
        FileInputStream fileInputStream = this.f698f;
        if (i13 >= 4096) {
            try {
                if (i13 > fileInputStream.available()) {
                    return null;
                }
            } catch (a0 e8) {
                e8.f645d = true;
                throw e8;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f699g, this.f701j, bArr, 0, i12);
        this.f703l += this.f700h;
        this.f701j = 0;
        this.f700h = 0;
        while (i12 < i) {
            try {
                int read = fileInputStream.read(bArr, i12, i - i12);
                if (read == -1) {
                    throw a0.e();
                }
                this.f703l += read;
                i12 += read;
            } catch (a0 e9) {
                e9.f645d = true;
                throw e9;
            }
        }
        return bArr;
    }

    public final ArrayList G(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i8 = 0;
            while (i8 < min) {
                int read = this.f698f.read(bArr, i8, min - i8);
                if (read == -1) {
                    throw a0.e();
                }
                this.f703l += read;
                i8 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int H() {
        int i = this.f701j;
        if (this.f700h - i < 4) {
            N(4);
            i = this.f701j;
        }
        this.f701j = i + 4;
        byte[] bArr = this.f699g;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long I() {
        int i = this.f701j;
        if (this.f700h - i < 8) {
            N(8);
            i = this.f701j;
        }
        this.f701j = i + 8;
        byte[] bArr = this.f699g;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final int J() {
        int i;
        int i8 = this.f701j;
        int i9 = this.f700h;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte[] bArr = this.f699g;
            byte b8 = bArr[i8];
            if (b8 >= 0) {
                this.f701j = i10;
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
                this.f701j = i11;
                return i;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j7;
        long j8;
        long j9;
        long j10;
        int i = this.f701j;
        int i8 = this.f700h;
        if (i8 != i) {
            int i9 = i + 1;
            byte[] bArr = this.f699g;
            byte b8 = bArr[i];
            if (b8 >= 0) {
                this.f701j = i9;
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
                this.f701j = i10;
                return j7;
            }
        }
        return L();
    }

    public final long L() {
        long j7 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f701j == this.f700h) {
                N(1);
            }
            int i8 = this.f701j;
            this.f701j = i8 + 1;
            j7 |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f699g[i8] & 128) == 0) {
                return j7;
            }
        }
        throw a0.c();
    }

    public final void M() {
        int i = this.f700h + this.i;
        this.f700h = i;
        int i8 = this.f703l + i;
        int i9 = this.f704m;
        if (i8 <= i9) {
            this.i = 0;
            return;
        }
        int i10 = i8 - i9;
        this.i = i10;
        this.f700h = i - i10;
    }

    public final void N(int i) {
        if (P(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f703l) - this.f701j) {
            throw a0.e();
        }
        throw new a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void O(int i) {
        int i8 = this.f700h;
        int i9 = this.f701j;
        int i10 = i8 - i9;
        if (i <= i10 && i >= 0) {
            this.f701j = i9 + i;
            return;
        }
        FileInputStream fileInputStream = this.f698f;
        if (i < 0) {
            throw a0.d();
        }
        int i11 = this.f703l;
        int i12 = i11 + i9;
        int i13 = i12 + i;
        int i14 = this.f704m;
        if (i13 > i14) {
            O((i14 - i11) - i9);
            throw a0.e();
        }
        this.f703l = i12;
        this.f700h = 0;
        this.f701j = 0;
        while (i10 < i) {
            long j7 = i - i10;
            try {
                try {
                    long skip = fileInputStream.skip(j7);
                    if (skip < 0 || skip > j7) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i10 += (int) skip;
                    }
                } catch (a0 e8) {
                    e8.f645d = true;
                    throw e8;
                }
            } catch (Throwable th) {
                this.f703l += i10;
                M();
                throw th;
            }
        }
        this.f703l += i10;
        M();
        if (i10 >= i) {
            return;
        }
        int i15 = this.f700h;
        int i16 = i15 - this.f701j;
        this.f701j = i15;
        N(1);
        while (true) {
            int i17 = i - i16;
            int i18 = this.f700h;
            if (i17 <= i18) {
                this.f701j = i17;
                return;
            } else {
                i16 += i18;
                this.f701j = i18;
                N(1);
            }
        }
    }

    public final boolean P(int i) {
        FileInputStream fileInputStream = this.f698f;
        int i8 = this.f701j;
        int i9 = i8 + i;
        int i10 = this.f700h;
        if (i9 <= i10) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i11 = this.f703l;
        if (i <= (Integer.MAX_VALUE - i11) - i8 && i11 + i8 + i <= this.f704m) {
            byte[] bArr = this.f699g;
            if (i8 > 0) {
                if (i10 > i8) {
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f703l += i8;
                this.f700h -= i8;
                this.f701j = 0;
            }
            int i12 = this.f700h;
            try {
                int read = fileInputStream.read(bArr, i12, Math.min(bArr.length - i12, (Integer.MAX_VALUE - this.f703l) - i12));
                if (read == 0 || read < -1 || read > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                }
                if (read > 0) {
                    this.f700h += read;
                    M();
                    if (this.f700h >= i) {
                        return true;
                    }
                    return P(i);
                }
            } catch (a0 e8) {
                e8.f645d = true;
                throw e8;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void a(int i) {
        if (this.f702k != i) {
            throw new a0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int b() {
        return this.f703l + this.f701j;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean c() {
        return this.f701j == this.f700h && !P(1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void h(int i) {
        this.f704m = i;
        M();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int i(int i) {
        if (i < 0) {
            throw a0.d();
        }
        int i8 = this.f703l + this.f701j + i;
        if (i8 < 0) {
            throw new a0("Failed to parse the message.");
        }
        int i9 = this.f704m;
        if (i8 > i9) {
            throw a0.e();
        }
        this.f704m = i8;
        M();
        return i9;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean j() {
        return K() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final g l() {
        int J = J();
        int i = this.f700h;
        int i8 = this.f701j;
        int i9 = i - i8;
        byte[] bArr = this.f699g;
        if (J <= i9 && J > 0) {
            g c8 = g.c(bArr, i8, J);
            this.f701j += J;
            return c8;
        }
        if (J == 0) {
            return g.f682f;
        }
        if (J < 0) {
            throw a0.d();
        }
        byte[] F = F(J);
        if (F != null) {
            return g.c(F, 0, F.length);
        }
        int i10 = this.f701j;
        int i11 = this.f700h;
        int i12 = i11 - i10;
        this.f703l += i11;
        this.f701j = 0;
        this.f700h = 0;
        ArrayList G = G(J - i12);
        byte[] bArr2 = new byte[J];
        System.arraycopy(bArr, i10, bArr2, 0, i12);
        int size = G.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = G.get(i13);
            i13++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, i12, bArr3.length);
            i12 += bArr3.length;
        }
        g gVar = g.f682f;
        return new g(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final double m() {
        return Double.longBitsToDouble(I());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int n() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int o() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long p() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final float q() {
        return Float.intBitsToFloat(H());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int r() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long s() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int t() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long u() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int v() {
        int J = J();
        return (-(J & 1)) ^ (J >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long w() {
        long K = K();
        return (-(K & 1)) ^ (K >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String x() {
        int J = J();
        byte[] bArr = this.f699g;
        if (J > 0) {
            int i = this.f700h;
            int i8 = this.f701j;
            if (J <= i - i8) {
                String str = new String(bArr, i8, J, y.f794a);
                this.f701j += J;
                return str;
            }
        }
        if (J == 0) {
            return "";
        }
        if (J < 0) {
            throw a0.d();
        }
        if (J > this.f700h) {
            return new String(E(J), y.f794a);
        }
        N(J);
        String str2 = new String(bArr, this.f701j, J, y.f794a);
        this.f701j += J;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String y() {
        int J = J();
        int i = this.f701j;
        int i8 = this.f700h;
        int i9 = i8 - i;
        byte[] bArr = this.f699g;
        if (J <= i9 && J > 0) {
            this.f701j = i + J;
        } else {
            if (J == 0) {
                return "";
            }
            if (J < 0) {
                throw a0.d();
            }
            i = 0;
            if (J <= i8) {
                N(J);
                this.f701j = J;
            } else {
                bArr = E(J);
            }
        }
        return n1.f734a.m(bArr, i, J);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int z() {
        if (c()) {
            this.f702k = 0;
            return 0;
        }
        int J = J();
        this.f702k = J;
        if ((J >>> 3) != 0) {
            return J;
        }
        throw new a0("Protocol message contained an invalid tag (zero).");
    }
}
