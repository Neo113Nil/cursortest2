package P0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f620a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f621b;

    public b(Object obj, Object obj2) {
        this.f620a = obj;
        this.f621b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return X0.e.a(this.f620a, bVar.f620a) && X0.e.a(this.f621b, bVar.f621b);
    }

    public final int hashCode() {
        Object obj = this.f620a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f621b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f620a + ", " + this.f621b + ')';
    }
}
