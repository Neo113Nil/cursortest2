package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes9.dex */
public class JavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(JavaAnnotationDescriptor.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)};
    public final JavaAnnotationArgument firstArgument;
    public final FqName fqName;
    public final boolean isIdeExternalAnnotation;
    public final SourceElement source;
    public final NotNullLazyValue type$delegate;

    public JavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation, FqName fqName) {
        SourceElement sourceElement;
        Collection<JavaAnnotationArgument> arguments;
        lazyJavaResolverContext.getClass();
        fqName.getClass();
        this.fqName = fqName;
        if (javaAnnotation == null || (sourceElement = lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaAnnotation)) == null) {
            sourceElement = SourceElement.NO_SOURCE;
            sourceElement.getClass();
        }
        this.source = sourceElement;
        this.type$delegate = lazyJavaResolverContext.getStorageManager().createLazyValue(new KClassImpl$Data$$Lambda$22(20, lazyJavaResolverContext, this));
        this.firstArgument = (javaAnnotation == null || (arguments = javaAnnotation.getArguments()) == null) ? null : (JavaAnnotationArgument) CollectionsKt.firstOrNull(arguments);
        boolean z = false;
        if (javaAnnotation != null && javaAnnotation.isIdeExternalAnnotation()) {
            z = true;
        }
        this.isIdeExternalAnnotation = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName getFqName() {
        return this.fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SourceElement getSource() {
        return this.source;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SimpleType getType() {
        Object value = StorageKt.getValue((NotNullLazyValue<? extends Object>) this.type$delegate, this, $$delegatedProperties[0]);
        value.getClass();
        return (SimpleType) value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.isIdeExternalAnnotation;
    }
}
