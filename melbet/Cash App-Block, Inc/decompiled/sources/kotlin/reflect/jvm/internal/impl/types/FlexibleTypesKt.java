package kotlin.reflect.jvm.internal.impl.types;

import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class FlexibleTypesKt {
    public static final FlexibleType asFlexibleType(KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrap2 = kotlinType.unwrap();
        unwrap2.getClass();
        return (FlexibleType) unwrap2;
    }

    public static final boolean isFlexible(KotlinType kotlinType) {
        kotlinType.getClass();
        return kotlinType.unwrap() instanceof FlexibleType;
    }

    public static final SimpleType lowerIfFlexible(KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrap2 = kotlinType.unwrap();
        if (unwrap2 instanceof FlexibleType) {
            return ((FlexibleType) unwrap2).getLowerBound();
        }
        if (unwrap2 instanceof SimpleType) {
            return (SimpleType) unwrap2;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final SimpleType upperIfFlexible(KotlinType kotlinType) {
        kotlinType.getClass();
        UnwrappedType unwrap2 = kotlinType.unwrap();
        if (unwrap2 instanceof FlexibleType) {
            return ((FlexibleType) unwrap2).getUpperBound();
        }
        if (unwrap2 instanceof SimpleType) {
            return (SimpleType) unwrap2;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
