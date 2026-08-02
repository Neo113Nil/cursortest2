package s2;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f10316a;

    static {
        Charset forName = Charset.forName(CharEncoding.UTF_8);
        kotlin.jvm.internal.j.d(forName, "forName(...)");
        f10316a = forName;
        kotlin.jvm.internal.j.d(Charset.forName(CharEncoding.UTF_16), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName(CharEncoding.UTF_16BE), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName(CharEncoding.UTF_16LE), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName(CharEncoding.US_ASCII), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName(CharEncoding.ISO_8859_1), "forName(...)");
    }
}
