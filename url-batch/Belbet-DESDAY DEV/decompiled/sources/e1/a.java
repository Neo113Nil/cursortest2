package e1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1913a;

    static {
        Charset forName = Charset.forName("UTF-8");
        X0.d.d(forName, "forName(...)");
        f1913a = forName;
        X0.d.d(Charset.forName("UTF-16"), "forName(...)");
        X0.d.d(Charset.forName("UTF-16BE"), "forName(...)");
        X0.d.d(Charset.forName("UTF-16LE"), "forName(...)");
        X0.d.d(Charset.forName("US-ASCII"), "forName(...)");
        X0.d.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
