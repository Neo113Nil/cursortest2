package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k0 extends V3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4669a;

    public /* synthetic */ k0(int i4) {
        this.f4669a = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // V3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String l(byte[] bArr, int i4, int i5) {
        switch (this.f4669a) {
            case 0:
                if ((i4 | i5 | ((bArr.length - i4) - i5)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
                }
                int i6 = i4 + i5;
                char[] cArr = new char[i5];
                int i7 = 0;
                while (i4 < i6) {
                    byte b4 = bArr[i4];
                    if (b4 < 0) {
                        while (i4 < i6) {
                            int i8 = i4 + 1;
                            byte b5 = bArr[i4];
                            if (b5 >= 0) {
                                int i9 = i7 + 1;
                                cArr[i7] = (char) b5;
                                while (i8 < i6) {
                                    byte b6 = bArr[i8];
                                    if (b6 >= 0) {
                                        i8++;
                                        cArr[i9] = (char) b6;
                                        i9++;
                                    } else {
                                        i7 = i9;
                                        i4 = i8;
                                    }
                                }
                                i7 = i9;
                                i4 = i8;
                            } else if (b5 < -32) {
                                if (i8 >= i6) {
                                    throw A.a();
                                }
                                i4 += 2;
                                byte b7 = bArr[i8];
                                int i10 = i7 + 1;
                                if (b5 < -62 || U.i.o(b7)) {
                                    throw A.a();
                                }
                                cArr[i7] = (char) ((b7 & 63) | ((b5 & 31) << 6));
                                i7 = i10;
                            } else {
                                if (b5 >= -16) {
                                    if (i8 >= i6 - 2) {
                                        throw A.a();
                                    }
                                    byte b8 = bArr[i8];
                                    int i11 = i4 + 3;
                                    byte b9 = bArr[i4 + 2];
                                    i4 += 4;
                                    byte b10 = bArr[i11];
                                    int i12 = i7 + 1;
                                    if (!U.i.o(b8)) {
                                        if ((((b8 + 112) + (b5 << 28)) >> 30) == 0 && !U.i.o(b9) && !U.i.o(b10)) {
                                            int i13 = ((b8 & 63) << 12) | ((b5 & 7) << 18) | ((b9 & 63) << 6) | (b10 & 63);
                                            cArr[i7] = (char) ((i13 >>> 10) + 55232);
                                            cArr[i12] = (char) ((i13 & 1023) + 56320);
                                            i7 += 2;
                                        }
                                    }
                                    throw A.a();
                                }
                                if (i8 >= i6 - 1) {
                                    throw A.a();
                                }
                                int i14 = i4 + 2;
                                byte b11 = bArr[i8];
                                i4 += 3;
                                byte b12 = bArr[i14];
                                int i15 = i7 + 1;
                                if (U.i.o(b11) || ((b5 == -32 && b11 < -96) || ((b5 == -19 && b11 >= -96) || U.i.o(b12)))) {
                                    throw A.a();
                                }
                                cArr[i7] = (char) (((b11 & 63) << 6) | ((b5 & 15) << 12) | (b12 & 63));
                                i7 = i15;
                            }
                        }
                        return new String(cArr, 0, i7);
                    }
                    i4++;
                    cArr[i7] = (char) b4;
                    i7++;
                }
                while (i4 < i6) {
                }
                return new String(cArr, 0, i7);
            default:
                Charset charset = AbstractC0191y.f4712a;
                String str = new String(bArr, i4, i5, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i4, i5 + i4))) {
                    throw A.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r27 + r3;
     */
    @Override // V3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(String str, byte[] bArr, int i4, int i5) {
        int i6;
        int i7;
        char charAt;
        long j4;
        char c4;
        long j5;
        long j6;
        char c5;
        int i8;
        char charAt2;
        switch (this.f4669a) {
            case 0:
                int length = str.length();
                int i9 = i5 + i4;
                int i10 = 0;
                while (i10 < length && (i7 = i10 + i4) < i9 && (charAt = str.charAt(i10)) < 128) {
                    bArr[i7] = (byte) charAt;
                    i10++;
                }
                int i11 = i4 + i10;
                while (i10 < length) {
                    char charAt3 = str.charAt(i10);
                    if (charAt3 < 128 && i11 < i9) {
                        bArr[i11] = (byte) charAt3;
                        i11++;
                    } else if (charAt3 < 2048 && i11 <= i9 - 2) {
                        int i12 = i11 + 1;
                        bArr[i11] = (byte) ((charAt3 >>> 6) | 960);
                        i11 += 2;
                        bArr[i12] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i11 > i9 - 3) {
                            if (i11 > i9 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i6 = i10 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i6)))) {
                                    throw new l0(i10, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i11);
                            }
                            int i13 = i10 + 1;
                            if (i13 != str.length()) {
                                char charAt4 = str.charAt(i13);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i11] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i11 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i14 = i11 + 3;
                                    bArr[i11 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i11 += 4;
                                    bArr[i14] = (byte) ((codePoint & 63) | 128);
                                    i10 = i13;
                                } else {
                                    i10 = i13;
                                }
                            }
                            throw new l0(i10 - 1, length);
                        }
                        bArr[i11] = (byte) ((charAt3 >>> '\f') | 480);
                        int i15 = i11 + 2;
                        bArr[i11 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i11 += 3;
                        bArr[i15] = (byte) ((charAt3 & '?') | 128);
                    }
                    i10++;
                }
                return i11;
            default:
                long j7 = i4;
                long j8 = i5 + j7;
                int length2 = str.length();
                if (length2 > i5 || bArr.length - i5 < i4) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i4 + i5));
                }
                int i16 = 0;
                while (true) {
                    j4 = 1;
                    c4 = 128;
                    if (i16 < length2 && (charAt2 = str.charAt(i16)) < 128) {
                        j0.j(bArr, j7, (byte) charAt2);
                        i16++;
                        j7 = 1 + j7;
                    }
                }
                if (i16 == length2) {
                    return (int) j7;
                }
                while (i16 < length2) {
                    char charAt5 = str.charAt(i16);
                    if (charAt5 < c4 && j7 < j8) {
                        j0.j(bArr, j7, (byte) charAt5);
                        c5 = c4;
                        j5 = j4;
                        j6 = j7 + j4;
                    } else if (charAt5 >= 2048 || j7 > j8 - 2) {
                        j5 = j4;
                        if ((charAt5 >= 55296 && 57343 >= charAt5) || j7 > j8 - 3) {
                            long j9 = j7;
                            if (j9 > j8 - 4) {
                                if (55296 <= charAt5 && charAt5 <= 57343 && ((i8 = i16 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i8)))) {
                                    throw new l0(i16, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j9);
                            }
                            int i17 = i16 + 1;
                            if (i17 != length2) {
                                char charAt6 = str.charAt(i17);
                                if (Character.isSurrogatePair(charAt5, charAt6)) {
                                    int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                    j0.j(bArr, j9, (byte) ((codePoint2 >>> 18) | 240));
                                    c5 = 128;
                                    j0.j(bArr, j9 + j5, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    j0.j(bArr, j9 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    j0.j(bArr, j9 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j6 = j9 + 4;
                                    i16 = i17;
                                } else {
                                    i16 = i17;
                                }
                            }
                            throw new l0(i16 - 1, length2);
                        }
                        j0.j(bArr, j7, (byte) ((charAt5 >>> '\f') | 480));
                        long j10 = j7;
                        j0.j(bArr, j7 + j5, (byte) (((charAt5 >>> 6) & 63) | 128));
                        j6 = j10 + 3;
                        j0.j(bArr, j10 + 2, (byte) ((charAt5 & '?') | 128));
                        c5 = 128;
                    } else {
                        j5 = j4;
                        j0.j(bArr, j7, (byte) ((charAt5 >>> 6) | 960));
                        j0.j(bArr, j7 + j5, (byte) ((charAt5 & '?') | c4));
                        j6 = j7 + 2;
                        c5 = c4;
                    }
                    i16++;
                    c4 = c5;
                    j7 = j6;
                    j4 = j5;
                }
                return (int) j7;
        }
    }
}
