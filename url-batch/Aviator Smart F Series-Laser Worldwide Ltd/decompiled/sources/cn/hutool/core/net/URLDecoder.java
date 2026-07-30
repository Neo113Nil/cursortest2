package cn.hutool.core.net;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class URLDecoder implements Serializable {
    private static final byte ESCAPE_CHAR = 37;
    private static final long serialVersionUID = 1;

    public static String decode(String str, Charset charset) {
        return decode(str, charset, true);
    }

    public static String decodeForPath(String str, Charset charset) {
        return decode(str, charset, false);
    }

    private static String decodeSub(String str, int i8, int i9, Charset charset, boolean z7) {
        return new String(decode(str.substring(i8, i9).getBytes(cn.hutool.core.util.l.CHARSET_ISO_8859_1), z7), charset);
    }

    public static String decode(String str, Charset charset, boolean z7) {
        if (str == null || charset == null) {
            return str;
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(length / 3);
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char charAt = str.charAt(i9);
            if ('%' != charAt && !cn.hutool.core.util.k.isHexChar(charAt)) {
                if (i9 > i8) {
                    sb.append(decodeSub(str, i8, i9, charset, z7));
                }
                if ('+' == charAt && z7) {
                    charAt = ' ';
                }
                sb.append(charAt);
                i8 = i9 + 1;
            }
        }
        if (i8 < length) {
            sb.append(decodeSub(str, i8, length, charset, z7));
        }
        return sb.toString();
    }

    public static byte[] decode(byte[] bArr) {
        return decode(bArr, true);
    }

    public static byte[] decode(byte[] bArr, boolean z7) {
        int digit16;
        int i8;
        int digit162;
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        int i9 = 0;
        while (i9 < bArr.length) {
            byte b8 = bArr[i9];
            if (b8 == 43) {
                if (z7) {
                    b8 = 32;
                }
                byteArrayOutputStream.write(b8);
            } else if (b8 == 37) {
                int i10 = i9 + 1;
                if (i10 < bArr.length && (digit16 = cn.hutool.core.util.k.digit16(bArr[i10])) >= 0 && (i8 = i9 + 2) < bArr.length && (digit162 = cn.hutool.core.util.k.digit16(bArr[i8])) >= 0) {
                    byteArrayOutputStream.write((char) ((digit16 << 4) + digit162));
                    i9 = i8;
                } else {
                    byteArrayOutputStream.write(b8);
                }
            } else {
                byteArrayOutputStream.write(b8);
            }
            i9++;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
