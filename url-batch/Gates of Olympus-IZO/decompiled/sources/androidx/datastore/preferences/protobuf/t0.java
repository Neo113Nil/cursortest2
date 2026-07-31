package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t0 extends e0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3932c;

    public /* synthetic */ t0(int i3) {
        this.f3932c = i3;
    }

    public static int g(int i3, int i4, long j3, byte[] bArr) {
        if (i4 == 0) {
            e0 e0Var = v0.f3933a;
            if (i3 > -12) {
                return -1;
            }
            return i3;
        }
        if (i4 == 1) {
            return v0.c(i3, s0.g(bArr, j3));
        }
        if (i4 == 2) {
            return v0.d(i3, s0.g(bArr, j3), s0.g(bArr, j3 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // androidx.datastore.preferences.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(byte[] bArr, int i3, int i4) {
        switch (this.f3932c) {
            case 0:
                if ((i3 | i4 | ((bArr.length - i3) - i4)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i4)));
                }
                int i5 = i3 + i4;
                char[] cArr = new char[i4];
                int i6 = 0;
                while (i3 < i5) {
                    byte b2 = bArr[i3];
                    if (b2 < 0) {
                        while (i3 < i5) {
                            int i7 = i3 + 1;
                            byte b3 = bArr[i3];
                            if (b3 >= 0) {
                                int i8 = i6 + 1;
                                cArr[i6] = (char) b3;
                                while (i7 < i5) {
                                    byte b4 = bArr[i7];
                                    if (b4 >= 0) {
                                        i7++;
                                        cArr[i8] = (char) b4;
                                        i8++;
                                    } else {
                                        i6 = i8;
                                        i3 = i7;
                                    }
                                }
                                i6 = i8;
                                i3 = i7;
                            } else if (b3 < -32) {
                                if (i7 >= i5) {
                                    throw C0215z.a();
                                }
                                i3 += 2;
                                byte b5 = bArr[i7];
                                int i9 = i6 + 1;
                                if (b3 < -62 || e0.d(b5)) {
                                    throw C0215z.a();
                                }
                                cArr[i6] = (char) ((b5 & 63) | ((b3 & 31) << 6));
                                i6 = i9;
                            } else {
                                if (b3 >= -16) {
                                    if (i7 >= i5 - 2) {
                                        throw C0215z.a();
                                    }
                                    byte b6 = bArr[i7];
                                    int i10 = i3 + 3;
                                    byte b7 = bArr[i3 + 2];
                                    i3 += 4;
                                    byte b8 = bArr[i10];
                                    int i11 = i6 + 1;
                                    if (!e0.d(b6)) {
                                        if ((((b6 + 112) + (b3 << 28)) >> 30) == 0 && !e0.d(b7) && !e0.d(b8)) {
                                            int i12 = ((b6 & 63) << 12) | ((b3 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i6] = (char) ((i12 >>> 10) + 55232);
                                            cArr[i11] = (char) ((i12 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw C0215z.a();
                                }
                                if (i7 >= i5 - 1) {
                                    throw C0215z.a();
                                }
                                int i13 = i3 + 2;
                                byte b9 = bArr[i7];
                                i3 += 3;
                                byte b10 = bArr[i13];
                                int i14 = i6 + 1;
                                if (e0.d(b9) || ((b3 == -32 && b9 < -96) || ((b3 == -19 && b9 >= -96) || e0.d(b10)))) {
                                    throw C0215z.a();
                                }
                                cArr[i6] = (char) (((b9 & 63) << 6) | ((b3 & 15) << 12) | (b10 & 63));
                                i6 = i14;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i3++;
                    cArr[i6] = (char) b2;
                    i6++;
                }
                while (i3 < i5) {
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = AbstractC0213x.f3934a;
                String str = new String(bArr, i3, i4, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i3, i4 + i3))) {
                    throw C0215z.a();
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
    public final int b(String str, byte[] bArr, int i3, int i4) {
        int i5;
        int i6;
        char charAt;
        long j3;
        String str2;
        String str3;
        int i7;
        char charAt2;
        switch (this.f3932c) {
            case 0:
                int length = str.length();
                int i8 = i4 + i3;
                int i9 = 0;
                while (i9 < length && (i6 = i9 + i3) < i8 && (charAt = str.charAt(i9)) < 128) {
                    bArr[i6] = (byte) charAt;
                    i9++;
                }
                int i10 = i3 + i9;
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
                long j4 = i3;
                long j5 = i4 + j4;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i4 || bArr.length - i4 < i3) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i3 + i4));
                }
                int i15 = 0;
                while (true) {
                    j3 = 1;
                    if (i15 < length2 && (charAt2 = str.charAt(i15)) < 128) {
                        s0.n(bArr, j4, (byte) charAt2);
                        i15++;
                        j4 = 1 + j4;
                    }
                }
                if (i15 != length2) {
                    while (i15 < length2) {
                        char charAt5 = str.charAt(i15);
                        if (charAt5 < 128 && j4 < j5) {
                            s0.n(bArr, j4, (byte) charAt5);
                            str3 = str5;
                            j4 += j3;
                            str2 = str4;
                        } else if (charAt5 >= 2048 || j4 > j5 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j4 > j5 - 3) {
                                if (j4 > j5 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i7 = i15 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i7)))) {
                                        throw new u0(i15, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + charAt5 + str2 + j4);
                                }
                                int i16 = i15 + 1;
                                if (i16 != length2) {
                                    char charAt6 = str.charAt(i16);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        s0.n(bArr, j4, (byte) ((codePoint2 >>> 18) | 240));
                                        s0.n(bArr, j4 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j6 = 3 + j4;
                                        s0.n(bArr, j4 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j4 += 4;
                                        s0.n(bArr, j6, (byte) ((codePoint2 & 63) | 128));
                                        i15 = i16;
                                    } else {
                                        i15 = i16;
                                    }
                                }
                                throw new u0(i15 - 1, length2);
                            }
                            s0.n(bArr, j4, (byte) ((charAt5 >>> '\f') | 480));
                            long j7 = j4 + 2;
                            s0.n(bArr, j4 + 1, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j4 += 3;
                            s0.n(bArr, j7, (byte) ((charAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j8 = j4 + j3;
                            s0.n(bArr, j4, (byte) ((charAt5 >>> 6) | 960));
                            j4 += 2;
                            s0.n(bArr, j8, (byte) ((charAt5 & '?') | 128));
                        }
                        i15++;
                        str4 = str2;
                        str5 = str3;
                        j3 = 1;
                    }
                }
                return (int) j4;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final int e(byte[] bArr, int i3, int i4) {
        int i5;
        int i6 = i3;
        switch (this.f3932c) {
            case 0:
                break;
            default:
                if ((i6 | i4 | (bArr.length - i4)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i4)));
                }
                long j3 = i6;
                int i7 = (int) (i4 - j3);
                long j4 = 1;
                if (i7 < 16) {
                    i5 = 0;
                } else {
                    int i8 = 8 - (((int) j3) & 7);
                    long j5 = j3;
                    i5 = 0;
                    while (true) {
                        if (i5 < i8) {
                            long j6 = j5 + 1;
                            if (s0.g(bArr, j5) >= 0) {
                                i5++;
                                j5 = j6;
                            }
                        } else {
                            while (true) {
                                int i9 = i5 + 8;
                                if (i9 <= i7) {
                                    if ((s0.f3925c.h(s0.f3928f + j5, bArr) & (-9187201950435737472L)) == 0) {
                                        j5 += 8;
                                        i5 = i9;
                                    }
                                }
                            }
                            while (true) {
                                if (i5 < i7) {
                                    long j7 = j5 + 1;
                                    if (s0.g(bArr, j5) >= 0) {
                                        i5++;
                                        j5 = j7;
                                    }
                                } else {
                                    i5 = i7;
                                }
                            }
                        }
                    }
                }
                int i10 = i7 - i5;
                long j8 = j3 + i5;
                while (true) {
                    byte b2 = 0;
                    while (true) {
                        if (i10 > 0) {
                            long j9 = j8 + j4;
                            b2 = s0.g(bArr, j8);
                            if (b2 >= 0) {
                                i10--;
                                j8 = j9;
                            } else {
                                j8 = j9;
                            }
                        }
                    }
                    if (i10 == 0) {
                        return 0;
                    }
                    int i11 = i10 - 1;
                    if (b2 < -32) {
                        if (i11 == 0) {
                            return b2;
                        }
                        i10 -= 2;
                        if (b2 >= -62) {
                            long j10 = j8 + j4;
                            if (s0.g(bArr, j8) <= -65) {
                                j8 = j10;
                                j4 = 1;
                            }
                        }
                    } else if (b2 < -16) {
                        if (i11 < 2) {
                            return g(b2, i11, j8, bArr);
                        }
                        i10 -= 3;
                        long j11 = j8 + j4;
                        byte g3 = s0.g(bArr, j8);
                        if (g3 <= -65 && ((b2 != -32 || g3 >= -96) && (b2 != -19 || g3 < -96))) {
                            j8 += 2;
                            if (s0.g(bArr, j11) <= -65) {
                                j4 = 1;
                            }
                        }
                    } else {
                        if (i11 < 3) {
                            return g(b2, i11, j8, bArr);
                        }
                        i10 -= 4;
                        long j12 = j8 + j4;
                        byte g4 = s0.g(bArr, j8);
                        if (g4 <= -65) {
                            if ((((g4 + 112) + (b2 << 28)) >> 30) == 0) {
                                long j13 = j8 + 2;
                                if (s0.g(bArr, j12) <= -65) {
                                    j8 += 3;
                                    if (s0.g(bArr, j13) <= -65) {
                                        j4 = 1;
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
            byte b3 = bArr[i6];
            if (b3 < 0) {
                if (b3 < -32) {
                    if (i12 >= i4) {
                        return b3;
                    }
                    if (b3 >= -62) {
                        i6 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b3 < -16) {
                    if (i12 >= i4 - 1) {
                        return v0.a(bArr, i12, i4);
                    }
                    int i13 = i6 + 2;
                    byte b4 = bArr[i12];
                    if (b4 <= -65 && ((b3 != -32 || b4 >= -96) && (b3 != -19 || b4 < -96))) {
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
                byte b5 = bArr[i12];
                if (b5 <= -65) {
                    if ((((b5 + 112) + (b3 << 28)) >> 30) == 0) {
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
