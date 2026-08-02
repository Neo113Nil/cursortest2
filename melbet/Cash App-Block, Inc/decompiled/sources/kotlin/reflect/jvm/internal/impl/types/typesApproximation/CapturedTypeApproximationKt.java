package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes9.dex */
public final class CapturedTypeApproximationKt {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ApproximationBounds<KotlinType> approximateCapturedTypes(KotlinType kotlinType) {
        Object replaceTypeArguments;
        TypeArgument typeArgument;
        kotlinType.getClass();
        if (FlexibleTypesKt.isFlexible(kotlinType)) {
            ApproximationBounds<KotlinType> approximateCapturedTypes = approximateCapturedTypes(FlexibleTypesKt.lowerIfFlexible(kotlinType));
            ApproximationBounds<KotlinType> approximateCapturedTypes2 = approximateCapturedTypes(FlexibleTypesKt.upperIfFlexible(kotlinType));
            return new ApproximationBounds<>(TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximateCapturedTypes.getLower()), FlexibleTypesKt.upperIfFlexible(approximateCapturedTypes2.getLower())), kotlinType), TypeWithEnhancementKt.inheritEnhancement(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(approximateCapturedTypes.getUpper()), FlexibleTypesKt.upperIfFlexible(approximateCapturedTypes2.getUpper())), kotlinType));
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (CapturedTypeConstructorKt.isCaptured(kotlinType)) {
            constructor.getClass();
            TypeProjection projection = ((CapturedTypeConstructor) constructor).getProjection();
            KotlinType type2 = projection.getType();
            type2.getClass();
            KotlinType makeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(type2, kotlinType.isMarkedNullable());
            makeNullableIfNeeded.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[projection.getProjectionKind().ordinal()];
            if (i == 2) {
                return new ApproximationBounds<>(makeNullableIfNeeded, TypeUtilsKt.getBuiltIns(kotlinType).getNullableAnyType());
            }
            if (i != 3) {
                ZslControlImpl$$ExternalSyntheticLambda1.m(projection, "Only nontrivial projections should have been captured, not: ");
                return null;
            }
            SimpleType nothingType = TypeUtilsKt.getBuiltIns(kotlinType).getNothingType();
            nothingType.getClass();
            KotlinType makeNullableIfNeeded2 = TypeUtils.makeNullableIfNeeded((KotlinType) nothingType, kotlinType.isMarkedNullable());
            makeNullableIfNeeded2.getClass();
            return new ApproximationBounds<>(makeNullableIfNeeded2, makeNullableIfNeeded);
        }
        if (kotlinType.getArguments().isEmpty() || kotlinType.getArguments().size() != constructor.getParameters().size()) {
            return new ApproximationBounds<>(kotlinType, kotlinType);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<TypeProjection> arguments = kotlinType.getArguments();
        List<TypeParameterDescriptor> parameters = constructor.getParameters();
        parameters.getClass();
        Iterator it = CollectionsKt.zip(arguments, parameters).iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        TypeArgument typeArgument2 = (TypeArgument) it2.next();
                        typeArgument2.getClass();
                        if (!KotlinTypeChecker.DEFAULT.isSubtypeOf(typeArgument2.inProjection, typeArgument2.outProjection)) {
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    replaceTypeArguments = TypeUtilsKt.getBuiltIns(kotlinType).getNothingType();
                    replaceTypeArguments.getClass();
                } else {
                    replaceTypeArguments = replaceTypeArguments(kotlinType, arrayList);
                }
                return new ApproximationBounds<>(replaceTypeArguments, replaceTypeArguments(kotlinType, arrayList2));
            }
            Pair pair = (Pair) it.next();
            TypeProjection typeProjection = (TypeProjection) pair.first;
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.second;
            typeParameterDescriptor.getClass();
            int i2 = WhenMappings.$EnumSwitchMapping$0[TypeSubstitutor.combine(typeParameterDescriptor.getVariance(), typeProjection).ordinal()];
            if (i2 == 1) {
                KotlinType type3 = typeProjection.getType();
                type3.getClass();
                KotlinType type4 = typeProjection.getType();
                type4.getClass();
                typeArgument = new TypeArgument(typeParameterDescriptor, type3, type4);
            } else if (i2 == 2) {
                KotlinType type5 = typeProjection.getType();
                type5.getClass();
                SimpleType nullableAnyType = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNullableAnyType();
                nullableAnyType.getClass();
                typeArgument = new TypeArgument(typeParameterDescriptor, type5, nullableAnyType);
            } else {
                if (i2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SimpleType nothingType2 = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getNothingType();
                nothingType2.getClass();
                KotlinType type6 = typeProjection.getType();
                type6.getClass();
                typeArgument = new TypeArgument(typeParameterDescriptor, nothingType2, type6);
            }
            if (typeProjection.isStarProjection()) {
                arrayList.add(typeArgument);
                arrayList2.add(typeArgument);
            } else {
                ApproximationBounds<KotlinType> approximateCapturedTypes3 = approximateCapturedTypes(typeArgument.inProjection);
                KotlinType component1 = approximateCapturedTypes3.component1();
                KotlinType component2 = approximateCapturedTypes3.component2();
                ApproximationBounds<KotlinType> approximateCapturedTypes4 = approximateCapturedTypes(typeArgument.outProjection);
                KotlinType component12 = approximateCapturedTypes4.component1();
                KotlinType component22 = approximateCapturedTypes4.component2();
                TypeParameterDescriptor typeParameterDescriptor2 = typeArgument.typeParameter;
                ApproximationBounds approximationBounds = new ApproximationBounds(new TypeArgument(typeParameterDescriptor2, component2, component12), new TypeArgument(typeParameterDescriptor2, component1, component22));
                TypeArgument typeArgument3 = (TypeArgument) approximationBounds.component1();
                TypeArgument typeArgument4 = (TypeArgument) approximationBounds.component2();
                arrayList.add(typeArgument3);
                arrayList2.add(typeArgument4);
            }
        }
    }

    public static final TypeProjection approximateCapturedTypesIfNecessary(TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (!typeProjection.isStarProjection()) {
            KotlinType type2 = typeProjection.getType();
            type2.getClass();
            if (TypeUtils.contains(type2, CapturedTypeApproximationKt$$Lambda$1.INSTANCE)) {
                Variance projectionKind = typeProjection.getProjectionKind();
                projectionKind.getClass();
                if (projectionKind == Variance.OUT_VARIANCE) {
                    return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type2).getUpper());
                }
                if (z) {
                    return new TypeProjectionImpl(projectionKind, approximateCapturedTypes(type2).getLower());
                }
                TypeSubstitutor create = TypeSubstitutor.create(new CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1());
                create.getClass();
                return create.substituteWithoutApproximation(typeProjection);
            }
        }
        return typeProjection;
    }

    public static final KotlinType replaceTypeArguments(KotlinType kotlinType, ArrayList arrayList) {
        TypeProjectionImpl typeProjectionImpl;
        kotlinType.getArguments().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TypeArgument typeArgument = (TypeArgument) it.next();
            typeArgument.getClass();
            KotlinType kotlinType2 = typeArgument.outProjection;
            KotlinType kotlinType3 = typeArgument.inProjection;
            TypeParameterDescriptor typeParameterDescriptor = typeArgument.typeParameter;
            KotlinTypeChecker.DEFAULT.isSubtypeOf(kotlinType3, kotlinType2);
            if (!Intrinsics.areEqual(kotlinType3, kotlinType2)) {
                Variance variance = typeParameterDescriptor.getVariance();
                Variance variance2 = Variance.IN_VARIANCE;
                if (variance != variance2) {
                    if (KotlinBuiltIns.isNothing(kotlinType3) && typeParameterDescriptor.getVariance() != variance2) {
                        Variance variance3 = Variance.OUT_VARIANCE;
                        if (variance3 == typeParameterDescriptor.getVariance()) {
                            variance3 = Variance.INVARIANT;
                        }
                        typeProjectionImpl = new TypeProjectionImpl(variance3, kotlinType2);
                    } else if (KotlinBuiltIns.isNullableAny(kotlinType2)) {
                        if (variance2 == typeParameterDescriptor.getVariance()) {
                            variance2 = Variance.INVARIANT;
                        }
                        typeProjectionImpl = new TypeProjectionImpl(variance2, kotlinType3);
                    } else {
                        Variance variance4 = Variance.OUT_VARIANCE;
                        if (variance4 == typeParameterDescriptor.getVariance()) {
                            variance4 = Variance.INVARIANT;
                        }
                        typeProjectionImpl = new TypeProjectionImpl(variance4, kotlinType2);
                    }
                    arrayList2.add(typeProjectionImpl);
                }
            }
            typeProjectionImpl = new TypeProjectionImpl(kotlinType3);
            arrayList2.add(typeProjectionImpl);
        }
        return TypeSubstitutionKt.replace$default(kotlinType, arrayList2, null, null, 6, null);
    }
}
