package z6;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f10114a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f10115b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f10116c;

    static {
        Charset forName = Charset.forName("UTF-8");
        r6.k.e(forName, "forName(...)");
        f10114a = forName;
        r6.k.e(Charset.forName("UTF-16"), "forName(...)");
        r6.k.e(Charset.forName("UTF-16BE"), "forName(...)");
        r6.k.e(Charset.forName("UTF-16LE"), "forName(...)");
        r6.k.e(Charset.forName("US-ASCII"), "forName(...)");
        r6.k.e(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
