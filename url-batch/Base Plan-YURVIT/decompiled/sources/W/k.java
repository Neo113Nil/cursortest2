package W;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f899a;

    public k(List list) {
        this.f899a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k.class.equals(obj.getClass())) {
            return false;
        }
        return this.f899a.equals(((k) obj).f899a);
    }

    public final int hashCode() {
        return this.f899a.hashCode();
    }

    public final String toString() {
        return E0.f.Q((Collection) this.f899a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
