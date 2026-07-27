package androidx.datastore.preferences.protobuf;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214i extends R4.c {

    /* renamed from: c, reason: collision with root package name */
    public final FileInputStream f4448c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4449d;

    /* renamed from: e, reason: collision with root package name */
    public int f4450e;

    /* renamed from: f, reason: collision with root package name */
    public int f4451f;

    /* renamed from: g, reason: collision with root package name */
    public int f4452g;

    /* renamed from: h, reason: collision with root package name */
    public int f4453h;

    /* renamed from: i, reason: collision with root package name */
    public int f4454i;

    /* renamed from: j, reason: collision with root package name */
    public int f4455j = Integer.MAX_VALUE;

    public C0214i(FileInputStream fileInputStream) {
        Charset charset = AbstractC0228x.f4508a;
        this.f4448c = fileInputStream;
        this.f4449d = new byte[Base64Utils.IO_BUFFER_SIZE];
        this.f4450e = 0;
        this.f4452g = 0;
        this.f4454i = 0;
    }

    public final byte[] A(int i2) {
        if (i2 == 0) {
            return AbstractC0228x.f4509b;
        }
        if (i2 < 0) {
            throw C0230z.d();
        }
        int i3 = this.f4454i;
        int i6 = this.f4452g;
        int i7 = i3 + i6 + i2;
        if (i7 - Integer.MAX_VALUE > 0) {
            throw new C0230z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i8 = this.f4455j;
        if (i7 > i8) {
            J((i8 - i3) - i6);
            throw C0230z.e();
        }
        int i9 = this.f4450e - i6;
        int i10 = i2 - i9;
        FileInputStream fileInputStream = this.f4448c;
        if (i10 >= 4096) {
            try {
                if (i10 > fileInputStream.available()) {
                    return null;
                }
            } catch (C0230z e3) {
                e3.f4510a = true;
                throw e3;
            }
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f4449d, this.f4452g, bArr, 0, i9);
        this.f4454i += this.f4450e;
        this.f4452g = 0;
        this.f4450e = 0;
        while (i9 < i2) {
            try {
                int read = fileInputStream.read(bArr, i9, i2 - i9);
                if (read == -1) {
                    throw C0230z.e();
                }
                this.f4454i += read;
                i9 += read;
            } catch (C0230z e6) {
                e6.f4510a = true;
                throw e6;
            }
        }
        return bArr;
    }

    public final ArrayList B(int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int min = Math.min(i2, Base64Utils.IO_BUFFER_SIZE);
            byte[] bArr = new byte[min];
            int i3 = 0;
            while (i3 < min) {
                int read = this.f4448c.read(bArr, i3, min - i3);
                if (read == -1) {
                    throw C0230z.e();
                }
                this.f4454i += read;
                i3 += read;
            }
            i2 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int i2 = this.f4452g;
        if (this.f4450e - i2 < 4) {
            I(4);
            i2 = this.f4452g;
        }
        this.f4452g = i2 + 4;
        byte[] bArr = this.f4449d;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final long D() {
        int i2 = this.f4452g;
        if (this.f4450e - i2 < 8) {
            I(8);
            i2 = this.f4452g;
        }
        this.f4452g = i2 + 8;
        byte[] bArr = this.f4449d;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public final int E() {
        int i2;
        int i3 = this.f4452g;
        int i6 = this.f4450e;
        if (i6 != i3) {
            int i7 = i3 + 1;
            byte[] bArr = this.f4449d;
            byte b6 = bArr[i3];
            if (b6 >= 0) {
                this.f4452g = i7;
                return b6;
            }
            if (i6 - i7 >= 9) {
                int i8 = i3 + 2;
                int i9 = (bArr[i7] << 7) ^ b6;
                if (i9 < 0) {
                    i2 = i9 ^ (-128);
                } else {
                    int i10 = i3 + 3;
                    int i11 = (bArr[i8] << 14) ^ i9;
                    if (i11 >= 0) {
                        i2 = i11 ^ 16256;
                    } else {
                        int i12 = i3 + 4;
                        int i13 = i11 ^ (bArr[i10] << 21);
                        if (i13 < 0) {
                            i2 = (-2080896) ^ i13;
                        } else {
                            i10 = i3 + 5;
                            byte b7 = bArr[i12];
                            int i14 = (i13 ^ (b7 << 28)) ^ 266354560;
                            if (b7 < 0) {
                                i12 = i3 + 6;
                                if (bArr[i10] < 0) {
                                    i10 = i3 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i3 + 8;
                                        if (bArr[i10] < 0) {
                                            i10 = i3 + 9;
                                            if (bArr[i12] < 0) {
                                                int i15 = i3 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i8 = i15;
                                                    i2 = i14;
                                                }
                                            }
                                        }
                                    }
                                }
                                i2 = i14;
                            }
                            i2 = i14;
                        }
                        i8 = i12;
                    }
                    i8 = i10;
                }
                this.f4452g = i8;
                return i2;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j2;
        long j6;
        long j7;
        long j8;
        int i2 = this.f4452g;
        int i3 = this.f4450e;
        if (i3 != i2) {
            int i6 = i2 + 1;
            byte[] bArr = this.f4449d;
            byte b6 = bArr[i2];
            if (b6 >= 0) {
                this.f4452g = i6;
                return b6;
            }
            if (i3 - i6 >= 9) {
                int i7 = i2 + 2;
                int i8 = (bArr[i6] << 7) ^ b6;
                if (i8 < 0) {
                    j2 = i8 ^ (-128);
                } else {
                    int i9 = i2 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        j2 = i10 ^ 16256;
                        i7 = i9;
                    } else {
                        int i11 = i2 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            j8 = (-2080896) ^ i12;
                        } else {
                            long j9 = i12;
                            i7 = i2 + 5;
                            long j10 = j9 ^ (bArr[i11] << 28);
                            if (j10 >= 0) {
                                j7 = 266354560;
                            } else {
                                i11 = i2 + 6;
                                long j11 = j10 ^ (bArr[i7] << 35);
                                if (j11 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    i7 = i2 + 7;
                                    j10 = j11 ^ (bArr[i11] << 42);
                                    if (j10 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i11 = i2 + 8;
                                        j11 = j10 ^ (bArr[i7] << 49);
                                        if (j11 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            i7 = i2 + 9;
                                            long j12 = (j11 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                int i13 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i7 = i13;
                                                }
                                            }
                                            j2 = j12;
                                        }
                                    }
                                }
                                j8 = j6 ^ j11;
                            }
                            j2 = j7 ^ j10;
                        }
                        i7 = i11;
                        j2 = j8;
                    }
                }
                this.f4452g = i7;
                return j2;
            }
        }
        return G();
    }

    public final long G() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            if (this.f4452g == this.f4450e) {
                I(1);
            }
            int i3 = this.f4452g;
            this.f4452g = i3 + 1;
            j2 |= (r3 & Byte.MAX_VALUE) << i2;
            if ((this.f4449d[i3] & 128) == 0) {
                return j2;
            }
        }
        throw C0230z.c();
    }

    public final void H() {
        int i2 = this.f4450e + this.f4451f;
        this.f4450e = i2;
        int i3 = this.f4454i + i2;
        int i6 = this.f4455j;
        if (i3 <= i6) {
            this.f4451f = 0;
            return;
        }
        int i7 = i3 - i6;
        this.f4451f = i7;
        this.f4450e = i2 - i7;
    }

    public final void I(int i2) {
        if (K(i2)) {
            return;
        }
        if (i2 <= (Integer.MAX_VALUE - this.f4454i) - this.f4452g) {
            throw C0230z.e();
        }
        throw new C0230z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void J(int i2) {
        int i3 = this.f4450e;
        int i6 = this.f4452g;
        int i7 = i3 - i6;
        if (i2 <= i7 && i2 >= 0) {
            this.f4452g = i6 + i2;
            return;
        }
        FileInputStream fileInputStream = this.f4448c;
        if (i2 < 0) {
            throw C0230z.d();
        }
        int i8 = this.f4454i;
        int i9 = i8 + i6;
        int i10 = i9 + i2;
        int i11 = this.f4455j;
        if (i10 > i11) {
            J((i11 - i8) - i6);
            throw C0230z.e();
        }
        this.f4454i = i9;
        this.f4450e = 0;
        this.f4452g = 0;
        while (i7 < i2) {
            long j2 = i2 - i7;
            try {
                try {
                    long skip = fileInputStream.skip(j2);
                    if (skip < 0 || skip > j2) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i7 += (int) skip;
                    }
                } catch (C0230z e3) {
                    e3.f4510a = true;
                    throw e3;
                }
            } catch (Throwable th) {
                this.f4454i += i7;
                H();
                throw th;
            }
        }
        this.f4454i += i7;
        H();
        if (i7 >= i2) {
            return;
        }
        int i12 = this.f4450e;
        int i13 = i12 - this.f4452g;
        this.f4452g = i12;
        I(1);
        while (true) {
            int i14 = i2 - i13;
            int i15 = this.f4450e;
            if (i14 <= i15) {
                this.f4452g = i14;
                return;
            } else {
                i13 += i15;
                this.f4452g = i15;
                I(1);
            }
        }
    }

    public final boolean K(int i2) {
        int i3 = this.f4452g;
        int i6 = i3 + i2;
        int i7 = this.f4450e;
        if (i6 <= i7) {
            throw new IllegalStateException(B0.o.g(i2, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i8 = this.f4454i;
        if (i2 > (Integer.MAX_VALUE - i8) - i3 || i8 + i3 + i2 > this.f4455j) {
            return false;
        }
        byte[] bArr = this.f4449d;
        if (i3 > 0) {
            if (i7 > i3) {
                System.arraycopy(bArr, i3, bArr, 0, i7 - i3);
            }
            this.f4454i += i3;
            this.f4450e -= i3;
            this.f4452g = 0;
        }
        int i9 = this.f4450e;
        int min = Math.min(bArr.length - i9, (Integer.MAX_VALUE - this.f4454i) - i9);
        FileInputStream fileInputStream = this.f4448c;
        try {
            int read = fileInputStream.read(bArr, i9, min);
            if (read == 0 || read < -1 || read > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f4450e += read;
            H();
            if (this.f4450e >= i2) {
                return true;
            }
            return K(i2);
        } catch (C0230z e3) {
            e3.f4510a = true;
            throw e3;
        }
    }

    @Override // R4.c
    public final void a(int i2) {
        if (this.f4453h != i2) {
            throw new C0230z("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // R4.c
    public final int b() {
        return this.f4454i + this.f4452g;
    }

    @Override // R4.c
    public final boolean c() {
        return this.f4452g == this.f4450e && !K(1);
    }

    @Override // R4.c
    public final void d(int i2) {
        this.f4455j = i2;
        H();
    }

    @Override // R4.c
    public final int e(int i2) {
        if (i2 < 0) {
            throw C0230z.d();
        }
        int i3 = this.f4454i + this.f4452g + i2;
        if (i3 < 0) {
            throw new C0230z("Failed to parse the message.");
        }
        int i6 = this.f4455j;
        if (i3 > i6) {
            throw C0230z.e();
        }
        this.f4455j = i3;
        H();
        return i6;
    }

    @Override // R4.c
    public final boolean f() {
        return F() != 0;
    }

    @Override // R4.c
    public final C0212g g() {
        int E5 = E();
        int i2 = this.f4450e;
        int i3 = this.f4452g;
        int i6 = i2 - i3;
        byte[] bArr = this.f4449d;
        if (E5 <= i6 && E5 > 0) {
            C0212g d6 = C0212g.d(bArr, i3, E5);
            this.f4452g += E5;
            return d6;
        }
        if (E5 == 0) {
            return C0212g.f4436c;
        }
        if (E5 < 0) {
            throw C0230z.d();
        }
        byte[] A5 = A(E5);
        if (A5 != null) {
            return C0212g.d(A5, 0, A5.length);
        }
        int i7 = this.f4452g;
        int i8 = this.f4450e;
        int i9 = i8 - i7;
        this.f4454i += i8;
        this.f4452g = 0;
        this.f4450e = 0;
        ArrayList B5 = B(E5 - i9);
        byte[] bArr2 = new byte[E5];
        System.arraycopy(bArr, i7, bArr2, 0, i9);
        Iterator it = B5.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, i9, bArr3.length);
            i9 += bArr3.length;
        }
        C0212g c0212g = C0212g.f4436c;
        return new C0212g(bArr2);
    }

    @Override // R4.c
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // R4.c
    public final int i() {
        return E();
    }

    @Override // R4.c
    public final int j() {
        return C();
    }

    @Override // R4.c
    public final long k() {
        return D();
    }

    @Override // R4.c
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // R4.c
    public final int m() {
        return E();
    }

    @Override // R4.c
    public final long n() {
        return F();
    }

    @Override // R4.c
    public final int o() {
        return C();
    }

    @Override // R4.c
    public final long p() {
        return D();
    }

    @Override // R4.c
    public final int q() {
        int E5 = E();
        return (-(E5 & 1)) ^ (E5 >>> 1);
    }

    @Override // R4.c
    public final long r() {
        long F2 = F();
        return (-(F2 & 1)) ^ (F2 >>> 1);
    }

    @Override // R4.c
    public final String s() {
        int E5 = E();
        byte[] bArr = this.f4449d;
        if (E5 > 0) {
            int i2 = this.f4450e;
            int i3 = this.f4452g;
            if (E5 <= i2 - i3) {
                String str = new String(bArr, i3, E5, AbstractC0228x.f4508a);
                this.f4452g += E5;
                return str;
            }
        }
        if (E5 == 0) {
            return "";
        }
        if (E5 < 0) {
            throw C0230z.d();
        }
        if (E5 > this.f4450e) {
            return new String(z(E5), AbstractC0228x.f4508a);
        }
        I(E5);
        String str2 = new String(bArr, this.f4452g, E5, AbstractC0228x.f4508a);
        this.f4452g += E5;
        return str2;
    }

    @Override // R4.c
    public final String t() {
        int E5 = E();
        int i2 = this.f4452g;
        int i3 = this.f4450e;
        int i6 = i3 - i2;
        byte[] bArr = this.f4449d;
        if (E5 <= i6 && E5 > 0) {
            this.f4452g = i2 + E5;
        } else {
            if (E5 == 0) {
                return "";
            }
            if (E5 < 0) {
                throw C0230z.d();
            }
            i2 = 0;
            if (E5 <= i3) {
                I(E5);
                this.f4452g = E5;
            } else {
                bArr = z(E5);
            }
        }
        return l0.f4474a.h(bArr, i2, E5);
    }

    @Override // R4.c
    public final int u() {
        if (c()) {
            this.f4453h = 0;
            return 0;
        }
        int E5 = E();
        this.f4453h = E5;
        if ((E5 >>> 3) != 0) {
            return E5;
        }
        throw new C0230z("Protocol message contained an invalid tag (zero).");
    }

    @Override // R4.c
    public final int v() {
        return E();
    }

    @Override // R4.c
    public final long w() {
        return F();
    }

    @Override // R4.c
    public final boolean x(int i2) {
        int i3 = i2 & 7;
        int i6 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                J(8);
                return true;
            }
            if (i3 == 2) {
                J(E());
                return true;
            }
            if (i3 == 3) {
                y();
                a(((i2 >>> 3) << 3) | 4);
                return true;
            }
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw C0230z.b();
            }
            J(4);
            return true;
        }
        int i7 = this.f4450e - this.f4452g;
        byte[] bArr = this.f4449d;
        if (i7 >= 10) {
            while (i6 < 10) {
                int i8 = this.f4452g;
                this.f4452g = i8 + 1;
                if (bArr[i8] < 0) {
                    i6++;
                }
            }
            throw C0230z.c();
        }
        while (i6 < 10) {
            if (this.f4452g == this.f4450e) {
                I(1);
            }
            int i9 = this.f4452g;
            this.f4452g = i9 + 1;
            if (bArr[i9] < 0) {
                i6++;
            }
        }
        throw C0230z.c();
        return true;
    }

    public final byte[] z(int i2) {
        byte[] A5 = A(i2);
        if (A5 != null) {
            return A5;
        }
        int i3 = this.f4452g;
        int i6 = this.f4450e;
        int i7 = i6 - i3;
        this.f4454i += i6;
        this.f4452g = 0;
        this.f4450e = 0;
        ArrayList B5 = B(i2 - i7);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f4449d, i3, bArr, 0, i7);
        Iterator it = B5.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
            i7 += bArr2.length;
        }
        return bArr;
    }
}
