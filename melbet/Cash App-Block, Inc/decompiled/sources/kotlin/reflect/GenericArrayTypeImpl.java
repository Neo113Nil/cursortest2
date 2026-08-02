package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class GenericArrayTypeImpl implements GenericArrayType, Type {
    public final Type elementType;

    public GenericArrayTypeImpl(Type type2) {
        type2.getClass();
        this.elementType = type2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return Intrinsics.areEqual(this.elementType, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.elementType;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return TypesJVMKt.access$typeToString(this.elementType) + "[]";
    }

    public final int hashCode() {
        return this.elementType.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
