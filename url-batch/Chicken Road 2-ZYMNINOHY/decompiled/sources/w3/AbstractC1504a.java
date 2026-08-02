package w3;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1504a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f15936a;

    static {
        Charset forName = Charset.forName(CharEncoding.UTF_8);
        kotlin.jvm.internal.i.d(forName, "forName(...)");
        f15936a = forName;
        kotlin.jvm.internal.i.d(Charset.forName(CharEncoding.UTF_16), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName(CharEncoding.UTF_16BE), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName(CharEncoding.UTF_16LE), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName(CharEncoding.US_ASCII), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName(CharEncoding.ISO_8859_1), "forName(...)");
    }
}
