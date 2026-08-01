package o1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f3416a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f3417b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f3418c;

    static {
        Charset forName = Charset.forName("UTF-8");
        h1.d.d(forName, "forName(...)");
        f3416a = forName;
        h1.d.d(Charset.forName("UTF-16"), "forName(...)");
        h1.d.d(Charset.forName("UTF-16BE"), "forName(...)");
        h1.d.d(Charset.forName("UTF-16LE"), "forName(...)");
        h1.d.d(Charset.forName("US-ASCII"), "forName(...)");
        h1.d.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
