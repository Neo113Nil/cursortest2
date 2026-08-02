package F0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Object f461e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f462f;

    public c(Object obj, Object obj2) {
        this.f461e = obj;
        this.f462f = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Q0.h.a(this.f461e, cVar.f461e) && Q0.h.a(this.f462f, cVar.f462f);
    }

    public final int hashCode() {
        Object obj = this.f461e;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f462f;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f461e + ", " + this.f462f + ')';
    }
}
