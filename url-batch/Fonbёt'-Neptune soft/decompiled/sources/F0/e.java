package F0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Object f464e;

    public static final Throwable a(Object obj) {
        if (obj instanceof d) {
            return ((d) obj).f463e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return Q0.h.a(this.f464e, ((e) obj).f464e);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f464e;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f464e;
        if (obj instanceof d) {
            return ((d) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
