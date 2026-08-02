package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes9.dex */
public final class ReflectJavaPrimitiveType extends ReflectJavaType implements JavaPrimitiveType {
    public final EmptyList annotations;
    public final Class reflectType;

    public ReflectJavaPrimitiveType(Class<?> cls) {
        cls.getClass();
        this.reflectType = cls;
        this.annotations = EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public Type getReflectType() {
        return this.reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType
    public PrimitiveType getType() {
        Class cls = Void.TYPE;
        Class cls2 = this.reflectType;
        if (Intrinsics.areEqual(cls2, cls)) {
            return null;
        }
        return JvmPrimitiveType.get(cls2.getName()).getPrimitiveType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }
}
