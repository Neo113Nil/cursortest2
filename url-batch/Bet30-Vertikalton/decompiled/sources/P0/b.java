package P0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f621a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f622b;

    public b(Object obj, Object obj2) {
        this.f621a = obj;
        this.f622b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return X0.d.a(this.f621a, bVar.f621a) && X0.d.a(this.f622b, bVar.f622b);
    }

    public final int hashCode() {
        Object obj = this.f621a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f622b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f621a + ", " + this.f622b + ')';
    }
}
