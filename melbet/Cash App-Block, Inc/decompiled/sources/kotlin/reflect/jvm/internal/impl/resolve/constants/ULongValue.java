package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes9.dex */
public final class ULongValue extends UnsignedValueConstant<Long> {
    public ULongValue(long j) {
        super(Long.valueOf(j));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor moduleDescriptor) {
        SimpleType defaultType;
        moduleDescriptor.getClass();
        ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, StandardNames.FqNames.uLong);
        return (findClassAcrossModuleDependencies == null || (defaultType = findClassAcrossModuleDependencies.getDefaultType()) == null) ? ErrorUtils.createErrorType(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "ULong") : defaultType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        return getValue().longValue() + ".toULong()";
    }
}
