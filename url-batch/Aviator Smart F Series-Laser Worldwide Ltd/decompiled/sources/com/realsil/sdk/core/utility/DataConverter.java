package com.realsil.sdk.core.utility;

import cn.hutool.core.text.l;
import com.moyoung.dafit.module.common.utils.n;
import com.realsil.sdk.core.logger.ZLogger;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class DataConverter {
    public static String bytes2Hex(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase().trim();
    }

    public static String bytes2HexWithSeparate(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            sb.append(hexString);
            sb.append(l.SPACE);
        }
        return sb.toString().toUpperCase().trim();
    }

    public static String bytes2Str(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b8 : bArr) {
            sb.append((char) b8);
        }
        return sb.toString();
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream, int i8) {
        if (inputStream == null || outputStream == null) {
            return;
        }
        byte[] bArr = new byte[i8];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static String ellipsize(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() < 3) {
            return str;
        }
        return str.charAt(0) + "⋯" + str.charAt(str.length() - 1);
    }

    public static boolean equals(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static byte[] hex2BigBytes(String str) {
        if (StringUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length();
        int i8 = length / 2;
        byte[] bArr = new byte[i8];
        String upperCase = str.toUpperCase();
        char[] charArray = upperCase.toCharArray();
        if (length % 2 == 1) {
            return null;
        }
        for (int i9 = 0; i9 < length; i9++) {
            char c8 = charArray[i9];
            if ((c8 < '0' || c8 > '9') && (c8 < 'A' || c8 > 'F')) {
                return null;
            }
        }
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[(i8 - (i10 / 2)) - 1] = (byte) (Character.digit(upperCase.charAt(i10 + 1), 16) + (Character.digit(upperCase.charAt(i10), 16) << 4));
        }
        return bArr;
    }

    public static byte[] hex2Bytes(String str) {
        return hex2Bytes(str, true);
    }

    public static String hex2Str(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        String upperCase = str.toUpperCase();
        char[] charArray = upperCase.toCharArray();
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        if (upperCase.length() % 2 == 1) {
            return "";
        }
        for (int i8 = 0; i8 < upperCase.length(); i8++) {
            char c8 = charArray[i8];
            if ((c8 < '0' || c8 > '9') && (c8 < 'A' || c8 > 'F')) {
                return "";
            }
        }
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i9 * 2;
            bArr[i9] = (byte) (("0123456789ABCDEF".indexOf(charArray[i10 + 1]) + ("0123456789ABCDEF".indexOf(charArray[i10]) * 16)) & 255);
        }
        return new String(bArr);
    }

    public static int littleEndianByteArrayToInt(byte[] bArr) {
        int length = bArr.length;
        int i8 = 0;
        if (length == 0) {
            return 0;
        }
        for (int i9 = length - 1; i9 >= 0; i9--) {
            i8 += unsignedByteToInt(bArr[i9]) << (i9 * 8);
        }
        return i8;
    }

    @Deprecated
    public static byte[] reverse(byte[] bArr) {
        return ByteArrayConverter.reverse(bArr);
    }

    public static void safeCloseStream(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (Throwable th) {
            ZLogger.w("Error closing stream: " + th.toString());
        }
    }

    public static byte[] str2Bytes(String str) {
        if (str == null) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length() / 2];
        return str.getBytes(StandardCharsets.US_ASCII);
    }

    public static String str2Hex(String str) {
        return str2Hex(str, Charset.defaultCharset().name(), true);
    }

    public static String str2Unicode(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            String hexString = Integer.toHexString(charAt);
            StringBuilder sb2 = charAt > 128 ? new StringBuilder("\\u") : new StringBuilder("\\u00");
            sb2.append(hexString);
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    public static String unicode2Str(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length() / 6;
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 * 6;
            i8++;
            String substring = str.substring(i9, i8 * 6);
            String str2 = substring.substring(2, 4) + n.TWO_INTEGERS_PATTERN;
            sb.append(new String(Character.toChars(Integer.valueOf(substring.substring(4), 16).intValue() + Integer.valueOf(str2, 16).intValue())));
        }
        return sb.toString();
    }

    public static int unsignedByteToInt(byte b8) {
        return b8 & 255;
    }

    public static byte[] hex2Bytes(String str, boolean z7) {
        if (StringUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            int length = str.length();
            byte[] bArr = new byte[length / 2];
            String upperCase = str.toUpperCase();
            char[] charArray = upperCase.toCharArray();
            if (z7 && length % 2 == 1) {
                return new byte[0];
            }
            for (int i8 = 0; i8 < length; i8++) {
                char c8 = charArray[i8];
                if ((c8 < '0' || c8 > '9') && (c8 < 'A' || c8 > 'F')) {
                    return new byte[0];
                }
            }
            int i9 = length / 2;
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((Character.digit(upperCase.charAt(i11), 16) << 4) + Character.digit(upperCase.charAt(i11 + 1), 16));
            }
            return bArr;
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static String hex2Str(String str, String str2) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        String upperCase = str.toUpperCase();
        char[] charArray = upperCase.toCharArray();
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        if (upperCase.length() % 2 == 1) {
            return "";
        }
        for (int i8 = 0; i8 < upperCase.length(); i8++) {
            char c8 = charArray[i8];
            if ((c8 < '0' || c8 > '9') && (c8 < 'A' || c8 > 'F')) {
                return "";
            }
        }
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i9 * 2;
            bArr[i9] = (byte) (("0123456789ABCDEF".indexOf(charArray[i10 + 1]) + ("0123456789ABCDEF".indexOf(charArray[i10]) * 16)) & 255);
        }
        try {
            return new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    public static void safeCloseStream(OutputStream outputStream) {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (Throwable th) {
            ZLogger.w("Error closing stream: " + th.toString());
        }
    }

    public static String str2Hex(String str, String str2, boolean z7) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        try {
            for (byte b8 : str.getBytes(str2)) {
                sb.append(charArray[(b8 & 240) >> 4]);
                sb.append(charArray[b8 & 15]);
                if (z7) {
                    sb.append(' ');
                }
            }
            return sb.toString().trim();
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            return "";
        }
    }
}
