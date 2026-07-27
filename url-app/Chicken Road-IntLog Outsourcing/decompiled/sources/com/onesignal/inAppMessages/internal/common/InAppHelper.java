package com.onesignal.inAppMessages.internal.common;

import com.onesignal.core.internal.language.ILanguageContext;
import com.onesignal.inAppMessages.internal.InAppMessage;
import g4.AbstractC0466k;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class InAppHelper {
    public static final InAppHelper INSTANCE = new InAppHelper();
    private static final List<String> PREFERRED_VARIANT_ORDER = AbstractC0466k.A0("android", "app", "all");

    private InAppHelper() {
    }

    public final String variantIdForMessage(InAppMessage message, ILanguageContext languageContext) {
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
