package U;

import e0.h;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f371b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f372c;

    public b(Serializable serializable, Serializable serializable2) {
        this.f371b = serializable;
        this.f372c = serializable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.f371b, bVar.f371b) && this.f372c.equals(bVar.f372c);
    }

    public final int hashCode() {
        Serializable serializable = this.f371b;
        return this.f372c.hashCode() + ((serializable == null ? 0 : serializable.hashCode()) * 31);
    }

    public final String toString() {
        return "(" + this.f371b + ", " + this.f372c + ')';
    }
}
