package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;

/* loaded from: classes9.dex */
public final class InlineClassesUtilsKt {
    static {
        ClassId.Companion.topLevel(new FqName("kotlin.jvm.JvmInline"));
        new FqName("kotlin.jvm.JvmName");
    }

    public static final boolean isInlineClass(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).getValueClassRepresentation() instanceof InlineClassRepresentation);
    }

    public static final boolean isInlineClassType(KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        if (mo4153getDeclarationDescriptor != null) {
            return isInlineClass(mo4153getDeclarationDescriptor);
        }
        return false;
    }

    public static final boolean isMultiFieldValueClass(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return (declarationDescriptor instanceof ClassDescriptor) && (((ClassDescriptor) declarationDescriptor).getValueClassRepresentation() instanceof MultiFieldValueClassRepresentation);
    }

    public static final boolean isUnderlyingPropertyOfInlineClass(VariableDescriptor variableDescriptor) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentation;
        variableDescriptor.getClass();
        if (variableDescriptor.getExtensionReceiverParameter() != null || !variableDescriptor.getContextReceiverParameters().isEmpty()) {
            return false;
        }
        DeclarationDescriptor containingDeclaration = variableDescriptor.getContainingDeclaration();
        Name name = null;
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null && (inlineClassRepresentation = DescriptorUtilsKt.getInlineClassRepresentation(classDescriptor)) != null) {
            name = inlineClassRepresentation.getUnderlyingPropertyName();
        }
        return Intrinsics.areEqual(name, variableDescriptor.getName());
    }

    public static final boolean isValueClass(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return isInlineClass(declarationDescriptor) || isMultiFieldValueClass(declarationDescriptor);
    }

    public static final boolean needsMfvcFlattening(KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        return (mo4153getDeclarationDescriptor == null || !isMultiFieldValueClass(mo4153getDeclarationDescriptor) || SimpleClassicTypeSystemContext.INSTANCE.isNullableType(kotlinType)) ? false : true;
    }

    public static final KotlinType unsubstitutedUnderlyingType(KotlinType kotlinType) {
        InlineClassRepresentation<SimpleType> inlineClassRepresentation;
        kotlinType.getClass();
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        ClassDescriptor classDescriptor = mo4153getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo4153getDeclarationDescriptor : null;
        if (classDescriptor == null || (inlineClassRepresentation = DescriptorUtilsKt.getInlineClassRepresentation(classDescriptor)) == null) {
            return null;
        }
        return inlineClassRepresentation.getUnderlyingType();
    }
}
