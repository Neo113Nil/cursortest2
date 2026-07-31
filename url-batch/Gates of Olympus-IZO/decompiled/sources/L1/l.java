package L1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class l implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f2710d;

    public l(Throwable th) {
        Z1.i.f(th, "exception");
        this.f2710d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (Z1.i.a(this.f2710d, ((l) obj).f2710d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2710d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f2710d + ')';
    }
}
