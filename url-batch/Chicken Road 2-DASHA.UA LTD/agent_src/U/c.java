package U;

import e0.h;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f373b;

    public c(Throwable th) {
        h.e(th, "exception");
        this.f373b = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (h.a(this.f373b, ((c) obj).f373b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f373b.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f373b + ')';
    }
}
