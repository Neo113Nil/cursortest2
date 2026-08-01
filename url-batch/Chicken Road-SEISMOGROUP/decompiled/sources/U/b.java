package U;

import e0.h;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f426b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f427c;

    public b(Serializable serializable, Serializable serializable2) {
        this.f426b = serializable;
        this.f427c = serializable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.f426b, bVar.f426b) && this.f427c.equals(bVar.f427c);
    }

    public final int hashCode() {
        Serializable serializable = this.f426b;
        return this.f427c.hashCode() + ((serializable == null ? 0 : serializable.hashCode()) * 31);
    }

    public final String toString() {
        return "(" + this.f426b + ", " + this.f427c + ')';
    }
}
