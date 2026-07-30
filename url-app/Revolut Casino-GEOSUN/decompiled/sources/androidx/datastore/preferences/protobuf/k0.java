package androidx.datastore.preferences.protobuf;

import a.AbstractC0069a;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k0 extends AbstractC0069a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1470i;

    public /* synthetic */ k0(int i2) {
        this.f1470i = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // a.AbstractC0069a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String j(byte[] bArr, int i2, int i3) {
        switch (this.f1470i) {
            case 0:
                if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
                }
                int i4 = i2 + i3;
                char[] cArr = new char[i3];
                int i5 = 0;
                while (i2 < i4) {
                    byte b2 = bArr[i2];
                    if (b2 < 0) {
                        while (i2 < i4) {
                            int i6 = i2 + 1;
                            byte b3 = bArr[i2];
                            if (b3 >= 0) {
                                int i7 = i5 + 1;
                                cArr[i5] = (char) b3;
                                while (i6 < i4) {
                                    byte b4 = bArr[i6];
                                    if (b4 >= 0) {
                                        i6++;
                                        cArr[i7] = (char) b4;
                                        i7++;
                                    } else {
                                        i5 = i7;
                                        i2 = i6;
                                    }
                                }
                                i5 = i7;
                                i2 = i6;
                            } else if (b3 < -32) {
                                if (i6 >= i4) {
                                    throw A.a();
                                }
                                i2 += 2;
                                byte b5 = bArr[i6];
                                int i8 = i5 + 1;
                                if (b3 < -62 || AbstractC0069a.t(b5)) {
                                    throw A.a();
                                }
                                cArr[i5] = (char) ((b5 & 63) | ((b3 & 31) << 6));
                                i5 = i8;
                            } else {
                                if (b3 >= -16) {
                                    if (i6 >= i4 - 2) {
                                        throw A.a();
                                    }
                                    byte b6 = bArr[i6];
                                    int i9 = i2 + 3;
                                    byte b7 = bArr[i2 + 2];
                                    i2 += 4;
                                    byte b8 = bArr[i9];
                                    int i10 = i5 + 1;
                                    if (!AbstractC0069a.t(b6)) {
                                        if ((((b6 + 112) + (b3 << 28)) >> 30) == 0 && !AbstractC0069a.t(b7) && !AbstractC0069a.t(b8)) {
                                            int i11 = ((b6 & 63) << 12) | ((b3 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i5] = (char) ((i11 >>> 10) + 55232);
                                            cArr[i10] = (char) ((i11 & 1023) + 56320);
                                            i5 += 2;
                                        }
                                    }
                                    throw A.a();
                                }
                                if (i6 >= i4 - 1) {
                                    throw A.a();
                                }
                                int i12 = i2 + 2;
                                byte b9 = bArr[i6];
                                i2 += 3;
                                byte b10 = bArr[i12];
                                int i13 = i5 + 1;
                                if (AbstractC0069a.t(b9) || ((b3 == -32 && b9 < -96) || ((b3 == -19 && b9 >= -96) || AbstractC0069a.t(b10)))) {
                                    throw A.a();
                                }
                                cArr[i5] = (char) (((b9 & 63) << 6) | ((b3 & 15) << 12) | (b10 & 63));
                                i5 = i13;
                            }
                        }
                        return new String(cArr, 0, i5);
                    }
                    i2++;
                    cArr[i5] = (char) b2;
                    i5++;
                }
                while (i2 < i4) {
                }
                return new String(cArr, 0, i5);
            default:
                Charset charset = AbstractC0094y.f1512a;
                String str = new String(bArr, i2, i3, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                    throw A.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return r26 + r3;
     */
    @Override // a.AbstractC0069a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        char charAt;
        long j2;
        String str2;
        String str3;
        int i6;
        char charAt2;
        switch (this.f1470i) {
            case 0:
                int length = str.length();
                int i7 = i3 + i2;
                int i8 = 0;
                while (i8 < length && (i5 = i8 + i2) < i7 && (charAt = str.charAt(i8)) < 128) {
                    bArr[i5] = (byte) charAt;
                    i8++;
                }
                int i9 = i2 + i8;
                while (i8 < length) {
                    char charAt3 = str.charAt(i8);
                    if (charAt3 < 128 && i9 < i7) {
                        bArr[i9] = (byte) charAt3;
                        i9++;
                    } else if (charAt3 < 2048 && i9 <= i7 - 2) {
                        int i10 = i9 + 1;
                        bArr[i9] = (byte) ((charAt3 >>> 6) | 960);
                        i9 += 2;
                        bArr[i10] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i9 > i7 - 3) {
                            if (i9 > i7 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i4 = i8 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i4)))) {
                                    throw new l0(i8, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i9);
                            }
                            int i11 = i8 + 1;
                            if (i11 != str.length()) {
                                char charAt4 = str.charAt(i11);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i12 = i9 + 3;
                                    bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i9 += 4;
                                    bArr[i12] = (byte) ((codePoint & 63) | 128);
                                    i8 = i11;
                                } else {
                                    i8 = i11;
                                }
                            }
                            throw new l0(i8 - 1, length);
                        }
                        bArr[i9] = (byte) ((charAt3 >>> '\f') | 480);
                        int i13 = i9 + 2;
                        bArr[i9 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i9 += 3;
                        bArr[i13] = (byte) ((charAt3 & '?') | 128);
                    }
                    i8++;
                }
                return i9;
            default:
                long j3 = i2;
                long j4 = i3 + j3;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i3 || bArr.length - i3 < i2) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i2 + i3));
                }
                int i14 = 0;
                while (true) {
                    j2 = 1;
                    if (i14 < length2 && (charAt2 = str.charAt(i14)) < 128) {
                        j0.j(bArr, j3, (byte) charAt2);
                        i14++;
                        j3 = 1 + j3;
                    }
                }
                if (i14 != length2) {
                    while (i14 < length2) {
                        char charAt5 = str.charAt(i14);
                        if (charAt5 < 128 && j3 < j4) {
                            j0.j(bArr, j3, (byte) charAt5);
                            str3 = str5;
                            j3 += j2;
                            str2 = str4;
                        } else if (charAt5 >= 2048 || j3 > j4 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j3 > j4 - 3) {
                                if (j3 > j4 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i6 = i14 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i6)))) {
                                        throw new l0(i14, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + charAt5 + str2 + j3);
                                }
                                int i15 = i14 + 1;
                                if (i15 != length2) {
                                    char charAt6 = str.charAt(i15);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        j0.j(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                        j0.j(bArr, j3 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j5 = 3 + j3;
                                        j0.j(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j3 += 4;
                                        j0.j(bArr, j5, (byte) ((codePoint2 & 63) | 128));
                                        i14 = i15;
                                    } else {
                                        i14 = i15;
                                    }
                                }
                                throw new l0(i14 - 1, length2);
                            }
                            j0.j(bArr, j3, (byte) ((charAt5 >>> '\f') | 480));
                            long j6 = j3 + 2;
                            j0.j(bArr, j3 + 1, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j3 += 3;
                            j0.j(bArr, j6, (byte) ((charAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j7 = j3 + j2;
                            j0.j(bArr, j3, (byte) ((charAt5 >>> 6) | 960));
                            j3 += 2;
                            j0.j(bArr, j7, (byte) ((charAt5 & '?') | 128));
                        }
                        i14++;
                        str4 = str2;
                        str5 = str3;
                        j2 = 1;
                    }
                }
                return (int) j3;
        }
    }
}
