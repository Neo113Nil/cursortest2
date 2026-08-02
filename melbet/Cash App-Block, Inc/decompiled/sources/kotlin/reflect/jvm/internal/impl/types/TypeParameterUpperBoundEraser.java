package kotlin.reflect.jvm.internal.impl.types;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlinx.coroutines.tasks.TasksKt$awaitImpl$2$2;

/* loaded from: classes9.dex */
public final class TypeParameterUpperBoundEraser {
    public static final Companion Companion = new Companion(null);
    public final Lazy erroneousErasedBound$delegate;
    public final MemoizedFunctionToNotNull getErasedUpperBound;
    public final TypeParameterErasureOptions options;
    public final ErasureProjectionComputer projectionComputer;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final KotlinType replaceArgumentsOfUpperBound(KotlinType kotlinType, TypeSubstitutor typeSubstitutor, Set<? extends TypeParameterDescriptor> set, boolean z) {
            UnwrappedType unwrappedType;
            KotlinType type2;
            KotlinType type3;
            KotlinType type4;
            kotlinType.getClass();
            typeSubstitutor.getClass();
            UnwrappedType unwrap2 = kotlinType.unwrap();
            if (unwrap2 instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrap2;
                SimpleType lowerBound = flexibleType.getLowerBound();
                if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().mo4153getDeclarationDescriptor() != null) {
                    List<TypeParameterDescriptor> parameters = lowerBound.getConstructor().getParameters();
                    parameters.getClass();
                    List<TypeParameterDescriptor> list = parameters;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor : list) {
                        TypeProjection typeProjection = (TypeProjection) CollectionsKt.getOrNull(typeParameterDescriptor.getIndex(), kotlinType.getArguments());
                        if (!z || typeProjection == null || (type4 = typeProjection.getType()) == null || TypeUtilsKt.containsTypeParameter(type4)) {
                            boolean z2 = set != null && set.contains(typeParameterDescriptor);
                            if (typeProjection != null && !z2) {
                                TypeSubstitution substitution = typeSubstitutor.getSubstitution();
                                KotlinType type5 = typeProjection.getType();
                                type5.getClass();
                                if (substitution.mo4156get(type5) != null) {
                                }
                            }
                            typeProjection = new StarProjectionImpl(typeParameterDescriptor);
                        }
                        arrayList.add(typeProjection);
                    }
                    lowerBound = TypeSubstitutionKt.replace$default(lowerBound, arrayList, null, 2, null);
                }
                SimpleType upperBound = flexibleType.getUpperBound();
                if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().mo4153getDeclarationDescriptor() != null) {
                    List<TypeParameterDescriptor> parameters2 = upperBound.getConstructor().getParameters();
                    parameters2.getClass();
                    List<TypeParameterDescriptor> list2 = parameters2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor2 : list2) {
                        TypeProjection typeProjection2 = (TypeProjection) CollectionsKt.getOrNull(typeParameterDescriptor2.getIndex(), kotlinType.getArguments());
                        if (!z || typeProjection2 == null || (type3 = typeProjection2.getType()) == null || TypeUtilsKt.containsTypeParameter(type3)) {
                            boolean z3 = set != null && set.contains(typeParameterDescriptor2);
                            if (typeProjection2 != null && !z3) {
                                TypeSubstitution substitution2 = typeSubstitutor.getSubstitution();
                                KotlinType type6 = typeProjection2.getType();
                                type6.getClass();
                                if (substitution2.mo4156get(type6) != null) {
                                }
                            }
                            typeProjection2 = new StarProjectionImpl(typeParameterDescriptor2);
                        }
                        arrayList2.add(typeProjection2);
                    }
                    upperBound = TypeSubstitutionKt.replace$default(upperBound, arrayList2, null, 2, null);
                }
                unwrappedType = KotlinTypeFactory.flexibleType(lowerBound, upperBound);
            } else {
                if (!(unwrap2 instanceof SimpleType)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SimpleType simpleType = (SimpleType) unwrap2;
                if (simpleType.getConstructor().getParameters().isEmpty() || simpleType.getConstructor().mo4153getDeclarationDescriptor() == null) {
                    unwrappedType = simpleType;
                } else {
                    List<TypeParameterDescriptor> parameters3 = simpleType.getConstructor().getParameters();
                    parameters3.getClass();
                    List<TypeParameterDescriptor> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor3 : list3) {
                        TypeProjection typeProjection3 = (TypeProjection) CollectionsKt.getOrNull(typeParameterDescriptor3.getIndex(), kotlinType.getArguments());
                        if (!z || typeProjection3 == null || (type2 = typeProjection3.getType()) == null || TypeUtilsKt.containsTypeParameter(type2)) {
                            boolean z4 = set != null && set.contains(typeParameterDescriptor3);
                            if (typeProjection3 != null && !z4) {
                                TypeSubstitution substitution3 = typeSubstitutor.getSubstitution();
                                KotlinType type7 = typeProjection3.getType();
                                type7.getClass();
                                if (substitution3.mo4156get(type7) != null) {
                                }
                            }
                            typeProjection3 = new StarProjectionImpl(typeParameterDescriptor3);
                        }
                        arrayList3.add(typeProjection3);
                    }
                    unwrappedType = TypeSubstitutionKt.replace$default(simpleType, arrayList3, null, 2, null);
                }
            }
            KotlinType safeSubstitute = typeSubstitutor.safeSubstitute(TypeWithEnhancementKt.inheritEnhancement(unwrappedType, unwrap2), Variance.OUT_VARIANCE);
            safeSubstitute.getClass();
            return safeSubstitute;
        }
    }

    public final class DataToEraseUpperBound {
        public final ErasureTypeAttributes typeAttr;
        public final TypeParameterDescriptor typeParameter;

        public DataToEraseUpperBound(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
            typeParameterDescriptor.getClass();
            erasureTypeAttributes.getClass();
            this.typeParameter = typeParameterDescriptor;
            this.typeAttr = erasureTypeAttributes;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DataToEraseUpperBound)) {
                return false;
            }
            DataToEraseUpperBound dataToEraseUpperBound = (DataToEraseUpperBound) obj;
            return Intrinsics.areEqual(dataToEraseUpperBound.typeParameter, this.typeParameter) && Intrinsics.areEqual(dataToEraseUpperBound.typeAttr, this.typeAttr);
        }

        public final int hashCode() {
            int hashCode = this.typeParameter.hashCode();
            return this.typeAttr.hashCode() + (hashCode * 31) + hashCode;
        }

        public final String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.typeParameter + ", typeAttr=" + this.typeAttr + ')';
        }
    }

    public TypeParameterUpperBoundEraser(ErasureProjectionComputer erasureProjectionComputer, TypeParameterErasureOptions typeParameterErasureOptions) {
        erasureProjectionComputer.getClass();
        typeParameterErasureOptions.getClass();
        this.projectionComputer = erasureProjectionComputer;
        this.options = typeParameterErasureOptions;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.erroneousErasedBound$delegate = LazyKt.lazy(new KotlinKPropertyN$$Lambda$0(this, 29));
        MemoizedFunctionToNotNull createMemoizedFunction = lockBasedStorageManager.createMemoizedFunction(new TasksKt$awaitImpl$2$2(this, 23));
        createMemoizedFunction.getClass();
        this.getErasedUpperBound = createMemoizedFunction;
    }

    public final KotlinType getDefaultType(ErasureTypeAttributes erasureTypeAttributes) {
        KotlinType replaceArgumentsWithStarProjections;
        SimpleType defaultType = erasureTypeAttributes.getDefaultType();
        return (defaultType == null || (replaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) == null) ? (ErrorType) this.erroneousErasedBound$delegate.getValue() : replaceArgumentsWithStarProjections;
    }

    public final KotlinType getErasedUpperBound(TypeParameterDescriptor typeParameterDescriptor, ErasureTypeAttributes erasureTypeAttributes) {
        typeParameterDescriptor.getClass();
        erasureTypeAttributes.getClass();
        Object invoke = this.getErasedUpperBound.invoke(new DataToEraseUpperBound(typeParameterDescriptor, erasureTypeAttributes));
        invoke.getClass();
        return (KotlinType) invoke;
    }

    public final SetBuilder substituteErasedUpperBounds(TypeSubstitutor typeSubstitutor, List list, ErasureTypeAttributes erasureTypeAttributes) {
        SetBuilder setBuilder = new SetBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KotlinType kotlinType = (KotlinType) it.next();
            ClassifierDescriptor mo4153getDeclarationDescriptor = kotlinType.getConstructor().mo4153getDeclarationDescriptor();
            boolean z = mo4153getDeclarationDescriptor instanceof ClassDescriptor;
            TypeParameterErasureOptions typeParameterErasureOptions = this.options;
            if (z) {
                setBuilder.add(Companion.replaceArgumentsOfUpperBound(kotlinType, typeSubstitutor, erasureTypeAttributes.getVisitedTypeParameters(), typeParameterErasureOptions.getLeaveNonTypeParameterTypes()));
            } else if (mo4153getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
                if (visitedTypeParameters == null || !visitedTypeParameters.contains(mo4153getDeclarationDescriptor)) {
                    List<KotlinType> upperBounds = ((TypeParameterDescriptor) mo4153getDeclarationDescriptor).getUpperBounds();
                    upperBounds.getClass();
                    setBuilder.addAll(substituteErasedUpperBounds(typeSubstitutor, upperBounds, erasureTypeAttributes));
                } else {
                    setBuilder.add(getDefaultType(erasureTypeAttributes));
                }
            }
            if (!typeParameterErasureOptions.getIntersectUpperBounds()) {
                break;
            }
        }
        return SetsKt__SetsJVMKt.build(setBuilder);
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(ErasureProjectionComputer erasureProjectionComputer, TypeParameterErasureOptions typeParameterErasureOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(erasureProjectionComputer, (i & 2) != 0 ? new TypeParameterErasureOptions(false, false) : typeParameterErasureOptions);
    }
}
