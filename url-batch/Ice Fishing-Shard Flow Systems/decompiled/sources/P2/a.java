package P2;

import java.util.List;
import java.util.Map;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();
    private static final List<String> PREFERRED_VARIANT_ORDER = r.d(com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID, "app", "all");

    private a() {
    }

    public final String variantIdForMessage(com.onesignal.inAppMessages.internal.a message, D2.a languageContext) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(languageContext, "languageContext");
        String language = languageContext.getLanguage();
        for (String str : PREFERRED_VARIANT_ORDER) {
            if (message.getVariants().containsKey(str)) {
                Map<String, String> map = message.getVariants().get(str);
                Intrinsics.b(map);
                Map<String, String> map2 = map;
                if (!map2.containsKey(language)) {
                    language = "default";
                }
                return map2.get(language);
            }
        }
        return null;
    }
}
