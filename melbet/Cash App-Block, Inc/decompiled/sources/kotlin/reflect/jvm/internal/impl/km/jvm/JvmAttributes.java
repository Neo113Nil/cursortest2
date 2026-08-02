package kotlin.reflect.jvm.internal.impl.km.jvm;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate;
import kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt;
import kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmFlags;

/* loaded from: classes9.dex */
public final class JvmAttributes {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new MutablePropertyReference1Impl(JvmAttributes.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(JvmAttributes.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmConstructor;)Z", 1), new MutablePropertyReference1Impl(JvmAttributes.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmFunction;)Z", 1), new MutablePropertyReference1Impl(JvmAttributes.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(JvmAttributes.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new MutablePropertyReference1Impl(JvmAttributes.class, "hasAnnotationsInBytecode", "getHasAnnotationsInBytecode(Lkotlin/metadata/KmValueParameter;)Z", 1), new MutablePropertyReference1Impl(JvmAttributes.class, "isMovedFromInterfaceCompanion", "isMovedFromInterfaceCompanion(Lkotlin/metadata/KmProperty;)Z", 1), new MutablePropertyReference1Impl(JvmAttributes.class, "hasMethodBodiesInInterface", "getHasMethodBodiesInInterface(Lkotlin/metadata/KmClass;)Z", 1), new MutablePropertyReference1Impl(JvmAttributes.class, "isCompiledInCompatibilityMode", "isCompiledInCompatibilityMode(Lkotlin/metadata/KmClass;)Z", 1)};
    public static final BooleanFlagDelegate isMovedFromInterfaceCompanion$delegate;

    static {
        Flags.BooleanFlagField booleanFlagField = Flags.HAS_ANNOTATIONS;
        booleanFlagField.getClass();
        FlagDelegatesImplKt.classBooleanFlag(new FlagImpl(booleanFlagField));
        FlagDelegatesImplKt.constructorBooleanFlag(new FlagImpl(booleanFlagField));
        FlagDelegatesImplKt.functionBooleanFlag(new FlagImpl(booleanFlagField));
        FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(booleanFlagField));
        FlagDelegatesImplKt.propertyAccessorBooleanFlag(new FlagImpl(booleanFlagField));
        FlagDelegatesImplKt.valueParameterBooleanFlag(new FlagImpl(booleanFlagField));
        JvmAttributes$isMovedFromInterfaceCompanion$2 jvmAttributes$isMovedFromInterfaceCompanion$2 = JvmAttributes$isMovedFromInterfaceCompanion$2.INSTANCE;
        JvmFlags jvmFlags = JvmFlags.INSTANCE;
        Flags.BooleanFlagField is_moved_from_interface_companion = jvmFlags.getIS_MOVED_FROM_INTERFACE_COMPANION();
        is_moved_from_interface_companion.getClass();
        isMovedFromInterfaceCompanion$delegate = new BooleanFlagDelegate(jvmAttributes$isMovedFromInterfaceCompanion$2, new FlagImpl(is_moved_from_interface_companion.offset, is_moved_from_interface_companion.bitWidth, 1));
        JvmAttributes$hasMethodBodiesInInterface$2 jvmAttributes$hasMethodBodiesInInterface$2 = JvmAttributes$hasMethodBodiesInInterface$2.INSTANCE;
        Flags.BooleanFlagField is_compiled_in_jvm_default_mode = jvmFlags.getIS_COMPILED_IN_JVM_DEFAULT_MODE();
        is_compiled_in_jvm_default_mode.getClass();
        new BooleanFlagDelegate(jvmAttributes$hasMethodBodiesInInterface$2, new FlagImpl(is_compiled_in_jvm_default_mode.offset, is_compiled_in_jvm_default_mode.bitWidth, 1));
        JvmAttributes$isCompiledInCompatibilityMode$2 jvmAttributes$isCompiledInCompatibilityMode$2 = JvmAttributes$isCompiledInCompatibilityMode$2.INSTANCE;
        Flags.BooleanFlagField is_compiled_in_compatibility_mode = jvmFlags.getIS_COMPILED_IN_COMPATIBILITY_MODE();
        is_compiled_in_compatibility_mode.getClass();
        new BooleanFlagDelegate(jvmAttributes$isCompiledInCompatibilityMode$2, new FlagImpl(is_compiled_in_compatibility_mode.offset, is_compiled_in_compatibility_mode.bitWidth, 1));
    }

    public static final boolean isMovedFromInterfaceCompanion(KmProperty kmProperty) {
        kmProperty.getClass();
        return isMovedFromInterfaceCompanion$delegate.getValue(kmProperty, $$delegatedProperties[6]);
    }
}
