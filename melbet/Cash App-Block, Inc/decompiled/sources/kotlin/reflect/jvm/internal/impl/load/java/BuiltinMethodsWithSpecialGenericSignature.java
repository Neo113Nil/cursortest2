package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes9.dex */
public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {
    public static final BuiltinMethodsWithSpecialGenericSignature INSTANCE = new BuiltinMethodsWithSpecialGenericSignature();

    public static final FunctionDescriptor getOverriddenBuiltinFunctionWithErasedValueParametersInJava(FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = INSTANCE;
        Name name = functionDescriptor.getName();
        name.getClass();
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return (FunctionDescriptor) DescriptorUtilsKt.firstOverridden$default(functionDescriptor, false, SpecialBuiltinMembers$$Lambda$0.INSTANCE$1, 1, null);
        }
        return null;
    }

    public static final SpecialGenericSignatures.SpecialSignatureInfo getSpecialSignatureInfo(CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor firstOverridden$default;
        String computeJvmSignature;
        callableMemberDescriptor.getClass();
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
        if (!companion.getERASED_VALUE_PARAMETERS_SHORT_NAMES().contains(callableMemberDescriptor.getName()) || (firstOverridden$default = DescriptorUtilsKt.firstOverridden$default(callableMemberDescriptor, false, SpecialBuiltinMembers$$Lambda$0.INSTANCE$2, 1, null)) == null || (computeJvmSignature = MethodSignatureMappingKt.computeJvmSignature(firstOverridden$default)) == null) {
            return null;
        }
        return companion.getSpecialSignatureInfo(computeJvmSignature);
    }

    public final boolean getSameAsBuiltinMethodWithErasedValueParameters(Name name) {
        name.getClass();
        return SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SHORT_NAMES().contains(name);
    }
}
