package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class UK extends S7.b {

    /* renamed from: B, reason: collision with root package name */
    public int f27965B;

    /* renamed from: w, reason: collision with root package name */
    public final InputStream f27968w;

    /* renamed from: z, reason: collision with root package name */
    public int f27971z;

    /* renamed from: D, reason: collision with root package name */
    public int f27967D = Integer.MAX_VALUE;

    /* renamed from: x, reason: collision with root package name */
    public final byte[] f27969x = new byte[4096];

    /* renamed from: y, reason: collision with root package name */
    public int f27970y = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f27964A = 0;

    /* renamed from: C, reason: collision with root package name */
    public int f27966C = 0;

    public /* synthetic */ UK(InputStream inputStream) {
        this.f27968w = inputStream;
    }

    @Override // S7.b
    public final int A() {
        return O();
    }

    @Override // S7.b
    public final long B() {
        return P();
    }

    @Override // S7.b
    public final int C() {
        return S7.b.h(L());
    }

    @Override // S7.b
    public final long D() {
        return S7.b.i(M());
    }

    public final void E(int i) {
        InputStream inputStream = this.f27968w;
        int i4 = this.f27970y;
        int i9 = this.f27964A;
        int i10 = i4 - i9;
        if (i <= i10 && i >= 0) {
            this.f27964A = i9 + i;
            return;
        }
        if (i < 0) {
            throw new C3845rL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f27966C;
        int i12 = i11 + i9;
        int i13 = this.f27967D;
        if (i12 + i > i13) {
            E((i13 - i11) - i9);
            throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f27966C = i12;
        this.f27970y = 0;
        this.f27964A = 0;
        while (i10 < i) {
            long j9 = i - i10;
            try {
                try {
                    long skip = inputStream.skip(j9);
                    if (skip < 0 || skip > j9) {
                        String valueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb = new StringBuilder(valueOf.length() + 31 + String.valueOf(skip).length() + 41);
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
                } catch (C3845rL e6) {
                    e6.f34009n = true;
                    throw e6;
                }
            } catch (Throwable th) {
                this.f27966C += i10;
                F();
                throw th;
            }
        }
        this.f27966C += i10;
        F();
        if (i10 >= i) {
            return;
        }
        int i14 = this.f27970y;
        int i15 = i14 - this.f27964A;
        this.f27964A = i14;
        G(1);
        while (true) {
            int i16 = i - i15;
            int i17 = this.f27970y;
            if (i16 <= i17) {
                this.f27964A = i16;
                return;
            } else {
                i15 += i17;
                this.f27964A = i17;
                G(1);
            }
        }
    }

    public final void F() {
        int i = this.f27970y + this.f27971z;
        this.f27970y = i;
        int i4 = this.f27966C + i;
        int i9 = this.f27967D;
        if (i4 <= i9) {
            this.f27971z = 0;
            return;
        }
        int i10 = i4 - i9;
        this.f27971z = i10;
        this.f27970y = i - i10;
    }

    public final void G(int i) {
        if (H(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f27966C) - this.f27964A) {
            throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C3845rL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    public final boolean H(int i) {
        InputStream inputStream = this.f27968w;
        int i4 = this.f27964A;
        int i9 = i4 + i;
        int i10 = this.f27970y;
        if (i9 <= i10) {
            throw new IllegalStateException(AbstractC5051n.d(i, "refillBuffer() called when ", " bytes were already available in buffer", new StringBuilder(String.valueOf(i).length() + 66)));
        }
        int i11 = this.f27966C;
        if (i > (Integer.MAX_VALUE - i11) - i4 || i11 + i4 + i > this.f27967D) {
            return false;
        }
        byte[] bArr = this.f27969x;
        if (i4 > 0) {
            if (i10 > i4) {
                System.arraycopy(bArr, i4, bArr, 0, i10 - i4);
            }
            i11 = this.f27966C + i4;
            this.f27966C = i11;
            i10 = this.f27970y - i4;
            this.f27970y = i10;
            this.f27964A = 0;
        }
        try {
            int read = inputStream.read(bArr, i10, Math.min(4096 - i10, (Integer.MAX_VALUE - i11) - i10));
            if (read != 0 && read >= -1 && read <= 4096) {
                if (read <= 0) {
                    return false;
                }
                this.f27970y += read;
                F();
                return this.f27970y >= i || H(i);
            }
            String valueOf = String.valueOf(inputStream.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(read).length() + valueOf.length() + 39 + 41);
            sb.append(valueOf);
            sb.append("#read(byte[]) returned invalid result: ");
            sb.append(read);
            sb.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb.toString());
        } catch (C3845rL e6) {
            e6.f34009n = true;
            throw e6;
        }
    }

    public final byte[] I(int i) {
        byte[] J = J(i);
        if (J != null) {
            return J;
        }
        int i4 = this.f27964A;
        int i9 = this.f27970y;
        int i10 = i9 - i4;
        this.f27966C += i9;
        this.f27964A = 0;
        this.f27970y = 0;
        ArrayList K8 = K(i - i10);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f27969x, i4, bArr, 0, i10);
        Iterator it = K8.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i10, length);
            i10 += length;
        }
        return bArr;
    }

    public final byte[] J(int i) {
        if (i == 0) {
            return AbstractC3684oL.f33136a;
        }
        int i4 = this.f27966C;
        int i9 = this.f27964A;
        int i10 = i4 + i9 + i;
        if ((-2147483647) + i10 > 0) {
            throw new C3845rL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i11 = this.f27967D;
        if (i10 > i11) {
            E((i11 - i4) - i9);
            throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = this.f27970y - i9;
        int i13 = i - i12;
        InputStream inputStream = this.f27968w;
        if (i13 >= 4096) {
            try {
                if (i13 > inputStream.available()) {
                    return null;
                }
            } catch (C3845rL e6) {
                e6.f34009n = true;
                throw e6;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f27969x, this.f27964A, bArr, 0, i12);
        this.f27966C += this.f27970y;
        this.f27964A = 0;
        this.f27970y = 0;
        while (i12 < i) {
            try {
                int read = inputStream.read(bArr, i12, i - i12);
                if (read == -1) {
                    throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f27966C += read;
                i12 += read;
            } catch (C3845rL e9) {
                e9.f34009n = true;
                throw e9;
            }
        }
        return bArr;
    }

    public final ArrayList K(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i4 = 0;
            while (i4 < min) {
                try {
                    int read = this.f27968w.read(bArr, i4, min - i4);
                    if (read == -1) {
                        throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    this.f27966C += read;
                    i4 += read;
                } catch (C3845rL e6) {
                    e6.f34009n = true;
                    throw e6;
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int L() {
        int i;
        int i4 = this.f27964A;
        int i9 = this.f27970y;
        if (i9 != i4) {
            int i10 = i4 + 1;
            byte[] bArr = this.f27969x;
            byte b9 = bArr[i4];
            if (b9 >= 0) {
                this.f27964A = i10;
                return b9;
            }
            if (i9 - i10 >= 9) {
                int i11 = i4 + 2;
                int i12 = (bArr[i10] << 7) ^ b9;
                if (i12 < 0) {
                    i = i12 ^ (-128);
                } else {
                    int i13 = i4 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i = i14 ^ 16256;
                    } else {
                        int i15 = i4 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i = (-2080896) ^ i16;
                        } else {
                            i13 = i4 + 5;
                            byte b10 = bArr[i15];
                            int i17 = (i16 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i15 = i4 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i4 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i4 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i4 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i4 + 10;
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
                this.f27964A = i11;
                return i;
            }
        }
        return (int) N();
    }

    public final long M() {
        long j9;
        long j10;
        long j11;
        int i = this.f27964A;
        int i4 = this.f27970y;
        if (i4 != i) {
            int i9 = i + 1;
            byte[] bArr = this.f27969x;
            byte b9 = bArr[i];
            if (b9 >= 0) {
                this.f27964A = i9;
                return b9;
            }
            if (i4 - i9 >= 9) {
                int i10 = i + 2;
                int i11 = (bArr[i9] << 7) ^ b9;
                if (i11 < 0) {
                    j9 = i11 ^ (-128);
                } else {
                    int i12 = i + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j9 = i13 ^ 16256;
                    } else {
                        int i14 = i + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            long j12 = (-2080896) ^ i15;
                            i10 = i14;
                            j9 = j12;
                        } else {
                            i12 = i + 5;
                            long j13 = i15 ^ (bArr[i14] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                int i16 = i + 6;
                                long j14 = j13 ^ (bArr[i12] << 35);
                                if (j14 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i12 = i + 7;
                                    j13 = j14 ^ (bArr[i16] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i16 = i + 8;
                                        j14 = j13 ^ (bArr[i12] << 49);
                                        if (j14 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i12 = i + 9;
                                            j13 = j14 ^ (bArr[i16] << 56);
                                            if (j13 >= 0) {
                                                j10 = 71499008037633920L;
                                            } else {
                                                int i17 = i + 10;
                                                long j15 = j13 ^ (bArr[i12] << 63);
                                                if (j15 >= 0) {
                                                    j9 = j15 ^ (-9151873028817141888L);
                                                    i10 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                j9 = j14 ^ j11;
                                i10 = i16;
                            }
                            j9 = j13 ^ j10;
                        }
                    }
                    i10 = i12;
                }
                this.f27964A = i10;
                return j9;
            }
        }
        return N();
    }

    public final long N() {
        long j9 = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f27964A == this.f27970y) {
                G(1);
            }
            int i4 = this.f27964A;
            this.f27964A = i4 + 1;
            j9 |= (r3 & Byte.MAX_VALUE) << i;
            if ((this.f27969x[i4] & com.anythink.core.common.s.a.c.f16474a) == 0) {
                return j9;
            }
        }
        throw new C3845rL("CodedInputStream encountered a malformed varint.");
    }

    public final int O() {
        int i = this.f27964A;
        if (this.f27970y - i < 4) {
            G(4);
            i = this.f27964A;
        }
        this.f27964A = i + 4;
        byte[] bArr = this.f27969x;
        int i4 = bArr[i] & 255;
        int i9 = bArr[i + 1] & 255;
        int i10 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i9 << 8) | i4 | (i10 << 16);
    }

    public final long P() {
        int i = this.f27964A;
        if (this.f27970y - i < 8) {
            G(8);
            i = this.f27964A;
        }
        this.f27964A = i + 8;
        byte[] bArr = this.f27969x;
        long j9 = bArr[i];
        long j10 = bArr[i + 2];
        long j11 = bArr[i + 3];
        return ((bArr[i + 6] & 255) << 48) | (j9 & 255) | ((bArr[i + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 7] & 255) << 56);
    }

    @Override // S7.b
    public final int b(int i) {
        if (i < 0) {
            throw new C3845rL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i4 = this.f27966C + this.f27964A + i;
        if (i4 < 0) {
            throw new C3845rL("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i9 = this.f27967D;
        if (i4 > i9) {
            throw new C3845rL("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f27967D = i4;
        F();
        return i9;
    }

    @Override // S7.b
    public final void c(int i) {
        this.f27967D = i;
        F();
    }

    @Override // S7.b
    public final boolean d() {
        return this.f27964A == this.f27970y && !H(1);
    }

    @Override // S7.b
    public final int e() {
        return this.f27966C + this.f27964A;
    }

    @Override // S7.b
    public final int k() {
        if (d()) {
            this.f27965B = 0;
            return 0;
        }
        int L8 = L();
        this.f27965B = L8;
        if ((L8 >>> 3) != 0) {
            return L8;
        }
        throw new C3845rL("Protocol message contained an invalid tag (zero).");
    }

    @Override // S7.b
    public final void l(int i) {
        if (this.f27965B != i) {
            throw new C3845rL("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // S7.b
    public final boolean m(int i) {
        int i4 = i & 7;
        int i9 = 0;
        if (i4 != 0) {
            if (i4 == 1) {
                E(8);
                return true;
            }
            if (i4 == 2) {
                E(L());
                return true;
            }
            if (i4 == 3) {
                g();
                l(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i4 == 4) {
                if (this.f2981u == 0) {
                    l(0);
                }
                return false;
            }
            if (i4 != 5) {
                throw new C3792qL();
            }
            E(4);
            return true;
        }
        int i10 = this.f27970y - this.f27964A;
        byte[] bArr = this.f27969x;
        if (i10 >= 10) {
            while (i9 < 10) {
                int i11 = this.f27964A;
                this.f27964A = i11 + 1;
                if (bArr[i11] < 0) {
                    i9++;
                }
            }
            throw new C3845rL("CodedInputStream encountered a malformed varint.");
        }
        while (i9 < 10) {
            if (this.f27964A == this.f27970y) {
                G(1);
            }
            int i12 = this.f27964A;
            this.f27964A = i12 + 1;
            if (bArr[i12] < 0) {
                i9++;
            }
        }
        throw new C3845rL("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // S7.b
    public final double n() {
        return Double.longBitsToDouble(P());
    }

    @Override // S7.b
    public final float o() {
        return Float.intBitsToFloat(O());
    }

    @Override // S7.b
    public final long p() {
        return M();
    }

    @Override // S7.b
    public final long q() {
        return M();
    }

    @Override // S7.b
    public final int r() {
        return L();
    }

    @Override // S7.b
    public final long s() {
        return P();
    }

    @Override // S7.b
    public final int t() {
        return O();
    }

    @Override // S7.b
    public final boolean u() {
        return M() != 0;
    }

    @Override // S7.b
    public final String v() {
        int L8 = L();
        byte[] bArr = this.f27969x;
        if (L8 > 0) {
            int i = this.f27970y;
            int i4 = this.f27964A;
            if (L8 <= i - i4) {
                String str = new String(bArr, i4, L8, StandardCharsets.UTF_8);
                this.f27964A += L8;
                return str;
            }
        }
        if (L8 == 0) {
            return "";
        }
        if (L8 < 0) {
            throw new C3845rL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (L8 > this.f27970y) {
            return new String(I(L8), StandardCharsets.UTF_8);
        }
        G(L8);
        String str2 = new String(bArr, this.f27964A, L8, StandardCharsets.UTF_8);
        this.f27964A += L8;
        return str2;
    }

    @Override // S7.b
    public final String w() {
        int L8 = L();
        int i = this.f27964A;
        int i4 = this.f27970y;
        int i9 = i4 - i;
        byte[] bArr = this.f27969x;
        if (L8 <= i9 && L8 > 0) {
            this.f27964A = i + L8;
        } else {
            if (L8 == 0) {
                return "";
            }
            if (L8 < 0) {
                throw new C3845rL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i = 0;
            if (L8 <= i4) {
                G(L8);
                this.f27964A = L8;
            } else {
                bArr = I(L8);
            }
        }
        return AbstractC3145eM.d(bArr, i, L8);
    }

    @Override // S7.b
    public final QK x() {
        int L8 = L();
        int i = this.f27970y;
        int i4 = this.f27964A;
        int i9 = i - i4;
        byte[] bArr = this.f27969x;
        if (L8 <= i9 && L8 > 0) {
            QK t9 = SK.t(bArr, i4, L8);
            this.f27964A += L8;
            return t9;
        }
        if (L8 == 0) {
            return SK.f27529u;
        }
        if (L8 < 0) {
            throw new C3845rL("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] J = J(L8);
        if (J != null) {
            return SK.t(J, 0, J.length);
        }
        int i10 = this.f27964A;
        int i11 = this.f27970y;
        int i12 = i11 - i10;
        this.f27966C += i11;
        this.f27964A = 0;
        this.f27970y = 0;
        ArrayList K8 = K(L8 - i12);
        byte[] bArr2 = new byte[L8];
        System.arraycopy(bArr, i10, bArr2, 0, i12);
        Iterator it = K8.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i12, length);
            i12 += length;
        }
        QK qk = SK.f27529u;
        try {
            return L8 == 0 ? SK.f27529u : new QK(bArr2);
        } catch (C3845rL e6) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e6);
        }
    }

    @Override // S7.b
    public final int y() {
        return L();
    }

    @Override // S7.b
    public final int z() {
        return L();
    }
}
