package R1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class i implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f4150d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4151e;

    public i(Object obj, Object obj2) {
        this.f4150d = obj;
        this.f4151e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return f2.j.a(this.f4150d, iVar.f4150d) && f2.j.a(this.f4151e, iVar.f4151e);
    }

    public final int hashCode() {
        Object obj = this.f4150d;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4151e;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f4150d + ", " + this.f4151e + ')';
    }
}
