package n2;

import java.nio.charset.Charset;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0721a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f7347a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f7348b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f7349c;

    static {
        Charset forName = Charset.forName("UTF-8");
        f2.j.e(forName, "forName(...)");
        f7347a = forName;
        f2.j.e(Charset.forName("UTF-16"), "forName(...)");
        f2.j.e(Charset.forName("UTF-16BE"), "forName(...)");
        f2.j.e(Charset.forName("UTF-16LE"), "forName(...)");
        f2.j.e(Charset.forName("US-ASCII"), "forName(...)");
        f2.j.e(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
