package k1;

import com.ironsource.ge;
import java.util.Locale;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f40992a = MapsKt.mapOf(TuplesKt.to("be", "by"), TuplesKt.to("tr", "com.tr"), TuplesKt.to("be", "by"), TuplesKt.to("tr", "com.tr"), TuplesKt.to("kk", "kz"), TuplesKt.to("et", "ru"), TuplesKt.to("hy", "ru"), TuplesKt.to("ka", "ru"), TuplesKt.to("ru", "ru"), TuplesKt.to("uk", ge.f16446c0));

    public static final String a(String baseHost, Locale locale) {
        Intrinsics.checkNotNullParameter(baseHost, "baseHost");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String str = (String) f40992a.get(locale.getLanguage());
        if (str == null) {
            str = "com";
        }
        return new Regex("ru$").replace(baseHost, str);
    }
}
