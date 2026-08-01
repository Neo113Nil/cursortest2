package n1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f3243a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f3244b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f3245c;

    static {
        Charset forName = Charset.forName("UTF-8");
        g1.d.d(forName, "forName(...)");
        f3243a = forName;
        g1.d.d(Charset.forName("UTF-16"), "forName(...)");
        g1.d.d(Charset.forName("UTF-16BE"), "forName(...)");
        g1.d.d(Charset.forName("UTF-16LE"), "forName(...)");
        g1.d.d(Charset.forName("US-ASCII"), "forName(...)");
        g1.d.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
