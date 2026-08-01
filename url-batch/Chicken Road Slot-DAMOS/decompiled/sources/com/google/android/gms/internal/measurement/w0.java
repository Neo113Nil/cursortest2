package com.google.android.gms.internal.measurement;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w0 extends y0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2909d;

    /* renamed from: f, reason: collision with root package name */
    public int f2911f;

    /* renamed from: h, reason: collision with root package name */
    public int f2912h;

    /* renamed from: i, reason: collision with root package name */
    public int f2913i = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f2910e = 0;
    public int g = 0;

    public /* synthetic */ w0(byte[] bArr) {
        this.f2909d = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int A() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int B() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int C() {
        return J();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final long D() {
        return K();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int E() {
        return y0.j(M());
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final long F() {
        return y0.k(H());
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int G() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final long H() {
        long j;
        long j3;
        long j10;
        int i3 = this.g;
        int i10 = this.f2910e;
        if (i10 != i3) {
            int i11 = i3 + 1;
            byte[] bArr = this.f2909d;
            byte b10 = bArr[i3];
            if (b10 >= 0) {
                this.g = i11;
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
                this.g = i12;
                return j;
            }
        }
        return I();
    }

    public final long I() {
        long j = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            int i10 = this.g;
            if (i10 == this.f2910e) {
                a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.g = i10 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i3;
            if ((this.f2909d[i10] & 128) == 0) {
                return j;
            }
        }
        a2.r.o("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int J() {
        int i3 = this.g;
        if (this.f2910e - i3 < 4) {
            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.g = i3 + 4;
        byte[] bArr = this.f2909d;
        int i10 = bArr[i3] & 255;
        int i11 = bArr[i3 + 1] & 255;
        int i12 = bArr[i3 + 2] & 255;
        return ((bArr[i3 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public final long K() {
        int i3 = this.g;
        if (this.f2910e - i3 < 8) {
            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.g = i3 + 8;
        byte[] bArr = this.f2909d;
        long j = bArr[i3];
        long j3 = bArr[i3 + 2];
        long j10 = bArr[i3 + 3];
        return ((bArr[i3 + 6] & 255) << 48) | (j & 255) | ((bArr[i3 + 1] & 255) << 8) | ((j3 & 255) << 16) | ((j10 & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 7] & 255) << 56);
    }

    public final byte[] L(int i3) {
        if (i3 > 0) {
            int i10 = this.f2910e;
            int i11 = this.g;
            if (i3 <= i10 - i11) {
                int i12 = i3 + i11;
                this.g = i12;
                return Arrays.copyOfRange(this.f2909d, i11, i12);
            }
        }
        if (i3 > 0) {
            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        if (i3 == 0) {
            return r1.f2724a;
        }
        a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    public final int M() {
        int i3;
        int i10 = this.g;
        int i11 = this.f2910e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f2909d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.g = i12;
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
                this.g = i13;
                return i3;
            }
        }
        return (int) I();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int a(int i3) {
        if (i3 < 0) {
            a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i10 = i3 + this.g;
        if (i10 < 0) {
            a2.r.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i11 = this.f2913i;
        if (i10 > i11) {
            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f2913i = i10;
        int i12 = this.f2910e + this.f2911f;
        this.f2910e = i12;
        if (i12 <= i10) {
            this.f2911f = 0;
            return i11;
        }
        int i13 = i12 - i10;
        this.f2911f = i13;
        this.f2910e = i12 - i13;
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final void b(int i3) {
        this.f2913i = i3;
        int i10 = this.f2910e + this.f2911f;
        this.f2910e = i10;
        if (i10 <= i3) {
            this.f2911f = 0;
            return;
        }
        int i11 = i10 - i3;
        this.f2911f = i11;
        this.f2910e = i10 - i11;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int c() {
        int i3 = this.f2913i;
        if (i3 == Integer.MAX_VALUE) {
            return -1;
        }
        return i3 - this.g;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final boolean d() {
        return this.g == this.f2910e;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int e() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int f(byte[] bArr, int i3, int i10) {
        if ((bArr.length - i3) - i10 < 0 || (i3 | i10) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == 0) {
            return 0;
        }
        int min = Math.min(i10, this.f2910e - this.g);
        if (min == 0) {
            return -1;
        }
        System.arraycopy(this.f2909d, this.g, bArr, i3, min);
        this.g += min;
        return min;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final void g(int i3) {
        if (i3 >= 0) {
            int i10 = this.f2910e;
            int i11 = this.g;
            if (i3 <= i10 - i11) {
                this.g = i11 + i3;
                return;
            }
        }
        if (i3 < 0) {
            a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int l() {
        if (d()) {
            this.f2912h = 0;
            return 0;
        }
        int M = M();
        this.f2912h = M;
        if ((M >>> 3) != 0) {
            return M;
        }
        a2.r.o("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final void m(int i3) {
        if (this.f2912h == i3) {
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
                g(M());
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
        int i12 = this.f2910e - this.g;
        byte[] bArr = this.f2909d;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.g;
                this.g = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            a2.r.o("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i11 < 10) {
            int i14 = this.g;
            if (i14 == this.f2910e) {
                a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.g = i14 + 1;
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
        return Double.longBitsToDouble(K());
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final float p() {
        return Float.intBitsToFloat(J());
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
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final long t() {
        return K();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final int u() {
        return J();
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final boolean v() {
        return H() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final String w() {
        int M = M();
        if (M > 0) {
            int i3 = this.f2910e;
            int i10 = this.g;
            if (M <= i3 - i10) {
                String str = new String(this.f2909d, i10, M, StandardCharsets.UTF_8);
                this.g += M;
                return str;
            }
        }
        if (M == 0) {
            return "";
        }
        if (M < 0) {
            a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final String x() {
        int M = M();
        if (M > 0) {
            int i3 = this.f2910e;
            int i10 = this.g;
            if (M <= i3 - i10) {
                String d10 = b3.d(this.f2909d, i10, M);
                this.g += M;
                return d10;
            }
        }
        if (M == 0) {
            return "";
        }
        if (M <= 0) {
            a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final u0 y() {
        int M = M();
        if (M > 0) {
            int i3 = this.f2910e;
            int i10 = this.g;
            if (M <= i3 - i10) {
                u0 m10 = v0.m(this.f2909d, i10, M);
                this.g += M;
                return m10;
            }
        }
        if (M == 0) {
            return v0.f2860e;
        }
        byte[] L = L(M);
        u0 u0Var = v0.f2860e;
        return L.length == 0 ? v0.f2860e : new u0(L);
    }

    @Override // com.google.android.gms.internal.measurement.y0
    public final byte[] z() {
        return L(M());
    }
}
