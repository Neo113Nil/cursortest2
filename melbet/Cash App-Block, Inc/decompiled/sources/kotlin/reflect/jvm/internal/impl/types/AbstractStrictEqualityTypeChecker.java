package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* loaded from: classes9.dex */
public final class AbstractStrictEqualityTypeChecker {
    public static final AbstractStrictEqualityTypeChecker INSTANCE = new AbstractStrictEqualityTypeChecker();

    public static boolean strictEqualRigidTypes(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        if (typeSystemContext.argumentsCount(rigidTypeMarker) == typeSystemContext.argumentsCount(rigidTypeMarker2) && typeSystemContext.isMarkedNullable(rigidTypeMarker) == typeSystemContext.isMarkedNullable(rigidTypeMarker2) && typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker) == typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker2) && typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarker), typeSystemContext.typeConstructor(rigidTypeMarker2))) {
            if (typeSystemContext.identicalArguments(rigidTypeMarker, rigidTypeMarker2)) {
                return true;
            }
            int argumentsCount = typeSystemContext.argumentsCount(rigidTypeMarker);
            for (int i = 0; i < argumentsCount; i++) {
                TypeArgumentMarker argument = typeSystemContext.getArgument(rigidTypeMarker, i);
                TypeArgumentMarker argument2 = typeSystemContext.getArgument(rigidTypeMarker2, i);
                if (typeSystemContext.isStarProjection(argument) == typeSystemContext.isStarProjection(argument2)) {
                    if (!typeSystemContext.isStarProjection(argument)) {
                        if (typeSystemContext.getVariance(argument) == typeSystemContext.getVariance(argument2)) {
                            KotlinTypeMarker type2 = typeSystemContext.getType(argument);
                            type2.getClass();
                            KotlinTypeMarker type3 = typeSystemContext.getType(argument2);
                            type3.getClass();
                            if (!strictEqualTypesInternal(typeSystemContext, type2, type3)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean strictEqualTypesInternal(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        RigidTypeMarker asRigidType = typeSystemContext.asRigidType(kotlinTypeMarker);
        RigidTypeMarker asRigidType2 = typeSystemContext.asRigidType(kotlinTypeMarker2);
        if (asRigidType != null && asRigidType2 != null) {
            return strictEqualRigidTypes(typeSystemContext, asRigidType, asRigidType2);
        }
        FlexibleTypeMarker asFlexibleType = typeSystemContext.asFlexibleType(kotlinTypeMarker);
        FlexibleTypeMarker asFlexibleType2 = typeSystemContext.asFlexibleType(kotlinTypeMarker2);
        return asFlexibleType != null && asFlexibleType2 != null && strictEqualRigidTypes(typeSystemContext, typeSystemContext.lowerBound(asFlexibleType), typeSystemContext.lowerBound(asFlexibleType2)) && strictEqualRigidTypes(typeSystemContext, typeSystemContext.upperBound(asFlexibleType), typeSystemContext.upperBound(asFlexibleType2));
    }

    public final boolean strictEqualTypes(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        typeSystemContext.getClass();
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return strictEqualTypesInternal(typeSystemContext, kotlinTypeMarker, kotlinTypeMarker2);
    }
}
