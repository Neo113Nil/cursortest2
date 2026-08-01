package X0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1270a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1271b;

    public c(Object obj, Object obj2) {
        this.f1270a = obj;
        this.f1271b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k1.e.a(this.f1270a, cVar.f1270a) && k1.e.a(this.f1271b, cVar.f1271b);
    }

    public final int hashCode() {
        Object obj = this.f1270a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1271b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f1270a + ", " + this.f1271b + ')';
    }
}
