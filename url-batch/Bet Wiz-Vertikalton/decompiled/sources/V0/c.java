package V0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f872a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f873b;

    public c(Object obj, Object obj2) {
        this.f872a = obj;
        this.f873b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return e1.d.a(this.f872a, cVar.f872a) && e1.d.a(this.f873b, cVar.f873b);
    }

    public final int hashCode() {
        Object obj = this.f872a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f873b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f872a + ", " + this.f873b + ')';
    }
}
