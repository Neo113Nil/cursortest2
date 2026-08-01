package U0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f899a;

    public d(Throwable th) {
        this.f899a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (g1.d.a(this.f899a, ((d) obj).f899a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f899a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f899a + ')';
    }
}
