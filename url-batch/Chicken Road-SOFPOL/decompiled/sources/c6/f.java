package c6;

import java.io.Serializable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f1747d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1748e;

    public f(Object obj, Object obj2) {
        this.f1747d = obj;
        this.f1748e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return q6.i.a(this.f1747d, fVar.f1747d) && q6.i.a(this.f1748e, fVar.f1748e);
    }

    public final int hashCode() {
        Object obj = this.f1747d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1748e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f1747d + ", " + this.f1748e + ')';
    }
}
