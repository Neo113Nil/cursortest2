package U0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f857a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f858b;

    public d(Object obj, Object obj2) {
        this.f857a = obj;
        this.f858b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return g1.f.a(this.f857a, dVar.f857a) && g1.f.a(this.f858b, dVar.f858b);
    }

    public final int hashCode() {
        Object obj = this.f857a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f858b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f857a + ", " + this.f858b + ')';
    }
}
