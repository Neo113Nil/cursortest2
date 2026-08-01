package S0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f754a;

    public d(Throwable th) {
        this.f754a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (b1.d.a(this.f754a, ((d) obj).f754a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f754a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f754a + ')';
    }
}
