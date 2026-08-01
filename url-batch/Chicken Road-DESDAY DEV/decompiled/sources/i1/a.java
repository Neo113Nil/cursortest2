package i1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2460a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f2461b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f2462c;

    static {
        Charset forName = Charset.forName("UTF-8");
        b1.d.d(forName, "forName(...)");
        f2460a = forName;
        b1.d.d(Charset.forName("UTF-16"), "forName(...)");
        b1.d.d(Charset.forName("UTF-16BE"), "forName(...)");
        b1.d.d(Charset.forName("UTF-16LE"), "forName(...)");
        b1.d.d(Charset.forName("US-ASCII"), "forName(...)");
        b1.d.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
