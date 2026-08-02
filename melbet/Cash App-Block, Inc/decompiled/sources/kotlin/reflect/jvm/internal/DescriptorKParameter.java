package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.types.DescriptorKType;

/* loaded from: classes9.dex */
public final class DescriptorKParameter extends ReflectKParameter {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(DescriptorKParameter.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0), new PropertyReference1Impl(DescriptorKParameter.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    public final ReflectProperties$LazySoftVal annotations$delegate = TuplesKt.lazySoft(null, new DescriptorKParameter$$Lambda$0(this, 0));
    public final DescriptorKCallable callable;
    public final ReflectProperties$LazySoftVal descriptor$delegate;
    public final int index;
    public final KParameter$Kind kind;

    public DescriptorKParameter(DescriptorKCallable descriptorKCallable, int i, KParameter$Kind kParameter$Kind, Function0 function0) {
        this.callable = descriptorKCallable;
        this.index = i;
        this.kind = kParameter$Kind;
        this.descriptor$delegate = TuplesKt.lazySoft(null, function0);
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter, kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        KProperty kProperty = $$delegatedProperties[1];
        Object invoke = this.annotations$delegate.invoke();
        invoke.getClass();
        return (List) invoke;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final ReflectKCallable getCallable() {
        return this.callable;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final boolean getDeclaresDefaultValue() {
        ParameterDescriptor descriptor = getDescriptor();
        ValueParameterDescriptor valueParameterDescriptor = descriptor instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) descriptor : null;
        return valueParameterDescriptor != null && valueParameterDescriptor.declaresDefaultValue();
    }

    public final ParameterDescriptor getDescriptor() {
        KProperty kProperty = $$delegatedProperties[0];
        Object invoke = this.descriptor$delegate.invoke();
        invoke.getClass();
        return (ParameterDescriptor) invoke;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final KParameter$Kind getKind() {
        return this.kind;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final String getName() {
        ParameterDescriptor descriptor = getDescriptor();
        ValueParameterDescriptor valueParameterDescriptor = descriptor instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) descriptor : null;
        if (valueParameterDescriptor != null && !valueParameterDescriptor.getContainingDeclaration().hasSynthesizedParameterNames()) {
            Name name = valueParameterDescriptor.getName();
            name.getClass();
            if (!name.isSpecial()) {
                return name.asString();
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final KType getType() {
        KotlinType type2 = getDescriptor().getType();
        type2.getClass();
        DescriptorKType descriptorKType = new DescriptorKType(type2, new DescriptorKParameter$$Lambda$0(this, 1), false);
        DescriptorKCallable descriptorKCallable = this.callable;
        KType kType = descriptorKCallable.overriddenStorage.typeSubstitutor.substitute(descriptorKType, KVariance.INVARIANT).f1521type;
        if (kType != null) {
            return kType;
        }
        FakeOverridesKt.starProjectionInTopLevelTypeIsNotPossible(descriptorKCallable);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final boolean isOptional() {
        ParameterDescriptor descriptor = getDescriptor();
        ValueParameterDescriptor valueParameterDescriptor = descriptor instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) descriptor : null;
        if (valueParameterDescriptor != null) {
            return DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final boolean isVararg() {
        ParameterDescriptor descriptor = getDescriptor();
        return (descriptor instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) descriptor).getVarargElementType() != null;
    }
}
