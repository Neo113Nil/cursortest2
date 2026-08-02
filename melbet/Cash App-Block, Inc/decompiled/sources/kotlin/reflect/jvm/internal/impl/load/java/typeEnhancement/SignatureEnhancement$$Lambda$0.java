package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes9.dex */
public final class SignatureEnhancement$$Lambda$0 implements Function1 {
    public static final SignatureEnhancement$$Lambda$0 INSTANCE = new SignatureEnhancement$$Lambda$0(0);
    public static final SignatureEnhancement$$Lambda$0 INSTANCE$1 = new SignatureEnhancement$$Lambda$0(1);
    public static final SignatureEnhancement$$Lambda$0 INSTANCE$2 = new SignatureEnhancement$$Lambda$0(2);
    public static final SignatureEnhancement$$Lambda$0 INSTANCE$3 = new SignatureEnhancement$$Lambda$0(3);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SignatureEnhancement$$Lambda$0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
                callableMemberDescriptor.getClass();
                ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
                extensionReceiverParameter.getClass();
                KotlinType type2 = extensionReceiverParameter.getType();
                type2.getClass();
                return type2;
            case 1:
                CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) obj;
                callableMemberDescriptor2.getClass();
                KotlinType returnType = callableMemberDescriptor2.getReturnType();
                returnType.getClass();
                return returnType;
            case 2:
                UnwrappedType unwrappedType = (UnwrappedType) obj;
                unwrappedType.getClass();
                return Boolean.valueOf(unwrappedType instanceof RawType);
            default:
                ClassifierDescriptor mo4153getDeclarationDescriptor = ((UnwrappedType) obj).getConstructor().mo4153getDeclarationDescriptor();
                if (mo4153getDeclarationDescriptor == null) {
                    return Boolean.FALSE;
                }
                Name name = mo4153getDeclarationDescriptor.getName();
                JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
                return Boolean.valueOf(Intrinsics.areEqual(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().shortName()) && Intrinsics.areEqual(DescriptorUtilsKt.fqNameOrNull(mo4153getDeclarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME()));
        }
    }
}
