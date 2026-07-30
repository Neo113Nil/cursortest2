package kotlin.text;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class d {
    public static final d INSTANCE = new d();
    public static final Charset ISO_8859_1;
    public static final Charset US_ASCII;
    public static final Charset UTF_16;
    public static final Charset UTF_16BE;
    public static final Charset UTF_16LE;
    public static final Charset UTF_8;
    private static volatile Charset utf_32;
    private static volatile Charset utf_32be;
    private static volatile Charset utf_32le;

    static {
        Charset forName = Charset.forName(cn.hutool.core.util.l.UTF_8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
        UTF_8 = forName;
        Charset forName2 = Charset.forName("UTF-16");
        kotlin.jvm.internal.s.checkNotNullExpressionValue(forName2, "forName(\"UTF-16\")");
        UTF_16 = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        kotlin.jvm.internal.s.checkNotNullExpressionValue(forName3, "forName(\"UTF-16BE\")");
        UTF_16BE = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        kotlin.jvm.internal.s.checkNotNullExpressionValue(forName4, "forName(\"UTF-16LE\")");
        UTF_16LE = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        kotlin.jvm.internal.s.checkNotNullExpressionValue(forName5, "forName(\"US-ASCII\")");
        US_ASCII = forName5;
        Charset forName6 = Charset.forName(cn.hutool.core.util.l.ISO_8859_1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(forName6, "forName(\"ISO-8859-1\")");
        ISO_8859_1 = forName6;
    }

    private d() {
    }

    public final Charset UTF32() {
        Charset charset = utf_32;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32");
        kotlin.jvm.internal.s.checkNotNullExpressionValue(forName, "forName(\"UTF-32\")");
        utf_32 = forName;
        return forName;
    }

    public final Charset UTF32_BE() {
        Charset charset = utf_32be;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        kotlin.jvm.internal.s.checkNotNullExpressionValue(forName, "forName(\"UTF-32BE\")");
        utf_32be = forName;
        return forName;
    }

    public final Charset UTF32_LE() {
        Charset charset = utf_32le;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        kotlin.jvm.internal.s.checkNotNullExpressionValue(forName, "forName(\"UTF-32LE\")");
        utf_32le = forName;
        return forName;
    }
}
