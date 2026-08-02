package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;

/* loaded from: classes9.dex */
public final class DescriptorUtilKt {
    public static final ClassifierDescriptor getTopLevelContainingClassifier(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        if (containingDeclaration != null && !(declarationDescriptor instanceof PackageFragmentDescriptor)) {
            if (!isTopLevelInPackage(containingDeclaration)) {
                return getTopLevelContainingClassifier(containingDeclaration);
            }
            if (containingDeclaration instanceof ClassifierDescriptor) {
                return (ClassifierDescriptor) containingDeclaration;
            }
        }
        return null;
    }

    public static final boolean isTopLevelInPackage(DeclarationDescriptor declarationDescriptor) {
        declarationDescriptor.getClass();
        return declarationDescriptor.getContainingDeclaration() instanceof PackageFragmentDescriptor;
    }

    public static final boolean isTypedEqualsInValueClass(FunctionDescriptor functionDescriptor) {
        SimpleType defaultType;
        KotlinType replaceArgumentsWithStarProjections;
        KotlinType returnType;
        functionDescriptor.getClass();
        DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null) {
            ClassDescriptor classDescriptor2 = InlineClassesUtilsKt.isValueClass(classDescriptor) ? classDescriptor : null;
            if (classDescriptor2 != null && (defaultType = classDescriptor2.getDefaultType()) != null && (replaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) != null && (returnType = functionDescriptor.getReturnType()) != null && Intrinsics.areEqual(functionDescriptor.getName(), OperatorNameConventions.EQUALS) && ((TypeUtilsKt.isBoolean(returnType) || TypeUtilsKt.isNothing(returnType)) && functionDescriptor.getValueParameters().size() == 1)) {
                KotlinType type2 = functionDescriptor.getValueParameters().get(0).getType();
                type2.getClass();
                if (Intrinsics.areEqual(TypeUtilsKt.replaceArgumentsWithStarProjections(type2), replaceArgumentsWithStarProjections) && functionDescriptor.getContextReceiverParameters().isEmpty() && functionDescriptor.getExtensionReceiverParameter() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final ClassDescriptor resolveClassByFqName(ModuleDescriptor moduleDescriptor, FqName fqName, LookupLocation lookupLocation) {
        MemberScope unsubstitutedInnerClassesScope;
        moduleDescriptor.getClass();
        fqName.getClass();
        lookupLocation.getClass();
        if (fqName.isRoot()) {
            return null;
        }
        ClassifierDescriptor mo4154getContributedClassifier = moduleDescriptor.getPackage(fqName.parent()).getMemberScope().mo4154getContributedClassifier(fqName.shortName(), lookupLocation);
        ClassDescriptor classDescriptor = mo4154getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) mo4154getContributedClassifier : null;
        if (classDescriptor != null) {
            return classDescriptor;
        }
        ClassDescriptor resolveClassByFqName = resolveClassByFqName(moduleDescriptor, fqName.parent(), lookupLocation);
        ClassifierDescriptor mo4154getContributedClassifier2 = (resolveClassByFqName == null || (unsubstitutedInnerClassesScope = resolveClassByFqName.getUnsubstitutedInnerClassesScope()) == null) ? null : unsubstitutedInnerClassesScope.mo4154getContributedClassifier(fqName.shortName(), lookupLocation);
        if (mo4154getContributedClassifier2 instanceof ClassDescriptor) {
            return (ClassDescriptor) mo4154getContributedClassifier2;
        }
        return null;
    }
}
