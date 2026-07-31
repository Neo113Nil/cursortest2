package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l1 extends s6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f724g;

    public /* synthetic */ l1(int i) {
        this.f724g = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // s6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m(byte[] bArr, int i, int i8) {
        switch (this.f724g) {
            case 0:
                if ((i | i8 | ((bArr.length - i) - i8)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i8)));
                }
                int i9 = i + i8;
                char[] cArr = new char[i8];
                int i10 = 0;
                while (i < i9) {
                    byte b8 = bArr[i];
                    if (b8 < 0) {
                        while (i < i9) {
                            int i11 = i + 1;
                            byte b9 = bArr[i];
                            if (b9 >= 0) {
                                int i12 = i10 + 1;
                                cArr[i10] = (char) b9;
                                while (i11 < i9) {
                                    byte b10 = bArr[i11];
                                    if (b10 >= 0) {
                                        i11++;
                                        cArr[i12] = (char) b10;
                                        i12++;
                                    } else {
                                        i10 = i12;
                                        i = i11;
                                    }
                                }
                                i10 = i12;
                                i = i11;
                            } else if (b9 < -32) {
                                if (i11 >= i9) {
                                    throw a0.a();
                                }
                                i += 2;
                                byte b11 = bArr[i11];
                                int i13 = i10 + 1;
                                if (b9 < -62 || a.a.p(b11)) {
                                    throw a0.a();
                                }
                                cArr[i10] = (char) ((b11 & 63) | ((b9 & 31) << 6));
                                i10 = i13;
                            } else {
                                if (b9 >= -16) {
                                    if (i11 >= i9 - 2) {
                                        throw a0.a();
                                    }
                                    byte b12 = bArr[i11];
                                    int i14 = i + 3;
                                    byte b13 = bArr[i + 2];
                                    i += 4;
                                    byte b14 = bArr[i14];
                                    int i15 = i10 + 1;
                                    if (!a.a.p(b12)) {
                                        if ((((b12 + 112) + (b9 << 28)) >> 30) == 0 && !a.a.p(b13) && !a.a.p(b14)) {
                                            int i16 = ((b12 & 63) << 12) | ((b9 & 7) << 18) | ((b13 & 63) << 6) | (b14 & 63);
                                            cArr[i10] = (char) ((i16 >>> 10) + 55232);
                                            cArr[i15] = (char) ((i16 & 1023) + 56320);
                                            i10 += 2;
                                        }
                                    }
                                    throw a0.a();
                                }
                                if (i11 >= i9 - 1) {
                                    throw a0.a();
                                }
                                int i17 = i + 2;
                                byte b15 = bArr[i11];
                                i += 3;
                                byte b16 = bArr[i17];
                                int i18 = i10 + 1;
                                if (a.a.p(b15) || ((b9 == -32 && b15 < -96) || ((b9 == -19 && b15 >= -96) || a.a.p(b16)))) {
                                    throw a0.a();
                                }
                                cArr[i10] = (char) (((b15 & 63) << 6) | ((b9 & 15) << 12) | (b16 & 63));
                                i10 = i18;
                            }
                        }
                        return new String(cArr, 0, i10);
                    }
                    i++;
                    cArr[i10] = (char) b8;
                    i10++;
                }
                while (i < i9) {
                }
                return new String(cArr, 0, i10);
            default:
                Charset charset = y.f794a;
                String str = new String(bArr, i, i8, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i8 + i))) {
                    throw a0.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r27 + r3;
     */
    @Override // s6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n(String str, byte[] bArr, int i, int i8) {
        int i9;
        int i10;
        char charAt;
        long j7;
        char c8;
        long j8;
        long j9;
        char c9;
        int i11;
        char charAt2;
        switch (this.f724g) {
            case 0:
                int length = str.length();
                int i12 = i8 + i;
                int i13 = 0;
                while (i13 < length && (i10 = i13 + i) < i12 && (charAt = str.charAt(i13)) < 128) {
                    bArr[i10] = (byte) charAt;
                    i13++;
                }
                int i14 = i + i13;
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
                                    throw new m1(i13, length);
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
                            throw new m1(i13 - 1, length);
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
                long j10 = i;
                long j11 = i8 + j10;
                int length2 = str.length();
                if (length2 > i8 || bArr.length - i8 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i8));
                }
                int i19 = 0;
                while (true) {
                    j7 = 1;
                    c8 = 128;
                    if (i19 < length2 && (charAt2 = str.charAt(i19)) < 128) {
                        k1.j(bArr, j10, (byte) charAt2);
                        i19++;
                        j10 = 1 + j10;
                    }
                }
                if (i19 == length2) {
                    return (int) j10;
                }
                while (i19 < length2) {
                    char charAt5 = str.charAt(i19);
                    if (charAt5 < c8 && j10 < j11) {
                        k1.j(bArr, j10, (byte) charAt5);
                        c9 = c8;
                        j8 = j7;
                        j9 = j10 + j7;
                    } else if (charAt5 >= 2048 || j10 > j11 - 2) {
                        j8 = j7;
                        if ((charAt5 >= 55296 && 57343 >= charAt5) || j10 > j11 - 3) {
                            long j12 = j10;
                            if (j12 > j11 - 4) {
                                if (55296 <= charAt5 && charAt5 <= 57343 && ((i11 = i19 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i11)))) {
                                    throw new m1(i19, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j12);
                            }
                            int i20 = i19 + 1;
                            if (i20 != length2) {
                                char charAt6 = str.charAt(i20);
                                if (Character.isSurrogatePair(charAt5, charAt6)) {
                                    int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                    k1.j(bArr, j12, (byte) ((codePoint2 >>> 18) | 240));
                                    c9 = 128;
                                    k1.j(bArr, j12 + j8, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    k1.j(bArr, j12 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    k1.j(bArr, j12 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j9 = j12 + 4;
                                    i19 = i20;
                                } else {
                                    i19 = i20;
                                }
                            }
                            throw new m1(i19 - 1, length2);
                        }
                        k1.j(bArr, j10, (byte) ((charAt5 >>> '\f') | 480));
                        long j13 = j10;
                        k1.j(bArr, j10 + j8, (byte) (((charAt5 >>> 6) & 63) | 128));
                        j9 = j13 + 3;
                        k1.j(bArr, j13 + 2, (byte) ((charAt5 & '?') | 128));
                        c9 = 128;
                    } else {
                        j8 = j7;
                        k1.j(bArr, j10, (byte) ((charAt5 >>> 6) | 960));
                        k1.j(bArr, j10 + j8, (byte) ((charAt5 & '?') | c8));
                        j9 = j10 + 2;
                        c9 = c8;
                    }
                    i19++;
                    c8 = c9;
                    j10 = j9;
                    j7 = j8;
                }
                return (int) j10;
        }
    }
}
