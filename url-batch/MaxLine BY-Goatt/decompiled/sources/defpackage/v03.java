package defpackage;

import java.lang.reflect.Type;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v03 {
    public final Class a;
    public final Type b;
    public final int c;

    public v03(Type type) {
        type.getClass();
        Type n = j8.n(type);
        this.b = n;
        this.a = j8.I(n);
        this.c = n.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v03) {
            return j8.z(this.b, ((v03) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return j8.X(this.b);
    }
}
