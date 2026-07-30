package cn.hutool.core.util;

import java.awt.Color;
import java.math.BigInteger;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class z {
    public static void appendHex(StringBuilder sb, byte b8, boolean z7) {
        (z7 ? g.a.CODEC_LOWER : g.a.CODEC_UPPER).appendHex(sb, b8);
    }

    public static Color decodeColor(String str) {
        return Color.decode(str);
    }

    public static byte[] decodeHex(String str) {
        return decodeHex((CharSequence) str);
    }

    public static String decodeHexStr(String str) {
        return decodeHexStr(str, l.CHARSET_UTF_8);
    }

    public static String encodeColor(Color color) {
        return encodeColor(color, "#");
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static String encodeHexStr(byte[] bArr) {
        return encodeHexStr(bArr, true);
    }

    public static String format(String str) {
        int length = str.length();
        StringBuilder builder = c1.builder((length / 2) + length);
        builder.append(str.charAt(0));
        builder.append(str.charAt(1));
        for (int i8 = 2; i8 < length - 1; i8 += 2) {
            builder.append(' ');
            builder.append(str.charAt(i8));
            builder.append(str.charAt(i8 + 1));
        }
        return builder.toString();
    }

    public static int hexToInt(String str) {
        return Integer.parseInt(str, 16);
    }

    public static long hexToLong(String str) {
        return Long.parseLong(str, 16);
    }

    public static boolean isHexNumber(String str) {
        if (cn.hutool.core.text.l.startWith((CharSequence) str, '-')) {
            return false;
        }
        try {
            new BigInteger(str.substring((str.startsWith("0x", 0) || str.startsWith("0X", 0)) ? 2 : str.startsWith("#", 0) ? 1 : 0), 16);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static BigInteger toBigInteger(String str) {
        if (str == null) {
            return null;
        }
        return new BigInteger(str, 16);
    }

    public static String toHex(int i8) {
        return Integer.toHexString(i8);
    }

    public static String toUnicodeHex(int i8) {
        StringBuilder sb = new StringBuilder(6);
        sb.append("\\u");
        String hex = toHex(i8);
        int length = hex.length();
        if (length < 4) {
            sb.append((CharSequence) "0000", 0, 4 - length);
        }
        sb.append(hex);
        return sb.toString();
    }

    public static byte[] decodeHex(char[] cArr) {
        return decodeHex(String.valueOf(cArr));
    }

    public static String decodeHexStr(String str, Charset charset) {
        return cn.hutool.core.text.l.isEmpty(str) ? str : c1.str(decodeHex(str), charset);
    }

    public static String encodeColor(Color color, String str) {
        StringBuilder sb = new StringBuilder(str);
        String hexString = Integer.toHexString(color.getRed());
        if (1 == hexString.length()) {
            sb.append('0');
        }
        sb.append(hexString);
        String hexString2 = Integer.toHexString(color.getGreen());
        if (1 == hexString2.length()) {
            sb.append('0');
        }
        sb.append(hexString2);
        String hexString3 = Integer.toHexString(color.getBlue());
        if (1 == hexString3.length()) {
            sb.append('0');
        }
        sb.append(hexString3);
        return sb.toString();
    }

    public static char[] encodeHex(String str, Charset charset) {
        return encodeHex(cn.hutool.core.text.l.bytes(str, charset), true);
    }

    public static String encodeHexStr(String str, Charset charset) {
        return encodeHexStr(cn.hutool.core.text.l.bytes(str, charset), true);
    }

    public static String toHex(long j8) {
        return Long.toHexString(j8);
    }

    public static byte[] decodeHex(CharSequence charSequence) {
        return g.a.CODEC_LOWER.decode(charSequence);
    }

    public static char[] encodeHex(byte[] bArr, boolean z7) {
        return (z7 ? g.a.CODEC_LOWER : g.a.CODEC_UPPER).encode(bArr);
    }

    public static String encodeHexStr(String str) {
        return encodeHexStr(str, l.CHARSET_UTF_8);
    }

    public static String decodeHexStr(char[] cArr, Charset charset) {
        return c1.str(decodeHex(cArr), charset);
    }

    public static String encodeHexStr(byte[] bArr, boolean z7) {
        return new String(encodeHex(bArr, z7));
    }

    public static String toUnicodeHex(char c8) {
        return g.a.CODEC_LOWER.toUnicodeHex(c8);
    }
}
