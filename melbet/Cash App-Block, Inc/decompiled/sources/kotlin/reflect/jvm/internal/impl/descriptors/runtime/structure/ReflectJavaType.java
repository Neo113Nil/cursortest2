package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes9.dex */
public abstract class ReflectJavaType implements JavaType {
    public static final Factory Factory = new Factory(null);

    public static final class Factory {
        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ReflectJavaType create(Type type2) {
            type2.getClass();
            boolean z = type2 instanceof Class;
            if (z) {
                Class cls = (Class) type2;
                if (cls.isPrimitive()) {
                    return new ReflectJavaPrimitiveType(cls);
                }
            }
            return ((type2 instanceof GenericArrayType) || (z && ((Class) type2).isArray())) ? new ReflectJavaArrayType(type2) : type2 instanceof WildcardType ? new ReflectJavaWildcardType((WildcardType) type2) : new ReflectJavaClassifierType(type2);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaType) && Intrinsics.areEqual(getReflectType(), ((ReflectJavaType) obj).getReflectType());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation findAnnotation(FqName fqName) {
        Object obj;
        fqName.getClass();
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ClassId classId = ((JavaAnnotation) next).getClassId();
            if (Intrinsics.areEqual(classId != null ? classId.asSingleFqName() : null, fqName)) {
                obj = next;
                break;
            }
        }
        return (JavaAnnotation) obj;
    }

    public abstract Type getReflectType();

    public int hashCode() {
        return getReflectType().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + getReflectType();
    }
}
