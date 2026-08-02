package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check;

/* loaded from: classes9.dex */
public final class IsKPropertyCheck implements Check {
    public static final IsKPropertyCheck INSTANCE = new IsKPropertyCheck();

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final boolean check(FunctionDescriptor functionDescriptor) {
        functionDescriptor.getClass();
        ValueParameterDescriptor valueParameterDescriptor = functionDescriptor.getValueParameters().get(1);
        ReflectionTypes.Companion companion = ReflectionTypes.Companion;
        valueParameterDescriptor.getClass();
        KotlinType createKPropertyStarType = companion.createKPropertyStarType(DescriptorUtilsKt.getModule(valueParameterDescriptor));
        if (createKPropertyStarType == null) {
            return false;
        }
        KotlinType type2 = valueParameterDescriptor.getType();
        type2.getClass();
        return TypeUtilsKt.isSubtypeOf(createKPropertyStarType, TypeUtilsKt.makeNotNullable(type2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final /* bridge */ String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
