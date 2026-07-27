package Y2;

import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f3686a;

    public b(List list) {
        if (list == null) {
            throw new NullPointerException("Null entries");
        }
        this.f3686a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f3686a.equals(((b) obj).f3686a);
    }

    public final int hashCode() {
        return this.f3686a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ArrayBasedTraceState{entries=" + this.f3686a + "}";
    }
}
