package D0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Object f199e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f200f;

    public c(Object obj, Object obj2) {
        this.f199e = obj;
        this.f200f = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return P0.h.a(this.f199e, cVar.f199e) && P0.h.a(this.f200f, cVar.f200f);
    }

    public final int hashCode() {
        Object obj = this.f199e;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f200f;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f199e + ", " + this.f200f + ')';
    }
}
