package androidx.datastore.preferences.protobuf;

import a.AbstractC0086a;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l0 extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1559e;

    public /* synthetic */ l0(int i2) {
        this.f1559e = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // androidx.datastore.preferences.protobuf.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String o(byte[] bArr, int i2, int i3) {
        switch (this.f1559e) {
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
                                if (b3 < -62 || AbstractC0086a.w(b5)) {
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
                                    if (!AbstractC0086a.w(b6)) {
                                        if ((((b6 + 112) + (b3 << 28)) >> 30) == 0 && !AbstractC0086a.w(b7) && !AbstractC0086a.w(b8)) {
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
                                if (AbstractC0086a.w(b9) || ((b3 == -32 && b9 < -96) || ((b3 == -19 && b9 >= -96) || AbstractC0086a.w(b10)))) {
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
                Charset charset = AbstractC0112y.f1602a;
                String str = new String(bArr, i2, i3, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                    throw A.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r27 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int q(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        char charAt;
        long j2;
        char c2;
        long j3;
        long j4;
        char c3;
        int i6;
        char charAt2;
        switch (this.f1559e) {
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
                                    throw new m0(i8, length);
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
                            throw new m0(i8 - 1, length);
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
                long j5 = i2;
                long j6 = i3 + j5;
                int length2 = str.length();
                if (length2 > i3 || bArr.length - i3 < i2) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i2 + i3));
                }
                int i14 = 0;
                while (true) {
                    j2 = 1;
                    c2 = 128;
                    if (i14 < length2 && (charAt2 = str.charAt(i14)) < 128) {
                        j0.j(bArr, j5, (byte) charAt2);
                        i14++;
                        j5 = 1 + j5;
                    }
                }
                if (i14 == length2) {
                    return (int) j5;
                }
                while (i14 < length2) {
                    char charAt5 = str.charAt(i14);
                    if (charAt5 < c2 && j5 < j6) {
                        j0.j(bArr, j5, (byte) charAt5);
                        c3 = c2;
                        j3 = j2;
                        j4 = j5 + j2;
                    } else if (charAt5 >= 2048 || j5 > j6 - 2) {
                        j3 = j2;
                        if ((charAt5 >= 55296 && 57343 >= charAt5) || j5 > j6 - 3) {
                            long j7 = j5;
                            if (j7 > j6 - 4) {
                                if (55296 <= charAt5 && charAt5 <= 57343 && ((i6 = i14 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i6)))) {
                                    throw new m0(i14, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt5 + " at index " + j7);
                            }
                            int i15 = i14 + 1;
                            if (i15 != length2) {
                                char charAt6 = str.charAt(i15);
                                if (Character.isSurrogatePair(charAt5, charAt6)) {
                                    int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                    j0.j(bArr, j7, (byte) ((codePoint2 >>> 18) | 240));
                                    c3 = 128;
                                    j0.j(bArr, j7 + j3, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    j0.j(bArr, j7 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    j0.j(bArr, j7 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j4 = j7 + 4;
                                    i14 = i15;
                                } else {
                                    i14 = i15;
                                }
                            }
                            throw new m0(i14 - 1, length2);
                        }
                        j0.j(bArr, j5, (byte) ((charAt5 >>> '\f') | 480));
                        long j8 = j5;
                        j0.j(bArr, j5 + j3, (byte) (((charAt5 >>> 6) & 63) | 128));
                        j4 = j8 + 3;
                        j0.j(bArr, j8 + 2, (byte) ((charAt5 & '?') | 128));
                        c3 = 128;
                    } else {
                        j3 = j2;
                        j0.j(bArr, j5, (byte) ((charAt5 >>> 6) | 960));
                        j0.j(bArr, j5 + j3, (byte) ((charAt5 & '?') | c2));
                        j4 = j5 + 2;
                        c3 = c2;
                    }
                    i14++;
                    c2 = c3;
                    j5 = j4;
                    j2 = j3;
                }
                return (int) j5;
        }
    }
}
