package kotlin.text;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.collections.AbstractList;
import kotlin.text.HexFormat;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class HexExtensionsKt {
    public static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS;
    public static final int[] BYTE_TO_UPPER_CASE_HEX_DIGITS;
    public static final int[] HEX_DIGITS_TO_DECIMAL;
    public static final long[] HEX_DIGITS_TO_LONG_DECIMAL;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        BYTE_TO_LOWER_CASE_HEX_DIGITS = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        BYTE_TO_UPPER_CASE_HEX_DIGITS = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr3;
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        HEX_DIGITS_TO_LONG_DECIMAL = jArr;
    }

    public static final int checkFormatLength(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        ULong.Companion companion = ULong.Companion;
        Path$$ExternalSyntheticBUOutline0.m(UnsignedKt.ulongToString(10, j), "The resulting string length is too big: ");
        return 0;
    }

    public static final int formatByteAt(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    public static final byte parseByteAt(int i, String str) {
        int[] iArr;
        int i2;
        int i3;
        char charAt = str.charAt(i);
        if ((charAt >>> '\b') != 0 || (i2 = (iArr = HEX_DIGITS_TO_DECIMAL)[charAt]) < 0) {
            throwInvalidDigitAt(i, str);
            throw null;
        }
        int i4 = i + 1;
        char charAt2 = str.charAt(i4);
        if ((charAt2 >>> '\b') == 0 && (i3 = iArr[charAt2]) >= 0) {
            return (byte) ((i2 << 4) | i3);
        }
        throwInvalidDigitAt(i4, str);
        throw null;
    }

    public static final void throwInvalidDigitAt(int i, String str) {
        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Expected a hexadecimal digit at index ", ", but was ");
        m2m.append(str.charAt(i));
        throw new NumberFormatException(m2m.toString());
    }

    public static final int toCharArrayIfNotEmpty(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }

    public static String toHexString$default(byte[] bArr) {
        HexFormat.Companion.getClass();
        HexFormat hexFormat = HexFormat.Default;
        bArr.getClass();
        hexFormat.getClass();
        int length = bArr.length;
        AbstractList.Companion companion = AbstractList.Companion;
        int length2 = bArr.length;
        companion.getClass();
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(0, length, length2);
        if (length == 0) {
            return "";
        }
        int[] iArr = hexFormat.upperCase ? BYTE_TO_UPPER_CASE_HEX_DIGITS : BYTE_TO_LOWER_CASE_HEX_DIGITS;
        HexFormat.BytesHexFormat bytesHexFormat = hexFormat.bytes;
        if (bytesHexFormat.noLineAndGroupSeparator) {
            if (bytesHexFormat.shortByteSeparatorNoPrefixAndSuffix) {
                char[] cArr = new char[checkFormatLength(length * 2)];
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    i = formatByteAt(bArr, i2, iArr, cArr, i);
                }
                return new String(cArr);
            }
            if (length <= 0) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                return null;
            }
            char[] cArr2 = new char[checkFormatLength(length * 2)];
            int charArrayIfNotEmpty = toCharArrayIfNotEmpty("", cArr2, formatByteAt(bArr, 0, iArr, cArr2, toCharArrayIfNotEmpty("", cArr2, 0)));
            for (int i3 = 1; i3 < length; i3++) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty("", cArr2, formatByteAt(bArr, i3, iArr, cArr2, toCharArrayIfNotEmpty("", cArr2, toCharArrayIfNotEmpty("", cArr2, charArrayIfNotEmpty))));
            }
            return new String(cArr2);
        }
        if (length <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return null;
        }
        int i4 = (length - 1) / Integer.MAX_VALUE;
        int i5 = length % Integer.MAX_VALUE;
        if (i5 == 0) {
            i5 = Integer.MAX_VALUE;
        }
        int checkFormatLength = checkFormatLength((2 * length) + (((i5 - 1) / Integer.MAX_VALUE) * 2) + i4);
        char[] cArr3 = new char[checkFormatLength];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            if (i7 == Integer.MAX_VALUE) {
                cArr3[i6] = '\n';
                i8 = 0;
                i6++;
                i7 = 0;
            } else if (i8 == Integer.MAX_VALUE) {
                i6 = toCharArrayIfNotEmpty("  ", cArr3, i6);
                i8 = 0;
            }
            if (i8 != 0) {
                i6 = toCharArrayIfNotEmpty("", cArr3, i6);
            }
            i6 = toCharArrayIfNotEmpty("", cArr3, formatByteAt(bArr, i9, iArr, cArr3, toCharArrayIfNotEmpty("", cArr3, i6)));
            i8++;
            i7++;
        }
        if (i6 == checkFormatLength) {
            return new String(cArr3);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        return null;
    }

    public static final long wholeElementsPerSet(int i, long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }
}
