package com.baidu.mapauto.auth.util;

/* loaded from: classes2.dex */
public class HexUtil {
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String byte2hex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & 255);
            if (hexString.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static String encodeHexStr(byte[] bArr) {
        return encodeHexStr(bArr, true);
    }

    public static byte[] hex2byte(String str) {
        if (str == null || str.length() < 2) {
            return new byte[0];
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * 2;
            bArr[i8] = (byte) (Integer.parseInt(str.substring(i9, i9 + 2), 16) & 255);
        }
        return bArr;
    }

    public static char[] encodeHex(byte[] bArr, boolean z7) {
        return encodeHex(bArr, z7 ? DIGITS_LOWER : DIGITS_UPPER);
    }

    public static String encodeHexStr(byte[] bArr, boolean z7) {
        return encodeHexStr(bArr, z7 ? DIGITS_LOWER : DIGITS_UPPER);
    }

    public static char[] encodeHex(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i8 = 0;
        for (byte b8 : bArr) {
            int i9 = i8 + 1;
            cArr2[i8] = cArr[(b8 & 240) >>> 4];
            i8 += 2;
            cArr2[i9] = cArr[b8 & 15];
        }
        return cArr2;
    }

    public static String encodeHexStr(byte[] bArr, char[] cArr) {
        return bArr == null ? "" : new String(encodeHex(bArr, cArr));
    }
}
