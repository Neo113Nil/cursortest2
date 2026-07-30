package cn.hutool.core.net;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class l {
    public static String encode(String str) {
        return encode(str, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static String encodeAll(String str) {
        return encodeAll(str, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static String encodeFragment(String str) {
        return encodeFragment(str, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static String encodePathSegment(String str) {
        return encodePathSegment(str, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static String encodeQuery(String str) {
        return encodeQuery(str, cn.hutool.core.util.l.CHARSET_UTF_8);
    }

    public static String encode(String str, Charset charset) {
        return k.PATH.encode(str, charset, new char[0]);
    }

    public static String encodeAll(String str, Charset charset) {
        return k.UNRESERVED.encode(str, charset, new char[0]);
    }

    public static String encodeFragment(String str, Charset charset) {
        return cn.hutool.core.text.l.isEmpty(str) ? str : k.FRAGMENT.encode(str, charset, new char[0]);
    }

    public static String encodePathSegment(String str, Charset charset) {
        return cn.hutool.core.text.l.isEmpty(str) ? str : k.SEGMENT.encode(str, charset, new char[0]);
    }

    public static String encodeQuery(String str, Charset charset) {
        return k.QUERY.encode(str, charset, new char[0]);
    }
}
