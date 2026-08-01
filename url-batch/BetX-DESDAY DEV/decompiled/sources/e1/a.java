package e1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2375a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f2376b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f2377c;

    static {
        Charset forName = Charset.forName("UTF-8");
        X0.f.d(forName, "forName(...)");
        f2375a = forName;
        X0.f.d(Charset.forName("UTF-16"), "forName(...)");
        X0.f.d(Charset.forName("UTF-16BE"), "forName(...)");
        X0.f.d(Charset.forName("UTF-16LE"), "forName(...)");
        X0.f.d(Charset.forName("US-ASCII"), "forName(...)");
        X0.f.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
