package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes9.dex */
public final class NameResolverUtilKt {
    public static final ClassId getClassId(NameResolver nameResolver, int i) {
        nameResolver.getClass();
        return ClassId.Companion.fromString(nameResolver.getQualifiedClassName(i), nameResolver.isLocalClassName(i));
    }

    public static final Name getName(NameResolver nameResolver, int i) {
        nameResolver.getClass();
        Name guessByFirstCharacter = Name.guessByFirstCharacter(nameResolver.getString(i));
        guessByFirstCharacter.getClass();
        return guessByFirstCharacter;
    }
}
