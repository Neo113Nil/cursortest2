package r1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f3833a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f3834b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f3835c;

    static {
        Charset forName = Charset.forName("UTF-8");
        k1.e.d(forName, "forName(...)");
        f3833a = forName;
        k1.e.d(Charset.forName("UTF-16"), "forName(...)");
        k1.e.d(Charset.forName("UTF-16BE"), "forName(...)");
        k1.e.d(Charset.forName("UTF-16LE"), "forName(...)");
        k1.e.d(Charset.forName("US-ASCII"), "forName(...)");
        k1.e.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
