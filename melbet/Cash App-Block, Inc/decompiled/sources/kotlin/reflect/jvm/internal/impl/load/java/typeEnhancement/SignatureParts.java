package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* loaded from: classes9.dex */
public final class SignatureParts extends AbstractSignatureParts {
    public final AnnotationQualifierApplicabilityType containerApplicabilityType;
    public final LazyJavaResolverContext containerContext;
    public final boolean isCovariant;
    public final boolean skipRawTypeArguments;
    public final Annotated typeContainer;

    public SignatureParts(Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2) {
        lazyJavaResolverContext.getClass();
        annotationQualifierApplicabilityType.getClass();
        this.typeContainer = annotated;
        this.isCovariant = z;
        this.containerContext = lazyJavaResolverContext;
        this.containerApplicabilityType = annotationQualifierApplicabilityType;
        this.skipRawTypeArguments = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean forceWarning(Object obj, KotlinTypeMarker kotlinTypeMarker) {
        AnnotationDescriptor annotationDescriptor = (AnnotationDescriptor) obj;
        annotationDescriptor.getClass();
        if ((annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) && ((PossiblyExternalAnnotationDescriptor) annotationDescriptor).isIdeExternalAnnotation()) {
            return true;
        }
        if ((annotationDescriptor instanceof LazyJavaAnnotationDescriptor) && !getEnableImprovementsInStrictMode() && (((LazyJavaAnnotationDescriptor) annotationDescriptor).isFreshlySupportedTypeUseAnnotation() || this.containerApplicabilityType == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS)) {
            return true;
        }
        if (kotlinTypeMarker == null || !KotlinBuiltIns.isPrimitiveArray((KotlinType) kotlinTypeMarker)) {
            return false;
        }
        LazyJavaResolverContext lazyJavaResolverContext = this.containerContext;
        return lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver().isTypeUseAnnotation(annotationDescriptor) && !lazyJavaResolverContext.getComponents().getSettings().getEnhancePrimitiveArrays();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final AbstractAnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver() {
        return this.containerContext.getComponents().getAnnotationTypeQualifierResolver();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final Iterable getAnnotations(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return ((KotlinType) kotlinTypeMarker).getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final Iterable getContainerAnnotations() {
        Annotations annotations;
        Annotated annotated = this.typeContainer;
        return (annotated == null || (annotations = annotated.getAnnotations()) == null) ? EmptyList.INSTANCE : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final AnnotationQualifierApplicabilityType getContainerApplicabilityType() {
        return this.containerApplicabilityType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers() {
        return this.containerContext.getDefaultTypeQualifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean getContainerIsVarargParameter() {
        Annotated annotated = this.typeContainer;
        return (annotated instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) annotated).getVarargElementType() != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final WithMigrationStatus getDefaultNullability(WithMigrationStatus withMigrationStatus, JavaDefaultQualifiers javaDefaultQualifiers) {
        WithMigrationStatus copy$default;
        if (withMigrationStatus != null && (copy$default = WithMigrationStatus.copy$default(withMigrationStatus, NullabilityQualifier.NOT_NULL, false, 2, null)) != null) {
            return copy$default;
        }
        if (javaDefaultQualifiers != null) {
            return javaDefaultQualifiers.getNullabilityQualifier();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean getEnableImprovementsInStrictMode() {
        return this.containerContext.getComponents().getSettings().getTypeEnhancementImprovementsInStrictMode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final KotlinTypeMarker getEnhancedForWarnings(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return TypeWithEnhancementKt.getEnhancement((KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final FqNameUnsafe getFqNameUnsafe(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        ClassDescriptor classDescriptor = TypeUtils.getClassDescriptor((KotlinType) kotlinTypeMarker);
        if (classDescriptor != null) {
            return DescriptorUtils.getFqName(classDescriptor);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean getSkipRawTypeArguments() {
        return this.skipRawTypeArguments;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final TypeSystemContext getTypeSystem() {
        return SimpleClassicTypeSystemContext.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isArrayOrPrimitiveArray(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return KotlinBuiltIns.isArrayOrPrimitiveArray((KotlinType) kotlinTypeMarker);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isCovariant() {
        return this.isCovariant;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isEqual(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        kotlinTypeMarker.getClass();
        kotlinTypeMarker2.getClass();
        return this.containerContext.getComponents().getKotlinTypeChecker().equalTypes((KotlinType) kotlinTypeMarker, (KotlinType) kotlinTypeMarker2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isFromJava(TypeParameterMarker typeParameterMarker) {
        typeParameterMarker.getClass();
        return typeParameterMarker instanceof LazyJavaTypeParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isK2() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public final boolean isNotNullTypeParameterCompat(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return ((KotlinType) kotlinTypeMarker).unwrap() instanceof NotNullTypeParameterImpl;
    }
}
