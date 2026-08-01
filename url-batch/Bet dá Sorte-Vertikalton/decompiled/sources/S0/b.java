package S0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f768a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f769b;

    public b(Object obj, Object obj2) {
        this.f768a = obj;
        this.f769b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return b1.d.a(this.f768a, bVar.f768a) && b1.d.a(this.f769b, bVar.f769b);
    }

    public final int hashCode() {
        Object obj = this.f768a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f769b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f768a + ", " + this.f769b + ')';
    }
}
