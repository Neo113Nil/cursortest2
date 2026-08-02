package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* loaded from: classes9.dex */
public final class JvmFlags {
    public static final Flags.BooleanFlagField IS_COMPILED_IN_COMPATIBILITY_MODE;
    public static final Flags.BooleanFlagField IS_COMPILED_IN_JVM_DEFAULT_MODE;
    public static final JvmFlags INSTANCE = new JvmFlags();
    public static final Flags.BooleanFlagField IS_MOVED_FROM_INTERFACE_COMPANION = Flags.FlagField.booleanFirst();

    static {
        Flags.BooleanFlagField booleanFirst = Flags.FlagField.booleanFirst();
        IS_COMPILED_IN_JVM_DEFAULT_MODE = booleanFirst;
        IS_COMPILED_IN_COMPATIBILITY_MODE = Flags.FlagField.booleanAfter(booleanFirst);
    }

    public final Flags.BooleanFlagField getIS_COMPILED_IN_COMPATIBILITY_MODE() {
        return IS_COMPILED_IN_COMPATIBILITY_MODE;
    }

    public final Flags.BooleanFlagField getIS_COMPILED_IN_JVM_DEFAULT_MODE() {
        return IS_COMPILED_IN_JVM_DEFAULT_MODE;
    }

    public final Flags.BooleanFlagField getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return IS_MOVED_FROM_INTERFACE_COMPANION;
    }
}
