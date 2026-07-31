package n2;

import b2.InterfaceC0265a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import l5.AbstractC0507k;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542a {
    public static final C0542a INSTANCE = new C0542a();
    private static final List<String> PREFERRED_VARIANT_ORDER = AbstractC0507k.z(com.onesignal.core.internal.backend.impl.a.TURBINE_FEATURES_PLATFORM_ANDROID, "app", "all");

    private C0542a() {
    }

    public final String variantIdForMessage(com.onesignal.inAppMessages.internal.a message, InterfaceC0265a languageContext) {
        i.e(message, "message");
        i.e(languageContext, "languageContext");
        String language = languageContext.getLanguage();
        for (String str : PREFERRED_VARIANT_ORDER) {
            if (message.getVariants().containsKey(str)) {
                Map<String, String> map = message.getVariants().get(str);
                i.b(map);
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
