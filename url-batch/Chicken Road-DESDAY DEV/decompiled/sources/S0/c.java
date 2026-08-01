package S0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f752a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f753b;

    public c(Object obj, Object obj2) {
        this.f752a = obj;
        this.f753b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return b1.d.a(this.f752a, cVar.f752a) && b1.d.a(this.f753b, cVar.f753b);
    }

    public final int hashCode() {
        Object obj = this.f752a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f753b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f752a + ", " + this.f753b + ')';
    }
}
