package cn.hutool.core.util;

import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes.dex */
public class l {
    public static final Charset CHARSET_GBK;
    public static final Charset CHARSET_ISO_8859_1 = StandardCharsets.ISO_8859_1;
    public static final Charset CHARSET_UTF_8 = StandardCharsets.UTF_8;
    public static final String GBK = "GBK";
    public static final String ISO_8859_1 = "ISO-8859-1";
    public static final String UTF_8 = "UTF-8";

    static {
        Charset charset;
        try {
            charset = Charset.forName(GBK);
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        CHARSET_GBK = charset;
    }

    public static Charset charset(String str) {
        return cn.hutool.core.text.l.isBlank(str) ? Charset.defaultCharset() : Charset.forName(str);
    }

    public static String convert(String str, String str2, String str3) {
        return convert(str, Charset.forName(str2), Charset.forName(str3));
    }

    public static Charset defaultCharset() {
        return Charset.defaultCharset();
    }

    public static String defaultCharsetName() {
        return defaultCharset().name();
    }

    public static Charset parse(String str) {
        return parse(str, Charset.defaultCharset());
    }

    public static Charset systemCharset() {
        return cn.hutool.core.io.l.isWindows() ? CHARSET_GBK : defaultCharset();
    }

    public static String systemCharsetName() {
        return systemCharset().name();
    }

    public static String convert(String str, Charset charset, Charset charset2) {
        if (charset == null) {
            charset = StandardCharsets.ISO_8859_1;
        }
        if (charset2 == null) {
            charset2 = StandardCharsets.UTF_8;
        }
        return (cn.hutool.core.text.l.isBlank(str) || charset.equals(charset2)) ? str : new String(str.getBytes(charset), charset2);
    }

    public static Charset defaultCharset(InputStream inputStream, Charset... charsetArr) {
        return cn.hutool.core.io.c.detect(inputStream, charsetArr);
    }

    public static Charset parse(String str, Charset charset) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (UnsupportedCharsetException unused) {
            return charset;
        }
    }

    public static Charset defaultCharset(int i8, InputStream inputStream, Charset... charsetArr) {
        return cn.hutool.core.io.c.detect(i8, inputStream, charsetArr);
    }

    public static File convert(File file, Charset charset, Charset charset2) {
        return cn.hutool.core.io.l.writeString(cn.hutool.core.io.l.readString(file, charset), file, charset2);
    }
}
