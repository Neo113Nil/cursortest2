package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
final class ParameterizedTypeImpl implements ParameterizedType, t {
    private final Type ownerType;
    private final Class<?> rawType;
    private final Type[] typeArguments;

    public ParameterizedTypeImpl(Class<?> rawType, Type type, List<? extends Type> typeArguments) {
        kotlin.jvm.internal.s.checkNotNullParameter(rawType, "rawType");
        kotlin.jvm.internal.s.checkNotNullParameter(typeArguments, "typeArguments");
        this.rawType = rawType;
        this.ownerType = type;
        this.typeArguments = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (kotlin.jvm.internal.s.areEqual(this.rawType, parameterizedType.getRawType()) && kotlin.jvm.internal.s.areEqual(this.ownerType, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.typeArguments;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.ownerType;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.rawType;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.t
    public String getTypeName() {
        String typeToString;
        String typeToString2;
        StringBuilder sb = new StringBuilder();
        Type type = this.ownerType;
        if (type != null) {
            typeToString2 = TypesJVMKt.typeToString(type);
            sb.append(typeToString2);
            sb.append("$");
            sb.append(this.rawType.getSimpleName());
        } else {
            typeToString = TypesJVMKt.typeToString(this.rawType);
            sb.append(typeToString);
        }
        Type[] typeArr = this.typeArguments;
        if (!(typeArr.length == 0)) {
            kotlin.collections.h.joinTo$default(typeArr, sb, (CharSequence) null, "<", ">", 0, (CharSequence) null, ParameterizedTypeImpl$getTypeName$1$1.INSTANCE, 50, (Object) null);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hashCode = this.rawType.hashCode();
        Type type = this.ownerType;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
