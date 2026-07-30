package d6;

import java.io.Serializable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Object f2618f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2619g;

    public j(Object obj, Object obj2) {
        this.f2618f = obj;
        this.f2619g = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return r6.k.a(this.f2618f, jVar.f2618f) && r6.k.a(this.f2619g, jVar.f2619g);
    }

    public final int hashCode() {
        Object obj = this.f2618f;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f2619g;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2618f + ", " + this.f2619g + ')';
    }
}
