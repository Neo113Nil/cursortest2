package io.jsonwebtoken.io;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.cc;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class Base64 {
    private static final char[] BASE64URL_ALPHABET;
    private static final int[] BASE64URL_IALPHABET;
    private static final char[] BASE64_ALPHABET;
    private static final int[] BASE64_IALPHABET;
    static final Base64 DEFAULT;
    private static final int IALPHABET_MAX_INDEX;
    static final Base64 URL_SAFE;
    private final char[] ALPHABET;
    private final int[] IALPHABET;
    private final boolean urlsafe;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        BASE64_ALPHABET = charArray;
        BASE64URL_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
        int[] iArr = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        BASE64_IALPHABET = iArr;
        int[] iArr2 = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        BASE64URL_IALPHABET = iArr2;
        IALPHABET_MAX_INDEX = iArr.length - 1;
        Arrays.fill(iArr, -1);
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        int length = charArray.length;
        for (int i4 = 0; i4 < length; i4++) {
            BASE64_IALPHABET[BASE64_ALPHABET[i4]] = i4;
            BASE64URL_IALPHABET[BASE64URL_ALPHABET[i4]] = i4;
        }
        BASE64_IALPHABET[61] = 0;
        BASE64URL_IALPHABET[61] = 0;
        DEFAULT = new Base64(false);
        URL_SAFE = new Base64(true);
    }

    private Base64(boolean z4) {
        this.urlsafe = z4;
        this.ALPHABET = z4 ? BASE64URL_ALPHABET : BASE64_ALPHABET;
        this.IALPHABET = z4 ? BASE64URL_IALPHABET : BASE64_IALPHABET;
    }

    private int ctoi(char c4) {
        int i4 = c4 > IALPHABET_MAX_INDEX ? -1 : this.IALPHABET[c4];
        if (i4 >= 0) {
            return i4;
        }
        throw new DecodingException("Illegal " + getName() + " character: '" + c4 + "'");
    }

    private char[] encodeToChar(byte[] bArr, boolean z4) {
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            return new char[0];
        }
        int i4 = (length / 3) * 3;
        int i5 = length - i4;
        boolean z5 = true;
        int i6 = length - 1;
        int i7 = ((i6 / 3) + 1) << 2;
        int i8 = i7 + (z4 ? ((i7 - 1) / 76) << 1 : 0);
        char[] cArr = new char[this.urlsafe ? i8 - (i5 == 2 ? 1 : i5 == 1 ? 2 : 0) : i8];
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < i4) {
            int i12 = i9 + 2;
            int i13 = ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9] & 255) << 16);
            i9 += 3;
            int i14 = i13 | (bArr[i12] & 255);
            char[] cArr2 = this.ALPHABET;
            cArr[i10] = cArr2[(i14 >>> 18) & 63];
            cArr[i10 + 1] = cArr2[(i14 >>> 12) & 63];
            cArr[i10 + 2] = cArr2[(i14 >>> 6) & 63];
            boolean z6 = z5;
            int i15 = i10 + 4;
            cArr[i10 + 3] = cArr2[i14 & 63];
            if (z4 && (i11 = i11 + 1) == 19 && i15 < i8 - 2) {
                int i16 = i10 + 5;
                cArr[i15] = '\r';
                i10 += 6;
                cArr[i16] = '\n';
                i11 = 0;
            } else {
                i10 = i15;
            }
            z5 = z6;
        }
        if (i5 > 0) {
            int i17 = ((bArr[i4] & 255) << 10) | (i5 == 2 ? (bArr[i6] & 255) << 2 : 0);
            char[] cArr3 = this.ALPHABET;
            cArr[i8 - 4] = cArr3[i17 >> 12];
            cArr[i8 - 3] = cArr3[(i17 >>> 6) & 63];
            if (i5 == 2) {
                cArr[i8 - 2] = cArr3[i17 & 63];
            } else if (!this.urlsafe) {
                cArr[i8 - 2] = cc.f15727T;
            }
            if (!this.urlsafe) {
                cArr[i8 - 1] = cc.f15727T;
            }
        }
        return cArr;
    }

    private String getName() {
        return this.urlsafe ? "base64url" : "base64";
    }

    final byte[] decodeFast(char[] cArr) {
        int i4;
        int length = cArr != null ? cArr.length : 0;
        if (length == 0) {
            return new byte[0];
        }
        int i5 = length - 1;
        int i6 = 0;
        while (i6 < i5 && this.IALPHABET[cArr[i6]] < 0) {
            i6++;
        }
        while (i5 > 0 && this.IALPHABET[cArr[i5]] < 0) {
            i5--;
        }
        boolean z4 = true;
        int i7 = cArr[i5] == '=' ? cArr[i5 + (-1)] == '=' ? 2 : 1 : 0;
        int i8 = (i5 - i6) + 1;
        if (length > 76) {
            i4 = (cArr[76] == '\r' ? i8 / 78 : 0) << 1;
        } else {
            i4 = 0;
        }
        int i9 = (((i8 - i4) * 6) >> 3) - i7;
        byte[] bArr = new byte[i9];
        int i10 = (i9 / 3) * 3;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i6 + 4;
            int ctoi = (ctoi(cArr[i6 + 1]) << 12) | (ctoi(cArr[i6]) << 18) | (ctoi(cArr[i6 + 2]) << 6) | ctoi(cArr[i6 + 3]);
            bArr[i11] = (byte) (ctoi >> 16);
            int i14 = i11 + 2;
            boolean z5 = z4;
            bArr[i11 + 1] = (byte) (ctoi >> 8);
            i11 += 3;
            bArr[i14] = (byte) ctoi;
            if (i4 <= 0 || (i12 = i12 + 1) != 19) {
                i6 = i13;
            } else {
                i6 += 6;
                i12 = 0;
            }
            z4 = z5;
        }
        if (i11 < i9) {
            int i15 = 0;
            int i16 = 0;
            while (i6 <= i5 - i7) {
                i15 |= ctoi(cArr[i6]) << (18 - (i16 * 6));
                i16++;
                i6++;
            }
            int i17 = 16;
            while (i11 < i9) {
                bArr[i11] = (byte) (i15 >> i17);
                i17 -= 8;
                i11++;
            }
        }
        return bArr;
    }

    final String encodeToString(byte[] bArr, boolean z4) {
        return new String(encodeToChar(bArr, z4));
    }
}
