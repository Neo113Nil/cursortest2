package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes9.dex */
public final class TypeParameterUtilsKt {
    public static final PossiblyInnerType buildPossiblyInnerType(KotlinType kotlinType, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i) {
        if (classifierDescriptorWithTypeParameters == null || ErrorUtils.isError(classifierDescriptorWithTypeParameters)) {
            return null;
        }
        int size = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters().size() + i;
        if (classifierDescriptorWithTypeParameters.isInner()) {
            List<TypeProjection> subList = kotlinType.getArguments().subList(i, size);
            DeclarationDescriptor containingDeclaration = classifierDescriptorWithTypeParameters.getContainingDeclaration();
            return new PossiblyInnerType(classifierDescriptorWithTypeParameters, subList, buildPossiblyInnerType(kotlinType, containingDeclaration instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) containingDeclaration : null, size));
        }
        if (size != kotlinType.getArguments().size()) {
            DescriptorUtils.isLocal(classifierDescriptorWithTypeParameters);
        }
        return new PossiblyInnerType(classifierDescriptorWithTypeParameters, kotlinType.getArguments().subList(i, kotlinType.getArguments().size()), null);
    }

    public static final List<TypeParameterDescriptor> computeConstructorTypeParameters(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        List<TypeParameterDescriptor> list;
        Object obj;
        TypeConstructor typeConstructor;
        classifierDescriptorWithTypeParameters.getClass();
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        if (!classifierDescriptorWithTypeParameters.isInner() && !(classifierDescriptorWithTypeParameters.getContainingDeclaration() instanceof CallableDescriptor)) {
            return declaredTypeParameters;
        }
        List list2 = SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.flatMap(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.takeWhile(DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters), FindClassInModuleKt$$Lambda$0.INSTANCE$2), FindClassInModuleKt$$Lambda$0.INSTANCE$3), FindClassInModuleKt$$Lambda$0.INSTANCE$4));
        Iterator it = DescriptorUtilsKt.getParents(classifierDescriptorWithTypeParameters).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof ClassDescriptor) {
                break;
            }
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) obj;
        if (classDescriptor != null && (typeConstructor = classDescriptor.getTypeConstructor()) != null) {
            list = typeConstructor.getParameters();
        }
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        if (list2.isEmpty() && list.isEmpty()) {
            List<TypeParameterDescriptor> declaredTypeParameters2 = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
            declaredTypeParameters2.getClass();
            return declaredTypeParameters2;
        }
        ArrayList plus = CollectionsKt.plus((Iterable) list, (Collection) list2);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10));
        Iterator it2 = plus.iterator();
        while (it2.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
            typeParameterDescriptor.getClass();
            arrayList.add(new CapturedTypeParameterDescriptor(typeParameterDescriptor, classifierDescriptorWithTypeParameters, declaredTypeParameters.size()));
        }
        return CollectionsKt.plus((Iterable) arrayList, (Collection) declaredTypeParameters);
    }

    public static final PossiblyInnerType buildPossiblyInnerType(KotlinType kotlinType) {
        kotlinType.getClass();
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        return buildPossiblyInnerType(kotlinType, mo4153getDeclarationDescriptor instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) mo4153getDeclarationDescriptor : null, 0);
    }
}
