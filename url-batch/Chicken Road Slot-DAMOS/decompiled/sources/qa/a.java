package qa;

import a2.r;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {
    public static /* synthetic */ Boolean getBool$default(b bVar, String str, String str2, Boolean bool, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getBool");
            return null;
        }
        if ((i3 & 4) != 0) {
            bool = null;
        }
        return bVar.getBool(str, str2, bool);
    }

    public static /* synthetic */ Integer getInt$default(b bVar, String str, String str2, Integer num, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getInt");
            return null;
        }
        if ((i3 & 4) != 0) {
            num = null;
        }
        return bVar.getInt(str, str2, num);
    }

    public static /* synthetic */ Long getLong$default(b bVar, String str, String str2, Long l10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getLong");
            return null;
        }
        if ((i3 & 4) != 0) {
            l10 = null;
        }
        return bVar.getLong(str, str2, l10);
    }

    public static /* synthetic */ String getString$default(b bVar, String str, String str2, String str3, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getString");
            return null;
        }
        if ((i3 & 4) != 0) {
            str3 = null;
        }
        return bVar.getString(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(b bVar, String str, String str2, Set set, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getStringSet");
            return null;
        }
        if ((i3 & 4) != 0) {
            set = null;
        }
        return bVar.getStringSet(str, str2, set);
    }
}
