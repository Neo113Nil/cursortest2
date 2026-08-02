package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class JavaTypeResolver {
    public final LazyJavaResolverContext c;
    public final RawProjectionComputer projectionComputer;
    public final TypeParameterResolver typeParameterResolver;
    public final TypeParameterUpperBoundEraser typeParameterUpperBoundEraser;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeResolver(LazyJavaResolverContext lazyJavaResolverContext, TypeParameterResolver typeParameterResolver) {
        lazyJavaResolverContext.getClass();
        typeParameterResolver.getClass();
        this.c = lazyJavaResolverContext;
        this.typeParameterResolver = typeParameterResolver;
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.projectionComputer = rawProjectionComputer;
        this.typeParameterUpperBoundEraser = new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KotlinType transformArrayType$default(JavaTypeResolver javaTypeResolver, JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaTypeResolver.transformArrayType(javaArrayType, javaTypeAttributes, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x00b7, code lost:
    
        if (r5 != kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x014c, code lost:
    
        if (r0.isEmpty() == false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00bf  */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SimpleType computeSimpleJavaClassifierType(final JavaClassifierType javaClassifierType, final JavaTypeAttributes javaTypeAttributes, SimpleType simpleType) {
        TypeAttributes defaultAttributes;
        final TypeConstructor typeConstructor;
        TypeConstructor typeConstructor2;
        ClassDescriptor mapJavaToKotlin$default;
        FqName fqName;
        TypeAttributes typeAttributes;
        boolean z;
        List list;
        TypeProjection typeProjectionImpl;
        if (simpleType == null || (defaultAttributes = simpleType.getAttributes()) == null) {
            defaultAttributes = TypeAttributesKt.toDefaultAttributes(new LazyJavaAnnotations(this.c, javaClassifierType, false, 4, null));
        }
        TypeAttributes typeAttributes2 = defaultAttributes;
        JavaClassifier classifier = javaClassifierType.getClassifier();
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        if (classifier == null) {
            typeConstructor2 = createNotFoundClass(javaClassifierType);
        } else if (classifier instanceof JavaClass) {
            JavaClass javaClass = (JavaClass) classifier;
            FqName fqName2 = javaClass.getFqName();
            if (fqName2 == null) {
                OptionalProvider$$ExternalSyntheticLambda0.m$2(classifier, "Class type should have a FQ name: ");
                return null;
            }
            if (javaTypeAttributes.isForAnnotationParameter()) {
                fqName = JavaTypeResolverKt.JAVA_LANG_CLASS_FQ_NAME;
                if (fqName2.equals(fqName)) {
                    mapJavaToKotlin$default = lazyJavaResolverContext.getComponents().getReflectionTypes().getKClass();
                    if (mapJavaToKotlin$default == null) {
                        mapJavaToKotlin$default = lazyJavaResolverContext.getComponents().getModuleClassResolver().resolveClass(javaClass);
                    }
                    if (mapJavaToKotlin$default != null || (typeConstructor2 = mapJavaToKotlin$default.getTypeConstructor()) == null) {
                        typeConstructor2 = createNotFoundClass(javaClassifierType);
                    }
                }
            }
            JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
            mapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(javaToKotlinClassMapper, fqName2, lazyJavaResolverContext.getModule().getBuiltIns(), null, 4, null);
            if (mapJavaToKotlin$default == null) {
                mapJavaToKotlin$default = null;
            } else if (javaToKotlinClassMapper.isReadOnly(mapJavaToKotlin$default)) {
                if (javaTypeAttributes.getFlexibility() != JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND && javaTypeAttributes.getHowThisTypeIsUsed() != TypeUsage.SUPERTYPE) {
                    if (JavaTypesKt.isSuperWildcard((JavaType) CollectionsKt.lastOrNull((List) javaClassifierType.getTypeArguments()))) {
                        List<TypeParameterDescriptor> parameters = javaToKotlinClassMapper.convertReadOnlyToMutable(mapJavaToKotlin$default).getTypeConstructor().getParameters();
                        parameters.getClass();
                        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.lastOrNull((List) parameters);
                        if (typeParameterDescriptor != null) {
                            Variance variance = typeParameterDescriptor.getVariance();
                            if (variance != null) {
                            }
                        }
                    }
                }
                mapJavaToKotlin$default = javaToKotlinClassMapper.convertReadOnlyToMutable(mapJavaToKotlin$default);
            }
            if (mapJavaToKotlin$default == null) {
            }
            if (mapJavaToKotlin$default != null) {
            }
            typeConstructor2 = createNotFoundClass(javaClassifierType);
        } else {
            if (!(classifier instanceof JavaTypeParameter)) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(classifier, "Unknown classifier kind: ");
                return null;
            }
            TypeParameterDescriptor resolveTypeParameter = this.typeParameterResolver.resolveTypeParameter((JavaTypeParameter) classifier);
            if (resolveTypeParameter == null) {
                typeConstructor = null;
                if (typeConstructor != null) {
                    return null;
                }
                boolean z2 = false;
                if (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) {
                    typeAttributes = typeAttributes2;
                    z = false;
                } else {
                    typeAttributes = typeAttributes2;
                    z = true;
                }
                if (Intrinsics.areEqual(simpleType != null ? simpleType.getConstructor() : null, typeConstructor) && !javaClassifierType.isRaw() && z) {
                    return simpleType.makeNullableAsSpecified(true);
                }
                if (!javaClassifierType.isRaw()) {
                    if (javaClassifierType.getTypeArguments().isEmpty()) {
                        List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
                        parameters2.getClass();
                    }
                    List<TypeParameterDescriptor> parameters3 = typeConstructor.getParameters();
                    parameters3.getClass();
                    if (!z2) {
                        List<TypeParameterDescriptor> list2 = parameters3;
                        list = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        for (final TypeParameterDescriptor typeParameterDescriptor2 : list2) {
                            list.add(TypeUtilsKt.hasTypeParameterRecursiveBounds(typeParameterDescriptor2, null, javaTypeAttributes.getVisitedTypeParameters()) ? TypeUtils.makeStarProjection(typeParameterDescriptor2, javaTypeAttributes) : this.projectionComputer.computeProjection(typeParameterDescriptor2, javaTypeAttributes.markIsRaw(javaClassifierType.isRaw()), this.typeParameterUpperBoundEraser, new LazyWrappedType(lazyJavaResolverContext.getStorageManager(), new Function0(this, typeParameterDescriptor2, javaTypeAttributes, typeConstructor, javaClassifierType) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$$Lambda$0
                                public final JavaTypeResolver arg$0;
                                public final TypeParameterDescriptor arg$1;
                                public final JavaTypeAttributes arg$2;
                                public final TypeConstructor arg$3;
                                public final JavaClassifierType arg$4;

                                {
                                    this.arg$0 = this;
                                    this.arg$1 = typeParameterDescriptor2;
                                    this.arg$2 = javaTypeAttributes;
                                    this.arg$3 = typeConstructor;
                                    this.arg$4 = javaClassifierType;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.arg$0.typeParameterUpperBoundEraser;
                                    ClassifierDescriptor mo4153getDeclarationDescriptor = this.arg$3.mo4153getDeclarationDescriptor();
                                    return typeParameterUpperBoundEraser.getErasedUpperBound(this.arg$1, this.arg$2.withDefaultType(mo4153getDeclarationDescriptor != null ? mo4153getDeclarationDescriptor.getDefaultType() : null).markIsRaw(this.arg$4.isRaw()));
                                }
                            })));
                        }
                    } else if (parameters3.size() != javaClassifierType.getTypeArguments().size()) {
                        List<TypeParameterDescriptor> list3 = parameters3;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        for (TypeParameterDescriptor typeParameterDescriptor3 : list3) {
                            ErrorTypeKind errorTypeKind = ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                            String asString = typeParameterDescriptor3.getName().asString();
                            asString.getClass();
                            arrayList.add(new TypeProjectionImpl(ErrorUtils.createErrorType(errorTypeKind, asString)));
                        }
                        list = CollectionsKt.toList(arrayList);
                    } else {
                        IndexingIterable withIndex = CollectionsKt.withIndex(javaClassifierType.getTypeArguments());
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(withIndex, 10));
                        Iterator it = withIndex.iterator();
                        while (true) {
                            ArrayIterator arrayIterator = (ArrayIterator) it;
                            if (!((Iterator) arrayIterator.f1520array).hasNext()) {
                                break;
                            }
                            IndexedValue indexedValue = (IndexedValue) arrayIterator.next();
                            int i = indexedValue.index;
                            JavaType javaType = (JavaType) indexedValue.value;
                            parameters3.size();
                            TypeParameterDescriptor typeParameterDescriptor4 = parameters3.get(i);
                            TypeUsage typeUsage = TypeUsage.COMMON;
                            JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, false, null, 7, null);
                            typeParameterDescriptor4.getClass();
                            if (javaType instanceof JavaWildcardType) {
                                JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
                                JavaType bound = javaWildcardType.getBound();
                                Variance variance2 = javaWildcardType.isExtends() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
                                if (bound == null || !(typeParameterDescriptor4.getVariance() == Variance.INVARIANT || variance2 == typeParameterDescriptor4.getVariance())) {
                                    typeProjectionImpl = TypeUtils.makeStarProjection(typeParameterDescriptor4, attributes$default);
                                    typeProjectionImpl.getClass();
                                } else {
                                    AnnotationDescriptor extractNullabilityAnnotationOnBoundedWildcard = UtilsKt.extractNullabilityAnnotationOnBoundedWildcard(lazyJavaResolverContext, javaWildcardType);
                                    Variance variance3 = variance2;
                                    KotlinType transformJavaType = transformJavaType(bound, JavaTypeAttributesKt.toAttributes$default(typeUsage, false, false, null, 7, null));
                                    if (extractNullabilityAnnotationOnBoundedWildcard != null) {
                                        transformJavaType = TypeUtilsKt.replaceAnnotations(transformJavaType, Annotations.Companion.create(CollectionsKt.plus(transformJavaType.getAnnotations(), extractNullabilityAnnotationOnBoundedWildcard)));
                                    }
                                    typeProjectionImpl = TypeUtilsKt.createProjection(transformJavaType, variance3, typeParameterDescriptor4);
                                }
                            } else {
                                typeProjectionImpl = new TypeProjectionImpl(Variance.INVARIANT, transformJavaType(javaType, attributes$default));
                            }
                            arrayList2.add(typeProjectionImpl);
                        }
                        list = CollectionsKt.toList(arrayList2);
                    }
                    return KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor, list, z, (KotlinTypeRefiner) null, 16, (Object) null);
                }
                z2 = true;
                List<TypeParameterDescriptor> parameters32 = typeConstructor.getParameters();
                parameters32.getClass();
                if (!z2) {
                }
                return KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor, list, z, (KotlinTypeRefiner) null, 16, (Object) null);
            }
            typeConstructor2 = resolveTypeParameter.getTypeConstructor();
        }
        typeConstructor = typeConstructor2;
        if (typeConstructor != null) {
        }
    }

    public final TypeConstructor createNotFoundClass(JavaClassifierType javaClassifierType) {
        TypeConstructor typeConstructor = this.c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(ClassId.Companion.topLevel(new FqName(javaClassifierType.getClassifierQualifiedName())), CollectionsKt__CollectionsJVMKt.listOf(0)).getTypeConstructor();
        typeConstructor.getClass();
        return typeConstructor;
    }

    public final KotlinType transformArrayType(JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z) {
        javaArrayType.getClass();
        javaTypeAttributes.getClass();
        JavaType componentType = javaArrayType.getComponentType();
        JavaPrimitiveType javaPrimitiveType = componentType instanceof JavaPrimitiveType ? (JavaPrimitiveType) componentType : null;
        PrimitiveType type2 = javaPrimitiveType != null ? javaPrimitiveType.getType() : null;
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(lazyJavaResolverContext, javaArrayType, true);
        if (type2 != null) {
            SimpleType primitiveArrayKotlinType = lazyJavaResolverContext.getModule().getBuiltIns().getPrimitiveArrayKotlinType(type2);
            primitiveArrayKotlinType.getClass();
            KotlinType replaceAnnotations = TypeUtilsKt.replaceAnnotations(primitiveArrayKotlinType, new CompositeAnnotations(primitiveArrayKotlinType.getAnnotations(), lazyJavaAnnotations));
            replaceAnnotations.getClass();
            SimpleType simpleType = (SimpleType) replaceAnnotations;
            return javaTypeAttributes.isForAnnotationParameter() ? simpleType : KotlinTypeFactory.flexibleType(simpleType, simpleType.makeNullableAsSpecified(true));
        }
        KotlinType transformJavaType = transformJavaType(componentType, JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, javaTypeAttributes.isForAnnotationParameter(), false, null, 6, null));
        if (javaTypeAttributes.isForAnnotationParameter()) {
            SimpleType arrayType = lazyJavaResolverContext.getModule().getBuiltIns().getArrayType(z ? Variance.OUT_VARIANCE : Variance.INVARIANT, transformJavaType, lazyJavaAnnotations);
            arrayType.getClass();
            return arrayType;
        }
        SimpleType arrayType2 = lazyJavaResolverContext.getModule().getBuiltIns().getArrayType(Variance.INVARIANT, transformJavaType, lazyJavaAnnotations);
        arrayType2.getClass();
        return KotlinTypeFactory.flexibleType(arrayType2, lazyJavaResolverContext.getModule().getBuiltIns().getArrayType(Variance.OUT_VARIANCE, transformJavaType, lazyJavaAnnotations).makeNullableAsSpecified(true));
    }

    public final KotlinType transformJavaType(JavaType javaType, JavaTypeAttributes javaTypeAttributes) {
        KotlinType transformJavaType;
        SimpleType computeSimpleJavaClassifierType;
        javaTypeAttributes.getClass();
        boolean z = javaType instanceof JavaPrimitiveType;
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        if (z) {
            PrimitiveType type2 = ((JavaPrimitiveType) javaType).getType();
            SimpleType primitiveKotlinType = type2 != null ? lazyJavaResolverContext.getModule().getBuiltIns().getPrimitiveKotlinType(type2) : lazyJavaResolverContext.getModule().getBuiltIns().getUnitType();
            primitiveKotlinType.getClass();
            return primitiveKotlinType;
        }
        if (javaType instanceof JavaClassifierType) {
            JavaClassifierType javaClassifierType = (JavaClassifierType) javaType;
            boolean z2 = (javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? false : true;
            boolean isRaw = javaClassifierType.isRaw();
            if (!isRaw && !z2) {
                SimpleType computeSimpleJavaClassifierType2 = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes, null);
                return computeSimpleJavaClassifierType2 != null ? computeSimpleJavaClassifierType2 : ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.getPresentableText());
            }
            SimpleType computeSimpleJavaClassifierType3 = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
            if (computeSimpleJavaClassifierType3 != null && (computeSimpleJavaClassifierType = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), computeSimpleJavaClassifierType3)) != null) {
                return isRaw ? new RawTypeImpl(computeSimpleJavaClassifierType3, computeSimpleJavaClassifierType) : KotlinTypeFactory.flexibleType(computeSimpleJavaClassifierType3, computeSimpleJavaClassifierType);
            }
            return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.getPresentableText());
        }
        if (javaType instanceof JavaArrayType) {
            return transformArrayType$default(this, (JavaArrayType) javaType, javaTypeAttributes, false, 4, null);
        }
        if (!(javaType instanceof JavaWildcardType)) {
            if (javaType != null) {
                f$$ExternalSyntheticLambda0.m((Object) javaType, "Unsupported type: ");
                return null;
            }
            SimpleType defaultBound = lazyJavaResolverContext.getModule().getBuiltIns().getDefaultBound();
            defaultBound.getClass();
            return defaultBound;
        }
        JavaType bound = ((JavaWildcardType) javaType).getBound();
        if (bound != null && (transformJavaType = transformJavaType(bound, javaTypeAttributes)) != null) {
            return transformJavaType;
        }
        SimpleType defaultBound2 = lazyJavaResolverContext.getModule().getBuiltIns().getDefaultBound();
        defaultBound2.getClass();
        return defaultBound2;
    }
}
