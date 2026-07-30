package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class UPCEANExtension5Support {
    private static final int[] CHECK_DIGIT_ENCODINGS = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    private final int[] decodeMiddleCounters = new int[4];
    private final StringBuilder decodeRowStringBuffer = new StringBuilder();

    UPCEANExtension5Support() {
    }

    private int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.decodeMiddleCounters;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i8 = iArr[1];
        int i9 = 0;
        for (int i10 = 0; i10 < 5 && i8 < size; i10++) {
            int decodeDigit = UPCEANReader.decodeDigit(bitArray, iArr2, i8, UPCEANReader.L_AND_G_PATTERNS);
            sb.append((char) ((decodeDigit % 10) + 48));
            for (int i11 : iArr2) {
                i8 += i11;
            }
            if (decodeDigit >= 10) {
                i9 |= 1 << (4 - i10);
            }
            if (i10 != 4) {
                i8 = bitArray.getNextUnset(bitArray.getNextSet(i8));
            }
        }
        if (sb.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (extensionChecksum(sb.toString()) == determineCheckDigit(i9)) {
            return i8;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int determineCheckDigit(int i8) {
        for (int i9 = 0; i9 < 10; i9++) {
            if (i8 == CHECK_DIGIT_ENCODINGS[i9]) {
                return i9;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int extensionChecksum(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        for (int i9 = length - 2; i9 >= 0; i9 -= 2) {
            i8 += charSequence.charAt(i9) - '0';
        }
        int i10 = i8 * 3;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            i10 += charSequence.charAt(i11) - '0';
        }
        return (i10 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r5.equals("90000") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String parseExtension5String(String str) {
        String str2;
        char c8 = 0;
        char charAt = str.charAt(0);
        if (charAt == '0') {
            str2 = "£";
        } else if (charAt != '5') {
            str2 = "";
            if (charAt == '9') {
                switch (str.hashCode()) {
                    case 54118329:
                        break;
                    case 54395376:
                        if (str.equals("99990")) {
                            c8 = 1;
                            break;
                        }
                        c8 = 65535;
                        break;
                    case 54395377:
                        if (str.equals("99991")) {
                            c8 = 2;
                            break;
                        }
                        c8 = 65535;
                        break;
                    default:
                        c8 = 65535;
                        break;
                }
                switch (c8) {
                    case 0:
                        return null;
                    case 1:
                        return "Used";
                    case 2:
                        return "0.00";
                }
            }
        } else {
            str2 = "$";
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf = String.valueOf(parseInt / 100);
        int i8 = parseInt % 100;
        return str2 + valueOf + '.' + (i8 < 10 ? "0".concat(String.valueOf(i8)) : String.valueOf(i8));
    }

    private static Map<ResultMetadataType, Object> parseExtensionString(String str) {
        String parseExtension5String;
        if (str.length() != 5 || (parseExtension5String = parseExtension5String(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put((EnumMap) ResultMetadataType.SUGGESTED_PRICE, (ResultMetadataType) parseExtension5String);
        return enumMap;
    }

    Result decodeRow(int i8, BitArray bitArray, int[] iArr) {
        StringBuilder sb = this.decodeRowStringBuffer;
        sb.setLength(0);
        int decodeMiddle = decodeMiddle(bitArray, iArr, sb);
        String sb2 = sb.toString();
        Map<ResultMetadataType, Object> parseExtensionString = parseExtensionString(sb2);
        float f8 = i8;
        Result result = new Result(sb2, null, new ResultPoint[]{new ResultPoint((iArr[0] + iArr[1]) / 2.0f, f8), new ResultPoint(decodeMiddle, f8)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (parseExtensionString != null) {
            result.putAllMetadata(parseExtensionString);
        }
        return result;
    }
}
