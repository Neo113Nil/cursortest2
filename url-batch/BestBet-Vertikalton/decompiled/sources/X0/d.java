package X0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1272a;

    public d(Throwable th) {
        k1.e.e(th, "exception");
        this.f1272a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (k1.e.a(this.f1272a, ((d) obj).f1272a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1272a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f1272a + ')';
    }
}
