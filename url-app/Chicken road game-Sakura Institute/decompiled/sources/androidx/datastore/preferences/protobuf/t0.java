package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t0 extends e0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5407c;

    public /* synthetic */ t0(int i2) {
        this.f5407c = i2;
    }

    public static int g(int i2, int i4, long j4, byte[] bArr) {
        if (i4 == 0) {
            e0 e0Var = v0.f5408a;
            if (i2 > -12) {
                return -1;
            }
            return i2;
        }
        if (i4 == 1) {
            return v0.c(i2, s0.g(bArr, j4));
        }
        if (i4 == 2) {
            return v0.d(i2, s0.g(bArr, j4), s0.g(bArr, j4 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // androidx.datastore.preferences.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(byte[] bArr, int i2, int i4) {
        switch (this.f5407c) {
            case 0:
                if ((i2 | i4 | ((bArr.length - i2) - i4)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i4)));
                }
                int i5 = i2 + i4;
                char[] cArr = new char[i4];
                int i6 = 0;
                while (i2 < i5) {
                    byte b4 = bArr[i2];
                    if (b4 < 0) {
                        while (i2 < i5) {
                            int i7 = i2 + 1;
                            byte b5 = bArr[i2];
                            if (b5 >= 0) {
                                int i8 = i6 + 1;
                                cArr[i6] = (char) b5;
                                while (i7 < i5) {
                                    byte b6 = bArr[i7];
                                    if (b6 >= 0) {
                                        i7++;
                                        cArr[i8] = (char) b6;
                                        i8++;
                                    } else {
                                        i6 = i8;
                                        i2 = i7;
                                    }
                                }
                                i6 = i8;
                                i2 = i7;
                            } else if (b5 < -32) {
                                if (i7 >= i5) {
                                    throw C0460z.a();
                                }
                                i2 += 2;
                                byte b7 = bArr[i7];
                                int i9 = i6 + 1;
                                if (b5 < -62 || e0.d(b7)) {
                                    throw C0460z.a();
                                }
                                cArr[i6] = (char) ((b7 & 63) | ((b5 & 31) << 6));
                                i6 = i9;
                            } else {
                                if (b5 >= -16) {
                                    if (i7 >= i5 - 2) {
                                        throw C0460z.a();
                                    }
                                    byte b8 = bArr[i7];
                                    int i10 = i2 + 3;
                                    byte b9 = bArr[i2 + 2];
                                    i2 += 4;
                                    byte b10 = bArr[i10];
                                    int i11 = i6 + 1;
                                    if (!e0.d(b8)) {
                                        if ((((b8 + 112) + (b5 << 28)) >> 30) == 0 && !e0.d(b9) && !e0.d(b10)) {
                                            int i12 = ((b8 & 63) << 12) | ((b5 & 7) << 18) | ((b9 & 63) << 6) | (b10 & 63);
                                            cArr[i6] = (char) ((i12 >>> 10) + 55232);
                                            cArr[i11] = (char) ((i12 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw C0460z.a();
                                }
                                if (i7 >= i5 - 1) {
                                    throw C0460z.a();
                                }
                                int i13 = i2 + 2;
                                byte b11 = bArr[i7];
                                i2 += 3;
                                byte b12 = bArr[i13];
                                int i14 = i6 + 1;
                                if (e0.d(b11) || ((b5 == -32 && b11 < -96) || ((b5 == -19 && b11 >= -96) || e0.d(b12)))) {
                                    throw C0460z.a();
                                }
                                cArr[i6] = (char) (((b11 & 63) << 6) | ((b5 & 15) << 12) | (b12 & 63));
                                i6 = i14;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i2++;
                    cArr[i6] = (char) b4;
                    i6++;
                }
                while (i2 < i5) {
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = AbstractC0458x.f5409a;
                String str = new String(bArr, i2, i4, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i4 + i2))) {
                    throw C0460z.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return r26 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(String str, byte[] bArr, int i2, int i4) {
        int i5;
        int i6;
        char charAt;
        long j4;
        String str2;
        String str3;
        int i7;
        char charAt2;
        switch (this.f5407c) {
            case 0:
                int length = str.length();
                int i8 = i4 + i2;
                int i9 = 0;
                while (i9 < length && (i6 = i9 + i2) < i8 && (charAt = str.charAt(i9)) < 128) {
                    bArr[i6] = (byte) charAt;
                    i9++;
                }
                int i10 = i2 + i9;
                while (i9 < length) {
                    char charAt3 = str.charAt(i9);
                    if (charAt3 < 128 && i10 < i8) {
                        bArr[i10] = (byte) charAt3;
                        i10++;
                    } else if (charAt3 < 2048 && i10 <= i8 - 2) {
                        int i11 = i10 + 1;
                        bArr[i10] = (byte) ((charAt3 >>> 6) | 960);
                        i10 += 2;
                        bArr[i11] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i10 > i8 - 3) {
                            if (i10 > i8 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i5 = i9 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i5)))) {
                                    throw new u0(i9, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i10);
                            }
                            int i12 = i9 + 1;
                            if (i12 != str.length()) {
                                char charAt4 = str.charAt(i12);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i13 = i10 + 3;
                                    bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i10 += 4;
                                    bArr[i13] = (byte) ((codePoint & 63) | 128);
                                    i9 = i12;
                                } else {
                                    i9 = i12;
                                }
                            }
                            throw new u0(i9 - 1, length);
                        }
                        bArr[i10] = (byte) ((charAt3 >>> '\f') | 480);
                        int i14 = i10 + 2;
                        bArr[i10 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i10 += 3;
                        bArr[i14] = (byte) ((charAt3 & '?') | 128);
                    }
                    i9++;
                }
                return i10;
            default:
                long j5 = i2;
                long j6 = i4 + j5;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i4 || bArr.length - i4 < i2) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i2 + i4));
                }
                int i15 = 0;
                while (true) {
                    j4 = 1;
                    if (i15 < length2 && (charAt2 = str.charAt(i15)) < 128) {
                        s0.n(bArr, (byte) charAt2, j5);
                        i15++;
                        j5 = 1 + j5;
                    }
                }
                if (i15 != length2) {
                    while (i15 < length2) {
                        char charAt5 = str.charAt(i15);
                        if (charAt5 < 128 && j5 < j6) {
                            s0.n(bArr, (byte) charAt5, j5);
                            str3 = str5;
                            j5 += j4;
                            str2 = str4;
                        } else if (charAt5 >= 2048 || j5 > j6 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j5 > j6 - 3) {
                                if (j5 > j6 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i7 = i15 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i7)))) {
                                        throw new u0(i15, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + charAt5 + str2 + j5);
                                }
                                int i16 = i15 + 1;
                                if (i16 != length2) {
                                    char charAt6 = str.charAt(i16);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        s0.n(bArr, (byte) ((codePoint2 >>> 18) | 240), j5);
                                        s0.n(bArr, (byte) (((codePoint2 >>> 12) & 63) | 128), j5 + 1);
                                        long j7 = 3 + j5;
                                        s0.n(bArr, (byte) (((codePoint2 >>> 6) & 63) | 128), j5 + 2);
                                        j5 += 4;
                                        s0.n(bArr, (byte) ((codePoint2 & 63) | 128), j7);
                                        i15 = i16;
                                    } else {
                                        i15 = i16;
                                    }
                                }
                                throw new u0(i15 - 1, length2);
                            }
                            s0.n(bArr, (byte) ((charAt5 >>> '\f') | 480), j5);
                            long j8 = j5 + 2;
                            s0.n(bArr, (byte) (((charAt5 >>> 6) & 63) | 128), j5 + 1);
                            j5 += 3;
                            s0.n(bArr, (byte) ((charAt5 & '?') | 128), j8);
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j9 = j5 + j4;
                            s0.n(bArr, (byte) ((charAt5 >>> 6) | 960), j5);
                            j5 += 2;
                            s0.n(bArr, (byte) ((charAt5 & '?') | 128), j9);
                        }
                        i15++;
                        str4 = str2;
                        str5 = str3;
                        j4 = 1;
                    }
                }
                return (int) j5;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final int e(byte[] bArr, int i2, int i4) {
        int i5;
        int i6 = i2;
        switch (this.f5407c) {
            case 0:
                break;
            default:
                if ((i6 | i4 | (bArr.length - i4)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i4)));
                }
                long j4 = i6;
                int i7 = (int) (i4 - j4);
                long j5 = 1;
                if (i7 < 16) {
                    i5 = 0;
                } else {
                    int i8 = 8 - (((int) j4) & 7);
                    long j6 = j4;
                    i5 = 0;
                    while (true) {
                        if (i5 < i8) {
                            long j7 = j6 + 1;
                            if (s0.g(bArr, j6) >= 0) {
                                i5++;
                                j6 = j7;
                            }
                        } else {
                            while (true) {
                                int i9 = i5 + 8;
                                if (i9 <= i7) {
                                    if ((s0.f5400c.h(s0.f5403f + j6, bArr) & (-9187201950435737472L)) == 0) {
                                        j6 += 8;
                                        i5 = i9;
                                    }
                                }
                            }
                            while (true) {
                                if (i5 < i7) {
                                    long j8 = j6 + 1;
                                    if (s0.g(bArr, j6) >= 0) {
                                        i5++;
                                        j6 = j8;
                                    }
                                } else {
                                    i5 = i7;
                                }
                            }
                        }
                    }
                }
                int i10 = i7 - i5;
                long j9 = j4 + i5;
                while (true) {
                    byte b4 = 0;
                    while (true) {
                        if (i10 > 0) {
                            long j10 = j9 + j5;
                            b4 = s0.g(bArr, j9);
                            if (b4 >= 0) {
                                i10--;
                                j9 = j10;
                            } else {
                                j9 = j10;
                            }
                        }
                    }
                    if (i10 == 0) {
                        return 0;
                    }
                    int i11 = i10 - 1;
                    if (b4 < -32) {
                        if (i11 == 0) {
                            return b4;
                        }
                        i10 -= 2;
                        if (b4 >= -62) {
                            long j11 = j9 + j5;
                            if (s0.g(bArr, j9) <= -65) {
                                j9 = j11;
                                j5 = 1;
                            }
                        }
                    } else if (b4 < -16) {
                        if (i11 < 2) {
                            return g(b4, i11, j9, bArr);
                        }
                        i10 -= 3;
                        long j12 = j9 + j5;
                        byte g4 = s0.g(bArr, j9);
                        if (g4 <= -65 && ((b4 != -32 || g4 >= -96) && (b4 != -19 || g4 < -96))) {
                            j9 += 2;
                            if (s0.g(bArr, j12) <= -65) {
                                j5 = 1;
                            }
                        }
                    } else {
                        if (i11 < 3) {
                            return g(b4, i11, j9, bArr);
                        }
                        i10 -= 4;
                        long j13 = j9 + j5;
                        byte g5 = s0.g(bArr, j9);
                        if (g5 <= -65) {
                            if ((((g5 + 112) + (b4 << 28)) >> 30) == 0) {
                                long j14 = j9 + 2;
                                if (s0.g(bArr, j13) <= -65) {
                                    j9 += 3;
                                    if (s0.g(bArr, j14) <= -65) {
                                        j5 = 1;
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
        }
        while (i6 < i4 && bArr[i6] >= 0) {
            i6++;
        }
        if (i6 >= i4) {
            return 0;
        }
        while (i6 < i4) {
            int i12 = i6 + 1;
            byte b5 = bArr[i6];
            if (b5 < 0) {
                if (b5 < -32) {
                    if (i12 >= i4) {
                        return b5;
                    }
                    if (b5 >= -62) {
                        i6 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b5 < -16) {
                    if (i12 >= i4 - 1) {
                        return v0.a(bArr, i12, i4);
                    }
                    int i13 = i6 + 2;
                    byte b6 = bArr[i12];
                    if (b6 <= -65 && ((b5 != -32 || b6 >= -96) && (b5 != -19 || b6 < -96))) {
                        i6 += 3;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (i12 >= i4 - 2) {
                    return v0.a(bArr, i12, i4);
                }
                int i14 = i6 + 2;
                byte b7 = bArr[i12];
                if (b7 <= -65) {
                    if ((((b7 + 112) + (b5 << 28)) >> 30) == 0) {
                        int i15 = i6 + 3;
                        if (bArr[i14] <= -65) {
                            i6 += 4;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i6 = i12;
        }
        return 0;
    }
}
