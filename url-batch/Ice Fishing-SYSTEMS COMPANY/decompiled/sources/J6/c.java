package J6;

import com.google.android.gms.internal.ads.PA;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1404a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1405b;

    /* renamed from: c, reason: collision with root package name */
    public int f1406c;

    /* renamed from: d, reason: collision with root package name */
    public int f1407d;

    public c(byte[] bArr, int i) {
        switch (i) {
            case 1:
                this.f1404a = bArr;
                this.f1405b = bArr.length;
                break;
            default:
                this.f1404a = bArr;
                this.f1405b = bArr.length;
                this.f1406c = 0;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (r1[r4] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int a() {
        int i;
        int i4 = this.f1406c;
        byte[] bArr = this.f1404a;
        int i9 = this.f1405b;
        if (i9 != i4) {
            int i10 = i4 + 1;
            byte b9 = bArr[i4];
            if (b9 >= 0) {
                this.f1406c = i10;
                return b9;
            }
            if (i9 - i10 >= 9) {
                int i11 = i4 + 2;
                int i12 = (bArr[i10] << 7) ^ b9;
                if (i12 < 0) {
                    i = i12 ^ (-128);
                } else {
                    int i13 = i4 + 3;
                    int i14 = i12 ^ (bArr[i11] << 14);
                    if (i14 >= 0) {
                        i = i14 ^ 16256;
                    } else {
                        i11 = i4 + 4;
                        int i15 = i14 ^ (bArr[i13] << 21);
                        if (i15 < 0) {
                            i = (-2080896) ^ i15;
                        } else {
                            i13 = i4 + 5;
                            byte b10 = bArr[i11];
                            int i16 = (i15 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i11 = i4 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i4 + 7;
                                    if (bArr[i11] < 0) {
                                        i11 = i4 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i4 + 9;
                                            if (bArr[i11] < 0) {
                                                i11 = i4 + 10;
                                            }
                                        }
                                    }
                                }
                                i = i16;
                            }
                            i = i16;
                        }
                    }
                    i11 = i13;
                }
                this.f1406c = i11;
                return i;
            }
        }
        long j9 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            int i18 = this.f1406c;
            if (i18 == i9) {
                throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f1406c = i18 + 1;
            j9 |= (r5 & Byte.MAX_VALUE) << i17;
            if ((bArr[i18] & com.anythink.core.common.s.a.c.f16474a) == 0) {
                return (int) j9;
            }
        }
        throw new IOException("CodedInputStream encountered a malformed varint.");
    }

    public void b(int i) {
        if (i >= 0) {
            int i4 = this.f1406c;
            if (i <= this.f1405b - i4) {
                this.f1406c = i4 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public boolean c() {
        int i = (this.f1404a[this.f1406c] & 255) >> this.f1407d;
        e(1);
        return 1 == (i & 1);
    }

    public int d(int i) {
        int i4 = this.f1406c;
        int i9 = i4 + 1;
        int min = Math.min(i, 8 - this.f1407d);
        byte[] bArr = this.f1404a;
        int i10 = ((bArr[i4] & 255) >> this.f1407d) & (com.anythink.basead.exoplayer.k.p.f8630b >> (8 - min));
        while (min < i) {
            i10 |= (bArr[i9] & 255) << min;
            min += 8;
            i9++;
        }
        int i11 = i10 & ((-1) >>> (32 - i));
        e(i);
        return i11;
    }

    public void e(int i) {
        int i4;
        int i9 = i / 8;
        int i10 = this.f1406c + i9;
        this.f1406c = i10;
        int i11 = (i - (i9 * 8)) + this.f1407d;
        this.f1407d = i11;
        if (i11 > 7) {
            i10++;
            this.f1406c = i10;
            i11 -= 8;
            this.f1407d = i11;
        }
        boolean z8 = false;
        if (i10 >= 0 && (i10 < (i4 = this.f1405b) || (i10 == i4 && i11 == 0))) {
            z8 = true;
        }
        PA.T(z8);
    }
}
