package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/text/Charsets;", "", "Ljava/nio/charset/Charset;", "UTF_8", "Ljava/nio/charset/Charset;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Charsets {
    public static final Charsets INSTANCE = new Charsets();
    public static final Charset ISO_8859_1;
    public static final Charset US_ASCII;
    public static final Charset UTF_16BE;
    public static final Charset UTF_16LE;
    public static final Charset UTF_8;
    public static volatile Charset utf_32be;
    public static volatile Charset utf_32le;

    static {
        Charset forName = Charset.forName("UTF-8");
        forName.getClass();
        UTF_8 = forName;
        Charset.forName("UTF-16").getClass();
        Charset forName2 = Charset.forName("UTF-16BE");
        forName2.getClass();
        UTF_16BE = forName2;
        Charset forName3 = Charset.forName("UTF-16LE");
        forName3.getClass();
        UTF_16LE = forName3;
        Charset forName4 = Charset.forName("US-ASCII");
        forName4.getClass();
        US_ASCII = forName4;
        Charset forName5 = Charset.forName("ISO-8859-1");
        forName5.getClass();
        ISO_8859_1 = forName5;
    }
}
