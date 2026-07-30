package androidx.datastore.preferences.protobuf;

import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s1 extends d1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f912c;

    public /* synthetic */ s1(int i7) {
        this.f912c = i7;
    }

    public static int g(int i7, int i8, long j8, byte[] bArr) {
        if (i8 == 0) {
            d1 d1Var = u1.f915a;
            if (i7 > -12) {
                return -1;
            }
            return i7;
        }
        if (i8 == 1) {
            return u1.c(i7, r1.g(bArr, j8));
        }
        if (i8 == 2) {
            return u1.d(i7, r1.g(bArr, j8), r1.g(bArr, j8 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // androidx.datastore.preferences.protobuf.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(byte[] bArr, int i7, int i8) {
        switch (this.f912c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if ((i7 | i8 | ((bArr.length - i7) - i8)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
                }
                int i9 = i7 + i8;
                char[] cArr = new char[i8];
                int i10 = 0;
                while (i7 < i9) {
                    byte b9 = bArr[i7];
                    if (b9 < 0) {
                        while (i7 < i9) {
                            int i11 = i7 + 1;
                            byte b10 = bArr[i7];
                            if (b10 >= 0) {
                                int i12 = i10 + 1;
                                cArr[i10] = (char) b10;
                                while (i11 < i9) {
                                    byte b11 = bArr[i11];
                                    if (b11 >= 0) {
                                        i11++;
                                        cArr[i12] = (char) b11;
                                        i12++;
                                    } else {
                                        i10 = i12;
                                        i7 = i11;
                                    }
                                }
                                i10 = i12;
                                i7 = i11;
                            } else if (b10 < -32) {
                                if (i11 >= i9) {
                                    throw z.a();
                                }
                                i7 += 2;
                                byte b12 = bArr[i11];
                                int i13 = i10 + 1;
                                if (b10 < -62 || d1.d(b12)) {
                                    throw z.a();
                                }
                                cArr[i10] = (char) ((b12 & 63) | ((b10 & 31) << 6));
                                i10 = i13;
                            } else {
                                if (b10 >= -16) {
                                    if (i11 >= i9 - 2) {
                                        throw z.a();
                                    }
                                    byte b13 = bArr[i11];
                                    int i14 = i7 + 3;
                                    byte b14 = bArr[i7 + 2];
                                    i7 += 4;
                                    byte b15 = bArr[i14];
                                    int i15 = i10 + 1;
                                    if (!d1.d(b13)) {
                                        if ((((b13 + 112) + (b10 << 28)) >> 30) == 0 && !d1.d(b14) && !d1.d(b15)) {
                                            int i16 = ((b13 & 63) << 12) | ((b10 & 7) << 18) | ((b14 & 63) << 6) | (b15 & 63);
                                            cArr[i10] = (char) ((i16 >>> 10) + 55232);
                                            cArr[i15] = (char) ((i16 & 1023) + 56320);
                                            i10 += 2;
                                        }
                                    }
                                    throw z.a();
                                }
                                if (i11 >= i9 - 1) {
                                    throw z.a();
                                }
                                int i17 = i7 + 2;
                                byte b16 = bArr[i11];
                                i7 += 3;
                                byte b17 = bArr[i17];
                                int i18 = i10 + 1;
                                if (d1.d(b16) || ((b10 == -32 && b16 < -96) || ((b10 == -19 && b16 >= -96) || d1.d(b17)))) {
                                    throw z.a();
                                }
                                cArr[i10] = (char) (((b16 & 63) << 6) | ((b10 & 15) << 12) | (b17 & 63));
                                i10 = i18;
                            }
                        }
                        return new String(cArr, 0, i10);
                    }
                    i7++;
                    cArr[i10] = (char) b9;
                    i10++;
                }
                while (i7 < i9) {
                }
                return new String(cArr, 0, i10);
            default:
                Charset charset = x.f922a;
                String str = new String(bArr, i7, i8, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i8 + i7))) {
                    throw z.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r27 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.d1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(String str, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        char charAt;
        long j8;
        char c4;
        long j9;
        long j10;
        char c6;
        int i11;
        char charAt2;
        switch (this.f912c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int length = str.length();
                int i12 = i8 + i7;
                int i13 = 0;
                while (i13 < length && (i10 = i13 + i7) < i12 && (charAt = str.charAt(i13)) < 128) {
                    bArr[i10] = (byte) charAt;
                    i13++;
                }
                int i14 = i7 + i13;
                while (i13 < length) {
                    char charAt3 = str.charAt(i13);
                    if (charAt3 < 128 && i14 < i12) {
                        bArr[i14] = (byte) charAt3;
                        i14++;
                    } else if (charAt3 < 2048 && i14 <= i12 - 2) {
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) ((charAt3 >>> 6) | 960);
                        i14 += 2;
                        bArr[i15] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i14 > i12 - 3) {
                            if (i14 > i12 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i9 = i13 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i9)))) {
                                    throw new t1(i13, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i14);
                            }
                            int i16 = i13 + 1;
                            if (i16 != str.length()) {
                                char charAt4 = str.charAt(i16);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i17 = i14 + 3;
                                    bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i14 += 4;
                                    bArr[i17] = (byte) ((codePoint & 63) | 128);
                                    i13 = i16;
                                } else {
                                    i13 = i16;
                                }
                            }
                            throw new t1(i13 - 1, length);
                        }
                        bArr[i14] = (byte) ((charAt3 >>> '\f') | 480);
                        int i18 = i14 + 2;
                        bArr[i14 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i14 += 3;
                        bArr[i18] = (byte) ((charAt3 & '?') | 128);
                    }
                    i13++;
                }
                return i14;
            default:
                long j11 = i7;
                long j12 = i8 + j11;
                int length2 = str.length();
                if (length2 > i8 || bArr.length - i8 < i7) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i7 + i8));
                }
                int i19 = 0;
                while (true) {
                    j8 = 1;
                    c4 = 128;
                    if (i19 < length2 && (charAt2 = str.charAt(i19)) < 128) {
                        r1.k(bArr, j11, (byte) charAt2);
                        i19++;
                        j11 = 1 + j11;
                    }
                }
                if (i19 == length2) {
                    return (int) j11;
                }
                while (i19 < length2) {
                    char charAt5 = str.charAt(i19);
                    if (charAt5 < c4 && j11 < j12) {
                        r1.k(bArr, j11, (byte) charAt5);
                        c6 = c4;
                        j9 = j8;
                        j10 = j11 + j8;
                    } else if (charAt5 >= 2048 || j11 > j12 - 2) {
                        j9 = j8;
                        if ((charAt5 >= 55296 && 57343 >= charAt5) || j11 > j12 - 3) {
                            long j13 = j11;
                            if (j13 > j12 - 4) {
                                if (55296 <= charAt5 && charAt5 <= 57343 && ((i11 = i19 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i11)))) {
                                    throw new t1(i19, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j13);
                            }
                            int i20 = i19 + 1;
                            if (i20 != length2) {
                                char charAt6 = str.charAt(i20);
                                if (Character.isSurrogatePair(charAt5, charAt6)) {
                                    int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                    r1.k(bArr, j13, (byte) ((codePoint2 >>> 18) | 240));
                                    c6 = 128;
                                    r1.k(bArr, j13 + j9, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    r1.k(bArr, j13 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    r1.k(bArr, j13 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j10 = j13 + 4;
                                    i19 = i20;
                                } else {
                                    i19 = i20;
                                }
                            }
                            throw new t1(i19 - 1, length2);
                        }
                        r1.k(bArr, j11, (byte) ((charAt5 >>> '\f') | 480));
                        long j14 = j11;
                        r1.k(bArr, j11 + j9, (byte) (((charAt5 >>> 6) & 63) | 128));
                        j10 = j14 + 3;
                        r1.k(bArr, j14 + 2, (byte) ((charAt5 & '?') | 128));
                        c6 = 128;
                    } else {
                        j9 = j8;
                        r1.k(bArr, j11, (byte) ((charAt5 >>> 6) | 960));
                        r1.k(bArr, j11 + j9, (byte) ((charAt5 & '?') | c4));
                        j10 = j11 + 2;
                        c6 = c4;
                    }
                    i19++;
                    c4 = c6;
                    j11 = j10;
                    j8 = j9;
                }
                return (int) j11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final int e(byte[] bArr, int i7, int i8) {
        int i9;
        long j8;
        int i10 = i7;
        switch (this.f912c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            default:
                if ((i10 | i8 | (bArr.length - i8)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i8)));
                }
                long j9 = i10;
                int i11 = (int) (i8 - j9);
                long j10 = 1;
                if (i11 < 16) {
                    i9 = 0;
                } else {
                    int i12 = 8 - (((int) j9) & 7);
                    long j11 = j9;
                    i9 = 0;
                    while (true) {
                        if (i9 < i12) {
                            long j12 = j11 + 1;
                            if (r1.g(bArr, j11) >= 0) {
                                i9++;
                                j11 = j12;
                            }
                        } else {
                            while (true) {
                                int i13 = i9 + 8;
                                if (i13 <= i11) {
                                    if ((r1.f903c.h(r1.f906f + j11, bArr) & (-9187201950435737472L)) == 0) {
                                        j11 += 8;
                                        i9 = i13;
                                    }
                                }
                            }
                            while (true) {
                                if (i9 < i11) {
                                    long j13 = j11 + 1;
                                    if (r1.g(bArr, j11) >= 0) {
                                        i9++;
                                        j11 = j13;
                                    }
                                } else {
                                    i9 = i11;
                                }
                            }
                        }
                    }
                }
                int i14 = i11 - i9;
                long j14 = j9 + i9;
                while (true) {
                    byte b9 = 0;
                    while (true) {
                        if (i14 > 0) {
                            long j15 = j14 + j10;
                            b9 = r1.g(bArr, j14);
                            if (b9 >= 0) {
                                i14--;
                                j14 = j15;
                            } else {
                                j14 = j15;
                            }
                        }
                    }
                    if (i14 == 0) {
                        return 0;
                    }
                    int i15 = i14 - 1;
                    if (b9 < -32) {
                        if (i15 == 0) {
                            return b9;
                        }
                        i14 -= 2;
                        if (b9 >= -62) {
                            long j16 = j14 + j10;
                            if (r1.g(bArr, j14) <= -65) {
                                j8 = j10;
                                j14 = j16;
                                j10 = j8;
                            }
                        }
                    } else if (b9 >= -16) {
                        j8 = j10;
                        if (i15 < 3) {
                            return g(b9, i15, j14, bArr);
                        }
                        i14 -= 4;
                        long j17 = j14 + j8;
                        byte g9 = r1.g(bArr, j14);
                        if (g9 <= -65) {
                            if ((((g9 + 112) + (b9 << 28)) >> 30) == 0) {
                                long j18 = 2 + j14;
                                if (r1.g(bArr, j17) <= -65) {
                                    j14 += 3;
                                    if (r1.g(bArr, j18) <= -65) {
                                        j10 = j8;
                                    }
                                }
                            }
                        }
                    } else {
                        if (i15 < 2) {
                            return g(b9, i15, j14, bArr);
                        }
                        i14 -= 3;
                        j8 = j10;
                        long j19 = j14 + j8;
                        byte g10 = r1.g(bArr, j14);
                        if (g10 <= -65 && ((b9 != -32 || g10 >= -96) && (b9 != -19 || g10 < -96))) {
                            j14 += 2;
                            if (r1.g(bArr, j19) <= -65) {
                                j10 = j8;
                            }
                        }
                    }
                }
                return -1;
        }
        while (i10 < i8 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 < i8) {
            while (i10 < i8) {
                int i16 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i16 >= i8) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i10 += 2;
                            if (bArr[i16] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 < -16) {
                        if (i16 >= i8 - 1) {
                            return u1.a(bArr, i16, i8);
                        }
                        int i17 = i10 + 2;
                        byte b11 = bArr[i16];
                        if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                            i10 += 3;
                            if (bArr[i17] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i16 >= i8 - 2) {
                        return u1.a(bArr, i16, i8);
                    }
                    int i18 = i10 + 2;
                    byte b12 = bArr[i16];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i19 = i10 + 3;
                            if (bArr[i18] <= -65) {
                                i10 += 4;
                                if (bArr[i19] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i10 = i16;
            }
        }
        return 0;
    }
}
