package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes9.dex */
public final class BuiltinSpecialPropertiesKt {
    public static final FqName access$childSafe(FqNameUnsafe fqNameUnsafe, String str) {
        Name identifier = Name.identifier(str);
        identifier.getClass();
        return fqNameUnsafe.child(identifier).toSafe();
    }
}
