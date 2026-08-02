package kotlin.reflect.jvm.internal.impl.types;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class AbstractTypeChecker {
    public static final AbstractTypeChecker INSTANCE = new AbstractTypeChecker();
    public static boolean RUN_SLOW_ASSERTIONS;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeVariance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeVariance.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean checkSubtypeForIntegerLiteralType$isIntegerLiteralTypeOrCapturedOne(TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        KotlinTypeMarker type2;
        RigidTypeMarker upperBoundIfFlexible;
        return TypeSystemContextContextualKt.isIntegerLiteralType(typeSystemContext, rigidTypeMarker) || ((rigidTypeMarker instanceof CapturedTypeMarker) && (type2 = TypeSystemContextContextualKt.getType(typeSystemContext, TypeSystemContextContextualKt.projection(typeSystemContext, TypeSystemContextContextualKt.typeConstructor(typeSystemContext, (CapturedTypeMarker) rigidTypeMarker)))) != null && (upperBoundIfFlexible = TypeSystemContextContextualKt.upperBoundIfFlexible(typeSystemContext, type2)) != null && TypeSystemContextContextualKt.isIntegerLiteralType(typeSystemContext, upperBoundIfFlexible));
    }

    public static final boolean checkSubtypeForIntegerLiteralType$isTypeInIntegerLiteralType(TypeSystemContext typeSystemContext, TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2, boolean z) {
        TypeCheckerState typeCheckerState2;
        RigidTypeMarker rigidTypeMarker3;
        Collection<KotlinTypeMarker> possibleIntegerTypes = TypeSystemContextContextualKt.possibleIntegerTypes(typeSystemContext, rigidTypeMarker);
        if ((possibleIntegerTypes instanceof Collection) && possibleIntegerTypes.isEmpty()) {
            return false;
        }
        for (KotlinTypeMarker kotlinTypeMarker : possibleIntegerTypes) {
            if (Intrinsics.areEqual(TypeSystemContextContextualKt.typeConstructor(typeSystemContext, kotlinTypeMarker), TypeSystemContextContextualKt.typeConstructor(typeSystemContext, rigidTypeMarker2))) {
                return true;
            }
            if (z) {
                typeCheckerState2 = typeCheckerState;
                rigidTypeMarker3 = rigidTypeMarker2;
                if (isSubtypeOf$default(INSTANCE, typeCheckerState2, rigidTypeMarker3, kotlinTypeMarker, false, 8, null)) {
                    return true;
                }
            } else {
                typeCheckerState2 = typeCheckerState;
                rigidTypeMarker3 = rigidTypeMarker2;
            }
            typeCheckerState = typeCheckerState2;
            rigidTypeMarker2 = rigidTypeMarker3;
        }
        return false;
    }

    public static List collectAllSupertypesWithGivenTypeConstructor(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy;
        List<SimpleTypeMarker> fastCorrespondingSupertypes = TypeSystemContextContextualKt.fastCorrespondingSupertypes(typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        if (fastCorrespondingSupertypes != null) {
            return fastCorrespondingSupertypes;
        }
        if (!TypeSystemContextContextualKt.isClassTypeConstructor(typeSystemContext, typeConstructorMarker) && TypeSystemContextContextualKt.isClassType(typeSystemContext, rigidTypeMarker)) {
            return EmptyList.INSTANCE;
        }
        if (TypeSystemContextContextualKt.isCommonFinalClassConstructor(typeSystemContext, typeConstructorMarker)) {
            if (!typeSystemContext.areEqualTypeConstructors(TypeSystemContextContextualKt.typeConstructor(typeSystemContext, rigidTypeMarker), typeConstructorMarker)) {
                return EmptyList.INSTANCE;
            }
            RigidTypeMarker captureFromArguments = typeSystemContext.captureFromArguments(rigidTypeMarker, CaptureStatus.FOR_SUBTYPING);
            if (captureFromArguments != null) {
                rigidTypeMarker = captureFromArguments;
            }
            return CollectionsKt__CollectionsJVMKt.listOf(rigidTypeMarker);
        }
        SmartList smartList = new SmartList();
        typeCheckerState.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        supertypesDeque.getClass();
        Set<RigidTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        supertypesSet.getClass();
        supertypesDeque.push(rigidTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker pop = supertypesDeque.pop();
            pop.getClass();
            if (supertypesSet.add(pop)) {
                RigidTypeMarker captureFromArguments2 = typeSystemContext.captureFromArguments(pop, CaptureStatus.FOR_SUBTYPING);
                if (captureFromArguments2 == null) {
                    captureFromArguments2 = pop;
                }
                if (typeSystemContext.areEqualTypeConstructors(TypeSystemContextContextualKt.typeConstructor(typeSystemContext, captureFromArguments2), typeConstructorMarker)) {
                    smartList.add(captureFromArguments2);
                    substitutionSupertypePolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    substitutionSupertypePolicy = TypeSystemContextContextualKt.argumentsCount(typeSystemContext, captureFromArguments2) == 0 ? TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE : typeCheckerState.getTypeSystemContext().substitutionSupertypePolicy(captureFromArguments2);
                }
                if (Intrinsics.areEqual(substitutionSupertypePolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    substitutionSupertypePolicy = null;
                }
                if (substitutionSupertypePolicy != null) {
                    TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(pop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(substitutionSupertypePolicy.mo4155transformType(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.clear();
        return smartList;
    }

    public static List collectAndFilter(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        int i;
        List collectAllSupertypesWithGivenTypeConstructor = collectAllSupertypesWithGivenTypeConstructor(typeCheckerState, typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        if (collectAllSupertypesWithGivenTypeConstructor.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectAllSupertypesWithGivenTypeConstructor) {
                TypeArgumentListMarker asArgumentList = TypeSystemContextContextualKt.asArgumentList(typeSystemContext, (RigidTypeMarker) obj);
                int size = typeSystemContext.size(asArgumentList);
                while (true) {
                    if (i >= size) {
                        arrayList.add(obj);
                        break;
                    }
                    KotlinTypeMarker type2 = TypeSystemContextContextualKt.getType(typeSystemContext, typeSystemContext.get(asArgumentList, i));
                    i = (type2 != null ? TypeSystemContextContextualKt.asFlexibleType(typeSystemContext, type2) : null) == null ? i + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return collectAllSupertypesWithGivenTypeConstructor;
    }

    public static TypeParameterMarker getTypeParameterForArgumentInBaseIfItEqualToTarget(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        KotlinTypeMarker type2;
        int argumentsCount = TypeSystemContextContextualKt.argumentsCount(typeSystemContext, kotlinTypeMarker);
        int i = 0;
        while (true) {
            if (i >= argumentsCount) {
                return null;
            }
            TypeArgumentMarker argument = TypeSystemContextContextualKt.getArgument(typeSystemContext, kotlinTypeMarker, i);
            TypeArgumentMarker typeArgumentMarker = TypeSystemContextContextualKt.isStarProjection(typeSystemContext, argument) ? null : argument;
            if (typeArgumentMarker != null && (type2 = TypeSystemContextContextualKt.getType(typeSystemContext, typeArgumentMarker)) != null) {
                boolean z = TypeSystemContextContextualKt.isCapturedType(typeSystemContext, TypeSystemContextContextualKt.lowerBoundIfFlexible(typeSystemContext, type2)) && TypeSystemContextContextualKt.isCapturedType(typeSystemContext, TypeSystemContextContextualKt.lowerBoundIfFlexible(typeSystemContext, kotlinTypeMarker2));
                if (type2.equals(kotlinTypeMarker2) || (z && Intrinsics.areEqual(TypeSystemContextContextualKt.typeConstructor(typeSystemContext, type2), TypeSystemContextContextualKt.typeConstructor(typeSystemContext, kotlinTypeMarker2)))) {
                    break;
                }
                TypeParameterMarker typeParameterForArgumentInBaseIfItEqualToTarget = getTypeParameterForArgumentInBaseIfItEqualToTarget(typeSystemContext, type2, kotlinTypeMarker2);
                if (typeParameterForArgumentInBaseIfItEqualToTarget != null) {
                    return typeParameterForArgumentInBaseIfItEqualToTarget;
                }
            }
            i++;
        }
        return TypeSystemContextContextualKt.getParameter(typeSystemContext, TypeSystemContextContextualKt.typeConstructor(typeSystemContext, kotlinTypeMarker), i);
    }

    public static boolean isCommonDenotableType(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
        return (!TypeSystemContextContextualKt.isDenotable(typeSystemContext, TypeSystemContextContextualKt.typeConstructor(typeSystemContext, kotlinTypeMarker)) || TypeSystemContextContextualKt.isDynamic(typeSystemContext, kotlinTypeMarker) || TypeSystemContextContextualKt.isDefinitelyNotNullType(typeSystemContext, kotlinTypeMarker) || TypeSystemContextContextualKt.isNotNullTypeParameter(typeSystemContext, kotlinTypeMarker) || TypeSystemContextContextualKt.isFlexibleWithDifferentTypeConstructors(typeSystemContext, kotlinTypeMarker)) ? false : true;
    }

    public static /* synthetic */ boolean isSubtypeOf$default(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return abstractTypeChecker.isSubtypeOf(typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    public static boolean isTypeVariableAgainstStarProjectionForSelfType(TypeSystemContext typeSystemContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, TypeConstructorMarker typeConstructorMarker) {
        TypeParameterMarker typeParameter;
        RigidTypeMarker asRigidType = TypeSystemContextContextualKt.asRigidType(typeSystemContext, kotlinTypeMarker);
        if (!(asRigidType instanceof CapturedTypeMarker)) {
            return false;
        }
        CapturedTypeMarker capturedTypeMarker = (CapturedTypeMarker) asRigidType;
        if (TypeSystemContextContextualKt.isOldCapturedType(typeSystemContext, capturedTypeMarker) || !TypeSystemContextContextualKt.isStarProjection(typeSystemContext, TypeSystemContextContextualKt.projection(typeSystemContext, TypeSystemContextContextualKt.typeConstructor(typeSystemContext, capturedTypeMarker))) || TypeSystemContextContextualKt.captureStatus(typeSystemContext, capturedTypeMarker) != CaptureStatus.FOR_SUBTYPING) {
            return false;
        }
        TypeConstructorMarker typeConstructor = TypeSystemContextContextualKt.typeConstructor(typeSystemContext, kotlinTypeMarker2);
        TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker = typeConstructor instanceof TypeVariableTypeConstructorMarker ? (TypeVariableTypeConstructorMarker) typeConstructor : null;
        return (typeVariableTypeConstructorMarker == null || (typeParameter = TypeSystemContextContextualKt.getTypeParameter(typeSystemContext, typeVariableTypeConstructorMarker)) == null || !TypeSystemContextContextualKt.hasRecursiveBounds(typeSystemContext, typeParameter, typeConstructorMarker)) ? false : true;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean completeIsSubTypeOf(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r19, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext r20, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r21, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.completeIsSubTypeOf(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, boolean):boolean");
    }

    public final TypeVariance effectiveVariance(TypeVariance typeVariance, TypeVariance typeVariance2) {
        typeVariance.getClass();
        typeVariance2.getClass();
        TypeVariance typeVariance3 = TypeVariance.INV;
        if (typeVariance == typeVariance3) {
            return typeVariance2;
        }
        if (typeVariance2 == typeVariance3 || typeVariance == typeVariance2) {
            return typeVariance;
        }
        return null;
    }

    public final boolean equalTypes(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        typeCheckerState.getClass();
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        TypeSystemContext typeSystemContext = typeCheckerState.getTypeSystemContext();
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = INSTANCE;
        abstractTypeChecker.getClass();
        if (isCommonDenotableType(typeSystemContext, kotlinTypeMarker) && isCommonDenotableType(typeSystemContext, kotlinTypeMarker2)) {
            KotlinTypeMarker prepareType = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker));
            KotlinTypeMarker prepareType2 = typeCheckerState.prepareType(typeCheckerState.refineType(kotlinTypeMarker2));
            RigidTypeMarker lowerBoundIfFlexible = typeSystemContext.lowerBoundIfFlexible(prepareType);
            if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(prepareType), typeSystemContext.typeConstructor(prepareType2))) {
                return false;
            }
            if (typeSystemContext.argumentsCount(lowerBoundIfFlexible) == 0) {
                return typeSystemContext.hasFlexibleNullability(prepareType) || typeSystemContext.hasFlexibleNullability(prepareType2) || typeSystemContext.isMarkedNullable(lowerBoundIfFlexible) == typeSystemContext.isMarkedNullable(typeSystemContext.lowerBoundIfFlexible(prepareType2));
            }
        }
        return isSubtypeOf$default(abstractTypeChecker, typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, false, 8, null) && isSubtypeOf$default(abstractTypeChecker, typeCheckerState, kotlinTypeMarker2, kotlinTypeMarker, false, 8, null);
    }

    public final List<RigidTypeMarker> findCorrespondingSupertypes(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeCheckerState.SupertypesPolicy supertypesPolicy;
        typeCheckerState.getClass();
        typeSystemContext.getClass();
        rigidTypeMarker.getClass();
        typeConstructorMarker.getClass();
        if (TypeSystemContextContextualKt.isClassType(typeSystemContext, rigidTypeMarker)) {
            return collectAndFilter(typeCheckerState, typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        }
        if (!TypeSystemContextContextualKt.isClassTypeConstructor(typeSystemContext, typeConstructorMarker) && !TypeSystemContextContextualKt.isIntegerLiteralTypeConstructor(typeSystemContext, typeConstructorMarker)) {
            return collectAllSupertypesWithGivenTypeConstructor(typeCheckerState, typeSystemContext, rigidTypeMarker, typeConstructorMarker);
        }
        SmartList<RigidTypeMarker> smartList = new SmartList();
        typeCheckerState.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = typeCheckerState.getSupertypesDeque();
        supertypesDeque.getClass();
        Set<RigidTypeMarker> supertypesSet = typeCheckerState.getSupertypesSet();
        supertypesSet.getClass();
        supertypesDeque.push(rigidTypeMarker);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker pop = supertypesDeque.pop();
            pop.getClass();
            if (supertypesSet.add(pop)) {
                if (TypeSystemContextContextualKt.isClassType(typeSystemContext, pop)) {
                    smartList.add(pop);
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.None.INSTANCE;
                } else {
                    supertypesPolicy = TypeCheckerState.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                }
                if (Intrinsics.areEqual(supertypesPolicy, TypeCheckerState.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy != null) {
                    TypeSystemContext typeSystemContext2 = typeCheckerState.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(pop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(supertypesPolicy.mo4155transformType(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.clear();
        ArrayList arrayList = new ArrayList();
        for (RigidTypeMarker rigidTypeMarker2 : smartList) {
            AbstractTypeChecker abstractTypeChecker = INSTANCE;
            rigidTypeMarker2.getClass();
            abstractTypeChecker.getClass();
            CollectionsKt__MutableCollectionsKt.addAll(collectAndFilter(typeCheckerState, typeSystemContext, rigidTypeMarker2, typeConstructorMarker), arrayList);
        }
        return arrayList;
    }

    public final boolean isSubtypeForSameConstructor(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, TypeArgumentListMarker typeArgumentListMarker, RigidTypeMarker rigidTypeMarker) {
        int i;
        int i2;
        boolean equalTypes;
        int i3;
        TypeCheckerState typeCheckerState2 = typeCheckerState;
        typeCheckerState2.getClass();
        typeSystemContext.getClass();
        typeArgumentListMarker.getClass();
        rigidTypeMarker.getClass();
        TypeConstructorMarker typeConstructor = TypeSystemContextContextualKt.typeConstructor(typeSystemContext, rigidTypeMarker);
        int size = TypeSystemContextContextualKt.size(typeSystemContext, typeArgumentListMarker);
        int parametersCount = TypeSystemContextContextualKt.parametersCount(typeSystemContext, typeConstructor);
        if (size == parametersCount && size == TypeSystemContextContextualKt.argumentsCount(typeSystemContext, rigidTypeMarker)) {
            for (int i4 = 0; i4 < parametersCount; i4++) {
                TypeArgumentMarker argument = TypeSystemContextContextualKt.getArgument(typeSystemContext, rigidTypeMarker, i4);
                KotlinTypeMarker type2 = TypeSystemContextContextualKt.getType(typeSystemContext, argument);
                if (type2 != null) {
                    TypeArgumentMarker typeArgumentMarker = TypeSystemContextContextualKt.get(typeSystemContext, typeArgumentListMarker, i4);
                    TypeSystemContextContextualKt.getVariance(typeSystemContext, typeArgumentMarker);
                    TypeVariance typeVariance = TypeVariance.INV;
                    KotlinTypeMarker type3 = TypeSystemContextContextualKt.getType(typeSystemContext, typeArgumentMarker);
                    type3.getClass();
                    TypeVariance effectiveVariance = effectiveVariance(TypeSystemContextContextualKt.getVariance(typeSystemContext, TypeSystemContextContextualKt.getParameter(typeSystemContext, typeConstructor, i4)), TypeSystemContextContextualKt.getVariance(typeSystemContext, argument));
                    if (effectiveVariance == null) {
                        return typeCheckerState2.isErrorTypeEqualsToAnything();
                    }
                    if (effectiveVariance != typeVariance || (!isTypeVariableAgainstStarProjectionForSelfType(typeSystemContext, type3, type2, typeConstructor) && !isTypeVariableAgainstStarProjectionForSelfType(typeSystemContext, type2, type3, typeConstructor))) {
                        i = typeCheckerState2.argumentsDepth;
                        if (i > 100) {
                            Path$$ExternalSyntheticBUOutline0.m$1(type3, "Arguments depth is too high. Some related argument: ");
                            return false;
                        }
                        i2 = typeCheckerState2.argumentsDepth;
                        typeCheckerState2.argumentsDepth = i2 + 1;
                        int i5 = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
                        if (i5 == 1) {
                            equalTypes = INSTANCE.equalTypes(typeCheckerState2, type3, type2);
                        } else if (i5 == 2) {
                            typeCheckerState2 = typeCheckerState;
                            equalTypes = isSubtypeOf$default(INSTANCE, typeCheckerState2, type3, type2, false, 8, null);
                        } else {
                            if (i5 != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return false;
                            }
                            equalTypes = isSubtypeOf$default(INSTANCE, typeCheckerState2, type2, type3, false, 8, null);
                            typeCheckerState2 = typeCheckerState;
                        }
                        i3 = typeCheckerState2.argumentsDepth;
                        typeCheckerState2.argumentsDepth = i3 - 1;
                        if (!equalTypes) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean isSubtypeOf(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z) {
        typeCheckerState.getClass();
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        if (kotlinTypeMarker == kotlinTypeMarker2) {
            return true;
        }
        if (!typeCheckerState.customIsSubtypeOf(kotlinTypeMarker, kotlinTypeMarker2)) {
            return false;
        }
        return INSTANCE.completeIsSubTypeOf(typeCheckerState, typeCheckerState.getTypeSystemContext(), kotlinTypeMarker, kotlinTypeMarker2, z);
    }

    public final boolean isSubtypeOf(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        typeCheckerState.getClass();
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return isSubtypeOf$default(this, typeCheckerState, kotlinTypeMarker, kotlinTypeMarker2, false, 8, null);
    }

    public final List<RigidTypeMarker> findCorrespondingSupertypes(TypeCheckerState typeCheckerState, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        typeCheckerState.getClass();
        rigidTypeMarker.getClass();
        typeConstructorMarker.getClass();
        return INSTANCE.findCorrespondingSupertypes(typeCheckerState, typeCheckerState.getTypeSystemContext(), rigidTypeMarker, typeConstructorMarker);
    }
}
