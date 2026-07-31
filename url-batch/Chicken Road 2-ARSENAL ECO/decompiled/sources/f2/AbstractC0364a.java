package f2;

import java.util.Set;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0364a {
    public static /* synthetic */ Boolean getBool$default(InterfaceC0365b interfaceC0365b, String str, String str2, Boolean bool, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBool");
        }
        if ((i7 & 4) != 0) {
            bool = null;
        }
        return interfaceC0365b.getBool(str, str2, bool);
    }

    public static /* synthetic */ Integer getInt$default(InterfaceC0365b interfaceC0365b, String str, String str2, Integer num, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        return interfaceC0365b.getInt(str, str2, num);
    }

    public static /* synthetic */ Long getLong$default(InterfaceC0365b interfaceC0365b, String str, String str2, Long l7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
        }
        if ((i7 & 4) != 0) {
            l7 = null;
        }
        return interfaceC0365b.getLong(str, str2, l7);
    }

    public static /* synthetic */ String getString$default(InterfaceC0365b interfaceC0365b, String str, String str2, String str3, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        return interfaceC0365b.getString(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(InterfaceC0365b interfaceC0365b, String str, String str2, Set set, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringSet");
        }
        if ((i7 & 4) != 0) {
            set = null;
        }
        return interfaceC0365b.getStringSet(str, str2, set);
    }
}
