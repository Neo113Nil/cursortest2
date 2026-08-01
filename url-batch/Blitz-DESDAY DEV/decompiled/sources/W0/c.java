package W0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f950a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f951b;

    public c(Object obj, Object obj2) {
        this.f950a = obj;
        this.f951b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g1.d.a(this.f950a, cVar.f950a) && g1.d.a(this.f951b, cVar.f951b);
    }

    public final int hashCode() {
        Object obj = this.f950a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f951b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f950a + ", " + this.f951b + ')';
    }
}
