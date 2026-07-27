package androidx.datastore.preferences.protobuf;

import a.AbstractC0169a;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 extends AbstractC0169a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4466g;

    public /* synthetic */ j0(int i2) {
        this.f4466g = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // a.AbstractC0169a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String h(byte[] bArr, int i2, int i3) {
        switch (this.f4466g) {
            case 0:
                if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
                }
                int i6 = i2 + i3;
                char[] cArr = new char[i3];
                int i7 = 0;
                while (i2 < i6) {
                    byte b6 = bArr[i2];
                    if (b6 < 0) {
                        while (i2 < i6) {
                            int i8 = i2 + 1;
                            byte b7 = bArr[i2];
                            if (b7 >= 0) {
                                int i9 = i7 + 1;
                                cArr[i7] = (char) b7;
                                while (i8 < i6) {
                                    byte b8 = bArr[i8];
                                    if (b8 >= 0) {
                                        i8++;
                                        cArr[i9] = (char) b8;
                                        i9++;
                                    } else {
                                        i7 = i9;
                                        i2 = i8;
                                    }
                                }
                                i7 = i9;
                                i2 = i8;
                            } else if (b7 < -32) {
                                if (i8 >= i6) {
                                    throw C0230z.a();
                                }
                                i2 += 2;
                                byte b9 = bArr[i8];
                                int i10 = i7 + 1;
                                if (b7 < -62 || K1.b.V(b9)) {
                                    throw C0230z.a();
                                }
                                cArr[i7] = (char) ((b9 & 63) | ((b7 & 31) << 6));
                                i7 = i10;
                            } else {
                                if (b7 >= -16) {
                                    if (i8 >= i6 - 2) {
                                        throw C0230z.a();
                                    }
                                    byte b10 = bArr[i8];
                                    int i11 = i2 + 3;
                                    byte b11 = bArr[i2 + 2];
                                    i2 += 4;
                                    byte b12 = bArr[i11];
                                    int i12 = i7 + 1;
                                    if (!K1.b.V(b10)) {
                                        if ((((b10 + 112) + (b7 << 28)) >> 30) == 0 && !K1.b.V(b11) && !K1.b.V(b12)) {
                                            int i13 = ((b10 & 63) << 12) | ((b7 & 7) << 18) | ((b11 & 63) << 6) | (b12 & 63);
                                            cArr[i7] = (char) ((i13 >>> 10) + 55232);
                                            cArr[i12] = (char) ((i13 & 1023) + 56320);
                                            i7 += 2;
                                        }
                                    }
                                    throw C0230z.a();
                                }
                                if (i8 >= i6 - 1) {
                                    throw C0230z.a();
                                }
                                int i14 = i2 + 2;
                                byte b13 = bArr[i8];
                                i2 += 3;
                                byte b14 = bArr[i14];
                                int i15 = i7 + 1;
                                if (K1.b.V(b13) || ((b7 == -32 && b13 < -96) || ((b7 == -19 && b13 >= -96) || K1.b.V(b14)))) {
                                    throw C0230z.a();
                                }
                                cArr[i7] = (char) (((b13 & 63) << 6) | ((b7 & 15) << 12) | (b14 & 63));
                                i7 = i15;
                            }
                        }
                        return new String(cArr, 0, i7);
                    }
                    i2++;
                    cArr[i7] = (char) b6;
                    i7++;
                }
                while (i2 < i6) {
                }
                return new String(cArr, 0, i7);
            default:
                Charset charset = AbstractC0228x.f4508a;
                String str = new String(bArr, i2, i3, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                    throw C0230z.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return r26 + r3;
     */
    @Override // a.AbstractC0169a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(String str, byte[] bArr, int i2, int i3) {
        int i6;
        int i7;
        char charAt;
        long j2;
        String str2;
        String str3;
        int i8;
        char charAt2;
        switch (this.f4466g) {
            case 0:
                int length = str.length();
                int i9 = i3 + i2;
                int i10 = 0;
                while (i10 < length && (i7 = i10 + i2) < i9 && (charAt = str.charAt(i10)) < 128) {
                    bArr[i7] = (byte) charAt;
                    i10++;
                }
                int i11 = i2 + i10;
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
                                    throw new k0(i10, length);
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
                            throw new k0(i10 - 1, length);
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
                long j6 = i2;
                long j7 = i3 + j6;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i3 || bArr.length - i3 < i2) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i2 + i3));
                }
                int i16 = 0;
                while (true) {
                    j2 = 1;
                    if (i16 < length2 && (charAt2 = str.charAt(i16)) < 128) {
                        i0.j(bArr, j6, (byte) charAt2);
                        i16++;
                        j6 = 1 + j6;
                    }
                }
                if (i16 != length2) {
                    while (i16 < length2) {
                        char charAt5 = str.charAt(i16);
                        if (charAt5 < 128 && j6 < j7) {
                            i0.j(bArr, j6, (byte) charAt5);
                            str3 = str5;
                            j6 += j2;
                            str2 = str4;
                        } else if (charAt5 >= 2048 || j6 > j7 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j6 > j7 - 3) {
                                if (j6 > j7 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i8 = i16 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i8)))) {
                                        throw new k0(i16, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + charAt5 + str2 + j6);
                                }
                                int i17 = i16 + 1;
                                if (i17 != length2) {
                                    char charAt6 = str.charAt(i17);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        i0.j(bArr, j6, (byte) ((codePoint2 >>> 18) | 240));
                                        i0.j(bArr, j6 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j8 = 3 + j6;
                                        i0.j(bArr, j6 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j6 += 4;
                                        i0.j(bArr, j8, (byte) ((codePoint2 & 63) | 128));
                                        i16 = i17;
                                    } else {
                                        i16 = i17;
                                    }
                                }
                                throw new k0(i16 - 1, length2);
                            }
                            i0.j(bArr, j6, (byte) ((charAt5 >>> '\f') | 480));
                            long j9 = j6 + 2;
                            i0.j(bArr, j6 + 1, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j6 += 3;
                            i0.j(bArr, j9, (byte) ((charAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j10 = j6 + j2;
                            i0.j(bArr, j6, (byte) ((charAt5 >>> 6) | 960));
                            j6 += 2;
                            i0.j(bArr, j10, (byte) ((charAt5 & '?') | 128));
                        }
                        i16++;
                        str4 = str2;
                        str5 = str3;
                        j2 = 1;
                    }
                }
                return (int) j6;
        }
    }
}
