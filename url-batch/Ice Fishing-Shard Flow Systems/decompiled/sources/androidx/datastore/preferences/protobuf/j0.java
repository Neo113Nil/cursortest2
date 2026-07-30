package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 extends V6.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3528b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i2) {
        super(12);
        this.f3528b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // V6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String t(byte[] bArr, int i2, int i5) {
        switch (this.f3528b) {
            case 0:
                if ((i2 | i5 | ((bArr.length - i2) - i5)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i5)));
                }
                int i7 = i2 + i5;
                char[] cArr = new char[i5];
                int i8 = 0;
                while (i2 < i7) {
                    byte b7 = bArr[i2];
                    if (b7 < 0) {
                        while (i2 < i7) {
                            int i9 = i2 + 1;
                            byte b8 = bArr[i2];
                            if (b8 >= 0) {
                                int i10 = i8 + 1;
                                cArr[i8] = (char) b8;
                                while (i9 < i7) {
                                    byte b9 = bArr[i9];
                                    if (b9 >= 0) {
                                        i9++;
                                        cArr[i10] = (char) b9;
                                        i10++;
                                    } else {
                                        i8 = i10;
                                        i2 = i9;
                                    }
                                }
                                i8 = i10;
                                i2 = i9;
                            } else if (b8 < -32) {
                                if (i9 >= i7) {
                                    throw C0209z.a();
                                }
                                i2 += 2;
                                byte b10 = bArr[i9];
                                int i11 = i8 + 1;
                                if (b8 < -62 || P0.f.z(b10)) {
                                    throw C0209z.a();
                                }
                                cArr[i8] = (char) ((b10 & 63) | ((b8 & 31) << 6));
                                i8 = i11;
                            } else {
                                if (b8 >= -16) {
                                    if (i9 >= i7 - 2) {
                                        throw C0209z.a();
                                    }
                                    byte b11 = bArr[i9];
                                    int i12 = i2 + 3;
                                    byte b12 = bArr[i2 + 2];
                                    i2 += 4;
                                    byte b13 = bArr[i12];
                                    int i13 = i8 + 1;
                                    if (!P0.f.z(b11)) {
                                        if ((((b11 + 112) + (b8 << 28)) >> 30) == 0 && !P0.f.z(b12) && !P0.f.z(b13)) {
                                            int i14 = ((b11 & 63) << 12) | ((b8 & 7) << 18) | ((b12 & 63) << 6) | (b13 & 63);
                                            cArr[i8] = (char) ((i14 >>> 10) + 55232);
                                            cArr[i13] = (char) ((i14 & 1023) + 56320);
                                            i8 += 2;
                                        }
                                    }
                                    throw C0209z.a();
                                }
                                if (i9 >= i7 - 1) {
                                    throw C0209z.a();
                                }
                                int i15 = i2 + 2;
                                byte b14 = bArr[i9];
                                i2 += 3;
                                byte b15 = bArr[i15];
                                int i16 = i8 + 1;
                                if (P0.f.z(b14) || ((b8 == -32 && b14 < -96) || ((b8 == -19 && b14 >= -96) || P0.f.z(b15)))) {
                                    throw C0209z.a();
                                }
                                cArr[i8] = (char) (((b14 & 63) << 6) | ((b8 & 15) << 12) | (b15 & 63));
                                i8 = i16;
                            }
                        }
                        return new String(cArr, 0, i8);
                    }
                    i2++;
                    cArr[i8] = (char) b7;
                    i8++;
                }
                while (i2 < i7) {
                }
                return new String(cArr, 0, i8);
            default:
                Charset charset = AbstractC0207x.f3571a;
                String str = new String(bArr, i2, i5, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i5 + i2))) {
                    throw C0209z.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r27 + r3;
     */
    @Override // V6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int y(String str, byte[] bArr, int i2, int i5) {
        int i7;
        int i8;
        char charAt;
        long j;
        char c7;
        long j7;
        long j8;
        char c8;
        int i9;
        char charAt2;
        switch (this.f3528b) {
            case 0:
                int length = str.length();
                int i10 = i5 + i2;
                int i11 = 0;
                while (i11 < length && (i8 = i11 + i2) < i10 && (charAt = str.charAt(i11)) < 128) {
                    bArr[i8] = (byte) charAt;
                    i11++;
                }
                int i12 = i2 + i11;
                while (i11 < length) {
                    char charAt3 = str.charAt(i11);
                    if (charAt3 < 128 && i12 < i10) {
                        bArr[i12] = (byte) charAt3;
                        i12++;
                    } else if (charAt3 < 2048 && i12 <= i10 - 2) {
                        int i13 = i12 + 1;
                        bArr[i12] = (byte) ((charAt3 >>> 6) | 960);
                        i12 += 2;
                        bArr[i13] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i12 > i10 - 3) {
                            if (i12 > i10 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i7 = i11 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i7)))) {
                                    throw new k0(i11, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i12);
                            }
                            int i14 = i11 + 1;
                            if (i14 != str.length()) {
                                char charAt4 = str.charAt(i14);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i12] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i12 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i15 = i12 + 3;
                                    bArr[i12 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i12 += 4;
                                    bArr[i15] = (byte) ((codePoint & 63) | 128);
                                    i11 = i14;
                                } else {
                                    i11 = i14;
                                }
                            }
                            throw new k0(i11 - 1, length);
                        }
                        bArr[i12] = (byte) ((charAt3 >>> '\f') | 480);
                        int i16 = i12 + 2;
                        bArr[i12 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i12 += 3;
                        bArr[i16] = (byte) ((charAt3 & '?') | 128);
                    }
                    i11++;
                }
                return i12;
            default:
                long j9 = i2;
                long j10 = i5 + j9;
                int length2 = str.length();
                if (length2 > i5 || bArr.length - i5 < i2) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i2 + i5));
                }
                int i17 = 0;
                while (true) {
                    j = 1;
                    c7 = 128;
                    if (i17 < length2 && (charAt2 = str.charAt(i17)) < 128) {
                        i0.j(bArr, (byte) charAt2, j9);
                        i17++;
                        j9 = 1 + j9;
                    }
                }
                if (i17 == length2) {
                    return (int) j9;
                }
                while (i17 < length2) {
                    char charAt5 = str.charAt(i17);
                    if (charAt5 < c7 && j9 < j10) {
                        i0.j(bArr, (byte) charAt5, j9);
                        c8 = c7;
                        j7 = j;
                        j8 = j9 + j;
                    } else if (charAt5 >= 2048 || j9 > j10 - 2) {
                        j7 = j;
                        if ((charAt5 >= 55296 && 57343 >= charAt5) || j9 > j10 - 3) {
                            long j11 = j9;
                            if (j11 > j10 - 4) {
                                if (55296 <= charAt5 && charAt5 <= 57343 && ((i9 = i17 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i9)))) {
                                    throw new k0(i17, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j11);
                            }
                            int i18 = i17 + 1;
                            if (i18 != length2) {
                                char charAt6 = str.charAt(i18);
                                if (Character.isSurrogatePair(charAt5, charAt6)) {
                                    int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                    i0.j(bArr, (byte) ((codePoint2 >>> 18) | 240), j11);
                                    c8 = 128;
                                    i0.j(bArr, (byte) (((codePoint2 >>> 12) & 63) | 128), j11 + j7);
                                    i0.j(bArr, (byte) (((codePoint2 >>> 6) & 63) | 128), j11 + 2);
                                    i0.j(bArr, (byte) ((codePoint2 & 63) | 128), j11 + 3);
                                    j8 = j11 + 4;
                                    i17 = i18;
                                } else {
                                    i17 = i18;
                                }
                            }
                            throw new k0(i17 - 1, length2);
                        }
                        i0.j(bArr, (byte) ((charAt5 >>> '\f') | 480), j9);
                        long j12 = j9;
                        i0.j(bArr, (byte) (((charAt5 >>> 6) & 63) | 128), j9 + j7);
                        j8 = j12 + 3;
                        i0.j(bArr, (byte) ((charAt5 & '?') | 128), j12 + 2);
                        c8 = 128;
                    } else {
                        j7 = j;
                        i0.j(bArr, (byte) ((charAt5 >>> 6) | 960), j9);
                        i0.j(bArr, (byte) ((charAt5 & '?') | c7), j9 + j7);
                        j8 = j9 + 2;
                        c8 = c7;
                    }
                    i17++;
                    c7 = c8;
                    j9 = j8;
                    j = j7;
                }
                return (int) j9;
        }
    }
}
