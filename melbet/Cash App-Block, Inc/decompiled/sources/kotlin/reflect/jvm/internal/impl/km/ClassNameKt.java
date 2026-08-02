package kotlin.reflect.jvm.internal.impl.km;

import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class ClassNameKt {
    public static final boolean isLocalClassName(String str) {
        str.getClass();
        return StringsKt__StringsJVMKt.startsWith(str, ".", false);
    }
}
