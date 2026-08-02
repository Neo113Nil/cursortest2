package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k0 extends C2.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2325b;

    public /* synthetic */ k0(int i3) {
        this.f2325b = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // C2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String k(byte[] bArr, int i3, int i4) {
        switch (this.f2325b) {
            case 0:
                if ((i3 | i4 | ((bArr.length - i3) - i4)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i4)));
                }
                int i5 = i3 + i4;
                char[] cArr = new char[i4];
                int i6 = 0;
                while (i3 < i5) {
                    byte b3 = bArr[i3];
                    if (b3 < 0) {
                        while (i3 < i5) {
                            int i7 = i3 + 1;
                            byte b4 = bArr[i3];
                            if (b4 >= 0) {
                                int i8 = i6 + 1;
                                cArr[i6] = (char) b4;
                                while (i7 < i5) {
                                    byte b5 = bArr[i7];
                                    if (b5 >= 0) {
                                        i7++;
                                        cArr[i8] = (char) b5;
                                        i8++;
                                    } else {
                                        i6 = i8;
                                        i3 = i7;
                                    }
                                }
                                i6 = i8;
                                i3 = i7;
                            } else if (b4 < -32) {
                                if (i7 >= i5) {
                                    throw A.a();
                                }
                                i3 += 2;
                                byte b6 = bArr[i7];
                                int i9 = i6 + 1;
                                if (b4 < -62 || android.support.v4.media.session.a.B(b6)) {
                                    throw A.a();
                                }
                                cArr[i6] = (char) ((b6 & 63) | ((b4 & 31) << 6));
                                i6 = i9;
                            } else {
                                if (b4 >= -16) {
                                    if (i7 >= i5 - 2) {
                                        throw A.a();
                                    }
                                    byte b7 = bArr[i7];
                                    int i10 = i3 + 3;
                                    byte b8 = bArr[i3 + 2];
                                    i3 += 4;
                                    byte b9 = bArr[i10];
                                    int i11 = i6 + 1;
                                    if (!android.support.v4.media.session.a.B(b7)) {
                                        if ((((b7 + 112) + (b4 << 28)) >> 30) == 0 && !android.support.v4.media.session.a.B(b8) && !android.support.v4.media.session.a.B(b9)) {
                                            int i12 = ((b7 & 63) << 12) | ((b4 & 7) << 18) | ((b8 & 63) << 6) | (b9 & 63);
                                            cArr[i6] = (char) ((i12 >>> 10) + 55232);
                                            cArr[i11] = (char) ((i12 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw A.a();
                                }
                                if (i7 >= i5 - 1) {
                                    throw A.a();
                                }
                                int i13 = i3 + 2;
                                byte b10 = bArr[i7];
                                i3 += 3;
                                byte b11 = bArr[i13];
                                int i14 = i6 + 1;
                                if (android.support.v4.media.session.a.B(b10) || ((b4 == -32 && b10 < -96) || ((b4 == -19 && b10 >= -96) || android.support.v4.media.session.a.B(b11)))) {
                                    throw A.a();
                                }
                                cArr[i6] = (char) (((b10 & 63) << 6) | ((b4 & 15) << 12) | (b11 & 63));
                                i6 = i14;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i3++;
                    cArr[i6] = (char) b3;
                    i6++;
                }
                while (i3 < i5) {
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = AbstractC0157y.f2364a;
                String str = new String(bArr, i3, i4, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i3, i4 + i3))) {
                    throw A.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r27 + r3;
     */
    @Override // C2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(String str, byte[] bArr, int i3, int i4) {
        int i5;
        int i6;
        char charAt;
        long j3;
        char c3;
        long j4;
        long j5;
        char c4;
        int i7;
        char charAt2;
        switch (this.f2325b) {
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
                                    throw new l0(i9, length);
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
                            throw new l0(i9 - 1, length);
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
                long j6 = i3;
                long j7 = i4 + j6;
                int length2 = str.length();
                if (length2 > i4 || bArr.length - i4 < i3) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i3 + i4));
                }
                int i15 = 0;
                while (true) {
                    j3 = 1;
                    c3 = 128;
                    if (i15 < length2 && (charAt2 = str.charAt(i15)) < 128) {
                        j0.j(bArr, j6, (byte) charAt2);
                        i15++;
                        j6 = 1 + j6;
                    }
                }
                if (i15 == length2) {
                    return (int) j6;
                }
                while (i15 < length2) {
                    char charAt5 = str.charAt(i15);
                    if (charAt5 < c3 && j6 < j7) {
                        j0.j(bArr, j6, (byte) charAt5);
                        c4 = c3;
                        j4 = j3;
                        j5 = j6 + j3;
                    } else if (charAt5 >= 2048 || j6 > j7 - 2) {
                        j4 = j3;
                        if ((charAt5 >= 55296 && 57343 >= charAt5) || j6 > j7 - 3) {
                            long j8 = j6;
                            if (j8 > j7 - 4) {
                                if (55296 <= charAt5 && charAt5 <= 57343 && ((i7 = i15 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i7)))) {
                                    throw new l0(i15, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j8);
                            }
                            int i16 = i15 + 1;
                            if (i16 != length2) {
                                char charAt6 = str.charAt(i16);
                                if (Character.isSurrogatePair(charAt5, charAt6)) {
                                    int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                    j0.j(bArr, j8, (byte) ((codePoint2 >>> 18) | 240));
                                    c4 = 128;
                                    j0.j(bArr, j8 + j4, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    j0.j(bArr, j8 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    j0.j(bArr, j8 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j5 = j8 + 4;
                                    i15 = i16;
                                } else {
                                    i15 = i16;
                                }
                            }
                            throw new l0(i15 - 1, length2);
                        }
                        j0.j(bArr, j6, (byte) ((charAt5 >>> '\f') | 480));
                        long j9 = j6;
                        j0.j(bArr, j6 + j4, (byte) (((charAt5 >>> 6) & 63) | 128));
                        j5 = j9 + 3;
                        j0.j(bArr, j9 + 2, (byte) ((charAt5 & '?') | 128));
                        c4 = 128;
                    } else {
                        j4 = j3;
                        j0.j(bArr, j6, (byte) ((charAt5 >>> 6) | 960));
                        j0.j(bArr, j6 + j4, (byte) ((charAt5 & '?') | c3));
                        j5 = j6 + 2;
                        c4 = c3;
                    }
                    i15++;
                    c3 = c4;
                    j6 = j5;
                    j3 = j4;
                }
                return (int) j6;
        }
    }
}
