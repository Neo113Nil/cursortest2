package cn.hutool.core.util;

import cn.hutool.core.text.StrBuilder;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes.dex */
public class c1 extends cn.hutool.core.text.l {
    public static StringBuilder builder() {
        return new StringBuilder();
    }

    public static String fill(String str, char c8, int i8, boolean z7) {
        int length = str.length();
        if (length > i8) {
            return str;
        }
        String repeat = cn.hutool.core.text.l.repeat(c8, i8 - length);
        return z7 ? repeat.concat(str) : str.concat(repeat);
    }

    public static String fillAfter(String str, char c8, int i8) {
        return fill(str, c8, i8, false);
    }

    public static String fillBefore(String str, char c8, int i8) {
        return fill(str, c8, i8, true);
    }

    public static String format(CharSequence charSequence, Map<?, ?> map) {
        return format(charSequence, map, true);
    }

    public static StringReader getReader(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return new StringReader(charSequence.toString());
    }

    public static StringWriter getWriter() {
        return new StringWriter();
    }

    public static boolean isBlankIfStr(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof CharSequence) {
            return cn.hutool.core.text.l.isBlank((CharSequence) obj);
        }
        return false;
    }

    public static boolean isEmptyIfStr(Object obj) {
        if (obj == null) {
            return true;
        }
        return (obj instanceof CharSequence) && ((CharSequence) obj).length() == 0;
    }

    public static String reverse(String str) {
        return new String(g0.reverse(str.toCharArray()));
    }

    public static double similar(String str, String str2) {
        return cn.hutool.core.text.r.similar(str, str2);
    }

    @Deprecated
    public static String str(Object obj, String str) {
        return str(obj, Charset.forName(str));
    }

    public static StrBuilder strBuilder() {
        return StrBuilder.create();
    }

    public static String toString(Object obj) {
        return String.valueOf(obj);
    }

    public static String toStringOrNull(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static void trim(String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (int i8 = 0; i8 < strArr.length; i8++) {
            String str = strArr[i8];
            if (str != null) {
                strArr[i8] = cn.hutool.core.text.l.trim(str);
            }
        }
    }

    public static String truncateByByteLength(String str, Charset charset, int i8, int i9, boolean z7) {
        if (str == null || str.length() * i9 <= i8) {
            return str;
        }
        byte[] bytes = str.getBytes(charset);
        if (bytes.length <= i8) {
            return str;
        }
        if (z7) {
            i8 -= "...".getBytes(charset).length;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bytes, 0, i8);
        CharBuffer allocate = CharBuffer.allocate(i8);
        CharsetDecoder newDecoder = charset.newDecoder();
        newDecoder.onMalformedInput(CodingErrorAction.IGNORE);
        newDecoder.decode(wrap, allocate, true);
        newDecoder.flush(allocate);
        String str2 = new String(allocate.array(), 0, allocate.position());
        if (!z7) {
            return str2;
        }
        return str2 + "...";
    }

    public static String truncateUtf8(String str, int i8) {
        return truncateByByteLength(str, StandardCharsets.UTF_8, i8, 4, true);
    }

    public static String utf8Str(Object obj) {
        return str(obj, l.CHARSET_UTF_8);
    }

    public static String uuid() {
        return a0.randomUUID();
    }

    public static StringBuilder builder(int i8) {
        return new StringBuilder(i8);
    }

    public static String format(CharSequence charSequence, Map<?, ?> map, boolean z7) {
        return cn.hutool.core.text.n.format(charSequence, map, z7);
    }

    public static String similar(String str, String str2, int i8) {
        return cn.hutool.core.text.r.similar(str, str2, i8);
    }

    public static String str(Object obj, Charset charset) {
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : obj instanceof byte[] ? str((byte[]) obj, charset) : obj instanceof Byte[] ? str((Byte[]) obj, charset) : obj instanceof ByteBuffer ? str((ByteBuffer) obj, charset) : h.isArray(obj) ? h.toString(obj) : obj.toString();
    }

    public static StrBuilder strBuilder(int i8) {
        return StrBuilder.create(i8);
    }

    public static String str(byte[] bArr, String str) {
        return str(bArr, l.charset(str));
    }

    public static String str(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        if (charset == null) {
            return new String(bArr);
        }
        return new String(bArr, charset);
    }

    public static String str(Byte[] bArr, String str) {
        return str(bArr, l.charset(str));
    }

    public static String str(Byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            Byte b8 = bArr[i8];
            bArr2[i8] = b8 == null ? (byte) -1 : b8.byteValue();
        }
        return str(bArr2, charset);
    }

    public static String str(ByteBuffer byteBuffer, String str) {
        if (byteBuffer == null) {
            return null;
        }
        return str(byteBuffer, l.charset(str));
    }

    public static String str(ByteBuffer byteBuffer, Charset charset) {
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        return charset.decode(byteBuffer).toString();
    }
}
