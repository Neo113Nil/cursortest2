package b3;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f967a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f968b;
    public static volatile Charset c;

    static {
        Charset forName = Charset.forName("UTF-8");
        u2.c.d(forName, "forName(...)");
        f967a = forName;
        u2.c.d(Charset.forName("UTF-16"), "forName(...)");
        u2.c.d(Charset.forName("UTF-16BE"), "forName(...)");
        u2.c.d(Charset.forName("UTF-16LE"), "forName(...)");
        u2.c.d(Charset.forName("US-ASCII"), "forName(...)");
        u2.c.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
