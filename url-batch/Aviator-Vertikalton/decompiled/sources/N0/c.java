package N0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f670a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f671b;

    public c(Object obj, Object obj2) {
        this.f670a = obj;
        this.f671b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return X0.f.a(this.f670a, cVar.f670a) && X0.f.a(this.f671b, cVar.f671b);
    }

    public final int hashCode() {
        Object obj = this.f670a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f671b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f670a + ", " + this.f671b + ')';
    }
}
