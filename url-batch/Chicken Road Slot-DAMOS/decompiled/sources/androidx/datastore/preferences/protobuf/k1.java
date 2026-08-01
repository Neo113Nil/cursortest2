package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class k1 extends g8.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f576a;

    public /* synthetic */ k1(int i3) {
        this.f576a = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // g8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String u(byte[] bArr, int i3, int i10) {
        switch (this.f576a) {
            case 0:
                if ((i3 | i10 | ((bArr.length - i3) - i10)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i10)));
                }
                int i11 = i3 + i10;
                char[] cArr = new char[i10];
                int i12 = 0;
                while (i3 < i11) {
                    byte b10 = bArr[i3];
                    if (b10 < 0) {
                        while (i3 < i11) {
                            int i13 = i3 + 1;
                            byte b11 = bArr[i3];
                            if (b11 >= 0) {
                                int i14 = i12 + 1;
                                cArr[i12] = (char) b11;
                                while (i13 < i11) {
                                    byte b12 = bArr[i13];
                                    if (b12 >= 0) {
                                        i13++;
                                        cArr[i14] = (char) b12;
                                        i14++;
                                    } else {
                                        i12 = i14;
                                        i3 = i13;
                                    }
                                }
                                i12 = i14;
                                i3 = i13;
                            } else if (b11 < -32) {
                                if (i13 >= i11) {
                                    throw z.a();
                                }
                                i3 += 2;
                                byte b13 = bArr[i13];
                                int i15 = i12 + 1;
                                if (b11 < -62 || cf.c.z(b13)) {
                                    throw z.a();
                                }
                                cArr[i12] = (char) ((b13 & 63) | ((b11 & 31) << 6));
                                i12 = i15;
                            } else {
                                if (b11 >= -16) {
                                    if (i13 >= i11 - 2) {
                                        throw z.a();
                                    }
                                    byte b14 = bArr[i13];
                                    int i16 = i3 + 3;
                                    byte b15 = bArr[i3 + 2];
                                    i3 += 4;
                                    byte b16 = bArr[i16];
                                    int i17 = i12 + 1;
                                    if (!cf.c.z(b14)) {
                                        if ((((b14 + 112) + (b11 << 28)) >> 30) == 0 && !cf.c.z(b15) && !cf.c.z(b16)) {
                                            int i18 = ((b14 & 63) << 12) | ((b11 & 7) << 18) | ((b15 & 63) << 6) | (b16 & 63);
                                            cArr[i12] = (char) ((i18 >>> 10) + 55232);
                                            cArr[i17] = (char) ((i18 & 1023) + 56320);
                                            i12 += 2;
                                        }
                                    }
                                    throw z.a();
                                }
                                if (i13 >= i11 - 1) {
                                    throw z.a();
                                }
                                int i19 = i3 + 2;
                                byte b17 = bArr[i13];
                                i3 += 3;
                                byte b18 = bArr[i19];
                                int i20 = i12 + 1;
                                if (cf.c.z(b17) || ((b11 == -32 && b17 < -96) || ((b11 == -19 && b17 >= -96) || cf.c.z(b18)))) {
                                    throw z.a();
                                }
                                cArr[i12] = (char) (((b17 & 63) << 6) | ((b11 & 15) << 12) | (b18 & 63));
                                i12 = i20;
                            }
                        }
                        return new String(cArr, 0, i12);
                    }
                    i3++;
                    cArr[i12] = (char) b10;
                    i12++;
                }
                while (i3 < i11) {
                }
                return new String(cArr, 0, i12);
            default:
                Charset charset = x.f647a;
                String str = new String(bArr, i3, i10, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i3, i10 + i3))) {
                    throw z.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r27 + r3;
     */
    @Override // g8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int w(String str, byte[] bArr, int i3, int i10) {
        int i11;
        int i12;
        char charAt;
        long j;
        char c10;
        long j3;
        long j10;
        char c11;
        int i13;
        char charAt2;
        switch (this.f576a) {
            case 0:
                int length = str.length();
                int i14 = i10 + i3;
                int i15 = 0;
                while (i15 < length && (i12 = i15 + i3) < i14 && (charAt = str.charAt(i15)) < 128) {
                    bArr[i12] = (byte) charAt;
                    i15++;
                }
                int i16 = i3 + i15;
                while (i15 < length) {
                    char charAt3 = str.charAt(i15);
                    if (charAt3 < 128 && i16 < i14) {
                        bArr[i16] = (byte) charAt3;
                        i16++;
                    } else if (charAt3 < 2048 && i16 <= i14 - 2) {
                        int i17 = i16 + 1;
                        bArr[i16] = (byte) ((charAt3 >>> 6) | 960);
                        i16 += 2;
                        bArr[i17] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i16 > i14 - 3) {
                            if (i16 > i14 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i11 = i15 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i11)))) {
                                    throw new l1(i15, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i16);
                            }
                            int i18 = i15 + 1;
                            if (i18 != str.length()) {
                                char charAt4 = str.charAt(i18);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i19 = i16 + 3;
                                    bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i16 += 4;
                                    bArr[i19] = (byte) ((codePoint & 63) | 128);
                                    i15 = i18;
                                } else {
                                    i15 = i18;
                                }
                            }
                            throw new l1(i15 - 1, length);
                        }
                        bArr[i16] = (byte) ((charAt3 >>> '\f') | 480);
                        int i20 = i16 + 2;
                        bArr[i16 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i16 += 3;
                        bArr[i20] = (byte) ((charAt3 & '?') | 128);
                    }
                    i15++;
                }
                return i16;
            default:
                long j11 = i3;
                long j12 = i10 + j11;
                int length2 = str.length();
                if (length2 > i10 || bArr.length - i10 < i3) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i3 + i10));
                }
                int i21 = 0;
                while (true) {
                    j = 1;
                    c10 = 128;
                    if (i21 < length2 && (charAt2 = str.charAt(i21)) < 128) {
                        j1.j(bArr, j11, (byte) charAt2);
                        i21++;
                        j11 = 1 + j11;
                    }
                }
                if (i21 == length2) {
                    return (int) j11;
                }
                while (i21 < length2) {
                    char charAt5 = str.charAt(i21);
                    if (charAt5 < c10 && j11 < j12) {
                        j1.j(bArr, j11, (byte) charAt5);
                        c11 = c10;
                        j3 = j;
                        j10 = j11 + j;
                    } else if (charAt5 >= 2048 || j11 > j12 - 2) {
                        j3 = j;
                        if ((charAt5 >= 55296 && 57343 >= charAt5) || j11 > j12 - 3) {
                            long j13 = j11;
                            if (j13 > j12 - 4) {
                                if (55296 <= charAt5 && charAt5 <= 57343 && ((i13 = i21 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i13)))) {
                                    throw new l1(i21, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j13);
                            }
                            int i22 = i21 + 1;
                            if (i22 != length2) {
                                char charAt6 = str.charAt(i22);
                                if (Character.isSurrogatePair(charAt5, charAt6)) {
                                    int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                    j1.j(bArr, j13, (byte) ((codePoint2 >>> 18) | 240));
                                    c11 = 128;
                                    j1.j(bArr, j13 + j3, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    j1.j(bArr, j13 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    j1.j(bArr, j13 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j10 = j13 + 4;
                                    i21 = i22;
                                } else {
                                    i21 = i22;
                                }
                            }
                            throw new l1(i21 - 1, length2);
                        }
                        j1.j(bArr, j11, (byte) ((charAt5 >>> '\f') | 480));
                        long j14 = j11;
                        j1.j(bArr, j11 + j3, (byte) (((charAt5 >>> 6) & 63) | 128));
                        j10 = j14 + 3;
                        j1.j(bArr, j14 + 2, (byte) ((charAt5 & '?') | 128));
                        c11 = 128;
                    } else {
                        j3 = j;
                        j1.j(bArr, j11, (byte) ((charAt5 >>> 6) | 960));
                        j1.j(bArr, j11 + j3, (byte) ((charAt5 & '?') | c10));
                        j10 = j11 + 2;
                        c11 = c10;
                    }
                    i21++;
                    c10 = c11;
                    j11 = j10;
                    j = j3;
                }
                return (int) j11;
        }
    }
}
