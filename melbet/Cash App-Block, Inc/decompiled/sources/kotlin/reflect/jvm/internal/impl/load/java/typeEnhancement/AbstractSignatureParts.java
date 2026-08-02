package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* loaded from: classes9.dex */
public abstract class AbstractSignatureParts<TAnnotation> {

    public final class TypeAndDefaultQualifiers {
        public final JavaTypeQualifiersByElementType defaultQualifiers;

        /* renamed from: type, reason: collision with root package name */
        public final KotlinTypeMarker f1531type;
        public final TypeParameterMarker typeParameterForArgument;

        public TypeAndDefaultQualifiers(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, TypeParameterMarker typeParameterMarker) {
            this.f1531type = kotlinTypeMarker;
            this.defaultQualifiers = javaTypeQualifiersByElementType;
            this.typeParameterForArgument = typeParameterMarker;
        }
    }

    public static void flattenTree(Object obj, ArrayList arrayList, OverridingUtil.AnonymousClass7 anonymousClass7) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) anonymousClass7.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                flattenTree(it.next(), arrayList, anonymousClass7);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers] */
    public final Function1<Integer, JavaTypeQualifiers> computeIndexedQualifiers(KotlinTypeMarker kotlinTypeMarker, Iterable<? extends KotlinTypeMarker> iterable, TypeEnhancementInfo typeEnhancementInfo, boolean z) {
        boolean z2;
        JavaTypeQualifiers computeQualifiersForOverride;
        KotlinTypeMarker kotlinTypeMarker2;
        NullabilityQualifier nullabilityQualifier;
        JavaDefaultQualifiers javaDefaultQualifiers;
        kotlinTypeMarker.getClass();
        iterable.getClass();
        ArrayList indexed = toIndexed(kotlinTypeMarker);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator<? extends KotlinTypeMarker> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(toIndexed(it.next()));
        }
        int i = 0;
        boolean z3 = true;
        if (isCovariant() && (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty())) {
            Iterator<? extends KotlinTypeMarker> it2 = iterable.iterator();
            while (it2.hasNext()) {
                if (!isEqual(kotlinTypeMarker, it2.next())) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        int size = getForceOnlyHeadTypeConstructor() ? 1 : indexed.size();
        JavaTypeQualifiers[] javaTypeQualifiersArr = new JavaTypeQualifiers[size];
        int i2 = 0;
        while (i2 < size) {
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new AbstractSignatureParts$$Lambda$2(this, indexed, i2, i));
            if (i2 <= 0 || !z2) {
                JavaTypeQualifiers extractQualifiersFromAnnotations = extractQualifiersFromAnnotations((TypeAndDefaultQualifiers) indexed.get(i2), (JavaDefaultQualifiers) lazy.getValue());
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    TypeAndDefaultQualifiers typeAndDefaultQualifiers = (TypeAndDefaultQualifiers) CollectionsKt.getOrNull(i2, (List) it3.next());
                    MutabilityQualifier mutabilityQualifier = null;
                    if (typeAndDefaultQualifiers != null && (kotlinTypeMarker2 = typeAndDefaultQualifiers.f1531type) != null) {
                        NullabilityQualifier nullabilityQualifier2 = getNullabilityQualifier(kotlinTypeMarker2);
                        if (nullabilityQualifier2 == null) {
                            KotlinTypeMarker enhancedForWarnings = getEnhancedForWarnings(kotlinTypeMarker2);
                            nullabilityQualifier = enhancedForWarnings != null ? getNullabilityQualifier(enhancedForWarnings) : null;
                        } else {
                            nullabilityQualifier = nullabilityQualifier2;
                        }
                        MutabilityQualifier mutabilityQualifier2 = getMutabilityQualifier(kotlinTypeMarker2);
                        MutabilityQualifier mutabilityQualifier3 = getMutabilityQualifier(kotlinTypeMarker2);
                        if (mutabilityQualifier3 == null) {
                            KotlinTypeMarker enhancedForWarnings2 = getEnhancedForWarnings(kotlinTypeMarker2);
                            if (enhancedForWarnings2 != null) {
                                mutabilityQualifier = getMutabilityQualifier(enhancedForWarnings2);
                            }
                        } else {
                            mutabilityQualifier = mutabilityQualifier3;
                        }
                        mutabilityQualifier = new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier2, getTypeSystem().isDefinitelyNotNullType(kotlinTypeMarker2) || isNotNullTypeParameterCompat(kotlinTypeMarker2), nullabilityQualifier != nullabilityQualifier2, mutabilityQualifier != mutabilityQualifier2);
                    }
                    if (mutabilityQualifier != null) {
                        arrayList2.add(mutabilityQualifier);
                    }
                }
                computeQualifiersForOverride = TypeEnhancementUtilsKt.computeQualifiersForOverride(extractQualifiersFromAnnotations, arrayList2, i2 == 0 && isCovariant(), i2 == 0 && getContainerIsVarargParameter(), z);
            } else {
                computeQualifiersForOverride = (isK2() && (javaDefaultQualifiers = (JavaDefaultQualifiers) lazy.getValue()) != null && javaDefaultQualifiers.getPreferQualifierOverSupertype() == z3) ? extractQualifiersFromAnnotations((TypeAndDefaultQualifiers) indexed.get(i2), (JavaDefaultQualifiers) lazy.getValue()) : JavaTypeQualifiers.Companion.getNONE();
            }
            javaTypeQualifiersArr[i2] = computeQualifiersForOverride;
            i2++;
            i = 0;
            z3 = true;
        }
        return new OverridingUtil.AnonymousClass7(21, typeEnhancementInfo, javaTypeQualifiersArr);
    }

    public final JavaTypeQualifiers extractQualifiersFromAnnotations(TypeAndDefaultQualifiers typeAndDefaultQualifiers, JavaDefaultQualifiers javaDefaultQualifiers) {
        Iterable<? extends TAnnotation> iterable;
        WithMigrationStatus withMigrationStatus;
        TypeConstructorMarker typeConstructor;
        KotlinTypeMarker kotlinTypeMarker = typeAndDefaultQualifiers.f1531type;
        TypeParameterMarker typeParameterMarker = typeAndDefaultQualifiers.typeParameterForArgument;
        if (kotlinTypeMarker == null) {
            if ((typeParameterMarker != null ? getTypeSystem().getVariance(typeParameterMarker) : null) == TypeVariance.IN) {
                return JavaTypeQualifiers.Companion.getNONE();
            }
        }
        boolean z = typeParameterMarker == null;
        if (kotlinTypeMarker == null || (iterable = getAnnotations(kotlinTypeMarker)) == null) {
            iterable = EmptyList.INSTANCE;
        }
        TypeSystemContext typeSystem = getTypeSystem();
        TypeParameterMarker typeParameterClassifier = (kotlinTypeMarker == null || (typeConstructor = typeSystem.typeConstructor(kotlinTypeMarker)) == null) ? null : typeSystem.getTypeParameterClassifier(typeConstructor);
        boolean z2 = getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS;
        if (z) {
            if (z2 || !getEnableImprovementsInStrictMode() || kotlinTypeMarker == null || !isArrayOrPrimitiveArray(kotlinTypeMarker)) {
                iterable = CollectionsKt.plus((Iterable) getContainerAnnotations(), (Iterable) iterable);
            } else {
                Iterable<TAnnotation> containerAnnotations = getContainerAnnotations();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : containerAnnotations) {
                    if (!getAnnotationTypeQualifierResolver().isTypeUseAnnotation(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                iterable = CollectionsKt.plus((Iterable) iterable, (Collection) arrayList);
            }
        }
        WithMigrationStatus<MutabilityQualifier> extractMutability = getAnnotationTypeQualifierResolver().extractMutability(iterable);
        WithMigrationStatus<NullabilityQualifier> extractNullability = getAnnotationTypeQualifierResolver().extractNullability(iterable, new OverridingUtil.AnonymousClass7(20, this, typeAndDefaultQualifiers));
        if (extractNullability != null) {
            return new JavaTypeQualifiers(extractNullability.getQualifier(), extractMutability != null ? extractMutability.getQualifier() : null, extractNullability.getQualifier() == NullabilityQualifier.NOT_NULL && typeParameterClassifier != null, extractNullability.isForWarningOnly(), extractMutability != null && extractMutability.isForWarningOnly());
        }
        WithMigrationStatus boundsNullability = typeParameterClassifier != null ? getBoundsNullability(typeParameterClassifier) : null;
        WithMigrationStatus defaultNullability = getDefaultNullability(boundsNullability, javaDefaultQualifiers);
        boolean z3 = (boundsNullability != null ? (NullabilityQualifier) boundsNullability.getQualifier() : null) == NullabilityQualifier.NOT_NULL || !(typeParameterClassifier == null || javaDefaultQualifiers == null || !javaDefaultQualifiers.getDefinitelyNotNull());
        if (typeParameterMarker == null || (withMigrationStatus = getBoundsNullability(typeParameterMarker)) == null) {
            withMigrationStatus = null;
        } else if (withMigrationStatus.getQualifier() == NullabilityQualifier.NULLABLE) {
            withMigrationStatus = WithMigrationStatus.copy$default(withMigrationStatus, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
        }
        if (withMigrationStatus != null && (defaultNullability == null || ((!withMigrationStatus.isForWarningOnly() || defaultNullability.isForWarningOnly()) && ((!withMigrationStatus.isForWarningOnly() && defaultNullability.isForWarningOnly()) || (((NullabilityQualifier) withMigrationStatus.getQualifier()).compareTo((NullabilityQualifier) defaultNullability.getQualifier()) >= 0 && ((NullabilityQualifier) withMigrationStatus.getQualifier()).compareTo((NullabilityQualifier) defaultNullability.getQualifier()) > 0))))) {
            defaultNullability = withMigrationStatus;
        }
        return new JavaTypeQualifiers(defaultNullability != null ? (NullabilityQualifier) defaultNullability.getQualifier() : null, extractMutability != null ? extractMutability.getQualifier() : null, z3, defaultNullability != null && defaultNullability.isForWarningOnly(), extractMutability != null && extractMutability.isForWarningOnly());
    }

    public abstract boolean forceWarning(TAnnotation tannotation, KotlinTypeMarker kotlinTypeMarker);

    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> getAnnotationTypeQualifierResolver();

    public abstract Iterable<TAnnotation> getAnnotations(KotlinTypeMarker kotlinTypeMarker);

    public final WithMigrationStatus getBoundsNullability(TypeParameterMarker typeParameterMarker) {
        List<KotlinTypeMarker> list;
        NullabilityQualifier nullabilityQualifier;
        TypeSystemContext typeSystem = getTypeSystem();
        if (!isFromJava(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> upperBounds = typeSystem.getUpperBounds(typeParameterMarker);
        List<KotlinTypeMarker> list2 = upperBounds;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (!typeSystem.isError((KotlinTypeMarker) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (getNullabilityQualifier((KotlinTypeMarker) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new KClassImpl$Data$$Lambda$22(25, upperBounds, this));
                if (!arrayList.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (getShouldPropagateBoundNullness((KotlinTypeMarker) it2.next())) {
                                list = upperBounds;
                            }
                        }
                    }
                    return new WithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, false);
                }
                if (((List) lazy.getValue()).isEmpty()) {
                    return null;
                }
                List list3 = (List) lazy.getValue();
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        if (getShouldPropagateBoundNullness((KotlinTypeMarker) it3.next())) {
                            list = (List) lazy.getValue();
                        }
                    }
                }
                return new WithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, true);
                List<KotlinTypeMarker> list4 = list;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator<T> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        if (!typeSystem.isNullableType((KotlinTypeMarker) it4.next())) {
                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                            break;
                        }
                    }
                }
                nullabilityQualifier = NullabilityQualifier.NULLABLE;
                return new WithMigrationStatus(nullabilityQualifier, list != upperBounds);
            }
        }
        return null;
    }

    public abstract Iterable<TAnnotation> getContainerAnnotations();

    public abstract AnnotationQualifierApplicabilityType getContainerApplicabilityType();

    public abstract JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    public abstract WithMigrationStatus getDefaultNullability(WithMigrationStatus withMigrationStatus, JavaDefaultQualifiers javaDefaultQualifiers);

    public abstract boolean getEnableImprovementsInStrictMode();

    public abstract KotlinTypeMarker getEnhancedForWarnings(KotlinTypeMarker kotlinTypeMarker);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    public abstract FqNameUnsafe getFqNameUnsafe(KotlinTypeMarker kotlinTypeMarker);

    public final MutabilityQualifier getMutabilityQualifier(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        if (javaToKotlinClassMap.isReadOnly(getFqNameUnsafe(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker)))) {
            return MutabilityQualifier.READ_ONLY;
        }
        if (javaToKotlinClassMap.isMutable(getFqNameUnsafe(typeSystem.upperBoundIfFlexible(kotlinTypeMarker)))) {
            return MutabilityQualifier.MUTABLE;
        }
        return null;
    }

    public final NullabilityQualifier getNullabilityQualifier(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(kotlinTypeMarker))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    public boolean getShouldPropagateBoundNullness(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return true;
    }

    public abstract boolean getSkipRawTypeArguments();

    public abstract TypeSystemContext getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean isFromJava(TypeParameterMarker typeParameterMarker);

    public abstract boolean isK2();

    public boolean isNotNullTypeParameterCompat(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return false;
    }

    public final ArrayList toIndexed(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        TypeAndDefaultQualifiers typeAndDefaultQualifiers = new TypeAndDefaultQualifiers(kotlinTypeMarker, AbstractAnnotationTypeQualifierResolver.extractAndMergeDefaultQualifiers$default(getAnnotationTypeQualifierResolver(), getContainerDefaultTypeQualifiers(), getAnnotations(kotlinTypeMarker), false, 4, null), null);
        OverridingUtil.AnonymousClass7 anonymousClass7 = new OverridingUtil.AnonymousClass7(22, this, typeSystem);
        ArrayList arrayList = new ArrayList(1);
        flattenTree(typeAndDefaultQualifiers, arrayList, anonymousClass7);
        return arrayList;
    }
}
