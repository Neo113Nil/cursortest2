package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;

/* loaded from: classes9.dex */
public final class LazyJavaAnnotationsKt {
    public static final Annotations resolveAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner) {
        lazyJavaResolverContext.getClass();
        javaAnnotationOwner.getClass();
        return new LazyJavaAnnotations(lazyJavaResolverContext, javaAnnotationOwner, false, 4, null);
    }
}
