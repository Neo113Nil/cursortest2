package k1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2754a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f2755b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f2756c;

    static {
        Charset forName = Charset.forName("UTF-8");
        d1.d.d(forName, "forName(...)");
        f2754a = forName;
        d1.d.d(Charset.forName("UTF-16"), "forName(...)");
        d1.d.d(Charset.forName("UTF-16BE"), "forName(...)");
        d1.d.d(Charset.forName("UTF-16LE"), "forName(...)");
        d1.d.d(Charset.forName("US-ASCII"), "forName(...)");
        d1.d.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
