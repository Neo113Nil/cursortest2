package h2;

import java.nio.charset.Charset;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0439a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f5056a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f5057b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f5058c;

    static {
        Charset forName = Charset.forName("UTF-8");
        Z1.i.e(forName, "forName(...)");
        f5056a = forName;
        Z1.i.e(Charset.forName("UTF-16"), "forName(...)");
        Z1.i.e(Charset.forName("UTF-16BE"), "forName(...)");
        Z1.i.e(Charset.forName("UTF-16LE"), "forName(...)");
        Z1.i.e(Charset.forName("US-ASCII"), "forName(...)");
        Z1.i.e(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
