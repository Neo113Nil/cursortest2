package F0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f463e;

    public d(Throwable th) {
        Q0.h.e(th, "exception");
        this.f463e = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (Q0.h.a(this.f463e, ((d) obj).f463e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f463e.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f463e + ')';
    }
}
