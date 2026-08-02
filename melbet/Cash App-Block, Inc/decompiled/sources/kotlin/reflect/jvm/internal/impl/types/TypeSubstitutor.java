package kotlin.reflect.jvm.internal.impl.types;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public class TypeSubstitutor implements TypeSubstitutorMarker {
    public static final TypeSubstitutor EMPTY = create(TypeSubstitution.EMPTY);
    public final TypeSubstitution substitution;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$1, reason: invalid class name */
    public final class AnonymousClass1 implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            if (((FqName) obj) != null) {
                return Boolean.valueOf(!r1.equals(StandardNames.FqNames.unsafeVariance));
            }
            a$$ExternalSyntheticBUOutline0.m$3("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
            return null;
        }
    }

    public static final class SubstitutionException extends Exception {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0021 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    break;
            }
            if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
                switch (i) {
                    default:
                        switch (i) {
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                i2 = 3;
                                                break;
                                        }
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        i2 = 2;
                                        break;
                                }
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                break;
                        }
                    case 11:
                    case 12:
                    case 13:
                        break;
                }
                Object[] objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                    case 37:
                    case 40:
                    case 41:
                    case 42:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                        break;
                    case 3:
                        objArr[0] = "first";
                        break;
                    case 4:
                        objArr[0] = "second";
                        break;
                    case 5:
                        objArr[0] = "substitutionContext";
                        break;
                    case 6:
                        objArr[0] = "context";
                        break;
                    case 7:
                    default:
                        objArr[0] = "substitution";
                        break;
                    case 9:
                    case 14:
                        objArr[0] = "type";
                        break;
                    case 10:
                    case 15:
                        objArr[0] = "howThisTypeIsUsed";
                        break;
                    case 16:
                    case 17:
                    case 36:
                        objArr[0] = "typeProjection";
                        break;
                    case 18:
                    case 28:
                        objArr[0] = "originalProjection";
                        break;
                    case 26:
                        objArr[0] = "originalType";
                        break;
                    case 27:
                        objArr[0] = "substituted";
                        break;
                    case 33:
                        objArr[0] = "annotations";
                        break;
                    case 35:
                    case 38:
                        objArr[0] = "typeParameterVariance";
                        break;
                    case 39:
                        objArr[0] = "projectionKind";
                        break;
                }
                if (i != 1) {
                    objArr[1] = "replaceWithNonApproximatingSubstitution";
                } else if (i == 2) {
                    objArr[1] = "replaceWithContravariantApproximatingSubstitution";
                } else if (i == 8) {
                    objArr[1] = "getSubstitution";
                } else if (i != 34) {
                    if (i != 37) {
                        switch (i) {
                            case 11:
                            case 12:
                            case 13:
                                objArr[1] = "safeSubstitute";
                                break;
                            default:
                                switch (i) {
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                        objArr[1] = "unsafeSubstitute";
                                        break;
                                    default:
                                        switch (i) {
                                            case 29:
                                            case 30:
                                            case 31:
                                            case 32:
                                                objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                        break;
                                                }
                                        }
                                }
                        }
                    }
                    objArr[1] = "combine";
                } else {
                    objArr[1] = "filterOutUnsafeVariance";
                }
                switch (i) {
                    case 1:
                    case 2:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                    case 37:
                    case 40:
                    case 41:
                    case 42:
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "createChainedSubstitutor";
                        break;
                    case 5:
                    case 6:
                    default:
                        objArr[2] = "create";
                        break;
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "safeSubstitute";
                        break;
                    case 14:
                    case 15:
                    case 16:
                        objArr[2] = "substitute";
                        break;
                    case 17:
                        objArr[2] = "substituteWithoutApproximation";
                        break;
                    case 18:
                        objArr[2] = "unsafeSubstitute";
                        break;
                    case 26:
                    case 27:
                    case 28:
                        objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                        break;
                    case 33:
                        objArr[2] = "filterOutUnsafeVariance";
                        break;
                    case 35:
                    case 36:
                    case 38:
                    case 39:
                        objArr[2] = "combine";
                        break;
                }
                String format2 = String.format(str, objArr);
                if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
                    switch (i) {
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            switch (i) {
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                    break;
                                default:
                                    switch (i) {
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                            break;
                                        default:
                                            switch (i) {
                                                case 40:
                                                case 41:
                                                case 42:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format2);
                                            }
                                    }
                            }
                    }
                }
                throw new IllegalStateException(format2);
            }
            i2 = 2;
            Object[] objArr2 = new Object[i2];
            switch (i) {
            }
            if (i != 1) {
            }
            switch (i) {
            }
            String format22 = String.format(str, objArr2);
            if (i != 1) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format22);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 1) {
            switch (i) {
            }
            Object[] objArr22 = new Object[i2];
            switch (i) {
            }
            if (i != 1) {
            }
            switch (i) {
            }
            String format222 = String.format(str, objArr22);
            if (i != 1) {
            }
            throw new IllegalStateException(format222);
        }
        i2 = 2;
        Object[] objArr222 = new Object[i2];
        switch (i) {
        }
        if (i != 1) {
        }
        switch (i) {
        }
        String format2222 = String.format(str, objArr222);
        if (i != 1) {
        }
        throw new IllegalStateException(format2222);
    }

    public TypeSubstitutor(TypeSubstitution typeSubstitution) {
        if (typeSubstitution != null) {
            this.substitution = typeSubstitution;
        } else {
            $$$reportNull$$$0(7);
            throw null;
        }
    }

    public static Variance combine(Variance variance, Variance variance2) {
        if (variance == null) {
            $$$reportNull$$$0(38);
            throw null;
        }
        if (variance2 == null) {
            $$$reportNull$$$0(39);
            throw null;
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 != null) {
                return variance2;
            }
            $$$reportNull$$$0(40);
            throw null;
        }
        if (variance2 == variance3) {
            if (variance != null) {
                return variance;
            }
            $$$reportNull$$$0(41);
            throw null;
        }
        if (variance != variance2) {
            f$$ExternalSyntheticLambda0.m(variance, "' and projection kind '", variance2, "' cannot be combined", "Variance conflict: type parameter variance '");
            return null;
        }
        if (variance2 != null) {
            return variance2;
        }
        $$$reportNull$$$0(42);
        throw null;
    }

    public static int conflictType(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return 3;
        }
        return (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? 2 : 1;
    }

    public static TypeSubstitutor create(KotlinType kotlinType) {
        if (kotlinType != null) {
            return create(TypeConstructorSubstitution.create(kotlinType.getConstructor(), kotlinType.getArguments()));
        }
        $$$reportNull$$$0(6);
        throw null;
    }

    public static TypeSubstitutor createChainedSubstitutor(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        if (typeSubstitution2 != null) {
            return create(DisjointKeysUnionTypeSubstitution.create(typeSubstitution, typeSubstitution2));
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    public static String safeToString(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (ExceptionUtilsKt.isProcessCanceledException(th)) {
                throw th;
            }
            return NavAction$$ExternalSyntheticOutline0.m("[Exception while computing toString(): ", "]", th);
        }
    }

    public TypeSubstitution getSubstitution() {
        TypeSubstitution typeSubstitution = this.substitution;
        if (typeSubstitution != null) {
            return typeSubstitution;
        }
        $$$reportNull$$$0(8);
        throw null;
    }

    public boolean isEmpty() {
        return this.substitution.isEmpty();
    }

    public TypeSubstitutor replaceWithNonApproximatingSubstitution() {
        TypeSubstitution typeSubstitution = this.substitution;
        return ((typeSubstitution instanceof IndexedParametersSubstitution) && typeSubstitution.approximateContravariantCapturedTypes()) ? new TypeSubstitutor(new IndexedParametersSubstitution(((IndexedParametersSubstitution) typeSubstitution).getParameters(), ((IndexedParametersSubstitution) typeSubstitution).getArguments(), false)) : this;
    }

    public KotlinType safeSubstitute(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            $$$reportNull$$$0(9);
            throw null;
        }
        if (variance == null) {
            $$$reportNull$$$0(10);
            throw null;
        }
        if (isEmpty()) {
            if (kotlinType != null) {
                return kotlinType;
            }
            $$$reportNull$$$0(11);
            throw null;
        }
        try {
            KotlinType type2 = unsafeSubstitute(new TypeProjectionImpl(variance, kotlinType), null, 0).getType();
            if (type2 != null) {
                return type2;
            }
            $$$reportNull$$$0(12);
            throw null;
        } catch (SubstitutionException e) {
            ErrorType createErrorType = ErrorUtils.createErrorType(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (createErrorType != null) {
                return createErrorType;
            }
            $$$reportNull$$$0(13);
            throw null;
        }
    }

    public KotlinType substitute(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            $$$reportNull$$$0(14);
            throw null;
        }
        if (variance == null) {
            $$$reportNull$$$0(15);
            throw null;
        }
        TypeProjection substitute = substitute(new TypeProjectionImpl(variance, getSubstitution().prepareTopLevelType(kotlinType, variance)));
        if (substitute == null) {
            return null;
        }
        return substitute.getType();
    }

    public TypeProjection substituteWithoutApproximation(TypeProjection typeProjection) {
        if (typeProjection == null) {
            $$$reportNull$$$0(17);
            throw null;
        }
        if (isEmpty()) {
            return typeProjection;
        }
        try {
            return unsafeSubstitute(typeProjection, null, 0);
        } catch (SubstitutionException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x024c, code lost:
    
        if (r7 != 2) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TypeProjection unsafeSubstitute(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, int i) {
        if (typeProjection == null) {
            $$$reportNull$$$0(18);
            throw null;
        }
        TypeSubstitution typeSubstitution = this.substitution;
        if (i > 100) {
            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m$1("Recursion too deep. Most likely infinite loop while substituting ", safeToString(typeProjection), "; substitution: ", safeToString(typeSubstitution));
            return null;
        }
        if (!typeProjection.isStarProjection()) {
            KotlinType type2 = typeProjection.getType();
            if (type2 instanceof TypeWithEnhancement) {
                TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type2;
                UnwrappedType origin = typeWithEnhancement.getOrigin();
                KotlinType enhancement = typeWithEnhancement.getEnhancement();
                TypeProjection unsafeSubstitute = unsafeSubstitute(new TypeProjectionImpl(typeProjection.getProjectionKind(), origin), typeParameterDescriptor, i + 1);
                return unsafeSubstitute.isStarProjection() ? unsafeSubstitute : new TypeProjectionImpl(unsafeSubstitute.getProjectionKind(), TypeWithEnhancementKt.wrapEnhancement(unsafeSubstitute.getType().unwrap(), substitute(enhancement, typeProjection.getProjectionKind())));
            }
            if (!DynamicTypesKt.isDynamic(type2) && !(type2.unwrap() instanceof RawType)) {
                TypeProjection mo4156get = typeSubstitution.mo4156get(type2);
                if (mo4156get == null) {
                    mo4156get = null;
                } else if (type2.getAnnotations().hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
                    TypeConstructor constructor = mo4156get.getType().getConstructor();
                    if (constructor instanceof NewCapturedTypeConstructor) {
                        TypeProjection projection = ((NewCapturedTypeConstructor) constructor).getProjection();
                        Variance projectionKind = projection.getProjectionKind();
                        if (conflictType(typeProjection.getProjectionKind(), projectionKind) == 3) {
                            mo4156get = new TypeProjectionImpl(projection.getType());
                        } else if (typeParameterDescriptor != null && conflictType(typeParameterDescriptor.getVariance(), projectionKind) == 3) {
                            mo4156get = new TypeProjectionImpl(projection.getType());
                        }
                    }
                }
                Variance projectionKind2 = typeProjection.getProjectionKind();
                if (mo4156get == null && FlexibleTypesKt.isFlexible(type2) && !TypeCapabilitiesKt.isCustomTypeParameter(type2)) {
                    FlexibleType asFlexibleType = FlexibleTypesKt.asFlexibleType(type2);
                    int i2 = i + 1;
                    TypeProjection unsafeSubstitute2 = unsafeSubstitute(new TypeProjectionImpl(projectionKind2, asFlexibleType.getLowerBound()), typeParameterDescriptor, i2);
                    TypeProjection unsafeSubstitute3 = unsafeSubstitute(new TypeProjectionImpl(projectionKind2, asFlexibleType.getUpperBound()), typeParameterDescriptor, i2);
                    Variance projectionKind3 = unsafeSubstitute2.getProjectionKind();
                    if (unsafeSubstitute2.getType() != asFlexibleType.getLowerBound() || unsafeSubstitute3.getType() != asFlexibleType.getUpperBound()) {
                        return new TypeProjectionImpl(projectionKind3, KotlinTypeFactory.flexibleType(TypeSubstitutionKt.asSimpleType(unsafeSubstitute2.getType()), TypeSubstitutionKt.asSimpleType(unsafeSubstitute3.getType())));
                    }
                } else if (!KotlinBuiltIns.isNothing(type2) && !KotlinTypeKt.isError(type2)) {
                    if (mo4156get != null) {
                        int conflictType = conflictType(projectionKind2, mo4156get.getProjectionKind());
                        if (!CapturedTypeConstructorKt.isCaptured(type2)) {
                            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(conflictType);
                            if (ordinal == 1) {
                                return new TypeProjectionImpl(Variance.OUT_VARIANCE, type2.getConstructor().getBuiltIns().getNullableAnyType());
                            }
                            if (ordinal == 2) {
                                throw new SubstitutionException("Out-projection in in-position");
                            }
                        }
                        CustomTypeParameter customTypeParameter = TypeCapabilitiesKt.getCustomTypeParameter(type2);
                        if (mo4156get.isStarProjection()) {
                            return mo4156get;
                        }
                        KotlinType substitutionResult = customTypeParameter != null ? customTypeParameter.substitutionResult(mo4156get.getType()) : TypeUtils.makeNullableIfNeeded(mo4156get.getType(), type2.isMarkedNullable());
                        if (!type2.getAnnotations().isEmpty()) {
                            Annotations filterAnnotations = typeSubstitution.filterAnnotations(type2.getAnnotations());
                            if (filterAnnotations == null) {
                                $$$reportNull$$$0(33);
                                throw null;
                            }
                            if (filterAnnotations.hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
                                filterAnnotations = new FilteredAnnotations(filterAnnotations, new AnonymousClass1());
                            }
                            substitutionResult = TypeUtilsKt.replaceAnnotations(substitutionResult, new CompositeAnnotations(substitutionResult.getAnnotations(), filterAnnotations));
                        }
                        if (conflictType == 1) {
                            projectionKind2 = combine(projectionKind2, mo4156get.getProjectionKind());
                        }
                        return new TypeProjectionImpl(projectionKind2, substitutionResult);
                    }
                    KotlinType type3 = typeProjection.getType();
                    Variance projectionKind4 = typeProjection.getProjectionKind();
                    if (!(type3.getConstructor().mo4153getDeclarationDescriptor() instanceof TypeParameterDescriptor)) {
                        SimpleType abbreviation = SpecialTypesKt.getAbbreviation(type3);
                        KotlinType substitute = abbreviation != null ? replaceWithNonApproximatingSubstitution().substitute(abbreviation, Variance.INVARIANT) : null;
                        List<TypeParameterDescriptor> parameters = type3.getConstructor().getParameters();
                        List<TypeProjection> arguments = type3.getArguments();
                        ArrayList arrayList = new ArrayList(parameters.size());
                        boolean z = false;
                        for (int i3 = 0; i3 < parameters.size(); i3++) {
                            TypeParameterDescriptor typeParameterDescriptor2 = parameters.get(i3);
                            TypeProjection typeProjection2 = arguments.get(i3);
                            TypeProjection unsafeSubstitute4 = unsafeSubstitute(typeProjection2, typeParameterDescriptor2, i + 1);
                            int ordinal2 = CameraSelector$$ExternalSyntheticOutline0.ordinal(conflictType(typeParameterDescriptor2.getVariance(), unsafeSubstitute4.getProjectionKind()));
                            if (ordinal2 != 0) {
                                if (ordinal2 == 1) {
                                }
                                unsafeSubstitute4 = TypeUtils.makeStarProjection(typeParameterDescriptor2);
                            } else {
                                Variance variance = typeParameterDescriptor2.getVariance();
                                Variance variance2 = Variance.INVARIANT;
                                if (variance != variance2 && !unsafeSubstitute4.isStarProjection()) {
                                    unsafeSubstitute4 = new TypeProjectionImpl(variance2, unsafeSubstitute4.getType());
                                }
                            }
                            if (unsafeSubstitute4 != typeProjection2) {
                                z = true;
                            }
                            arrayList.add(unsafeSubstitute4);
                        }
                        if (z) {
                            arguments = arrayList;
                        }
                        KotlinType replace = TypeSubstitutionKt.replace(type3, arguments, typeSubstitution.filterAnnotations(type3.getAnnotations()));
                        if ((replace instanceof SimpleType) && (substitute instanceof SimpleType)) {
                            replace = SpecialTypesKt.withAbbreviation((SimpleType) replace, (SimpleType) substitute);
                        }
                        return new TypeProjectionImpl(projectionKind4, replace);
                    }
                }
            }
        }
        return typeProjection;
    }

    public static TypeSubstitutor create(Map<TypeConstructor, TypeProjection> map) {
        if (map != null) {
            return create(TypeConstructorSubstitution.createByConstructorsMap(map));
        }
        $$$reportNull$$$0(5);
        throw null;
    }

    public static TypeSubstitutor create(TypeSubstitution typeSubstitution) {
        if (typeSubstitution != null) {
            return new TypeSubstitutor(typeSubstitution);
        }
        $$$reportNull$$$0(0);
        throw null;
    }

    public TypeProjection substitute(TypeProjection typeProjection) {
        if (typeProjection != null) {
            TypeProjection substituteWithoutApproximation = substituteWithoutApproximation(typeProjection);
            TypeSubstitution typeSubstitution = this.substitution;
            return (typeSubstitution.approximateCapturedTypes() || typeSubstitution.approximateContravariantCapturedTypes()) ? CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary(substituteWithoutApproximation, typeSubstitution.approximateContravariantCapturedTypes()) : substituteWithoutApproximation;
        }
        $$$reportNull$$$0(16);
        throw null;
    }

    public static Variance combine(Variance variance, TypeProjection typeProjection) {
        if (variance == null) {
            $$$reportNull$$$0(35);
            throw null;
        }
        if (typeProjection != null) {
            if (!typeProjection.isStarProjection()) {
                return combine(variance, typeProjection.getProjectionKind());
            }
            Variance variance2 = Variance.OUT_VARIANCE;
            if (variance2 != null) {
                return variance2;
            }
            $$$reportNull$$$0(37);
            throw null;
        }
        $$$reportNull$$$0(36);
        throw null;
    }
}
