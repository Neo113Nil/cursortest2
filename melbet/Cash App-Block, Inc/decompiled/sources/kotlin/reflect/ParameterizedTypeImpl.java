package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class ParameterizedTypeImpl implements ParameterizedType, Type {
    public final Type ownerType;
    public final Class rawType;
    public final Type[] typeArguments;

    public ParameterizedTypeImpl(Class cls, Type type2, ArrayList arrayList) {
        this.rawType = cls;
        this.ownerType = type2;
        this.typeArguments = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return this.rawType.equals(parameterizedType.getRawType()) && Intrinsics.areEqual(this.ownerType, parameterizedType.getOwnerType()) && Arrays.equals(this.typeArguments, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.typeArguments;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.ownerType;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.rawType;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.rawType;
        Type type2 = this.ownerType;
        if (type2 != null) {
            sb.append(TypesJVMKt.access$typeToString(type2));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(TypesJVMKt.access$typeToString(cls));
        }
        Type[] typeArr = this.typeArguments;
        if (typeArr.length != 0) {
            ArraysKt___ArraysKt.joinTo(typeArr, sb, ", ", "<", ">", "...", ParameterizedTypeImpl$getTypeName$1$1.INSTANCE);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.rawType.hashCode();
        Type type2 = this.ownerType;
        return Arrays.hashCode(this.typeArguments) ^ (hashCode ^ (type2 != null ? type2.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
