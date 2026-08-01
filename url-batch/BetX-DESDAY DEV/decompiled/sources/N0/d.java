package N0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f671a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f672b;

    public d(Object obj, Object obj2) {
        this.f671a = obj;
        this.f672b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return X0.f.a(this.f671a, dVar.f671a) && X0.f.a(this.f672b, dVar.f672b);
    }

    public final int hashCode() {
        Object obj = this.f671a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f672b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f671a + ", " + this.f672b + ')';
    }
}
