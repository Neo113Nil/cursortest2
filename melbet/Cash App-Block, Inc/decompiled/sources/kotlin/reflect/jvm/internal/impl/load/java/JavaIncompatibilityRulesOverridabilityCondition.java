package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes9.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r0), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r2)) == false) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static JvmType mapValueParameterType(FunctionDescriptor functionDescriptor, ValueParameterDescriptor valueParameterDescriptor) {
            if (!MethodSignatureMappingKt.forceSingleValueParameterBoxing(functionDescriptor)) {
                if (functionDescriptor.getValueParameters().size() == 1) {
                    DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
                    ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
                    if (classDescriptor != null) {
                        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
                        valueParameters.getClass();
                        ClassifierDescriptor mo4153getDeclarationDescriptor = ((ValueParameterDescriptor) CollectionsKt.single((List) valueParameters)).getType().getConstructor().mo4153getDeclarationDescriptor();
                        ClassDescriptor classDescriptor2 = mo4153getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo4153getDeclarationDescriptor : null;
                        if (classDescriptor2 != null) {
                            if (KotlinBuiltIns.isPrimitiveClass(classDescriptor)) {
                            }
                        }
                    }
                }
                KotlinType type2 = valueParameterDescriptor.getType();
                type2.getClass();
                return MethodSignatureMappingKt.mapToJvmType(type2);
            }
            KotlinType type3 = valueParameterDescriptor.getType();
            type3.getClass();
            return MethodSignatureMappingKt.mapToJvmType(TypeUtilsKt.makeNullable(type3));
        }

        public final boolean doesJavaOverrideHaveIncompatibleValueParameterKinds(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
            callableDescriptor.getClass();
            callableDescriptor2.getClass();
            if (!(callableDescriptor2 instanceof JavaMethodDescriptor) || !(callableDescriptor instanceof FunctionDescriptor)) {
                return false;
            }
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) callableDescriptor2;
            javaMethodDescriptor.getValueParameters().size();
            FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor;
            functionDescriptor.getValueParameters().size();
            List<ValueParameterDescriptor> valueParameters = javaMethodDescriptor.getOriginal().getValueParameters();
            valueParameters.getClass();
            List<ValueParameterDescriptor> valueParameters2 = functionDescriptor.getOriginal().getValueParameters();
            valueParameters2.getClass();
            Iterator it = CollectionsKt.zip(valueParameters, valueParameters2).iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.first;
                ValueParameterDescriptor valueParameterDescriptor2 = (ValueParameterDescriptor) pair.second;
                valueParameterDescriptor.getClass();
                boolean z = mapValueParameterType((FunctionDescriptor) callableDescriptor2, valueParameterDescriptor) instanceof JvmType.Primitive;
                valueParameterDescriptor2.getClass();
                if (z != (mapValueParameterType(functionDescriptor, valueParameterDescriptor2) instanceof JvmType.Primitive)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r5.getSameAsRenamedInJvmBuiltin(r1) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r1, false, false, 2, null)) != false) goto L45;
     */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExternalOverridabilityCondition.Result isOverridable(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        callableDescriptor.getClass();
        callableDescriptor2.getClass();
        if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && !KotlinBuiltIns.isBuiltIn(callableDescriptor2)) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
            FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor2;
            Name name = functionDescriptor.getName();
            name.getClass();
            if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
                SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
                Name name2 = functionDescriptor.getName();
                name2.getClass();
            }
            CallableMemberDescriptor overriddenSpecialBuiltin = SpecialBuiltinMembers.getOverriddenSpecialBuiltin((CallableMemberDescriptor) callableDescriptor);
            boolean z = callableDescriptor instanceof FunctionDescriptor;
            FunctionDescriptor functionDescriptor2 = z ? (FunctionDescriptor) callableDescriptor : null;
            if ((functionDescriptor2 != null && functionDescriptor.isHiddenToOvercomeSignatureClash() == functionDescriptor2.isHiddenToOvercomeSignatureClash()) || (overriddenSpecialBuiltin != null && functionDescriptor.isHiddenToOvercomeSignatureClash())) {
                if ((classDescriptor instanceof JavaClassDescriptor) && functionDescriptor.getInitialSignatureDescriptor() == null && overriddenSpecialBuiltin != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(classDescriptor, overriddenSpecialBuiltin)) {
                    if ((overriddenSpecialBuiltin instanceof FunctionDescriptor) && z && BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((FunctionDescriptor) overriddenSpecialBuiltin) != null) {
                        String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 2, null);
                        FunctionDescriptor original = ((FunctionDescriptor) callableDescriptor).getOriginal();
                        original.getClass();
                    }
                }
            }
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(callableDescriptor, callableDescriptor2) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
