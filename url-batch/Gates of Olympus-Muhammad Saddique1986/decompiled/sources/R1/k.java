package R1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class k implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f4152d;

    public k(Throwable th) {
        f2.j.f(th, "exception");
        this.f4152d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (f2.j.a(this.f4152d, ((k) obj).f4152d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4152d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f4152d + ')';
    }
}
