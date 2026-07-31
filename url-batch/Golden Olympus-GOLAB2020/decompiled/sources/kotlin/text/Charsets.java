package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class Charsets {

    @NotNull
    public static final Charset UTF_8;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Charsets f41245a = new Charsets();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f41246b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f41247c;

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f41248d;

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f41249e;

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f41250f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile Charset f41251g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile Charset f41252h;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        UTF_8 = forName;
        Charset forName2 = Charset.forName("UTF-16");
        Intrinsics.checkNotNullExpressionValue(forName2, "forName(...)");
        f41246b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        Intrinsics.checkNotNullExpressionValue(forName3, "forName(...)");
        f41247c = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        Intrinsics.checkNotNullExpressionValue(forName4, "forName(...)");
        f41248d = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        Intrinsics.checkNotNullExpressionValue(forName5, "forName(...)");
        f41249e = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        Intrinsics.checkNotNullExpressionValue(forName6, "forName(...)");
        f41250f = forName6;
    }

    private Charsets() {
    }

    public final Charset a() {
        Charset charset = f41252h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        f41252h = forName;
        return forName;
    }

    public final Charset b() {
        Charset charset = f41251g;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        f41251g = forName;
        return forName;
    }
}
