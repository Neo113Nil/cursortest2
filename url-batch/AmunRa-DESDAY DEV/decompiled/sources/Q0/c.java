package Q0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f688a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f689b;

    public c(Object obj, Object obj2) {
        this.f688a = obj;
        this.f689b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Z0.d.a(this.f688a, cVar.f688a) && Z0.d.a(this.f689b, cVar.f689b);
    }

    public final int hashCode() {
        Object obj = this.f688a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f689b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f688a + ", " + this.f689b + ')';
    }
}
