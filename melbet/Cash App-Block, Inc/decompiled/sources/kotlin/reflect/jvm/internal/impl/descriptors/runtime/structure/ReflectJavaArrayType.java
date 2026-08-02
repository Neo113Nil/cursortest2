package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;

/* loaded from: classes9.dex */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {
    public final EmptyList annotations;
    public final ReflectJavaType componentType;
    public final Type reflectType;

    public ReflectJavaArrayType(Type type2) {
        ReflectJavaType create;
        type2.getClass();
        this.reflectType = type2;
        if (!(type2 instanceof GenericArrayType)) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                if (cls.isArray()) {
                    ReflectJavaType.Factory factory = ReflectJavaType.Factory;
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    create = factory.create(componentType);
                }
            }
            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Not an array type (", type2.getClass(), "): ", type2);
            throw null;
        }
        ReflectJavaType.Factory factory2 = ReflectJavaType.Factory;
        Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
        genericComponentType.getClass();
        create = factory2.create(genericComponentType);
        this.componentType = create;
        this.annotations = EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public Collection<JavaAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public final Type getReflectType() {
        return this.reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    public ReflectJavaType getComponentType() {
        return this.componentType;
    }
}
