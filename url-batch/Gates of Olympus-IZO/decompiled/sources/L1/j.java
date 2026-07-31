package L1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f2708d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2709e;

    public j(Object obj, Object obj2) {
        this.f2708d = obj;
        this.f2709e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Z1.i.a(this.f2708d, jVar.f2708d) && Z1.i.a(this.f2709e, jVar.f2709e);
    }

    public final int hashCode() {
        Object obj = this.f2708d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2709e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2708d + ", " + this.f2709e + ')';
    }
}
