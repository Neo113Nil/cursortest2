package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes9.dex */
public final class FindClassInModuleKt {
    public static final ClassDescriptor findClassAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        moduleDescriptor.getClass();
        classId.getClass();
        ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        moduleDescriptor.getClass();
        classId.getClass();
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> pathSegments = classId.getRelativeClassName().pathSegments();
            ClassifierDescriptor mo4154getContributedClassifier = packageViewDescriptor.getMemberScope().mo4154getContributedClassifier((Name) CollectionsKt.first((List) pathSegments), NoLookupLocation.FROM_DESERIALIZATION);
            if (mo4154getContributedClassifier == null) {
                return null;
            }
            for (Name name : pathSegments.subList(1, pathSegments.size())) {
                if (!(mo4154getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor mo4154getContributedClassifier2 = ((ClassDescriptor) mo4154getContributedClassifier).getUnsubstitutedInnerClassesScope().mo4154getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                mo4154getContributedClassifier = mo4154getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) mo4154getContributedClassifier2 : null;
                if (mo4154getContributedClassifier == null) {
                    return null;
                }
            }
            return mo4154getContributedClassifier;
        }
        PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(classId.getPackageFqName());
        List<Name> pathSegments2 = classId.getRelativeClassName().pathSegments();
        ClassifierDescriptor mo4154getContributedClassifier3 = packageViewDescriptor2.getMemberScope().mo4154getContributedClassifier((Name) CollectionsKt.first((List) pathSegments2), NoLookupLocation.FROM_DESERIALIZATION);
        if (mo4154getContributedClassifier3 != null) {
            for (Name name2 : pathSegments2.subList(1, pathSegments2.size())) {
                if (mo4154getContributedClassifier3 instanceof ClassDescriptor) {
                    ClassifierDescriptor mo4154getContributedClassifier4 = ((ClassDescriptor) mo4154getContributedClassifier3).getUnsubstitutedInnerClassesScope().mo4154getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                    mo4154getContributedClassifier3 = mo4154getContributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) mo4154getContributedClassifier4 : null;
                    if (mo4154getContributedClassifier3 != null) {
                    }
                }
            }
            if (mo4154getContributedClassifier3 == null) {
                return mo4154getContributedClassifier3;
            }
            PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(classId.getPackageFqName());
            List<Name> pathSegments3 = classId.getRelativeClassName().pathSegments();
            ClassifierDescriptor mo4154getContributedClassifier5 = packageViewDescriptor3.getMemberScope().mo4154getContributedClassifier((Name) CollectionsKt.first((List) pathSegments3), NoLookupLocation.FROM_DESERIALIZATION);
            if (mo4154getContributedClassifier5 == null) {
                return null;
            }
            for (Name name3 : pathSegments3.subList(1, pathSegments3.size())) {
                if (!(mo4154getContributedClassifier5 instanceof ClassDescriptor)) {
                    return null;
                }
                ClassifierDescriptor mo4154getContributedClassifier6 = ((ClassDescriptor) mo4154getContributedClassifier5).getUnsubstitutedInnerClassesScope().mo4154getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
                mo4154getContributedClassifier5 = mo4154getContributedClassifier6 instanceof ClassDescriptor ? (ClassDescriptor) mo4154getContributedClassifier6 : null;
                if (mo4154getContributedClassifier5 == null) {
                    return null;
                }
            }
            return mo4154getContributedClassifier5;
        }
        mo4154getContributedClassifier3 = null;
        if (mo4154getContributedClassifier3 == null) {
        }
    }

    public static final ClassDescriptor findNonGenericClassAcrossDependencies(ModuleDescriptor moduleDescriptor, ClassId classId, NotFoundClasses notFoundClasses) {
        moduleDescriptor.getClass();
        classId.getClass();
        notFoundClasses.getClass();
        ClassDescriptor findClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return findClassAcrossModuleDependencies != null ? findClassAcrossModuleDependencies : notFoundClasses.getClass(classId, SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt__SequencesKt.generateSequence(FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1.INSTANCE, classId), FindClassInModuleKt$$Lambda$0.INSTANCE)));
    }

    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        moduleDescriptor.getClass();
        classId.getClass();
        ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
