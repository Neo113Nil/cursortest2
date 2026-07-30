package g;

import cn.hutool.core.io.n;
import cn.hutool.core.util.c1;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Base64;

/* loaded from: classes.dex */
public class h {
    private static final Charset DEFAULT_CHARSET = cn.hutool.core.util.l.CHARSET_UTF_8;

    public static byte[] decode(CharSequence charSequence) {
        return i.decode(charSequence);
    }

    public static String decodeStr(CharSequence charSequence) {
        return i.decodeStr(charSequence);
    }

    public static String decodeStrGbk(CharSequence charSequence) {
        return i.decodeStr(charSequence, cn.hutool.core.util.l.CHARSET_GBK);
    }

    public static File decodeToFile(CharSequence charSequence, File file) {
        return cn.hutool.core.io.l.writeBytes(i.decode(charSequence), file);
    }

    public static void decodeToStream(CharSequence charSequence, OutputStream outputStream, boolean z7) {
        n.write(outputStream, z7, i.decode(charSequence));
    }

    public static byte[] encode(byte[] bArr, boolean z7) {
        Base64.Encoder encoder;
        byte[] encode;
        Base64.Encoder mimeEncoder;
        byte[] encode2;
        if (bArr == null) {
            return null;
        }
        if (z7) {
            mimeEncoder = Base64.getMimeEncoder();
            encode2 = mimeEncoder.encode(bArr);
            return encode2;
        }
        encoder = Base64.getEncoder();
        encode = encoder.encode(bArr);
        return encode;
    }

    public static String encodeStr(byte[] bArr, boolean z7, boolean z8) {
        return c1.str(encode(bArr, z7, z8), DEFAULT_CHARSET);
    }

    @Deprecated
    public static byte[] encodeUrlSafe(byte[] bArr, boolean z7) {
        return j.encodeUrlSafe(bArr, z7);
    }

    public static String encodeWithoutPadding(CharSequence charSequence, String str) {
        return encodeWithoutPadding(cn.hutool.core.text.l.bytes(charSequence, str));
    }

    public static boolean isBase64(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() < 2) {
            return false;
        }
        byte[] utf8Bytes = cn.hutool.core.text.l.utf8Bytes(charSequence);
        if (utf8Bytes.length != charSequence.length()) {
            return false;
        }
        return isBase64(utf8Bytes);
    }

    private static boolean isWhiteSpace(byte b8) {
        return b8 == 9 || b8 == 10 || b8 == 13 || b8 == 32;
    }

    public static byte[] decode(byte[] bArr) {
        return i.decode(bArr);
    }

    public static String decodeStr(CharSequence charSequence, String str) {
        return decodeStr(charSequence, cn.hutool.core.util.l.charset(str));
    }

    public static String encodeUrlSafe(CharSequence charSequence) {
        return encodeUrlSafe(charSequence, DEFAULT_CHARSET);
    }

    public static String encodeWithoutPadding(byte[] bArr) {
        Base64.Encoder encoder;
        Base64.Encoder withoutPadding;
        String encodeToString;
        if (bArr == null) {
            return null;
        }
        encoder = Base64.getEncoder();
        withoutPadding = encoder.withoutPadding();
        encodeToString = withoutPadding.encodeToString(bArr);
        return encodeToString;
    }

    public static String decodeStr(CharSequence charSequence, Charset charset) {
        return i.decodeStr(charSequence, charset);
    }

    public static String encode(CharSequence charSequence) {
        return encode(charSequence, DEFAULT_CHARSET);
    }

    @Deprecated
    public static String encodeUrlSafe(CharSequence charSequence, String str) {
        return encodeUrlSafe(charSequence, cn.hutool.core.util.l.charset(str));
    }

    public static String encode(CharSequence charSequence, String str) {
        return encode(charSequence, cn.hutool.core.util.l.charset(str));
    }

    public static String encodeUrlSafe(CharSequence charSequence, Charset charset) {
        return encodeUrlSafe(cn.hutool.core.text.l.bytes(charSequence, charset));
    }

    public static String encode(CharSequence charSequence, Charset charset) {
        return encode(cn.hutool.core.text.l.bytes(charSequence, charset));
    }

    public static String encodeUrlSafe(byte[] bArr) {
        Base64.Encoder urlEncoder;
        Base64.Encoder withoutPadding;
        String encodeToString;
        if (bArr == null) {
            return null;
        }
        urlEncoder = Base64.getUrlEncoder();
        withoutPadding = urlEncoder.withoutPadding();
        encodeToString = withoutPadding.encodeToString(bArr);
        return encodeToString;
    }

    public static boolean isBase64(byte[] bArr) {
        if (bArr == null || bArr.length < 3) {
            return false;
        }
        boolean z7 = false;
        for (byte b8 : bArr) {
            if (z7) {
                if (61 != b8) {
                    return false;
                }
            } else if (61 == b8) {
                z7 = true;
            } else if (!i.isBase64Code(b8) && !isWhiteSpace(b8)) {
                return false;
            }
        }
        return true;
    }

    public static String encode(byte[] bArr) {
        Base64.Encoder encoder;
        String encodeToString;
        if (bArr == null) {
            return null;
        }
        encoder = Base64.getEncoder();
        encodeToString = encoder.encodeToString(bArr);
        return encodeToString;
    }

    public static String encodeUrlSafe(InputStream inputStream) {
        return encodeUrlSafe(n.readBytes(inputStream));
    }

    public static String encode(InputStream inputStream) {
        return encode(n.readBytes(inputStream));
    }

    public static String encodeUrlSafe(File file) {
        return encodeUrlSafe(cn.hutool.core.io.l.readBytes(file));
    }

    public static String encode(File file) {
        return encode(cn.hutool.core.io.l.readBytes(file));
    }

    public static byte[] encode(byte[] bArr, boolean z7, boolean z8) {
        return j.encode(bArr, z7, z8);
    }
}
