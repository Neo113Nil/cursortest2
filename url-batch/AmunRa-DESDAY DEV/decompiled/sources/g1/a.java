package g1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2438a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f2439b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f2440c;

    static {
        Charset forName = Charset.forName("UTF-8");
        Z0.d.d(forName, "forName(...)");
        f2438a = forName;
        Z0.d.d(Charset.forName("UTF-16"), "forName(...)");
        Z0.d.d(Charset.forName("UTF-16BE"), "forName(...)");
        Z0.d.d(Charset.forName("UTF-16LE"), "forName(...)");
        Z0.d.d(Charset.forName("US-ASCII"), "forName(...)");
        Z0.d.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
