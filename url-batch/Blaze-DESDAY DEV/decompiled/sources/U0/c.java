package U0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f897a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f898b;

    public c(Object obj, Object obj2) {
        this.f897a = obj;
        this.f898b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g1.d.a(this.f897a, cVar.f897a) && g1.d.a(this.f898b, cVar.f898b);
    }

    public final int hashCode() {
        Object obj = this.f897a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f898b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f897a + ", " + this.f898b + ')';
    }
}
