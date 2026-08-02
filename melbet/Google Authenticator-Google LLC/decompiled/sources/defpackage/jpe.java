package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpe {
    public static final Charset a;
    private static final Charset b = Charset.defaultCharset();
    private static final Charset c;

    static {
        Charset charset;
        Charset charset2 = null;
        try {
            charset = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        a = charset;
        try {
            Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
        }
        try {
            charset2 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        c = charset2;
        Charset charset3 = a;
        if ((charset3 == null || !charset3.equals(b)) && charset2 != null) {
            charset2.equals(b);
        }
    }
}
