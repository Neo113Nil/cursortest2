package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* loaded from: classes9.dex */
public final class ExpandedTypeUtilsKt {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TypeParameterMarker asTypeParameterOrArrayThereof(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker) {
        KotlinTypeMarker type2;
        TypeParameterMarker typeParameterClassifier = typeSystemCommonBackendContext.getTypeParameterClassifier(typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker));
        if (typeParameterClassifier != null) {
            return typeParameterClassifier;
        }
        if (typeSystemCommonBackendContext.isArrayOrNullableArray(kotlinTypeMarker) && (type2 = typeSystemCommonBackendContext.getType((TypeArgumentMarker) CollectionsKt.single((List) typeSystemCommonBackendContext.getArguments(kotlinTypeMarker)))) != null) {
            return asTypeParameterOrArrayThereof(typeSystemCommonBackendContext, type2);
        }
        return null;
    }

    public static final KotlinTypeMarker computeExpandedTypeForInlineClass(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker) {
        typeSystemCommonBackendContext.getClass();
        kotlinTypeMarker.getClass();
        return computeExpandedTypeInner(typeSystemCommonBackendContext, kotlinTypeMarker, new HashSet());
    }

    public static final KotlinTypeMarker computeExpandedTypeInner(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, HashSet hashSet) {
        KotlinTypeMarker safeSubstitute;
        KotlinTypeMarker computeExpandedTypeInner;
        TypeConstructorMarker typeConstructor = typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker);
        if (hashSet.add(typeConstructor)) {
            TypeParameterMarker typeParameterClassifier = typeSystemCommonBackendContext.getTypeParameterClassifier(typeConstructor);
            int i = 0;
            if (typeParameterClassifier == null) {
                if (typeSystemCommonBackendContext.isInlineClass(typeConstructor)) {
                    List<TypeParameterMarker> parameters = typeSystemCommonBackendContext.getParameters(typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker));
                    List<TypeArgumentMarker> arguments = typeSystemCommonBackendContext.getArguments(kotlinTypeMarker);
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
                    for (Object obj : arguments) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        KotlinTypeMarker type2 = typeSystemCommonBackendContext.getType((TypeArgumentMarker) obj);
                        if (type2 == null) {
                            type2 = typeSystemCommonBackendContext.getRepresentativeUpperBound(parameters.get(i));
                        }
                        arrayList.add(type2);
                        i = i2;
                    }
                    List<TypeParameterMarker> list = parameters;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(typeSystemCommonBackendContext.getTypeConstructor((TypeParameterMarker) it.next()));
                    }
                    TypeSubstitutorMarker typeSubstitutorForUnderlyingType = typeSystemCommonBackendContext.typeSubstitutorForUnderlyingType(MapsKt__MapsKt.toMap(CollectionsKt.zip(arrayList2, arrayList)));
                    KotlinTypeMarker unsubstitutedUnderlyingType = typeSystemCommonBackendContext.getUnsubstitutedUnderlyingType(kotlinTypeMarker);
                    if (unsubstitutedUnderlyingType == null) {
                        safeSubstitute = null;
                    } else {
                        TypeParameterMarker asTypeParameterOrArrayThereof = asTypeParameterOrArrayThereof(typeSystemCommonBackendContext, unsubstitutedUnderlyingType);
                        safeSubstitute = asTypeParameterOrArrayThereof == null ? typeSystemCommonBackendContext.safeSubstitute(typeSubstitutorForUnderlyingType, unsubstitutedUnderlyingType) : substituteUpperBound(typeSystemCommonBackendContext, unsubstitutedUnderlyingType, typeSystemCommonBackendContext.safeSubstitute(typeSubstitutorForUnderlyingType, typeSystemCommonBackendContext.getRepresentativeUpperBound(asTypeParameterOrArrayThereof)));
                    }
                    if (safeSubstitute != null && (computeExpandedTypeInner = computeExpandedTypeInner(typeSystemCommonBackendContext, safeSubstitute, hashSet)) != null) {
                        if (!typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker)) {
                            return computeExpandedTypeInner;
                        }
                        if (!typeSystemCommonBackendContext.isNullableType(computeExpandedTypeInner) && (!(computeExpandedTypeInner instanceof SimpleTypeMarker) || !typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) computeExpandedTypeInner))) {
                            return typeSystemCommonBackendContext.makeNullable(computeExpandedTypeInner);
                        }
                    }
                }
                return kotlinTypeMarker;
            }
            KotlinTypeMarker representativeUpperBound = typeSystemCommonBackendContext.getRepresentativeUpperBound(typeParameterClassifier);
            KotlinTypeMarker computeExpandedTypeInner2 = computeExpandedTypeInner(typeSystemCommonBackendContext, representativeUpperBound, hashSet);
            if (computeExpandedTypeInner2 != null) {
                if (typeSystemCommonBackendContext.isInlineClass(typeSystemCommonBackendContext.typeConstructor(representativeUpperBound)) || ((representativeUpperBound instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) representativeUpperBound))) {
                    i = 1;
                }
                return ((computeExpandedTypeInner2 instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) computeExpandedTypeInner2) && typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) && i != 0) ? typeSystemCommonBackendContext.makeNullable(representativeUpperBound) : (typeSystemCommonBackendContext.isNullableType(computeExpandedTypeInner2) || !typeSystemCommonBackendContext.isMarkedNullable(kotlinTypeMarker)) ? computeExpandedTypeInner2 : typeSystemCommonBackendContext.makeNullable(computeExpandedTypeInner2);
            }
        }
        return null;
    }

    public static final KotlinTypeMarker substituteUpperBound(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        KotlinTypeMarker substituteUpperBound;
        if (typeSystemCommonBackendContext.getTypeParameterClassifier(typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker)) != null) {
            return typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) ? typeSystemCommonBackendContext.makeNullable(kotlinTypeMarker2) : kotlinTypeMarker2;
        }
        TypeArgumentMarker typeArgumentMarker = (TypeArgumentMarker) CollectionsKt.single((List) typeSystemCommonBackendContext.getArguments(kotlinTypeMarker));
        if (WhenMappings.$EnumSwitchMapping$0[typeSystemCommonBackendContext.getVariance(typeArgumentMarker).ordinal()] == 1) {
            substituteUpperBound = typeSystemCommonBackendContext.nullableAnyType();
        } else {
            KotlinTypeMarker type2 = typeSystemCommonBackendContext.getType(typeArgumentMarker);
            type2.getClass();
            substituteUpperBound = substituteUpperBound(typeSystemCommonBackendContext, type2, kotlinTypeMarker2);
        }
        SimpleTypeMarker arrayType = typeSystemCommonBackendContext.arrayType(substituteUpperBound);
        return typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) ? typeSystemCommonBackendContext.makeNullable(arrayType) : arrayType;
    }
}
