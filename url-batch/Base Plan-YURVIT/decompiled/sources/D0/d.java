package D0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f201e;

    public d(Throwable th) {
        P0.h.e(th, "exception");
        this.f201e = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return P0.h.a(this.f201e, ((d) obj).f201e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f201e.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f201e + ')';
    }
}
