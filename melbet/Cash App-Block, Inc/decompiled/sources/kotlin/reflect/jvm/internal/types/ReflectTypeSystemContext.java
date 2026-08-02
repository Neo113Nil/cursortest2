package kotlin.reflect.jvm.internal.types;

import com.nimbusds.jose.util.X509CertChainUtils;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.UnsignedKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.ErrorTypeParameter;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KTypeParameterImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.ClassKind;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
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
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class ReflectTypeSystemContext implements TypeSystemContext {
    public static final ReflectTypeSystemContext INSTANCE = new ReflectTypeSystemContext();

    public static void shouldNotBeCalled(Object obj) {
        throw new KotlinReflectionInternalError(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("This method should not be called on ", " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue", obj));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean areEqualTypeConstructors(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2) {
        typeConstructorMarker.getClass();
        typeConstructorMarker2.getClass();
        return Intrinsics.areEqual(typeConstructorMarker, typeConstructorMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final int argumentsCount(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return ((KType) kotlinTypeMarker).getArguments().size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentListMarker asArgumentList(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        return (TypeArgumentListMarker) rigidTypeMarker;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final CapturedTypeMarker asCapturedType(SimpleTypeMarker simpleTypeMarker) {
        simpleTypeMarker.getClass();
        if (simpleTypeMarker instanceof CapturedTypeMarker) {
            return (CapturedTypeMarker) simpleTypeMarker;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final CapturedTypeMarker asCapturedTypeUnwrappingDnn(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        return asCapturedType(originalIfDefinitelyNotNullable(rigidTypeMarker));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final DefinitelyNotNullTypeMarker asDefinitelyNotNullType(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        if ((rigidTypeMarker instanceof AbstractKType) && ((AbstractKType) rigidTypeMarker).isDefinitelyNotNullType()) {
            return (DefinitelyNotNullTypeMarker) rigidTypeMarker;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final DynamicTypeMarker asDynamicType(FlexibleTypeMarker flexibleTypeMarker) {
        flexibleTypeMarker.getClass();
        shouldNotBeCalled(flexibleTypeMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final FlexibleTypeMarker asFlexibleType(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        if (!(kotlinTypeMarker instanceof AbstractKType) || ((AbstractKType) kotlinTypeMarker).lowerBoundIfFlexible() == null) {
            return null;
        }
        return (FlexibleTypeMarker) kotlinTypeMarker;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final RigidTypeMarker asRigidType(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        if (asFlexibleType(kotlinTypeMarker) != null) {
            return null;
        }
        return (RigidTypeMarker) kotlinTypeMarker;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentMarker asTypeArgument(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        shouldNotBeCalled(kotlinTypeMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final RigidTypeMarker captureFromArguments(RigidTypeMarker rigidTypeMarker, CaptureStatus captureStatus) {
        int i;
        rigidTypeMarker.getClass();
        captureStatus.getClass();
        KType kType = (KType) rigidTypeMarker;
        KClassifier classifier = kType.getClassifier();
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        if (kClass != null) {
            List arguments = kType.getArguments();
            List list = arguments;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((KTypeProjection) it.next()).variance != KVariance.INVARIANT) {
                        List allTypeParameters = X509CertChainUtils.allTypeParameters(kClass);
                        if (allTypeParameters.size() == arguments.size()) {
                            List list2 = arguments;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                KTypeProjection kTypeProjection = (KTypeProjection) it2.next();
                                KVariance kVariance = kTypeProjection.variance;
                                if (kVariance != KVariance.INVARIANT) {
                                    KType kType2 = kTypeProjection.f1521type;
                                    if (kVariance != KVariance.IN) {
                                        kType2 = null;
                                    }
                                    KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                                    CapturedKType capturedKType = new CapturedKType(kType2, new CapturedKTypeConstructor(kTypeProjection), false);
                                    companion.getClass();
                                    kTypeProjection = KTypeProjection.Companion.invariant(capturedKType);
                                }
                                arrayList.add(kTypeProjection);
                            }
                            KTypeSubstitutor kTypeSubstitutor = KTypeSubstitutor.EMPTY;
                            KTypeSubstitutor kTypeSubstitutor2 = new KTypeSubstitutor(MapsKt__MapsKt.toMap(CollectionsKt.zip(X509CertChainUtils.allTypeParameters(kClass), arrayList)));
                            int size = arguments.size();
                            for (i = 0; i < size; i++) {
                                KTypeProjection kTypeProjection2 = (KTypeProjection) arguments.get(i);
                                if (kTypeProjection2.variance != KVariance.INVARIANT) {
                                    List upperBounds = ((KTypeParameterBase) allTypeParameters.get(i)).getUpperBounds();
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it3 = upperBounds.iterator();
                                    while (it3.hasNext()) {
                                        KType kType3 = kTypeSubstitutor2.substitute((KType) it3.next(), KVariance.INVARIANT).f1521type;
                                        kType3.getClass();
                                        arrayList2.add(kType3);
                                    }
                                    if (kTypeProjection2.variance == KVariance.OUT) {
                                        KType kType4 = kTypeProjection2.f1521type;
                                        kType4.getClass();
                                        arrayList2.add(kType4);
                                    }
                                    KType kType5 = ((KTypeProjection) arrayList.get(i)).f1521type;
                                    kType5.getClass();
                                    CapturedKTypeConstructor capturedKTypeConstructor = ((CapturedKType) kType5).typeConstructor;
                                    capturedKTypeConstructor.getClass();
                                    capturedKTypeConstructor.supertypes = arrayList2;
                                }
                            }
                            boolean isMarkedNullable = kType.isMarkedNullable();
                            List annotations = kType.getAnnotations();
                            boolean z = kType instanceof AbstractKType;
                            AbstractKType abstractKType = z ? (AbstractKType) kType : null;
                            KType abbreviation = abstractKType != null ? abstractKType.getAbbreviation() : null;
                            AbstractKType abstractKType2 = z ? (AbstractKType) kType : null;
                            return new SimpleKType(kClass, arrayList, isMarkedNullable, annotations, abbreviation, false, false, false, abstractKType2 != null ? abstractKType2.getMutableCollectionClass() : null, null);
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final CaptureStatus captureStatus(CapturedTypeMarker capturedTypeMarker) {
        capturedTypeMarker.getClass();
        return CaptureStatus.FOR_SUBTYPING;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final List fastCorrespondingSupertypes(RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        rigidTypeMarker.getClass();
        typeConstructorMarker.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentMarker get(TypeArgumentListMarker typeArgumentListMarker, int i) {
        typeArgumentListMarker.getClass();
        if (typeArgumentListMarker instanceof SimpleTypeMarker) {
            return getArgument((KotlinTypeMarker) typeArgumentListMarker, i);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            TypeArgumentMarker typeArgumentMarker = ((ArgumentList) typeArgumentListMarker).get(i);
            typeArgumentMarker.getClass();
            return typeArgumentMarker;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(typeArgumentListMarker);
        f$$ExternalSyntheticLambda0.m(sb, (Object) Reflection.factory.getOrCreateKotlinClass(typeArgumentListMarker.getClass()));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentMarker getArgument(KotlinTypeMarker kotlinTypeMarker, int i) {
        kotlinTypeMarker.getClass();
        return new KTypeProjectionAsTypeArgumentMarker((KTypeProjection) ((KType) kotlinTypeMarker).getArguments().get(i));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentMarker getArgumentOrNull(RigidTypeMarker rigidTypeMarker, int i) {
        rigidTypeMarker.getClass();
        if (i < 0 || i >= argumentsCount(rigidTypeMarker)) {
            return null;
        }
        return getArgument(rigidTypeMarker, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final List getArguments(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        shouldNotBeCalled(kotlinTypeMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeParameterMarker getParameter(TypeConstructorMarker typeConstructorMarker, int i) {
        typeConstructorMarker.getClass();
        Object obj = X509CertChainUtils.allTypeParameters((KClass) typeConstructorMarker).get(i);
        obj.getClass();
        return (KTypeParameterImpl) obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final List getParameters(TypeConstructorMarker typeConstructorMarker) {
        typeConstructorMarker.getClass();
        shouldNotBeCalled(typeConstructorMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final KotlinTypeMarker getType(TypeArgumentMarker typeArgumentMarker) {
        typeArgumentMarker.getClass();
        return (KotlinTypeMarker) ((KTypeProjectionAsTypeArgumentMarker) typeArgumentMarker).value.f1521type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeConstructorMarker getTypeConstructor(TypeParameterMarker typeParameterMarker) {
        typeParameterMarker.getClass();
        shouldNotBeCalled(typeParameterMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeParameterMarker getTypeParameter(TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
        typeVariableTypeConstructorMarker.getClass();
        shouldNotBeCalled(typeVariableTypeConstructorMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeParameterMarker getTypeParameterClassifier(TypeConstructorMarker typeConstructorMarker) {
        typeConstructorMarker.getClass();
        shouldNotBeCalled(typeConstructorMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final List getUpperBounds(TypeParameterMarker typeParameterMarker) {
        typeParameterMarker.getClass();
        shouldNotBeCalled(typeParameterMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeVariance getVariance(TypeArgumentMarker typeArgumentMarker) {
        TypeVariance typeVariance;
        typeArgumentMarker.getClass();
        KVariance kVariance = ((KTypeProjectionAsTypeArgumentMarker) typeArgumentMarker).value.variance;
        if (kVariance != null) {
            int ordinal = kVariance.ordinal();
            if (ordinal == 0) {
                typeVariance = TypeVariance.INV;
            } else if (ordinal == 1) {
                typeVariance = TypeVariance.IN;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                typeVariance = TypeVariance.OUT;
            }
            if (typeVariance != null) {
                return typeVariance;
            }
        }
        return TypeVariance.OUT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean hasFlexibleNullability(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return ((KType) lowerBoundIfFlexible(kotlinTypeMarker)).isMarkedNullable() != ((KType) upperBoundIfFlexible(kotlinTypeMarker)).isMarkedNullable();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean hasRecursiveBounds(TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker) {
        typeParameterMarker.getClass();
        shouldNotBeCalled(typeParameterMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
    public final boolean identicalArguments(RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        rigidTypeMarker.getClass();
        rigidTypeMarker2.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final KotlinTypeMarker intersectTypes(Collection collection) {
        collection.getClass();
        shouldNotBeCalled(this);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isAnyConstructor(TypeConstructorMarker typeConstructorMarker) {
        typeConstructorMarker.getClass();
        return typeConstructorMarker.equals(Reflection.factory.getOrCreateKotlinClass(Object.class));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isCapturedType(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        RigidTypeMarker asRigidType = asRigidType(kotlinTypeMarker);
        return (asRigidType != null ? asCapturedType(originalIfDefinitelyNotNullable(asRigidType)) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isClassType(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        TypeConstructorMarker typeConstructor = typeConstructor(rigidTypeMarker);
        typeConstructor.getClass();
        return typeConstructor instanceof KClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isClassTypeConstructor(TypeConstructorMarker typeConstructorMarker) {
        typeConstructorMarker.getClass();
        return typeConstructorMarker instanceof KClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isCommonFinalClassConstructor(TypeConstructorMarker typeConstructorMarker) {
        Modality modality;
        typeConstructorMarker.getClass();
        if (!(typeConstructorMarker instanceof KClassImpl)) {
            return false;
        }
        KClassImpl kClassImpl = (KClassImpl) typeConstructorMarker;
        Class<?> cls = kClassImpl.jClass;
        KmClass kmClass = kClassImpl.getKmClass();
        if (kmClass == null || (modality = Attributes.getModality(kmClass)) == null) {
            modality = (cls.isAnnotation() || cls.isEnum()) ? Modality.FINAL : Intrinsics.areEqual(Java16SealedRecordLoader.INSTANCE.loadIsSealed(cls), Boolean.TRUE) ? Modality.SEALED : Modifier.isAbstract(cls.getModifiers()) ? Modality.ABSTRACT : !Modifier.isFinal(cls.getModifiers()) ? Modality.OPEN : Modality.FINAL;
        }
        return (modality != Modality.FINAL || kClassImpl.getClassKind$kotlin_reflection() == ClassKind.ENUM_CLASS || kClassImpl.getClassKind$kotlin_reflection() == ClassKind.ENUM_ENTRY || kClassImpl.getClassKind$kotlin_reflection() == ClassKind.ANNOTATION_CLASS) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isDefinitelyNotNullType(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        RigidTypeMarker asRigidType = asRigidType(kotlinTypeMarker);
        return (asRigidType != null ? asDefinitelyNotNullType(asRigidType) : null) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isDenotable(TypeConstructorMarker typeConstructorMarker) {
        typeConstructorMarker.getClass();
        return !(typeConstructorMarker instanceof CapturedKTypeConstructor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isDynamic(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isError(KotlinTypeMarker kotlinTypeMarker) {
        KotlinType kotlinType;
        kotlinTypeMarker.getClass();
        if (!(kotlinTypeMarker instanceof AbstractKType) || !(((AbstractKType) kotlinTypeMarker).getClassifier() instanceof ErrorTypeParameter)) {
            DescriptorKType descriptorKType = kotlinTypeMarker instanceof DescriptorKType ? (DescriptorKType) kotlinTypeMarker : null;
            if (descriptorKType == null || (kotlinType = descriptorKType.f1540type) == null || !KotlinTypeKt.isError(kotlinType)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isFlexible(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return asFlexibleType(kotlinTypeMarker) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isFlexibleWithDifferentTypeConstructors(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return !Intrinsics.areEqual(typeConstructor(lowerBoundIfFlexible(kotlinTypeMarker)), typeConstructor(upperBoundIfFlexible(kotlinTypeMarker)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isIntegerLiteralType(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        typeConstructor(rigidTypeMarker).getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isIntegerLiteralTypeConstructor(TypeConstructorMarker typeConstructorMarker) {
        typeConstructorMarker.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isIntersection(TypeConstructorMarker typeConstructorMarker) {
        typeConstructorMarker.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isMarkedNullable(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return ((KType) kotlinTypeMarker).isMarkedNullable();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isNotNullTypeParameter(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isNothing(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        if (!isNothingConstructor(typeConstructor(kotlinTypeMarker))) {
            return false;
        }
        shouldNotBeCalled(kotlinTypeMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isNothingConstructor(TypeConstructorMarker typeConstructorMarker) {
        typeConstructorMarker.getClass();
        return Intrinsics.areEqual(typeConstructorMarker, NothingKClass.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isNullableType(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        shouldNotBeCalled(kotlinTypeMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isOldCapturedType(CapturedTypeMarker capturedTypeMarker) {
        capturedTypeMarker.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isPrimitiveType(SimpleTypeMarker simpleTypeMarker) {
        simpleTypeMarker.getClass();
        shouldNotBeCalled(simpleTypeMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isProjectionNotNull(CapturedTypeMarker capturedTypeMarker) {
        capturedTypeMarker.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isRawType(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        shouldNotBeCalled(kotlinTypeMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isSingleClassifierType(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        shouldNotBeCalled(rigidTypeMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isStarProjection(TypeArgumentMarker typeArgumentMarker) {
        typeArgumentMarker.getClass();
        KTypeProjection kTypeProjection = ((KTypeProjectionAsTypeArgumentMarker) typeArgumentMarker).value;
        KTypeProjection.INSTANCE.getClass();
        return Intrinsics.areEqual(kTypeProjection, KTypeProjection.star);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isStubType(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isStubTypeForBuilderInference(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isTypeVariableType(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        shouldNotBeCalled(kotlinTypeMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final RigidTypeMarker lowerBound(FlexibleTypeMarker flexibleTypeMarker) {
        flexibleTypeMarker.getClass();
        AbstractKType lowerBoundIfFlexible = ((AbstractKType) flexibleTypeMarker).lowerBoundIfFlexible();
        lowerBoundIfFlexible.getClass();
        return lowerBoundIfFlexible;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final RigidTypeMarker lowerBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        FlexibleTypeMarker asFlexibleType = asFlexibleType(kotlinTypeMarker);
        if (asFlexibleType != null) {
            return lowerBound(asFlexibleType);
        }
        RigidTypeMarker asRigidType = asRigidType(kotlinTypeMarker);
        asRigidType.getClass();
        return asRigidType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final KotlinTypeMarker lowerType(CapturedTypeMarker capturedTypeMarker) {
        capturedTypeMarker.getClass();
        return (KotlinTypeMarker) ((CapturedKType) capturedTypeMarker).lowerType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final KotlinTypeMarker makeDefinitelyNotNullOrNotNull(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        makeDefinitelyNotNullOrNotNull(kotlinTypeMarker, false);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleTypeMarker original(DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
        definitelyNotNullTypeMarker.getClass();
        shouldNotBeCalled(definitelyNotNullTypeMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final SimpleTypeMarker originalIfDefinitelyNotNullable(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        DefinitelyNotNullTypeMarker asDefinitelyNotNullType = asDefinitelyNotNullType(rigidTypeMarker);
        if (asDefinitelyNotNullType == null) {
            return (SimpleTypeMarker) rigidTypeMarker;
        }
        shouldNotBeCalled(asDefinitelyNotNullType);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final int parametersCount(TypeConstructorMarker typeConstructorMarker) {
        typeConstructorMarker.getClass();
        if (typeConstructorMarker instanceof KClass) {
            return X509CertChainUtils.allTypeParameters((KClass) typeConstructorMarker).size();
        }
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final Collection possibleIntegerTypes(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        shouldNotBeCalled(rigidTypeMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeArgumentMarker projection(CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
        capturedTypeConstructorMarker.getClass();
        return new KTypeProjectionAsTypeArgumentMarker(((CapturedKTypeConstructor) capturedTypeConstructorMarker).projection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final KotlinTypeMarker safeSubstitute(TypeSubstitutorMarker typeSubstitutorMarker, KotlinTypeMarker kotlinTypeMarker) {
        typeSubstitutorMarker.getClass();
        kotlinTypeMarker.getClass();
        shouldNotBeCalled(typeSubstitutorMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final int size(TypeArgumentListMarker typeArgumentListMarker) {
        typeArgumentListMarker.getClass();
        if (typeArgumentListMarker instanceof RigidTypeMarker) {
            return argumentsCount((KotlinTypeMarker) typeArgumentListMarker);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            return ((ArgumentList) typeArgumentListMarker).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(typeArgumentListMarker);
        f$$ExternalSyntheticLambda0.m(sb, (Object) Reflection.factory.getOrCreateKotlinClass(typeArgumentListMarker.getClass()));
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        KTypeSubstitutor kTypeSubstitutor = KTypeSubstitutor.EMPTY;
        final KTypeSubstitutor create = UnsignedKt.create((KType) rigidTypeMarker);
        return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.types.ReflectTypeSystemContext$substitutionSupertypePolicy$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* renamed from: transformType */
            public final RigidTypeMarker mo4155transformType(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                typeCheckerState.getClass();
                kotlinTypeMarker.getClass();
                KType kType = (KType) ReflectTypeSystemContext.INSTANCE.lowerBoundIfFlexible(kotlinTypeMarker);
                KTypeSubstitutor kTypeSubstitutor2 = KTypeSubstitutor.EMPTY;
                KType kType2 = KTypeSubstitutor.this.substitute(kType, KVariance.INVARIANT).f1521type;
                kType2.getClass();
                return (AbstractKType) kType2;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final Collection supertypes(TypeConstructorMarker typeConstructorMarker) {
        typeConstructorMarker.getClass();
        if (typeConstructorMarker instanceof KClass) {
            List<KType> supertypes = ((KClass) typeConstructorMarker).getSupertypes();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(supertypes, 10));
            for (KType kType : supertypes) {
                kType.getClass();
                arrayList.add((KotlinTypeMarker) kType);
            }
            return arrayList;
        }
        if (typeConstructorMarker instanceof KTypeParameterBase) {
            List<KType> upperBounds = ((KTypeParameterBase) typeConstructorMarker).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(upperBounds, 10));
            for (KType kType2 : upperBounds) {
                kType2.getClass();
                arrayList2.add((KotlinTypeMarker) kType2);
            }
            return arrayList2;
        }
        if (!(typeConstructorMarker instanceof CapturedKTypeConstructor)) {
            StringBuilder m = SizeMode$EnumUnboxingLocalUtility.m("Unsupported type constructor: ", typeConstructorMarker, " (");
            m.append(typeConstructorMarker.getClass().getName());
            m.append(')');
            throw new IllegalStateException(m.toString().toString());
        }
        ArrayList<KType> arrayList3 = ((CapturedKTypeConstructor) typeConstructorMarker).supertypes;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("supertypes");
            throw null;
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        for (KType kType3 : arrayList3) {
            kType3.getClass();
            arrayList4.add((KotlinTypeMarker) kType3);
        }
        return arrayList4;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeConstructorMarker typeConstructor(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        if (rigidTypeMarker instanceof CapturedKType) {
            return ((CapturedKType) rigidTypeMarker).typeConstructor;
        }
        AbstractKType abstractKType = (AbstractKType) rigidTypeMarker;
        if (abstractKType.isNothingType()) {
            return NothingKClass.INSTANCE;
        }
        KClassifier classifier = abstractKType.getClassifier();
        KClassImpl kClassImpl = classifier instanceof KClassImpl ? (KClassImpl) classifier : null;
        if (kClassImpl != null) {
            Class jClass = kClassImpl.getJClass();
            jClass.getClass();
            Class<?> componentType = jClass.getComponentType();
            if (componentType != null && !componentType.isPrimitive()) {
                return (TypeConstructorMarker) Reflection.factory.getOrCreateKotlinClass(Object[].class);
            }
        }
        KClassifier mutableCollectionClass = abstractKType.getMutableCollectionClass();
        if (mutableCollectionClass == null) {
            mutableCollectionClass = abstractKType.getClassifier();
        }
        mutableCollectionClass.getClass();
        return (TypeConstructorMarker) mutableCollectionClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final RigidTypeMarker upperBound(FlexibleTypeMarker flexibleTypeMarker) {
        flexibleTypeMarker.getClass();
        AbstractKType upperBoundIfFlexible = ((AbstractKType) flexibleTypeMarker).upperBoundIfFlexible();
        upperBoundIfFlexible.getClass();
        return upperBoundIfFlexible;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final RigidTypeMarker upperBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        FlexibleTypeMarker asFlexibleType = asFlexibleType(kotlinTypeMarker);
        if (asFlexibleType != null) {
            return upperBound(asFlexibleType);
        }
        RigidTypeMarker asRigidType = asRigidType(kotlinTypeMarker);
        asRigidType.getClass();
        return asRigidType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final RigidTypeMarker withNullability(RigidTypeMarker rigidTypeMarker, boolean z) {
        rigidTypeMarker.getClass();
        return ((AbstractKType) rigidTypeMarker).makeNullableAsSpecified(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final KotlinTypeMarker makeDefinitelyNotNullOrNotNull(KotlinTypeMarker kotlinTypeMarker, boolean z) {
        kotlinTypeMarker.getClass();
        shouldNotBeCalled(kotlinTypeMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final KotlinTypeMarker withNullability(KotlinTypeMarker kotlinTypeMarker, boolean z) {
        kotlinTypeMarker.getClass();
        shouldNotBeCalled(kotlinTypeMarker);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final boolean isDefinitelyNotNullType(RigidTypeMarker rigidTypeMarker) {
        rigidTypeMarker.getClass();
        return asDefinitelyNotNullType(rigidTypeMarker) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeVariance getVariance(TypeParameterMarker typeParameterMarker) {
        typeParameterMarker.getClass();
        int ordinal = ((KTypeParameterImpl) ((KTypeParameterBase) typeParameterMarker)).variance.ordinal();
        if (ordinal == 0) {
            return TypeVariance.INV;
        }
        if (ordinal == 1) {
            return TypeVariance.IN;
        }
        if (ordinal == 2) {
            return TypeVariance.OUT;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final TypeConstructorMarker typeConstructor(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        RigidTypeMarker asRigidType = asRigidType(kotlinTypeMarker);
        if (asRigidType == null) {
            asRigidType = lowerBoundIfFlexible(kotlinTypeMarker);
        }
        return typeConstructor(asRigidType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public final CapturedTypeConstructorMarker typeConstructor(CapturedTypeMarker capturedTypeMarker) {
        capturedTypeMarker.getClass();
        return ((CapturedKType) capturedTypeMarker).typeConstructor;
    }
}
