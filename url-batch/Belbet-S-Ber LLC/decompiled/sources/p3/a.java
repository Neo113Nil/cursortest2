package p3;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f3089a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f3090b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f3091c;

    static {
        Charset forName = Charset.forName("UTF-8");
        i3.d.d(forName, "forName(...)");
        f3089a = forName;
        i3.d.d(Charset.forName("UTF-16"), "forName(...)");
        i3.d.d(Charset.forName("UTF-16BE"), "forName(...)");
        i3.d.d(Charset.forName("UTF-16LE"), "forName(...)");
        i3.d.d(Charset.forName("US-ASCII"), "forName(...)");
        i3.d.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
