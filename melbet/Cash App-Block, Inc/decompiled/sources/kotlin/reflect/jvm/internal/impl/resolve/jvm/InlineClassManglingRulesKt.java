package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes9.dex */
public final class InlineClassManglingRulesKt {
    public static final boolean isTypeParameterWithUpperBoundThatRequiresMangling(KotlinType kotlinType) {
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        TypeParameterDescriptor typeParameterDescriptor = mo4153getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) mo4153getDeclarationDescriptor : null;
        if (typeParameterDescriptor == null) {
            return false;
        }
        KotlinType representativeUpperBound = TypeUtilsKt.getRepresentativeUpperBound(typeParameterDescriptor);
        return isValueClassThatRequiresMangling(representativeUpperBound) || isTypeParameterWithUpperBoundThatRequiresMangling(representativeUpperBound);
    }

    public static final boolean isValueClassThatRequiresMangling(KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        if (mo4153getDeclarationDescriptor != null) {
            return (InlineClassesUtilsKt.isInlineClass(mo4153getDeclarationDescriptor) && isValueClassThatRequiresMangling(mo4153getDeclarationDescriptor)) || InlineClassesUtilsKt.needsMfvcFlattening(kotlinType);
        }
        return false;
    }

    public static final boolean shouldHideConstructorDueToValueClassTypeValueParameters(CallableMemberDescriptor callableMemberDescriptor) {
        callableMemberDescriptor.getClass();
        ClassConstructorDescriptor classConstructorDescriptor = callableMemberDescriptor instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) callableMemberDescriptor : null;
        if (classConstructorDescriptor == null || DescriptorVisibilities.isPrivate(classConstructorDescriptor.getVisibility())) {
            return false;
        }
        ClassDescriptor constructedClass = classConstructorDescriptor.getConstructedClass();
        constructedClass.getClass();
        if (InlineClassesUtilsKt.isValueClass(constructedClass) || DescriptorUtils.isSealedClass(classConstructorDescriptor.getConstructedClass())) {
            return false;
        }
        List<ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
        valueParameters.getClass();
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type2 = ((ValueParameterDescriptor) it.next()).getType();
            type2.getClass();
            if (isValueClassThatRequiresMangling(type2) || isTypeParameterWithUpperBoundThatRequiresMangling(type2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isValueClassThatRequiresMangling(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return InlineClassesUtilsKt.isValueClass(declarationDescriptor) && !Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) declarationDescriptor), StandardNames.RESULT_FQ_NAME);
    }
}
