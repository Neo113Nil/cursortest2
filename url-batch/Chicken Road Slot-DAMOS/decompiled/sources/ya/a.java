package ya;

import java.util.List;
import java.util.Map;
import kotlin.collections.y;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();
    private static final List<String> PREFERRED_VARIANT_ORDER = y.f("android", "app", "all");

    private a() {
    }

    public final String variantIdForMessage(com.onesignal.inAppMessages.internal.a aVar, la.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        String language = aVar2.getLanguage();
        for (String str : PREFERRED_VARIANT_ORDER) {
            if (aVar.getVariants().containsKey(str)) {
                Map<String, String> map = aVar.getVariants().get(str);
                map.getClass();
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
