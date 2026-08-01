package V0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f939a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f940b;

    public b(Object obj, Object obj2) {
        this.f939a = obj;
        this.f940b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h1.d.a(this.f939a, bVar.f939a) && h1.d.a(this.f940b, bVar.f940b);
    }

    public final int hashCode() {
        Object obj = this.f939a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f940b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f939a + ", " + this.f940b + ')';
    }
}
