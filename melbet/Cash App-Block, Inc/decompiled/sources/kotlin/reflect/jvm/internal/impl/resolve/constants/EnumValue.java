package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes9.dex */
public final class EnumValue extends ConstantValue<Pair<? extends ClassId, ? extends Name>> {
    public final ClassId enumClassId;
    public final Name enumEntryName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumValue(ClassId classId, Name name) {
        super(new Pair(classId, name));
        classId.getClass();
        name.getClass();
        this.enumClassId = classId;
        this.enumEntryName = name;
    }

    public final Name getEnumEntryName() {
        return this.enumEntryName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType getType(ModuleDescriptor moduleDescriptor) {
        SimpleType defaultType;
        moduleDescriptor.getClass();
        ClassId classId = this.enumClassId;
        ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassAcrossModuleDependencies != null) {
            if (!DescriptorUtils.isEnumClass(findClassAcrossModuleDependencies)) {
                findClassAcrossModuleDependencies = null;
            }
            if (findClassAcrossModuleDependencies != null && (defaultType = findClassAcrossModuleDependencies.getDefaultType()) != null) {
                return defaultType;
            }
        }
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
        String classId2 = classId.toString();
        String name = this.enumEntryName.toString();
        name.getClass();
        return ErrorUtils.createErrorType(errorTypeKind, classId2, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.enumClassId.getShortClassName());
        sb.append('.');
        sb.append(this.enumEntryName);
        return sb.toString();
    }
}
