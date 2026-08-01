package u;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1287a;

    public k(List list) {
        this.f1287a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.class.equals(obj.getClass())) {
            return false;
        }
        return this.f1287a.equals(((k) obj).f1287a);
    }

    public final int hashCode() {
        return this.f1287a.hashCode();
    }

    public final String toString() {
        return V.e.I((Collection) this.f1287a, "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
