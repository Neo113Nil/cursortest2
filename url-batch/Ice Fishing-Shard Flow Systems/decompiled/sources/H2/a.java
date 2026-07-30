package H2;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class a {
    public static /* synthetic */ Boolean getBool$default(b bVar, String str, String str2, Boolean bool, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBool");
        }
        if ((i2 & 4) != 0) {
            bool = null;
        }
        return bVar.getBool(str, str2, bool);
    }

    public static /* synthetic */ Integer getInt$default(b bVar, String str, String str2, Integer num, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return bVar.getInt(str, str2, num);
    }

    public static /* synthetic */ Long getLong$default(b bVar, String str, String str2, Long l7, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
        }
        if ((i2 & 4) != 0) {
            l7 = null;
        }
        return bVar.getLong(str, str2, l7);
    }

    public static /* synthetic */ String getString$default(b bVar, String str, String str2, String str3, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        return bVar.getString(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(b bVar, String str, String str2, Set set, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringSet");
        }
        if ((i2 & 4) != 0) {
            set = null;
        }
        return bVar.getStringSet(str, str2, set);
    }
}
