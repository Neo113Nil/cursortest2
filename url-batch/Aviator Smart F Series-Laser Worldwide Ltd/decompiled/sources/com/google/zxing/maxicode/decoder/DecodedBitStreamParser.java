package com.google.zxing.maxicode.decoder;

import a4.a;
import com.google.zxing.common.DecoderResult;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import java.text.DecimalFormat;

/* loaded from: classes4.dex */
final class DecodedBitStreamParser {
    private static final char ECI = 65530;
    private static final char FS = 28;
    private static final char GS = 29;
    private static final char LATCHA = 65527;
    private static final char LATCHB = 65528;
    private static final char LOCK = 65529;
    private static final char NS = 65531;
    private static final char PAD = 65532;
    private static final char RS = 30;
    private static final String[] SETS = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};
    private static final char SHIFTA = 65520;
    private static final char SHIFTB = 65521;
    private static final char SHIFTC = 65522;
    private static final char SHIFTD = 65523;
    private static final char SHIFTE = 65524;
    private static final char THREESHIFTA = 65526;
    private static final char TWOSHIFTA = 65525;

    private DecodedBitStreamParser() {
    }

    static DecoderResult decode(byte[] bArr, int i8) {
        String postCode3;
        StringBuilder sb = new StringBuilder(GattError.GATT_DUP_REG);
        if (i8 == 2 || i8 == 3) {
            if (i8 == 2) {
                postCode3 = new DecimalFormat("0000000000".substring(0, getPostCode2Length(bArr))).format(getPostCode2(bArr));
            } else {
                postCode3 = getPostCode3(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format(getCountry(bArr));
            String format2 = decimalFormat.format(getServiceClass(bArr));
            sb.append(getMessage(bArr, 10, 84));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                sb.insert(9, postCode3 + GS + format + GS + format2 + GS);
            } else {
                sb.insert(0, postCode3 + GS + format + GS + format2 + GS);
            }
        } else if (i8 == 4) {
            sb.append(getMessage(bArr, 1, 93));
        } else if (i8 == 5) {
            sb.append(getMessage(bArr, 1, 77));
        }
        return new DecoderResult(bArr, sb.toString(), null, String.valueOf(i8));
    }

    private static int getBit(int i8, byte[] bArr) {
        int i9 = i8 - 1;
        return ((1 << (5 - (i9 % 6))) & bArr[i9 / 6]) == 0 ? 0 : 1;
    }

    private static int getCountry(byte[] bArr) {
        return getInt(bArr, new byte[]{53, 54, 43, a.f72p0, 45, a.f78r0, 47, 48, 37, a.f50j0});
    }

    private static int getInt(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int i8 = 0;
        for (int i9 = 0; i9 < bArr2.length; i9++) {
            i8 += getBit(bArr2[i9], bArr) << ((bArr2.length - i9) - 1);
        }
        return i8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static String getMessage(byte[] bArr, int i8, int i9) {
        StringBuilder sb = new StringBuilder();
        int i10 = i8;
        int i11 = 0;
        int i12 = -1;
        int i13 = 0;
        while (i10 < i8 + i9) {
            char charAt = SETS[i11].charAt(bArr[i10]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i13 = i11;
                    i11 = charAt - SHIFTA;
                    i12 = 1;
                    break;
                case 65525:
                    i12 = 2;
                    i13 = i11;
                    i11 = 0;
                    break;
                case 65526:
                    i12 = 3;
                    i13 = i11;
                    i11 = 0;
                    break;
                case 65527:
                    i11 = 0;
                    i12 = -1;
                    break;
                case 65528:
                    i11 = 1;
                    i12 = -1;
                    break;
                case 65529:
                    i12 = -1;
                    break;
                case 65530:
                default:
                    sb.append(charAt);
                    break;
                case 65531:
                    int i14 = (bArr[i10 + 1] << 24) + (bArr[i10 + 2] << 18) + (bArr[i10 + 3] << 12) + (bArr[i10 + 4] << 6);
                    i10 += 5;
                    sb.append(new DecimalFormat("000000000").format(i14 + bArr[i10]));
                    break;
            }
            int i15 = i12 - 1;
            if (i12 == 0) {
                i11 = i13;
            }
            i10++;
            i12 = i15;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private static int getPostCode2(byte[] bArr) {
        return getInt(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    private static int getPostCode2Length(byte[] bArr) {
        return getInt(bArr, new byte[]{39, a.f58l0, 41, a.f66n0, 31, 32});
    }

    private static String getPostCode3(byte[] bArr) {
        String[] strArr = SETS;
        return String.valueOf(new char[]{strArr[0].charAt(getInt(bArr, new byte[]{39, a.f58l0, 41, a.f66n0, 31, 32})), strArr[0].charAt(getInt(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(getInt(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(getInt(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(getInt(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(getInt(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    private static int getServiceClass(byte[] bArr) {
        return getInt(bArr, new byte[]{55, 56, 57, a.C0, a.D0, 60, 49, 50, 51, 52});
    }
}
