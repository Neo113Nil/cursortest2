package cn.hutool.core.lang;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class ParameterizedTypeImpl implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 1;
    private final Type[] actualTypeArguments;
    private final Type ownerType;
    private final Type rawType;

    public ParameterizedTypeImpl(Type[] typeArr, Type type, Type type2) {
        this.actualTypeArguments = typeArr;
        this.ownerType = type;
        this.rawType = type2;
    }

    private static StringBuilder appendAllTo(StringBuilder sb, String str, Type... typeArr) {
        if (cn.hutool.core.util.h.isNotEmpty((Object[]) typeArr)) {
            boolean z7 = true;
            for (Type type : typeArr) {
                if (z7) {
                    z7 = false;
                } else {
                    sb.append(str);
                }
                sb.append(type instanceof Class ? ((Class) type).getName() : cn.hutool.core.util.c1.toString(type));
            }
        }
        return sb;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.actualTypeArguments;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.ownerType;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.rawType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Type type = this.ownerType;
        Class cls = (Class) this.rawType;
        if (type == null) {
            sb.append(cls.getName());
        } else {
            if (type instanceof Class) {
                sb.append(((Class) type).getName());
            } else {
                sb.append(type.toString());
            }
            sb.append('.');
            sb.append(cls.getSimpleName());
        }
        sb.append('<');
        appendAllTo(sb, ", ", this.actualTypeArguments).append('>');
        return sb.toString();
    }
}
