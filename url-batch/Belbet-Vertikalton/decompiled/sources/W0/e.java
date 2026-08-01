package W0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1340a;

    public e(Throwable th) {
        j1.h.e(th, "exception");
        this.f1340a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (j1.h.a(this.f1340a, ((e) obj).f1340a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1340a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f1340a + ')';
    }
}
