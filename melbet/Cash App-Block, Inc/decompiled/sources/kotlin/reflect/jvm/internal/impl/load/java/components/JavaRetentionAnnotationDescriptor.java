package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* loaded from: classes9.dex */
public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(JavaRetentionAnnotationDescriptor.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};
    public final NotNullLazyValue allValueArguments$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(JavaAnnotation javaAnnotation, LazyJavaResolverContext lazyJavaResolverContext) {
        super(lazyJavaResolverContext, javaAnnotation, StandardNames.FqNames.retention);
        javaAnnotation.getClass();
        lazyJavaResolverContext.getClass();
        this.allValueArguments$delegate = lazyJavaResolverContext.getStorageManager().createLazyValue(new KotlinKPropertyN$$Lambda$0(this, 14));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.allValueArguments$delegate, this, $$delegatedProperties[0]);
    }
}
