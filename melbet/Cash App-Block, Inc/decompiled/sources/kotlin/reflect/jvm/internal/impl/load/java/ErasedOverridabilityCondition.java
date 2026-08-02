package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.io.LinesSequence;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.sequences.FlatteningSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TakeWhileSequence$iterator$1;
import kotlin.sequences.TransformingSequence;
import kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1;

/* loaded from: classes9.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Result isOverridable(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        callableDescriptor.getClass();
        callableDescriptor2.getClass();
        if (callableDescriptor2 instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) callableDescriptor2;
            List<TypeParameterDescriptor> typeParameters = javaMethodDescriptor.getTypeParameters();
            typeParameters.getClass();
            if (typeParameters.isEmpty()) {
                OverridingUtil.OverrideCompatibilityInfo basicOverridabilityProblem = OverridingUtil.getBasicOverridabilityProblem(callableDescriptor, callableDescriptor2);
                if ((basicOverridabilityProblem != null ? basicOverridabilityProblem.getResult() : null) != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<ValueParameterDescriptor> valueParameters = javaMethodDescriptor.getValueParameters();
                valueParameters.getClass();
                TransformingSequence map = SequencesKt___SequencesKt.map(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(valueParameters, 1), SpecialBuiltinMembers$$Lambda$0.INSTANCE$4);
                KotlinType returnType = javaMethodDescriptor.getReturnType();
                returnType.getClass();
                FlatteningSequence flatten = SequencesKt__SequencesKt.flatten(ArraysKt___ArraysKt.asSequence(new Sequence[]{map, new LinesSequence(returnType, 6)}));
                ReceiverParameterDescriptor extensionReceiverParameter = javaMethodDescriptor.getExtensionReceiverParameter();
                TakeWhileSequence$iterator$1 takeWhileSequence$iterator$1 = new TakeWhileSequence$iterator$1(SequencesKt___SequencesKt.plus(flatten, CollectionsKt__CollectionsKt.listOfNotNull(extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null)));
                while (takeWhileSequence$iterator$1.hasNext()) {
                    KotlinType kotlinType = (KotlinType) takeWhileSequence$iterator$1.next();
                    if (!kotlinType.getArguments().isEmpty() && !(kotlinType.unwrap() instanceof RawTypeImpl)) {
                        return ExternalOverridabilityCondition.Result.UNKNOWN;
                    }
                }
                CallableDescriptor substitute = callableDescriptor.substitute(new RawSubstitution(null, 1, null).buildSubstitutor());
                if (substitute == null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (substitute instanceof SimpleFunctionDescriptor) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) substitute;
                    List<TypeParameterDescriptor> typeParameters2 = simpleFunctionDescriptor.getTypeParameters();
                    typeParameters2.getClass();
                    if (!typeParameters2.isEmpty()) {
                        substitute = simpleFunctionDescriptor.newCopyBuilder().setTypeParameters(EmptyList.INSTANCE).build();
                        substitute.getClass();
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(substitute, callableDescriptor2, false).getResult();
                result.getClass();
                return WhenMappings.$EnumSwitchMapping$0[result.ordinal()] == 1 ? ExternalOverridabilityCondition.Result.OVERRIDABLE : ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
