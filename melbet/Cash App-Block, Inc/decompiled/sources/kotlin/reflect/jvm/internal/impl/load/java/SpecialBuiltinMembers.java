package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure;

/* loaded from: classes9.dex */
public final class SpecialBuiltinMembers {
    public static final boolean doesOverrideBuiltinWithDifferentJvmName(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor) != null;
    }

    public static final String getJvmMethodNameIfSpecial(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor propertyIfAccessor;
        Name jvmName;
        callableMemberDescriptor.getClass();
        CallableMemberDescriptor overriddenBuiltinWithDifferentJvmName = KotlinBuiltIns.isBuiltIn(callableMemberDescriptor) ? getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor) : null;
        if (overriddenBuiltinWithDifferentJvmName != null && (propertyIfAccessor = DescriptorUtilsKt.getPropertyIfAccessor(overriddenBuiltinWithDifferentJvmName)) != null) {
            if (propertyIfAccessor instanceof PropertyDescriptor) {
                return ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyIfAccessor);
            }
            if ((propertyIfAccessor instanceof SimpleFunctionDescriptor) && (jvmName = BuiltinMethodsWithDifferentJvmName.INSTANCE.getJvmName((SimpleFunctionDescriptor) propertyIfAccessor)) != null) {
                return jvmName.asString();
            }
        }
        return null;
    }

    public static final <T extends CallableMemberDescriptor> T getOverriddenBuiltinWithDifferentJvmName(T t) {
        t.getClass();
        if (SpecialGenericSignatures.Companion.getORIGINAL_SHORT_NAMES().contains(t.getName()) || BuiltinSpecialProperties.INSTANCE.getSPECIAL_SHORT_NAMES().contains(DescriptorUtilsKt.getPropertyIfAccessor(t).getName())) {
            if ((t instanceof PropertyDescriptor) || (t instanceof PropertyAccessorDescriptor)) {
                return (T) DescriptorUtilsKt.firstOverridden$default(t, false, SpecialBuiltinMembers$$Lambda$0.INSTANCE, 1, null);
            }
            if (t instanceof SimpleFunctionDescriptor) {
                return (T) DescriptorUtilsKt.firstOverridden$default(t, false, SpecialBuiltinMembers$$Lambda$0.INSTANCE$5, 1, null);
            }
        }
        return null;
    }

    public static final <T extends CallableMemberDescriptor> T getOverriddenSpecialBuiltin(T t) {
        t.getClass();
        T t2 = (T) getOverriddenBuiltinWithDifferentJvmName(t);
        if (t2 != null) {
            return t2;
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name = t.getName();
        name.getClass();
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return (T) DescriptorUtilsKt.firstOverridden$default(t, false, SpecialBuiltinMembers$$Lambda$0.INSTANCE$6, 1, null);
        }
        return null;
    }

    public static final boolean hasRealKotlinSuperClassWithOverrideOf(ClassDescriptor classDescriptor, CallableDescriptor callableDescriptor) {
        classDescriptor.getClass();
        callableDescriptor.getClass();
        DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        containingDeclaration.getClass();
        SimpleType defaultType = ((ClassDescriptor) containingDeclaration).getDefaultType();
        defaultType.getClass();
        for (ClassDescriptor superClassDescriptor = DescriptorUtils.getSuperClassDescriptor(classDescriptor); superClassDescriptor != null; superClassDescriptor = DescriptorUtils.getSuperClassDescriptor(superClassDescriptor)) {
            if (!(superClassDescriptor instanceof JavaClassDescriptor) && TypeCheckingProcedure.findCorrespondingSupertype(superClassDescriptor.getDefaultType(), defaultType) != null) {
                return !KotlinBuiltIns.isBuiltIn(superClassDescriptor);
            }
        }
        return false;
    }

    public static final boolean isFromJava(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor).getContainingDeclaration() instanceof JavaClassDescriptor;
    }

    public static final boolean isFromJavaOrBuiltins(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        return isFromJava(callableMemberDescriptor) || KotlinBuiltIns.isBuiltIn(callableMemberDescriptor);
    }
}
