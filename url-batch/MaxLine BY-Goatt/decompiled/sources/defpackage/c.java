package defpackage;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type m;
    public final Type n;
    public final Type[] o;

    public c(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            yk3.s(z);
        }
        this.m = type == null ? null : j8.n(type);
        this.n = j8.n(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.o = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            this.o[i].getClass();
            j8.p(this.o[i]);
            Type[] typeArr3 = this.o;
            typeArr3[i] = j8.n(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && j8.z(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.o.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.m;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.n;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.o) ^ this.n.hashCode();
        Type type = this.m;
        return (type != null ? type.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        Type[] typeArr = this.o;
        int length = typeArr.length;
        Type type = this.n;
        if (length == 0) {
            return j8.X(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(j8.X(type));
        sb.append("<");
        sb.append(j8.X(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(j8.X(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
