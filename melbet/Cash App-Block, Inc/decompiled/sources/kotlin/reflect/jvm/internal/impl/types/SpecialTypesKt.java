package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;

/* loaded from: classes9.dex */
public final class SpecialTypesKt {
    public static final AbbreviatedType getAbbreviatedType(KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrap2 = kotlinType.unwrap();
        if (unwrap2 instanceof AbbreviatedType) {
            return (AbbreviatedType) unwrap2;
        }
        return null;
    }

    public static final SimpleType getAbbreviation(KotlinType kotlinType) {
        kotlinType.getClass();
        AbbreviatedType abbreviatedType = getAbbreviatedType(kotlinType);
        if (abbreviatedType != null) {
            return abbreviatedType.getAbbreviation();
        }
        return null;
    }

    public static final boolean isDefinitelyNotNullType(KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.unwrap() instanceof DefinitelyNotNullType;
    }

    public static final UnwrappedType makeDefinitelyNotNullOrNotNull(UnwrappedType unwrappedType, boolean z) {
        unwrappedType.getClass();
        DefinitelyNotNullType makeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, unwrappedType, z, false, 4, null);
        if (makeDefinitelyNotNull$default != null) {
            return makeDefinitelyNotNull$default;
        }
        SimpleType makeIntersectionTypeDefinitelyNotNullOrNotNull = makeIntersectionTypeDefinitelyNotNullOrNotNull(unwrappedType);
        return makeIntersectionTypeDefinitelyNotNullOrNotNull != null ? makeIntersectionTypeDefinitelyNotNullOrNotNull : unwrappedType.makeNullableAsSpecified(false);
    }

    public static /* synthetic */ UnwrappedType makeDefinitelyNotNullOrNotNull$default(UnwrappedType unwrappedType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return makeDefinitelyNotNullOrNotNull(unwrappedType, z);
    }

    public static final SimpleType makeIntersectionTypeDefinitelyNotNullOrNotNull(UnwrappedType unwrappedType) {
        IntersectionTypeConstructor alternative;
        TypeConstructor constructor = unwrappedType.getConstructor();
        IntersectionTypeConstructor intersectionTypeConstructor = constructor instanceof IntersectionTypeConstructor ? (IntersectionTypeConstructor) constructor : null;
        if (intersectionTypeConstructor != null) {
            Collection<KotlinType> supertypes = intersectionTypeConstructor.getSupertypes();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(supertypes, 10));
            boolean z = false;
            for (KotlinType kotlinType : supertypes) {
                if (TypeUtils.isNullableType(kotlinType)) {
                    kotlinType = makeDefinitelyNotNullOrNotNull$default(kotlinType.unwrap(), false, 1, null);
                    z = true;
                }
                arrayList.add(kotlinType);
            }
            if (z) {
                KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
                if (alternativeType == null) {
                    alternativeType = null;
                } else if (TypeUtils.isNullableType(alternativeType)) {
                    alternativeType = makeDefinitelyNotNullOrNotNull$default(alternativeType.unwrap(), false, 1, null);
                }
                alternative = new IntersectionTypeConstructor(arrayList).setAlternative(alternativeType);
            } else {
                alternative = null;
            }
            if (alternative != null) {
                return alternative.createType();
            }
        }
        return null;
    }

    public static final SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull(SimpleType simpleType, boolean z) {
        simpleType.getClass();
        DefinitelyNotNullType makeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleType, z, false, 4, null);
        if (makeDefinitelyNotNull$default != null) {
            return makeDefinitelyNotNull$default;
        }
        SimpleType makeIntersectionTypeDefinitelyNotNullOrNotNull = makeIntersectionTypeDefinitelyNotNullOrNotNull(simpleType);
        return makeIntersectionTypeDefinitelyNotNullOrNotNull == null ? simpleType.makeNullableAsSpecified(false) : makeIntersectionTypeDefinitelyNotNullOrNotNull;
    }

    public static /* synthetic */ SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull$default(SimpleType simpleType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, z);
    }

    public static final SimpleType withAbbreviation(SimpleType simpleType, SimpleType simpleType2) {
        simpleType.getClass();
        simpleType2.getClass();
        return KotlinTypeKt.isError(simpleType) ? simpleType : new AbbreviatedType(simpleType, simpleType2);
    }

    public static final NewCapturedType withNotNullProjection(NewCapturedType newCapturedType) {
        newCapturedType.getClass();
        return new NewCapturedType(newCapturedType.getCaptureStatus(), newCapturedType.getConstructor(), newCapturedType.getLowerType(), newCapturedType.getAttributes(), newCapturedType.isMarkedNullable(), true);
    }
}
