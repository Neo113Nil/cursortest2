package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class Charsets {
    public static final Charset UTF_8;

    /* renamed from: a, reason: collision with root package name */
    public static final Charsets f7509a = new Charsets();

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f7510b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f7511c;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        UTF_8 = forName;
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16"), "forName(...)");
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16BE"), "forName(...)");
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16LE"), "forName(...)");
        Intrinsics.checkNotNullExpressionValue(Charset.forName("US-ASCII"), "forName(...)");
        Intrinsics.checkNotNullExpressionValue(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
