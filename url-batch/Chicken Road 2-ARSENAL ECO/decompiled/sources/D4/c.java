package D4;

import java.io.IOException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f514a;

    /* renamed from: b, reason: collision with root package name */
    public final int f515b;

    /* renamed from: c, reason: collision with root package name */
    public int f516c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f517d;

    public c(byte[] bArr) {
        this.f514a = bArr;
        this.f515b = bArr.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (r1[r4] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a() {
        int i7;
        int i8 = this.f516c;
        byte[] bArr = this.f514a;
        int i9 = this.f515b;
        if (i9 != i8) {
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.f516c = i10;
                return b7;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b7;
                if (i12 < 0) {
                    i7 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = i12 ^ (bArr[i11] << 14);
                    if (i14 >= 0) {
                        i7 = i14 ^ 16256;
                    } else {
                        i11 = i8 + 4;
                        int i15 = i14 ^ (bArr[i13] << 21);
                        if (i15 < 0) {
                            i7 = (-2080896) ^ i15;
                        } else {
                            i13 = i8 + 5;
                            byte b8 = bArr[i11];
                            int i16 = (i15 ^ (b8 << 28)) ^ 266354560;
                            if (b8 < 0) {
                                i11 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i11] < 0) {
                                        i11 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i11] < 0) {
                                                i11 = i8 + 10;
                                            }
                                        }
                                    }
                                }
                                i7 = i16;
                            }
                            i7 = i16;
                        }
                    }
                    i11 = i13;
                }
                this.f516c = i11;
                return i7;
            }
        }
        long j4 = 0;
        for (int i17 = 0; i17 < 64; i17 += 7) {
            int i18 = this.f516c;
            if (i18 == i9) {
                throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f516c = i18 + 1;
            j4 |= (r5 & Byte.MAX_VALUE) << i17;
            if ((bArr[i18] & 128) == 0) {
                return (int) j4;
            }
        }
        throw new IOException("CodedInputStream encountered a malformed varint.");
    }

    public final void b(int i7) {
        if (i7 >= 0) {
            int i8 = this.f516c;
            if (i7 <= this.f515b - i8) {
                this.f516c = i8 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
