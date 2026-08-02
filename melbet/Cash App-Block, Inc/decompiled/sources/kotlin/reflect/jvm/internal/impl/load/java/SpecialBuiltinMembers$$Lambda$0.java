package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* loaded from: classes9.dex */
public final class SpecialBuiltinMembers$$Lambda$0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public static final SpecialBuiltinMembers$$Lambda$0 INSTANCE$1 = new SpecialBuiltinMembers$$Lambda$0(1);
    public static final SpecialBuiltinMembers$$Lambda$0 INSTANCE$2 = new SpecialBuiltinMembers$$Lambda$0(2);
    public static final SpecialBuiltinMembers$$Lambda$0 INSTANCE$3 = new SpecialBuiltinMembers$$Lambda$0(3);
    public static final SpecialBuiltinMembers$$Lambda$0 INSTANCE$4 = new SpecialBuiltinMembers$$Lambda$0(4);
    public static final SpecialBuiltinMembers$$Lambda$0 INSTANCE = new SpecialBuiltinMembers$$Lambda$0(0);
    public static final SpecialBuiltinMembers$$Lambda$0 INSTANCE$5 = new SpecialBuiltinMembers$$Lambda$0(5);
    public static final SpecialBuiltinMembers$$Lambda$0 INSTANCE$6 = new SpecialBuiltinMembers$$Lambda$0(6);

    public /* synthetic */ SpecialBuiltinMembers$$Lambda$0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.$r8$classId) {
            case 0:
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
                callableMemberDescriptor.getClass();
                return Boolean.valueOf(ClassicBuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor)));
            case 1:
                CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) obj;
                BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
                callableMemberDescriptor2.getClass();
                BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getClass();
                return Boolean.valueOf(CollectionsKt.contains(SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SIGNATURES(), MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptor2)));
            case 2:
                CallableMemberDescriptor callableMemberDescriptor3 = (CallableMemberDescriptor) obj;
                BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature2 = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
                callableMemberDescriptor3.getClass();
                if (callableMemberDescriptor3 instanceof FunctionDescriptor) {
                    BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getClass();
                    if (CollectionsKt.contains(SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SIGNATURES(), MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptor3))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                CallableMemberDescriptor callableMemberDescriptor4 = (CallableMemberDescriptor) obj;
                callableMemberDescriptor4.getClass();
                return Boolean.valueOf(ClassicBuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(callableMemberDescriptor4));
            case 4:
                return ((ValueParameterDescriptor) obj).getType();
            case 5:
                CallableMemberDescriptor callableMemberDescriptor5 = (CallableMemberDescriptor) obj;
                callableMemberDescriptor5.getClass();
                return Boolean.valueOf(BuiltinMethodsWithDifferentJvmName.INSTANCE.isBuiltinFunctionWithDifferentNameInJvm((SimpleFunctionDescriptor) callableMemberDescriptor5));
            default:
                CallableMemberDescriptor callableMemberDescriptor6 = (CallableMemberDescriptor) obj;
                callableMemberDescriptor6.getClass();
                if (KotlinBuiltIns.isBuiltIn(callableMemberDescriptor6) && BuiltinMethodsWithSpecialGenericSignature.getSpecialSignatureInfo(callableMemberDescriptor6) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
