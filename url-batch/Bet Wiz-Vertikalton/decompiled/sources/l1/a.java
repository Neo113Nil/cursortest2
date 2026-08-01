package l1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f3159a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f3160b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f3161c;

    static {
        Charset forName = Charset.forName("UTF-8");
        e1.d.d(forName, "forName(...)");
        f3159a = forName;
        e1.d.d(Charset.forName("UTF-16"), "forName(...)");
        e1.d.d(Charset.forName("UTF-16BE"), "forName(...)");
        e1.d.d(Charset.forName("UTF-16LE"), "forName(...)");
        e1.d.d(Charset.forName("US-ASCII"), "forName(...)");
        e1.d.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
