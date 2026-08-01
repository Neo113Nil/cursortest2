package R0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f775a;

    public d(Throwable th) {
        this.f775a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (d1.d.a(this.f775a, ((d) obj).f775a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f775a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f775a + ')';
    }
}
