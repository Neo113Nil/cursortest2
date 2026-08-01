package R0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f773a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f774b;

    public c(Object obj, Object obj2) {
        this.f773a = obj;
        this.f774b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return d1.d.a(this.f773a, cVar.f773a) && d1.d.a(this.f774b, cVar.f774b);
    }

    public final int hashCode() {
        Object obj = this.f773a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f774b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f773a + ", " + this.f774b + ')';
    }
}
