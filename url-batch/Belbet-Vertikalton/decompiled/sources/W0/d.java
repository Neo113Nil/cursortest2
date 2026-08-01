package W0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1338a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1339b;

    public d(Object obj, Object obj2) {
        this.f1338a = obj;
        this.f1339b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j1.h.a(this.f1338a, dVar.f1338a) && j1.h.a(this.f1339b, dVar.f1339b);
    }

    public final int hashCode() {
        Object obj = this.f1338a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1339b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f1338a + ", " + this.f1339b + ')';
    }
}
