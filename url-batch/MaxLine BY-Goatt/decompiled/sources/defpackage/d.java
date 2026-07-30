package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type m;
    public final Type n;

    public d(Type[] typeArr, Type[] typeArr2) {
        yk3.s(typeArr2.length <= 1);
        yk3.s(typeArr.length == 1);
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            j8.p(typeArr[0]);
            this.n = null;
            this.m = j8.n(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        j8.p(typeArr2[0]);
        yk3.s(typeArr[0] == Object.class);
        this.n = j8.n(typeArr2[0]);
        this.m = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && j8.z(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.n;
        return type != null ? new Type[]{type} : j8.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.m};
    }

    public final int hashCode() {
        Type type = this.n;
        return (this.m.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.n;
        if (type != null) {
            return "? super " + j8.X(type);
        }
        Type type2 = this.m;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + j8.X(type2);
    }
}
