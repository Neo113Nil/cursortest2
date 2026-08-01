package q1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f3995a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f3996b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f3997c;

    static {
        Charset forName = Charset.forName("UTF-8");
        j1.h.d(forName, "forName(...)");
        f3995a = forName;
        j1.h.d(Charset.forName("UTF-16"), "forName(...)");
        j1.h.d(Charset.forName("UTF-16BE"), "forName(...)");
        j1.h.d(Charset.forName("UTF-16LE"), "forName(...)");
        j1.h.d(Charset.forName("US-ASCII"), "forName(...)");
        j1.h.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
