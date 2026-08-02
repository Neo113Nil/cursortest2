package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class ReflectJavaWildcardType extends ReflectJavaType implements JavaWildcardType {
    public final EmptyList annotations;
    public final WildcardType reflectType;

    public ReflectJavaWildcardType(WildcardType wildcardType) {
        wildcardType.getClass();
        this.reflectType = wildcardType;
        this.annotations = EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public ReflectJavaType getBound() {
        WildcardType wildcardType = this.reflectType;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            f$$ExternalSyntheticLambda0.m((Object) wildcardType, "Wildcard types with many bounds are not yet supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            ReflectJavaType.Factory factory = ReflectJavaType.Factory;
            Object single = ArraysKt___ArraysKt.single(lowerBounds);
            single.getClass();
            return factory.create((Type) single);
        }
        if (upperBounds.length == 1) {
            Type type2 = (Type) ArraysKt___ArraysKt.single(upperBounds);
            if (!Intrinsics.areEqual(type2, Object.class)) {
                ReflectJavaType.Factory factory2 = ReflectJavaType.Factory;
                type2.getClass();
                return factory2.create(type2);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public Type getReflectType() {
        return this.reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType
    public boolean isExtends() {
        this.reflectType.getUpperBounds().getClass();
        return !Intrinsics.areEqual(ArraysKt___ArraysKt.firstOrNull(r1), Object.class);
    }
}
