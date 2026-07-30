package t0;

import d1.h;
import java.io.Serializable;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1171b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f1172c;

    public b(Class cls, Integer num) {
        this.f1171b = cls;
        this.f1172c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.f1171b, bVar.f1171b) && this.f1172c.equals(bVar.f1172c);
    }

    public final int hashCode() {
        Object obj = this.f1171b;
        return this.f1172c.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "(" + this.f1171b + ", " + this.f1172c + ')';
    }
}
