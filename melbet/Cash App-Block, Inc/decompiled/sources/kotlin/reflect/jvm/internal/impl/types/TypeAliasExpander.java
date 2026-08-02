package kotlin.reflect.jvm.internal.impl.types;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes9.dex */
public final class TypeAliasExpander {
    public static final Companion Companion = new Companion(null);
    public final TypeAliasExpansionReportStrategy reportStrategy;
    public final boolean shouldCheckBounds;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final void access$assertRecursionDepth(Companion companion, int i, TypeAliasDescriptor typeAliasDescriptor) {
            companion.getClass();
            if (i <= 100) {
                return;
            }
            OptionalProvider$$ExternalSyntheticLambda0.m$2(typeAliasDescriptor.getName(), "Too deep recursion while expanding type alias ");
        }
    }

    static {
        new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false);
    }

    public TypeAliasExpander(TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy, boolean z) {
        typeAliasExpansionReportStrategy.getClass();
        this.reportStrategy = typeAliasExpansionReportStrategy;
        this.shouldCheckBounds = z;
    }

    public final void checkRepeatedAnnotations(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getFqName());
        }
        for (AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet.contains(annotationDescriptor.getFqName())) {
                this.reportStrategy.repeatedAnnotation(annotationDescriptor);
            }
        }
    }

    public final SimpleType expand(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes) {
        typeAliasExpansion.getClass();
        typeAttributes.getClass();
        return expandRecursively(typeAliasExpansion, typeAttributes, false, 0, true);
    }

    public final SimpleType expandRecursively(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z, int i, boolean z2) {
        TypeProjection expandTypeProjection = expandTypeProjection(new TypeProjectionImpl(Variance.INVARIANT, typeAliasExpansion.getDescriptor().getUnderlyingType()), typeAliasExpansion, null, i);
        KotlinType type2 = expandTypeProjection.getType();
        type2.getClass();
        SimpleType asSimpleType = TypeSubstitutionKt.asSimpleType(type2);
        if (KotlinTypeKt.isError(asSimpleType)) {
            return asSimpleType;
        }
        expandTypeProjection.getProjectionKind();
        checkRepeatedAnnotations(asSimpleType.getAnnotations(), AnnotationsTypeAttributeKt.getAnnotations(typeAttributes));
        if (!KotlinTypeKt.isError(asSimpleType)) {
            asSimpleType = TypeSubstitutionKt.replace$default(asSimpleType, null, KotlinTypeKt.isError(asSimpleType) ? asSimpleType.getAttributes() : typeAttributes.add(asSimpleType.getAttributes()), 1, null);
        }
        SimpleType makeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(asSimpleType, z);
        makeNullableIfNeeded.getClass();
        if (!z2) {
            return makeNullableIfNeeded;
        }
        TypeConstructor typeConstructor = typeAliasExpansion.getDescriptor().getTypeConstructor();
        typeConstructor.getClass();
        return SpecialTypesKt.withAbbreviation(makeNullableIfNeeded, KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, typeAliasExpansion.getArguments(), z, MemberScope.Empty.INSTANCE));
    }

    public final TypeProjection expandTypeProjection(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i) {
        Variance variance;
        KotlinType kotlinType;
        Variance variance2;
        Variance variance3;
        Companion.access$assertRecursionDepth(Companion, i, typeAliasExpansion.getDescriptor());
        if (typeProjection.isStarProjection()) {
            typeParameterDescriptor.getClass();
            TypeProjection makeStarProjection = TypeUtils.makeStarProjection(typeParameterDescriptor);
            makeStarProjection.getClass();
            return makeStarProjection;
        }
        KotlinType type2 = typeProjection.getType();
        type2.getClass();
        TypeProjection replacement = typeAliasExpansion.getReplacement(type2.getConstructor());
        TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy = this.reportStrategy;
        if (replacement != null) {
            if (replacement.isStarProjection()) {
                typeParameterDescriptor.getClass();
                TypeProjection makeStarProjection2 = TypeUtils.makeStarProjection(typeParameterDescriptor);
                makeStarProjection2.getClass();
                return makeStarProjection2;
            }
            UnwrappedType unwrap2 = replacement.getType().unwrap();
            Variance projectionKind = replacement.getProjectionKind();
            projectionKind.getClass();
            Variance projectionKind2 = typeProjection.getProjectionKind();
            projectionKind2.getClass();
            if (projectionKind2 != projectionKind && projectionKind2 != (variance3 = Variance.INVARIANT)) {
                if (projectionKind == variance3) {
                    projectionKind = projectionKind2;
                } else {
                    typeAliasExpansionReportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrap2);
                }
            }
            if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null) {
                variance = Variance.INVARIANT;
            }
            if (variance != projectionKind && variance != (variance2 = Variance.INVARIANT)) {
                if (projectionKind == variance2) {
                    projectionKind = variance2;
                } else {
                    typeAliasExpansionReportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrap2);
                }
            }
            checkRepeatedAnnotations(type2.getAnnotations(), unwrap2.getAnnotations());
            if (unwrap2 instanceof DynamicType) {
                DynamicType dynamicType = (DynamicType) unwrap2;
                kotlinType = dynamicType.replaceAttributes(KotlinTypeKt.isError(dynamicType) ? dynamicType.getAttributes() : type2.getAttributes().add(dynamicType.getAttributes()));
            } else {
                SimpleType makeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(TypeSubstitutionKt.asSimpleType(unwrap2), type2.isMarkedNullable());
                makeNullableIfNeeded.getClass();
                TypeAttributes attributes = type2.getAttributes();
                boolean isError = KotlinTypeKt.isError(makeNullableIfNeeded);
                kotlinType = makeNullableIfNeeded;
                if (!isError) {
                    kotlinType = TypeSubstitutionKt.replace$default(makeNullableIfNeeded, null, KotlinTypeKt.isError(makeNullableIfNeeded) ? makeNullableIfNeeded.getAttributes() : attributes.add(makeNullableIfNeeded.getAttributes()), 1, null);
                }
            }
            return new TypeProjectionImpl(projectionKind, kotlinType);
        }
        UnwrappedType unwrap3 = typeProjection.getType().unwrap();
        if (!DynamicTypesKt.isDynamic(unwrap3)) {
            SimpleType asSimpleType = TypeSubstitutionKt.asSimpleType(unwrap3);
            if (!KotlinTypeKt.isError(asSimpleType) && TypeUtilsKt.requiresTypeAliasExpansion(asSimpleType)) {
                TypeConstructor constructor = asSimpleType.getConstructor();
                ClassifierDescriptor mo4153getDeclarationDescriptor = constructor.mo4153getDeclarationDescriptor();
                constructor.getParameters().size();
                asSimpleType.getArguments().size();
                if (!(mo4153getDeclarationDescriptor instanceof TypeParameterDescriptor)) {
                    int i2 = 0;
                    if (mo4153getDeclarationDescriptor instanceof TypeAliasDescriptor) {
                        TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) mo4153getDeclarationDescriptor;
                        if (typeAliasExpansion.isRecursion(typeAliasDescriptor)) {
                            typeAliasExpansionReportStrategy.recursiveTypeAlias(typeAliasDescriptor);
                            Variance variance4 = Variance.INVARIANT;
                            ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                            String name = typeAliasDescriptor.getName().toString();
                            name.getClass();
                            return new TypeProjectionImpl(variance4, ErrorUtils.createErrorType(errorTypeKind, name));
                        }
                        List<TypeProjection> arguments = asSimpleType.getArguments();
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
                        for (Object obj : arguments) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            arrayList.add(expandTypeProjection((TypeProjection) obj, typeAliasExpansion, constructor.getParameters().get(i2), i + 1));
                            i2 = i3;
                        }
                        SimpleType expandRecursively = expandRecursively(TypeAliasExpansion.Companion.create(typeAliasExpansion, typeAliasDescriptor, arrayList), asSimpleType.getAttributes(), asSimpleType.isMarkedNullable(), i + 1, false);
                        SimpleType substituteArguments = substituteArguments(asSimpleType, typeAliasExpansion, i);
                        if (!DynamicTypesKt.isDynamic(expandRecursively)) {
                            expandRecursively = SpecialTypesKt.withAbbreviation(expandRecursively, substituteArguments);
                        }
                        return new TypeProjectionImpl(typeProjection.getProjectionKind(), expandRecursively);
                    }
                    SimpleType substituteArguments2 = substituteArguments(asSimpleType, typeAliasExpansion, i);
                    TypeSubstitutor create = TypeSubstitutor.create(substituteArguments2);
                    create.getClass();
                    for (Object obj2 : substituteArguments2.getArguments()) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        TypeProjection typeProjection2 = (TypeProjection) obj2;
                        if (!typeProjection2.isStarProjection()) {
                            KotlinType type3 = typeProjection2.getType();
                            type3.getClass();
                            if (!TypeUtilsKt.containsTypeAliasParameters(type3)) {
                                TypeProjection typeProjection3 = asSimpleType.getArguments().get(i2);
                                TypeParameterDescriptor typeParameterDescriptor2 = asSimpleType.getConstructor().getParameters().get(i2);
                                if (this.shouldCheckBounds) {
                                    KotlinType type4 = typeProjection3.getType();
                                    type4.getClass();
                                    KotlinType type5 = typeProjection2.getType();
                                    type5.getClass();
                                    typeParameterDescriptor2.getClass();
                                    typeAliasExpansionReportStrategy.boundsViolationInSubstitution(create, type4, type5, typeParameterDescriptor2);
                                }
                            }
                        }
                        i2 = i4;
                    }
                    return new TypeProjectionImpl(typeProjection.getProjectionKind(), substituteArguments2);
                }
            }
        }
        return typeProjection;
    }

    public final SimpleType substituteArguments(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i) {
        TypeConstructor constructor = simpleType.getConstructor();
        List<TypeProjection> arguments = simpleType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10));
        int i2 = 0;
        for (Object obj : arguments) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection expandTypeProjection = expandTypeProjection(typeProjection, typeAliasExpansion, constructor.getParameters().get(i2), i + 1);
            if (!expandTypeProjection.isStarProjection()) {
                expandTypeProjection = new TypeProjectionImpl(expandTypeProjection.getProjectionKind(), TypeUtils.makeNullableIfNeeded(expandTypeProjection.getType(), typeProjection.getType().isMarkedNullable()));
            }
            arrayList.add(expandTypeProjection);
            i2 = i3;
        }
        return TypeSubstitutionKt.replace$default(simpleType, arrayList, null, 2, null);
    }
}
