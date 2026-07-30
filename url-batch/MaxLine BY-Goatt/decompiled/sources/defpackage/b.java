package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type m;

    public b(Type type) {
        this.m = j8.n(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && j8.z(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.m;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return j8.X(this.m) + "[]";
    }
}
