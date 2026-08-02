package kotlin.reflect.jvm.internal.impl.types.checker;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {
    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    CapturedTypeMarker asCapturedType(SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker asRigidType(KotlinTypeMarker kotlinTypeMarker);

    KotlinTypeMarker createFlexibleType(RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2);

    KotlinBuiltIns getBuiltIns();

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isSingleClassifierType(RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isStarProjection(TypeArgumentMarker typeArgumentMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker lowerBound(FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    TypeConstructorMarker typeConstructor(RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker upperBound(FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker withNullability(RigidTypeMarker rigidTypeMarker, boolean z);

    public static final class DefaultImpls {
        public static boolean areEqualTypeConstructors(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2) {
            typeConstructorMarker.getClass();
            typeConstructorMarker2.getClass();
            if (!(typeConstructorMarker instanceof TypeConstructor)) {
                StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
                Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
                return false;
            }
            if (typeConstructorMarker2 instanceof TypeConstructor) {
                return typeConstructorMarker.equals(typeConstructorMarker2);
            }
            StringBuilder m2 = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker2, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker2.getClass(), m2));
            return false;
        }

        public static int argumentsCount(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getArguments().size();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
            return 0;
        }

        public static SimpleTypeMarker arrayType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                SimpleType arrayType = classicTypeSystemContext.getBuiltIns().getArrayType(Variance.INVARIANT, (KotlinType) kotlinTypeMarker);
                arrayType.getClass();
                return arrayType;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(classicTypeSystemContext);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, classicTypeSystemContext.getClass(), sb));
            return null;
        }

        public static TypeArgumentListMarker asArgumentList(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return (TypeArgumentListMarker) rigidTypeMarker;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, rigidTypeMarker.getClass(), sb));
            return null;
        }

        public static CapturedTypeMarker asCapturedType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof SimpleType) {
                if (simpleTypeMarker instanceof SimpleTypeWithEnhancement) {
                    return classicTypeSystemContext.asCapturedType(((SimpleTypeWithEnhancement) simpleTypeMarker).getOrigin());
                }
                if (simpleTypeMarker instanceof NewCapturedType) {
                    return (NewCapturedType) simpleTypeMarker;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, simpleTypeMarker.getClass(), sb));
            return null;
        }

        public static DefinitelyNotNullTypeMarker asDefinitelyNotNullType(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                if (rigidTypeMarker instanceof DefinitelyNotNullType) {
                    return (DefinitelyNotNullType) rigidTypeMarker;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, rigidTypeMarker.getClass(), sb));
            return null;
        }

        public static DynamicTypeMarker asDynamicType(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                if (flexibleTypeMarker instanceof DynamicType) {
                    return (DynamicType) flexibleTypeMarker;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, flexibleTypeMarker.getClass(), sb));
            return null;
        }

        public static FlexibleTypeMarker asFlexibleType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                UnwrappedType unwrap2 = ((KotlinType) kotlinTypeMarker).unwrap();
                if (unwrap2 instanceof FlexibleType) {
                    return (FlexibleType) unwrap2;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        public static SimpleTypeMarker asRigidType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                UnwrappedType unwrap2 = ((KotlinType) kotlinTypeMarker).unwrap();
                if (unwrap2 instanceof SimpleType) {
                    return (SimpleType) unwrap2;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        public static TypeArgumentMarker asTypeArgument(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return TypeUtilsKt.asTypeProjection((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        public static SimpleType captureFromArguments(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker, CaptureStatus captureStatus) {
            rigidTypeMarker.getClass();
            captureStatus.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return NewCapturedTypeKt.captureFromArguments((SimpleType) rigidTypeMarker, captureStatus);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, rigidTypeMarker.getClass(), sb));
            return null;
        }

        public static CaptureStatus captureStatus(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).getCaptureStatus();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, capturedTypeMarker.getClass(), sb));
            return null;
        }

        public static KotlinTypeMarker createFlexibleType(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
            rigidTypeMarker.getClass();
            rigidTypeMarker2.getClass();
            if (!(rigidTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(classicTypeSystemContext);
                sb.append(", ");
                Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, classicTypeSystemContext.getClass(), sb));
                return null;
            }
            if (rigidTypeMarker2 instanceof SimpleType) {
                return KotlinTypeFactory.flexibleType((SimpleType) rigidTypeMarker, (SimpleType) rigidTypeMarker2);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(classicTypeSystemContext);
            sb2.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, classicTypeSystemContext.getClass(), sb2));
            return null;
        }

        public static TypeArgumentMarker getArgument(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker, int i) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getArguments().get(i);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        public static List<TypeArgumentMarker> getArguments(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getArguments();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        public static KotlinBuiltIns getBuiltIns(ClassicTypeSystemContext classicTypeSystemContext) {
            throw new UnsupportedOperationException("Not supported");
        }

        public static FqNameUnsafe getClassFqNameUnsafe(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo4153getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo4153getDeclarationDescriptor();
                mo4153getDeclarationDescriptor.getClass();
                return DescriptorUtilsKt.getFqNameUnsafe((ClassDescriptor) mo4153getDeclarationDescriptor);
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return null;
        }

        public static TypeParameterMarker getParameter(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker, int i) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                TypeParameterDescriptor typeParameterDescriptor = ((TypeConstructor) typeConstructorMarker).getParameters().get(i);
                typeParameterDescriptor.getClass();
                return typeParameterDescriptor;
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return null;
        }

        public static List<TypeParameterMarker> getParameters(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                List<TypeParameterDescriptor> parameters = ((TypeConstructor) typeConstructorMarker).getParameters();
                parameters.getClass();
                return parameters;
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return null;
        }

        public static PrimitiveType getPrimitiveArrayType(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo4153getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo4153getDeclarationDescriptor();
                mo4153getDeclarationDescriptor.getClass();
                return KotlinBuiltIns.getPrimitiveArrayType((ClassDescriptor) mo4153getDeclarationDescriptor);
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return null;
        }

        public static PrimitiveType getPrimitiveType(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo4153getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo4153getDeclarationDescriptor();
                mo4153getDeclarationDescriptor.getClass();
                return KotlinBuiltIns.getPrimitiveType((ClassDescriptor) mo4153getDeclarationDescriptor);
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return null;
        }

        public static KotlinTypeMarker getRepresentativeUpperBound(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                return TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) typeParameterMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeParameterMarker.getClass(), sb));
            return null;
        }

        public static KotlinTypeMarker getType(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (classicTypeSystemContext.isStarProjection(typeArgumentMarker)) {
                return null;
            }
            if (typeArgumentMarker instanceof TypeProjection) {
                return ((TypeProjection) typeArgumentMarker).getType().unwrap();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeArgumentMarker.getClass(), sb));
            return null;
        }

        public static TypeConstructorMarker getTypeConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                TypeConstructor typeConstructor = ((TypeParameterDescriptor) typeParameterMarker).getTypeConstructor();
                typeConstructor.getClass();
                return typeConstructor;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeParameterMarker.getClass(), sb));
            return null;
        }

        public static TypeParameterMarker getTypeParameter(ClassicTypeSystemContext classicTypeSystemContext, TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
            typeVariableTypeConstructorMarker.getClass();
            if (typeVariableTypeConstructorMarker instanceof NewTypeVariableConstructor) {
                return ((NewTypeVariableConstructor) typeVariableTypeConstructorMarker).getOriginalTypeParameter();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeVariableTypeConstructorMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeVariableTypeConstructorMarker.getClass(), sb));
            return null;
        }

        public static TypeParameterMarker getTypeParameterClassifier(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo4153getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo4153getDeclarationDescriptor();
                if (mo4153getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                    return (TypeParameterDescriptor) mo4153getDeclarationDescriptor;
                }
                return null;
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return null;
        }

        public static KotlinTypeMarker getUnsubstitutedUnderlyingType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return InlineClassesUtilsKt.unsubstitutedUnderlyingType((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        public static List<KotlinTypeMarker> getUpperBounds(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                List<KotlinType> upperBounds = ((TypeParameterDescriptor) typeParameterMarker).getUpperBounds();
                upperBounds.getClass();
                return upperBounds;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeParameterMarker.getClass(), sb));
            return null;
        }

        public static TypeVariance getVariance(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (typeArgumentMarker instanceof TypeProjection) {
                Variance projectionKind = ((TypeProjection) typeArgumentMarker).getProjectionKind();
                projectionKind.getClass();
                return TypeSystemContextKt.convertVariance(projectionKind);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeArgumentMarker.getClass(), sb));
            return null;
        }

        public static boolean hasAnnotation(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker, FqName fqName) {
            kotlinTypeMarker.getClass();
            fqName.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return ((KotlinType) kotlinTypeMarker).getAnnotations().hasAnnotation(fqName);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
            return false;
        }

        public static boolean hasRecursiveBounds(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker) {
            typeParameterMarker.getClass();
            if (!(typeParameterMarker instanceof TypeParameterDescriptor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeParameterMarker);
                sb.append(", ");
                Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeParameterMarker.getClass(), sb));
                return false;
            }
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) typeParameterMarker;
            if (typeConstructorMarker == null ? true : typeConstructorMarker instanceof TypeConstructor) {
                return TypeUtilsKt.hasTypeParameterRecursiveBounds$default(typeParameterDescriptor, (TypeConstructor) typeConstructorMarker, null, 4, null);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeParameterDescriptor);
            sb2.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeParameterDescriptor.getClass(), sb2));
            return false;
        }

        public static boolean identicalArguments(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
            rigidTypeMarker.getClass();
            rigidTypeMarker2.getClass();
            if (!(rigidTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(rigidTypeMarker);
                sb.append(", ");
                Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, rigidTypeMarker.getClass(), sb));
                return false;
            }
            if (rigidTypeMarker2 instanceof SimpleType) {
                return ((SimpleType) rigidTypeMarker).getArguments() == ((SimpleType) rigidTypeMarker2).getArguments();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(rigidTypeMarker2);
            sb2.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, rigidTypeMarker2.getClass(), sb2));
            return false;
        }

        public static KotlinTypeMarker intersectTypes(ClassicTypeSystemContext classicTypeSystemContext, Collection<? extends KotlinTypeMarker> collection) {
            collection.getClass();
            return IntersectionTypeKt.intersectTypes(collection);
        }

        public static boolean isAnyConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) typeConstructorMarker, StandardNames.FqNames.any);
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return false;
        }

        public static boolean isArrayOrNullableArray(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return KotlinBuiltIns.isArray((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
            return false;
        }

        public static boolean isClassTypeConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).mo4153getDeclarationDescriptor() instanceof ClassDescriptor;
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return false;
        }

        public static boolean isCommonFinalClassConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo4153getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo4153getDeclarationDescriptor();
                ClassDescriptor classDescriptor = mo4153getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo4153getDeclarationDescriptor : null;
                return (classDescriptor == null || !ModalityUtilsKt.isFinalClass(classDescriptor) || classDescriptor.getKind() == ClassKind.ENUM_ENTRY || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ")));
            return false;
        }

        public static boolean isDenotable(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).isDenotable();
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return false;
        }

        public static boolean isError(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return KotlinTypeKt.isError((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
            return false;
        }

        public static boolean isInlineClass(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo4153getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo4153getDeclarationDescriptor();
                ClassDescriptor classDescriptor = mo4153getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo4153getDeclarationDescriptor : null;
                return (classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null) instanceof InlineClassRepresentation;
            }
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ")));
            return false;
        }

        public static boolean isIntegerLiteralTypeConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return typeConstructorMarker instanceof IntegerLiteralTypeConstructor;
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return false;
        }

        public static boolean isIntersection(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return typeConstructorMarker instanceof IntersectionTypeConstructor;
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return false;
        }

        public static boolean isK2(ClassicTypeSystemContext classicTypeSystemContext) {
            return false;
        }

        public static boolean isMarkedNullable(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return (kotlinTypeMarker instanceof SimpleType) && ((SimpleType) kotlinTypeMarker).isMarkedNullable();
        }

        public static boolean isNotNullTypeParameter(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return kotlinTypeMarker instanceof NotNullTypeParameter;
        }

        public static boolean isNothingConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) typeConstructorMarker, StandardNames.FqNames.nothing);
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return false;
        }

        public static boolean isNullableType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return TypeUtils.isNullableType((KotlinType) kotlinTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
            return false;
        }

        public static boolean isOldCapturedType(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            return capturedTypeMarker instanceof CapturedType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isPrimitiveType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            simpleTypeMarker.getClass();
            if (simpleTypeMarker instanceof KotlinType) {
                return KotlinBuiltIns.isPrimitiveType((KotlinType) simpleTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, simpleTypeMarker.getClass(), sb));
            return false;
        }

        public static boolean isProjectionNotNull(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).isProjectionNotNull();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, capturedTypeMarker.getClass(), sb));
            return false;
        }

        public static boolean isRawType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof KotlinType) {
                return kotlinTypeMarker instanceof RawType;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isSingleClassifierType(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (!(rigidTypeMarker instanceof SimpleType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(rigidTypeMarker);
                sb.append(", ");
                Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, rigidTypeMarker.getClass(), sb));
                return false;
            }
            if (!KotlinTypeKt.isError((KotlinType) rigidTypeMarker)) {
                SimpleType simpleType = (SimpleType) rigidTypeMarker;
                if (!(simpleType.getConstructor().mo4153getDeclarationDescriptor() instanceof TypeAliasDescriptor)) {
                    if (simpleType.getConstructor().mo4153getDeclarationDescriptor() != null || (rigidTypeMarker instanceof CapturedType) || (rigidTypeMarker instanceof NewCapturedType) || (rigidTypeMarker instanceof DefinitelyNotNullType) || (simpleType.getConstructor() instanceof IntegerLiteralTypeConstructor)) {
                        return true;
                    }
                    SimpleTypeMarker simpleTypeMarker = (SimpleTypeMarker) rigidTypeMarker;
                    if ((simpleTypeMarker instanceof SimpleTypeWithEnhancement) && classicTypeSystemContext.isSingleClassifierType(((SimpleTypeWithEnhancement) simpleTypeMarker).getOrigin())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static boolean isStarProjection(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker typeArgumentMarker) {
            typeArgumentMarker.getClass();
            if (typeArgumentMarker instanceof TypeProjection) {
                return ((TypeProjection) typeArgumentMarker).isStarProjection();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeArgumentMarker.getClass(), sb));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubType(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return TypeUtilsKt.isStubType((KotlinType) rigidTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, rigidTypeMarker.getClass(), sb));
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubTypeForBuilderInference(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return TypeUtilsKt.isStubTypeForBuilderInference((KotlinType) rigidTypeMarker);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, rigidTypeMarker.getClass(), sb));
            return false;
        }

        public static boolean isTypeVariableType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker) {
            kotlinTypeMarker.getClass();
            return (kotlinTypeMarker instanceof UnwrappedType) && (((UnwrappedType) kotlinTypeMarker).getConstructor() instanceof NewTypeVariableConstructor);
        }

        public static boolean isUnderKotlinPackage(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                ClassifierDescriptor mo4153getDeclarationDescriptor = ((TypeConstructor) typeConstructorMarker).mo4153getDeclarationDescriptor();
                return mo4153getDeclarationDescriptor != null && KotlinBuiltIns.isUnderKotlinPackage(mo4153getDeclarationDescriptor);
            }
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ")));
            return false;
        }

        public static SimpleTypeMarker lowerBound(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).getLowerBound();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, flexibleTypeMarker.getClass(), sb));
            return null;
        }

        public static KotlinTypeMarker lowerType(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).getLowerType();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, capturedTypeMarker.getClass(), sb));
            return null;
        }

        public static KotlinTypeMarker makeDefinitelyNotNullOrNotNull(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker, boolean z) {
            UnwrappedType makeDefinitelyNotNullOrNotNull$default;
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof UnwrappedType) {
                makeDefinitelyNotNullOrNotNull$default = SpecialTypesKt.makeDefinitelyNotNullOrNotNull$default((UnwrappedType) kotlinTypeMarker, false, 1, null);
                return makeDefinitelyNotNullOrNotNull$default;
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
            return null;
        }

        public static TypeCheckerState newTypeCheckerState(ClassicTypeSystemContext classicTypeSystemContext, boolean z, boolean z2, boolean z3) {
            return ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(z, z2, classicTypeSystemContext, null, null, 24, null);
        }

        public static SimpleTypeMarker nullableAnyType(ClassicTypeSystemContext classicTypeSystemContext) {
            SimpleType nullableAnyType = classicTypeSystemContext.getBuiltIns().getNullableAnyType();
            nullableAnyType.getClass();
            return nullableAnyType;
        }

        public static SimpleTypeMarker original(ClassicTypeSystemContext classicTypeSystemContext, DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
            definitelyNotNullTypeMarker.getClass();
            if (definitelyNotNullTypeMarker instanceof DefinitelyNotNullType) {
                return ((DefinitelyNotNullType) definitelyNotNullTypeMarker).getOriginal();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(definitelyNotNullTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, definitelyNotNullTypeMarker.getClass(), sb));
            return null;
        }

        public static int parametersCount(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                return ((TypeConstructor) typeConstructorMarker).getParameters().size();
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return 0;
        }

        public static Collection<KotlinTypeMarker> possibleIntegerTypes(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            TypeConstructorMarker typeConstructor = classicTypeSystemContext.typeConstructor(rigidTypeMarker);
            if (typeConstructor instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructor).getPossibleTypes();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, rigidTypeMarker.getClass(), sb));
            return null;
        }

        public static TypeArgumentMarker projection(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
            capturedTypeConstructorMarker.getClass();
            if (capturedTypeConstructorMarker instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) capturedTypeConstructorMarker).getProjection();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeConstructorMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, capturedTypeConstructorMarker.getClass(), sb));
            return null;
        }

        public static KotlinTypeMarker safeSubstitute(ClassicTypeSystemContext classicTypeSystemContext, TypeSubstitutorMarker typeSubstitutorMarker, KotlinTypeMarker kotlinTypeMarker) {
            typeSubstitutorMarker.getClass();
            kotlinTypeMarker.getClass();
            if (!(kotlinTypeMarker instanceof UnwrappedType)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(kotlinTypeMarker);
                sb.append(", ");
                Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, kotlinTypeMarker.getClass(), sb));
                return null;
            }
            if (typeSubstitutorMarker instanceof TypeSubstitutor) {
                KotlinType safeSubstitute = ((TypeSubstitutor) typeSubstitutorMarker).safeSubstitute((KotlinType) kotlinTypeMarker, Variance.INVARIANT);
                safeSubstitute.getClass();
                return safeSubstitute;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeSubstitutorMarker);
            sb2.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeSubstitutorMarker.getClass(), sb2));
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(final ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                final TypeSubstitutor buildSubstitutor = TypeConstructorSubstitution.Companion.create((KotlinType) rigidTypeMarker).buildSubstitutor();
                return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    /* renamed from: transformType */
                    public SimpleTypeMarker mo4155transformType(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                        typeCheckerState.getClass();
                        kotlinTypeMarker.getClass();
                        ClassicTypeSystemContext classicTypeSystemContext2 = ClassicTypeSystemContext.this;
                        Object lowerBoundIfFlexible = classicTypeSystemContext2.lowerBoundIfFlexible(kotlinTypeMarker);
                        lowerBoundIfFlexible.getClass();
                        Variance variance = Variance.INVARIANT;
                        KotlinType safeSubstitute = buildSubstitutor.safeSubstitute((KotlinType) lowerBoundIfFlexible, variance);
                        safeSubstitute.getClass();
                        SimpleTypeMarker asRigidType = classicTypeSystemContext2.asRigidType((KotlinTypeMarker) safeSubstitute);
                        asRigidType.getClass();
                        return asRigidType;
                    }
                };
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, rigidTypeMarker.getClass(), sb));
            return null;
        }

        public static Collection<KotlinTypeMarker> supertypes(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker typeConstructorMarker) {
            typeConstructorMarker.getClass();
            if (typeConstructorMarker instanceof TypeConstructor) {
                Collection<KotlinType> supertypes = ((TypeConstructor) typeConstructorMarker).getSupertypes();
                supertypes.getClass();
                return supertypes;
            }
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("ClassicTypeSystemContext couldn't handle: ", typeConstructorMarker, ", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeConstructorMarker.getClass(), m));
            return null;
        }

        public static TypeConstructorMarker typeConstructor(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return ((SimpleType) rigidTypeMarker).getConstructor();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, rigidTypeMarker.getClass(), sb));
            return null;
        }

        public static TypeSubstitutorMarker typeSubstitutorForUnderlyingType(ClassicTypeSystemContext classicTypeSystemContext, Map<TypeConstructorMarker, ? extends KotlinTypeMarker> map) {
            map.getClass();
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<TypeConstructorMarker, ? extends KotlinTypeMarker> entry : map.entrySet()) {
                TypeConstructorMarker key = entry.getKey();
                KotlinTypeMarker value = entry.getValue();
                key.getClass();
                value.getClass();
                arrayList.add(new Pair((TypeConstructor) key, TypeUtilsKt.asTypeProjection((KotlinType) value)));
            }
            TypeSubstitutor create = TypeSubstitutor.create((Map<TypeConstructor, TypeProjection>) MapsKt__MapsKt.toMap(arrayList));
            create.getClass();
            return create;
        }

        public static SimpleTypeMarker upperBound(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker flexibleTypeMarker) {
            flexibleTypeMarker.getClass();
            if (flexibleTypeMarker instanceof FlexibleType) {
                return ((FlexibleType) flexibleTypeMarker).getUpperBound();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, flexibleTypeMarker.getClass(), sb));
            return null;
        }

        public static KotlinTypeMarker withNullability(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker kotlinTypeMarker, boolean z) {
            kotlinTypeMarker.getClass();
            if (kotlinTypeMarker instanceof RigidTypeMarker) {
                return classicTypeSystemContext.withNullability((RigidTypeMarker) kotlinTypeMarker, z);
            }
            if (kotlinTypeMarker instanceof FlexibleTypeMarker) {
                FlexibleTypeMarker flexibleTypeMarker = (FlexibleTypeMarker) kotlinTypeMarker;
                return classicTypeSystemContext.createFlexibleType(classicTypeSystemContext.withNullability((RigidTypeMarker) classicTypeSystemContext.lowerBound(flexibleTypeMarker), z), classicTypeSystemContext.withNullability((RigidTypeMarker) classicTypeSystemContext.upperBound(flexibleTypeMarker), z));
            }
            a$$ExternalSyntheticBUOutline0.m$1("sealed");
            return null;
        }

        public static CapturedTypeConstructorMarker typeConstructor(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker capturedTypeMarker) {
            capturedTypeMarker.getClass();
            if (capturedTypeMarker instanceof NewCapturedType) {
                return ((NewCapturedType) capturedTypeMarker).getConstructor();
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, capturedTypeMarker.getClass(), sb));
            return null;
        }

        public static SimpleTypeMarker withNullability(ClassicTypeSystemContext classicTypeSystemContext, RigidTypeMarker rigidTypeMarker, boolean z) {
            rigidTypeMarker.getClass();
            if (rigidTypeMarker instanceof SimpleType) {
                return ((SimpleType) rigidTypeMarker).makeNullableAsSpecified(z);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, rigidTypeMarker.getClass(), sb));
            return null;
        }

        public static TypeVariance getVariance(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker typeParameterMarker) {
            typeParameterMarker.getClass();
            if (typeParameterMarker instanceof TypeParameterDescriptor) {
                Variance variance = ((TypeParameterDescriptor) typeParameterMarker).getVariance();
                variance.getClass();
                return TypeSystemContextKt.convertVariance(variance);
            }
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            sb.append(", ");
            Path$$ExternalSyntheticBUOutline0.m$1((Object) SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, typeParameterMarker.getClass(), sb));
            return null;
        }
    }
}
