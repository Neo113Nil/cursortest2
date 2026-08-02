package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes9.dex */
public final class JvmBuiltInsCustomizerKt {
    public static final Name GET_FIRST_LIST_NAME;
    public static final Name GET_LAST_LIST_NAME;

    static {
        Name identifier = Name.identifier("getFirst");
        identifier.getClass();
        GET_FIRST_LIST_NAME = identifier;
        Name identifier2 = Name.identifier("getLast");
        identifier2.getClass();
        GET_LAST_LIST_NAME = identifier2;
    }
}
