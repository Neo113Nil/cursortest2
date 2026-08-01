package U0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f859a;

    public e(Throwable th) {
        g1.f.e(th, "exception");
        this.f859a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (g1.f.a(this.f859a, ((e) obj).f859a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f859a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f859a + ')';
    }
}
