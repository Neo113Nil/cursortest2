package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes9.dex */
public final class CapturedTypeParameterDescriptor implements TypeParameterDescriptor {
    public final DeclarationDescriptor declarationDescriptor;
    public final int declaredTypeParametersCount;
    public final TypeParameterDescriptor originalDescriptor;

    public CapturedTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, int i) {
        classifierDescriptorWithTypeParameters.getClass();
        this.originalDescriptor = typeParameterDescriptor;
        this.declarationDescriptor = classifierDescriptorWithTypeParameters;
        this.declaredTypeParametersCount = i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object accept(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return this.originalDescriptor.accept(declarationDescriptorVisitor, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return this.originalDescriptor.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor getContainingDeclaration() {
        return this.declarationDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final SimpleType getDefaultType() {
        SimpleType defaultType = this.originalDescriptor.getDefaultType();
        defaultType.getClass();
        return defaultType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final int getIndex() {
        return this.originalDescriptor.getIndex() + this.declaredTypeParametersCount;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final Name getName() {
        Name name = this.originalDescriptor.getName();
        name.getClass();
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor original = this.originalDescriptor.getOriginal();
        original.getClass();
        return original;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement getSource() {
        SourceElement source = this.originalDescriptor.getSource();
        source.getClass();
        return source;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final StorageManager getStorageManager() {
        StorageManager storageManager = this.originalDescriptor.getStorageManager();
        storageManager.getClass();
        return storageManager;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = this.originalDescriptor.getTypeConstructor();
        typeConstructor.getClass();
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final List getUpperBounds() {
        List<KotlinType> upperBounds = this.originalDescriptor.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final Variance getVariance() {
        Variance variance = this.originalDescriptor.getVariance();
        variance.getClass();
        return variance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean isCapturedFromOuterDeclaration() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean isReified() {
        return this.originalDescriptor.isReified();
    }

    public final String toString() {
        return this.originalDescriptor + "[inner-copy]";
    }
}
