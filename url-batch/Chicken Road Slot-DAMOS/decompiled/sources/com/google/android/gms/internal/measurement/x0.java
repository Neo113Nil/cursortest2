package com.google.android.gms.internal.measurement;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x0 extends y0 {

    /* renamed from: d, reason: collision with root package name */
    public final InputStream f2961d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f2962e;

    /* renamed from: f, reason: collision with root package name */
    public int f2963f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f2964h;

    /* renamed from: i, reason: collision with root package name */
    public int f2965i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f2966k = Integer.MAX_VALUE;

    public /* synthetic */ x0(InputStream inputStream, int i3) {
        this.f2961d = inputStream;
        this.f2962e = new byte[i3 < 8 ? 8 : i3];
        this.f2963f = 0;
        this.f2964h = 0;
        this.j = 0;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int A() {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int B() {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int C() {
        return P();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final long D() {
        return Q();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int E() {
        return y0.j(G());
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final long F() {
        return y0.k(H());
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int G() {
        int i3;
        int i10 = this.f2964h;
        int i11 = this.f2963f;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f2962e;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f2964h = i12;
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
                this.f2964h = i13;
                return i3;
            }
        }
        return (int) O();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final long H() {
        long j;
        long j3;
        long j10;
        int i3 = this.f2964h;
        int i10 = this.f2963f;
        if (i10 != i3) {
            int i11 = i3 + 1;
            byte[] bArr = this.f2962e;
            byte b10 = bArr[i3];
            if (b10 >= 0) {
                this.f2964h = i11;
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
                    } else {
                        int i16 = i3 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            long j11 = (-2080896) ^ i17;
                            i12 = i16;
                            j = j11;
                        } else {
                            i14 = i3 + 5;
                            long j12 = i17 ^ (bArr[i16] << 28);
                            if (j12 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i18 = i3 + 6;
                                long j13 = j12 ^ (bArr[i14] << 35);
                                if (j13 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i14 = i3 + 7;
                                    j12 = j13 ^ (bArr[i18] << 42);
                                    if (j12 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i18 = i3 + 8;
                                        j13 = j12 ^ (bArr[i14] << 49);
                                        if (j13 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i14 = i3 + 9;
                                            j12 = j13 ^ (bArr[i18] << 56);
                                            if (j12 >= 0) {
                                                j3 = 71499008037633920L;
                                            } else {
                                                int i19 = i3 + 10;
                                                long j14 = j12 ^ (bArr[i14] << 63);
                                                if (j14 >= 0) {
                                                    j = j14 ^ (-9151873028817141888L);
                                                    i12 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j13 ^ j10;
                                i12 = i18;
                            }
                            j = j12 ^ j3;
                        }
                    }
                    i12 = i14;
                }
                this.f2964h = i12;
                return j;
            }
        }
        return O();
    }

    public final void I() {
        int i3 = this.f2963f + this.g;
        this.f2963f = i3;
        int i10 = this.j + i3;
        int i11 = this.f2966k;
        if (i10 <= i11) {
            this.g = 0;
            return;
        }
        int i12 = i10 - i11;
        this.g = i12;
        this.f2963f = i3 - i12;
    }

    public final void J(int i3) {
        if (K(i3)) {
            return;
        }
        if (i3 > (Integer.MAX_VALUE - this.j) - this.f2964h) {
            a2.r.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final boolean K(int i3) {
        InputStream inputStream = this.f2961d;
        int i10 = this.f2964h;
        int i11 = i10 + i3;
        int i12 = this.f2963f;
        if (i11 <= i12) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 66);
            sb2.append("refillBuffer() called when ");
            sb2.append(i3);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        int i13 = this.j;
        if (i3 <= (Integer.MAX_VALUE - i13) - i10 && i13 + i10 + i3 <= this.f2966k) {
            byte[] bArr = this.f2962e;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                i13 = this.j + i10;
                this.j = i13;
                i12 = this.f2963f - i10;
                this.f2963f = i12;
                this.f2964h = 0;
            }
            try {
                int read = inputStream.read(bArr, i12, Math.min(bArr.length - i12, (Integer.MAX_VALUE - i13) - i12));
                if (read == 0 || read < -1 || read > bArr.length) {
                    String valueOf = String.valueOf(inputStream.getClass());
                    StringBuilder sb3 = new StringBuilder(String.valueOf(read).length() + valueOf.length() + 39 + 41);
                    sb3.append(valueOf);
                    sb3.append("#read(byte[]) returned invalid result: ");
                    sb3.append(read);
                    sb3.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb3.toString());
                }
                if (read > 0) {
                    this.f2963f += read;
                    I();
                    if (this.f2963f >= i3 || K(i3)) {
                        return true;
                    }
                }
            } catch (v1 e2) {
                e2.f2862d = true;
                throw e2;
            }
        }
        return false;
    }

    public final byte[] L(int i3) {
        byte[] M = M(i3);
        if (M != null) {
            return M;
        }
        int i10 = this.f2964h;
        int i11 = this.f2963f;
        int i12 = i11 - i10;
        this.j += i11;
        this.f2964h = 0;
        this.f2963f = 0;
        ArrayList N = N(i3 - i12);
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f2962e, i10, bArr, 0, i12);
        int size = N.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = N.get(i13);
            i13++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i12, length);
            i12 += length;
        }
        return bArr;
    }

    public final byte[] M(int i3) {
        if (i3 == 0) {
            return r1.f2724a;
        }
        int i10 = this.j;
        int i11 = this.f2964h;
        int i12 = i10 + i11 + i3;
        if ((-2147483647) + i12 > 0) {
            a2.r.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i13 = this.f2966k;
        if (i12 > i13) {
            g((i13 - i10) - i11);
            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i14 = this.f2963f - i11;
        int i15 = i3 - i14;
        InputStream inputStream = this.f2961d;
        if (i15 >= 4096) {
            try {
                if (i15 > inputStream.available()) {
                    return null;
                }
            } catch (v1 e2) {
                e2.f2862d = true;
                throw e2;
            }
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f2962e, this.f2964h, bArr, 0, i14);
        this.j += this.f2963f;
        this.f2964h = 0;
        this.f2963f = 0;
        while (i14 < i3) {
            try {
                int read = inputStream.read(bArr, i14, i3 - i14);
                if (read == -1) {
                    a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.j += read;
                i14 += read;
            } catch (v1 e9) {
                e9.f2862d = true;
                throw e9;
            }
        }
        return bArr;
    }

    public final ArrayList N(int i3) {
        ArrayList arrayList = new ArrayList();
        while (i3 > 0) {
            int min = Math.min(i3, 4096);
            byte[] bArr = new byte[min];
            int i10 = 0;
            while (i10 < min) {
                try {
                    int read = this.f2961d.read(bArr, i10, min - i10);
                    if (read == -1) {
                        a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.j += read;
                    i10 += read;
                } catch (v1 e2) {
                    e2.f2862d = true;
                    throw e2;
                }
            }
            i3 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final long O() {
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            if (this.f2964h == this.f2963f) {
                J(1);
            }
            int i10 = this.f2964h;
            this.f2964h = i10 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i3;
            if ((this.f2962e[i10] & 128) == 0) {
                return j;
            }
        }
        a2.r.o("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int P() {
        int i3 = this.f2964h;
        if (this.f2963f - i3 < 4) {
            J(4);
            i3 = this.f2964h;
        }
        this.f2964h = i3 + 4;
        byte[] bArr = this.f2962e;
        int i10 = bArr[i3] & 255;
        int i11 = bArr[i3 + 1] & 255;
        int i12 = bArr[i3 + 2] & 255;
        return ((bArr[i3 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final long Q() {
        int i3 = this.f2964h;
        if (this.f2963f - i3 < 8) {
            J(8);
            i3 = this.f2964h;
        }
        this.f2964h = i3 + 8;
        byte[] bArr = this.f2962e;
        long j = bArr[i3];
        long j3 = bArr[i3 + 2];
        long j10 = bArr[i3 + 3];
        return ((bArr[i3 + 6] & 255) << 48) | (j & 255) | ((bArr[i3 + 1] & 255) << 8) | ((j3 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 7] & 255) << 56);
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int a(int i3) {
        if (i3 < 0) {
            a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i10 = this.j + this.f2964h + i3;
        if (i10 < 0) {
            a2.r.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i11 = this.f2966k;
        if (i10 > i11) {
            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f2966k = i10;
        I();
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final void b(int i3) {
        this.f2966k = i3;
        I();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int c() {
        int i3 = this.f2966k;
        if (i3 == Integer.MAX_VALUE) {
            return -1;
        }
        return i3 - (this.j + this.f2964h);
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final boolean d() {
        return this.f2964h == this.f2963f && !K(1);
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int e() {
        return this.j + this.f2964h;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int f(byte[] bArr, int i3, int i10) {
        if ((bArr.length - i3) - i10 < 0 || (i3 | i10) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f2963f;
        int i12 = this.f2964h;
        int i13 = i11 - i12;
        if (i13 > 0) {
            int min = Math.min(i10, i13);
            System.arraycopy(this.f2962e, this.f2964h, bArr, i3, min);
            this.f2964h += min;
            return min;
        }
        int min2 = Math.min(i10, (this.f2966k - this.j) - i12);
        if (min2 <= 0) {
            return -1;
        }
        try {
            int read = this.f2961d.read(bArr, i3, min2);
            if (read != -1) {
                this.j += read;
            }
            return read;
        } catch (v1 e2) {
            e2.f2862d = true;
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final void g(int i3) {
        InputStream inputStream = this.f2961d;
        int i10 = this.f2963f;
        int i11 = this.f2964h;
        int i12 = i10 - i11;
        if (i3 <= i12 && i3 >= 0) {
            this.f2964h = i11 + i3;
            return;
        }
        if (i3 < 0) {
            a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i13 = this.j;
        int i14 = i13 + i11;
        int i15 = this.f2966k;
        if (i14 + i3 > i15) {
            g((i15 - i13) - i11);
            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.j = i14;
        this.f2963f = 0;
        this.f2964h = 0;
        while (i12 < i3) {
            long j = i3 - i12;
            try {
                try {
                    long skip = inputStream.skip(j);
                    if (skip < 0 || skip > j) {
                        String valueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 31 + String.valueOf(skip).length() + 41);
                        sb2.append(valueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(skip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i12 += (int) skip;
                    }
                } catch (v1 e2) {
                    e2.f2862d = true;
                    throw e2;
                }
            } catch (Throwable th) {
                this.j += i12;
                I();
                throw th;
            }
        }
        this.j += i12;
        I();
        if (i12 >= i3) {
            return;
        }
        int i16 = this.f2963f;
        int i17 = i16 - this.f2964h;
        this.f2964h = i16;
        J(1);
        while (true) {
            int i18 = i3 - i17;
            int i19 = this.f2963f;
            if (i18 <= i19) {
                this.f2964h = i18;
                return;
            } else {
                i17 += i19;
                this.f2964h = i19;
                J(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int l() {
        if (d()) {
            this.f2965i = 0;
            return 0;
        }
        int G = G();
        this.f2965i = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        a2.r.o("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final void m(int i3) {
        if (this.f2965i == i3) {
            return;
        }
        a2.r.o("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final boolean n(int i3) {
        int i10 = i3 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                g(8);
                return true;
            }
            if (i10 == 2) {
                g(G());
                return true;
            }
            if (i10 == 3) {
                i();
                m(((i3 >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                if (this.f3000b == 0) {
                    m(0);
                }
                return false;
            }
            if (i10 == 5) {
                g(4);
                return true;
            }
            a2.r.m();
            return false;
        }
        int i12 = this.f2963f - this.f2964h;
        byte[] bArr = this.f2962e;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f2964h;
                this.f2964h = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            a2.r.o("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i11 < 10) {
            if (this.f2964h == this.f2963f) {
                J(1);
            }
            int i14 = this.f2964h;
            this.f2964h = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        a2.r.o("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final double o() {
        return Double.longBitsToDouble(Q());
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final float p() {
        return Float.intBitsToFloat(P());
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final long q() {
        return H();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final long r() {
        return H();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int s() {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final long t() {
        return Q();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int u() {
        return P();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final boolean v() {
        return H() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final String w() {
        int G = G();
        byte[] bArr = this.f2962e;
        if (G > 0) {
            int i3 = this.f2963f;
            int i10 = this.f2964h;
            if (G <= i3 - i10) {
                String str = new String(bArr, i10, G, StandardCharsets.UTF_8);
                this.f2964h += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (G > this.f2963f) {
            return new String(L(G), StandardCharsets.UTF_8);
        }
        J(G);
        String str2 = new String(bArr, this.f2964h, G, StandardCharsets.UTF_8);
        this.f2964h += G;
        return str2;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final String x() {
        int G = G();
        int i3 = this.f2964h;
        int i10 = this.f2963f;
        int i11 = i10 - i3;
        byte[] bArr = this.f2962e;
        if (G <= i11 && G > 0) {
            this.f2964h = i3 + G;
        } else {
            if (G == 0) {
                return "";
            }
            if (G < 0) {
                a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i3 = 0;
            if (G <= i10) {
                J(G);
                this.f2964h = G;
            } else {
                bArr = L(G);
            }
        }
        return b3.d(bArr, i3, G);
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final u0 y() {
        int G = G();
        int i3 = this.f2963f;
        int i10 = this.f2964h;
        int i11 = i3 - i10;
        byte[] bArr = this.f2962e;
        if (G <= i11 && G > 0) {
            u0 m10 = v0.m(bArr, i10, G);
            this.f2964h += G;
            return m10;
        }
        if (G == 0) {
            return v0.f2860e;
        }
        if (G < 0) {
            a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] M = M(G);
        if (M != null) {
            return v0.m(M, 0, M.length);
        }
        int i12 = this.f2964h;
        int i13 = this.f2963f;
        int i14 = i13 - i12;
        this.j += i13;
        this.f2964h = 0;
        this.f2963f = 0;
        ArrayList N = N(G - i14);
        byte[] bArr2 = new byte[G];
        System.arraycopy(bArr, i12, bArr2, 0, i14);
        int size = N.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = N.get(i15);
            i15++;
            byte[] bArr3 = (byte[]) obj;
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i14, length);
            i14 += length;
        }
        try {
            u0 u0Var = v0.f2860e;
            return G == 0 ? v0.f2860e : new u0(bArr2);
        } catch (v1 e2) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final byte[] z() {
        int G = G();
        int i3 = this.f2963f;
        int i10 = this.f2964h;
        if (G <= i3 - i10 && G > 0) {
            byte[] copyOfRange = Arrays.copyOfRange(this.f2962e, i10, i10 + G);
            this.f2964h += G;
            return copyOfRange;
        }
        if (G >= 0) {
            return L(G);
        }
        a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }
}
