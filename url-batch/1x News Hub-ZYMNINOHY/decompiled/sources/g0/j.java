package g0;

import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5032a;

    public j(List list) {
        this.f5032a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j.class.equals(obj.getClass())) {
            return false;
        }
        return this.f5032a.equals(((j) obj).f5032a);
    }

    public final int hashCode() {
        return this.f5032a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public final String toString() {
        return c2.e.S(this.f5032a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
