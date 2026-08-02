package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.AbstractStubType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

/* loaded from: classes9.dex */
public final class TypeUtilsKt {
    public static final TypeProjection asTypeProjection(KotlinType kotlinType) {
        kotlinType.getClass();
        return new TypeProjectionImpl(kotlinType);
    }

    public static final boolean contains(KotlinType kotlinType, Function1<? super UnwrappedType, Boolean> function1) {
        kotlinType.getClass();
        function1.getClass();
        return TypeUtils.contains(kotlinType, function1);
    }

    public static final boolean containsSelfTypeParameter(KotlinType kotlinType, TypeConstructor typeConstructor, Set set) {
        boolean containsSelfTypeParameter;
        if (Intrinsics.areEqual(kotlinType.getConstructor(), typeConstructor)) {
            return true;
        }
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = mo4153getDeclarationDescriptor instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) mo4153getDeclarationDescriptor : null;
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.getDeclaredTypeParameters() : null;
        Iterable withIndex = CollectionsKt.withIndex(kotlinType.getArguments());
        if (!(withIndex instanceof Collection) || !((Collection) withIndex).isEmpty()) {
            Iterator it = withIndex.iterator();
            do {
                ArrayIterator arrayIterator = (ArrayIterator) it;
                if (((Iterator) arrayIterator.f1520array).hasNext()) {
                    IndexedValue indexedValue = (IndexedValue) arrayIterator.next();
                    int i = indexedValue.index;
                    TypeProjection typeProjection = (TypeProjection) indexedValue.value;
                    TypeParameterDescriptor typeParameterDescriptor = declaredTypeParameters != null ? (TypeParameterDescriptor) CollectionsKt.getOrNull(i, declaredTypeParameters) : null;
                    if ((typeParameterDescriptor == null || set == null || !set.contains(typeParameterDescriptor)) && !typeProjection.isStarProjection()) {
                        KotlinType type2 = typeProjection.getType();
                        type2.getClass();
                        containsSelfTypeParameter = containsSelfTypeParameter(type2, typeConstructor, set);
                    } else {
                        containsSelfTypeParameter = false;
                    }
                }
            } while (!containsSelfTypeParameter);
            return true;
        }
        return false;
    }

    public static final boolean containsTypeAliasParameters(KotlinType kotlinType) {
        kotlinType.getClass();
        return contains(kotlinType, TypeUtilsKt$$Lambda$0.INSTANCE$1);
    }

    public static final boolean containsTypeParameter(KotlinType kotlinType) {
        kotlinType.getClass();
        return TypeUtils.contains(kotlinType, TypeUtilsKt$$Lambda$0.INSTANCE);
    }

    public static final TypeProjection createProjection(KotlinType kotlinType, Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        kotlinType.getClass();
        variance.getClass();
        if ((typeParameterDescriptor != null ? typeParameterDescriptor.getVariance() : null) == variance) {
            variance = Variance.INVARIANT;
        }
        return new TypeProjectionImpl(variance, kotlinType);
    }

    public static final void extractTypeParametersFromUpperBounds(KotlinType kotlinType, KotlinType kotlinType2, LinkedHashSet linkedHashSet, Set set) {
        ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        if (mo4153getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            if (!Intrinsics.areEqual(kotlinType.getConstructor(), kotlinType2.getConstructor())) {
                linkedHashSet.add(mo4153getDeclarationDescriptor);
                return;
            }
            for (KotlinType kotlinType3 : ((TypeParameterDescriptor) mo4153getDeclarationDescriptor).getUpperBounds()) {
                kotlinType3.getClass();
                extractTypeParametersFromUpperBounds(kotlinType3, kotlinType2, linkedHashSet, set);
            }
            return;
        }
        ClassifierDescriptor mo4153getDeclarationDescriptor2 = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = mo4153getDeclarationDescriptor2 instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) mo4153getDeclarationDescriptor2 : null;
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.getDeclaredTypeParameters() : null;
        int i = 0;
        for (TypeProjection typeProjection : kotlinType.getArguments()) {
            int i2 = i + 1;
            TypeParameterDescriptor typeParameterDescriptor = declaredTypeParameters != null ? (TypeParameterDescriptor) CollectionsKt.getOrNull(i, declaredTypeParameters) : null;
            if ((typeParameterDescriptor == null || set == null || !set.contains(typeParameterDescriptor)) && !typeProjection.isStarProjection() && !CollectionsKt.contains(linkedHashSet, typeProjection.getType().getConstructor().mo4153getDeclarationDescriptor()) && !Intrinsics.areEqual(typeProjection.getType().getConstructor(), kotlinType2.getConstructor())) {
                KotlinType type2 = typeProjection.getType();
                type2.getClass();
                extractTypeParametersFromUpperBounds(type2, kotlinType2, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final KotlinBuiltIns getBuiltIns(KotlinType kotlinType) {
        kotlinType.getClass();
        KotlinBuiltIns builtIns = kotlinType.getConstructor().getBuiltIns();
        builtIns.getClass();
        return builtIns;
    }

    public static final KotlinType getRepresentativeUpperBound(TypeParameterDescriptor typeParameterDescriptor) {
        Object obj;
        typeParameterDescriptor.getClass();
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        upperBounds.getClass();
        upperBounds.isEmpty();
        List<KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
        upperBounds2.getClass();
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ClassifierDescriptor mo4153getDeclarationDescriptor = ((KotlinType) next).getConstructor().mo4153getDeclarationDescriptor();
            ClassDescriptor classDescriptor = mo4153getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo4153getDeclarationDescriptor : null;
            if (classDescriptor != null && classDescriptor.getKind() != ClassKind.INTERFACE && classDescriptor.getKind() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        KotlinType kotlinType = (KotlinType) obj;
        if (kotlinType != null) {
            return kotlinType;
        }
        List<KotlinType> upperBounds3 = typeParameterDescriptor.getUpperBounds();
        upperBounds3.getClass();
        Object first = CollectionsKt.first((List) upperBounds3);
        first.getClass();
        return (KotlinType) first;
    }

    public static final boolean hasTypeParameterRecursiveBounds(TypeParameterDescriptor typeParameterDescriptor, TypeConstructor typeConstructor, Set<? extends TypeParameterDescriptor> set) {
        typeParameterDescriptor.getClass();
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        upperBounds.getClass();
        List<KotlinType> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (KotlinType kotlinType : list) {
            kotlinType.getClass();
            if (containsSelfTypeParameter(kotlinType, typeParameterDescriptor.getDefaultType().getConstructor(), set) && (typeConstructor == null || Intrinsics.areEqual(kotlinType.getConstructor(), typeConstructor))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean hasTypeParameterRecursiveBounds$default(TypeParameterDescriptor typeParameterDescriptor, TypeConstructor typeConstructor, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            typeConstructor = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return hasTypeParameterRecursiveBounds(typeParameterDescriptor, typeConstructor, set);
    }

    public static final boolean isBoolean(KotlinType kotlinType) {
        kotlinType.getClass();
        return KotlinBuiltIns.isBoolean(kotlinType);
    }

    public static final boolean isNothing(KotlinType kotlinType) {
        kotlinType.getClass();
        return KotlinBuiltIns.isNothing(kotlinType);
    }

    public static final boolean isStubType(KotlinType kotlinType) {
        kotlinType.getClass();
        if (kotlinType instanceof AbstractStubType) {
            return true;
        }
        return (kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).getOriginal() instanceof AbstractStubType);
    }

    public static final boolean isStubTypeForBuilderInference(KotlinType kotlinType) {
        kotlinType.getClass();
        if (kotlinType instanceof StubTypeForBuilderInference) {
            return true;
        }
        return (kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).getOriginal() instanceof StubTypeForBuilderInference);
    }

    public static final boolean isSubtypeOf(KotlinType kotlinType, KotlinType kotlinType2) {
        kotlinType.getClass();
        kotlinType2.getClass();
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(kotlinType, kotlinType2);
    }

    public static final boolean isTypeAliasParameter(ClassifierDescriptor classifierDescriptor) {
        classifierDescriptor.getClass();
        return (classifierDescriptor instanceof TypeParameterDescriptor) && (((TypeParameterDescriptor) classifierDescriptor).getContainingDeclaration() instanceof TypeAliasDescriptor);
    }

    public static final boolean isTypeParameter(KotlinType kotlinType) {
        kotlinType.getClass();
        return TypeUtils.isTypeParameter(kotlinType);
    }

    public static final boolean isUnresolvedType(KotlinType kotlinType) {
        kotlinType.getClass();
        return (kotlinType instanceof ErrorType) && ((ErrorType) kotlinType).getKind().isUnresolved();
    }

    public static final KotlinType makeNotNullable(KotlinType kotlinType) {
        kotlinType.getClass();
        KotlinType makeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        makeNotNullable.getClass();
        return makeNotNullable;
    }

    public static final KotlinType makeNullable(KotlinType kotlinType) {
        kotlinType.getClass();
        KotlinType makeNullable = TypeUtils.makeNullable(kotlinType);
        makeNullable.getClass();
        return makeNullable;
    }

    public static final KotlinType replaceAnnotations(KotlinType kotlinType, Annotations annotations) {
        kotlinType.getClass();
        annotations.getClass();
        return (kotlinType.getAnnotations().isEmpty() && annotations.isEmpty()) ? kotlinType : kotlinType.unwrap().replaceAttributes(TypeAttributesKt.replaceAnnotations(kotlinType.getAttributes(), annotations));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.reflect.jvm.internal.impl.types.UnwrappedType] */
    public static final KotlinType replaceArgumentsWithStarProjections(KotlinType kotlinType) {
        SimpleType simpleType;
        kotlinType.getClass();
        UnwrappedType unwrap2 = kotlinType.unwrap();
        if (unwrap2 instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrap2;
            SimpleType lowerBound = flexibleType.getLowerBound();
            if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().mo4153getDeclarationDescriptor() != null) {
                List<TypeParameterDescriptor> parameters = lowerBound.getConstructor().getParameters();
                parameters.getClass();
                List<TypeParameterDescriptor> list = parameters;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StarProjectionImpl((TypeParameterDescriptor) it.next()));
                }
                lowerBound = TypeSubstitutionKt.replace$default(lowerBound, arrayList, null, 2, null);
            }
            SimpleType upperBound = flexibleType.getUpperBound();
            if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().mo4153getDeclarationDescriptor() != null) {
                List<TypeParameterDescriptor> parameters2 = upperBound.getConstructor().getParameters();
                parameters2.getClass();
                List<TypeParameterDescriptor> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new StarProjectionImpl((TypeParameterDescriptor) it2.next()));
                }
                upperBound = TypeSubstitutionKt.replace$default(upperBound, arrayList2, null, 2, null);
            }
            simpleType = KotlinTypeFactory.flexibleType(lowerBound, upperBound);
        } else {
            if (!(unwrap2 instanceof SimpleType)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            SimpleType simpleType2 = (SimpleType) unwrap2;
            boolean isEmpty = simpleType2.getConstructor().getParameters().isEmpty();
            simpleType = simpleType2;
            if (!isEmpty) {
                ClassifierDescriptor mo4153getDeclarationDescriptor = simpleType2.getConstructor().mo4153getDeclarationDescriptor();
                simpleType = simpleType2;
                if (mo4153getDeclarationDescriptor != null) {
                    List<TypeParameterDescriptor> parameters3 = simpleType2.getConstructor().getParameters();
                    parameters3.getClass();
                    List<TypeParameterDescriptor> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new StarProjectionImpl((TypeParameterDescriptor) it3.next()));
                    }
                    simpleType = TypeSubstitutionKt.replace$default(simpleType2, arrayList3, null, 2, null);
                }
            }
        }
        return TypeWithEnhancementKt.inheritEnhancement(simpleType, unwrap2);
    }

    public static final boolean requiresTypeAliasExpansion(KotlinType kotlinType) {
        kotlinType.getClass();
        return contains(kotlinType, TypeUtilsKt$$Lambda$0.INSTANCE$2);
    }

    public static final boolean shouldBeUpdated(KotlinType kotlinType) {
        return kotlinType == null || contains(kotlinType, TypeUtilsKt$$Lambda$0.INSTANCE$3);
    }

    public static final boolean hasTypeParameterRecursiveBounds(TypeParameterDescriptor typeParameterDescriptor) {
        typeParameterDescriptor.getClass();
        return hasTypeParameterRecursiveBounds$default(typeParameterDescriptor, null, null, 6, null);
    }

    public static final Set<TypeParameterDescriptor> extractTypeParametersFromUpperBounds(KotlinType kotlinType, Set<? extends TypeParameterDescriptor> set) {
        kotlinType.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        extractTypeParametersFromUpperBounds(kotlinType, kotlinType, linkedHashSet, set);
        return linkedHashSet;
    }
}
